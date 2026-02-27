// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.services.async.AlertServiceAsync
import com.withorb.api.services.async.AlertServiceAsyncImpl
import com.withorb.api.services.async.BetaServiceAsync
import com.withorb.api.services.async.BetaServiceAsyncImpl
import com.withorb.api.services.async.CouponServiceAsync
import com.withorb.api.services.async.CouponServiceAsyncImpl
import com.withorb.api.services.async.CreditBlockServiceAsync
import com.withorb.api.services.async.CreditBlockServiceAsyncImpl
import com.withorb.api.services.async.CreditNoteServiceAsync
import com.withorb.api.services.async.CreditNoteServiceAsyncImpl
import com.withorb.api.services.async.CustomerServiceAsync
import com.withorb.api.services.async.CustomerServiceAsyncImpl
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsyncImpl
import com.withorb.api.services.async.EventServiceAsync
import com.withorb.api.services.async.EventServiceAsyncImpl
import com.withorb.api.services.async.InvoiceLineItemServiceAsync
import com.withorb.api.services.async.InvoiceLineItemServiceAsyncImpl
import com.withorb.api.services.async.InvoiceServiceAsync
import com.withorb.api.services.async.InvoiceServiceAsyncImpl
import com.withorb.api.services.async.ItemServiceAsync
import com.withorb.api.services.async.ItemServiceAsyncImpl
import com.withorb.api.services.async.LicenseServiceAsync
import com.withorb.api.services.async.LicenseServiceAsyncImpl
import com.withorb.api.services.async.LicenseTypeServiceAsync
import com.withorb.api.services.async.LicenseTypeServiceAsyncImpl
import com.withorb.api.services.async.MetricServiceAsync
import com.withorb.api.services.async.MetricServiceAsyncImpl
import com.withorb.api.services.async.PlanServiceAsync
import com.withorb.api.services.async.PlanServiceAsyncImpl
import com.withorb.api.services.async.PriceServiceAsync
import com.withorb.api.services.async.PriceServiceAsyncImpl
import com.withorb.api.services.async.SubscriptionChangeServiceAsync
import com.withorb.api.services.async.SubscriptionChangeServiceAsyncImpl
import com.withorb.api.services.async.SubscriptionServiceAsync
import com.withorb.api.services.async.SubscriptionServiceAsyncImpl
import com.withorb.api.services.async.TopLevelServiceAsync
import com.withorb.api.services.async.TopLevelServiceAsyncImpl

class OrbClientAsyncImpl(private val clientOptions: ClientOptions) : OrbClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OrbClient by lazy { OrbClientImpl(clientOptions) }

    private val withRawResponse: OrbClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val topLevel: TopLevelServiceAsync by lazy {
        TopLevelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val beta: BetaServiceAsync by lazy { BetaServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val coupons: CouponServiceAsync by lazy {
        CouponServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val creditNotes: CreditNoteServiceAsync by lazy {
        CreditNoteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerServiceAsync by lazy {
        CustomerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoiceLineItems: InvoiceLineItemServiceAsync by lazy {
        InvoiceLineItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val metrics: MetricServiceAsync by lazy {
        MetricServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val prices: PriceServiceAsync by lazy {
        PriceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val alerts: AlertServiceAsync by lazy {
        AlertServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dimensionalPriceGroups: DimensionalPriceGroupServiceAsync by lazy {
        DimensionalPriceGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscriptionChanges: SubscriptionChangeServiceAsync by lazy {
        SubscriptionChangeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val creditBlocks: CreditBlockServiceAsync by lazy {
        CreditBlockServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val licenseTypes: LicenseTypeServiceAsync by lazy {
        LicenseTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val licenses: LicenseServiceAsync by lazy {
        LicenseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OrbClient = sync

    override fun withRawResponse(): OrbClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClientAsync =
        OrbClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun topLevel(): TopLevelServiceAsync = topLevel

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    override fun beta(): BetaServiceAsync = beta

    /**
     * A coupon represents a reusable discount configuration that can be applied either as a fixed
     * or percentage amount to an invoice or subscription. Coupons are activated using a redemption
     * code, which applies the discount to a subscription or invoice. The duration of a coupon
     * determines how long it remains available for use by end users.
     */
    override fun coupons(): CouponServiceAsync = coupons

    /**
     * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been applied
     * to a particular invoice.
     */
    override fun creditNotes(): CreditNoteServiceAsync = creditNotes

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
    override fun customers(): CustomerServiceAsync = customers

    /**
     * The [Event](/core-concepts#event) resource represents a usage event that has been created for
     * a customer. Events are the core of Orb's usage-based billing model, and are used to calculate
     * the usage charges for a given billing period.
     */
    override fun events(): EventServiceAsync = events

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    override fun invoiceLineItems(): InvoiceLineItemServiceAsync = invoiceLineItems

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    override fun invoices(): InvoiceServiceAsync = invoices

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    override fun items(): ItemServiceAsync = items

    /**
     * The Metric resource represents a calculation of a quantity based on events. Metrics are
     * defined by the query that transforms raw usage events into meaningful values for your
     * customers.
     */
    override fun metrics(): MetricServiceAsync = metrics

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    override fun plans(): PlanServiceAsync = plans

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
    override fun prices(): PriceServiceAsync = prices

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    /**
     * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
     * balance and trigger webhooks when a threshold is exceeded.
     *
     * Alerts created through the API can be scoped to either customers or subscriptions.
     */
    override fun alerts(): AlertServiceAsync = alerts

    override fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync =
        dimensionalPriceGroups

    override fun subscriptionChanges(): SubscriptionChangeServiceAsync = subscriptionChanges

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    override fun creditBlocks(): CreditBlockServiceAsync = creditBlocks

    /**
     * The LicenseType resource represents a type of license that can be assigned to users. License
     * types are used during billing by grouping metrics on the configured grouping key.
     */
    override fun licenseTypes(): LicenseTypeServiceAsync = licenseTypes

    override fun licenses(): LicenseServiceAsync = licenses

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbClientAsync.WithRawResponse {

        private val topLevel: TopLevelServiceAsync.WithRawResponse by lazy {
            TopLevelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beta: BetaServiceAsync.WithRawResponse by lazy {
            BetaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponServiceAsync.WithRawResponse by lazy {
            CouponServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditNotes: CreditNoteServiceAsync.WithRawResponse by lazy {
            CreditNoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerServiceAsync.WithRawResponse by lazy {
            CustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoiceLineItems: InvoiceLineItemServiceAsync.WithRawResponse by lazy {
            InvoiceLineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricServiceAsync.WithRawResponse by lazy {
            MetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val prices: PriceServiceAsync.WithRawResponse by lazy {
            PriceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val alerts: AlertServiceAsync.WithRawResponse by lazy {
            AlertServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dimensionalPriceGroups:
            DimensionalPriceGroupServiceAsync.WithRawResponse by lazy {
            DimensionalPriceGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptionChanges: SubscriptionChangeServiceAsync.WithRawResponse by lazy {
            SubscriptionChangeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditBlocks: CreditBlockServiceAsync.WithRawResponse by lazy {
            CreditBlockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseTypes: LicenseTypeServiceAsync.WithRawResponse by lazy {
            LicenseTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenses: LicenseServiceAsync.WithRawResponse by lazy {
            LicenseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrbClientAsync.WithRawResponse =
            OrbClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun topLevel(): TopLevelServiceAsync.WithRawResponse = topLevel

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        override fun beta(): BetaServiceAsync.WithRawResponse = beta

        /**
         * A coupon represents a reusable discount configuration that can be applied either as a
         * fixed or percentage amount to an invoice or subscription. Coupons are activated using a
         * redemption code, which applies the discount to a subscription or invoice. The duration of
         * a coupon determines how long it remains available for use by end users.
         */
        override fun coupons(): CouponServiceAsync.WithRawResponse = coupons

        /**
         * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been
         * applied to a particular invoice.
         */
        override fun creditNotes(): CreditNoteServiceAsync.WithRawResponse = creditNotes

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
        override fun customers(): CustomerServiceAsync.WithRawResponse = customers

        /**
         * The [Event](/core-concepts#event) resource represents a usage event that has been created
         * for a customer. Events are the core of Orb's usage-based billing model, and are used to
         * calculate the usage charges for a given billing period.
         */
        override fun events(): EventServiceAsync.WithRawResponse = events

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        override fun invoiceLineItems(): InvoiceLineItemServiceAsync.WithRawResponse =
            invoiceLineItems

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        override fun items(): ItemServiceAsync.WithRawResponse = items

        /**
         * The Metric resource represents a calculation of a quantity based on events. Metrics are
         * defined by the query that transforms raw usage events into meaningful values for your
         * customers.
         */
        override fun metrics(): MetricServiceAsync.WithRawResponse = metrics

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        override fun plans(): PlanServiceAsync.WithRawResponse = plans

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
        override fun prices(): PriceServiceAsync.WithRawResponse = prices

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         */
        override fun alerts(): AlertServiceAsync.WithRawResponse = alerts

        override fun dimensionalPriceGroups(): DimensionalPriceGroupServiceAsync.WithRawResponse =
            dimensionalPriceGroups

        override fun subscriptionChanges(): SubscriptionChangeServiceAsync.WithRawResponse =
            subscriptionChanges

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        override fun creditBlocks(): CreditBlockServiceAsync.WithRawResponse = creditBlocks

        /**
         * The LicenseType resource represents a type of license that can be assigned to users.
         * License types are used during billing by grouping metrics on the configured grouping key.
         */
        override fun licenseTypes(): LicenseTypeServiceAsync.WithRawResponse = licenseTypes

        override fun licenses(): LicenseServiceAsync.WithRawResponse = licenses
    }
}
