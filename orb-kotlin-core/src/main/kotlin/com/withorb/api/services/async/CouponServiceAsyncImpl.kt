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
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import com.withorb.api.services.async.coupons.SubscriptionServiceAsyncImpl

class CouponServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    private val createHandler: Handler<Coupon> =
        jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows the creation of coupons, which can then be redeemed at subscription
     * creation or plan change.
     */
    override suspend fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions,
    ): Coupon {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("coupons")
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

    private val listHandler: Handler<CouponListPageAsync.Response> =
        jsonHandler<CouponListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon. The response
     * also includes `pagination_metadata`, which lets the caller retrieve the next page of results
     * if they exist. More information about pagination can be found in the Pagination-metadata
     * schema.
     */
    override suspend fun list(
        params: CouponListParams,
        requestOptions: RequestOptions,
    ): CouponListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("coupons")
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
            .let { CouponListPageAsync.of(this, params, it) }
    }

    private val archiveHandler: Handler<Coupon> =
        jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    override suspend fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions,
    ): Coupon {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("coupons", params.getPathParam(0), "archive")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val fetchHandler: Handler<Coupon> =
        jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    override suspend fun fetch(params: CouponFetchParams, requestOptions: RequestOptions): Coupon {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("coupons", params.getPathParam(0))
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
