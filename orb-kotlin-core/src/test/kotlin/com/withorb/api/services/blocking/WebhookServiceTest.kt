package com.withorb.api.services.blocking

import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.http.Headers
import com.withorb.api.errors.OrbException
import com.withorb.api.models.*
import java.time.Clock
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {
    companion object {
        const val API_KEY = "test-api-key"
        const val WEBHOOK_SECRET =
            "9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391"
        const val SIGNATURE = "9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391"
        const val SECRET = "c-UGKYdnhHh436B_sMouYAPUvXyWpzOdunZBV5dFSD8"
        const val WEBHOOK_TIMESTAMP = "2024-03-27T15:42:29.551"
        val FIXED_CLOCK = Clock.fixed(Instant.parse("2024-03-27T15:42:29+00:00"), ZoneOffset.UTC)
        val WEBHOOK_TIMESTAMP_INSTANT =
            LocalDateTime.parse(WEBHOOK_TIMESTAMP).toInstant(ZoneOffset.UTC)

        const val PAYLOAD =
            "{\"id\": \"o4mmewpfNNTnjfZc\", \"created_at\": \"2024-03-27T15:42:29+00:00\", \"type\": \"resource_event.test\", \"properties\": {\"message\": \"A test webhook from Orb. Happy testing!\"}}"
    }

    private fun buildClient() =
        OrbOkHttpClient.builder()
            .apiKey(API_KEY)
            .webhookSecret(WEBHOOK_SECRET)
            .clock(FIXED_CLOCK)
            .build()

    private fun buildHeaders(signature: String = SIGNATURE, timestamp: String = WEBHOOK_TIMESTAMP) =
        Headers.builder()
            .put("X-Orb-Timestamp", timestamp)
            .put("X-Orb-Signature", "v1=$signature")
            .build()

    @Test
    fun unwrap() {
        val client = buildClient()
        val headers = buildHeaders()
        val event = client.webhooks().unwrap(PAYLOAD, headers, SECRET)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignatureHappyPath() {
        val client = buildClient()
        val headers = buildHeaders()

        // Happy path
        assertThatCode { client.webhooks().verifySignature(PAYLOAD.trimIndent(), headers, SECRET) }
            .doesNotThrowAnyException()
    }

    @Test
    fun verifySignatureFailsWhenTimestampIsTooOld() {
        val client = buildClient()
        // Timestamp too old
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        PAYLOAD.trimIndent(),
                        buildHeaders(
                            timestamp =
                                WEBHOOK_TIMESTAMP_INSTANT.minusSeconds(1000)
                                    .atOffset(ZoneOffset.UTC)
                                    .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                        ),
                        SECRET,
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too old")
    }

    @Test
    fun verifySignatureFailsWhenTimestampIsTooNew() {
        val client = buildClient()
        // Timestamp too new
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        PAYLOAD.trimIndent(),
                        buildHeaders(
                            timestamp =
                                WEBHOOK_TIMESTAMP_INSTANT.plusSeconds(1000)
                                    .atOffset(ZoneOffset.UTC)
                                    .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                        ),
                        SECRET,
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too new")
    }

    @Test
    fun verifySignatureFailsWithIncorrectSecret() {
        val client = buildClient()
        val headers = buildHeaders()
        // Invalid secrets
        assertThatThrownBy {
                client.webhooks().verifySignature(PAYLOAD.trimIndent(), headers, "invalid-secret")
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatThrownBy {
                client.webhooks().verifySignature(PAYLOAD.trimIndent(), headers, "Zm9v")
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }

    fun verifySignatureSucceedsWithMultipleSignatures() {
        val client = buildClient()
        // Multiple signatures
        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        PAYLOAD.trimIndent(),
                        buildHeaders(signature = "$SIGNATURE v1=Zm9v"),
                        SECRET,
                    )
            }
            .doesNotThrowAnyException()
        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        PAYLOAD.trimIndent(),
                        buildHeaders(signature = "v1=$SIGNATURE v2=$SIGNATURE"),
                        SECRET,
                    )
            }
            .doesNotThrowAnyException()
    }

    @Test
    fun verifySignatureFailsWithIncorrectSignatureVersion() {
        val client = buildClient()
        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        PAYLOAD.trimIndent(),
                        buildHeaders(signature = "v2=$SIGNATURE"),
                        SECRET,
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }

    @Test
    fun verifySignatureFailsWithMissingHeaders() {
        val client = buildClient()

        val headers = Headers.builder().put("X-Orb-Signature", "v1=$SIGNATURE").build()
        assertThatThrownBy {
                client.webhooks().verifySignature(PAYLOAD.trimIndent(), headers, SECRET)
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Could not find X-Orb-Timestamp header")
    }
}
