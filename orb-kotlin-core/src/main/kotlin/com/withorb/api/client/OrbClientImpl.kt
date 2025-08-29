// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.AlertServiceImpl
import com.withorb.api.services.blocking.BetaService
import com.withorb.api.services.blocking.BetaServiceImpl
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.services.blocking.CouponServiceImpl
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.services.blocking.CreditNoteServiceImpl
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.services.blocking.CustomerServiceImpl
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import com.withorb.api.services.blocking.DimensionalPriceGroupServiceImpl
import com.withorb.api.services.blocking.EventService
import com.withorb.api.services.blocking.EventServiceImpl
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.services.blocking.InvoiceLineItemServiceImpl
import com.withorb.api.services.blocking.InvoiceService
import com.withorb.api.services.blocking.InvoiceServiceImpl
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.services.blocking.ItemServiceImpl
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.services.blocking.MetricServiceImpl
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.services.blocking.PlanServiceImpl
import com.withorb.api.services.blocking.PriceService
import com.withorb.api.services.blocking.PriceServiceImpl
import com.withorb.api.services.blocking.SubscriptionChangeService
import com.withorb.api.services.blocking.SubscriptionChangeServiceImpl
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.SubscriptionServiceImpl
import com.withorb.api.services.blocking.TopLevelService
import com.withorb.api.services.blocking.TopLevelServiceImpl

class OrbClientImpl(private val clientOptions: ClientOptions) : OrbClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OrbClientAsync by lazy { OrbClientAsyncImpl(clientOptions) }

    private val withRawResponse: OrbClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val topLevel: TopLevelService by lazy {
        TopLevelServiceImpl(clientOptionsWithUserAgent)
    }

    private val beta: BetaService by lazy { BetaServiceImpl(clientOptionsWithUserAgent) }

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

    private val dimensionalPriceGroups: DimensionalPriceGroupService by lazy {
        DimensionalPriceGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val subscriptionChanges: SubscriptionChangeService by lazy {
        SubscriptionChangeServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): OrbClientAsync = async

    override fun withRawResponse(): OrbClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient =
        OrbClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun topLevel(): TopLevelService = topLevel

    override fun beta(): BetaService = beta

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

    override fun dimensionalPriceGroups(): DimensionalPriceGroupService = dimensionalPriceGroups

    override fun subscriptionChanges(): SubscriptionChangeService = subscriptionChanges

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbClient.WithRawResponse {

        private val topLevel: TopLevelService.WithRawResponse by lazy {
            TopLevelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val beta: BetaService.WithRawResponse by lazy {
            BetaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponService.WithRawResponse by lazy {
            CouponServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditNotes: CreditNoteService.WithRawResponse by lazy {
            CreditNoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoiceLineItems: InvoiceLineItemService.WithRawResponse by lazy {
            InvoiceLineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricService.WithRawResponse by lazy {
            MetricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val prices: PriceService.WithRawResponse by lazy {
            PriceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dimensionalPriceGroups: DimensionalPriceGroupService.WithRawResponse by lazy {
            DimensionalPriceGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptionChanges: SubscriptionChangeService.WithRawResponse by lazy {
            SubscriptionChangeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrbClient.WithRawResponse =
            OrbClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun topLevel(): TopLevelService.WithRawResponse = topLevel

        override fun beta(): BetaService.WithRawResponse = beta

        override fun coupons(): CouponService.WithRawResponse = coupons

        override fun creditNotes(): CreditNoteService.WithRawResponse = creditNotes

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun events(): EventService.WithRawResponse = events

        override fun invoiceLineItems(): InvoiceLineItemService.WithRawResponse = invoiceLineItems

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun items(): ItemService.WithRawResponse = items

        override fun metrics(): MetricService.WithRawResponse = metrics

        override fun plans(): PlanService.WithRawResponse = plans

        override fun prices(): PriceService.WithRawResponse = prices

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        override fun alerts(): AlertService.WithRawResponse = alerts

        override fun dimensionalPriceGroups(): DimensionalPriceGroupService.WithRawResponse =
            dimensionalPriceGroups

        override fun subscriptionChanges(): SubscriptionChangeService.WithRawResponse =
            subscriptionChanges
    }
}
