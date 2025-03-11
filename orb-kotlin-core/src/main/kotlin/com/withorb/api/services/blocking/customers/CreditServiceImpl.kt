// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.LedgerServiceImpl
import com.withorb.api.services.blocking.customers.credits.TopUpService
import com.withorb.api.services.blocking.customers.credits.TopUpServiceImpl

class CreditServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CreditService {

    private val withRawResponse: CreditService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val ledger: LedgerService by lazy { LedgerServiceImpl(clientOptions) }

    private val topUps: TopUpService by lazy { TopUpServiceImpl(clientOptions) }

    override fun withRawResponse(): CreditService.WithRawResponse = withRawResponse

    override fun ledger(): LedgerService = ledger

    override fun topUps(): TopUpService = topUps

    override fun list(params: CustomerCreditListParams, requestOptions: RequestOptions): CustomerCreditListPage =
        // get /customers/{customer_id}/credits
        withRawResponse().list(params, requestOptions).parse()

    override fun listByExternalId(params: CustomerCreditListByExternalIdParams, requestOptions: RequestOptions): CustomerCreditListByExternalIdPage =
        // get /customers/external_customer_id/{external_customer_id}/credits
        withRawResponse().listByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CreditService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val ledger: LedgerService.WithRawResponse by lazy { LedgerServiceImpl.WithRawResponseImpl(clientOptions) }

        private val topUps: TopUpService.WithRawResponse by lazy { TopUpServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun ledger(): LedgerService.WithRawResponse = ledger

        override fun topUps(): TopUpService.WithRawResponse = topUps

        private val listHandler: Handler<CustomerCreditListPage.Response> = jsonHandler<CustomerCreditListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: CustomerCreditListParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", params.getPathParam(0), "credits")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  CustomerCreditListPage.of(CreditServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val listByExternalIdHandler: Handler<CustomerCreditListByExternalIdPage.Response> = jsonHandler<CustomerCreditListByExternalIdPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listByExternalId(params: CustomerCreditListByExternalIdParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditListByExternalIdPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listByExternalIdHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  CustomerCreditListByExternalIdPage.of(CreditServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
