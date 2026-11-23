// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.AccountPaymentGatewayConnectionFetchParams
import com.withorb.api.models.AccountPaymentGatewayConnectionListPageAsync
import com.withorb.api.models.AccountPaymentGatewayConnectionListParams
import com.withorb.api.models.PaymentGatewayConnection

/**
 * A payment gateway connection is one Stripe account or one Adyen merchant account that a billing
 * entity collects payments through.
 */
interface PaymentGatewayConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentGatewayConnectionServiceAsync

    /**
     * This endpoint returns the account's payment gateway connections with the billing entity each
     * one collects for, ordered in descending order by creation time.
     */
    suspend fun list(
        params: AccountPaymentGatewayConnectionListParams =
            AccountPaymentGatewayConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPaymentGatewayConnectionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountPaymentGatewayConnectionListPageAsync =
        list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

    /** This endpoint returns a payment gateway connection identified by its ID. */
    suspend fun fetch(
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
    suspend fun fetch(
        params: AccountPaymentGatewayConnectionFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentGatewayConnection

    /** @see fetch */
    suspend fun fetch(
        paymentGatewayConnectionId: String,
        requestOptions: RequestOptions,
    ): PaymentGatewayConnection =
        fetch(
            paymentGatewayConnectionId,
            AccountPaymentGatewayConnectionFetchParams.none(),
            requestOptions,
        )

    /**
     * A view of [PaymentGatewayConnectionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentGatewayConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account/payment_gateway_connections`, but is
         * otherwise the same as [PaymentGatewayConnectionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountPaymentGatewayConnectionListParams =
                AccountPaymentGatewayConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync> =
            list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /account/payment_gateway_connections/{payment_gateway_connection_id}`, but is otherwise
         * the same as [PaymentGatewayConnectionServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
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
        suspend fun fetch(
            params: AccountPaymentGatewayConnectionFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentGatewayConnection>

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
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
