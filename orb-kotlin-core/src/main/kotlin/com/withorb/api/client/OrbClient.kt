// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.BetaService
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.services.blocking.CreditBlockService
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import com.withorb.api.services.blocking.EventService
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.services.blocking.InvoiceService
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.services.blocking.LicenseService
import com.withorb.api.services.blocking.LicenseTypeService
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.services.blocking.PriceService
import com.withorb.api.services.blocking.SubscriptionChangeService
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.TopLevelService
import com.withorb.api.services.blocking.WebhookService

/**
 * A client for interacting with the Orb REST API synchronously. You can also switch to asynchronous
 * execution via the [async] method.
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
interface OrbClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): OrbClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient

    fun topLevel(): TopLevelService

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun beta(): BetaService

    /**
     * A coupon represents a reusable discount configuration that can be applied either as a fixed
     * or percentage amount to an invoice or subscription. Coupons are activated using a redemption
     * code, which applies the discount to a subscription or invoice. The duration of a coupon
     * determines how long it remains available for use by end users.
     */
    fun coupons(): CouponService

    /**
     * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been applied
     * to a particular invoice.
     */
    fun creditNotes(): CreditNoteService

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
    fun customers(): CustomerService

    /**
     * The [Event](/core-concepts#event) resource represents a usage event that has been created for
     * a customer. Events are the core of Orb's usage-based billing model, and are used to calculate
     * the usage charges for a given billing period.
     */
    fun events(): EventService

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    fun invoiceLineItems(): InvoiceLineItemService

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    fun invoices(): InvoiceService

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    fun items(): ItemService

    /**
     * The Metric resource represents a calculation of a quantity based on events. Metrics are
     * defined by the query that transforms raw usage events into meaningful values for your
     * customers.
     */
    fun metrics(): MetricService

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun plans(): PlanService

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
    fun prices(): PriceService

    fun subscriptions(): SubscriptionService

    /**
     * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
     * balance and trigger webhooks when a threshold is exceeded.
     *
     * Alerts created through the API can be scoped to either customers or subscriptions.
     */
    fun alerts(): AlertService

    fun dimensionalPriceGroups(): DimensionalPriceGroupService

    fun subscriptionChanges(): SubscriptionChangeService

    fun webhooks(): WebhookService

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    fun creditBlocks(): CreditBlockService

    /**
     * The LicenseType resource represents a type of license that can be assigned to users. License
     * types are used during billing by grouping metrics on the configured grouping key.
     */
    fun licenseTypes(): LicenseTypeService

    fun licenses(): LicenseService

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

    /** A view of [OrbClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient.WithRawResponse

        fun topLevel(): TopLevelService.WithRawResponse

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun beta(): BetaService.WithRawResponse

        /**
         * A coupon represents a reusable discount configuration that can be applied either as a
         * fixed or percentage amount to an invoice or subscription. Coupons are activated using a
         * redemption code, which applies the discount to a subscription or invoice. The duration of
         * a coupon determines how long it remains available for use by end users.
         */
        fun coupons(): CouponService.WithRawResponse

        /**
         * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been
         * applied to a particular invoice.
         */
        fun creditNotes(): CreditNoteService.WithRawResponse

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
        fun customers(): CustomerService.WithRawResponse

        /**
         * The [Event](/core-concepts#event) resource represents a usage event that has been created
         * for a customer. Events are the core of Orb's usage-based billing model, and are used to
         * calculate the usage charges for a given billing period.
         */
        fun events(): EventService.WithRawResponse

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        fun invoiceLineItems(): InvoiceLineItemService.WithRawResponse

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        fun invoices(): InvoiceService.WithRawResponse

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        fun items(): ItemService.WithRawResponse

        /**
         * The Metric resource represents a calculation of a quantity based on events. Metrics are
         * defined by the query that transforms raw usage events into meaningful values for your
         * customers.
         */
        fun metrics(): MetricService.WithRawResponse

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plans(): PlanService.WithRawResponse

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
        fun prices(): PriceService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         */
        fun alerts(): AlertService.WithRawResponse

        fun dimensionalPriceGroups(): DimensionalPriceGroupService.WithRawResponse

        fun subscriptionChanges(): SubscriptionChangeService.WithRawResponse

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        fun creditBlocks(): CreditBlockService.WithRawResponse

        /**
         * The LicenseType resource represents a type of license that can be assigned to users.
         * License types are used during billing by grouping metrics on the configured grouping key.
         */
        fun licenseTypes(): LicenseTypeService.WithRawResponse

        fun licenses(): LicenseService.WithRawResponse
    }
}
