// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.account

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.AccountPaymentGatewayConnectionFetchParams
import com.withorb.api.models.AccountPaymentGatewayConnectionListPage
import com.withorb.api.models.AccountPaymentGatewayConnectionListParams
import com.withorb.api.models.PaymentGatewayConnection

/**
 * A payment gateway connection is one Stripe account or one Adyen merchant account that a billing
 * entity collects payments through.
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
     * This endpoint returns the account's payment gateway connections with the billing entity each
     * one collects for, ordered in descending order by creation time.
     */
    fun list(
        params: AccountPaymentGatewayConnectionListParams =
            AccountPaymentGatewayConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPaymentGatewayConnectionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountPaymentGatewayConnectionListPage =
        list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

    /** This endpoint returns a payment gateway connection identified by its ID. */
    fun fetch(
        paymentGatewayConnectionId: String,
        params: AccountPaymentGatewayConnectionFetchParams =
            AccountPaymentGatewayConnectionFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentGatewayConnection =
        fetch(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see fetch */
    fun fetch(
        params: AccountPaymentGatewayConnectionFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentGatewayConnection

    /** @see fetch */
    fun fetch(
        paymentGatewayConnectionId: String,
        requestOptions: RequestOptions,
    ): PaymentGatewayConnection =
        fetch(
            paymentGatewayConnectionId,
            AccountPaymentGatewayConnectionFetchParams.none(),
            requestOptions,
        )

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
         * Returns a raw HTTP response for `get /account/payment_gateway_connections`, but is
         * otherwise the same as [PaymentGatewayConnectionService.list].
         */
        @MustBeClosed
        fun list(
            params: AccountPaymentGatewayConnectionListParams =
                AccountPaymentGatewayConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPaymentGatewayConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountPaymentGatewayConnectionListPage> =
            list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /account/payment_gateway_connections/{payment_gateway_connection_id}`, but is otherwise
         * the same as [PaymentGatewayConnectionService.fetch].
         */
        @MustBeClosed
        fun fetch(
            paymentGatewayConnectionId: String,
            params: AccountPaymentGatewayConnectionFetchParams =
                AccountPaymentGatewayConnectionFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentGatewayConnection> =
            fetch(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: AccountPaymentGatewayConnectionFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentGatewayConnection>

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            paymentGatewayConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentGatewayConnection> =
            fetch(
                paymentGatewayConnectionId,
                AccountPaymentGatewayConnectionFetchParams.none(),
                requestOptions,
            )
    }
}
