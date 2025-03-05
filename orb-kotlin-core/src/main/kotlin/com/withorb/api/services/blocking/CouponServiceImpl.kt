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
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPage
import com.withorb.api.models.CouponListParams
import com.withorb.api.models.CouponModel
import com.withorb.api.services.blocking.coupons.SubscriptionService
import com.withorb.api.services.blocking.coupons.SubscriptionServiceImpl

class CouponServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponService {

    private val withRawResponse: CouponService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CouponService.WithRawResponse = withRawResponse

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun create(params: CouponCreateParams, requestOptions: RequestOptions): CouponModel =
        // post /coupons
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: CouponListParams, requestOptions: RequestOptions): CouponListPage =
        // get /coupons
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: CouponArchiveParams, requestOptions: RequestOptions): CouponModel =
        // post /coupons/{coupon_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun fetch(params: CouponFetchParams, requestOptions: RequestOptions): CouponModel =
        // get /coupons/{coupon_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CouponService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        private val createHandler: Handler<CouponModel> =
            jsonHandler<CouponModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("coupons")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CouponListPage.Response> =
            jsonHandler<CouponListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CouponListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { CouponListPage.of(CouponServiceImpl(clientOptions), params, it) }
            }
        }

        private val archiveHandler: Handler<CouponModel> =
            jsonHandler<CouponModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("coupons", params.getPathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<CouponModel> =
            jsonHandler<CouponModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
