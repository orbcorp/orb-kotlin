// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.blocking.account.BillingEntityService
import com.withorb.api.services.blocking.account.PaymentGatewayConnectionService

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService

    /**
     * A billing entity is a legal entity an account invoices from, with its own legal name, address
     * and tax registrations.
     */
    fun billingEntities(): BillingEntityService

    /**
     * A payment gateway connection is one Stripe account or one Adyen merchant account that a
     * billing entity collects payments through.
     */
    fun paymentGatewayConnections(): PaymentGatewayConnectionService

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService.WithRawResponse

        /**
         * A billing entity is a legal entity an account invoices from, with its own legal name,
         * address and tax registrations.
         */
        fun billingEntities(): BillingEntityService.WithRawResponse

        /**
         * A payment gateway connection is one Stripe account or one Adyen merchant account that a
         * billing entity collects payments through.
         */
        fun paymentGatewayConnections(): PaymentGatewayConnectionService.WithRawResponse
    }
}
