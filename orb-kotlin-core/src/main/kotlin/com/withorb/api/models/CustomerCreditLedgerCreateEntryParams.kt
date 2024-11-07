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
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class CustomerCreditLedgerCreateEntryParams
constructor(
    private val customerId: String,
    private val addIncrementCreditLedgerEntryRequestParams:
        AddIncrementCreditLedgerEntryRequestParams?,
    private val addDecrementCreditLedgerEntryRequestParams:
        AddDecrementCreditLedgerEntryRequestParams?,
    private val addExpirationChangeCreditLedgerEntryRequestParams:
        AddExpirationChangeCreditLedgerEntryRequestParams?,
    private val addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams?,
    private val addAmendmentCreditLedgerEntryRequestParams:
        AddAmendmentCreditLedgerEntryRequestParams?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun addIncrementCreditLedgerEntryRequestParams(): AddIncrementCreditLedgerEntryRequestParams? =
        addIncrementCreditLedgerEntryRequestParams

    fun addDecrementCreditLedgerEntryRequestParams(): AddDecrementCreditLedgerEntryRequestParams? =
        addDecrementCreditLedgerEntryRequestParams

    fun addExpirationChangeCreditLedgerEntryRequestParams():
        AddExpirationChangeCreditLedgerEntryRequestParams? =
        addExpirationChangeCreditLedgerEntryRequestParams

    fun addVoidCreditLedgerEntryRequestParams(): AddVoidCreditLedgerEntryRequestParams? =
        addVoidCreditLedgerEntryRequestParams

    fun addAmendmentCreditLedgerEntryRequestParams(): AddAmendmentCreditLedgerEntryRequestParams? =
        addAmendmentCreditLedgerEntryRequestParams

    internal fun getBody(): CustomerCreditLedgerCreateEntryBody {
        return CustomerCreditLedgerCreateEntryBody(
            addIncrementCreditLedgerEntryRequestParams,
            addDecrementCreditLedgerEntryRequestParams,
            addExpirationChangeCreditLedgerEntryRequestParams,
            addVoidCreditLedgerEntryRequestParams,
            addAmendmentCreditLedgerEntryRequestParams,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @JsonDeserialize(using = CustomerCreditLedgerCreateEntryBody.Deserializer::class)
    @JsonSerialize(using = CustomerCreditLedgerCreateEntryBody.Serializer::class)
    class CustomerCreditLedgerCreateEntryBody
    internal constructor(
        private val addIncrementCreditLedgerEntryRequestParams:
            AddIncrementCreditLedgerEntryRequestParams? =
            null,
        private val addDecrementCreditLedgerEntryRequestParams:
            AddDecrementCreditLedgerEntryRequestParams? =
            null,
        private val addExpirationChangeCreditLedgerEntryRequestParams:
            AddExpirationChangeCreditLedgerEntryRequestParams? =
            null,
        private val addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams? =
            null,
        private val addAmendmentCreditLedgerEntryRequestParams:
            AddAmendmentCreditLedgerEntryRequestParams? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun addIncrementCreditLedgerEntryRequestParams():
            AddIncrementCreditLedgerEntryRequestParams? = addIncrementCreditLedgerEntryRequestParams

        fun addDecrementCreditLedgerEntryRequestParams():
            AddDecrementCreditLedgerEntryRequestParams? = addDecrementCreditLedgerEntryRequestParams

        fun addExpirationChangeCreditLedgerEntryRequestParams():
            AddExpirationChangeCreditLedgerEntryRequestParams? =
            addExpirationChangeCreditLedgerEntryRequestParams

        fun addVoidCreditLedgerEntryRequestParams(): AddVoidCreditLedgerEntryRequestParams? =
            addVoidCreditLedgerEntryRequestParams

        fun addAmendmentCreditLedgerEntryRequestParams():
            AddAmendmentCreditLedgerEntryRequestParams? = addAmendmentCreditLedgerEntryRequestParams

        fun isAddIncrementCreditLedgerEntryRequestParams(): Boolean =
            addIncrementCreditLedgerEntryRequestParams != null

        fun isAddDecrementCreditLedgerEntryRequestParams(): Boolean =
            addDecrementCreditLedgerEntryRequestParams != null

        fun isAddExpirationChangeCreditLedgerEntryRequestParams(): Boolean =
            addExpirationChangeCreditLedgerEntryRequestParams != null

        fun isAddVoidCreditLedgerEntryRequestParams(): Boolean =
            addVoidCreditLedgerEntryRequestParams != null

        fun isAddAmendmentCreditLedgerEntryRequestParams(): Boolean =
            addAmendmentCreditLedgerEntryRequestParams != null

        fun asAddIncrementCreditLedgerEntryRequestParams():
            AddIncrementCreditLedgerEntryRequestParams =
            addIncrementCreditLedgerEntryRequestParams.getOrThrow(
                "addIncrementCreditLedgerEntryRequestParams"
            )

        fun asAddDecrementCreditLedgerEntryRequestParams():
            AddDecrementCreditLedgerEntryRequestParams =
            addDecrementCreditLedgerEntryRequestParams.getOrThrow(
                "addDecrementCreditLedgerEntryRequestParams"
            )

        fun asAddExpirationChangeCreditLedgerEntryRequestParams():
            AddExpirationChangeCreditLedgerEntryRequestParams =
            addExpirationChangeCreditLedgerEntryRequestParams.getOrThrow(
                "addExpirationChangeCreditLedgerEntryRequestParams"
            )

        fun asAddVoidCreditLedgerEntryRequestParams(): AddVoidCreditLedgerEntryRequestParams =
            addVoidCreditLedgerEntryRequestParams.getOrThrow(
                "addVoidCreditLedgerEntryRequestParams"
            )

        fun asAddAmendmentCreditLedgerEntryRequestParams():
            AddAmendmentCreditLedgerEntryRequestParams =
            addAmendmentCreditLedgerEntryRequestParams.getOrThrow(
                "addAmendmentCreditLedgerEntryRequestParams"
            )

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                addIncrementCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddIncrementCreditLedgerEntryRequestParams(
                        addIncrementCreditLedgerEntryRequestParams
                    )
                addDecrementCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddDecrementCreditLedgerEntryRequestParams(
                        addDecrementCreditLedgerEntryRequestParams
                    )
                addExpirationChangeCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddExpirationChangeCreditLedgerEntryRequestParams(
                        addExpirationChangeCreditLedgerEntryRequestParams
                    )
                addVoidCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddVoidCreditLedgerEntryRequestParams(
                        addVoidCreditLedgerEntryRequestParams
                    )
                addAmendmentCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddAmendmentCreditLedgerEntryRequestParams(
                        addAmendmentCreditLedgerEntryRequestParams
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditLedgerCreateEntryBody && this.addIncrementCreditLedgerEntryRequestParams == other.addIncrementCreditLedgerEntryRequestParams && this.addDecrementCreditLedgerEntryRequestParams == other.addDecrementCreditLedgerEntryRequestParams && this.addExpirationChangeCreditLedgerEntryRequestParams == other.addExpirationChangeCreditLedgerEntryRequestParams && this.addVoidCreditLedgerEntryRequestParams == other.addVoidCreditLedgerEntryRequestParams && this.addAmendmentCreditLedgerEntryRequestParams == other.addAmendmentCreditLedgerEntryRequestParams /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(addIncrementCreditLedgerEntryRequestParams, addDecrementCreditLedgerEntryRequestParams, addExpirationChangeCreditLedgerEntryRequestParams, addVoidCreditLedgerEntryRequestParams, addAmendmentCreditLedgerEntryRequestParams) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                addIncrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addIncrementCreditLedgerEntryRequestParams=$addIncrementCreditLedgerEntryRequestParams}"
                addDecrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addDecrementCreditLedgerEntryRequestParams=$addDecrementCreditLedgerEntryRequestParams}"
                addExpirationChangeCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addExpirationChangeCreditLedgerEntryRequestParams=$addExpirationChangeCreditLedgerEntryRequestParams}"
                addVoidCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addVoidCreditLedgerEntryRequestParams=$addVoidCreditLedgerEntryRequestParams}"
                addAmendmentCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addAmendmentCreditLedgerEntryRequestParams=$addAmendmentCreditLedgerEntryRequestParams}"
                _json != null -> "CustomerCreditLedgerCreateEntryBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryBody")
            }
        }

        companion object {

            fun ofAddIncrementCreditLedgerEntryRequestParams(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addIncrementCreditLedgerEntryRequestParams =
                        addIncrementCreditLedgerEntryRequestParams
                )

            fun ofAddDecrementCreditLedgerEntryRequestParams(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addDecrementCreditLedgerEntryRequestParams =
                        addDecrementCreditLedgerEntryRequestParams
                )

            fun ofAddExpirationChangeCreditLedgerEntryRequestParams(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addExpirationChangeCreditLedgerEntryRequestParams =
                        addExpirationChangeCreditLedgerEntryRequestParams
                )

            fun ofAddVoidCreditLedgerEntryRequestParams(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addVoidCreditLedgerEntryRequestParams = addVoidCreditLedgerEntryRequestParams
                )

            fun ofAddAmendmentCreditLedgerEntryRequestParams(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addAmendmentCreditLedgerEntryRequestParams =
                        addAmendmentCreditLedgerEntryRequestParams
                )
        }

        interface Visitor<out T> {

            fun visitAddIncrementCreditLedgerEntryRequestParams(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ): T

            fun visitAddDecrementCreditLedgerEntryRequestParams(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ): T

            fun visitAddExpirationChangeCreditLedgerEntryRequestParams(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ): T

            fun visitAddVoidCreditLedgerEntryRequestParams(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ): T

            fun visitAddAmendmentCreditLedgerEntryRequestParams(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown CustomerCreditLedgerCreateEntryBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<CustomerCreditLedgerCreateEntryBody>(
                CustomerCreditLedgerCreateEntryBody::class
            ) {

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): CustomerCreditLedgerCreateEntryBody {
                val json = JsonValue.fromJsonNode(node)
                val entryType = json.asObject()?.get("entry_type")?.asString()

                when (entryType) {
                    "increment" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddIncrementCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryBody(
                                    addIncrementCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "decrement" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddDecrementCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryBody(
                                    addDecrementCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "expiration_change" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddExpirationChangeCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryBody(
                                    addExpirationChangeCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "void" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddVoidCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryBody(
                                    addVoidCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "amendment" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddAmendmentCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryBody(
                                    addAmendmentCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                }

                return CustomerCreditLedgerCreateEntryBody(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<CustomerCreditLedgerCreateEntryBody>(
                CustomerCreditLedgerCreateEntryBody::class
            ) {

            override fun serialize(
                value: CustomerCreditLedgerCreateEntryBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.addIncrementCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addIncrementCreditLedgerEntryRequestParams)
                    value.addDecrementCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addDecrementCreditLedgerEntryRequestParams)
                    value.addExpirationChangeCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(
                            value.addExpirationChangeCreditLedgerEntryRequestParams
                        )
                    value.addVoidCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addVoidCreditLedgerEntryRequestParams)
                    value.addAmendmentCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addAmendmentCreditLedgerEntryRequestParams)
                    value._json != null -> generator.writeObject(value._json)
                    else ->
                        throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryBody")
                }
            }
        }
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryParams && this.customerId == other.customerId && this.addIncrementCreditLedgerEntryRequestParams == other.addIncrementCreditLedgerEntryRequestParams && this.addDecrementCreditLedgerEntryRequestParams == other.addDecrementCreditLedgerEntryRequestParams && this.addExpirationChangeCreditLedgerEntryRequestParams == other.addExpirationChangeCreditLedgerEntryRequestParams && this.addVoidCreditLedgerEntryRequestParams == other.addVoidCreditLedgerEntryRequestParams && this.addAmendmentCreditLedgerEntryRequestParams == other.addAmendmentCreditLedgerEntryRequestParams && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, addIncrementCreditLedgerEntryRequestParams, addDecrementCreditLedgerEntryRequestParams, addExpirationChangeCreditLedgerEntryRequestParams, addVoidCreditLedgerEntryRequestParams, addAmendmentCreditLedgerEntryRequestParams, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditLedgerCreateEntryParams{customerId=$customerId, addIncrementCreditLedgerEntryRequestParams=$addIncrementCreditLedgerEntryRequestParams, addDecrementCreditLedgerEntryRequestParams=$addDecrementCreditLedgerEntryRequestParams, addExpirationChangeCreditLedgerEntryRequestParams=$addExpirationChangeCreditLedgerEntryRequestParams, addVoidCreditLedgerEntryRequestParams=$addVoidCreditLedgerEntryRequestParams, addAmendmentCreditLedgerEntryRequestParams=$addAmendmentCreditLedgerEntryRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var addIncrementCreditLedgerEntryRequestParams:
            AddIncrementCreditLedgerEntryRequestParams? =
            null
        private var addDecrementCreditLedgerEntryRequestParams:
            AddDecrementCreditLedgerEntryRequestParams? =
            null
        private var addExpirationChangeCreditLedgerEntryRequestParams:
            AddExpirationChangeCreditLedgerEntryRequestParams? =
            null
        private var addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams? =
            null
        private var addAmendmentCreditLedgerEntryRequestParams:
            AddAmendmentCreditLedgerEntryRequestParams? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerCreditLedgerCreateEntryParams: CustomerCreditLedgerCreateEntryParams
        ) = apply {
            this.customerId = customerCreditLedgerCreateEntryParams.customerId
            this.addIncrementCreditLedgerEntryRequestParams =
                customerCreditLedgerCreateEntryParams.addIncrementCreditLedgerEntryRequestParams
            this.addDecrementCreditLedgerEntryRequestParams =
                customerCreditLedgerCreateEntryParams.addDecrementCreditLedgerEntryRequestParams
            this.addExpirationChangeCreditLedgerEntryRequestParams =
                customerCreditLedgerCreateEntryParams
                    .addExpirationChangeCreditLedgerEntryRequestParams
            this.addVoidCreditLedgerEntryRequestParams =
                customerCreditLedgerCreateEntryParams.addVoidCreditLedgerEntryRequestParams
            this.addAmendmentCreditLedgerEntryRequestParams =
                customerCreditLedgerCreateEntryParams.addAmendmentCreditLedgerEntryRequestParams
            additionalHeaders(customerCreditLedgerCreateEntryParams.additionalHeaders)
            additionalQueryParams(customerCreditLedgerCreateEntryParams.additionalQueryParams)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun forAddIncrementCreditLedgerEntryRequestParams(
            addIncrementCreditLedgerEntryRequestParams: AddIncrementCreditLedgerEntryRequestParams
        ) = apply {
            this.addIncrementCreditLedgerEntryRequestParams =
                addIncrementCreditLedgerEntryRequestParams
            this.addDecrementCreditLedgerEntryRequestParams = null
            this.addExpirationChangeCreditLedgerEntryRequestParams = null
            this.addVoidCreditLedgerEntryRequestParams = null
            this.addAmendmentCreditLedgerEntryRequestParams = null
        }

        fun forAddDecrementCreditLedgerEntryRequestParams(
            addDecrementCreditLedgerEntryRequestParams: AddDecrementCreditLedgerEntryRequestParams
        ) = apply {
            this.addIncrementCreditLedgerEntryRequestParams = null
            this.addDecrementCreditLedgerEntryRequestParams =
                addDecrementCreditLedgerEntryRequestParams
            this.addExpirationChangeCreditLedgerEntryRequestParams = null
            this.addVoidCreditLedgerEntryRequestParams = null
            this.addAmendmentCreditLedgerEntryRequestParams = null
        }

        fun forAddExpirationChangeCreditLedgerEntryRequestParams(
            addExpirationChangeCreditLedgerEntryRequestParams:
                AddExpirationChangeCreditLedgerEntryRequestParams
        ) = apply {
            this.addIncrementCreditLedgerEntryRequestParams = null
            this.addDecrementCreditLedgerEntryRequestParams = null
            this.addExpirationChangeCreditLedgerEntryRequestParams =
                addExpirationChangeCreditLedgerEntryRequestParams
            this.addVoidCreditLedgerEntryRequestParams = null
            this.addAmendmentCreditLedgerEntryRequestParams = null
        }

        fun forAddVoidCreditLedgerEntryRequestParams(
            addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
        ) = apply {
            this.addIncrementCreditLedgerEntryRequestParams = null
            this.addDecrementCreditLedgerEntryRequestParams = null
            this.addExpirationChangeCreditLedgerEntryRequestParams = null
            this.addVoidCreditLedgerEntryRequestParams = addVoidCreditLedgerEntryRequestParams
            this.addAmendmentCreditLedgerEntryRequestParams = null
        }

        fun forAddAmendmentCreditLedgerEntryRequestParams(
            addAmendmentCreditLedgerEntryRequestParams: AddAmendmentCreditLedgerEntryRequestParams
        ) = apply {
            this.addIncrementCreditLedgerEntryRequestParams = null
            this.addDecrementCreditLedgerEntryRequestParams = null
            this.addExpirationChangeCreditLedgerEntryRequestParams = null
            this.addVoidCreditLedgerEntryRequestParams = null
            this.addAmendmentCreditLedgerEntryRequestParams =
                addAmendmentCreditLedgerEntryRequestParams
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

        fun build(): CustomerCreditLedgerCreateEntryParams =
            CustomerCreditLedgerCreateEntryParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                addIncrementCreditLedgerEntryRequestParams,
                addDecrementCreditLedgerEntryRequestParams,
                addExpirationChangeCreditLedgerEntryRequestParams,
                addVoidCreditLedgerEntryRequestParams,
                addAmendmentCreditLedgerEntryRequestParams,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = AddIncrementCreditLedgerEntryRequestParams.Builder::class)
    @NoAutoDetect
    class AddIncrementCreditLedgerEntryRequestParams
    private constructor(
        private val metadata: Metadata?,
        private val currency: String?,
        private val description: String?,
        private val entryType: EntryType?,
        private val amount: Double?,
        private val expiryDate: OffsetDateTime?,
        private val effectiveDate: OffsetDateTime?,
        private val perUnitCostBasis: String?,
        private val invoiceSettings: InvoiceSettings?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("entry_type") fun entryType(): EntryType? = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** An ISO 8601 format date that denotes when this credit balance should expire. */
        @JsonProperty("expiry_date") fun expiryDate(): OffsetDateTime? = expiryDate

        /**
         * An ISO 8601 format date that denotes when this credit balance should become available for
         * use.
         */
        @JsonProperty("effective_date") fun effectiveDate(): OffsetDateTime? = effectiveDate

        /**
         * Can only be specified when entry_type=increment. How much, in the customer's currency, a
         * customer paid for a single credit in this block
         */
        @JsonProperty("per_unit_cost_basis") fun perUnitCostBasis(): String? = perUnitCostBasis

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        @JsonProperty("invoice_settings") fun invoiceSettings(): InvoiceSettings? = invoiceSettings

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var expiryDate: OffsetDateTime? = null
            private var effectiveDate: OffsetDateTime? = null
            private var perUnitCostBasis: String? = null
            private var invoiceSettings: InvoiceSettings? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) = apply {
                this.metadata = addIncrementCreditLedgerEntryRequestParams.metadata
                this.currency = addIncrementCreditLedgerEntryRequestParams.currency
                this.description = addIncrementCreditLedgerEntryRequestParams.description
                this.entryType = addIncrementCreditLedgerEntryRequestParams.entryType
                this.amount = addIncrementCreditLedgerEntryRequestParams.amount
                this.expiryDate = addIncrementCreditLedgerEntryRequestParams.expiryDate
                this.effectiveDate = addIncrementCreditLedgerEntryRequestParams.effectiveDate
                this.perUnitCostBasis = addIncrementCreditLedgerEntryRequestParams.perUnitCostBasis
                this.invoiceSettings = addIncrementCreditLedgerEntryRequestParams.invoiceSettings
                additionalProperties(
                    addIncrementCreditLedgerEntryRequestParams.additionalProperties
                )
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("entry_type")
            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** An ISO 8601 format date that denotes when this credit balance should expire. */
            @JsonProperty("expiry_date")
            fun expiryDate(expiryDate: OffsetDateTime) = apply { this.expiryDate = expiryDate }

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: OffsetDateTime) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             */
            @JsonProperty("per_unit_cost_basis")
            fun perUnitCostBasis(perUnitCostBasis: String) = apply {
                this.perUnitCostBasis = perUnitCostBasis
            }

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            @JsonProperty("invoice_settings")
            fun invoiceSettings(invoiceSettings: InvoiceSettings) = apply {
                this.invoiceSettings = invoiceSettings
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

            fun build(): AddIncrementCreditLedgerEntryRequestParams =
                AddIncrementCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    expiryDate,
                    effectiveDate,
                    perUnitCostBasis,
                    invoiceSettings,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val INCREMENT = EntryType(JsonField.of("increment"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                INCREMENT,
            }

            enum class Value {
                INCREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCREMENT -> Value.INCREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCREMENT -> Known.INCREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        @JsonDeserialize(builder = InvoiceSettings.Builder::class)
        @NoAutoDetect
        class InvoiceSettings
        private constructor(
            private val autoCollection: Boolean?,
            private val netTerms: Long?,
            private val memo: String?,
            private val requireSuccessfulPayment: Boolean?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            @JsonProperty("auto_collection") fun autoCollection(): Boolean? = autoCollection

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            @JsonProperty("net_terms") fun netTerms(): Long? = netTerms

            /** An optional memo to display on the invoice. */
            @JsonProperty("memo") fun memo(): String? = memo

            /**
             * If true, the new credit block will require that the corresponding invoice is paid
             * before it can be drawn down from.
             */
            @JsonProperty("require_successful_payment")
            fun requireSuccessfulPayment(): Boolean? = requireSuccessfulPayment

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var autoCollection: Boolean? = null
                private var netTerms: Long? = null
                private var memo: String? = null
                private var requireSuccessfulPayment: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoiceSettings: InvoiceSettings) = apply {
                    this.autoCollection = invoiceSettings.autoCollection
                    this.netTerms = invoiceSettings.netTerms
                    this.memo = invoiceSettings.memo
                    this.requireSuccessfulPayment = invoiceSettings.requireSuccessfulPayment
                    additionalProperties(invoiceSettings.additionalProperties)
                }

                /**
                 * Whether the credits purchase invoice should auto collect with the customer's
                 * saved payment method.
                 */
                @JsonProperty("auto_collection")
                fun autoCollection(autoCollection: Boolean) = apply {
                    this.autoCollection = autoCollection
                }

                /**
                 * The net terms determines the difference between the invoice date and the issue
                 * date for the invoice. If you intend the invoice to be due on issue, set this
                 * to 0.
                 */
                @JsonProperty("net_terms")
                fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

                /** An optional memo to display on the invoice. */
                @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

                /**
                 * If true, the new credit block will require that the corresponding invoice is paid
                 * before it can be drawn down from.
                 */
                @JsonProperty("require_successful_payment")
                fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) = apply {
                    this.requireSuccessfulPayment = requireSuccessfulPayment
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoiceSettings =
                    InvoiceSettings(
                        checkNotNull(autoCollection) {
                            "`autoCollection` is required but was not set"
                        },
                        checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                        memo,
                        requireSuccessfulPayment,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSettings && this.autoCollection == other.autoCollection && this.netTerms == other.netTerms && this.memo == other.memo && this.requireSuccessfulPayment == other.requireSuccessfulPayment && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(autoCollection, netTerms, memo, requireSuccessfulPayment, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddIncrementCreditLedgerEntryRequestParams && this.metadata == other.metadata && this.currency == other.currency && this.description == other.description && this.entryType == other.entryType && this.amount == other.amount && this.expiryDate == other.expiryDate && this.effectiveDate == other.effectiveDate && this.perUnitCostBasis == other.perUnitCostBasis && this.invoiceSettings == other.invoiceSettings && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, currency, description, entryType, amount, expiryDate, effectiveDate, perUnitCostBasis, invoiceSettings, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddIncrementCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, expiryDate=$expiryDate, effectiveDate=$effectiveDate, perUnitCostBasis=$perUnitCostBasis, invoiceSettings=$invoiceSettings, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = AddDecrementCreditLedgerEntryRequestParams.Builder::class)
    @NoAutoDetect
    class AddDecrementCreditLedgerEntryRequestParams
    private constructor(
        private val metadata: Metadata?,
        private val currency: String?,
        private val description: String?,
        private val entryType: EntryType?,
        private val amount: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("entry_type") fun entryType(): EntryType? = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) = apply {
                this.metadata = addDecrementCreditLedgerEntryRequestParams.metadata
                this.currency = addDecrementCreditLedgerEntryRequestParams.currency
                this.description = addDecrementCreditLedgerEntryRequestParams.description
                this.entryType = addDecrementCreditLedgerEntryRequestParams.entryType
                this.amount = addDecrementCreditLedgerEntryRequestParams.amount
                additionalProperties(
                    addDecrementCreditLedgerEntryRequestParams.additionalProperties
                )
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("entry_type")
            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

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

            fun build(): AddDecrementCreditLedgerEntryRequestParams =
                AddDecrementCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val DECREMENT = EntryType(JsonField.of("decrement"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                DECREMENT,
            }

            enum class Value {
                DECREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DECREMENT -> Value.DECREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DECREMENT -> Known.DECREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddDecrementCreditLedgerEntryRequestParams && this.metadata == other.metadata && this.currency == other.currency && this.description == other.description && this.entryType == other.entryType && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, currency, description, entryType, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddDecrementCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = AddExpirationChangeCreditLedgerEntryRequestParams.Builder::class)
    @NoAutoDetect
    class AddExpirationChangeCreditLedgerEntryRequestParams
    private constructor(
        private val metadata: Metadata?,
        private val currency: String?,
        private val description: String?,
        private val entryType: EntryType?,
        private val amount: Double?,
        private val expiryDate: OffsetDateTime?,
        private val blockId: String?,
        private val targetExpiryDate: LocalDate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("entry_type") fun entryType(): EntryType? = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** An ISO 8601 format date that identifies the origination credit block to expire */
        @JsonProperty("expiry_date") fun expiryDate(): OffsetDateTime? = expiryDate

        /**
         * The ID of the block affected by an expiration_change, used to differentiate between
         * multiple blocks with the same `expiry_date`.
         */
        @JsonProperty("block_id") fun blockId(): String? = blockId

        /**
         * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting when
         * credits transferred (as part of a partial block expiration) should expire.
         */
        @JsonProperty("target_expiry_date") fun targetExpiryDate(): LocalDate? = targetExpiryDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var expiryDate: OffsetDateTime? = null
            private var blockId: String? = null
            private var targetExpiryDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) = apply {
                this.metadata = addExpirationChangeCreditLedgerEntryRequestParams.metadata
                this.currency = addExpirationChangeCreditLedgerEntryRequestParams.currency
                this.description = addExpirationChangeCreditLedgerEntryRequestParams.description
                this.entryType = addExpirationChangeCreditLedgerEntryRequestParams.entryType
                this.amount = addExpirationChangeCreditLedgerEntryRequestParams.amount
                this.expiryDate = addExpirationChangeCreditLedgerEntryRequestParams.expiryDate
                this.blockId = addExpirationChangeCreditLedgerEntryRequestParams.blockId
                this.targetExpiryDate =
                    addExpirationChangeCreditLedgerEntryRequestParams.targetExpiryDate
                additionalProperties(
                    addExpirationChangeCreditLedgerEntryRequestParams.additionalProperties
                )
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("entry_type")
            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** An ISO 8601 format date that identifies the origination credit block to expire */
            @JsonProperty("expiry_date")
            fun expiryDate(expiryDate: OffsetDateTime) = apply { this.expiryDate = expiryDate }

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             */
            @JsonProperty("block_id")
            fun blockId(blockId: String) = apply { this.blockId = blockId }

            /**
             * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting
             * when credits transferred (as part of a partial block expiration) should expire.
             */
            @JsonProperty("target_expiry_date")
            fun targetExpiryDate(targetExpiryDate: LocalDate) = apply {
                this.targetExpiryDate = targetExpiryDate
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

            fun build(): AddExpirationChangeCreditLedgerEntryRequestParams =
                AddExpirationChangeCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    amount,
                    expiryDate,
                    blockId,
                    checkNotNull(targetExpiryDate) {
                        "`targetExpiryDate` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EXPIRATION_CHANGE = EntryType(JsonField.of("expiration_change"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                EXPIRATION_CHANGE,
            }

            enum class Value {
                EXPIRATION_CHANGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddExpirationChangeCreditLedgerEntryRequestParams && this.metadata == other.metadata && this.currency == other.currency && this.description == other.description && this.entryType == other.entryType && this.amount == other.amount && this.expiryDate == other.expiryDate && this.blockId == other.blockId && this.targetExpiryDate == other.targetExpiryDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, currency, description, entryType, amount, expiryDate, blockId, targetExpiryDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddExpirationChangeCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, expiryDate=$expiryDate, blockId=$blockId, targetExpiryDate=$targetExpiryDate, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = AddVoidCreditLedgerEntryRequestParams.Builder::class)
    @NoAutoDetect
    class AddVoidCreditLedgerEntryRequestParams
    private constructor(
        private val metadata: Metadata?,
        private val currency: String?,
        private val description: String?,
        private val entryType: EntryType?,
        private val blockId: String?,
        private val voidReason: VoidReason?,
        private val amount: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("entry_type") fun entryType(): EntryType? = entryType

        /** The ID of the block to void. */
        @JsonProperty("block_id") fun blockId(): String? = blockId

        /** Can only be specified when `entry_type=void`. The reason for the void. */
        @JsonProperty("void_reason") fun voidReason(): VoidReason? = voidReason

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var blockId: String? = null
            private var voidReason: VoidReason? = null
            private var amount: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) = apply {
                this.metadata = addVoidCreditLedgerEntryRequestParams.metadata
                this.currency = addVoidCreditLedgerEntryRequestParams.currency
                this.description = addVoidCreditLedgerEntryRequestParams.description
                this.entryType = addVoidCreditLedgerEntryRequestParams.entryType
                this.blockId = addVoidCreditLedgerEntryRequestParams.blockId
                this.voidReason = addVoidCreditLedgerEntryRequestParams.voidReason
                this.amount = addVoidCreditLedgerEntryRequestParams.amount
                additionalProperties(addVoidCreditLedgerEntryRequestParams.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("entry_type")
            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /** The ID of the block to void. */
            @JsonProperty("block_id")
            fun blockId(blockId: String) = apply { this.blockId = blockId }

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            @JsonProperty("void_reason")
            fun voidReason(voidReason: VoidReason) = apply { this.voidReason = voidReason }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

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

            fun build(): AddVoidCreditLedgerEntryRequestParams =
                AddVoidCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(blockId) { "`blockId` is required but was not set" },
                    voidReason,
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val VOID = EntryType(JsonField.of("void"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                VOID,
            }

            enum class Value {
                VOID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    VOID -> Value.VOID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    VOID -> Known.VOID
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class VoidReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VoidReason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val REFUND = VoidReason(JsonField.of("refund"))

                fun of(value: String) = VoidReason(JsonField.of(value))
            }

            enum class Known {
                REFUND,
            }

            enum class Value {
                REFUND,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    REFUND -> Value.REFUND
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    REFUND -> Known.REFUND
                    else -> throw OrbInvalidDataException("Unknown VoidReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddVoidCreditLedgerEntryRequestParams && this.metadata == other.metadata && this.currency == other.currency && this.description == other.description && this.entryType == other.entryType && this.blockId == other.blockId && this.voidReason == other.voidReason && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, currency, description, entryType, blockId, voidReason, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddVoidCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, blockId=$blockId, voidReason=$voidReason, amount=$amount, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = AddAmendmentCreditLedgerEntryRequestParams.Builder::class)
    @NoAutoDetect
    class AddAmendmentCreditLedgerEntryRequestParams
    private constructor(
        private val metadata: Metadata?,
        private val currency: String?,
        private val description: String?,
        private val entryType: EntryType?,
        private val amount: Double?,
        private val blockId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("entry_type") fun entryType(): EntryType? = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement or
         * void operations.
         */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** The ID of the block to reverse a decrement from. */
        @JsonProperty("block_id") fun blockId(): String? = blockId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var blockId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) = apply {
                this.metadata = addAmendmentCreditLedgerEntryRequestParams.metadata
                this.currency = addAmendmentCreditLedgerEntryRequestParams.currency
                this.description = addAmendmentCreditLedgerEntryRequestParams.description
                this.entryType = addAmendmentCreditLedgerEntryRequestParams.entryType
                this.amount = addAmendmentCreditLedgerEntryRequestParams.amount
                this.blockId = addAmendmentCreditLedgerEntryRequestParams.blockId
                additionalProperties(
                    addAmendmentCreditLedgerEntryRequestParams.additionalProperties
                )
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("entry_type")
            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement
             * or void operations.
             */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** The ID of the block to reverse a decrement from. */
            @JsonProperty("block_id")
            fun blockId(blockId: String) = apply { this.blockId = blockId }

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

            fun build(): AddAmendmentCreditLedgerEntryRequestParams =
                AddAmendmentCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(blockId) { "`blockId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val AMENDMENT = EntryType(JsonField.of("amendment"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                AMENDMENT,
            }

            enum class Value {
                AMENDMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AMENDMENT -> Value.AMENDMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AMENDMENT -> Known.AMENDMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddAmendmentCreditLedgerEntryRequestParams && this.metadata == other.metadata && this.currency == other.currency && this.description == other.description && this.entryType == other.entryType && this.amount == other.amount && this.blockId == other.blockId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, currency, description, entryType, amount, blockId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddAmendmentCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, blockId=$blockId, additionalProperties=$additionalProperties}"
    }
}
