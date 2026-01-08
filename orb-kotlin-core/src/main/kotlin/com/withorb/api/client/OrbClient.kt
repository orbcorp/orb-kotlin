// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.BetaService
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.services.blocking.CreditBlockService
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import com.withorb.api.services.blocking.EventService
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.services.blocking.InvoiceService
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.services.blocking.PriceService
import com.withorb.api.services.blocking.SubscriptionChangeService
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.TopLevelService
import com.withorb.api.services.blocking.WebhookService

/**
 * A client for interacting with the Orb REST API synchronously. You can also switch to asynchronous
 * execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface OrbClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): OrbClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient

    fun topLevel(): TopLevelService

    fun beta(): BetaService

    fun coupons(): CouponService

    fun creditNotes(): CreditNoteService

    fun customers(): CustomerService

    fun events(): EventService

    fun invoiceLineItems(): InvoiceLineItemService

    fun invoices(): InvoiceService

    fun items(): ItemService

    fun metrics(): MetricService

    fun plans(): PlanService

    fun prices(): PriceService

    fun subscriptions(): SubscriptionService

    fun alerts(): AlertService

    fun dimensionalPriceGroups(): DimensionalPriceGroupService

    fun subscriptionChanges(): SubscriptionChangeService

    fun webhooks(): WebhookService

    fun creditBlocks(): CreditBlockService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [OrbClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient.WithRawResponse

        fun topLevel(): TopLevelService.WithRawResponse

        fun beta(): BetaService.WithRawResponse

        fun coupons(): CouponService.WithRawResponse

        fun creditNotes(): CreditNoteService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun invoiceLineItems(): InvoiceLineItemService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun items(): ItemService.WithRawResponse

        fun metrics(): MetricService.WithRawResponse

        fun plans(): PlanService.WithRawResponse

        fun prices(): PriceService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun alerts(): AlertService.WithRawResponse

        fun dimensionalPriceGroups(): DimensionalPriceGroupService.WithRawResponse

        fun subscriptionChanges(): SubscriptionChangeService.WithRawResponse

        fun creditBlocks(): CreditBlockService.WithRawResponse
    }
}
