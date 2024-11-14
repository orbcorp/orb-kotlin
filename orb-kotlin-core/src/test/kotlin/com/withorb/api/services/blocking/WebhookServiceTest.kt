// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
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
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceTest {

    @Test
    fun unwrap() {
        val client =
            OrbOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391")
                .clock(Clock.fixed(Instant.parse("2024-03-27T15:42:29+00:00"), ZoneOffset.UTC))
                .build()
        val signature = "9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391"
        val payload =
            "{\"id\": \"o4mmewpfNNTnjfZc\", \"created_at\": \"2024-03-27T15:42:29+00:00\", \"type\": \"resource_event.test\", \"properties\": {\"message\": \"A test webhook from Orb. Happy testing!\"}}"
        val headers =
            Headers.builder()
                .put("X-Orb-Timestamp", "2024-03-27T15:42:29.551")
                .put("X-Orb-Signature", "v1=$signature")
                .build()

        val event =
            client
                .webhooks()
                .unwrap(payload, headers, "c-UGKYdnhHh436B_sMouYAPUvXyWpzOdunZBV5dFSD8")

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val client =
            OrbOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391")
                .clock(Clock.fixed(Instant.parse("2024-03-27T15:42:29+00:00"), ZoneOffset.UTC))
                .build()

        val payload =
            "{\"id\": \"o4mmewpfNNTnjfZc\", \"created_at\": \"2024-03-27T15:42:29+00:00\", \"type\": \"resource_event.test\", \"properties\": {\"message\": \"A test webhook from Orb. Happy testing!\"}}"
        val webhookTimestamp = "2024-03-27T15:42:29.551"

        val webhookSignature = "9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391"
        val secret = "c-UGKYdnhHh436B_sMouYAPUvXyWpzOdunZBV5dFSD8"
        val headers =
            Headers.builder()
                .put("X-Orb-Timestamp", webhookTimestamp)
                .put("X-Orb-Signature", "v1=$webhookSignature")
                .build()

        // happy path first
        assertThatCode { client.webhooks().verifySignature(payload, headers, secret) }
            .doesNotThrowAnyException()

        val webhookTimestampInsant = LocalDateTime.parse(webhookTimestamp).toInstant(ZoneOffset.UTC)

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put(
                                "X-Orb-Timestamp",
                                webhookTimestampInsant
                                    .minusSeconds(1000)
                                    .atOffset(ZoneOffset.UTC)
                                    .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                            )
                            .put("X-Orb-Signature", "v1=$webhookSignature")
                            .build(),
                        secret
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too old")

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put(
                                "X-Orb-Timestamp",
                                webhookTimestampInsant
                                    .plusSeconds(1000)
                                    .atOffset(ZoneOffset.UTC)
                                    .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                            )
                            .put("X-Orb-Signature", "v1=$webhookSignature")
                            .build(),
                        secret
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too new")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "invalid-secret") }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "Zm9v") }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("X-Orb-Timestamp", webhookTimestamp)
                            .put("X-Orb-Signature", "v1=$webhookSignature v1=Zm9v")
                            .build(),
                        secret
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("X-Orb-Timestamp", webhookTimestamp)
                            .put("X-Orb-Signature", "v2=$webhookSignature")
                            .build(),
                        secret
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("X-Orb-Timestamp", webhookTimestamp)
                            .put("X-Orb-Signature", "v1=$webhookSignature v2=$webhookSignature")
                            .build(),
                        secret
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        Headers.builder()
                            .put("X-Orb-Timestamp", webhookTimestamp)
                            .put(
                                "X-Orb-Signature",
                                webhookSignature,
                            )
                            .build(),
                        secret
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }
}
