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
class FixedFeeQuantityScheduleEntryModel
@JsonCreator
private constructor(
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("price_id")
    @ExcludeMissing
    private val priceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun priceId(): String = priceId.getRequired("price_id")

    fun quantity(): Double = quantity.getRequired("quantity")

    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FixedFeeQuantityScheduleEntryModel = apply {
        if (validated) {
            return@apply
        }

        endDate()
        priceId()
        quantity()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FixedFeeQuantityScheduleEntryModel].
         *
         * The following fields are required:
         * ```kotlin
         * .endDate()
         * .priceId()
         * .quantity()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [FixedFeeQuantityScheduleEntryModel]. */
    class Builder internal constructor() {

        private var endDate: JsonField<OffsetDateTime>? = null
        private var priceId: JsonField<String>? = null
        private var quantity: JsonField<Double>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(fixedFeeQuantityScheduleEntryModel: FixedFeeQuantityScheduleEntryModel) =
            apply {
                endDate = fixedFeeQuantityScheduleEntryModel.endDate
                priceId = fixedFeeQuantityScheduleEntryModel.priceId
                quantity = fixedFeeQuantityScheduleEntryModel.quantity
                startDate = fixedFeeQuantityScheduleEntryModel.startDate
                additionalProperties =
                    fixedFeeQuantityScheduleEntryModel.additionalProperties.toMutableMap()
            }

        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun priceId(priceId: String) = priceId(JsonField.of(priceId))

        fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): FixedFeeQuantityScheduleEntryModel =
            FixedFeeQuantityScheduleEntryModel(
                checkRequired("endDate", endDate),
                checkRequired("priceId", priceId),
                checkRequired("quantity", quantity),
                checkRequired("startDate", startDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FixedFeeQuantityScheduleEntryModel && endDate == other.endDate && priceId == other.priceId && quantity == other.quantity && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(endDate, priceId, quantity, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FixedFeeQuantityScheduleEntryModel{endDate=$endDate, priceId=$priceId, quantity=$quantity, startDate=$startDate, additionalProperties=$additionalProperties}"
}
