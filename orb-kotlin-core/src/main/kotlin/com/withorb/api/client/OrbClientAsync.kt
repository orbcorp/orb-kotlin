// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.services.async.AlertServiceAsync
import com.withorb.api.services.async.CouponServiceAsync
import com.withorb.api.services.async.CreditNoteServiceAsync
import com.withorb.api.services.async.CustomerServiceAsync
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import com.withorb.api.services.async.EventServiceAsync
import com.withorb.api.services.async.InvoiceLineItemServiceAsync
import com.withorb.api.services.async.InvoiceServiceAsync
import com.withorb.api.services.async.ItemServiceAsync
import com.withorb.api.services.async.MetricServiceAsync
import com.withorb.api.services.async.PlanServiceAsync
import com.withorb.api.services.async.PriceServiceAsync
import com.withorb.api.services.async.SubscriptionServiceAsync
import com.withorb.api.services.async.TopLevelServiceAsync

/**
 * A client for interacting with the Orb REST API asynchronously. You can also switch to synchronous
 * execution via the [sync] method.
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
interface OrbClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): OrbClient

    fun topLevel(): TopLevelServiceAsync

    fun coupons(): CouponServiceAsync

    fun creditNotes(): CreditNoteServiceAsync

    fun customers(): CustomerServiceAsync

    fun events(): EventServiceAsync

    fun invoiceLineItems(): InvoiceLineItemServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun items(): ItemServiceAsync

    fun metrics(): MetricServiceAsync

    fun plans(): PlanServiceAsync

    fun prices(): PriceServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    fun alerts(): AlertServiceAsync

    fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync

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
