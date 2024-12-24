// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import com.withorb.api.services.blocking.EventService
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.services.blocking.InvoiceService
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.services.blocking.PriceService
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.TopLevelService

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

    fun dimensionalPriceGroups(): DimensionalPriceGroupService
}
