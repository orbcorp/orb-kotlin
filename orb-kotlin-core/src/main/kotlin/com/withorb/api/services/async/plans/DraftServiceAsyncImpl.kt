// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.PlanDraftDiscardParams
import com.withorb.api.models.PlanDraftFetchParams
import com.withorb.api.models.PlanDraftPublishParams
import com.withorb.api.models.PlanDraftSaveParams
import com.withorb.api.models.PlanVersion
import com.withorb.api.models.PlanVersionDraft

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
class DraftServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DraftServiceAsync {

    private val withRawResponse: DraftServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DraftServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DraftServiceAsync =
        DraftServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun discard(params: PlanDraftDiscardParams, requestOptions: RequestOptions) {
        // delete /plans/{plan_id}/draft
        withRawResponse().discard(params, requestOptions)
    }

    override suspend fun fetch(
        params: PlanDraftFetchParams,
        requestOptions: RequestOptions,
    ): PlanVersionDraft =
        // get /plans/{plan_id}/draft
        withRawResponse().fetch(params, requestOptions).parse()

    override suspend fun publish(
        params: PlanDraftPublishParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // post /plans/{plan_id}/draft/publish
        withRawResponse().publish(params, requestOptions).parse()

    override suspend fun save(
        params: PlanDraftSaveParams,
        requestOptions: RequestOptions,
    ): PlanVersionDraft =
        // put /plans/{plan_id}/draft
        withRawResponse().save(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DraftServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DraftServiceAsync.WithRawResponse =
            DraftServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val discardHandler: Handler<Void?> = emptyHandler()

        override suspend fun discard(
            params: PlanDraftDiscardParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "draft")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { discardHandler.handle(it) }
            }
        }

        private val fetchHandler: Handler<PlanVersionDraft> =
            jsonHandler<PlanVersionDraft>(clientOptions.jsonMapper)

        override suspend fun fetch(
            params: PlanDraftFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "draft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val publishHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override suspend fun publish(
            params: PlanDraftPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "draft", "publish")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val saveHandler: Handler<PlanVersionDraft> =
            jsonHandler<PlanVersionDraft>(clientOptions.jsonMapper)

        override suspend fun save(
            params: PlanDraftSaveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersionDraft> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { saveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
