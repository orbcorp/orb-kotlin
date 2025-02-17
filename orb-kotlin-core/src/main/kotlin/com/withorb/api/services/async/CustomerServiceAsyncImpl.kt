// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPageAsync
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsyncImpl
import com.withorb.api.services.async.customers.CostServiceAsync
import com.withorb.api.services.async.customers.CostServiceAsyncImpl
import com.withorb.api.services.async.customers.CreditServiceAsync
import com.withorb.api.services.async.customers.CreditServiceAsyncImpl

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val costs: CostServiceAsync by lazy { CostServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val balanceTransactions: BalanceTransactionServiceAsync by lazy {
        BalanceTransactionServiceAsyncImpl(clientOptions)
    }

    override fun costs(): CostServiceAsync = costs

    override fun credits(): CreditServiceAsync = credits

    override fun balanceTransactions(): BalanceTransactionServiceAsync = balanceTransactions

    private val createHandler: Handler<Customer> =
        jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This operation is used to create an Orb customer, who is party to the core billing
     * relationship. See [Customer](/core-concepts##customer) for an overview of the customer
     * resource.
     *
     * This endpoint is critical in the following Orb functionality:
     * - Automated charges can be configured by setting `payment_provider` and `payment_provider_id`
     *   to automatically issue invoices
     * - [Customer ID Aliases](/events-and-metrics/customer-aliases) can be configured by setting
     *   `external_customer_id`
     * - [Timezone localization](/essentials/timezones) can be configured on a per-customer basis by
     *   setting the `timezone` parameter
     */
    override suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): Customer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Customer> =
        jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to update the `payment_provider`, `payment_provider_id`, `name`,
     * `email`, `email_delivery`, `tax_id`, `auto_collection`, `metadata`, `shipping_address`,
     * `billing_address`, and `additional_emails` of an existing customer. Other fields on a
     * customer are currently immutable.
     */
    override suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): Customer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("customers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CustomerListPageAsync.Response> =
        jsonHandler<CustomerListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all customers for an account. The list of customers is
     * ordered starting from the most recently created customer. This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     *
     * See [Customer](/core-concepts##customer) for an overview of the customer model.
     */
    override suspend fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { CustomerListPageAsync.of(this, params, it) }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * This performs a deletion of this customer, its subscriptions, and its invoices, provided the
     * customer does not have any issued invoices. Customers with issued invoices cannot be deleted.
     * This operation is irreversible. Note that this is a _soft_ deletion, but the data will be
     * inaccessible through the API and Orb dashboard.
     *
     * For a hard-deletion, please reach out to the Orb team directly.
     *
     * **Note**: This operation happens asynchronously and can be expected to take a few minutes to
     * propagate to related resources. However, querying for the customer on subsequent GET requests
     * while deletion is in process will reflect its deletion with a `deleted: true` property. Once
     * the customer deletion has been fully processed, the customer will not be returned in the API.
     *
     * On successful processing, this returns an empty dictionary (`{}`) in the API.
     */
    override suspend fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("customers", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }

    private val fetchHandler: Handler<Customer> =
        jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch customer details given an identifier. If the `Customer` is in
     * the process of being deleted, only the properties `id` and `deleted: true` will be returned.
     *
     * See the [Customer resource](/core-concepts#customer) for a full discussion of the Customer
     * model.
     */
    override suspend fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions,
    ): Customer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val fetchByExternalIdHandler: Handler<Customer> =
        jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)).
     *
     * Note that the resource and semantics of this endpoint exactly mirror
     * [Get Customer](fetch-customer).
     */
    override suspend fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("customers", "external_customer_id", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchByExternalIdHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val syncPaymentMethodsFromGatewayHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    override suspend fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    "external_customer_id",
                    params.getPathParam(0),
                    "sync_payment_methods_from_gateway",
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { syncPaymentMethodsFromGatewayHandler.handle(it) }
    }

    private val syncPaymentMethodsFromGatewayByExternalCustomerIdHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    override suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "sync_payment_methods_from_gateway",
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { syncPaymentMethodsFromGatewayByExternalCustomerIdHandler.handle(it) }
    }

    private val updateByExternalIdHandler: Handler<Customer> =
        jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to update customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)). Note that the resource and
     * semantics of this endpoint exactly mirror [Update Customer](update-customer).
     */
    override suspend fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): Customer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("customers", "external_customer_id", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateByExternalIdHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
