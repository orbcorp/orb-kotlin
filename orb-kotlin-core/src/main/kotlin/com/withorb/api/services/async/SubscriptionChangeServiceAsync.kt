// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeApplyResponse
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeCancelResponse
import com.withorb.api.models.SubscriptionChangeListPageAsync
import com.withorb.api.models.SubscriptionChangeListParams
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import com.withorb.api.models.SubscriptionChangeRetrieveResponse

interface SubscriptionChangeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionChangeServiceAsync

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
    suspend fun retrieve(
        subscriptionChangeId: String,
        params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeRetrieveResponse =
        retrieve(
            params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): SubscriptionChangeRetrieveResponse =
        retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of pending subscription changes for a customer. Use the
     * [Fetch Subscription Change](fetch-subscription-change) endpoint to retrieve the expected
     * subscription state after the pending change is applied.
     */
    suspend fun list(
        params: SubscriptionChangeListParams = SubscriptionChangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): SubscriptionChangeListPageAsync =
        list(SubscriptionChangeListParams.none(), requestOptions)

    /**
     * Apply a subscription change to perform the intended action. If a positive amount is passed
     * with a request to this endpoint, any eligible invoices that were created will be issued
     * immediately if they only contain in-advance fees.
     */
    suspend fun apply(
        subscriptionChangeId: String,
        params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeApplyResponse =
        apply(params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(), requestOptions)

    /** @see apply */
    suspend fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeApplyResponse

    /** @see apply */
    suspend fun apply(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): SubscriptionChangeApplyResponse =
        apply(subscriptionChangeId, SubscriptionChangeApplyParams.none(), requestOptions)

    /**
     * Cancel a subscription change. The change can no longer be applied. A subscription can only
     * have one "pending" change at a time - use this endpoint to cancel an existing change before
     * creating a new one.
     */
    suspend fun cancel(
        subscriptionChangeId: String,
        params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeCancelResponse =
        cancel(
            params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
            requestOptions,
        )

    /** @see cancel */
    suspend fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangeCancelResponse

    /** @see cancel */
    suspend fun cancel(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): SubscriptionChangeCancelResponse =
        cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none(), requestOptions)

    /**
     * A view of [SubscriptionChangeServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionChangeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /subscription_changes/{subscription_change_id}`, but
         * is otherwise the same as [SubscriptionChangeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            subscriptionChangeId: String,
            params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse> =
            retrieve(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse> =
            retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription_changes`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SubscriptionChangeListParams = SubscriptionChangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionChangeListPageAsync> =
            list(SubscriptionChangeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/apply`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.apply].
         */
        @MustBeClosed
        suspend fun apply(
            subscriptionChangeId: String,
            params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeApplyResponse> =
            apply(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see apply */
        @MustBeClosed
        suspend fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeApplyResponse>

        /** @see apply */
        @MustBeClosed
        suspend fun apply(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeApplyResponse> =
            apply(subscriptionChangeId, SubscriptionChangeApplyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/cancel`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            subscriptionChangeId: String,
            params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeCancelResponse> =
            cancel(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangeCancelResponse>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeCancelResponse> =
            cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none(), requestOptions)
    }
}
