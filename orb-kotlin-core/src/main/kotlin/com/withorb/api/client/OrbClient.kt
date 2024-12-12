// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.services.blocking.*

interface OrbClient {

    fun async(): OrbClientAsync

    fun topLevel(): TopLevelService

    fun coupons(): CouponService

    fun creditNotes(): CreditNoteService

    fun customers(): CustomerService

    fun events(): EventService

    fun invoiceLineItems(): InvoiceLineItemService

    fun invoices(): InvoiceService

    fun items(): ItemService

    fun metrics(): MetricService

    fun plans(): PlanService

    fun prices(): PriceService

    fun subscriptions(): SubscriptionService

    fun alerts(): AlertService
}
