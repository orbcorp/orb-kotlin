// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.async.account.BillingEntityServiceAsync
import com.withorb.api.services.async.account.PaymentGatewayConnectionServiceAsync

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /**
     * A billing entity is a legal entity an account invoices from, with its own legal name, address
     * and tax registrations.
     */
    fun billingEntities(): BillingEntityServiceAsync

    /**
     * A payment gateway connection is one Stripe account or one Adyen merchant account that a
     * billing entity collects payments through.
     */
    fun paymentGatewayConnections(): PaymentGatewayConnectionServiceAsync

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * A billing entity is a legal entity an account invoices from, with its own legal name,
         * address and tax registrations.
         */
        fun billingEntities(): BillingEntityServiceAsync.WithRawResponse

        /**
         * A payment gateway connection is one Stripe account or one Adyen merchant account that a
         * billing entity collects payments through.
         */
        fun paymentGatewayConnections(): PaymentGatewayConnectionServiceAsync.WithRawResponse
    }
}
