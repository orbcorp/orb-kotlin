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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AffectedBlock
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val blockFilters: JsonField<List<BlockFilter>>,
    private val expiryDate: JsonField<OffsetDateTime>,
    private val perUnitCostBasis: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("block_filters")
        @ExcludeMissing
        blockFilters: JsonField<List<BlockFilter>> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        perUnitCostBasis: JsonField<String> = JsonMissing.of(),
    ) : this(id, blockFilters, expiryDate, perUnitCostBasis, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun blockFilters(): List<BlockFilter>? = blockFilters.getNullable("block_filters")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [blockFilters].
     *
     * Unlike [blockFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("block_filters")
    @ExcludeMissing
    fun _blockFilters(): JsonField<List<BlockFilter>> = blockFilters

    /**
     * Returns the raw JSON value of [expiryDate].
     *
     * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

    /**
     * Returns the raw JSON value of [perUnitCostBasis].
     *
     * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
         * Returns a mutable builder for constructing an instance of [AffectedBlock].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .blockFilters()
         * .expiryDate()
         * .perUnitCostBasis()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AffectedBlock]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var blockFilters: JsonField<MutableList<BlockFilter>>? = null
        private var expiryDate: JsonField<OffsetDateTime>? = null
        private var perUnitCostBasis: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(affectedBlock: AffectedBlock) = apply {
            id = affectedBlock.id
            blockFilters = affectedBlock.blockFilters.map { it.toMutableList() }
            expiryDate = affectedBlock.expiryDate
            perUnitCostBasis = affectedBlock.perUnitCostBasis
            additionalProperties = affectedBlock.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun blockFilters(blockFilters: List<BlockFilter>?) =
            blockFilters(JsonField.ofNullable(blockFilters))

        /**
         * Sets [Builder.blockFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockFilters] with a well-typed `List<BlockFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun blockFilters(blockFilters: JsonField<List<BlockFilter>>) = apply {
            this.blockFilters = blockFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [BlockFilter] to [blockFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockFilter(blockFilter: BlockFilter) = apply {
            blockFilters =
                (blockFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockFilters", it).add(blockFilter)
                }
        }

        fun expiryDate(expiryDate: OffsetDateTime?) = expiryDate(JsonField.ofNullable(expiryDate))

        /**
         * Sets [Builder.expiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun perUnitCostBasis(perUnitCostBasis: String?) =
            perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

        /**
         * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perUnitCostBasis] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
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
         * Returns an immutable instance of [AffectedBlock].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .blockFilters()
         * .expiryDate()
         * .perUnitCostBasis()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AffectedBlock =
            AffectedBlock(
                checkRequired("id", id),
                checkRequired("blockFilters", blockFilters).map { it.toImmutable() },
                checkRequired("expiryDate", expiryDate),
                checkRequired("perUnitCostBasis", perUnitCostBasis),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AffectedBlock = apply {
        if (validated) {
            return@apply
        }

        id()
        blockFilters()?.forEach { it.validate() }
        expiryDate()
        perUnitCostBasis()
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
            (blockFilters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (expiryDate.asKnown() == null) 0 else 1) +
            (if (perUnitCostBasis.asKnown() == null) 0 else 1)

    class BlockFilter
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
             * Returns a mutable builder for constructing an instance of [BlockFilter].
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

        /** A builder for [BlockFilter]. */
        class Builder internal constructor() {

            private var field: JsonField<Field>? = null
            private var operator: JsonField<Operator>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(blockFilter: BlockFilter) = apply {
                field = blockFilter.field
                operator = blockFilter.operator
                values = blockFilter.values.map { it.toMutableList() }
                additionalProperties = blockFilter.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [BlockFilter].
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
            fun build(): BlockFilter =
                BlockFilter(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("values", values).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BlockFilter = apply {
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

            return other is BlockFilter &&
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
            "BlockFilter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AffectedBlock &&
            id == other.id &&
            blockFilters == other.blockFilters &&
            expiryDate == other.expiryDate &&
            perUnitCostBasis == other.perUnitCostBasis &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, blockFilters, expiryDate, perUnitCostBasis, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffectedBlock{id=$id, blockFilters=$blockFilters, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
}
