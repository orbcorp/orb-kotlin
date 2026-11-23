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
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint updates the customer's mapping to a payment gateway connection: the customer's ID
 * in that account, and whether Orb charges the customer for the billing entity's invoices through
 * it. Omitted fields keep their value.
 */
class CustomerPaymentGatewayConnectionUpdateByExternalIdParams
private constructor(
    private val externalCustomerId: String,
    private val paymentGatewayConnectionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String = externalCustomerId

    fun paymentGatewayConnectionId(): String? = paymentGatewayConnectionId

    /**
     * Only `true` is accepted: it makes this the customer's default mapping for the connection's
     * billing entity. Omit it to keep the current default. To move the default, set it on another
     * mapping.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isDefault(): IsDefault? = body.isDefault()

    /**
     * The ID of the customer in the external payment provider. Omit it to keep the current one;
     * `null` clears it, and Orb creates a Stripe customer at the next payment through this
     * connection.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun providerCustomerId(): String? = body.providerCustomerId()

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isDefault(): JsonField<IsDefault> = body._isDefault()

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
         * [CustomerPaymentGatewayConnectionUpdateByExternalIdParams].
         *
         * The following fields are required:
         * ```kotlin
         * .externalCustomerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerPaymentGatewayConnectionUpdateByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var paymentGatewayConnectionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerPaymentGatewayConnectionUpdateByExternalIdParams:
                CustomerPaymentGatewayConnectionUpdateByExternalIdParams
        ) = apply {
            externalCustomerId =
                customerPaymentGatewayConnectionUpdateByExternalIdParams.externalCustomerId
            paymentGatewayConnectionId =
                customerPaymentGatewayConnectionUpdateByExternalIdParams.paymentGatewayConnectionId
            body = customerPaymentGatewayConnectionUpdateByExternalIdParams.body.toBuilder()
            additionalHeaders =
                customerPaymentGatewayConnectionUpdateByExternalIdParams.additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                customerPaymentGatewayConnectionUpdateByExternalIdParams.additionalQueryParams
                    .toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun paymentGatewayConnectionId(paymentGatewayConnectionId: String?) = apply {
            this.paymentGatewayConnectionId = paymentGatewayConnectionId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [isDefault]
         * - [providerCustomerId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Only `true` is accepted: it makes this the customer's default mapping for the
         * connection's billing entity. Omit it to keep the current default. To move the default,
         * set it on another mapping.
         */
        fun isDefault(isDefault: IsDefault?) = apply { body.isDefault(isDefault) }

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [IsDefault] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<IsDefault>) = apply { body.isDefault(isDefault) }

        /**
         * The ID of the customer in the external payment provider. Omit it to keep the current one;
         * `null` clears it, and Orb creates a Stripe customer at the next payment through this
         * connection.
         */
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
         * [CustomerPaymentGatewayConnectionUpdateByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .externalCustomerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerPaymentGatewayConnectionUpdateByExternalIdParams =
            CustomerPaymentGatewayConnectionUpdateByExternalIdParams(
                checkRequired("externalCustomerId", externalCustomerId),
                paymentGatewayConnectionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId
            1 -> paymentGatewayConnectionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isDefault: JsonField<IsDefault>,
        private val providerCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_default")
            @ExcludeMissing
            isDefault: JsonField<IsDefault> = JsonMissing.of(),
            @JsonProperty("provider_customer_id")
            @ExcludeMissing
            providerCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(isDefault, providerCustomerId, mutableMapOf())

        /**
         * Only `true` is accepted: it makes this the customer's default mapping for the
         * connection's billing entity. Omit it to keep the current default. To move the default,
         * set it on another mapping.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isDefault(): IsDefault? = isDefault.getNullable("is_default")

        /**
         * The ID of the customer in the external payment provider. Omit it to keep the current one;
         * `null` clears it, and Orb creates a Stripe customer at the next payment through this
         * connection.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerCustomerId(): String? = providerCustomerId.getNullable("provider_customer_id")

        /**
         * Returns the raw JSON value of [isDefault].
         *
         * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_default")
        @ExcludeMissing
        fun _isDefault(): JsonField<IsDefault> = isDefault

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var isDefault: JsonField<IsDefault> = JsonMissing.of()
            private var providerCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                isDefault = body.isDefault
                providerCustomerId = body.providerCustomerId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Only `true` is accepted: it makes this the customer's default mapping for the
             * connection's billing entity. Omit it to keep the current default. To move the
             * default, set it on another mapping.
             */
            fun isDefault(isDefault: IsDefault?) = isDefault(JsonField.ofNullable(isDefault))

            /**
             * Sets [Builder.isDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDefault] with a well-typed [IsDefault] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDefault(isDefault: JsonField<IsDefault>) = apply { this.isDefault = isDefault }

            /**
             * The ID of the customer in the external payment provider. Omit it to keep the current
             * one; `null` clears it, and Orb creates a Stripe customer at the next payment through
             * this connection.
             */
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
             */
            fun build(): Body =
                Body(isDefault, providerCustomerId, additionalProperties.toMutableMap())
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

            isDefault()?.validate()
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
            (isDefault.asKnown()?.validity() ?: 0) +
                (if (providerCustomerId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                isDefault == other.isDefault &&
                providerCustomerId == other.providerCustomerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(isDefault, providerCustomerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{isDefault=$isDefault, providerCustomerId=$providerCustomerId, additionalProperties=$additionalProperties}"
    }

    /**
     * Only `true` is accepted: it makes this the customer's default mapping for the connection's
     * billing entity. Omit it to keep the current default. To move the default, set it on another
     * mapping.
     */
    class IsDefault @JsonCreator private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            val TRUE = of(true)

            fun of(value: Boolean) = IsDefault(JsonField.of(value))
        }

        /** An enum containing [IsDefault]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [IsDefault]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IsDefault] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [IsDefault] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw OrbInvalidDataException("Unknown IsDefault: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean() ?: throw OrbInvalidDataException("Value is not a Boolean")

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
        fun validate(): IsDefault = apply {
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

            return other is IsDefault && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerPaymentGatewayConnectionUpdateByExternalIdParams &&
            externalCustomerId == other.externalCustomerId &&
            paymentGatewayConnectionId == other.paymentGatewayConnectionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalCustomerId,
            paymentGatewayConnectionId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerPaymentGatewayConnectionUpdateByExternalIdParams{externalCustomerId=$externalCustomerId, paymentGatewayConnectionId=$paymentGatewayConnectionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
