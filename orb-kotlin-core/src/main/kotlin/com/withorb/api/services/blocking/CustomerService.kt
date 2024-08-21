// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPage
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler
import com.withorb.api.services.blocking.customers.CostService
import com.withorb.api.services.blocking.customers.CostServiceImpl
import com.withorb.api.services.blocking.customers.CreditService
import com.withorb.api.services.blocking.customers.CreditServiceImpl
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import com.withorb.api.services.blocking.customers.BalanceTransactionServiceImpl

interface CustomerService {

    fun costs(): CostService

    fun credits(): CreditService

    fun balanceTransactions(): BalanceTransactionService

    /**
     * This operation is used to create an Orb customer, who is party to the core
     * billing relationship. See [Customer](../guides/concepts#customer) for an
     * overview of the customer resource.
     *
     * This endpoint is critical in the following Orb functionality:
     *
     * - Automated charges can be configured by setting `payment_provider` and
     *   `payment_provider_id` to automatically issue invoices
     * - [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) can be
     *   configured by setting `external_customer_id`
     * - [Timezone localization](../guides/product-catalog/timezones.md) can be
     *   configured on a per-customer basis by setting the `timezone` parameter
     */
    fun create(params: CustomerCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Customer

    /**
     * This endpoint can be used to update the `payment_provider`,
     * `payment_provider_id`, `name`, `email`, `email_delivery`, `tax_id`,
     * `auto_collection`, `metadata`, `shipping_address`, `billing_address`, and
     * `additional_emails` of an existing customer. Other fields on a customer are
     * currently immutable.
     */
    fun update(params: CustomerUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Customer

    /**
     * This endpoint returns a list of all customers for an account. The list of
     * customers is ordered starting from the most recently created customer. This
     * endpoint follows Orb's
     * [standardized pagination format](../reference/pagination).
     *
     * See [Customer](../guides/concepts#customer) for an overview of the customer
     * model.
     */
    fun list(params: CustomerListParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerListPage

    /**
     * This performs a deletion of this customer, its subscriptions, and its invoices.
     * This operation is irreversible. Note that this is a _soft_ deletion, but the
     * data will be inaccessible through the API and Orb dashboard. For hard-deletion,
     * please reach out to the Orb team directly.
     *
     * **Note**: This operation happens asynchronously and can be expected to take a
     * few minutes to propagate to related resources. However, querying for the
     * customer on subsequent GET requests while deletion is in process will reflect
     * its deletion with a `deleted: true` property. Once the customer deletion has
     * been fully processed, the customer will not be returned in the API.
     *
     * On successful processing, this returns an empty dictionary (`{}`) in the API.
     */
    fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * This endpoint is used to fetch customer details given an identifier. If the
     * `Customer` is in the process of being deleted, only the properties `id` and
     * `deleted: true` will be returned.
     *
     * See the [Customer resource](../guides/core-concepts.mdx#customer) for a full
     * discussion of the Customer model.
     */
    fun fetch(params: CustomerFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Customer

    /**
     * This endpoint is used to fetch customer details given an `external_customer_id`
     * (see [Customer ID Aliases](../guides/events-and-metrics/customer-aliases)).
     *
     * Note that the resource and semantics of this endpoint exactly mirror
     * [Get Customer](fetch-customer).
     */
    fun fetchByExternalId(params: CustomerFetchByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none()): Customer

    /**
     * This endpoint is used to update customer details given an `external_customer_id`
     * (see [Customer ID Aliases](../guides/events-and-metrics/customer-aliases)). Note
     * that the resource and semantics of this endpoint exactly mirror
     * [Update Customer](update-customer).
     */
    fun updateByExternalId(params: CustomerUpdateByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none()): Customer
}
