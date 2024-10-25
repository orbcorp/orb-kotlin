// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.models.*
import com.withorb.api.services.async.*

class OrbClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrbClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OrbClient by lazy { OrbClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy {
        TopLevelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val coupons: CouponServiceAsync by lazy {
        CouponServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val creditNotes: CreditNoteServiceAsync by lazy {
        CreditNoteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerServiceAsync by lazy {
        CustomerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoiceLineItems: InvoiceLineItemServiceAsync by lazy {
        InvoiceLineItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val metrics: MetricServiceAsync by lazy {
        MetricServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val prices: PriceServiceAsync by lazy {
        PriceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val alerts: AlertServiceAsync by lazy {
        AlertServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OrbClient = sync

    override fun topLevel(): TopLevelServiceAsync = topLevel

    override fun coupons(): CouponServiceAsync = coupons

    override fun creditNotes(): CreditNoteServiceAsync = creditNotes

    override fun customers(): CustomerServiceAsync = customers

    override fun events(): EventServiceAsync = events

    override fun invoiceLineItems(): InvoiceLineItemServiceAsync = invoiceLineItems

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun items(): ItemServiceAsync = items

    override fun metrics(): MetricServiceAsync = metrics

    override fun plans(): PlanServiceAsync = plans

    override fun prices(): PriceServiceAsync = prices

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun alerts(): AlertServiceAsync = alerts
}
