// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateTrialParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .addAddAdjustment(
                        SubscriptionCreateParams.AddAdjustment.builder()
                            .adjustment(
                                SubscriptionCreateParams.AddAdjustment.Adjustment.PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        SubscriptionCreateParams.AddPrice.builder()
                            .allocationPrice(
                                SubscriptionCreateParams.AddPrice.AllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(
                                        SubscriptionCreateParams.AddPrice.AllocationPrice.Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                SubscriptionCreateParams.AddPrice.Discount.builder()
                                    .discountType(
                                        SubscriptionCreateParams.AddPrice.Discount.DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .planPhaseOrder(0L)
                            .price(
                                SubscriptionCreateParams.AddPrice.Price.Unit.builder()
                                    .cadence(
                                        SubscriptionCreateParams.AddPrice.Price.Unit.Cadence.ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        SubscriptionCreateParams.AddPrice.Price.Unit.UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        SubscriptionCreateParams.AddPrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionCreateParams.AddPrice.Price.Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        SubscriptionCreateParams.AddPrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        SubscriptionCreateParams.AddPrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionCreateParams.AddPrice.Price.Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        SubscriptionCreateParams.AddPrice.Price.Unit.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
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
                    .currency("currency")
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
                    .name("name")
                    .netTerms(0L)
                    .perCreditOverageAmount(0.0)
                    .planId("ZMwNQefe7J3ecf7W")
                    .planVersionNumber(0L)
                    .addPriceOverride(JsonValue.from(mapOf<String, Any>()))
                    .addRemoveAdjustment(
                        SubscriptionCreateParams.RemoveAdjustment.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        SubscriptionCreateParams.RemovePrice.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        SubscriptionCreateParams.ReplaceAdjustment.builder()
                            .adjustment(
                                SubscriptionCreateParams.ReplaceAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        SubscriptionCreateParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                SubscriptionCreateParams.ReplacePrice.AllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(
                                        SubscriptionCreateParams.ReplacePrice.AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                SubscriptionCreateParams.ReplacePrice.Discount.builder()
                                    .discountType(
                                        SubscriptionCreateParams.ReplacePrice.Discount.DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(2.0)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .price(
                                SubscriptionCreateParams.ReplacePrice.Price.Unit.builder()
                                    .cadence(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit.UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionCreateParams.ReplacePrice.Price.Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionCreateParams.ReplacePrice.Price.Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        SubscriptionCreateParams.ReplacePrice.Price.Unit.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trialDurationDays(0L)
                    .addUsageCustomerId("string")
                    .build()
            )

        subscription.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription =
            subscriptionServiceAsync.update(
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

        subscription.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val page = subscriptionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.cancel(
                SubscriptionCancelParams.builder()
                    .subscriptionId("subscription_id")
                    .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                    .allowInvoiceCreditOrVoid(true)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription = subscriptionServiceAsync.fetch("subscription_id")

        subscription.validate()
    }

    @Test
    suspend fun fetchCosts() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.fetchCosts(
                SubscriptionFetchCostsParams.builder()
                    .subscriptionId("subscription_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun fetchSchedule() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val page = subscriptionServiceAsync.fetchSchedule("subscription_id")

        page.response().validate()
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    suspend fun fetchUsage() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionUsage =
            subscriptionServiceAsync.fetchUsage(
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

        subscriptionUsage.validate()
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    suspend fun priceIntervals() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.priceIntervals(
                SubscriptionPriceIntervalsParams.builder()
                    .subscriptionId("subscription_id")
                    .addAdd(
                        SubscriptionPriceIntervalsParams.Add.builder()
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .allocationPrice(
                                SubscriptionPriceIntervalsParams.Add.AllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(
                                        SubscriptionPriceIntervalsParams.Add.AllocationPrice.Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addAmountDiscount(0.0)
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .filter("my_property > 100 AND my_other_property = 'bar'")
                            .addFixedFeeQuantityTransition(
                                SubscriptionPriceIntervalsParams.Add.FixedFeeQuantityTransition
                                    .builder()
                                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .quantity(5L)
                                    .build()
                            )
                            .maximumAmount(0.0)
                            .minimumAmount(0.0)
                            .price(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit.builder()
                                    .cadence(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit.Cadence
                                            .ANNUAL
                                    )
                                    .currency("currency")
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit.UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .dimensionalPriceConfiguration(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .addUsageCustomerId("string")
                            .build()
                    )
                    .addAddAdjustment(
                        SubscriptionPriceIntervalsParams.AddAdjustment.builder()
                            .adjustment(
                                SubscriptionPriceIntervalsParams.AddAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .allowInvoiceCreditOrVoid(true)
                    .addEdit(
                        SubscriptionPriceIntervalsParams.Edit.builder()
                            .priceIntervalId("sdfs6wdjvn7ujokd")
                            .billingCycleDay(0L)
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .filter("my_property > 100 AND my_other_property = 'bar'")
                            .addFixedFeeQuantityTransition(
                                SubscriptionPriceIntervalsParams.Edit.FixedFeeQuantityTransition
                                    .builder()
                                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .quantity(5L)
                                    .build()
                            )
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addUsageCustomerId("string")
                            .build()
                    )
                    .addEditAdjustment(
                        SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                            .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun schedulePlanChange() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.schedulePlanChange(
                SubscriptionSchedulePlanChangeParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .addAddAdjustment(
                        SubscriptionSchedulePlanChangeParams.AddAdjustment.builder()
                            .adjustment(
                                SubscriptionSchedulePlanChangeParams.AddAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        SubscriptionSchedulePlanChangeParams.AddPrice.builder()
                            .allocationPrice(
                                SubscriptionSchedulePlanChangeParams.AddPrice.AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        SubscriptionSchedulePlanChangeParams.AddPrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                SubscriptionSchedulePlanChangeParams.AddPrice.Discount.builder()
                                    .discountType(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .planPhaseOrder(0L)
                            .price(
                                SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit.builder()
                                    .cadence(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionSchedulePlanChangeParams.AddPrice.Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionSchedulePlanChangeParams.AddPrice.Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        SubscriptionSchedulePlanChangeParams.AddPrice.Price.Unit
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
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
                    .addPriceOverride(JsonValue.from(mapOf<String, Any>()))
                    .addRemoveAdjustment(
                        SubscriptionSchedulePlanChangeParams.RemoveAdjustment.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        SubscriptionSchedulePlanChangeParams.RemovePrice.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        SubscriptionSchedulePlanChangeParams.ReplaceAdjustment.builder()
                            .adjustment(
                                SubscriptionSchedulePlanChangeParams.ReplaceAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        SubscriptionSchedulePlanChangeParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                SubscriptionSchedulePlanChangeParams.ReplacePrice.AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                SubscriptionSchedulePlanChangeParams.ReplacePrice.Discount.builder()
                                    .discountType(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(2.0)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .price(
                                SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                    .builder()
                                    .cadence(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionSchedulePlanChangeParams.ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                SubscriptionSchedulePlanChangeParams.ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        SubscriptionSchedulePlanChangeParams.ReplacePrice.Price.Unit
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .trialDurationDays(0L)
                    .addUsageCustomerId("string")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun triggerPhase() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.triggerPhase(
                SubscriptionTriggerPhaseParams.builder()
                    .subscriptionId("subscription_id")
                    .allowInvoiceCreditOrVoid(true)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun unscheduleCancellation() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response = subscriptionServiceAsync.unscheduleCancellation("subscription_id")

        response.validate()
    }

    @Test
    suspend fun unscheduleFixedFeeQuantityUpdates() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.unscheduleFixedFeeQuantityUpdates(
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun unschedulePendingPlanChanges() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response = subscriptionServiceAsync.unschedulePendingPlanChanges("subscription_id")

        response.validate()
    }

    @Test
    suspend fun updateFixedFeeQuantity() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.updateFixedFeeQuantity(
                SubscriptionUpdateFixedFeeQuantityParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .quantity(0.0)
                    .allowInvoiceCreditOrVoid(true)
                    .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                    .effectiveDate(LocalDate.parse("2022-12-21"))
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun updateTrial() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val response =
            subscriptionServiceAsync.updateTrial(
                SubscriptionUpdateTrialParams.builder()
                    .subscriptionId("subscription_id")
                    .trialEndDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .shift(true)
                    .build()
            )

        response.validate()
    }
}
