// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.async.account.BillingEntityServiceAsync
import com.withorb.api.services.async.account.BillingEntityServiceAsyncImpl
import com.withorb.api.services.async.account.PaymentGatewayConnectionServiceAsync
import com.withorb.api.services.async.account.PaymentGatewayConnectionServiceAsyncImpl

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingEntities: BillingEntityServiceAsync by lazy {
        BillingEntityServiceAsyncImpl(clientOptions)
    }

    private val paymentGatewayConnections: PaymentGatewayConnectionServiceAsync by lazy {
        PaymentGatewayConnectionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * A billing entity is a legal entity an account invoices from, with its own legal name, address
     * and tax registrations.
     */
    override fun billingEntities(): BillingEntityServiceAsync = billingEntities

    /**
     * A payment gateway connection is one Stripe account or one Adyen merchant account that a
     * billing entity collects payments through.
     */
    override fun paymentGatewayConnections(): PaymentGatewayConnectionServiceAsync =
        paymentGatewayConnections

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val billingEntities: BillingEntityServiceAsync.WithRawResponse by lazy {
            BillingEntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val paymentGatewayConnections:
            PaymentGatewayConnectionServiceAsync.WithRawResponse by lazy {
            PaymentGatewayConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * A billing entity is a legal entity an account invoices from, with its own legal name,
         * address and tax registrations.
         */
        override fun billingEntities(): BillingEntityServiceAsync.WithRawResponse = billingEntities

        /**
         * A payment gateway connection is one Stripe account or one Adyen merchant account that a
         * billing entity collects payments through.
         */
        override fun paymentGatewayConnections():
            PaymentGatewayConnectionServiceAsync.WithRawResponse = paymentGatewayConnections
    }
}
