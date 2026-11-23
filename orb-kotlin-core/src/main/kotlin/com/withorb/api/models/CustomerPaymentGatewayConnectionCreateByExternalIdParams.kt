// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint maps the customer to a payment gateway connection. Orb charges the customer for a
 * billing entity's invoices through the customer's first mapping for that billing entity;
 * `is_default` moves that to this mapping when the customer already has one.
 */
class CustomerPaymentGatewayConnectionCreateByExternalIdParams
private constructor(
    private val externalCustomerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String? = externalCustomerId

    /**
     * The ID of the payment gateway connection to map the customer to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentGatewayConnectionId(): String = body.paymentGatewayConnectionId()

    /**
     * Whether Orb charges the customer for the billing entity's invoices through this mapping. The
     * customer's first mapping for a billing entity is the default regardless.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isDefault(): Boolean? = body.isDefault()

    /**
     * The ID of the customer in the external payment provider.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun providerCustomerId(): String? = body.providerCustomerId()

    /**
     * Returns the raw JSON value of [paymentGatewayConnectionId].
     *
     * Unlike [paymentGatewayConnectionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _paymentGatewayConnectionId(): JsonField<String> = body._paymentGatewayConnectionId()

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isDefault(): JsonField<Boolean> = body._isDefault()

    /**
     * Returns the raw JSON value of [providerCustomerId].
     *
     * Unlike [providerCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _providerCustomerId(): JsonField<String> = body._providerCustomerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerPaymentGatewayConnectionCreateByExternalIdParams].
         *
         * The following fields are required:
         * ```kotlin
         * .paymentGatewayConnectionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerPaymentGatewayConnectionCreateByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerPaymentGatewayConnectionCreateByExternalIdParams:
                CustomerPaymentGatewayConnectionCreateByExternalIdParams
        ) = apply {
            externalCustomerId =
                customerPaymentGatewayConnectionCreateByExternalIdParams.externalCustomerId
            body = customerPaymentGatewayConnectionCreateByExternalIdParams.body.toBuilder()
            additionalHeaders =
                customerPaymentGatewayConnectionCreateByExternalIdParams.additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                customerPaymentGatewayConnectionCreateByExternalIdParams.additionalQueryParams
                    .toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [paymentGatewayConnectionId]
         * - [isDefault]
         * - [providerCustomerId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the payment gateway connection to map the customer to. */
        fun paymentGatewayConnectionId(paymentGatewayConnectionId: String) = apply {
            body.paymentGatewayConnectionId(paymentGatewayConnectionId)
        }

        /**
         * Sets [Builder.paymentGatewayConnectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGatewayConnectionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentGatewayConnectionId(paymentGatewayConnectionId: JsonField<String>) = apply {
            body.paymentGatewayConnectionId(paymentGatewayConnectionId)
        }

        /**
         * Whether Orb charges the customer for the billing entity's invoices through this mapping.
         * The customer's first mapping for a billing entity is the default regardless.
         */
        fun isDefault(isDefault: Boolean) = apply { body.isDefault(isDefault) }

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { body.isDefault(isDefault) }

        /** The ID of the customer in the external payment provider. */
        fun providerCustomerId(providerCustomerId: String?) = apply {
            body.providerCustomerId(providerCustomerId)
        }

        /**
         * Sets [Builder.providerCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerCustomerId(providerCustomerId: JsonField<String>) = apply {
            body.providerCustomerId(providerCustomerId)
        }

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

        /**
         * Returns an immutable instance of
         * [CustomerPaymentGatewayConnectionCreateByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .paymentGatewayConnectionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerPaymentGatewayConnectionCreateByExternalIdParams =
            CustomerPaymentGatewayConnectionCreateByExternalIdParams(
                externalCustomerId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentGatewayConnectionId: JsonField<String>,
        private val isDefault: JsonField<Boolean>,
        private val providerCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_gateway_connection_id")
            @ExcludeMissing
            paymentGatewayConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_default")
            @ExcludeMissing
            isDefault: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("provider_customer_id")
            @ExcludeMissing
            providerCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(paymentGatewayConnectionId, isDefault, providerCustomerId, mutableMapOf())

        /**
         * The ID of the payment gateway connection to map the customer to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentGatewayConnectionId(): String =
            paymentGatewayConnectionId.getRequired("payment_gateway_connection_id")

        /**
         * Whether Orb charges the customer for the billing entity's invoices through this mapping.
         * The customer's first mapping for a billing entity is the default regardless.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isDefault(): Boolean? = isDefault.getNullable("is_default")

        /**
         * The ID of the customer in the external payment provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerCustomerId(): String? = providerCustomerId.getNullable("provider_customer_id")

        /**
         * Returns the raw JSON value of [paymentGatewayConnectionId].
         *
         * Unlike [paymentGatewayConnectionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_gateway_connection_id")
        @ExcludeMissing
        fun _paymentGatewayConnectionId(): JsonField<String> = paymentGatewayConnectionId

        /**
         * Returns the raw JSON value of [isDefault].
         *
         * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

        /**
         * Returns the raw JSON value of [providerCustomerId].
         *
         * Unlike [providerCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provider_customer_id")
        @ExcludeMissing
        fun _providerCustomerId(): JsonField<String> = providerCustomerId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .paymentGatewayConnectionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var paymentGatewayConnectionId: JsonField<String>? = null
            private var isDefault: JsonField<Boolean> = JsonMissing.of()
            private var providerCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                paymentGatewayConnectionId = body.paymentGatewayConnectionId
                isDefault = body.isDefault
                providerCustomerId = body.providerCustomerId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the payment gateway connection to map the customer to. */
            fun paymentGatewayConnectionId(paymentGatewayConnectionId: String) =
                paymentGatewayConnectionId(JsonField.of(paymentGatewayConnectionId))

            /**
             * Sets [Builder.paymentGatewayConnectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentGatewayConnectionId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentGatewayConnectionId(paymentGatewayConnectionId: JsonField<String>) = apply {
                this.paymentGatewayConnectionId = paymentGatewayConnectionId
            }

            /**
             * Whether Orb charges the customer for the billing entity's invoices through this
             * mapping. The customer's first mapping for a billing entity is the default regardless.
             */
            fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

            /**
             * Sets [Builder.isDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

            /** The ID of the customer in the external payment provider. */
            fun providerCustomerId(providerCustomerId: String?) =
                providerCustomerId(JsonField.ofNullable(providerCustomerId))

            /**
             * Sets [Builder.providerCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerCustomerId(providerCustomerId: JsonField<String>) = apply {
                this.providerCustomerId = providerCustomerId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .paymentGatewayConnectionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("paymentGatewayConnectionId", paymentGatewayConnectionId),
                    isDefault,
                    providerCustomerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            paymentGatewayConnectionId()
            isDefault()
            providerCustomerId()
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
            (if (paymentGatewayConnectionId.asKnown() == null) 0 else 1) +
                (if (isDefault.asKnown() == null) 0 else 1) +
                (if (providerCustomerId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                paymentGatewayConnectionId == other.paymentGatewayConnectionId &&
                isDefault == other.isDefault &&
                providerCustomerId == other.providerCustomerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                paymentGatewayConnectionId,
                isDefault,
                providerCustomerId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{paymentGatewayConnectionId=$paymentGatewayConnectionId, isDefault=$isDefault, providerCustomerId=$providerCustomerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerPaymentGatewayConnectionCreateByExternalIdParams &&
            externalCustomerId == other.externalCustomerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalCustomerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerPaymentGatewayConnectionCreateByExternalIdParams{externalCustomerId=$externalCustomerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
