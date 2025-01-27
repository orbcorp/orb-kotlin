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
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/** This endpoint can be used to update properties on the Item. */
class ItemUpdateParams
private constructor(
    private val itemId: String,
    private val body: ItemUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun itemId(): String = itemId

    fun externalConnections(): List<ExternalConnection>? = body.externalConnections()

    fun name(): String? = body.name()

    fun _externalConnections(): JsonField<List<ExternalConnection>> = body._externalConnections()

    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): ItemUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

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
    @NoAutoDetect
    class ItemUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("external_connections")
        @ExcludeMissing
        private val externalConnections: JsonField<List<ExternalConnection>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun externalConnections(): List<ExternalConnection>? =
            externalConnections.getNullable("external_connections")

        fun name(): String? = name.getNullable("name")

        @JsonProperty("external_connections")
        @ExcludeMissing
        fun _externalConnections(): JsonField<List<ExternalConnection>> = externalConnections

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ItemUpdateBody = apply {
            if (validated) {
                return@apply
            }

            externalConnections()?.forEach { it.validate() }
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ItemUpdateBody]. */
        class Builder internal constructor() {

            private var externalConnections: JsonField<MutableList<ExternalConnection>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(itemUpdateBody: ItemUpdateBody) = apply {
                externalConnections = itemUpdateBody.externalConnections.map { it.toMutableList() }
                name = itemUpdateBody.name
                additionalProperties = itemUpdateBody.additionalProperties.toMutableMap()
            }

            fun externalConnections(externalConnections: List<ExternalConnection>?) =
                externalConnections(JsonField.ofNullable(externalConnections))

            fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) =
                apply {
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

            fun name(name: String?) = name(JsonField.ofNullable(name))

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

            fun build(): ItemUpdateBody =
                ItemUpdateBody(
                    (externalConnections ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ItemUpdateBody && externalConnections == other.externalConnections && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalConnections, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ItemUpdateBody{externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ItemUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var itemId: String? = null
        private var body: ItemUpdateBody.Builder = ItemUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(itemUpdateParams: ItemUpdateParams) = apply {
            itemId = itemUpdateParams.itemId
            body = itemUpdateParams.body.toBuilder()
            additionalHeaders = itemUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = itemUpdateParams.additionalQueryParams.toBuilder()
        }

        fun itemId(itemId: String) = apply { this.itemId = itemId }

        fun externalConnections(externalConnections: List<ExternalConnection>?) = apply {
            body.externalConnections(externalConnections)
        }

        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            body.externalConnections(externalConnections)
        }

        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            body.addExternalConnection(externalConnection)
        }

        fun name(name: String?) = apply { body.name(name) }

        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ItemUpdateParams =
            ItemUpdateParams(
                checkRequired("itemId", itemId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
            if (validated) {
                return@apply
            }

            externalConnectionName()
            externalEntityId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    checkRequired("externalConnectionName", externalConnectionName),
                    checkRequired("externalEntityId", externalEntityId),
                    additionalProperties.toImmutable(),
                )
        }

        class ExternalConnectionName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

        return /* spotless:off */ other is ItemUpdateParams && itemId == other.itemId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(itemId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ItemUpdateParams{itemId=$itemId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
