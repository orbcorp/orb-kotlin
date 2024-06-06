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
                    .awsRegion("string")
                    .couponRedemptionCode("string")
                    .creditsOverageRate(42.23)
                    .customerId("string")
                    .defaultInvoiceMemo("string")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalCustomerId("string")
                    .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
                    .externalMarketplaceReportingId("string")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .initialPhaseOrder(123L)
                    .invoicingThreshold("string")
                    .metadata(SubscriptionCreateParams.Metadata.builder().build())
                    .netTerms(123L)
                    .perCreditOverageAmount(42.23)
                    .planId("ZMwNQefe7J3ecf7W")
                    .priceOverrides(
                        listOf(
                            SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
                                    .id("string")
                                    .modelType(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .ModelType
                                            .UNIT
                                    )
                                    .unitConfig(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("string")
                                            .build()
                                    )
                                    .conversionRate(42.23)
                                    .currency("string")
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
                                            .amountDiscount("string")
                                            .appliesToPriceIds(listOf("string"))
                                            .percentageDiscount(42.23)
                                            .trialAmountDiscount("string")
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
                    .subscriptionId("string")
                    .autoCollection(true)
                    .defaultInvoiceMemo("string")
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
                    .subscriptionId("string")
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
                SubscriptionFetchParams.builder().subscriptionId("string").build()
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
                    .subscriptionId("string")
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
                SubscriptionFetchScheduleParams.builder().subscriptionId("string").build()
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
                    .subscriptionId("string")
                    .billableMetricId("string")
                    .cursor("string")
                    .firstDimensionKey("string")
                    .firstDimensionValue("string")
                    .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                    .groupBy("string")
                    .limit(123L)
                    .secondDimensionKey("string")
                    .secondDimensionValue("string")
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
                    .subscriptionId("string")
                    .add(
                        listOf(
                            SubscriptionPriceIntervalsParams.Add.builder()
                                .startDate(
                                    SubscriptionPriceIntervalsParams.Add.StartDate.ofOffsetDateTime(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
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
                                                .currency("string")
                                                .itemId("string")
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
                                                        .unitAmount("string")
                                                        .build()
                                                )
                                                .billableMetricId("string")
                                                .billedInAdvance(true)
                                                .conversionRate(42.23)
                                                .externalPriceId("string")
                                                .fixedPriceQuantity(42.23)
                                                .invoiceGroupingKey("string")
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
                    .subscriptionId("string")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .alignBillingWithPlanChangeDate(true)
                    .billingCycleAlignment(
                        SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
                    )
                    .changeDate("2017-07-21T17:32:28Z")
                    .couponRedemptionCode("string")
                    .creditsOverageRate(42.23)
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .initialPhaseOrder(123L)
                    .invoicingThreshold("10.00")
                    .perCreditOverageAmount(42.23)
                    .planId("ZMwNQefe7J3ecf7W")
                    .priceOverrides(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.PriceOverride.ofOverrideUnitPrice(
                                SubscriptionSchedulePlanChangeParams.PriceOverride.OverrideUnitPrice
                                    .builder()
                                    .id("string")
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
                                            .unitAmount("string")
                                            .build()
                                    )
                                    .conversionRate(42.23)
                                    .currency("string")
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
                                            .amountDiscount("string")
                                            .appliesToPriceIds(listOf("string"))
                                            .percentageDiscount(42.23)
                                            .trialAmountDiscount("string")
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
                    .subscriptionId("string")
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
                SubscriptionUnscheduleCancellationParams.builder().subscriptionId("string").build()
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
                    .subscriptionId("string")
                    .priceId("string")
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
                    .subscriptionId("string")
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
                    .subscriptionId("string")
                    .priceId("string")
                    .quantity(42.23)
                    .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                    .effectiveDate(LocalDate.parse("2022-12-21"))
                    .build()
            )
        println(subscription)
        subscription.validate()
    }
}
