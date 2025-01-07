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

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun externalConnections(): List<ExternalConnection> =
        externalConnections.getRequired("external_connections")

    fun name(): String = name.getRequired("name")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("external_connections")
    @ExcludeMissing
    fun _externalConnections(): JsonField<List<ExternalConnection>> = externalConnections

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Item = apply {
        if (!validated) {
            id()
            createdAt()
            externalConnections().forEach { it.validate() }
            name()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

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

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun externalConnections(externalConnections: List<ExternalConnection>) =
            externalConnections(JsonField.of(externalConnections))

        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            this.externalConnections = externalConnections.map { it.toMutableList() }
        }

        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            externalConnections =
                (externalConnections ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(externalConnection)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

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
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(externalConnections) {
                        "`externalConnections` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(name) { "`name` is required but was not set" },
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

        fun validate(): ExternalConnection = apply {
            if (!validated) {
                externalConnectionName()
                externalEntityId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

            fun build(): ExternalConnection =
                ExternalConnection(
                    checkNotNull(externalConnectionName) {
                        "`externalConnectionName` is required but was not set"
                    },
                    checkNotNull(externalEntityId) {
                        "`externalEntityId` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class ExternalConnectionName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            enum class Known {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
            }

            enum class Value {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

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
