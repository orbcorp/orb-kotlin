// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdResponse
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpCreateResponse
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPage
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListPage
import com.withorb.api.models.CustomerCreditTopUpListParams

class TopUpServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TopUpService {

    private val withRawResponse: TopUpService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): TopUpService.WithRawResponse = withRawResponse

    override fun create(params: CustomerCreditTopUpCreateParams, requestOptions: RequestOptions): CustomerCreditTopUpCreateResponse =
        // post /customers/{customer_id}/credits/top_ups
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: CustomerCreditTopUpListParams, requestOptions: RequestOptions): CustomerCreditTopUpListPage =
        // get /customers/{customer_id}/credits/top_ups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CustomerCreditTopUpDeleteParams, requestOptions: RequestOptions) {
      // delete /customers/{customer_id}/credits/top_ups/{top_up_id}
      withRawResponse().delete(params, requestOptions)
    }

    override fun createByExternalId(params: CustomerCreditTopUpCreateByExternalIdParams, requestOptions: RequestOptions): CustomerCreditTopUpCreateByExternalIdResponse =
        // post /customers/external_customer_id/{external_customer_id}/credits/top_ups
        withRawResponse().createByExternalId(params, requestOptions).parse()

    override fun deleteByExternalId(params: CustomerCreditTopUpDeleteByExternalIdParams, requestOptions: RequestOptions) {
      // delete /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}
      withRawResponse().deleteByExternalId(params, requestOptions)
    }

    override fun listByExternalId(params: CustomerCreditTopUpListByExternalIdParams, requestOptions: RequestOptions): CustomerCreditTopUpListByExternalIdPage =
        // get /customers/external_customer_id/{external_customer_id}/credits/top_ups
        withRawResponse().listByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TopUpService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CustomerCreditTopUpCreateResponse> = jsonHandler<CustomerCreditTopUpCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: CustomerCreditTopUpCreateParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditTopUpCreateResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("customers", params.getPathParam(0), "credits", "top_ups")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<CustomerCreditTopUpListPage.Response> = jsonHandler<CustomerCreditTopUpListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: CustomerCreditTopUpListParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditTopUpListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", params.getPathParam(0), "credits", "top_ups")
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
                  CustomerCreditTopUpListPage.of(TopUpServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(params: CustomerCreditTopUpDeleteParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("customers", params.getPathParam(0), "credits", "top_ups", params.getPathParam(1))
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  deleteHandler.handle(it)
              }
          }
        }

        private val createByExternalIdHandler: Handler<CustomerCreditTopUpCreateByExternalIdResponse> = jsonHandler<CustomerCreditTopUpCreateByExternalIdResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createByExternalId(params: CustomerCreditTopUpCreateByExternalIdParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits", "top_ups")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createByExternalIdHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val deleteByExternalIdHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun deleteByExternalId(params: CustomerCreditTopUpDeleteByExternalIdParams, requestOptions: RequestOptions): HttpResponse {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits", "top_ups", params.getPathParam(1))
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  deleteByExternalIdHandler.handle(it)
              }
          }
        }

        private val listByExternalIdHandler: Handler<CustomerCreditTopUpListByExternalIdPage.Response> = jsonHandler<CustomerCreditTopUpListByExternalIdPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listByExternalId(params: CustomerCreditTopUpListByExternalIdParams, requestOptions: RequestOptions): HttpResponseFor<CustomerCreditTopUpListByExternalIdPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits", "top_ups")
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
                  CustomerCreditTopUpListByExternalIdPage.of(TopUpServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
