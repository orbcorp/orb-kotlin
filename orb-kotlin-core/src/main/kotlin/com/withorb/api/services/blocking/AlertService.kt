// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPage
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams

interface AlertService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlertService

    /** This endpoint retrieves an alert by its ID. */
    fun retrieve(
        alertId: String,
        params: AlertRetrieveParams = AlertRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert = retrieve(params.toBuilder().alertId(alertId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /** @see [retrieve] */
    fun retrieve(alertId: String, requestOptions: RequestOptions): Alert =
        retrieve(alertId, AlertRetrieveParams.none(), requestOptions)

    /** This endpoint updates the thresholds of an alert. */
    fun update(
        alertConfigurationId: String,
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert =
        update(
            params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint returns a list of alerts within Orb.
     *
     * The request must specify one of `customer_id`, `external_customer_id`, or `subscription_id`.
     *
     * If querying by subscripion_id, the endpoint will return the subscription level alerts as well
     * as the plan level alerts associated with the subscription.
     *
     * The list of alerts is ordered starting from the most recently created alert. This endpoint
     * follows Orb's [standardized pagination format](/api-reference/pagination).
     */
    fun list(
        params: AlertListParams = AlertListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AlertListPage =
        list(AlertListParams.none(), requestOptions)

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There are three
     * types of alerts that can be scoped to customers: `credit_balance_depleted`,
     * `credit_balance_dropped`, and `credit_balance_recovered`. Customers can have a maximum of one
     * of each type of alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided while
     * `credit_balance_depleted` and `credit_balance_recovered` alerts do not require thresholds.
     */
    fun createForCustomer(
        customerId: String,
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert = createForCustomer(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [createForCustomer] */
    fun createForCustomer(
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There are three
     * types of alerts that can be scoped to customers: `credit_balance_depleted`,
     * `credit_balance_dropped`, and `credit_balance_recovered`. Customers can have a maximum of one
     * of each type of alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided while
     * `credit_balance_depleted` and `credit_balance_recovered` alerts do not require thresholds.
     */
    fun createForExternalCustomer(
        externalCustomerId: String,
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert =
        createForExternalCustomer(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [createForExternalCustomer] */
    fun createForExternalCustomer(
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint is used to create alerts at the subscription level.
     *
     * Subscription level alerts can be one of two types: `usage_exceeded` or `cost_exceeded`. A
     * `usage_exceeded` alert is scoped to a particular metric and is triggered when the usage of
     * that metric exceeds predefined thresholds during the current billing cycle. A `cost_exceeded`
     * alert is triggered when the total amount due during the current billing cycle surpasses
     * predefined thresholds. `cost_exceeded` alerts do not include burndown of pre-purchase
     * credits. Each subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert
     * per metric that is a part of the subscription. Alerts are triggered based on usage or cost
     * conditions met during the current billing cycle.
     */
    fun createForSubscription(
        subscriptionId: String,
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert =
        createForSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see [createForSubscription] */
    fun createForSubscription(
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint allows you to disable an alert. To disable a plan-level alert for a specific
     * subscription, you must include the `subscription_id`. The `subscription_id` is not required
     * for customer or subscription level alerts.
     */
    fun disable(
        alertConfigurationId: String,
        params: AlertDisableParams = AlertDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert =
        disable(
            params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
            requestOptions,
        )

    /** @see [disable] */
    fun disable(
        params: AlertDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /** @see [disable] */
    fun disable(alertConfigurationId: String, requestOptions: RequestOptions): Alert =
        disable(alertConfigurationId, AlertDisableParams.none(), requestOptions)

    /**
     * This endpoint allows you to enable an alert. To enable a plan-level alert for a specific
     * subscription, you must include the `subscription_id`. The `subscription_id` is not required
     * for customer or subscription level alerts.
     */
    fun enable(
        alertConfigurationId: String,
        params: AlertEnableParams = AlertEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert =
        enable(
            params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
            requestOptions,
        )

    /** @see [enable] */
    fun enable(
        params: AlertEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /** @see [enable] */
    fun enable(alertConfigurationId: String, requestOptions: RequestOptions): Alert =
        enable(alertConfigurationId, AlertEnableParams.none(), requestOptions)

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlertService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /alerts/{alert_id}`, but is otherwise the same as
         * [AlertService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            alertId: String,
            params: AlertRetrieveParams = AlertRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            retrieve(params.toBuilder().alertId(alertId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(alertId: String, requestOptions: RequestOptions): HttpResponseFor<Alert> =
            retrieve(alertId, AlertRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /alerts/{alert_configuration_id}`, but is otherwise
         * the same as [AlertService.update].
         */
        @MustBeClosed
        fun update(
            alertConfigurationId: String,
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            update(
                params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `get /alerts`, but is otherwise the same as
         * [AlertService.list].
         */
        @MustBeClosed
        fun list(
            params: AlertListParams = AlertListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AlertListPage> =
            list(AlertListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /alerts/customer_id/{customer_id}`, but is
         * otherwise the same as [AlertService.createForCustomer].
         */
        @MustBeClosed
        fun createForCustomer(
            customerId: String,
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            createForCustomer(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [createForCustomer] */
        @MustBeClosed
        fun createForCustomer(
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post
         * /alerts/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [AlertService.createForExternalCustomer].
         */
        @MustBeClosed
        fun createForExternalCustomer(
            externalCustomerId: String,
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            createForExternalCustomer(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [createForExternalCustomer] */
        @MustBeClosed
        fun createForExternalCustomer(
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post /alerts/subscription_id/{subscription_id}`, but is
         * otherwise the same as [AlertService.createForSubscription].
         */
        @MustBeClosed
        fun createForSubscription(
            subscriptionId: String,
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            createForSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see [createForSubscription] */
        @MustBeClosed
        fun createForSubscription(
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/disable`, but is
         * otherwise the same as [AlertService.disable].
         */
        @MustBeClosed
        fun disable(
            alertConfigurationId: String,
            params: AlertDisableParams = AlertDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            disable(
                params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
                requestOptions,
            )

        /** @see [disable] */
        @MustBeClosed
        fun disable(
            params: AlertDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /** @see [disable] */
        @MustBeClosed
        fun disable(
            alertConfigurationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> =
            disable(alertConfigurationId, AlertDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/enable`, but is
         * otherwise the same as [AlertService.enable].
         */
        @MustBeClosed
        fun enable(
            alertConfigurationId: String,
            params: AlertEnableParams = AlertEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert> =
            enable(
                params.toBuilder().alertConfigurationId(alertConfigurationId).build(),
                requestOptions,
            )

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            params: AlertEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            alertConfigurationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> =
            enable(alertConfigurationId, AlertEnableParams.none(), requestOptions)
    }
}
