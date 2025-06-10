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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class BillingCycleAnchorConfiguration
private constructor(
    private val day: JsonField<Long>,
    private val month: JsonField<Long>,
    private val year: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("day") @ExcludeMissing day: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
    ) : this(day, month, year, mutableMapOf())

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun day(): Long = day.getRequired("day")

    /**
     * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in February
     * would have cycles starting February, May, August, and November).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun month(): Long? = month.getNullable("month")

    /**
     * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on 2021
     * would have cycles starting on 2021, 2023, 2025, etc.).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun year(): Long? = year.getNullable("year")

    /**
     * Returns the raw JSON value of [day].
     *
     * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Long> = day

    /**
     * Returns the raw JSON value of [month].
     *
     * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillingCycleAnchorConfiguration].
         *
         * The following fields are required:
         * ```kotlin
         * .day()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillingCycleAnchorConfiguration]. */
    class Builder internal constructor() {

        private var day: JsonField<Long>? = null
        private var month: JsonField<Long> = JsonMissing.of()
        private var year: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration) =
            apply {
                day = billingCycleAnchorConfiguration.day
                month = billingCycleAnchorConfiguration.month
                year = billingCycleAnchorConfiguration.year
                additionalProperties =
                    billingCycleAnchorConfiguration.additionalProperties.toMutableMap()
            }

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun day(day: Long) = day(JsonField.of(day))

        /**
         * Sets [Builder.day] to an arbitrary JSON value.
         *
         * You should usually call [Builder.day] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun day(day: JsonField<Long>) = apply { this.day = day }

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(month: Long?) = month(JsonField.ofNullable(month))

        /**
         * Alias for [Builder.month].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun month(month: Long) = month(month as Long?)

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<Long>) = apply { this.month = month }

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(year: Long?) = year(JsonField.ofNullable(year))

        /**
         * Alias for [Builder.year].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun year(year: Long) = year(year as Long?)

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [BillingCycleAnchorConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .day()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingCycleAnchorConfiguration =
            BillingCycleAnchorConfiguration(
                checkRequired("day", day),
                month,
                year,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingCycleAnchorConfiguration = apply {
        if (validated) {
            return@apply
        }

        day()
        month()
        year()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (day.asKnown() == null) 0 else 1) +
            (if (month.asKnown() == null) 0 else 1) +
            (if (year.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillingCycleAnchorConfiguration && day == other.day && month == other.month && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(day, month, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingCycleAnchorConfiguration{day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"
}
