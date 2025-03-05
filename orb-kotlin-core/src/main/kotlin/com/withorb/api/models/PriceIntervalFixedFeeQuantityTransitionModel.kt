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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PriceIntervalFixedFeeQuantityTransitionModel
@JsonCreator
private constructor(
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The date that the fixed fee quantity transition should take effect. */
    fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

    /** The quantity of the fixed fee quantity transition. */
    fun quantity(): Long = quantity.getRequired("quantity")

    /** The date that the fixed fee quantity transition should take effect. */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    /** The quantity of the fixed fee quantity transition. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PriceIntervalFixedFeeQuantityTransitionModel = apply {
        if (validated) {
            return@apply
        }

        effectiveDate()
        quantity()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PriceIntervalFixedFeeQuantityTransitionModel].
         *
         * The following fields are required:
         * ```kotlin
         * .effectiveDate()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceIntervalFixedFeeQuantityTransitionModel]. */
    class Builder internal constructor() {

        private var effectiveDate: JsonField<OffsetDateTime>? = null
        private var quantity: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            priceIntervalFixedFeeQuantityTransitionModel:
                PriceIntervalFixedFeeQuantityTransitionModel
        ) = apply {
            effectiveDate = priceIntervalFixedFeeQuantityTransitionModel.effectiveDate
            quantity = priceIntervalFixedFeeQuantityTransitionModel.quantity
            additionalProperties =
                priceIntervalFixedFeeQuantityTransitionModel.additionalProperties.toMutableMap()
        }

        /** The date that the fixed fee quantity transition should take effect. */
        fun effectiveDate(effectiveDate: OffsetDateTime) =
            effectiveDate(JsonField.of(effectiveDate))

        /** The date that the fixed fee quantity transition should take effect. */
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** The quantity of the fixed fee quantity transition. */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /** The quantity of the fixed fee quantity transition. */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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

        fun build(): PriceIntervalFixedFeeQuantityTransitionModel =
            PriceIntervalFixedFeeQuantityTransitionModel(
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("quantity", quantity),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceIntervalFixedFeeQuantityTransitionModel && effectiveDate == other.effectiveDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(effectiveDate, quantity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceIntervalFixedFeeQuantityTransitionModel{effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
}
