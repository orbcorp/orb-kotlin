// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeApplyResponse
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeCancelResponse
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import com.withorb.api.models.SubscriptionChangeRetrieveResponse

interface SubscriptionChangeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint returns a subscription change given an identifier.
     *
     * A subscription change is created by including `Create-Pending-Subscription-Change: True` in
     * the header of a subscription mutation API call (e.g.
     * [create subscription endpoint](/api-reference/subscription/create-subscription), [schedule
     * plan change endpoint](/api-reference/subscription/schedule-plan-change), ...). The
     * subscription change will be referenced by the `pending_subscription_change` field in the
     * response.
     */
    fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeRetrieveResponse

    /**
     * Apply a subscription change to perform the intended action. If a positive amount is passed
     * with a request to this endpoint, any eligible invoices that were created will be issued
     * immediately if they only contain in-advance fees.
     */
    fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeApplyResponse

    /**
     * Cancel a subscription change. The change can no longer be applied. A subscription can only
     * have one "pending" change at a time - use this endpoint to cancel an existing change before
     * creating a new one.
     */
    fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeCancelResponse

    /**
     * A view of [SubscriptionChangeService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /subscription_changes/{subscription_change_id}`, but
         * is otherwise the same as [SubscriptionChangeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/apply`, but is otherwise the same as
         * [SubscriptionChangeService.apply].
         */
        @MustBeClosed
        fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeApplyResponse>

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/cancel`, but is otherwise the same as
         * [SubscriptionChangeService.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeCancelResponse>
    }
}
