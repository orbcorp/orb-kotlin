// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPageAsync
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

interface InvoiceServiceAsync {

    /** This endpoint is used to create a one-off invoice for a customer. */
    suspend fun create(params: InvoiceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you
     * pass null for the metadata value, it will clear any existing metadata for that
     * invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    suspend fun update(params: InvoiceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint returns a list of all [`Invoice`](../guides/concepts#invoice)s for
     * an account in a list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice
     * date. The response also includes
     * [`pagination_metadata`](../reference/pagination), which lets the caller retrieve
     * the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     */
    suspend fun list(params: InvoiceListParams, requestOptions: RequestOptions = RequestOptions.none()): InvoiceListPageAsync

    /**
     * This endpoint is used to fetch an [`Invoice`](../guides/concepts#invoice) given
     * an identifier.
     */
    suspend fun fetch(params: InvoiceFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint can be used to fetch the upcoming
     * [invoice](../guides/concepts#invoice) for the current billing period given a
     * subscription.
     */
    suspend fun fetchUpcoming(params: InvoiceFetchUpcomingParams, requestOptions: RequestOptions = RequestOptions.none()): InvoiceFetchUpcomingResponse

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only
     * possible with invoices where status is `draft`, `will_auto_issue` is false, and
     * an `eligible_to_issue_at` is a time in the past. Issuing an invoice could
     * possibly trigger side effects, some of which could be customer-visible (e.g.
     * sending emails, auto-collecting payment, syncing the invoice to external
     * providers, etc).
     */
    suspend fun issue(params: InvoiceIssueParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can
     * only be done to invoices that are in the `issued` status.
     */
    suspend fun markPaid(params: InvoiceMarkPaidParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can
     * only be done to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount
     * due, the customer balance operation will be reverted. For example, if the
     * invoice used $10 of customer balance, that amount will be added back to the
     * customer balance upon voiding.
     */
    suspend fun void(params: InvoiceVoidParams, requestOptions: RequestOptions = RequestOptions.none()): Invoice
}
