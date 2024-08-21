// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.coupons

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CouponSubscriptionListPageAsync
import com.withorb.api.models.CouponSubscriptionListParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class SubscriptionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SubscriptionServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CouponSubscriptionListPageAsync.Response> =
        jsonHandler<CouponSubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](../reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](../guides/concepts#subscription).
     */
    override suspend fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions
    ): CouponSubscriptionListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("coupons", params.getPathParam(0), "subscriptions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CouponSubscriptionListPageAsync.of(this, params, it) }
        }
    }
}
