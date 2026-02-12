// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseUsageGetAllUsageParams
import com.withorb.api.models.LicenseUsageGetAllUsageResponse
import com.withorb.api.models.LicenseUsageGetUsageParams
import com.withorb.api.models.LicenseUsageGetUsageResponse

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UsageServiceAsync

    /**
     * Returns usage and remaining credits for all licenses of a given type on a subscription.
     *
     * Date range defaults to the current billing period if not specified.
     */
    suspend fun getAllUsage(
        params: LicenseUsageGetAllUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseUsageGetAllUsageResponse

    /**
     * Returns usage and remaining credits for a specific license over a date range.
     *
     * Date range defaults to the current billing period if not specified.
     */
    suspend fun getUsage(
        licenseId: String,
        params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseUsageGetUsageResponse =
        getUsage(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see getUsage */
    suspend fun getUsage(
        params: LicenseUsageGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseUsageGetUsageResponse

    /** @see getUsage */
    suspend fun getUsage(
        licenseId: String,
        requestOptions: RequestOptions,
    ): LicenseUsageGetUsageResponse =
        getUsage(licenseId, LicenseUsageGetUsageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /licenses/usage`, but is otherwise the same as
         * [UsageServiceAsync.getAllUsage].
         */
        @MustBeClosed
        suspend fun getAllUsage(
            params: LicenseUsageGetAllUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseUsageGetAllUsageResponse>

        /**
         * Returns a raw HTTP response for `get /licenses/{license_id}/usage`, but is otherwise the
         * same as [UsageServiceAsync.getUsage].
         */
        @MustBeClosed
        suspend fun getUsage(
            licenseId: String,
            params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseUsageGetUsageResponse> =
            getUsage(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see getUsage */
        @MustBeClosed
        suspend fun getUsage(
            params: LicenseUsageGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseUsageGetUsageResponse>

        /** @see getUsage */
        @MustBeClosed
        suspend fun getUsage(
            licenseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseUsageGetUsageResponse> =
            getUsage(licenseId, LicenseUsageGetUsageParams.none(), requestOptions)
    }
}
