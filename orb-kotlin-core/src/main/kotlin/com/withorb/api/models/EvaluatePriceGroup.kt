// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@NoAutoDetect
class EvaluatePriceGroup
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("grouping_values")
    @ExcludeMissing
    private val groupingValues: JsonField<List<GroupingValue>> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The price's output for the group
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The values for the group in the order specified by `grouping_keys`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupingValues(): List<GroupingValue> = groupingValues.getRequired("grouping_values")

    /**
     * The price's usage quantity for the group
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Double = quantity.getRequired("quantity")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [groupingValues].
     *
     * Unlike [groupingValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grouping_values")
    @ExcludeMissing
    fun _groupingValues(): JsonField<List<GroupingValue>> = groupingValues

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EvaluatePriceGroup = apply {
        if (validated) {
            return@apply
        }

        amount()
        groupingValues().forEach { it.validate() }
        quantity()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvaluatePriceGroup].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .groupingValues()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EvaluatePriceGroup]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var groupingValues: JsonField<MutableList<GroupingValue>>? = null
        private var quantity: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evaluatePriceGroup: EvaluatePriceGroup) = apply {
            amount = evaluatePriceGroup.amount
            groupingValues = evaluatePriceGroup.groupingValues.map { it.toMutableList() }
            quantity = evaluatePriceGroup.quantity
            additionalProperties = evaluatePriceGroup.additionalProperties.toMutableMap()
        }

        /** The price's output for the group */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The values for the group in the order specified by `grouping_keys` */
        fun groupingValues(groupingValues: List<GroupingValue>) =
            groupingValues(JsonField.of(groupingValues))

        /**
         * Sets [Builder.groupingValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupingValues] with a well-typed `List<GroupingValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun groupingValues(groupingValues: JsonField<List<GroupingValue>>) = apply {
            this.groupingValues = groupingValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [GroupingValue] to [groupingValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupingValue(groupingValue: GroupingValue) = apply {
            groupingValues =
                (groupingValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupingValues", it).add(groupingValue)
                }
        }

        /** Alias for calling [addGroupingValue] with `GroupingValue.ofString(string)`. */
        fun addGroupingValue(string: String) = addGroupingValue(GroupingValue.ofString(string))

        /** Alias for calling [addGroupingValue] with `GroupingValue.ofDouble(double)`. */
        fun addGroupingValue(double: Double) = addGroupingValue(GroupingValue.ofDouble(double))

        /** Alias for calling [addGroupingValue] with `GroupingValue.ofBoolean(boolean)`. */
        fun addGroupingValue(boolean: Boolean) = addGroupingValue(GroupingValue.ofBoolean(boolean))

        /** The price's usage quantity for the group */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
         * Returns an immutable instance of [EvaluatePriceGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .groupingValues()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvaluatePriceGroup =
            EvaluatePriceGroup(
                checkRequired("amount", amount),
                checkRequired("groupingValues", groupingValues).map { it.toImmutable() },
                checkRequired("quantity", quantity),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = GroupingValue.Deserializer::class)
    @JsonSerialize(using = GroupingValue.Serializer::class)
    class GroupingValue
    private constructor(
        private val string: String? = null,
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun double(): Double? = double

        fun boolean(): Boolean? = boolean

        fun isString(): Boolean = string != null

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun asString(): String = string.getOrThrow("string")

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): GroupingValue = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitDouble(double: Double) {}

                    override fun visitBoolean(boolean: Boolean) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupingValue && string == other.string && double == other.double && boolean == other.boolean /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, double, boolean) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "GroupingValue{string=$string}"
                double != null -> "GroupingValue{double=$double}"
                boolean != null -> "GroupingValue{boolean=$boolean}"
                _json != null -> "GroupingValue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid GroupingValue")
            }

        companion object {

            fun ofString(string: String) = GroupingValue(string = string)

            fun ofDouble(double: Double) = GroupingValue(double = double)

            fun ofBoolean(boolean: Boolean) = GroupingValue(boolean = boolean)
        }

        /**
         * An interface that defines how to map each variant of [GroupingValue] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            /**
             * Maps an unknown variant of [GroupingValue] to a value of type [T].
             *
             * An instance of [GroupingValue] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown GroupingValue: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<GroupingValue>(GroupingValue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): GroupingValue {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return GroupingValue(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return GroupingValue(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return GroupingValue(boolean = it, _json = json)
                }

                return GroupingValue(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<GroupingValue>(GroupingValue::class) {

            override fun serialize(
                value: GroupingValue,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.double != null -> generator.writeObject(value.double)
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid GroupingValue")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvaluatePriceGroup && amount == other.amount && groupingValues == other.groupingValues && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, groupingValues, quantity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EvaluatePriceGroup{amount=$amount, groupingValues=$groupingValues, quantity=$quantity, additionalProperties=$additionalProperties}"
}
