// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.common.collect.ImmutableListMultimap
import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.errors.OrbException
import com.withorb.api.models.*
import java.time.Clock
import java.time.Instant
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
            ImmutableListMultimap.of(
                "X-Orb-Timestamp",
                "2024-03-27T15:42:29+00:00",
                "X-Orb-Signature",
                "v1=$signature",
            )

        val event = client.webhooks().unwrap(payload, headers, null)

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
        val webhookTimestamp = "2024-03-27T15:42:29+00:00"
        val webhookTimestampInsant = Instant.parse(webhookTimestamp)
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+00:00")

        val webhookSignature = "9d25de966891ab0bc18754faf8d83d0980b44ae330fcc130b41a6cf3daf1f391"
        val headers =
            ImmutableListMultimap.of(
                "X-Orb-Timestamp",
                webhookTimestamp,
                "X-Orb-Signature",
                "v1=$webhookSignature"
            )

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestampInsant
                                .minusSeconds(1000)
                                .atOffset(ZoneOffset.UTC)
                                .format(formatter),
                            "X-Orb-Signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too old")

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestampInsant
                                .plusSeconds(1000)
                                .atOffset(ZoneOffset.UTC)
                                .format(formatter),
                            "X-Orb-Signature",
                            "v1,$webhookSignature"
                        ),
                        null
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Webhook timestamp too new")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "invalid-secret") }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("Invalid webhook secret")

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "Zm9v") }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestamp,
                            "X-Orb-Signature",
                            "v1,$webhookSignature v1,Zm9v",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestamp,
                            "X-Orb-Signature",
                            "v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestamp,
                            "X-Orb-Signature",
                            "v1,$webhookSignature v2,$webhookSignature",
                        ),
                        null
                    )
            }
            .doesNotThrowAnyException()

        assertThatThrownBy {
                client
                    .webhooks()
                    .verifySignature(
                        payload,
                        ImmutableListMultimap.of(
                            "X-Orb-Timestamp",
                            webhookTimestamp,
                            "X-Orb-Signature",
                            webhookSignature,
                        ),
                        null
                    )
            }
            .isInstanceOf(OrbException::class.java)
            .hasMessage("None of the given webhook signatures match the expected signature")
    }
}
