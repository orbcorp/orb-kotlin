// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

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
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPage
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListPage
import com.withorb.api.models.CustomerCreditTopUpListParams

interface TopUpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopUpService

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    fun create(
        customerId: String,
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateResponse =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateResponse

    /** List top-ups */
    fun list(
        customerId: String,
        params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListPage =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListPage

    /** @see [list] */
    fun list(customerId: String, requestOptions: RequestOptions): CustomerCreditTopUpListPage =
        list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun delete(
        topUpId: String,
        params: CustomerCreditTopUpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
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
    fun createByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateByExternalIdResponse =
        createByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [createByExternalId] */
    fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateByExternalIdResponse

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun deleteByExternalId(
        topUpId: String,
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [deleteByExternalId] */
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List top-ups by external ID */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpListByExternalIdParams =
            CustomerCreditTopUpListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPage =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPage

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CustomerCreditTopUpListByExternalIdPage =
        listByExternalId(
            externalCustomerId,
            CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions,
        )

    /** A view of [TopUpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopUpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpService.create].
         */
        @MustBeClosed
        fun create(
            customerId: String,
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateResponse> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateResponse>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpService.list].
         */
        @MustBeClosed
        fun list(
            customerId: String,
            params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListPage> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerCreditTopUpListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditTopUpListPage> =
            list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/credits/top_ups/{top_up_id}`, but is otherwise the same as
         * [TopUpService.delete].
         */
        @MustBeClosed
        fun delete(
            topUpId: String,
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpService.createByExternalId].
         */
        @MustBeClosed
        fun createByExternalId(
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
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}`, but
         * is otherwise the same as [TopUpService.deleteByExternalId].
         */
        @MustBeClosed
        fun deleteByExternalId(
            topUpId: String,
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [deleteByExternalId] */
        @MustBeClosed
        fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpService.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpListByExternalIdParams =
                CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPage> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPage>

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPage> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditTopUpListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
