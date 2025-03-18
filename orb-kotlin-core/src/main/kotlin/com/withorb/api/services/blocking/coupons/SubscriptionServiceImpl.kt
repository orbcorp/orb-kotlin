// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.coupons

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
import com.withorb.api.models.CouponSubscriptionListPage
import com.withorb.api.models.CouponSubscriptionListParams

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions,
    ): CouponSubscriptionListPage =
        // get /coupons/{coupon_id}/subscriptions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CouponSubscriptionListPage.Response> =
            jsonHandler<CouponSubscriptionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CouponSubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponSubscriptionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons", params._pathParam(0), "subscriptions")
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
                    .let {
                        CouponSubscriptionListPage.of(
                            SubscriptionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
