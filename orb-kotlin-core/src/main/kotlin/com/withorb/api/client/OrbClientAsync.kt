// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.services.async.AlertServiceAsync
import com.withorb.api.services.async.CouponServiceAsync
import com.withorb.api.services.async.CreditNoteServiceAsync
import com.withorb.api.services.async.CustomerServiceAsync
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
}
