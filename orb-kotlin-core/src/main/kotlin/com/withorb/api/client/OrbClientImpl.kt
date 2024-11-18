// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.models.*
import com.withorb.api.services.blocking.*

class OrbClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrbClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OrbClientAsync by lazy { OrbClientAsyncImpl(clientOptions) }

    private val topLevel: TopLevelService by lazy {
        TopLevelServiceImpl(clientOptionsWithUserAgent)
    }

    private val coupons: CouponService by lazy { CouponServiceImpl(clientOptionsWithUserAgent) }

    private val creditNotes: CreditNoteService by lazy {
        CreditNoteServiceImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerService by lazy {
        CustomerServiceImpl(clientOptionsWithUserAgent)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val invoiceLineItems: InvoiceLineItemService by lazy {
        InvoiceLineItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptionsWithUserAgent) }

    private val metrics: MetricService by lazy { MetricServiceImpl(clientOptionsWithUserAgent) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptionsWithUserAgent) }

    private val prices: PriceService by lazy { PriceServiceImpl(clientOptionsWithUserAgent) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

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

    override fun webhooks(): WebhookService = webhooks
}
