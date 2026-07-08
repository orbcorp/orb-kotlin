// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.async.AlertServiceAsync
import com.withorb.api.services.async.BetaServiceAsync
import com.withorb.api.services.async.CouponServiceAsync
import com.withorb.api.services.async.CreditBlockServiceAsync
import com.withorb.api.services.async.CreditNoteServiceAsync
import com.withorb.api.services.async.CustomerServiceAsync
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import com.withorb.api.services.async.EventServiceAsync
import com.withorb.api.services.async.InvoiceLineItemServiceAsync
import com.withorb.api.services.async.InvoiceServiceAsync
import com.withorb.api.services.async.ItemServiceAsync
import com.withorb.api.services.async.LicenseServiceAsync
import com.withorb.api.services.async.LicenseTypeServiceAsync
import com.withorb.api.services.async.MetricServiceAsync
import com.withorb.api.services.async.PlanServiceAsync
import com.withorb.api.services.async.PriceServiceAsync
import com.withorb.api.services.async.SubscriptionChangeServiceAsync
import com.withorb.api.services.async.SubscriptionServiceAsync
import com.withorb.api.services.async.TopLevelServiceAsync

/**
 * A client for interacting with the Orb REST API asynchronously. You can also switch to synchronous
 * execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface OrbClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): OrbClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClientAsync

    fun topLevel(): TopLevelServiceAsync

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun beta(): BetaServiceAsync

    /**
     * A coupon represents a reusable discount configuration that can be applied either as a fixed
     * or percentage amount to an invoice or subscription. Coupons are activated using a redemption
     * code, which applies the discount to a subscription or invoice. The duration of a coupon
     * determines how long it remains available for use by end users.
     */
    fun coupons(): CouponServiceAsync

    /**
     * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been applied
     * to a particular invoice.
     */
    fun creditNotes(): CreditNoteServiceAsync

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
     * information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](/essentials/timezones) for information on what this
     * timezone parameter influences within Orb.
     */
    fun customers(): CustomerServiceAsync

    /**
     * The [Event](/core-concepts#event) resource represents a usage event that has been created for
     * a customer. Events are the core of Orb's usage-based billing model, and are used to calculate
     * the usage charges for a given billing period.
     */
    fun events(): EventServiceAsync

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    fun invoiceLineItems(): InvoiceLineItemServiceAsync

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    fun invoices(): InvoiceServiceAsync

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    fun items(): ItemServiceAsync

    /**
     * The Metric resource represents a calculation of a quantity based on events. Metrics are
     * defined by the query that transforms raw usage events into meaningful values for your
     * customers.
     */
    fun metrics(): MetricServiceAsync

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun plans(): PlanServiceAsync

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
    fun prices(): PriceServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    /**
     * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
     * balance and trigger webhooks when a threshold is exceeded.
     *
     * Alerts created through the API can be scoped to either customers or subscriptions.
     */
    fun alerts(): AlertServiceAsync

    fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync

    fun subscriptionChanges(): SubscriptionChangeServiceAsync

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun creditBlocks(): CreditBlockServiceAsync

    /**
     * The LicenseType resource represents a type of license that can be assigned to users. License
     * types are used during billing by grouping metrics on the configured grouping key.
     */
    fun licenseTypes(): LicenseTypeServiceAsync

    fun licenses(): LicenseServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [OrbClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClientAsync.WithRawResponse

        fun topLevel(): TopLevelServiceAsync.WithRawResponse

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun beta(): BetaServiceAsync.WithRawResponse

        /**
         * A coupon represents a reusable discount configuration that can be applied either as a
         * fixed or percentage amount to an invoice or subscription. Coupons are activated using a
         * redemption code, which applies the discount to a subscription or invoice. The duration of
         * a coupon determines how long it remains available for use by end users.
         */
        fun coupons(): CouponServiceAsync.WithRawResponse

        /**
         * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been
         * applied to a particular invoice.
         */
        fun creditNotes(): CreditNoteServiceAsync.WithRawResponse

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
         * information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](/essentials/timezones) for information on
         * what this timezone parameter influences within Orb.
         */
        fun customers(): CustomerServiceAsync.WithRawResponse

        /**
         * The [Event](/core-concepts#event) resource represents a usage event that has been created
         * for a customer. Events are the core of Orb's usage-based billing model, and are used to
         * calculate the usage charges for a given billing period.
         */
        fun events(): EventServiceAsync.WithRawResponse

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        fun invoiceLineItems(): InvoiceLineItemServiceAsync.WithRawResponse

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        fun invoices(): InvoiceServiceAsync.WithRawResponse

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        fun items(): ItemServiceAsync.WithRawResponse

        /**
         * The Metric resource represents a calculation of a quantity based on events. Metrics are
         * defined by the query that transforms raw usage events into meaningful values for your
         * customers.
         */
        fun metrics(): MetricServiceAsync.WithRawResponse

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plans(): PlanServiceAsync.WithRawResponse

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun prices(): PriceServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         */
        fun alerts(): AlertServiceAsync.WithRawResponse

        fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync.WithRawResponse

        fun subscriptionChanges(): SubscriptionChangeServiceAsync.WithRawResponse

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        fun creditBlocks(): CreditBlockServiceAsync.WithRawResponse

        /**
         * The LicenseType resource represents a type of license that can be assigned to users.
         * License types are used during billing by grouping metrics on the configured grouping key.
         */
        fun licenseTypes(): LicenseTypeServiceAsync.WithRawResponse

        fun licenses(): LicenseServiceAsync.WithRawResponse
    }
}
