// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
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
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListPageResponse
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import com.withorb.api.services.async.coupons.SubscriptionServiceAsyncImpl

class CouponServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponServiceAsync {

    private val withRawResponse: CouponServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CouponServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CouponServiceAsync =
        CouponServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override suspend fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions,
    ): Coupon =
        // post /coupons
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: CouponListParams,
        requestOptions: RequestOptions,
    ): CouponListPageAsync =
        // get /coupons
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions,
    ): Coupon =
        // post /coupons/{coupon_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override suspend fun fetch(params: CouponFetchParams, requestOptions: RequestOptions): Coupon =
        // get /coupons/{coupon_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CouponServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CouponServiceAsync.WithRawResponse =
            CouponServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        private val createHandler: Handler<Coupon> = jsonHandler<Coupon>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coupons")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CouponListPageResponse> =
            jsonHandler<CouponListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CouponListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coupons")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CouponListPageAsync.builder()
                            .service(CouponServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<Coupon> = jsonHandler<Coupon>(clientOptions.jsonMapper)

        override suspend fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("couponId", params.couponId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coupons", params._pathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<Coupon> = jsonHandler<Coupon>(clientOptions.jsonMapper)

        override suspend fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("couponId", params.couponId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("coupons", params._pathParam(0))
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
    }
}
