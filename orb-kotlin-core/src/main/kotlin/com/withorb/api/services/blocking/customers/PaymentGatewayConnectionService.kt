// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerPaymentGatewayConnection
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionListParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateParams

/**
 * A customer is a buyer of your products, and the other party to the billing relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but it's often
 * desirable to have these match existing identifiers in your system. To avoid having to denormalize
 * Orb ID information, you can pass in an `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](/events-and-metrics/customer-aliases) for further information about how
 * these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a payment provider
 * solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum field to
 * express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
 * timezone. See [Timezone localization](/essentials/timezones) for information on what this
 * timezone parameter influences within Orb.
 */
interface PaymentGatewayConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentGatewayConnectionService

    /**
     * This endpoint maps the customer to a payment gateway connection. Orb charges the customer for
     * a billing entity's invoices through the customer's first mapping for that billing entity;
     * `is_default` moves that to this mapping when the customer already has one.
     */
    fun create(
        customerId: String,
        params: CustomerPaymentGatewayConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(
        params: CustomerPaymentGatewayConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * This endpoint updates the customer's mapping to a payment gateway connection: the customer's
     * ID in that account, and whether Orb charges the customer for the billing entity's invoices
     * through it. Omitted fields keep their value.
     */
    fun update(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        update(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: CustomerPaymentGatewayConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * This endpoint returns the customer's mappings to payment gateway connections, for example the
     * customer's Stripe ID in each connected Stripe account. A customer has at most one mapping per
     * connection, so the list is not paginated.
     */
    fun list(
        customerId: String,
        params: CustomerPaymentGatewayConnectionListParams =
            CustomerPaymentGatewayConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnectionListResponse =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        params: CustomerPaymentGatewayConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnectionListResponse

    /** @see list */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnectionListResponse =
        list(customerId, CustomerPaymentGatewayConnectionListParams.none(), requestOptions)

    /**
     * This endpoint removes the customer's mapping to a payment gateway connection and returns it.
     * Active subscriptions and unpaid invoices do not block it. If the mapping was the customer's
     * default for the billing entity, the customer's oldest remaining mapping on that entity
     * becomes the default. With no mapping left, the next charge goes through the billing entity's
     * default connection.
     */
    fun delete(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        delete(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        params: CustomerPaymentGatewayConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * This endpoint maps the customer to a payment gateway connection. Orb charges the customer for
     * a billing entity's invoices through the customer's first mapping for that billing entity;
     * `is_default` moves that to this mapping when the customer already has one.
     */
    fun createByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        createByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see createByExternalId */
    fun createByExternalId(
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * This endpoint removes the customer's mapping to a payment gateway connection and returns it.
     * Active subscriptions and unpaid invoices do not block it. If the mapping was the customer's
     * default for the billing entity, the customer's oldest remaining mapping on that entity
     * becomes the default. With no mapping left, the next charge goes through the billing entity's
     * default connection.
     */
    fun deleteByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        deleteByExternalId(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see deleteByExternalId */
    fun deleteByExternalId(
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * This endpoint returns the customer's mappings to payment gateway connections, for example the
     * customer's Stripe ID in each connected Stripe account. A customer has at most one mapping per
     * connection, so the list is not paginated.
     */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionListByExternalIdParams =
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnectionListByExternalIdResponse =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see listByExternalId */
    fun listByExternalId(
        params: CustomerPaymentGatewayConnectionListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnectionListByExternalIdResponse

    /** @see listByExternalId */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnectionListByExternalIdResponse =
        listByExternalId(
            externalCustomerId,
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint updates the customer's mapping to a payment gateway connection: the customer's
     * ID in that account, and whether Orb charges the customer for the billing entity's invoices
     * through it. Omitted fields keep their value.
     */
    fun updateByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection =
        updateByExternalId(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see updateByExternalId */
    fun updateByExternalId(
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPaymentGatewayConnection

    /**
     * A view of [PaymentGatewayConnectionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentGatewayConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /customers/{customer_id}/payment_gateway_connections`, but is otherwise the same as
         * [PaymentGatewayConnectionService.create].
         */
        @MustBeClosed
        fun create(
            customerId: String,
            params: CustomerPaymentGatewayConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerPaymentGatewayConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>

        /**
         * Returns a raw HTTP response for `put
         * /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionService.update].
         */
        @MustBeClosed
        fun update(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            update(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomerPaymentGatewayConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>

        /**
         * Returns a raw HTTP response for `get
         * /customers/{customer_id}/payment_gateway_connections`, but is otherwise the same as
         * [PaymentGatewayConnectionService.list].
         */
        @MustBeClosed
        fun list(
            customerId: String,
            params: CustomerPaymentGatewayConnectionListParams =
                CustomerPaymentGatewayConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListResponse> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerPaymentGatewayConnectionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListResponse> =
            list(customerId, CustomerPaymentGatewayConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionService.delete].
         */
        @MustBeClosed
        fun delete(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            delete(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomerPaymentGatewayConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections`, but
         * is otherwise the same as [PaymentGatewayConnectionService.createByExternalId].
         */
        @MustBeClosed
        fun createByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            createByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see createByExternalId */
        @MustBeClosed
        fun createByExternalId(
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionService.deleteByExternalId].
         */
        @MustBeClosed
        fun deleteByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            deleteByExternalId(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see deleteByExternalId */
        @MustBeClosed
        fun deleteByExternalId(
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections`, but
         * is otherwise the same as [PaymentGatewayConnectionService.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionListByExternalIdParams =
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see listByExternalId */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerPaymentGatewayConnectionListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>

        /** @see listByExternalId */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
            listByExternalId(
                externalCustomerId,
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionService.updateByExternalId].
         */
        @MustBeClosed
        fun updateByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection> =
            updateByExternalId(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see updateByExternalId */
        @MustBeClosed
        fun updateByExternalId(
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPaymentGatewayConnection>
    }
}
