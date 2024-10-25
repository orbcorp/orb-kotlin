// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.TopUpService

interface CreditService {

    fun ledger(): LedgerService

    fun topUps(): TopUpService

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerCreditListPage

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerCreditListByExternalIdPage
}
