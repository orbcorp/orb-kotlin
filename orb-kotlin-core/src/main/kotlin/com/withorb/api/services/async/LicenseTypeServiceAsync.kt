// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseTypeCreateParams
import com.withorb.api.models.LicenseTypeCreateResponse
import com.withorb.api.models.LicenseTypeListPageAsync
import com.withorb.api.models.LicenseTypeListParams
import com.withorb.api.models.LicenseTypeRetrieveParams
import com.withorb.api.models.LicenseTypeRetrieveResponse

interface LicenseTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseTypeServiceAsync

    /**
     * This endpoint is used to create a new license type.
     *
     * License types are used to group licenses and define billing behavior. Each license type has a
     * name and a grouping key that determines how metrics are aggregated for billing purposes.
     */
    suspend fun create(
        params: LicenseTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseTypeCreateResponse

    /**
     * This endpoint returns a license type identified by its license_type_id.
     *
     * Use this endpoint to retrieve details about a specific license type, including its name and
     * grouping key.
     */
    suspend fun retrieve(
        licenseTypeId: String,
        params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseTypeRetrieveResponse =
        retrieve(params.toBuilder().licenseTypeId(licenseTypeId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LicenseTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseTypeRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        licenseTypeId: String,
        requestOptions: RequestOptions,
    ): LicenseTypeRetrieveResponse =
        retrieve(licenseTypeId, LicenseTypeRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all license types configured for the account, ordered in
     * ascending order by creation time.
     *
     * License types are used to group licenses and define billing behavior. Each license type has a
     * name and a grouping key that determines how metrics are aggregated for billing purposes.
     */
    suspend fun list(
        params: LicenseTypeListParams = LicenseTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseTypeListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LicenseTypeListPageAsync =
        list(LicenseTypeListParams.none(), requestOptions)

    /**
     * A view of [LicenseTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): LicenseTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /license_types`, but is otherwise the same as
         * [LicenseTypeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LicenseTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseTypeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /license_types/{license_type_id}`, but is otherwise
         * the same as [LicenseTypeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            licenseTypeId: String,
            params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseTypeRetrieveResponse> =
            retrieve(params.toBuilder().licenseTypeId(licenseTypeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LicenseTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseTypeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            licenseTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseTypeRetrieveResponse> =
            retrieve(licenseTypeId, LicenseTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /license_types`, but is otherwise the same as
         * [LicenseTypeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LicenseTypeListParams = LicenseTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseTypeListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LicenseTypeListPageAsync> =
            list(LicenseTypeListParams.none(), requestOptions)
    }
}
