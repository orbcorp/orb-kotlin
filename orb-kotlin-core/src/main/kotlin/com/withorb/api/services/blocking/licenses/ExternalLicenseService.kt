// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.licenses

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseExternalLicenseGetUsageParams
import com.withorb.api.models.LicenseExternalLicenseGetUsageResponse

interface ExternalLicenseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalLicenseService

    /**
     * Returns usage and remaining credits for a license identified by its external license ID.
     *
     * Date range defaults to the current billing period if not specified.
     */
    fun getUsage(
        externalLicenseId: String,
        params: LicenseExternalLicenseGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseExternalLicenseGetUsageResponse =
        getUsage(params.toBuilder().externalLicenseId(externalLicenseId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        params: LicenseExternalLicenseGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseExternalLicenseGetUsageResponse

    /**
     * A view of [ExternalLicenseService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalLicenseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /licenses/external_licenses/{external_license_id}/usage`, but is otherwise the same as
         * [ExternalLicenseService.getUsage].
         */
        @MustBeClosed
        fun getUsage(
            externalLicenseId: String,
            params: LicenseExternalLicenseGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseExternalLicenseGetUsageResponse> =
            getUsage(
                params.toBuilder().externalLicenseId(externalLicenseId).build(),
                requestOptions,
            )

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: LicenseExternalLicenseGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseExternalLicenseGetUsageResponse>
    }
}
