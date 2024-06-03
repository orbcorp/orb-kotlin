// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.*
import com.withorb.api.services.async.*
import com.withorb.api.services.errorHandler

class OrbClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrbClientAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val sync: OrbClient by lazy { OrbClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy { TopLevelServiceAsyncImpl(clientOptions) }

    private val coupons: CouponServiceAsync by lazy { CouponServiceAsyncImpl(clientOptions) }

    private val creditNotes: CreditNoteServiceAsync by lazy {
        CreditNoteServiceAsyncImpl(clientOptions)
    }

    private val customers: CustomerServiceAsync by lazy { CustomerServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val invoiceLineItems: InvoiceLineItemServiceAsync by lazy {
        InvoiceLineItemServiceAsyncImpl(clientOptions)
    }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptions) }

    private val metrics: MetricServiceAsync by lazy { MetricServiceAsyncImpl(clientOptions) }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val prices: PriceServiceAsync by lazy { PriceServiceAsyncImpl(clientOptions) }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val alerts: AlertServiceAsync by lazy { AlertServiceAsyncImpl(clientOptions) }

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
