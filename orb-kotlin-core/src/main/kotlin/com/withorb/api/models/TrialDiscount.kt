// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class TrialDiscount
private constructor(
    private val discountType: JsonField<DiscountType>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val filters: JsonField<List<TransformPriceFilter>>,
    private val reason: JsonField<String>,
    private val trialAmountDiscount: JsonField<String>,
    private val trialPercentageDiscount: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("discount_type")
        @ExcludeMissing
        discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<TransformPriceFilter>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_amount_discount")
        @ExcludeMissing
        trialAmountDiscount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_percentage_discount")
        @ExcludeMissing
        trialPercentageDiscount: JsonField<Double> = JsonMissing.of(),
    ) : this(
        discountType,
        appliesToPriceIds,
        filters,
        reason,
        trialAmountDiscount,
        trialPercentageDiscount,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliesToPriceIds(): List<String>? = appliesToPriceIds.getNullable("applies_to_price_ids")

    /**
     * The filters that determine which prices to apply this discount to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filters(): List<TransformPriceFilter>? = filters.getNullable("filters")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * Only available if discount_type is `trial`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun trialAmountDiscount(): String? = trialAmountDiscount.getNullable("trial_amount_discount")

    /**
     * Only available if discount_type is `trial`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun trialPercentageDiscount(): Double? =
        trialPercentageDiscount.getNullable("trial_percentage_discount")

    /**
     * Returns the raw JSON value of [discountType].
     *
     * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    /**
     * Returns the raw JSON value of [appliesToPriceIds].
     *
     * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<TransformPriceFilter>> = filters

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [trialAmountDiscount].
     *
     * Unlike [trialAmountDiscount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    fun _trialAmountDiscount(): JsonField<String> = trialAmountDiscount

    /**
     * Returns the raw JSON value of [trialPercentageDiscount].
     *
     * Unlike [trialPercentageDiscount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    fun _trialPercentageDiscount(): JsonField<Double> = trialPercentageDiscount

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
         * Returns a mutable builder for constructing an instance of [TrialDiscount].
         *
         * The following fields are required:
         * ```kotlin
         * .discountType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TrialDiscount]. */
    class Builder internal constructor() {

        private var discountType: JsonField<DiscountType>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var filters: JsonField<MutableList<TransformPriceFilter>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
        private var trialPercentageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trialDiscount: TrialDiscount) = apply {
            discountType = trialDiscount.discountType
            appliesToPriceIds = trialDiscount.appliesToPriceIds.map { it.toMutableList() }
            filters = trialDiscount.filters.map { it.toMutableList() }
            reason = trialDiscount.reason
            trialAmountDiscount = trialDiscount.trialAmountDiscount
            trialPercentageDiscount = trialDiscount.trialPercentageDiscount
            additionalProperties = trialDiscount.additionalProperties.toMutableMap()
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        /**
         * Sets [Builder.discountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountType] with a well-typed [DiscountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: List<String>?) =
            appliesToPriceIds(JsonField.ofNullable(appliesToPriceIds))

        /**
         * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToPriceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
        }

        /** The filters that determine which prices to apply this discount to. */
        fun filters(filters: List<TransformPriceFilter>?) = filters(JsonField.ofNullable(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<TransformPriceFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filters(filters: JsonField<List<TransformPriceFilter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [TransformPriceFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: TransformPriceFilter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: String?) =
            trialAmountDiscount(JsonField.ofNullable(trialAmountDiscount))

        /**
         * Sets [Builder.trialAmountDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialAmountDiscount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
            this.trialAmountDiscount = trialAmountDiscount
        }

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: Double?) =
            trialPercentageDiscount(JsonField.ofNullable(trialPercentageDiscount))

        /**
         * Alias for [Builder.trialPercentageDiscount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialPercentageDiscount(trialPercentageDiscount: Double) =
            trialPercentageDiscount(trialPercentageDiscount as Double?)

        /**
         * Sets [Builder.trialPercentageDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialPercentageDiscount] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trialPercentageDiscount(trialPercentageDiscount: JsonField<Double>) = apply {
            this.trialPercentageDiscount = trialPercentageDiscount
        }

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
         * Returns an immutable instance of [TrialDiscount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .discountType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrialDiscount =
            TrialDiscount(
                checkRequired("discountType", discountType),
                (appliesToPriceIds ?: JsonMissing.of()).map { it.toImmutable() },
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                trialAmountDiscount,
                trialPercentageDiscount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrialDiscount = apply {
        if (validated) {
            return@apply
        }

        discountType().validate()
        appliesToPriceIds()
        filters()?.forEach { it.validate() }
        reason()
        trialAmountDiscount()
        trialPercentageDiscount()
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
        (discountType.asKnown()?.validity() ?: 0) +
            (appliesToPriceIds.asKnown()?.size ?: 0) +
            (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reason.asKnown() == null) 0 else 1) +
            (if (trialAmountDiscount.asKnown() == null) 0 else 1) +
            (if (trialPercentageDiscount.asKnown() == null) 0 else 1)

    class DiscountType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TRIAL = of("trial")

            fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            TRIAL
        }

        /**
         * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DiscountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIAL,
            /**
             * An enum member indicating that [DiscountType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRIAL -> Value.TRIAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                TRIAL -> Known.TRIAL
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): DiscountType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DiscountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrialDiscount &&
            discountType == other.discountType &&
            appliesToPriceIds == other.appliesToPriceIds &&
            filters == other.filters &&
            reason == other.reason &&
            trialAmountDiscount == other.trialAmountDiscount &&
            trialPercentageDiscount == other.trialPercentageDiscount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            discountType,
            appliesToPriceIds,
            filters,
            reason,
            trialAmountDiscount,
            trialPercentageDiscount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrialDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, reason=$reason, trialAmountDiscount=$trialAmountDiscount, trialPercentageDiscount=$trialPercentageDiscount, additionalProperties=$additionalProperties}"
}
