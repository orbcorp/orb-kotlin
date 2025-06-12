// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.coupons

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CouponSubscriptionListPage
import com.withorb.api.models.CouponSubscriptionListParams

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionService

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](/core-concepts#subscription).
     */
    fun list(
        couponId: String,
        params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponSubscriptionListPage =
        list(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponSubscriptionListPage

    /** @see [list] */
    fun list(couponId: String, requestOptions: RequestOptions): CouponSubscriptionListPage =
        list(couponId, CouponSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(
            couponId: String,
            params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponSubscriptionListPage> =
            list(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CouponSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponSubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            couponId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponSubscriptionListPage> =
            list(couponId, CouponSubscriptionListParams.none(), requestOptions)
    }
}
