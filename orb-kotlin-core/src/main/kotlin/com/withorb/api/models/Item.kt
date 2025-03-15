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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The Item resource represents a sellable product or good. Items are associated with all line
 * items, billable metrics, and prices and are used for defining external sync behavior for invoices
 * and tax calculation purposes.
 */
@NoAutoDetect
class Item
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_connections")
    @ExcludeMissing
    private val externalConnections: JsonField<List<ExternalConnection>> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalConnections(): List<ExternalConnection> =
        externalConnections.getRequired("external_connections")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [externalConnections].
     *
     * Unlike [externalConnections], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_connections")
    @ExcludeMissing
    fun _externalConnections(): JsonField<List<ExternalConnection>> = externalConnections

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Item = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        externalConnections().forEach { it.validate() }
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Item].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .externalConnections()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Item]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var externalConnections: JsonField<MutableList<ExternalConnection>>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(item: Item) = apply {
            id = item.id
            createdAt = item.createdAt
            externalConnections = item.externalConnections.map { it.toMutableList() }
            name = item.name
            additionalProperties = item.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun externalConnections(externalConnections: List<ExternalConnection>) =
            externalConnections(JsonField.of(externalConnections))

        /**
         * Sets [Builder.externalConnections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalConnections] with a well-typed
         * `List<ExternalConnection>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            this.externalConnections = externalConnections.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalConnection] to [externalConnections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            externalConnections =
                (externalConnections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("externalConnections", it).add(externalConnection)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Item =
            Item(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("externalConnections", externalConnections).map { it.toImmutable() },
                checkRequired("name", name),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ExternalConnection
    @JsonCreator
    private constructor(
        @JsonProperty("external_connection_name")
        @ExcludeMissing
        private val externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of(),
        @JsonProperty("external_entity_id")
        @ExcludeMissing
        private val externalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalConnectionName(): ExternalConnectionName =
            externalConnectionName.getRequired("external_connection_name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalEntityId(): String = externalEntityId.getRequired("external_entity_id")

        /**
         * Returns the raw JSON value of [externalConnectionName].
         *
         * Unlike [externalConnectionName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_connection_name")
        @ExcludeMissing
        fun _externalConnectionName(): JsonField<ExternalConnectionName> = externalConnectionName

        /**
         * Returns the raw JSON value of [externalEntityId].
         *
         * Unlike [externalEntityId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_entity_id")
        @ExcludeMissing
        fun _externalEntityId(): JsonField<String> = externalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalConnection = apply {
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
             * Returns a mutable builder for constructing an instance of [ExternalConnection].
             *
             * The following fields are required:
             * ```kotlin
             * .externalConnectionName()
             * .externalEntityId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ExternalConnection]. */
        class Builder internal constructor() {

            private var externalConnectionName: JsonField<ExternalConnectionName>? = null
            private var externalEntityId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalConnection: ExternalConnection) = apply {
                externalConnectionName = externalConnection.externalConnectionName
                externalEntityId = externalConnection.externalEntityId
                additionalProperties = externalConnection.additionalProperties.toMutableMap()
            }

            fun externalConnectionName(externalConnectionName: ExternalConnectionName) =
                externalConnectionName(JsonField.of(externalConnectionName))

            /**
             * Sets [Builder.externalConnectionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalConnectionName] with a well-typed
             * [ExternalConnectionName] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun externalConnectionName(externalConnectionName: JsonField<ExternalConnectionName>) =
                apply {
                    this.externalConnectionName = externalConnectionName
                }

            fun externalEntityId(externalEntityId: String) =
                externalEntityId(JsonField.of(externalEntityId))

            /**
             * Sets [Builder.externalEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalEntityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun build(): ExternalConnection =
                ExternalConnection(
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

            return /* spotless:off */ other is ExternalConnection && externalConnectionName == other.externalConnectionName && externalEntityId == other.externalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalConnectionName, externalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalConnection{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Item && id == other.id && createdAt == other.createdAt && externalConnections == other.externalConnections && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, externalConnections, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Item{id=$id, createdAt=$createdAt, externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
}
