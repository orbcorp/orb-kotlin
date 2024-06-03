// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
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
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class TopUpServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TopUpService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CustomerCreditTopUpCreateResponse> =
        jsonHandler<CustomerCreditTopUpCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    override fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions
    ): CustomerCreditTopUpCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers", params.getPathParam(0), "credits", "top_ups")
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

    private val listHandler: Handler<CustomerCreditTopUpListPage.Response> =
        jsonHandler<CustomerCreditTopUpListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List top-ups */
    override fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions
    ): CustomerCreditTopUpListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0), "credits", "top_ups")
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
                .let { CustomerCreditTopUpListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete top-up */
    override fun delete(params: CustomerCreditTopUpDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "credits",
                    "top_ups",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val createByExternalIdHandler: Handler<CustomerCreditTopUpCreateByExternalIdResponse> =
        jsonHandler<CustomerCreditTopUpCreateByExternalIdResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    override fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerCreditTopUpCreateByExternalIdResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "credits",
                    "top_ups"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val deleteByExternalIdHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Delete top-up by external ID */
    override fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "credits",
                    "top_ups",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteByExternalIdHandler.handle(it) }
        }
    }

    private val listByExternalIdHandler: Handler<CustomerCreditTopUpListByExternalIdPage.Response> =
        jsonHandler<CustomerCreditTopUpListByExternalIdPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List top-ups by external ID */
    override fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions
    ): CustomerCreditTopUpListByExternalIdPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "credits",
                    "top_ups"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listByExternalIdHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CustomerCreditTopUpListByExternalIdPage.of(this, params, it) }
        }
    }
}
