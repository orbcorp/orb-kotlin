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

class PlanPhaseUsageDiscountAdjustment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val adjustmentType: JsonField<AdjustmentType>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val filters: JsonField<List<Filter>>,
    private val isInvoiceLevel: JsonField<Boolean>,
    private val planPhaseOrder: JsonField<Long>,
    private val reason: JsonField<String>,
    private val replacesAdjustmentId: JsonField<String>,
    private val usageDiscount: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replaces_adjustment_id")
        @ExcludeMissing
        replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_discount")
        @ExcludeMissing
        usageDiscount: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        adjustmentType,
        appliesToPriceIds,
        filters,
        isInvoiceLevel,
        planPhaseOrder,
        reason,
        replacesAdjustmentId,
        usageDiscount,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

    /**
     * The price IDs that this adjustment applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    /**
     * The filters that determine which prices to apply this adjustment to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * True for adjustments that apply to an entire invoice, false for adjustments that apply to
     * only one price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

    /**
     * The plan phase in which this adjustment is active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

    /**
     * The reason for the adjustment.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * The adjustment id this adjustment replaces. This adjustment will take the place of the
     * replaced adjustment in plan version migrations.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replacesAdjustmentId(): String? = replacesAdjustmentId.getNullable("replaces_adjustment_id")

    /**
     * The number of usage units by which to discount the price this adjustment applies to in a
     * given billing period.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [adjustmentType].
     *
     * Unlike [adjustmentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustment_type")
    @ExcludeMissing
    fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

    /**
     * Returns the raw JSON value of [appliesToPriceIds].
     *
     * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [isInvoiceLevel].
     *
     * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_invoice_level")
    @ExcludeMissing
    fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

    /**
     * Returns the raw JSON value of [planPhaseOrder].
     *
     * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_phase_order")
    @ExcludeMissing
    fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [replacesAdjustmentId].
     *
     * Unlike [replacesAdjustmentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("replaces_adjustment_id")
    @ExcludeMissing
    fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

    /**
     * Returns the raw JSON value of [usageDiscount].
     *
     * Unlike [usageDiscount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_discount")
    @ExcludeMissing
    fun _usageDiscount(): JsonField<Double> = usageDiscount

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
         * [PlanPhaseUsageDiscountAdjustment].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustmentType()
         * .appliesToPriceIds()
         * .filters()
         * .isInvoiceLevel()
         * .planPhaseOrder()
         * .reason()
         * .replacesAdjustmentId()
         * .usageDiscount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanPhaseUsageDiscountAdjustment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustmentType: JsonField<AdjustmentType>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var filters: JsonField<MutableList<Filter>>? = null
        private var isInvoiceLevel: JsonField<Boolean>? = null
        private var planPhaseOrder: JsonField<Long>? = null
        private var reason: JsonField<String>? = null
        private var replacesAdjustmentId: JsonField<String>? = null
        private var usageDiscount: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment) =
            apply {
                id = planPhaseUsageDiscountAdjustment.id
                adjustmentType = planPhaseUsageDiscountAdjustment.adjustmentType
                appliesToPriceIds =
                    planPhaseUsageDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                filters = planPhaseUsageDiscountAdjustment.filters.map { it.toMutableList() }
                isInvoiceLevel = planPhaseUsageDiscountAdjustment.isInvoiceLevel
                planPhaseOrder = planPhaseUsageDiscountAdjustment.planPhaseOrder
                reason = planPhaseUsageDiscountAdjustment.reason
                replacesAdjustmentId = planPhaseUsageDiscountAdjustment.replacesAdjustmentId
                usageDiscount = planPhaseUsageDiscountAdjustment.usageDiscount
                additionalProperties =
                    planPhaseUsageDiscountAdjustment.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun adjustmentType(adjustmentType: AdjustmentType) =
            adjustmentType(JsonField.of(adjustmentType))

        /**
         * Sets [Builder.adjustmentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustmentType] with a well-typed [AdjustmentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
            this.adjustmentType = adjustmentType
        }

        /** The price IDs that this adjustment applies to. */
        @Deprecated("deprecated")
        fun appliesToPriceIds(appliesToPriceIds: List<String>) =
            appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /**
         * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToPriceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
        }

        /** The filters that determine which prices to apply this adjustment to. */
        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /**
         * True for adjustments that apply to an entire invoice, false for adjustments that apply to
         * only one price.
         */
        fun isInvoiceLevel(isInvoiceLevel: Boolean) = isInvoiceLevel(JsonField.of(isInvoiceLevel))

        /**
         * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
            this.isInvoiceLevel = isInvoiceLevel
        }

        /** The plan phase in which this adjustment is active. */
        fun planPhaseOrder(planPhaseOrder: Long?) =
            planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

        /**
         * Alias for [Builder.planPhaseOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

        /**
         * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
            this.planPhaseOrder = planPhaseOrder
        }

        /** The reason for the adjustment. */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * The adjustment id this adjustment replaces. This adjustment will take the place of the
         * replaced adjustment in plan version migrations.
         */
        fun replacesAdjustmentId(replacesAdjustmentId: String?) =
            replacesAdjustmentId(JsonField.ofNullable(replacesAdjustmentId))

        /**
         * Sets [Builder.replacesAdjustmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacesAdjustmentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
            this.replacesAdjustmentId = replacesAdjustmentId
        }

        /**
         * The number of usage units by which to discount the price this adjustment applies to in a
         * given billing period.
         */
        fun usageDiscount(usageDiscount: Double) = usageDiscount(JsonField.of(usageDiscount))

        /**
         * Sets [Builder.usageDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageDiscount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
            this.usageDiscount = usageDiscount
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
         * Returns an immutable instance of [PlanPhaseUsageDiscountAdjustment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustmentType()
         * .appliesToPriceIds()
         * .filters()
         * .isInvoiceLevel()
         * .planPhaseOrder()
         * .reason()
         * .replacesAdjustmentId()
         * .usageDiscount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanPhaseUsageDiscountAdjustment =
            PlanPhaseUsageDiscountAdjustment(
                checkRequired("id", id),
                checkRequired("adjustmentType", adjustmentType),
                checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("isInvoiceLevel", isInvoiceLevel),
                checkRequired("planPhaseOrder", planPhaseOrder),
                checkRequired("reason", reason),
                checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                checkRequired("usageDiscount", usageDiscount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanPhaseUsageDiscountAdjustment = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustmentType().validate()
        appliesToPriceIds()
        filters().forEach { it.validate() }
        isInvoiceLevel()
        planPhaseOrder()
        reason()
        replacesAdjustmentId()
        usageDiscount()
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
        (if (id.asKnown() == null) 0 else 1) +
            (adjustmentType.asKnown()?.validity() ?: 0) +
            (appliesToPriceIds.asKnown()?.size ?: 0) +
            (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
            (if (planPhaseOrder.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (if (replacesAdjustmentId.asKnown() == null) 0 else 1) +
            (if (usageDiscount.asKnown() == null) 0 else 1)

    class AdjustmentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val USAGE_DISCOUNT = of("usage_discount")

            fun of(value: String) = AdjustmentType(JsonField.of(value))
        }

        /** An enum containing [AdjustmentType]'s known values. */
        enum class Known {
            USAGE_DISCOUNT
        }

        /**
         * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE_DISCOUNT,
            /**
             * An enum member indicating that [AdjustmentType] was instantiated with an unknown
             * value.
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
                USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
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
                USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        fun validate(): AdjustmentType = apply {
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

            return other is AdjustmentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Filter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<Field>,
        private val operator: JsonField<Operator>,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(field, operator, values, mutableMapOf())

        /**
         * The property of the price to filter on.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun field(): Field = field.getRequired("field")

        /**
         * Should prices that match the filter be included or excluded.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): Operator = operator.getRequired("operator")

        /**
         * The IDs or values that match this filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun values(): List<String> = values.getRequired("values")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
             * Returns a mutable builder for constructing an instance of [Filter].
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .values()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var field: JsonField<Field>? = null
            private var operator: JsonField<Operator>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(filter: Filter) = apply {
                field = filter.field
                operator = filter.operator
                values = filter.values.map { it.toMutableList() }
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

            /** The property of the price to filter on. */
            fun field(field: Field) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [Field] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun field(field: JsonField<Field>) = apply { this.field = field }

            /** Should prices that match the filter be included or excluded. */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** The IDs or values that match this filter. */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
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
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .values()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Filter =
                Filter(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("values", values).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            field().validate()
            operator().validate()
            values()
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
        internal fun validity(): Int =
            (field.asKnown()?.validity() ?: 0) +
                (operator.asKnown()?.validity() ?: 0) +
                (values.asKnown()?.size ?: 0)

        /** The property of the price to filter on. */
        class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PRICE_ID = of("price_id")

                val ITEM_ID = of("item_id")

                val PRICE_TYPE = of("price_type")

                val CURRENCY = of("currency")

                val PRICING_UNIT_ID = of("pricing_unit_id")

                fun of(value: String) = Field(JsonField.of(value))
            }

            /** An enum containing [Field]'s known values. */
            enum class Known {
                PRICE_ID,
                ITEM_ID,
                PRICE_TYPE,
                CURRENCY,
                PRICING_UNIT_ID,
            }

            /**
             * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Field] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRICE_ID,
                ITEM_ID,
                PRICE_TYPE,
                CURRENCY,
                PRICING_UNIT_ID,
                /**
                 * An enum member indicating that [Field] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PRICE_ID -> Value.PRICE_ID
                    ITEM_ID -> Value.ITEM_ID
                    PRICE_TYPE -> Value.PRICE_TYPE
                    CURRENCY -> Value.CURRENCY
                    PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PRICE_ID -> Known.PRICE_ID
                    ITEM_ID -> Known.ITEM_ID
                    PRICE_TYPE -> Known.PRICE_TYPE
                    CURRENCY -> Known.CURRENCY
                    PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                    else -> throw OrbInvalidDataException("Unknown Field: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Field = apply {
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

                return other is Field && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Should prices that match the filter be included or excluded. */
        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCLUDES = of("includes")

                val EXCLUDES = of("excludes")

                fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                INCLUDES,
                EXCLUDES,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCLUDES,
                EXCLUDES,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INCLUDES -> Value.INCLUDES
                    EXCLUDES -> Value.EXCLUDES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INCLUDES -> Known.INCLUDES
                    EXCLUDES -> Known.EXCLUDES
                    else -> throw OrbInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Operator = apply {
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

                return other is Operator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                field == other.field &&
                operator == other.operator &&
                values == other.values &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(field, operator, values, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanPhaseUsageDiscountAdjustment &&
            id == other.id &&
            adjustmentType == other.adjustmentType &&
            appliesToPriceIds == other.appliesToPriceIds &&
            filters == other.filters &&
            isInvoiceLevel == other.isInvoiceLevel &&
            planPhaseOrder == other.planPhaseOrder &&
            reason == other.reason &&
            replacesAdjustmentId == other.replacesAdjustmentId &&
            usageDiscount == other.usageDiscount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            adjustmentType,
            appliesToPriceIds,
            filters,
            isInvoiceLevel,
            planPhaseOrder,
            reason,
            replacesAdjustmentId,
            usageDiscount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanPhaseUsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, replacesAdjustmentId=$replacesAdjustmentId, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
}
