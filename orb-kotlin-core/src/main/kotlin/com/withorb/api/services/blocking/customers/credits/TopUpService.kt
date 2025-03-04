// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.google.errorprone.annotations.MustBeClosed
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
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateResponse

    /** List top-ups */
    fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListPage

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
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
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpCreateByExternalIdResponse

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List top-ups by external ID */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPage

    /** A view of [TopUpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpService.create].
         */
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
            params: CustomerCreditTopUpListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/credits/top_ups/{top_up_id}`, but is otherwise the same as
         * [TopUpService.delete].
         */
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
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditTopUpListByExternalIdPage>
    }
}
