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
import java.util.Objects

@NoAutoDetect
class BillingCycleAnchorConfigurationModel
@JsonCreator
private constructor(
    @JsonProperty("day") @ExcludeMissing private val day: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("month") @ExcludeMissing private val month: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("year") @ExcludeMissing private val year: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    fun day(): Long = day.getRequired("day")

    /**
     * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in February
     * would have cycles starting February, May, August, and November).
     */
    fun month(): Long? = month.getNullable("month")

    /**
     * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on 2021
     * would have cycles starting on 2021, 2023, 2025, etc.).
     */
    fun year(): Long? = year.getNullable("year")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Long> = day

    /**
     * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in February
     * would have cycles starting February, May, August, and November).
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

    /**
     * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on 2021
     * would have cycles starting on 2021, 2023, 2025, etc.).
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillingCycleAnchorConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        day()
        month()
        year()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillingCycleAnchorConfigurationModel].
         *
         * The following fields are required:
         * ```kotlin
         * .day()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillingCycleAnchorConfigurationModel]. */
    class Builder internal constructor() {

        private var day: JsonField<Long>? = null
        private var month: JsonField<Long> = JsonMissing.of()
        private var year: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            billingCycleAnchorConfigurationModel: BillingCycleAnchorConfigurationModel
        ) = apply {
            day = billingCycleAnchorConfigurationModel.day
            month = billingCycleAnchorConfigurationModel.month
            year = billingCycleAnchorConfigurationModel.year
            additionalProperties =
                billingCycleAnchorConfigurationModel.additionalProperties.toMutableMap()
        }

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun day(day: Long) = day(JsonField.of(day))

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun day(day: JsonField<Long>) = apply { this.day = day }

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(month: Long?) = month(JsonField.ofNullable(month))

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(month: Long) = month(month as Long?)

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(month: JsonField<Long>) = apply { this.month = month }

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(year: Long?) = year(JsonField.ofNullable(year))

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(year: Long) = year(year as Long?)

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(year: JsonField<Long>) = apply { this.year = year }

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

        fun build(): BillingCycleAnchorConfigurationModel =
            BillingCycleAnchorConfigurationModel(
                checkRequired("day", day),
                month,
                year,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillingCycleAnchorConfigurationModel && day == other.day && month == other.month && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(day, month, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingCycleAnchorConfigurationModel{day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"
}
