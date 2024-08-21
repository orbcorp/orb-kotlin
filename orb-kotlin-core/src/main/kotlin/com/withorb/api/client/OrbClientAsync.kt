// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.client

import com.withorb.api.models.*
import com.withorb.api.services.async.*

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
