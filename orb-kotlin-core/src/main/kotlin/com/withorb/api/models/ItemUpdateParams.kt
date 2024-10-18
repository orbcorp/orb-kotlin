// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects

class ItemUpdateParams
constructor(
    private val itemId: String,
    private val externalConnections: List<ExternalConnection>?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun itemId(): String = itemId

    fun externalConnections(): List<ExternalConnection>? = externalConnections

    fun name(): String? = name

    internal fun getBody(): ItemUpdateBody {
        return ItemUpdateBody(
            externalConnections,
            name,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> itemId
            else -> ""
        }
    }

    /**
     * A list of external connections to map an item to. Note that passing `null` will clear
     * existing mappings. Orb requires that you pass the full list of mappings; this list will
     * replace the existing item mappings.
     */
    @JsonDeserialize(builder = ItemUpdateBody.Builder::class)
    @NoAutoDetect
    class ItemUpdateBody
    internal constructor(
        private val externalConnections: List<ExternalConnection>?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("external_connections")
        fun externalConnections(): List<ExternalConnection>? = externalConnections

        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var externalConnections: List<ExternalConnection>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(itemUpdateBody: ItemUpdateBody) = apply {
                this.externalConnections = itemUpdateBody.externalConnections
                this.name = itemUpdateBody.name
                additionalProperties(itemUpdateBody.additionalProperties)
            }

            @JsonProperty("external_connections")
            fun externalConnections(externalConnections: List<ExternalConnection>) = apply {
                this.externalConnections = externalConnections
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ItemUpdateBody =
                ItemUpdateBody(
                    externalConnections?.toUnmodifiable(),
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ItemUpdateBody && this.externalConnections == other.externalConnections && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(externalConnections, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ItemUpdateBody{externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemUpdateParams && this.itemId == other.itemId && this.externalConnections == other.externalConnections && this.name == other.name && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(itemId, externalConnections, name, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ItemUpdateParams{itemId=$itemId, externalConnections=$externalConnections, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var itemId: String? = null
        private var externalConnections: MutableList<ExternalConnection> = mutableListOf()
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(itemUpdateParams: ItemUpdateParams) = apply {
            this.itemId = itemUpdateParams.itemId
            this.externalConnections(itemUpdateParams.externalConnections ?: listOf())
            this.name = itemUpdateParams.name
            additionalQueryParams(itemUpdateParams.additionalQueryParams)
            additionalHeaders(itemUpdateParams.additionalHeaders)
            additionalBodyProperties(itemUpdateParams.additionalBodyProperties)
        }

        fun itemId(itemId: String) = apply { this.itemId = itemId }

        fun externalConnections(externalConnections: List<ExternalConnection>) = apply {
            this.externalConnections.clear()
            this.externalConnections.addAll(externalConnections)
        }

        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            this.externalConnections.add(externalConnection)
        }

        fun name(name: String) = apply { this.name = name }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ItemUpdateParams =
            ItemUpdateParams(
                checkNotNull(itemId) { "`itemId` is required but was not set" },
                if (externalConnections.size == 0) null else externalConnections.toUnmodifiable(),
                name,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ExternalConnection.Builder::class)
    @NoAutoDetect
    class ExternalConnection
    private constructor(
        private val externalConnectionName: ExternalConnectionName?,
        private val externalEntityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("external_connection_name")
        fun externalConnectionName(): ExternalConnectionName? = externalConnectionName

        @JsonProperty("external_entity_id") fun externalEntityId(): String? = externalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var externalConnectionName: ExternalConnectionName? = null
            private var externalEntityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalConnection: ExternalConnection) = apply {
                this.externalConnectionName = externalConnection.externalConnectionName
                this.externalEntityId = externalConnection.externalEntityId
                additionalProperties(externalConnection.additionalProperties)
            }

            @JsonProperty("external_connection_name")
            fun externalConnectionName(externalConnectionName: ExternalConnectionName) = apply {
                this.externalConnectionName = externalConnectionName
            }

            @JsonProperty("external_entity_id")
            fun externalEntityId(externalEntityId: String) = apply {
                this.externalEntityId = externalEntityId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ExternalConnection =
                ExternalConnection(
                    checkNotNull(externalConnectionName) {
                        "`externalConnectionName` is required but was not set"
                    },
                    checkNotNull(externalEntityId) {
                        "`externalEntityId` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ExternalConnectionName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalConnectionName && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val STRIPE = ExternalConnectionName(JsonField.of("stripe"))

                val QUICKBOOKS = ExternalConnectionName(JsonField.of("quickbooks"))

                val BILL_COM = ExternalConnectionName(JsonField.of("bill.com"))

                val NETSUITE = ExternalConnectionName(JsonField.of("netsuite"))

                val TAXJAR = ExternalConnectionName(JsonField.of("taxjar"))

                val AVALARA = ExternalConnectionName(JsonField.of("avalara"))

                val ANROK = ExternalConnectionName(JsonField.of("anrok"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalConnection && this.externalConnectionName == other.externalConnectionName && this.externalEntityId == other.externalEntityId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(externalConnectionName, externalEntityId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalConnection{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"
    }
}
