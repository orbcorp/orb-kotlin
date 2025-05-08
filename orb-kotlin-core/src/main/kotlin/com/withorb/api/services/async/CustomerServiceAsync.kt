// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
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
import com.withorb.api.services.async.customers.CostServiceAsync
import com.withorb.api.services.async.customers.CreditServiceAsync

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun costs(): CostServiceAsync

    fun credits(): CreditServiceAsync

    fun balanceTransactions(): BalanceTransactionServiceAsync

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
    suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /**
     * This endpoint can be used to update the `payment_provider`, `payment_provider_id`, `name`,
     * `email`, `email_delivery`, `tax_id`, `auto_collection`, `metadata`, `shipping_address`,
     * `billing_address`, and `additional_emails` of an existing customer. Other fields on a
     * customer are currently immutable.
     */
    suspend fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see [update] */
    suspend fun update(customerId: String, requestOptions: RequestOptions): Customer =
        update(customerId, CustomerUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all customers for an account. The list of customers is
     * ordered starting from the most recently created customer. This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     *
     * See [Customer](/core-concepts##customer) for an overview of the customer model.
     */
    suspend fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CustomerListPageAsync =
        list(CustomerListParams.none(), requestOptions)

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
    suspend fun delete(
        customerId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(customerId: String, requestOptions: RequestOptions) =
        delete(customerId, CustomerDeleteParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch customer details given an identifier. If the `Customer` is in
     * the process of being deleted, only the properties `id` and `deleted: true` will be returned.
     *
     * See the [Customer resource](/core-concepts#customer) for a full discussion of the Customer
     * model.
     */
    suspend fun fetch(
        customerId: String,
        params: CustomerFetchParams = CustomerFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = fetch(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [fetch] */
    suspend fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see [fetch] */
    suspend fun fetch(customerId: String, requestOptions: RequestOptions): Customer =
        fetch(customerId, CustomerFetchParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)).
     *
     * Note that the resource and semantics of this endpoint exactly mirror
     * [Get Customer](fetch-customer).
     */
    suspend fun fetchByExternalId(
        externalCustomerId: String,
        params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer =
        fetchByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [fetchByExternalId] */
    suspend fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see [fetchByExternalId] */
    suspend fun fetchByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): Customer =
        fetchByExternalId(
            externalCustomerId,
            CustomerFetchByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    suspend fun syncPaymentMethodsFromGateway(
        customerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayParams =
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        syncPaymentMethodsFromGateway(
            params.toBuilder().customerId(customerId).build(),
            requestOptions,
        )

    /** @see [syncPaymentMethodsFromGateway] */
    suspend fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [syncPaymentMethodsFromGateway] */
    suspend fun syncPaymentMethodsFromGateway(customerId: String, requestOptions: RequestOptions) =
        syncPaymentMethodsFromGateway(
            customerId,
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
            requestOptions,
        )

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ) =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId,
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint is used to update customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)). Note that the resource and
     * semantics of this endpoint exactly mirror [Update Customer](update-customer).
     */
    suspend fun updateByExternalId(
        id: String,
        params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = updateByExternalId(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateByExternalId] */
    suspend fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see [updateByExternalId] */
    suspend fun updateByExternalId(id: String, requestOptions: RequestOptions): Customer =
        updateByExternalId(id, CustomerUpdateByExternalIdParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun costs(): CostServiceAsync.WithRawResponse

        fun credits(): CreditServiceAsync.WithRawResponse

        fun balanceTransactions(): BalanceTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /**
         * Returns a raw HTTP response for `put /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            update(customerId, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPageAsync> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            customerId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(customerId: String, requestOptions: RequestOptions): HttpResponse =
            delete(customerId, CustomerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            customerId: String,
            params: CustomerFetchParams = CustomerFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            fetch(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> = fetch(customerId, CustomerFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerServiceAsync.fetchByExternalId].
         */
        @MustBeClosed
        suspend fun fetchByExternalId(
            externalCustomerId: String,
            params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            fetchByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [fetchByExternalId] */
        @MustBeClosed
        suspend fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see [fetchByExternalId] */
        @MustBeClosed
        suspend fun fetchByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            fetchByExternalId(
                externalCustomerId,
                CustomerFetchByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /customers/{customer_id}/sync_payment_methods_from_gateway`, but is otherwise the same as
         * [CustomerServiceAsync.syncPaymentMethodsFromGateway].
         */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGateway(
            customerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayParams =
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            syncPaymentMethodsFromGateway(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGateway(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            syncPaymentMethodsFromGateway(
                customerId,
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway`,
         * but is otherwise the same as
         * [CustomerServiceAsync.syncPaymentMethodsFromGatewayByExternalCustomerId].
         */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        suspend fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                externalCustomerId,
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerServiceAsync.updateByExternalId].
         */
        @MustBeClosed
        suspend fun updateByExternalId(
            id: String,
            params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            updateByExternalId(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateByExternalId] */
        @MustBeClosed
        suspend fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see [updateByExternalId] */
        @MustBeClosed
        suspend fun updateByExternalId(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            updateByExternalId(id, CustomerUpdateByExternalIdParams.none(), requestOptions)
    }
}
