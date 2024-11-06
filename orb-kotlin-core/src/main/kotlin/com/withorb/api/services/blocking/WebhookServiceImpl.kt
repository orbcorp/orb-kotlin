// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.fasterxml.jackson.core.JsonProcessingException
import com.google.common.collect.ListMultimap
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.getRequiredHeader
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.errors.OrbException
import java.security.MessageDigest
import java.time.Duration
import java.time.Instant
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class WebhookServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : WebhookService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    override fun unwrap(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ): JsonValue {
        verifySignature(payload, headers, secret)
        return try {
            clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
        } catch (e: JsonProcessingException) {
            throw OrbException("Invalid event payload", e)
        }
    }

    override fun verifySignature(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ) {
        val webhookSecret =
            secret
                ?: clientOptions.webhookSecret
                ?: throw OrbException(
                    "The webhook secret must either be set using the env var, ORB_WEBHOOK_SECRET, on the client class, or passed to this method"
                )

        val whsecret =
            try {
                Base64.getDecoder().decode(webhookSecret)
            } catch (e: RuntimeException) {
                throw OrbException("Invalid webhook secret")
            }

        val msgSignature = headers.getRequiredHeader("X-Orb-Signature")
        val msgTimestamp = headers.getRequiredHeader("X-Orb-Timestamp")

        val timestamp =
            try {
                // 2024-03-27T15:42:29+00:00
                Instant.parse(msgTimestamp)
            } catch (e: RuntimeException) {
                throw OrbException("Invalid signature headers", e)
            }
        val now = Instant.now(clientOptions.clock)

        if (timestamp.isBefore(now.minus(Duration.ofMinutes(5)))) {
            throw OrbException("Webhook timestamp too old")
        }
        if (timestamp.isAfter(now.plus(Duration.ofMinutes(5)))) {
            throw OrbException("Webhook timestamp too new")
        }

        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(whsecret, "HmacSHA256"))
        val expectedSignature = mac.doFinal("v1:${timestamp}:$payload".toByteArray())

        msgSignature.splitToSequence(" ").forEach {
            val parts = it.split("=")
            if (parts.size != 2) {
                return@forEach
            }

            if (parts[0] != "v1") {
                return@forEach
            }
            val actualSignature = Base64.getDecoder().decode(parts[1])
            if (MessageDigest.isEqual(actualSignature, expectedSignature)) {
                return
            }
        }

        throw OrbException("None of the given webhook signatures match the expected signature")
    }
}
