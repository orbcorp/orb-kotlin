// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
import java.util.Objects

class SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
constructor(
    private val subscriptionId: String,
    private val priceId: String,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun priceId(): String = priceId

    internal fun getBody(): SubscriptionUnscheduleFixedFeeQuantityUpdatesBody {
        return SubscriptionUnscheduleFixedFeeQuantityUpdatesBody(priceId, additionalBodyProperties)
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SubscriptionUnscheduleFixedFeeQuantityUpdatesBody.Builder::class)
    @NoAutoDetect
    class SubscriptionUnscheduleFixedFeeQuantityUpdatesBody
    internal constructor(
        private val priceId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        @JsonProperty("price_id") fun priceId(): String? = priceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                subscriptionUnscheduleFixedFeeQuantityUpdatesBody:
                    SubscriptionUnscheduleFixedFeeQuantityUpdatesBody
            ) = apply {
                this.priceId = subscriptionUnscheduleFixedFeeQuantityUpdatesBody.priceId
                additionalProperties(
                    subscriptionUnscheduleFixedFeeQuantityUpdatesBody.additionalProperties
                )
            }

            /** Price for which the updates should be cleared. Must be a fixed fee. */
            @JsonProperty("price_id")
            fun priceId(priceId: String) = apply { this.priceId = priceId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): SubscriptionUnscheduleFixedFeeQuantityUpdatesBody =
                SubscriptionUnscheduleFixedFeeQuantityUpdatesBody(
                    checkNotNull(priceId) { "`priceId` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionUnscheduleFixedFeeQuantityUpdatesBody && this.priceId == other.priceId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(priceId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionUnscheduleFixedFeeQuantityUpdatesBody{priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUnscheduleFixedFeeQuantityUpdatesParams && this.subscriptionId == other.subscriptionId && this.priceId == other.priceId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, priceId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionUnscheduleFixedFeeQuantityUpdatesParams{subscriptionId=$subscriptionId, priceId=$priceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var priceId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionUnscheduleFixedFeeQuantityUpdatesParams:
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
        ) = apply {
            this.subscriptionId = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.subscriptionId
            this.priceId = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.priceId
            additionalHeaders(subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalHeaders)
            additionalQueryParams(
                subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalQueryParams
            )
            additionalBodyProperties(
                subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalBodyProperties
            )
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        fun priceId(priceId: String) = apply { this.priceId = priceId }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SubscriptionUnscheduleFixedFeeQuantityUpdatesParams =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(priceId) { "`priceId` is required but was not set" },
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
