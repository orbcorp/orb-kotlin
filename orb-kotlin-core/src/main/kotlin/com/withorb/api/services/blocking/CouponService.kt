// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPage
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.blocking.coupons.SubscriptionService

interface CouponService {

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
        params: CouponListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CouponListPage

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Coupon
}
