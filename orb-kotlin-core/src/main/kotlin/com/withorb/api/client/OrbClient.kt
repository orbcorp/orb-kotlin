// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.CouponService
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
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.TopLevelService

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

    fun async(): OrbClientAsync

    fun topLevel(): TopLevelService

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
}
