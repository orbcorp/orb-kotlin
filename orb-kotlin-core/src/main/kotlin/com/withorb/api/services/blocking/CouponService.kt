// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPage
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.blocking.coupons.SubscriptionService

interface CouponService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CouponService

    fun subscriptions(): SubscriptionService

    /**
     * This endpoint allows the creation of coupons, which can then be redeemed at subscription
     * creation or plan change.
     */
    fun create(
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
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CouponListPage =
        list(CouponListParams.none(), requestOptions)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    fun archive(
        couponId: String,
        params: CouponArchiveParams = CouponArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = archive(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see [archive] */
    fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see [archive] */
    fun archive(couponId: String, requestOptions: RequestOptions): Coupon =
        archive(couponId, CouponArchiveParams.none(), requestOptions)

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    fun fetch(
        couponId: String,
        params: CouponFetchParams = CouponFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon = fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /** @see [fetch] */
    fun fetch(couponId: String, requestOptions: RequestOptions): Coupon =
        fetch(couponId, CouponFetchParams.none(), requestOptions)

    /** A view of [CouponService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CouponService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /coupons`, but is otherwise the same as
         * [CouponService.create].
         */
        @MustBeClosed
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /**
         * Returns a raw HTTP response for `get /coupons`, but is otherwise the same as
         * [CouponService.list].
         */
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CouponListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CouponListPage> =
            list(CouponListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /coupons/{coupon_id}/archive`, but is otherwise the
         * same as [CouponService.archive].
         */
        @MustBeClosed
        fun archive(
            couponId: String,
            params: CouponArchiveParams = CouponArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> =
            archive(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see [archive] */
        @MustBeClosed
        fun archive(couponId: String, requestOptions: RequestOptions): HttpResponseFor<Coupon> =
            archive(couponId, CouponArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}`, but is otherwise the same as
         * [CouponService.fetch].
         */
        @MustBeClosed
        fun fetch(
            couponId: String,
            params: CouponFetchParams = CouponFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon> =
            fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Coupon>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(couponId: String, requestOptions: RequestOptions): HttpResponseFor<Coupon> =
            fetch(couponId, CouponFetchParams.none(), requestOptions)
    }
}
