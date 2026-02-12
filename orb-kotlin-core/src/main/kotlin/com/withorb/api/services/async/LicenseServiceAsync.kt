// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseCreateResponse
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseDeactivateResponse
import com.withorb.api.models.LicenseListPageAsync
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import com.withorb.api.models.LicenseRetrieveByExternalIdResponse
import com.withorb.api.models.LicenseRetrieveParams
import com.withorb.api.models.LicenseRetrieveResponse
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsync
import com.withorb.api.services.async.licenses.UsageServiceAsync

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseServiceAsync

    fun externalLicenses(): ExternalLicenseServiceAsync

    fun usage(): UsageServiceAsync

    /**
     * This endpoint is used to create a new license for a user.
     *
     * If a start date is provided, the license will be activated at the **start** of the specified
     * date in the customer's timezone. Otherwise, the activation time will default to the **start**
     * of the current day in the customer's timezone.
     */
    suspend fun create(
        params: LicenseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseCreateResponse

    /** This endpoint is used to fetch a license given an identifier. */
    suspend fun retrieve(
        licenseId: String,
        params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseRetrieveResponse =
        retrieve(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LicenseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        licenseId: String,
        requestOptions: RequestOptions,
    ): LicenseRetrieveResponse = retrieve(licenseId, LicenseRetrieveParams.none(), requestOptions)

    /** This endpoint returns a list of all licenses for a subscription. */
    suspend fun list(
        params: LicenseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseListPageAsync

    /**
     * This endpoint is used to deactivate an existing license.
     *
     * If an end date is provided, the license will be deactivated at the **start** of the specified
     * date in the customer's timezone. Otherwise, the deactivation time will default to the **end**
     * of the current day in the customer's timezone.
     */
    suspend fun deactivate(
        licenseId: String,
        params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseDeactivateResponse =
        deactivate(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see deactivate */
    suspend fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseDeactivateResponse

    /** @see deactivate */
    suspend fun deactivate(
        licenseId: String,
        requestOptions: RequestOptions,
    ): LicenseDeactivateResponse =
        deactivate(licenseId, LicenseDeactivateParams.none(), requestOptions)

    /** This endpoint is used to fetch a license given an external license identifier. */
    suspend fun retrieveByExternalId(
        externalLicenseId: String,
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseRetrieveByExternalIdResponse =
        retrieveByExternalId(
            params.toBuilder().externalLicenseId(externalLicenseId).build(),
            requestOptions,
        )

    /** @see retrieveByExternalId */
    suspend fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseRetrieveByExternalIdResponse

    /**
     * A view of [LicenseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseServiceAsync.WithRawResponse

        fun externalLicenses(): ExternalLicenseServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /licenses`, but is otherwise the same as
         * [LicenseServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LicenseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseCreateResponse>

        /**
         * Returns a raw HTTP response for `get /licenses/{license_id}`, but is otherwise the same
         * as [LicenseServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            licenseId: String,
            params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseRetrieveResponse> =
            retrieve(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LicenseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            licenseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseRetrieveResponse> =
            retrieve(licenseId, LicenseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /licenses`, but is otherwise the same as
         * [LicenseServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LicenseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseListPageAsync>

        /**
         * Returns a raw HTTP response for `post /licenses/{license_id}/deactivate`, but is
         * otherwise the same as [LicenseServiceAsync.deactivate].
         */
        @MustBeClosed
        suspend fun deactivate(
            licenseId: String,
            params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseDeactivateResponse> =
            deactivate(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        suspend fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        suspend fun deactivate(
            licenseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseDeactivateResponse> =
            deactivate(licenseId, LicenseDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /licenses/external_license_id/{external_license_id}`, but is otherwise the same as
         * [LicenseServiceAsync.retrieveByExternalId].
         */
        @MustBeClosed
        suspend fun retrieveByExternalId(
            externalLicenseId: String,
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseRetrieveByExternalIdResponse> =
            retrieveByExternalId(
                params.toBuilder().externalLicenseId(externalLicenseId).build(),
                requestOptions,
            )

        /** @see retrieveByExternalId */
        @MustBeClosed
        suspend fun retrieveByExternalId(
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseRetrieveByExternalIdResponse>
    }
}
