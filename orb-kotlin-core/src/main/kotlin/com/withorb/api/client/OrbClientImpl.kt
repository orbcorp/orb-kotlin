// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.client

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.getPackageVersion
import com.withorb.api.services.blocking.AlertService
import com.withorb.api.services.blocking.AlertServiceImpl
import com.withorb.api.services.blocking.BetaService
import com.withorb.api.services.blocking.BetaServiceImpl
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.services.blocking.CouponServiceImpl
import com.withorb.api.services.blocking.CreditBlockService
import com.withorb.api.services.blocking.CreditBlockServiceImpl
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.services.blocking.CreditNoteServiceImpl
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.services.blocking.CustomerServiceImpl
import com.withorb.api.services.blocking.DimensionalPriceGroupService
import com.withorb.api.services.blocking.DimensionalPriceGroupServiceImpl
import com.withorb.api.services.blocking.EventService
import com.withorb.api.services.blocking.EventServiceImpl
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.services.blocking.InvoiceLineItemServiceImpl
import com.withorb.api.services.blocking.InvoiceService
import com.withorb.api.services.blocking.InvoiceServiceImpl
import com.withorb.api.services.blocking.ItemService
import com.withorb.api.services.blocking.ItemServiceImpl
import com.withorb.api.services.blocking.LicenseService
import com.withorb.api.services.blocking.LicenseServiceImpl
import com.withorb.api.services.blocking.LicenseTypeService
import com.withorb.api.services.blocking.LicenseTypeServiceImpl
import com.withorb.api.services.blocking.MetricService
import com.withorb.api.services.blocking.MetricServiceImpl
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.services.blocking.PlanServiceImpl
import com.withorb.api.services.blocking.PriceService
import com.withorb.api.services.blocking.PriceServiceImpl
import com.withorb.api.services.blocking.SubscriptionChangeService
import com.withorb.api.services.blocking.SubscriptionChangeServiceImpl
import com.withorb.api.services.blocking.SubscriptionService
import com.withorb.api.services.blocking.SubscriptionServiceImpl
import com.withorb.api.services.blocking.TopLevelService
import com.withorb.api.services.blocking.TopLevelServiceImpl

class OrbClientImpl(private val clientOptions: ClientOptions) : OrbClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OrbClientAsync by lazy { OrbClientAsyncImpl(clientOptions) }

    private val withRawResponse: OrbClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val topLevel: TopLevelService by lazy {
        TopLevelServiceImpl(clientOptionsWithUserAgent)
    }

    private val beta: BetaService by lazy { BetaServiceImpl(clientOptionsWithUserAgent) }

    private val coupons: CouponService by lazy { CouponServiceImpl(clientOptionsWithUserAgent) }

    private val creditNotes: CreditNoteService by lazy {
        CreditNoteServiceImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerService by lazy {
        CustomerServiceImpl(clientOptionsWithUserAgent)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val invoiceLineItems: InvoiceLineItemService by lazy {
        InvoiceLineItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptionsWithUserAgent) }

    private val metrics: MetricService by lazy { MetricServiceImpl(clientOptionsWithUserAgent) }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptionsWithUserAgent) }

    private val prices: PriceService by lazy { PriceServiceImpl(clientOptionsWithUserAgent) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptionsWithUserAgent) }

    private val dimensionalPriceGroups: DimensionalPriceGroupService by lazy {
        DimensionalPriceGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val subscriptionChanges: SubscriptionChangeService by lazy {
        SubscriptionChangeServiceImpl(clientOptionsWithUserAgent)
    }

    private val creditBlocks: CreditBlockService by lazy {
        CreditBlockServiceImpl(clientOptionsWithUserAgent)
    }

    private val licenseTypes: LicenseTypeService by lazy {
        LicenseTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val licenses: LicenseService by lazy { LicenseServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): OrbClientAsync = async

    override fun withRawResponse(): OrbClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrbClient =
        OrbClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun topLevel(): TopLevelService = topLevel

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    override fun beta(): BetaService = beta

    /**
     * A coupon represents a reusable discount configuration that can be applied either as a fixed
     * or percentage amount to an invoice or subscription. Coupons are activated using a redemption
     * code, which applies the discount to a subscription or invoice. The duration of a coupon
     * determines how long it remains available for use by end users.
     */
    override fun coupons(): CouponService = coupons

    /**
     * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been applied
     * to a particular invoice.
     */
    override fun creditNotes(): CreditNoteService = creditNotes

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
    override fun customers(): CustomerService = customers

    /**
     * The [Event](/core-concepts#event) resource represents a usage event that has been created for
     * a customer. Events are the core of Orb's usage-based billing model, and are used to calculate
     * the usage charges for a given billing period.
     */
    override fun events(): EventService = events

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    override fun invoiceLineItems(): InvoiceLineItemService = invoiceLineItems

    /**
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     */
    override fun invoices(): InvoiceService = invoices

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    override fun items(): ItemService = items

    /**
     * The Metric resource represents a calculation of a quantity based on events. Metrics are
     * defined by the query that transforms raw usage events into meaningful values for your
     * customers.
     */
    override fun metrics(): MetricService = metrics

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    override fun plans(): PlanService = plans

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
    override fun prices(): PriceService = prices

    override fun subscriptions(): SubscriptionService = subscriptions

    /**
     * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
     * balance and trigger webhooks when a threshold is exceeded.
     *
     * Alerts created through the API can be scoped to either customers or subscriptions.
     */
    override fun alerts(): AlertService = alerts

    override fun dimensionalPriceGroups(): DimensionalPriceGroupService = dimensionalPriceGroups

    override fun subscriptionChanges(): SubscriptionChangeService = subscriptionChanges

    /**
     * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
     * within Orb.
     */
    override fun creditBlocks(): CreditBlockService = creditBlocks

    /**
     * The LicenseType resource represents a type of license that can be assigned to users. License
     * types are used during billing by grouping metrics on the configured grouping key.
     */
    override fun licenseTypes(): LicenseTypeService = licenseTypes

    override fun licenses(): LicenseService = licenses

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrbClient.WithRawResponse {

        private val topLevel: TopLevelService.WithRawResponse by lazy {
            TopLevelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val beta: BetaService.WithRawResponse by lazy {
            BetaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val coupons: CouponService.WithRawResponse by lazy {
            CouponServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditNotes: CreditNoteService.WithRawResponse by lazy {
            CreditNoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoiceLineItems: InvoiceLineItemService.WithRawResponse by lazy {
            InvoiceLineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricService.WithRawResponse by lazy {
            MetricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val prices: PriceService.WithRawResponse by lazy {
            PriceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dimensionalPriceGroups: DimensionalPriceGroupService.WithRawResponse by lazy {
            DimensionalPriceGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptionChanges: SubscriptionChangeService.WithRawResponse by lazy {
            SubscriptionChangeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditBlocks: CreditBlockService.WithRawResponse by lazy {
            CreditBlockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseTypes: LicenseTypeService.WithRawResponse by lazy {
            LicenseTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenses: LicenseService.WithRawResponse by lazy {
            LicenseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrbClient.WithRawResponse =
            OrbClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun topLevel(): TopLevelService.WithRawResponse = topLevel

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        override fun beta(): BetaService.WithRawResponse = beta

        /**
         * A coupon represents a reusable discount configuration that can be applied either as a
         * fixed or percentage amount to an invoice or subscription. Coupons are activated using a
         * redemption code, which applies the discount to a subscription or invoice. The duration of
         * a coupon determines how long it remains available for use by end users.
         */
        override fun coupons(): CouponService.WithRawResponse = coupons

        /**
         * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been
         * applied to a particular invoice.
         */
        override fun creditNotes(): CreditNoteService.WithRawResponse = creditNotes

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
        override fun customers(): CustomerService.WithRawResponse = customers

        /**
         * The [Event](/core-concepts#event) resource represents a usage event that has been created
         * for a customer. Events are the core of Orb's usage-based billing model, and are used to
         * calculate the usage charges for a given billing period.
         */
        override fun events(): EventService.WithRawResponse = events

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        override fun invoiceLineItems(): InvoiceLineItemService.WithRawResponse = invoiceLineItems

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        override fun invoices(): InvoiceService.WithRawResponse = invoices

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        override fun items(): ItemService.WithRawResponse = items

        /**
         * The Metric resource represents a calculation of a quantity based on events. Metrics are
         * defined by the query that transforms raw usage events into meaningful values for your
         * customers.
         */
        override fun metrics(): MetricService.WithRawResponse = metrics

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        override fun plans(): PlanService.WithRawResponse = plans

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
        override fun prices(): PriceService.WithRawResponse = prices

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         */
        override fun alerts(): AlertService.WithRawResponse = alerts

        override fun dimensionalPriceGroups(): DimensionalPriceGroupService.WithRawResponse =
            dimensionalPriceGroups

        override fun subscriptionChanges(): SubscriptionChangeService.WithRawResponse =
            subscriptionChanges

        /**
         * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits
         * within Orb.
         */
        override fun creditBlocks(): CreditBlockService.WithRawResponse = creditBlocks

        /**
         * The LicenseType resource represents a type of license that can be assigned to users.
         * License types are used during billing by grouping metrics on the configured grouping key.
         */
        override fun licenseTypes(): LicenseTypeService.WithRawResponse = licenseTypes

        override fun licenses(): LicenseService.WithRawResponse = licenses
    }
}
