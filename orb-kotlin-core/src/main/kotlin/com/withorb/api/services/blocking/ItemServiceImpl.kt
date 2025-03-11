// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

class ItemServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ItemService {

    private val withRawResponse: ItemService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ItemService.WithRawResponse = withRawResponse

    override fun create(params: ItemCreateParams, requestOptions: RequestOptions): Item =
        // post /items
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: ItemUpdateParams, requestOptions: RequestOptions): Item =
        // put /items/{item_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ItemListParams, requestOptions: RequestOptions): ItemListPage =
        // get /items
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(params: ItemFetchParams, requestOptions: RequestOptions): Item =
        // get /items/{item_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ItemService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Item> = jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: ItemCreateParams, requestOptions: RequestOptions): HttpResponseFor<Item> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("items")
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

        private val updateHandler: Handler<Item> = jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: ItemUpdateParams, requestOptions: RequestOptions): HttpResponseFor<Item> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .addPathSegments("items", params.getPathParam(0))
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
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<ItemListPage.Response> = jsonHandler<ItemListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: ItemListParams, requestOptions: RequestOptions): HttpResponseFor<ItemListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("items")
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
                  ItemListPage.of(ItemServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val fetchHandler: Handler<Item> = jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(params: ItemFetchParams, requestOptions: RequestOptions): HttpResponseFor<Item> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("items", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  fetchHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
