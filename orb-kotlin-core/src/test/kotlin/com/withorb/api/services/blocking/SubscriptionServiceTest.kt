// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.SubscriptionFetchScheduleParams
import com.withorb.api.models.SubscriptionListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.create(
                SubscriptionCreateParams.builder()
                    .alignBillingWithSubscriptionStartDate(true)
                    .autoCollection(true)
                    .awsRegion("aws_region")
                    .billingCycleAnchorConfiguration(
                        SubscriptionCreateParams.BillingCycleAnchorConfiguration.builder()
                            .day(31L)
                            .month(12L)
                            .year(123L)
                            .build()
                    )
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(42.23)
                    .customerId("customer_id")
                    .defaultInvoiceMemo("default_invoice_memo")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalCustomerId("external_customer_id")
                    .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
                    .externalMarketplaceReportingId("external_marketplace_reporting_id")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .initialPhaseOrder(123L)
                    .invoicingThreshold("10.00")
                    .metadata(SubscriptionCreateParams.Metadata.builder().build())
                    .netTerms(123L)
                    .perCreditOverageAmount(42.23)
                    .planId("ZMwNQefe7J3ecf7W")
                    .priceOverrides(
                        listOf(
                            SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
                                    .id("id")
                                    .modelType(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .ModelType
                                            .UNIT
                                    )
                                    .unitConfig(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .conversionRate(42.23)
                                    .currency("currency")
                                    .discount(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .Discount
                                            .builder()
                                            .discountType(
                                                SubscriptionCreateParams.PriceOverride
                                                    .OverrideUnitPrice
                                                    .Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .appliesToPriceIds(listOf("string"))
                                            .percentageDiscount(42.23)
                                            .trialAmountDiscount("trial_amount_discount")
                                            .usageDiscount(42.23)
                                            .build()
                                    )
                                    .fixedPriceQuantity(42.23)
                                    .maximumAmount("1.23")
                                    .minimumAmount("1.23")
                                    .build()
                            )
                        )
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscription_id")
                    .autoCollection(true)
                    .defaultInvoiceMemo("default_invoice_memo")
                    .invoicingThreshold("10.00")
                    .metadata(SubscriptionUpdateParams.Metadata.builder().build())
                    .netTerms(123L)
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptions = subscriptionService.list(SubscriptionListParams.builder().build())
        println(subscriptions)
        subscriptions.data().forEach { it.validate() }
    }

    @Test
    fun callCancel() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.cancel(
                SubscriptionCancelParams.builder()
                    .subscriptionId("subscription_id")
                    .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.fetch(
                SubscriptionFetchParams.builder().subscriptionId("subscription_id").build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callFetchCosts() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionFetchCostsResponse =
            subscriptionService.fetchCosts(
                SubscriptionFetchCostsParams.builder()
                    .subscriptionId("subscription_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
                    .build()
            )
        println(subscriptionFetchCostsResponse)
        subscriptionFetchCostsResponse.validate()
    }

    @Test
    fun callFetchSchedule() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionScheduleItems =
            subscriptionService.fetchSchedule(
                SubscriptionFetchScheduleParams.builder().subscriptionId("subscription_id").build()
            )
        println(subscriptionScheduleItems)
        subscriptionScheduleItems.data().forEach { it.validate() }
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    fun callFetchUsage() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUsage =
            subscriptionService.fetchUsage(
                SubscriptionFetchUsageParams.builder()
                    .subscriptionId("subscription_id")
                    .billableMetricId("billable_metric_id")
                    .firstDimensionKey("first_dimension_key")
                    .firstDimensionValue("first_dimension_value")
                    .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                    .groupBy("group_by")
                    .secondDimensionKey("second_dimension_key")
                    .secondDimensionValue("second_dimension_value")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
                    .build()
            )
        println(subscriptionUsage)
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    fun callPriceIntervals() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.priceIntervals(
                SubscriptionPriceIntervalsParams.builder()
                    .subscriptionId("subscription_id")
                    .add(
                        listOf(
                            SubscriptionPriceIntervalsParams.Add.builder()
                                .startDate(
                                    SubscriptionPriceIntervalsParams.Add.StartDate.ofOffsetDateTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                )
                                .allocationPrice(
                                    SubscriptionPriceIntervalsParams.Add.AllocationPrice.builder()
                                        .amount("10.00")
                                        .cadence(
                                            SubscriptionPriceIntervalsParams.Add.AllocationPrice
                                                .Cadence
                                                .ONE_TIME
                                        )
                                        .currency("USD")
                                        .expiresAtEndOfCadence(true)
                                        .build()
                                )
                                .discounts(
                                    listOf(
                                        SubscriptionPriceIntervalsParams.Add.Discount
                                            .ofAmountDiscountCreationParams(
                                                SubscriptionPriceIntervalsParams.Add.Discount
                                                    .AmountDiscountCreationParams
                                                    .builder()
                                                    .amountDiscount(42.23)
                                                    .discountType(
                                                        SubscriptionPriceIntervalsParams.Add
                                                            .Discount
                                                            .AmountDiscountCreationParams
                                                            .DiscountType
                                                            .AMOUNT
                                                    )
                                                    .build()
                                            )
                                    )
                                )
                                .endDate(
                                    SubscriptionPriceIntervalsParams.Add.EndDate.ofOffsetDateTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                )
                                .externalPriceId("external_price_id")
                                .fixedFeeQuantityTransitions(
                                    listOf(
                                        SubscriptionPriceIntervalsParams.Add
                                            .FixedFeeQuantityTransition
                                            .builder()
                                            .effectiveDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .quantity(123L)
                                            .build()
                                    )
                                )
                                .maximumAmount(42.23)
                                .minimumAmount(42.23)
                                .price(
                                    SubscriptionPriceIntervalsParams.Add.Price
                                        .ofNewFloatingUnitPrice(
                                            SubscriptionPriceIntervalsParams.Add.Price
                                                .NewFloatingUnitPrice
                                                .builder()
                                                .cadence(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .Cadence
                                                        .ANNUAL
                                                )
                                                .currency("currency")
                                                .itemId("item_id")
                                                .modelType(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .ModelType
                                                        .UNIT
                                                )
                                                .name("Annual fee")
                                                .unitConfig(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .UnitConfig
                                                        .builder()
                                                        .unitAmount("unit_amount")
                                                        .build()
                                                )
                                                .billableMetricId("billable_metric_id")
                                                .billedInAdvance(true)
                                                .billingCycleConfiguration(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .BillingCycleConfiguration
                                                        .builder()
                                                        .duration(123L)
                                                        .durationUnit(
                                                            SubscriptionPriceIntervalsParams.Add
                                                                .Price
                                                                .NewFloatingUnitPrice
                                                                .BillingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .conversionRate(42.23)
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(42.23)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(123L)
                                                        .durationUnit(
                                                            SubscriptionPriceIntervalsParams.Add
                                                                .Price
                                                                .NewFloatingUnitPrice
                                                                .InvoicingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .metadata(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .Metadata
                                                        .builder()
                                                        .build()
                                                )
                                                .build()
                                        )
                                )
                                .priceId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .addAdjustments(
                        listOf(
                            SubscriptionPriceIntervalsParams.AddAdjustment.builder()
                                .adjustment(
                                    SubscriptionPriceIntervalsParams.AddAdjustment.Adjustment
                                        .ofNewPercentageDiscount(
                                            SubscriptionPriceIntervalsParams.AddAdjustment
                                                .Adjustment
                                                .NewPercentageDiscount
                                                .builder()
                                                .adjustmentType(
                                                    SubscriptionPriceIntervalsParams.AddAdjustment
                                                        .Adjustment
                                                        .NewPercentageDiscount
                                                        .AdjustmentType
                                                        .PERCENTAGE_DISCOUNT
                                                )
                                                .appliesToPriceIds(listOf("string"))
                                                .percentageDiscount(42.23)
                                                .build()
                                        )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.AddAdjustment.StartDate
                                        .ofOffsetDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .endDate(
                                    SubscriptionPriceIntervalsParams.AddAdjustment.EndDate
                                        .ofOffsetDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .build()
                        )
                    )
                    .edit(
                        listOf(
                            SubscriptionPriceIntervalsParams.Edit.builder()
                                .priceIntervalId("sdfs6wdjvn7ujokd")
                                .billingCycleDay(123L)
                                .endDate(
                                    SubscriptionPriceIntervalsParams.Edit.EndDate.ofOffsetDateTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                )
                                .fixedFeeQuantityTransitions(
                                    listOf(
                                        SubscriptionPriceIntervalsParams.Edit
                                            .FixedFeeQuantityTransition
                                            .builder()
                                            .effectiveDate(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .quantity(123L)
                                            .build()
                                    )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.Edit.StartDate
                                        .ofOffsetDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .build()
                        )
                    )
                    .editAdjustments(
                        listOf(
                            SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                                .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                                .endDate(
                                    SubscriptionPriceIntervalsParams.EditAdjustment.EndDate
                                        .ofOffsetDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.EditAdjustment.StartDate
                                        .ofOffsetDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callSchedulePlanChange() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.schedulePlanChange(
                SubscriptionSchedulePlanChangeParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .alignBillingWithPlanChangeDate(true)
                    .autoCollection(true)
                    .billingCycleAlignment(
                        SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
                    )
                    .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(42.23)
                    .defaultInvoiceMemo("default_invoice_memo")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .initialPhaseOrder(123L)
                    .invoicingThreshold("10.00")
                    .netTerms(123L)
                    .perCreditOverageAmount(42.23)
                    .planId("ZMwNQefe7J3ecf7W")
                    .priceOverrides(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.PriceOverride.ofOverrideUnitPrice(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .builder()
                                    .id("id")
                                    .modelType(
                                        SubscriptionSchedulePlanChangeParams.PriceOverride
                                            .OverrideUnitPrice
                                            .ModelType
                                            .UNIT
                                    )
                                    .unitConfig(
                                        SubscriptionSchedulePlanChangeParams.PriceOverride
                                            .OverrideUnitPrice
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .conversionRate(42.23)
                                    .currency("currency")
                                    .discount(
                                        SubscriptionSchedulePlanChangeParams.PriceOverride
                                            .OverrideUnitPrice
                                            .Discount
                                            .builder()
                                            .discountType(
                                                SubscriptionSchedulePlanChangeParams.PriceOverride
                                                    .OverrideUnitPrice
                                                    .Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .appliesToPriceIds(listOf("string"))
                                            .percentageDiscount(42.23)
                                            .trialAmountDiscount("trial_amount_discount")
                                            .usageDiscount(42.23)
                                            .build()
                                    )
                                    .fixedPriceQuantity(42.23)
                                    .maximumAmount("1.23")
                                    .minimumAmount("1.23")
                                    .build()
                            )
                        )
                    )
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callTriggerPhase() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.triggerPhase(
                SubscriptionTriggerPhaseParams.builder()
                    .subscriptionId("subscription_id")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callUnscheduleCancellation() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.unscheduleCancellation(
                SubscriptionUnscheduleCancellationParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callUnscheduleFixedFeeQuantityUpdates() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.unscheduleFixedFeeQuantityUpdates(
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callUnschedulePendingPlanChanges() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.unschedulePendingPlanChanges(
                SubscriptionUnschedulePendingPlanChangesParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(subscription)
        subscription.validate()
    }

    @Test
    fun callUpdateFixedFeeQuantity() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscription =
            subscriptionService.updateFixedFeeQuantity(
                SubscriptionUpdateFixedFeeQuantityParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .quantity(42.23)
                    .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                    .effectiveDate(LocalDate.parse("2022-12-21"))
                    .build()
            )
        println(subscription)
        subscription.validate()
    }
}
