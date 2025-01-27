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

interface OrbClientAsync {

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
