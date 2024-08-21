// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

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
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPage
import com.withorb.api.models.CustomerBalanceTransactionListParams
import com.withorb.api.models.CustomerBalanceTransactionListResponse
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

class BalanceTransactionServiceImpl constructor(private val clientOptions: ClientOptions, ) : BalanceTransactionService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CustomerBalanceTransactionCreateResponse> =
    jsonHandler<CustomerBalanceTransactionCreateResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Creates an immutable balance transaction that updates the customer's balance and
     * returns back the newly created transaction.
     */
    override fun create(params: CustomerBalanceTransactionCreateParams, requestOptions: RequestOptions): CustomerBalanceTransactionCreateResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<CustomerBalanceTransactionListPage.Response> =
    jsonHandler<CustomerBalanceTransactionListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * ## The customer balance
     *
     * The customer balance is an amount in the customer's currency, which Orb
     * automatically applies to subsequent invoices. This balance can be adjusted
     * manually via Orb's webapp on the customer details page. You can use this balance
     * to provide a fixed mid-period credit to the customer. Commonly, this is done due
     * to system downtime/SLA violation, or an adhoc adjustment discussed with the
     * customer.
     *
     * If the balance is a positive value at the time of invoicing, it represents that
     * the customer has credit that should be used to offset the amount due on the next
     * issued invoice. In this case, Orb will automatically reduce the next invoice by
     * the balance amount, and roll over any remaining balance if the invoice is fully
     * discounted.
     *
     * If the balance is a negative value at the time of invoicing, Orb will increase
     * the invoice's amount due with a positive adjustment, and reset the balance to 0.
     *
     * This endpoint retrieves all customer balance transactions in reverse
     * chronological order for a single customer, providing a complete audit trail of
     * all adjustments and invoice applications.
     *
     * ## Eligibility
     *
     * The customer balance can only be applied to invoices or adjusted manually if
     * invoices are not synced to a separate invoicing provider. If a payment gateway
     * such as Stripe is used, the balance will be applied to the invoice before
     * forwarding payment to the gateway.
     */
    override fun list(params: CustomerBalanceTransactionListParams, requestOptions: RequestOptions): CustomerBalanceTransactionListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              CustomerBalanceTransactionListPage.of(this, params, it)
          }
      }
    }
}
