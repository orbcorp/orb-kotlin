// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint returns the customer's mappings to payment gateway connections, for example the
 * customer's Stripe ID in each connected Stripe account. A customer has at most one mapping per
 * connection, so the list is not paginated.
 */
class CustomerPaymentGatewayConnectionListByExternalIdParams
private constructor(
    private val externalCustomerId: String?,
    private val billingEntityId: String?,
    private val paymentGatewayConnectionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String? = externalCustomerId

    /** Only return mappings to this billing entity's connections. */
    fun billingEntityId(): String? = billingEntityId

    /** Only return the mapping to this connection. */
    fun paymentGatewayConnectionId(): String? = paymentGatewayConnectionId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CustomerPaymentGatewayConnectionListByExternalIdParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerPaymentGatewayConnectionListByExternalIdParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerPaymentGatewayConnectionListByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var billingEntityId: String? = null
        private var paymentGatewayConnectionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerPaymentGatewayConnectionListByExternalIdParams:
                CustomerPaymentGatewayConnectionListByExternalIdParams
        ) = apply {
            externalCustomerId =
                customerPaymentGatewayConnectionListByExternalIdParams.externalCustomerId
            billingEntityId = customerPaymentGatewayConnectionListByExternalIdParams.billingEntityId
            paymentGatewayConnectionId =
                customerPaymentGatewayConnectionListByExternalIdParams.paymentGatewayConnectionId
            additionalHeaders =
                customerPaymentGatewayConnectionListByExternalIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerPaymentGatewayConnectionListByExternalIdParams.additionalQueryParams
                    .toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** Only return mappings to this billing entity's connections. */
        fun billingEntityId(billingEntityId: String?) = apply {
            this.billingEntityId = billingEntityId
        }

        /** Only return the mapping to this connection. */
        fun paymentGatewayConnectionId(paymentGatewayConnectionId: String?) = apply {
            this.paymentGatewayConnectionId = paymentGatewayConnectionId
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
         * [CustomerPaymentGatewayConnectionListByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerPaymentGatewayConnectionListByExternalIdParams =
            CustomerPaymentGatewayConnectionListByExternalIdParams(
                externalCustomerId,
                billingEntityId,
                paymentGatewayConnectionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                billingEntityId?.let { put("billing_entity_id", it) }
                paymentGatewayConnectionId?.let { put("payment_gateway_connection_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerPaymentGatewayConnectionListByExternalIdParams &&
            externalCustomerId == other.externalCustomerId &&
            billingEntityId == other.billingEntityId &&
            paymentGatewayConnectionId == other.paymentGatewayConnectionId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalCustomerId,
            billingEntityId,
            paymentGatewayConnectionId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerPaymentGatewayConnectionListByExternalIdParams{externalCustomerId=$externalCustomerId, billingEntityId=$billingEntityId, paymentGatewayConnectionId=$paymentGatewayConnectionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
