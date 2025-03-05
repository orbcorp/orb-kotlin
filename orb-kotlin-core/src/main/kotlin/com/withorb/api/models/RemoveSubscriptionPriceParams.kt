// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class RemoveSubscriptionPriceParams
@JsonCreator
private constructor(
    @JsonProperty("external_price_id")
    @ExcludeMissing
    private val externalPriceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price_id")
    @ExcludeMissing
    private val priceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The external price id of the price to remove on the subscription. */
    fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

    /** The id of the price to remove on the subscription. */
    fun priceId(): String? = priceId.getNullable("price_id")

    /** The external price id of the price to remove on the subscription. */
    @JsonProperty("external_price_id")
    @ExcludeMissing
    fun _externalPriceId(): JsonField<String> = externalPriceId

    /** The id of the price to remove on the subscription. */
    @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RemoveSubscriptionPriceParams = apply {
        if (validated) {
            return@apply
        }

        externalPriceId()
        priceId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RemoveSubscriptionPriceParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [RemoveSubscriptionPriceParams]. */
    class Builder internal constructor() {

        private var externalPriceId: JsonField<String> = JsonMissing.of()
        private var priceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(removeSubscriptionPriceParams: RemoveSubscriptionPriceParams) = apply {
            externalPriceId = removeSubscriptionPriceParams.externalPriceId
            priceId = removeSubscriptionPriceParams.priceId
            additionalProperties = removeSubscriptionPriceParams.additionalProperties.toMutableMap()
        }

        /** The external price id of the price to remove on the subscription. */
        fun externalPriceId(externalPriceId: String?) =
            externalPriceId(JsonField.ofNullable(externalPriceId))

        /** The external price id of the price to remove on the subscription. */
        fun externalPriceId(externalPriceId: JsonField<String>) = apply {
            this.externalPriceId = externalPriceId
        }

        /** The id of the price to remove on the subscription. */
        fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

        /** The id of the price to remove on the subscription. */
        fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): RemoveSubscriptionPriceParams =
            RemoveSubscriptionPriceParams(
                externalPriceId,
                priceId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RemoveSubscriptionPriceParams && externalPriceId == other.externalPriceId && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(externalPriceId, priceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RemoveSubscriptionPriceParams{externalPriceId=$externalPriceId, priceId=$priceId, additionalProperties=$additionalProperties}"
}
