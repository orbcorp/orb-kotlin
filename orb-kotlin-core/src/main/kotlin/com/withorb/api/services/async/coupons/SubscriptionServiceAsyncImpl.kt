// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.coupons

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
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CouponSubscriptionListPageAsync
import com.withorb.api.models.CouponSubscriptionListParams

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions,
    ): CouponSubscriptionListPageAsync =
        // get /coupons/{coupon_id}/subscriptions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CouponSubscriptionListPageAsync.Response> =
            jsonHandler<CouponSubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CouponSubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponSubscriptionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons", params.getPathParam(0), "subscriptions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CouponSubscriptionListPageAsync.of(
                            SubscriptionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
