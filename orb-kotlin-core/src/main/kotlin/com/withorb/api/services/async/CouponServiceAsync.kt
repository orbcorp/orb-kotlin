// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync

interface CouponServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CouponServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    /**
     * This endpoint allows the creation of coupons, which can then be redeemed at subscription
     * creation or plan change.
     */
    suspend fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon. The response
     * also includes `pagination_metadata`, which lets the caller retrieve the next page of results
     * if they exist. More information about pagination can be found in the Pagination-metadata
     * schema.
     */
    suspend fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CouponListPageAsync =
        list(CouponListParams.none(), requestOptions)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    suspend fun archive(
        couponId: String,
        params: CouponArchiveParams = CouponArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = archive(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see archive */
    suspend fun archive(couponId: String, requestOptions: RequestOptions): Coupon =
        archive(couponId, CouponArchiveParams.none(), requestOptions)

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    suspend fun fetch(
        couponId: String,
        params: CouponFetchParams = CouponFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see fetch */
    suspend fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see fetch */
    suspend fun fetch(couponId: String, requestOptions: RequestOptions): Coupon =
        fetch(couponId, CouponFetchParams.none(), requestOptions)

    /**
     * A view of [CouponServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CouponServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /coupons`, but is otherwise the same as
         * [CouponServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /**
         * Returns a raw HTTP response for `get /coupons`, but is otherwise the same as
         * [CouponServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CouponListPageAsync> =
            list(CouponListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /coupons/{coupon_id}/archive`, but is otherwise the
         * same as [CouponServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            couponId: String,
            params: CouponArchiveParams = CouponArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> =
            archive(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            couponId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> = archive(couponId, CouponArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}`, but is otherwise the same as
         * [CouponServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            couponId: String,
            params: CouponFetchParams = CouponFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> =
            fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            couponId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Coupon> = fetch(couponId, CouponFetchParams.none(), requestOptions)
    }
}
