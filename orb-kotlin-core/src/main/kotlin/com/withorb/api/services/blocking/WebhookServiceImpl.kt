// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.fasterxml.jackson.core.JsonProcessingException
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.getRequiredHeader
import com.withorb.api.core.http.Headers
import com.withorb.api.errors.OrbException
import java.security.MessageDigest
import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

private const val SIGNATURE_HEADER = "X-Orb-Signature"
private const val TIMESTAMP_HEADER = "X-Orb-Timestamp"
private const val MAX_TIMESTAMP_AGE_MINUTES = 5L
private const val SIGNATURE_ALGORITHM = "HmacSHA256"
private const val SIGNATURE_VERSION = "v1"
private const val SIGNATURE_DELIMITER = " "
private const val SIGNATURE_KEY_VALUE_DELIMITER = "="

class WebhookServiceImpl constructor(private val clientOptions: ClientOptions) : WebhookService {

    override fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue {
        verifySignature(payload, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
        } catch (e: JsonProcessingException) {
            throw OrbException("Invalid event payload", e)
        }
    }

    // required for `toHexString` usage
    @OptIn(ExperimentalStdlibApi::class)
    override fun verifySignature(payload: String, headers: Headers, secret: String?) {
        val webhookSecret =
            secret
                ?: clientOptions.webhookSecret
                ?: throw OrbException(
                    "The webhook secret must either be set using the env var, ORB_WEBHOOK_SECRET, on the client class, or passed to this method"
                )

        val msgSignature = headers.getRequiredHeader(SIGNATURE_HEADER)
        val msgTimestamp = headers.getRequiredHeader(TIMESTAMP_HEADER)

        val timestamp =
            try {
                LocalDateTime.parse(msgTimestamp).toInstant(ZoneOffset.UTC)
            } catch (e: RuntimeException) {
                throw OrbException("Invalid timestamp header", e)
            }
        val now = Instant.now(clientOptions.clock)

        if (timestamp.isBefore(now.minus(Duration.ofMinutes(MAX_TIMESTAMP_AGE_MINUTES)))) {
            throw OrbException("Webhook timestamp too old")
        }
        if (timestamp.isAfter(now.plus(Duration.ofMinutes(MAX_TIMESTAMP_AGE_MINUTES)))) {
            throw OrbException("Webhook timestamp too new")
        }

        val mac = Mac.getInstance(SIGNATURE_ALGORITHM)
        mac.init(SecretKeySpec(webhookSecret.toByteArray(Charsets.UTF_8), SIGNATURE_ALGORITHM))

        val expectedSignature =
            mac.doFinal("v1:${msgTimestamp}:$payload".toByteArray(Charsets.UTF_8)).toHexString()

        msgSignature.splitToSequence(SIGNATURE_DELIMITER).forEach {
            val parts = it.split(SIGNATURE_KEY_VALUE_DELIMITER)
            if (parts.size != 2) {
                return@forEach
            }

            if (parts[0] != SIGNATURE_VERSION) {
                return@forEach
            }
            val actualSignature = parts[1].toByteArray(Charsets.UTF_8)

            if (
                MessageDigest.isEqual(
                    actualSignature,
                    expectedSignature.toByteArray(Charsets.UTF_8),
                )
            ) {
                return
            }
        }

        throw OrbException("None of the given webhook signatures match the expected signature")
    }
}
