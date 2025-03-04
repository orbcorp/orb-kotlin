// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.services.async.AlertServiceAsync
import com.withorb.api.services.async.AlertServiceAsyncImpl
import com.withorb.api.services.async.CouponServiceAsync
import com.withorb.api.services.async.CouponServiceAsyncImpl
import com.withorb.api.services.async.CreditNoteServiceAsync
import com.withorb.api.services.async.CreditNoteServiceAsyncImpl
import com.withorb.api.services.async.CustomerServiceAsync
import com.withorb.api.services.async.CustomerServiceAsyncImpl
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsyncImpl
import com.withorb.api.services.async.EventServiceAsync
import com.withorb.api.services.async.EventServiceAsyncImpl
import com.withorb.api.services.async.InvoiceLineItemServiceAsync
import com.withorb.api.services.async.InvoiceLineItemServiceAsyncImpl
import com.withorb.api.services.async.InvoiceServiceAsync
import com.withorb.api.services.async.InvoiceServiceAsyncImpl
import com.withorb.api.services.async.ItemServiceAsync
import com.withorb.api.services.async.ItemServiceAsyncImpl
import com.withorb.api.services.async.MetricServiceAsync
import com.withorb.api.services.async.MetricServiceAsyncImpl
import com.withorb.api.services.async.PlanServiceAsync
import com.withorb.api.services.async.PlanServiceAsyncImpl
import com.withorb.api.services.async.PriceServiceAsync
import com.withorb.api.services.async.PriceServiceAsyncImpl
import com.withorb.api.services.async.SubscriptionServiceAsync
import com.withorb.api.services.async.SubscriptionServiceAsyncImpl
import com.withorb.api.services.async.TopLevelServiceAsync
import com.withorb.api.services.async.TopLevelServiceAsyncImpl

class OrbClientAsyncImpl(private val clientOptions: ClientOptions) : OrbClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OrbClient by lazy { OrbClientImpl(clientOptions) }

    private val withRawResponse: OrbClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    private val dimensionalPriceGroups: DimensionalPriceGroupServiceAsync by lazy {
        DimensionalPriceGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OrbClient = sync

    override fun withRawResponse(): OrbClientAsync.WithRawResponse = withRawResponse

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

    override fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync =
        dimensionalPriceGroups

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbClientAsync.WithRawResponse {

        private val topLevel: TopLevelServiceAsync.WithRawResponse by lazy {
            TopLevelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponServiceAsync.WithRawResponse by lazy {
            CouponServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditNotes: CreditNoteServiceAsync.WithRawResponse by lazy {
            CreditNoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoiceLineItems: InvoiceLineItemServiceAsync.WithRawResponse by lazy {
            InvoiceLineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricServiceAsync.WithRawResponse by lazy {
            MetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val prices: PriceServiceAsync.WithRawResponse by lazy {
            PriceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val alerts: AlertServiceAsync.WithRawResponse by lazy {
            AlertServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dimensionalPriceGroups:
            DimensionalPriceGroupServiceAsync.WithRawResponse by lazy {
            DimensionalPriceGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun topLevel(): TopLevelServiceAsync.WithRawResponse = topLevel

        override fun coupons(): CouponServiceAsync.WithRawResponse = coupons

        override fun creditNotes(): CreditNoteServiceAsync.WithRawResponse = creditNotes

        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun invoiceLineItems(): InvoiceLineItemServiceAsync.WithRawResponse =
            invoiceLineItems

        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun items(): ItemServiceAsync.WithRawResponse = items

        override fun metrics(): MetricServiceAsync.WithRawResponse = metrics

        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        override fun prices(): PriceServiceAsync.WithRawResponse = prices

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        override fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync.WithRawResponse =
            dimensionalPriceGroups
    }
}
