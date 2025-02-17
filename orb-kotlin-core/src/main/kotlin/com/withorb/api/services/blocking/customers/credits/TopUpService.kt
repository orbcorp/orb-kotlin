// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.core.RequestOptions
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

    /** Delete top-up */
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

    /** Delete top-up by external ID */
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List top-ups by external ID */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditTopUpListByExternalIdPage
}
