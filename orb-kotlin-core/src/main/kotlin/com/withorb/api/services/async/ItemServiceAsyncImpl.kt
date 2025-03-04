// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

class ItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ItemServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    override suspend fun create(params: ItemCreateParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("items")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint can be used to update properties on the Item. */
    override suspend fun update(params: ItemUpdateParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("items", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ItemListPageAsync.Response> =
        jsonHandler<ItemListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    override suspend fun list(
        params: ItemListParams,
        requestOptions: RequestOptions,
    ): ItemListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { ItemListPageAsync.of(this, params, it) }
    }

    private val fetchHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint returns an item identified by its item_id. */
    override suspend fun fetch(params: ItemFetchParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
