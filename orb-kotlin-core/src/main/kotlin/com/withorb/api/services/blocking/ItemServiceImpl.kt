// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class ItemServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ItemService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint is used to create an [Item](../guides/concepts#item). */
    override fun create(params: ItemCreateParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("items")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint can be used to update properties on the Item. */
    override fun update(params: ItemUpdateParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("items", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ItemListPage.Response> =
        jsonHandler<ItemListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    override fun list(params: ItemListParams, requestOptions: RequestOptions): ItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ItemListPage.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint returns an item identified by its item_id. */
    override fun fetch(params: ItemFetchParams, requestOptions: RequestOptions): Item {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
