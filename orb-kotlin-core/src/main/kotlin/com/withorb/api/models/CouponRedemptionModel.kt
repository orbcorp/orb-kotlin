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
class CouponRedemptionModel
@JsonCreator
private constructor(
    @JsonProperty("coupon_id")
    @ExcludeMissing
    private val couponId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun couponId(): String = couponId.getRequired("coupon_id")

    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    @JsonProperty("coupon_id") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CouponRedemptionModel = apply {
        if (validated) {
            return@apply
        }

        couponId()
        endDate()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponRedemptionModel].
         *
         * The following fields are required:
         * ```kotlin
         * .couponId()
         * .endDate()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CouponRedemptionModel]. */
    class Builder internal constructor() {

        private var couponId: JsonField<String>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(couponRedemptionModel: CouponRedemptionModel) = apply {
            couponId = couponRedemptionModel.couponId
            endDate = couponRedemptionModel.endDate
            startDate = couponRedemptionModel.startDate
            additionalProperties = couponRedemptionModel.additionalProperties.toMutableMap()
        }

        fun couponId(couponId: String) = couponId(JsonField.of(couponId))

        fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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

        fun build(): CouponRedemptionModel =
            CouponRedemptionModel(
                checkRequired("couponId", couponId),
                checkRequired("endDate", endDate),
                checkRequired("startDate", startDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponRedemptionModel && couponId == other.couponId && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(couponId, endDate, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CouponRedemptionModel{couponId=$couponId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
