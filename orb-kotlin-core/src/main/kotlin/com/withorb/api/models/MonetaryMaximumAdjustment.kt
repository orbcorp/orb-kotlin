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

class MonetaryMaximumAdjustment
private constructor(
    private val id: JsonField<String>,
    private val adjustmentType: JsonField<AdjustmentType>,
    private val amount: JsonField<String>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val filters: JsonField<List<TransformPriceFilter>>,
    private val isInvoiceLevel: JsonField<Boolean>,
    private val maximumAmount: JsonField<String>,
    private val reason: JsonField<String>,
    private val replacesAdjustmentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<TransformPriceFilter>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replaces_adjustment_id")
        @ExcludeMissing
        replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        adjustmentType,
        amount,
        appliesToPriceIds,
        filters,
        isInvoiceLevel,
        maximumAmount,
        reason,
        replacesAdjustmentId,
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
     * The value applied by an adjustment.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

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
    fun filters(): List<TransformPriceFilter> = filters.getRequired("filters")

    /**
     * True for adjustments that apply to an entire invoice, false for adjustments that apply to
     * only one price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

    /**
     * The maximum amount to charge in a given billing period for the prices this adjustment applies
     * to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<TransformPriceFilter>> = filters

    /**
     * Returns the raw JSON value of [isInvoiceLevel].
     *
     * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_invoice_level")
    @ExcludeMissing
    fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

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
         * Returns a mutable builder for constructing an instance of [MonetaryMaximumAdjustment].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustmentType()
         * .amount()
         * .appliesToPriceIds()
         * .filters()
         * .isInvoiceLevel()
         * .maximumAmount()
         * .reason()
         * .replacesAdjustmentId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MonetaryMaximumAdjustment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustmentType: JsonField<AdjustmentType>? = null
        private var amount: JsonField<String>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var filters: JsonField<MutableList<TransformPriceFilter>>? = null
        private var isInvoiceLevel: JsonField<Boolean>? = null
        private var maximumAmount: JsonField<String>? = null
        private var reason: JsonField<String>? = null
        private var replacesAdjustmentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(monetaryMaximumAdjustment: MonetaryMaximumAdjustment) = apply {
            id = monetaryMaximumAdjustment.id
            adjustmentType = monetaryMaximumAdjustment.adjustmentType
            amount = monetaryMaximumAdjustment.amount
            appliesToPriceIds =
                monetaryMaximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
            filters = monetaryMaximumAdjustment.filters.map { it.toMutableList() }
            isInvoiceLevel = monetaryMaximumAdjustment.isInvoiceLevel
            maximumAmount = monetaryMaximumAdjustment.maximumAmount
            reason = monetaryMaximumAdjustment.reason
            replacesAdjustmentId = monetaryMaximumAdjustment.replacesAdjustmentId
            additionalProperties = monetaryMaximumAdjustment.additionalProperties.toMutableMap()
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

        /** The value applied by an adjustment. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

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
        fun filters(filters: List<TransformPriceFilter>) = filters(JsonField.of(filters))

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

        /**
         * The maximum amount to charge in a given billing period for the prices this adjustment
         * applies to.
         */
        fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

        /**
         * Sets [Builder.maximumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
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
         * Returns an immutable instance of [MonetaryMaximumAdjustment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustmentType()
         * .amount()
         * .appliesToPriceIds()
         * .filters()
         * .isInvoiceLevel()
         * .maximumAmount()
         * .reason()
         * .replacesAdjustmentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MonetaryMaximumAdjustment =
            MonetaryMaximumAdjustment(
                checkRequired("id", id),
                checkRequired("adjustmentType", adjustmentType),
                checkRequired("amount", amount),
                checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("isInvoiceLevel", isInvoiceLevel),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("reason", reason),
                checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MonetaryMaximumAdjustment = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustmentType().validate()
        amount()
        appliesToPriceIds()
        filters().forEach { it.validate() }
        isInvoiceLevel()
        maximumAmount()
        reason()
        replacesAdjustmentId()
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
            (if (amount.asKnown() == null) 0 else 1) +
            (appliesToPriceIds.asKnown()?.size ?: 0) +
            (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
            (if (maximumAmount.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (if (replacesAdjustmentId.asKnown() == null) 0 else 1)

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

            val MAXIMUM = of("maximum")

            fun of(value: String) = AdjustmentType(JsonField.of(value))
        }

        /** An enum containing [AdjustmentType]'s known values. */
        enum class Known {
            MAXIMUM
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
            MAXIMUM,
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
                MAXIMUM -> Value.MAXIMUM
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
                MAXIMUM -> Known.MAXIMUM
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MonetaryMaximumAdjustment &&
            id == other.id &&
            adjustmentType == other.adjustmentType &&
            amount == other.amount &&
            appliesToPriceIds == other.appliesToPriceIds &&
            filters == other.filters &&
            isInvoiceLevel == other.isInvoiceLevel &&
            maximumAmount == other.maximumAmount &&
            reason == other.reason &&
            replacesAdjustmentId == other.replacesAdjustmentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            adjustmentType,
            amount,
            appliesToPriceIds,
            filters,
            isInvoiceLevel,
            maximumAmount,
            reason,
            replacesAdjustmentId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MonetaryMaximumAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, reason=$reason, replacesAdjustmentId=$replacesAdjustmentId, additionalProperties=$additionalProperties}"
}
