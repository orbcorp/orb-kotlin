// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.JsonField
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import com.withorb.api.services.blocking.*
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

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
