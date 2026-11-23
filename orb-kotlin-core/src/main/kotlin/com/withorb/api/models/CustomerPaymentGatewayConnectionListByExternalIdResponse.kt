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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class CustomerPaymentGatewayConnectionListByExternalIdResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerId: JsonField<String>,
    private val paymentGatewayConnections: JsonField<List<CustomerPaymentGatewayConnection>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_gateway_connections")
        @ExcludeMissing
        paymentGatewayConnections: JsonField<List<CustomerPaymentGatewayConnection>> =
            JsonMissing.of(),
    ) : this(customerId, paymentGatewayConnections, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentGatewayConnections(): List<CustomerPaymentGatewayConnection> =
        paymentGatewayConnections.getRequired("payment_gateway_connections")

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [paymentGatewayConnections].
     *
     * Unlike [paymentGatewayConnections], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("payment_gateway_connections")
    @ExcludeMissing
    fun _paymentGatewayConnections(): JsonField<List<CustomerPaymentGatewayConnection>> =
        paymentGatewayConnections

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
         * Returns a mutable builder for constructing an instance of
         * [CustomerPaymentGatewayConnectionListByExternalIdResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .paymentGatewayConnections()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerPaymentGatewayConnectionListByExternalIdResponse]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var paymentGatewayConnections:
            JsonField<MutableList<CustomerPaymentGatewayConnection>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerPaymentGatewayConnectionListByExternalIdResponse:
                CustomerPaymentGatewayConnectionListByExternalIdResponse
        ) = apply {
            customerId = customerPaymentGatewayConnectionListByExternalIdResponse.customerId
            paymentGatewayConnections =
                customerPaymentGatewayConnectionListByExternalIdResponse.paymentGatewayConnections
                    .map { it.toMutableList() }
            additionalProperties =
                customerPaymentGatewayConnectionListByExternalIdResponse.additionalProperties
                    .toMutableMap()
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun paymentGatewayConnections(
            paymentGatewayConnections: List<CustomerPaymentGatewayConnection>
        ) = paymentGatewayConnections(JsonField.of(paymentGatewayConnections))

        /**
         * Sets [Builder.paymentGatewayConnections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGatewayConnections] with a well-typed
         * `List<CustomerPaymentGatewayConnection>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun paymentGatewayConnections(
            paymentGatewayConnections: JsonField<List<CustomerPaymentGatewayConnection>>
        ) = apply {
            this.paymentGatewayConnections = paymentGatewayConnections.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomerPaymentGatewayConnection] to [paymentGatewayConnections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentGatewayConnection(
            paymentGatewayConnection: CustomerPaymentGatewayConnection
        ) = apply {
            paymentGatewayConnections =
                (paymentGatewayConnections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentGatewayConnections", it).add(paymentGatewayConnection)
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
         * Returns an immutable instance of
         * [CustomerPaymentGatewayConnectionListByExternalIdResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .paymentGatewayConnections()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerPaymentGatewayConnectionListByExternalIdResponse =
            CustomerPaymentGatewayConnectionListByExternalIdResponse(
                checkRequired("customerId", customerId),
                checkRequired("paymentGatewayConnections", paymentGatewayConnections).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): CustomerPaymentGatewayConnectionListByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        customerId()
        paymentGatewayConnections().forEach { it.validate() }
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
        (if (customerId.asKnown() == null) 0 else 1) +
            (paymentGatewayConnections.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerPaymentGatewayConnectionListByExternalIdResponse &&
            customerId == other.customerId &&
            paymentGatewayConnections == other.paymentGatewayConnections &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customerId, paymentGatewayConnections, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerPaymentGatewayConnectionListByExternalIdResponse{customerId=$customerId, paymentGatewayConnections=$paymentGatewayConnections, additionalProperties=$additionalProperties}"
}
