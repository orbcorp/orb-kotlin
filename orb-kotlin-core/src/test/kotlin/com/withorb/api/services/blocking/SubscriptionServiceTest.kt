// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
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
        val subscriptionCreateResponse =
            subscriptionService.create(
                SubscriptionCreateParams.builder()
                    .addAdjustments(
                        listOf(
                            SubscriptionCreateParams.AddAdjustment.builder()
                                .adjustment(
                                    SubscriptionCreateParams.AddAdjustment.Adjustment
                                        .ofNewPercentageDiscount(
                                            SubscriptionCreateParams.AddAdjustment.Adjustment
                                                .NewPercentageDiscount
                                                .builder()
                                                .adjustmentType(
                                                    SubscriptionCreateParams.AddAdjustment
                                                        .Adjustment
                                                        .NewPercentageDiscount
                                                        .AdjustmentType
                                                        .PERCENTAGE_DISCOUNT
                                                )
                                                .appliesToPriceIds(listOf("price_1", "price_2"))
                                                .percentageDiscount(0.0)
                                                .isInvoiceLevel(true)
                                                .build()
                                        )
                                )
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .planPhaseOrder(0L)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .addPrices(
                        listOf(
                            SubscriptionCreateParams.AddPrice.builder()
                                .discounts(
                                    listOf(
                                        SubscriptionCreateParams.AddPrice.Discount.builder()
                                            .discountType(
                                                SubscriptionCreateParams.AddPrice.Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .percentageDiscount(0.15)
                                            .usageDiscount(0.0)
                                            .build()
                                    )
                                )
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .externalPriceId("external_price_id")
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .planPhaseOrder(0L)
                                .price(
                                    SubscriptionCreateParams.AddPrice.Price
                                        .ofNewSubscriptionUnitPrice(
                                            SubscriptionCreateParams.AddPrice.Price
                                                .NewSubscriptionUnitPrice
                                                .builder()
                                                .cadence(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .Cadence
                                                        .ANNUAL
                                                )
                                                .itemId("item_id")
                                                .modelType(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .ModelType
                                                        .UNIT
                                                )
                                                .name("Annual fee")
                                                .unitConfig(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .UnitConfig
                                                        .builder()
                                                        .unitAmount("unit_amount")
                                                        .build()
                                                )
                                                .billableMetricId("billable_metric_id")
                                                .billedInAdvance(true)
                                                .billingCycleConfiguration(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .BillingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionCreateParams.AddPrice.Price
                                                                .NewSubscriptionUnitPrice
                                                                .BillingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .conversionRate(0.0)
                                                .currency("currency")
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(0.0)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionCreateParams.AddPrice.Price
                                                                .NewSubscriptionUnitPrice
                                                                .InvoicingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .metadata(
                                                    SubscriptionCreateParams.AddPrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .Metadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string")
                                                        )
                                                        .build()
                                                )
                                                .referenceId("reference_id")
                                                .build()
                                        )
                                )
                                .priceId("h74gfhdjvn7ujokd")
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .alignBillingWithSubscriptionStartDate(true)
                    .autoCollection(true)
                    .awsRegion("aws_region")
                    .billingCycleAnchorConfiguration(
                        SubscriptionCreateParams.BillingCycleAnchorConfiguration.builder()
                            .day(1L)
                            .month(1L)
                            .year(0L)
                            .build()
                    )
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(0.0)
                    .customerId("customer_id")
                    .defaultInvoiceMemo("default_invoice_memo")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalCustomerId("external_customer_id")
                    .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
                    .externalMarketplaceReportingId("external_marketplace_reporting_id")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .initialPhaseOrder(2L)
                    .invoicingThreshold("10.00")
                    .metadata(
                        SubscriptionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .perCreditOverageAmount(0.0)
                    .planId("ZMwNQefe7J3ecf7W")
                    .planVersionNumber(0L)
                    .priceOverrides(listOf(JsonValue.from(mapOf<String, Any>())))
                    .removeAdjustments(
                        listOf(
                            SubscriptionCreateParams.RemoveAdjustment.builder()
                                .adjustmentId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .removePrices(
                        listOf(
                            SubscriptionCreateParams.RemovePrice.builder()
                                .externalPriceId("external_price_id")
                                .priceId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .replaceAdjustments(
                        listOf(
                            SubscriptionCreateParams.ReplaceAdjustment.builder()
                                .adjustment(
                                    SubscriptionCreateParams.ReplaceAdjustment.Adjustment
                                        .ofNewPercentageDiscount(
                                            SubscriptionCreateParams.ReplaceAdjustment.Adjustment
                                                .NewPercentageDiscount
                                                .builder()
                                                .adjustmentType(
                                                    SubscriptionCreateParams.ReplaceAdjustment
                                                        .Adjustment
                                                        .NewPercentageDiscount
                                                        .AdjustmentType
                                                        .PERCENTAGE_DISCOUNT
                                                )
                                                .appliesToPriceIds(listOf("price_1", "price_2"))
                                                .percentageDiscount(0.0)
                                                .isInvoiceLevel(true)
                                                .build()
                                        )
                                )
                                .replacesAdjustmentId("replaces_adjustment_id")
                                .build()
                        )
                    )
                    .replacePrices(
                        listOf(
                            SubscriptionCreateParams.ReplacePrice.builder()
                                .replacesPriceId("replaces_price_id")
                                .discounts(
                                    listOf(
                                        SubscriptionCreateParams.ReplacePrice.Discount.builder()
                                            .discountType(
                                                SubscriptionCreateParams.ReplacePrice.Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .percentageDiscount(0.15)
                                            .usageDiscount(0.0)
                                            .build()
                                    )
                                )
                                .externalPriceId("external_price_id")
                                .fixedPriceQuantity(2.0)
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .price(
                                    SubscriptionCreateParams.ReplacePrice.Price
                                        .ofNewSubscriptionUnitPrice(
                                            SubscriptionCreateParams.ReplacePrice.Price
                                                .NewSubscriptionUnitPrice
                                                .builder()
                                                .cadence(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .Cadence
                                                        .ANNUAL
                                                )
                                                .itemId("item_id")
                                                .modelType(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .ModelType
                                                        .UNIT
                                                )
                                                .name("Annual fee")
                                                .unitConfig(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .UnitConfig
                                                        .builder()
                                                        .unitAmount("unit_amount")
                                                        .build()
                                                )
                                                .billableMetricId("billable_metric_id")
                                                .billedInAdvance(true)
                                                .billingCycleConfiguration(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .BillingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionCreateParams.ReplacePrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .BillingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .conversionRate(0.0)
                                                .currency("currency")
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(0.0)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionCreateParams.ReplacePrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .InvoicingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .metadata(
                                                    SubscriptionCreateParams.ReplacePrice.Price
                                                        .NewSubscriptionUnitPrice
                                                        .Metadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string")
                                                        )
                                                        .build()
                                                )
                                                .referenceId("reference_id")
                                                .build()
                                        )
                                )
                                .priceId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trialDurationDays(0L)
                    .build()
            )
        println(subscriptionCreateResponse)
        subscriptionCreateResponse.validate()
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
                    .metadata(
                        SubscriptionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
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
        val subscriptionCancelResponse =
            subscriptionService.cancel(
                SubscriptionCancelParams.builder()
                    .subscriptionId("subscription_id")
                    .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(subscriptionCancelResponse)
        subscriptionCancelResponse.validate()
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
        val subscriptionPriceIntervalsResponse =
            subscriptionService.priceIntervals(
                SubscriptionPriceIntervalsParams.builder()
                    .subscriptionId("subscription_id")
                    .add(
                        listOf(
                            SubscriptionPriceIntervalsParams.Add.builder()
                                .startDate(
                                    SubscriptionPriceIntervalsParams.Add.StartDate.ofDateTime(
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
                                                    .amountDiscount(0.0)
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
                                    SubscriptionPriceIntervalsParams.Add.EndDate.ofDateTime(
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
                                            .quantity(5L)
                                            .build()
                                    )
                                )
                                .maximumAmount(0.0)
                                .minimumAmount(0.0)
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
                                                        .duration(0L)
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
                                                .conversionRate(0.0)
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(0.0)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionPriceIntervalsParams.Add.Price
                                                        .NewFloatingUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
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
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string")
                                                        )
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
                                                .appliesToPriceIds(listOf("price_1", "price_2"))
                                                .percentageDiscount(0.0)
                                                .isInvoiceLevel(true)
                                                .build()
                                        )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.AddAdjustment.StartDate
                                        .ofDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .endDate(
                                    SubscriptionPriceIntervalsParams.AddAdjustment.EndDate
                                        .ofDateTime(
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
                                .billingCycleDay(0L)
                                .endDate(
                                    SubscriptionPriceIntervalsParams.Edit.EndDate.ofDateTime(
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
                                            .quantity(5L)
                                            .build()
                                    )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.Edit.StartDate.ofDateTime(
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
                                        .ofDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .startDate(
                                    SubscriptionPriceIntervalsParams.EditAdjustment.StartDate
                                        .ofDateTime(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(subscriptionPriceIntervalsResponse)
        subscriptionPriceIntervalsResponse.validate()
    }

    @Test
    fun callSchedulePlanChange() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionSchedulePlanChangeResponse =
            subscriptionService.schedulePlanChange(
                SubscriptionSchedulePlanChangeParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .addAdjustments(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.AddAdjustment.builder()
                                .adjustment(
                                    SubscriptionSchedulePlanChangeParams.AddAdjustment.Adjustment
                                        .ofNewPercentageDiscount(
                                            SubscriptionSchedulePlanChangeParams.AddAdjustment
                                                .Adjustment
                                                .NewPercentageDiscount
                                                .builder()
                                                .adjustmentType(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .AddAdjustment
                                                        .Adjustment
                                                        .NewPercentageDiscount
                                                        .AdjustmentType
                                                        .PERCENTAGE_DISCOUNT
                                                )
                                                .appliesToPriceIds(listOf("price_1", "price_2"))
                                                .percentageDiscount(0.0)
                                                .isInvoiceLevel(true)
                                                .build()
                                        )
                                )
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .planPhaseOrder(0L)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .addPrices(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.AddPrice.builder()
                                .discounts(
                                    listOf(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Discount
                                            .builder()
                                            .discountType(
                                                SubscriptionSchedulePlanChangeParams.AddPrice
                                                    .Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .percentageDiscount(0.15)
                                            .usageDiscount(0.0)
                                            .build()
                                    )
                                )
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .externalPriceId("external_price_id")
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .planPhaseOrder(0L)
                                .price(
                                    SubscriptionSchedulePlanChangeParams.AddPrice.Price
                                        .ofNewSubscriptionUnitPrice(
                                            SubscriptionSchedulePlanChangeParams.AddPrice.Price
                                                .NewSubscriptionUnitPrice
                                                .builder()
                                                .cadence(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .Cadence
                                                        .ANNUAL
                                                )
                                                .itemId("item_id")
                                                .modelType(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .ModelType
                                                        .UNIT
                                                )
                                                .name("Annual fee")
                                                .unitConfig(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .UnitConfig
                                                        .builder()
                                                        .unitAmount("unit_amount")
                                                        .build()
                                                )
                                                .billableMetricId("billable_metric_id")
                                                .billedInAdvance(true)
                                                .billingCycleConfiguration(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .BillingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionSchedulePlanChangeParams
                                                                .AddPrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .BillingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .conversionRate(0.0)
                                                .currency("currency")
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(0.0)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionSchedulePlanChangeParams
                                                                .AddPrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .InvoicingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .metadata(
                                                    SubscriptionSchedulePlanChangeParams.AddPrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .Metadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string")
                                                        )
                                                        .build()
                                                )
                                                .referenceId("reference_id")
                                                .build()
                                        )
                                )
                                .priceId("h74gfhdjvn7ujokd")
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .alignBillingWithPlanChangeDate(true)
                    .autoCollection(true)
                    .billingCycleAlignment(
                        SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
                    )
                    .billingCycleAnchorConfiguration(
                        SubscriptionSchedulePlanChangeParams.BillingCycleAnchorConfiguration
                            .builder()
                            .day(1L)
                            .month(1L)
                            .year(0L)
                            .build()
                    )
                    .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(0.0)
                    .defaultInvoiceMemo("default_invoice_memo")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .initialPhaseOrder(2L)
                    .invoicingThreshold("10.00")
                    .netTerms(0L)
                    .perCreditOverageAmount(0.0)
                    .planId("ZMwNQefe7J3ecf7W")
                    .planVersionNumber(0L)
                    .priceOverrides(listOf(JsonValue.from(mapOf<String, Any>())))
                    .removeAdjustments(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.RemoveAdjustment.builder()
                                .adjustmentId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .removePrices(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.RemovePrice.builder()
                                .externalPriceId("external_price_id")
                                .priceId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .replaceAdjustments(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.ReplaceAdjustment.builder()
                                .adjustment(
                                    SubscriptionSchedulePlanChangeParams.ReplaceAdjustment
                                        .Adjustment
                                        .ofNewPercentageDiscount(
                                            SubscriptionSchedulePlanChangeParams.ReplaceAdjustment
                                                .Adjustment
                                                .NewPercentageDiscount
                                                .builder()
                                                .adjustmentType(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplaceAdjustment
                                                        .Adjustment
                                                        .NewPercentageDiscount
                                                        .AdjustmentType
                                                        .PERCENTAGE_DISCOUNT
                                                )
                                                .appliesToPriceIds(listOf("price_1", "price_2"))
                                                .percentageDiscount(0.0)
                                                .isInvoiceLevel(true)
                                                .build()
                                        )
                                )
                                .replacesAdjustmentId("replaces_adjustment_id")
                                .build()
                        )
                    )
                    .replacePrices(
                        listOf(
                            SubscriptionSchedulePlanChangeParams.ReplacePrice.builder()
                                .replacesPriceId("replaces_price_id")
                                .discounts(
                                    listOf(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Discount
                                            .builder()
                                            .discountType(
                                                SubscriptionSchedulePlanChangeParams.ReplacePrice
                                                    .Discount
                                                    .DiscountType
                                                    .PERCENTAGE
                                            )
                                            .amountDiscount("amount_discount")
                                            .percentageDiscount(0.15)
                                            .usageDiscount(0.0)
                                            .build()
                                    )
                                )
                                .externalPriceId("external_price_id")
                                .fixedPriceQuantity(2.0)
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .price(
                                    SubscriptionSchedulePlanChangeParams.ReplacePrice.Price
                                        .ofNewSubscriptionUnitPrice(
                                            SubscriptionSchedulePlanChangeParams.ReplacePrice.Price
                                                .NewSubscriptionUnitPrice
                                                .builder()
                                                .cadence(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .Cadence
                                                        .ANNUAL
                                                )
                                                .itemId("item_id")
                                                .modelType(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .ModelType
                                                        .UNIT
                                                )
                                                .name("Annual fee")
                                                .unitConfig(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .UnitConfig
                                                        .builder()
                                                        .unitAmount("unit_amount")
                                                        .build()
                                                )
                                                .billableMetricId("billable_metric_id")
                                                .billedInAdvance(true)
                                                .billingCycleConfiguration(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .BillingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionSchedulePlanChangeParams
                                                                .ReplacePrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .BillingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .conversionRate(0.0)
                                                .currency("currency")
                                                .externalPriceId("external_price_id")
                                                .fixedPriceQuantity(0.0)
                                                .invoiceGroupingKey("invoice_grouping_key")
                                                .invoicingCycleConfiguration(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .InvoicingCycleConfiguration
                                                        .builder()
                                                        .duration(0L)
                                                        .durationUnit(
                                                            SubscriptionSchedulePlanChangeParams
                                                                .ReplacePrice
                                                                .Price
                                                                .NewSubscriptionUnitPrice
                                                                .InvoicingCycleConfiguration
                                                                .DurationUnit
                                                                .DAY
                                                        )
                                                        .build()
                                                )
                                                .metadata(
                                                    SubscriptionSchedulePlanChangeParams
                                                        .ReplacePrice
                                                        .Price
                                                        .NewSubscriptionUnitPrice
                                                        .Metadata
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string")
                                                        )
                                                        .build()
                                                )
                                                .referenceId("reference_id")
                                                .build()
                                        )
                                )
                                .priceId("h74gfhdjvn7ujokd")
                                .build()
                        )
                    )
                    .trialDurationDays(0L)
                    .build()
            )
        println(subscriptionSchedulePlanChangeResponse)
        subscriptionSchedulePlanChangeResponse.validate()
    }

    @Test
    fun callTriggerPhase() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionTriggerPhaseResponse =
            subscriptionService.triggerPhase(
                SubscriptionTriggerPhaseParams.builder()
                    .subscriptionId("subscription_id")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(subscriptionTriggerPhaseResponse)
        subscriptionTriggerPhaseResponse.validate()
    }

    @Test
    fun callUnscheduleCancellation() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUnscheduleCancellationResponse =
            subscriptionService.unscheduleCancellation(
                SubscriptionUnscheduleCancellationParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(subscriptionUnscheduleCancellationResponse)
        subscriptionUnscheduleCancellationResponse.validate()
    }

    @Test
    fun callUnscheduleFixedFeeQuantityUpdates() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUnscheduleFixedFeeQuantityUpdatesResponse =
            subscriptionService.unscheduleFixedFeeQuantityUpdates(
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .build()
            )
        println(subscriptionUnscheduleFixedFeeQuantityUpdatesResponse)
        subscriptionUnscheduleFixedFeeQuantityUpdatesResponse.validate()
    }

    @Test
    fun callUnschedulePendingPlanChanges() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUnschedulePendingPlanChangesResponse =
            subscriptionService.unschedulePendingPlanChanges(
                SubscriptionUnschedulePendingPlanChangesParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(subscriptionUnschedulePendingPlanChangesResponse)
        subscriptionUnschedulePendingPlanChangesResponse.validate()
    }

    @Test
    fun callUpdateFixedFeeQuantity() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUpdateFixedFeeQuantityResponse =
            subscriptionService.updateFixedFeeQuantity(
                SubscriptionUpdateFixedFeeQuantityParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .quantity(0.0)
                    .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                    .effectiveDate(LocalDate.parse("2022-12-21"))
                    .build()
            )
        println(subscriptionUpdateFixedFeeQuantityResponse)
        subscriptionUpdateFixedFeeQuantityResponse.validate()
    }

    @Test
    fun callUpdateTrial() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.subscriptions()
        val subscriptionUpdateTrialResponse =
            subscriptionService.updateTrial(
                SubscriptionUpdateTrialParams.builder()
                    .subscriptionId("subscription_id")
                    .trialEndDate(
                        SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                            OffsetDateTime.parse("2017-07-21T17:32:28Z")
                        )
                    )
                    .shift(true)
                    .build()
            )
        println(subscriptionUpdateTrialResponse)
        subscriptionUpdateTrialResponse.validate()
    }
}
