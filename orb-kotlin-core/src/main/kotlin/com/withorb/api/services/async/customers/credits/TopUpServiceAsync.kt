// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdResponse
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpCreateResponse
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListPageAsync
import com.withorb.api.models.CustomerCreditTopUpListParams

interface TopUpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopUpServiceAsync

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    suspend fun create(
        customerId: String,
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateResponse =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateResponse

    /** List top-ups */
    suspend fun list(
        customerId: String,
        params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListPageAsync =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListPageAsync

    /** @see [list] */
    suspend fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditTopUpListPageAsync =
        list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    suspend fun delete(
        topUpId: String,
        params: CustomerCreditTopUpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: CustomerCreditTopUpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    suspend fun createByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateByExternalIdResponse =
        createByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [createByExternalId] */
    suspend fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateByExternalIdResponse

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    suspend fun deleteByExternalId(
        topUpId: String,
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [deleteByExternalId] */
    suspend fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List top-ups by external ID */
    suspend fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpListByExternalIdParams =
            CustomerCreditTopUpListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPageAsync =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [listByExternalId] */
    suspend fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPageAsync

    /** @see [listByExternalId] */
    suspend fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditTopUpListByExternalIdPageAsync =
        listByExternalId(
            externalCustomerId,
            CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions,
        )

    /** A view of [TopUpServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TopUpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            customerId: String,
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateResponse> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateResponse>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListPageAsync> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: CustomerCreditTopUpListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditTopUpListPageAsync> =
            list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/credits/top_ups/{top_up_id}`, but is otherwise the same as
         * [TopUpServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            topUpId: String,
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.createByExternalId].
         */
        @MustBeClosed
        suspend fun createByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse> =
            createByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [createByExternalId] */
        @MustBeClosed
        suspend fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}`, but
         * is otherwise the same as [TopUpServiceAsync.deleteByExternalId].
         */
        @MustBeClosed
        suspend fun deleteByExternalId(
            topUpId: String,
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [deleteByExternalId] */
        @MustBeClosed
        suspend fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.listByExternalId].
         */
        @MustBeClosed
        suspend fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpListByExternalIdParams =
                CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [listByExternalId] */
        @MustBeClosed
        suspend fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>

        /** @see [listByExternalId] */
        @MustBeClosed
        suspend fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditTopUpListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
