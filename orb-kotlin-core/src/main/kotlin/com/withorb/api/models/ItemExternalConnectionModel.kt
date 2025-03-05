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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@NoAutoDetect
class ItemExternalConnectionModel
@JsonCreator
private constructor(
    @JsonProperty("external_connection_name")
    @ExcludeMissing
    private val externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of(),
    @JsonProperty("external_entity_id")
    @ExcludeMissing
    private val externalEntityId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun externalConnectionName(): ExternalConnectionName =
        externalConnectionName.getRequired("external_connection_name")

    fun externalEntityId(): String = externalEntityId.getRequired("external_entity_id")

    @JsonProperty("external_connection_name")
    @ExcludeMissing
    fun _externalConnectionName(): JsonField<ExternalConnectionName> = externalConnectionName

    @JsonProperty("external_entity_id")
    @ExcludeMissing
    fun _externalEntityId(): JsonField<String> = externalEntityId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ItemExternalConnectionModel = apply {
        if (validated) {
            return@apply
        }

        externalConnectionName()
        externalEntityId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemExternalConnectionModel].
         *
         * The following fields are required:
         * ```kotlin
         * .externalConnectionName()
         * .externalEntityId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ItemExternalConnectionModel]. */
    class Builder internal constructor() {

        private var externalConnectionName: JsonField<ExternalConnectionName>? = null
        private var externalEntityId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(itemExternalConnectionModel: ItemExternalConnectionModel) = apply {
            externalConnectionName = itemExternalConnectionModel.externalConnectionName
            externalEntityId = itemExternalConnectionModel.externalEntityId
            additionalProperties = itemExternalConnectionModel.additionalProperties.toMutableMap()
        }

        fun externalConnectionName(externalConnectionName: ExternalConnectionName) =
            externalConnectionName(JsonField.of(externalConnectionName))

        fun externalConnectionName(externalConnectionName: JsonField<ExternalConnectionName>) =
            apply {
                this.externalConnectionName = externalConnectionName
            }

        fun externalEntityId(externalEntityId: String) =
            externalEntityId(JsonField.of(externalEntityId))

        fun externalEntityId(externalEntityId: JsonField<String>) = apply {
            this.externalEntityId = externalEntityId
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

        fun build(): ItemExternalConnectionModel =
            ItemExternalConnectionModel(
                checkRequired("externalConnectionName", externalConnectionName),
                checkRequired("externalEntityId", externalEntityId),
                additionalProperties.toImmutable(),
            )
    }

    class ExternalConnectionName
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val STRIPE = of("stripe")

            val QUICKBOOKS = of("quickbooks")

            val BILL_COM = of("bill.com")

            val NETSUITE = of("netsuite")

            val TAXJAR = of("taxjar")

            val AVALARA = of("avalara")

            val ANROK = of("anrok")

            fun of(value: String) = ExternalConnectionName(JsonField.of(value))
        }

        /** An enum containing [ExternalConnectionName]'s known values. */
        enum class Known {
            STRIPE,
            QUICKBOOKS,
            BILL_COM,
            NETSUITE,
            TAXJAR,
            AVALARA,
            ANROK,
        }

        /**
         * An enum containing [ExternalConnectionName]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExternalConnectionName] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRIPE,
            QUICKBOOKS,
            BILL_COM,
            NETSUITE,
            TAXJAR,
            AVALARA,
            ANROK,
            /**
             * An enum member indicating that [ExternalConnectionName] was instantiated with an
             * unknown value.
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
                STRIPE -> Value.STRIPE
                QUICKBOOKS -> Value.QUICKBOOKS
                BILL_COM -> Value.BILL_COM
                NETSUITE -> Value.NETSUITE
                TAXJAR -> Value.TAXJAR
                AVALARA -> Value.AVALARA
                ANROK -> Value.ANROK
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
                STRIPE -> Known.STRIPE
                QUICKBOOKS -> Known.QUICKBOOKS
                BILL_COM -> Known.BILL_COM
                NETSUITE -> Known.NETSUITE
                TAXJAR -> Known.TAXJAR
                AVALARA -> Known.AVALARA
                ANROK -> Known.ANROK
                else -> throw OrbInvalidDataException("Unknown ExternalConnectionName: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalConnectionName && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemExternalConnectionModel && externalConnectionName == other.externalConnectionName && externalEntityId == other.externalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(externalConnectionName, externalEntityId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemExternalConnectionModel{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"
}
