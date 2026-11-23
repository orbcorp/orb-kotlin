// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.blocking.account.BillingEntityService
import com.withorb.api.services.blocking.account.BillingEntityServiceImpl
import com.withorb.api.services.blocking.account.PaymentGatewayConnectionService
import com.withorb.api.services.blocking.account.PaymentGatewayConnectionServiceImpl

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingEntities: BillingEntityService by lazy {
        BillingEntityServiceImpl(clientOptions)
    }

    private val paymentGatewayConnections: PaymentGatewayConnectionService by lazy {
        PaymentGatewayConnectionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * A billing entity is a legal entity an account invoices from, with its own legal name, address
     * and tax registrations.
     */
    override fun billingEntities(): BillingEntityService = billingEntities

    /**
     * A payment gateway connection is one Stripe account or one Adyen merchant account that a
     * billing entity collects payments through.
     */
    override fun paymentGatewayConnections(): PaymentGatewayConnectionService =
        paymentGatewayConnections

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val billingEntities: BillingEntityService.WithRawResponse by lazy {
            BillingEntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val paymentGatewayConnections:
            PaymentGatewayConnectionService.WithRawResponse by lazy {
            PaymentGatewayConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * A billing entity is a legal entity an account invoices from, with its own legal name,
         * address and tax registrations.
         */
        override fun billingEntities(): BillingEntityService.WithRawResponse = billingEntities

        /**
         * A payment gateway connection is one Stripe account or one Adyen merchant account that a
         * billing entity collects payments through.
         */
        override fun paymentGatewayConnections(): PaymentGatewayConnectionService.WithRawResponse =
            paymentGatewayConnections
    }
}
