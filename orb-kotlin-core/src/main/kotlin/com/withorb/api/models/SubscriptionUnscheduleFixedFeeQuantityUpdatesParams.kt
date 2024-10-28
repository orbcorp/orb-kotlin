// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.util.Objects

class SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
constructor(
    private val subscriptionId: String,
    private val priceId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun priceId(): String = priceId

    internal fun getBody(): SubscriptionUnscheduleFixedFeeQuantityUpdatesBody {
        return SubscriptionUnscheduleFixedFeeQuantityUpdatesBody(priceId, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                    additionalProperties.toUnmodifiable()
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

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUnscheduleFixedFeeQuantityUpdatesParams && this.subscriptionId == other.subscriptionId && this.priceId == other.priceId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, priceId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionUnscheduleFixedFeeQuantityUpdatesParams{subscriptionId=$subscriptionId, priceId=$priceId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var priceId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionUnscheduleFixedFeeQuantityUpdatesParams:
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
        ) = apply {
            this.subscriptionId = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.subscriptionId
            this.priceId = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.priceId
            additionalQueryParams(
                subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalQueryParams
            )
            additionalHeaders(subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalHeaders)
            additionalBodyProperties(
                subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalBodyProperties
            )
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        fun priceId(priceId: String) = apply { this.priceId = priceId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
