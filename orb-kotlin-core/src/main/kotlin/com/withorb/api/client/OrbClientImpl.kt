// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.*
import com.withorb.api.services.blocking.*
import com.withorb.api.services.errorHandler

class OrbClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrbClient {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val async: OrbClientAsync by lazy { OrbClientAsyncImpl(clientOptions) }

    private val topLevel: TopLevelService by lazy { TopLevelServiceImpl(clientOptions) }

    private val coupons: CouponService by lazy { CouponServiceImpl(clientOptions) }

    private val creditNotes: CreditNoteService by lazy { CreditNoteServiceImpl(clientOptions) }

    private val customers: CustomerService by lazy { CustomerServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val invoiceLineItems: InvoiceLineItemService by lazy {
        InvoiceLineItemServiceImpl(clientOptions)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptions) }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptions) }

    private val metrics: MetricService by lazy { MetricServiceImpl(clientOptions) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val prices: PriceService by lazy { PriceServiceImpl(clientOptions) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    override fun async(): OrbClientAsync = async

    override fun topLevel(): TopLevelService = topLevel

    override fun coupons(): CouponService = coupons

    override fun creditNotes(): CreditNoteService = creditNotes

    override fun customers(): CustomerService = customers

    override fun events(): EventService = events

    override fun invoiceLineItems(): InvoiceLineItemService = invoiceLineItems

    override fun invoices(): InvoiceService = invoices

    override fun items(): ItemService = items

    override fun metrics(): MetricService = metrics

    override fun plans(): PlanService = plans

    override fun prices(): PriceService = prices

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun alerts(): AlertService = alerts
}
