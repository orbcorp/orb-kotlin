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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class MatrixSubLineItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val grouping: JsonField<SubLineItemGrouping>,
    private val matrixConfig: JsonField<SubLineItemMatrixConfig>,
    private val name: JsonField<String>,
    private val quantity: JsonField<Double>,
    private val type: JsonField<Type>,
    private val scaledQuantity: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grouping")
        @ExcludeMissing
        grouping: JsonField<SubLineItemGrouping> = JsonMissing.of(),
        @JsonProperty("matrix_config")
        @ExcludeMissing
        matrixConfig: JsonField<SubLineItemMatrixConfig> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("scaled_quantity")
        @ExcludeMissing
        scaledQuantity: JsonField<Double> = JsonMissing.of(),
    ) : this(amount, grouping, matrixConfig, name, quantity, type, scaledQuantity, mutableMapOf())

    /**
     * The total amount for this sub line item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun grouping(): SubLineItemGrouping? = grouping.getNullable("grouping")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matrixConfig(): SubLineItemMatrixConfig = matrixConfig.getRequired("matrix_config")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Double = quantity.getRequired("quantity")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The scaled quantity for this line item for specific pricing structures
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun scaledQuantity(): Double? = scaledQuantity.getNullable("scaled_quantity")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [grouping].
     *
     * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grouping")
    @ExcludeMissing
    fun _grouping(): JsonField<SubLineItemGrouping> = grouping

    /**
     * Returns the raw JSON value of [matrixConfig].
     *
     * Unlike [matrixConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matrix_config")
    @ExcludeMissing
    fun _matrixConfig(): JsonField<SubLineItemMatrixConfig> = matrixConfig

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [scaledQuantity].
     *
     * Unlike [scaledQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scaled_quantity")
    @ExcludeMissing
    fun _scaledQuantity(): JsonField<Double> = scaledQuantity

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
         * Returns a mutable builder for constructing an instance of [MatrixSubLineItem].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .grouping()
         * .matrixConfig()
         * .name()
         * .quantity()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MatrixSubLineItem]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var grouping: JsonField<SubLineItemGrouping>? = null
        private var matrixConfig: JsonField<SubLineItemMatrixConfig>? = null
        private var name: JsonField<String>? = null
        private var quantity: JsonField<Double>? = null
        private var type: JsonField<Type>? = null
        private var scaledQuantity: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
            amount = matrixSubLineItem.amount
            grouping = matrixSubLineItem.grouping
            matrixConfig = matrixSubLineItem.matrixConfig
            name = matrixSubLineItem.name
            quantity = matrixSubLineItem.quantity
            type = matrixSubLineItem.type
            scaledQuantity = matrixSubLineItem.scaledQuantity
            additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
        }

        /** The total amount for this sub line item. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        fun grouping(grouping: SubLineItemGrouping?) = grouping(JsonField.ofNullable(grouping))

        /**
         * Sets [Builder.grouping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grouping] with a well-typed [SubLineItemGrouping] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grouping(grouping: JsonField<SubLineItemGrouping>) = apply { this.grouping = grouping }

        fun matrixConfig(matrixConfig: SubLineItemMatrixConfig) =
            matrixConfig(JsonField.of(matrixConfig))

        /**
         * Sets [Builder.matrixConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matrixConfig] with a well-typed
         * [SubLineItemMatrixConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun matrixConfig(matrixConfig: JsonField<SubLineItemMatrixConfig>) = apply {
            this.matrixConfig = matrixConfig
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The scaled quantity for this line item for specific pricing structures */
        fun scaledQuantity(scaledQuantity: Double?) =
            scaledQuantity(JsonField.ofNullable(scaledQuantity))

        /**
         * Alias for [Builder.scaledQuantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun scaledQuantity(scaledQuantity: Double) = scaledQuantity(scaledQuantity as Double?)

        /**
         * Sets [Builder.scaledQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scaledQuantity] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scaledQuantity(scaledQuantity: JsonField<Double>) = apply {
            this.scaledQuantity = scaledQuantity
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
         * Returns an immutable instance of [MatrixSubLineItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .grouping()
         * .matrixConfig()
         * .name()
         * .quantity()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MatrixSubLineItem =
            MatrixSubLineItem(
                checkRequired("amount", amount),
                checkRequired("grouping", grouping),
                checkRequired("matrixConfig", matrixConfig),
                checkRequired("name", name),
                checkRequired("quantity", quantity),
                checkRequired("type", type),
                scaledQuantity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MatrixSubLineItem = apply {
        if (validated) {
            return@apply
        }

        amount()
        grouping()?.validate()
        matrixConfig().validate()
        name()
        quantity()
        type().validate()
        scaledQuantity()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (grouping.asKnown()?.validity() ?: 0) +
            (matrixConfig.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (scaledQuantity.asKnown() == null) 0 else 1)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val MATRIX = of("matrix")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MATRIX
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MATRIX,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                MATRIX -> Value.MATRIX
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
                MATRIX -> Known.MATRIX
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatrixSubLineItem &&
            amount == other.amount &&
            grouping == other.grouping &&
            matrixConfig == other.matrixConfig &&
            name == other.name &&
            quantity == other.quantity &&
            type == other.type &&
            scaledQuantity == other.scaledQuantity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            grouping,
            matrixConfig,
            name,
            quantity,
            type,
            scaledQuantity,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixSubLineItem{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, scaledQuantity=$scaledQuantity, additionalProperties=$additionalProperties}"
}
