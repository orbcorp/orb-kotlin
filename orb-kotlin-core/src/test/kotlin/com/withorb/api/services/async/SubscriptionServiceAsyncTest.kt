// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.AddSubscriptionAdjustmentParams
import com.withorb.api.models.AddSubscriptionPriceParams
import com.withorb.api.models.BillingCycleAnchorConfigurationModel
import com.withorb.api.models.DiscountOverrideModel
import com.withorb.api.models.NewAdjustmentModel
import com.withorb.api.models.NewAllocationPriceModel
import com.withorb.api.models.NewBillingCycleConfigurationModel
import com.withorb.api.models.NewFloatingPriceModel
import com.withorb.api.models.NewSubscriptionPriceModel
import com.withorb.api.models.PriceIntervalFixedFeeQuantityTransitionModel
import com.withorb.api.models.RemoveSubscriptionAdjustmentParams
import com.withorb.api.models.RemoveSubscriptionPriceParams
import com.withorb.api.models.ReplaceSubscriptionAdjustmentParams
import com.withorb.api.models.ReplaceSubscriptionPriceParams
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchParams
import com.withorb.api.models.SubscriptionFetchScheduleParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionUnscheduleCancellationParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUnschedulePendingPlanChangesParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateTrialParams
import com.withorb.api.models.UnitConfigModel
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .addAddAdjustment(
                        AddSubscriptionAdjustmentParams.builder()
                            .adjustment(
                                NewAdjustmentModel.NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewAdjustmentModel.NewPercentageDiscount.AdjustmentType
                                            .PERCENTAGE_DISCOUNT
                                    )
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .percentageDiscount(0.0)
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        AddSubscriptionPriceParams.builder()
                            .allocationPrice(
                                NewAllocationPriceModel.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverrideModel.builder()
                                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
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
                                NewSubscriptionPriceModel.NewSubscriptionUnitPrice.builder()
                                    .cadence(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .modelType(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfigModel.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("invoice_grouping_key")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata
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
                        BillingCycleAnchorConfigurationModel.builder()
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
                    .addPriceOverride(JsonValue.from(mapOf<String, Any>()))
                    .addRemoveAdjustment(
                        RemoveSubscriptionAdjustmentParams.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        RemoveSubscriptionPriceParams.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        ReplaceSubscriptionAdjustmentParams.builder()
                            .adjustment(
                                NewAdjustmentModel.NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewAdjustmentModel.NewPercentageDiscount.AdjustmentType
                                            .PERCENTAGE_DISCOUNT
                                    )
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .percentageDiscount(0.0)
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        ReplaceSubscriptionPriceParams.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                NewAllocationPriceModel.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverrideModel.builder()
                                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
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
                                NewSubscriptionPriceModel.NewSubscriptionUnitPrice.builder()
                                    .cadence(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .modelType(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfigModel.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("invoice_grouping_key")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata
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
                    .trialDurationDays(999999L)
                    .addUsageCustomerId("string")
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionModel =
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

        subscriptionModel.validate()
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

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.cancel(
                SubscriptionCancelParams.builder()
                    .subscriptionId("subscription_id")
                    .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                    .allowInvoiceCreditOrVoid(true)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionModel =
            subscriptionServiceAsync.fetch(
                SubscriptionFetchParams.builder().subscriptionId("subscription_id").build()
            )

        subscriptionModel.validate()
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

        val page =
            subscriptionServiceAsync.fetchSchedule(
                SubscriptionFetchScheduleParams.builder().subscriptionId("subscription_id").build()
            )

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

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.priceIntervals(
                SubscriptionPriceIntervalsParams.builder()
                    .subscriptionId("subscription_id")
                    .addAdd(
                        SubscriptionPriceIntervalsParams.Add.builder()
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .allocationPrice(
                                NewAllocationPriceModel.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addAmountDiscountCreationParamsDiscount(0.0)
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .filter("my_property > 100 AND my_other_property = 'bar'")
                            .addFixedFeeQuantityTransition(
                                PriceIntervalFixedFeeQuantityTransitionModel.builder()
                                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .quantity(5L)
                                    .build()
                            )
                            .maximumAmount(0.0)
                            .minimumAmount(0.0)
                            .price(
                                NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                                    .cadence(
                                        NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL
                                    )
                                    .currency("currency")
                                    .itemId("item_id")
                                    .modelType(
                                        NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfigModel.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("invoice_grouping_key")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewFloatingPriceModel.NewFloatingUnitPrice.Metadata
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
                                NewAdjustmentModel.NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewAdjustmentModel.NewPercentageDiscount.AdjustmentType
                                            .PERCENTAGE_DISCOUNT
                                    )
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .percentageDiscount(0.0)
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
                                PriceIntervalFixedFeeQuantityTransitionModel.builder()
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

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun schedulePlanChange() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.schedulePlanChange(
                SubscriptionSchedulePlanChangeParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .addAddAdjustment(
                        AddSubscriptionAdjustmentParams.builder()
                            .adjustment(
                                NewAdjustmentModel.NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewAdjustmentModel.NewPercentageDiscount.AdjustmentType
                                            .PERCENTAGE_DISCOUNT
                                    )
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .percentageDiscount(0.0)
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        AddSubscriptionPriceParams.builder()
                            .allocationPrice(
                                NewAllocationPriceModel.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverrideModel.builder()
                                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
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
                                NewSubscriptionPriceModel.NewSubscriptionUnitPrice.builder()
                                    .cadence(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .modelType(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfigModel.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("invoice_grouping_key")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata
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
                        BillingCycleAnchorConfigurationModel.builder()
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
                        RemoveSubscriptionAdjustmentParams.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        RemoveSubscriptionPriceParams.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        ReplaceSubscriptionAdjustmentParams.builder()
                            .adjustment(
                                NewAdjustmentModel.NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewAdjustmentModel.NewPercentageDiscount.AdjustmentType
                                            .PERCENTAGE_DISCOUNT
                                    )
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .percentageDiscount(0.0)
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        ReplaceSubscriptionPriceParams.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                NewAllocationPriceModel.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                                    .currency("USD")
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverrideModel.builder()
                                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
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
                                NewSubscriptionPriceModel.NewSubscriptionUnitPrice.builder()
                                    .cadence(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .modelType(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfigModel.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("invoice_grouping_key")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfigurationModel.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfigurationModel.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata
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
                    .trialDurationDays(999999L)
                    .addUsageCustomerId("string")
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun triggerPhase() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.triggerPhase(
                SubscriptionTriggerPhaseParams.builder()
                    .subscriptionId("subscription_id")
                    .allowInvoiceCreditOrVoid(true)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun unscheduleCancellation() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.unscheduleCancellation(
                SubscriptionUnscheduleCancellationParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun unscheduleFixedFeeQuantityUpdates() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.unscheduleFixedFeeQuantityUpdates(
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun unschedulePendingPlanChanges() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.unschedulePendingPlanChanges(
                SubscriptionUnschedulePendingPlanChangesParams.builder()
                    .subscriptionId("subscription_id")
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun updateFixedFeeQuantity() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
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

        mutatedSubscriptionModel.validate()
    }

    @Test
    suspend fun updateTrial() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionModel =
            subscriptionServiceAsync.updateTrial(
                SubscriptionUpdateTrialParams.builder()
                    .subscriptionId("subscription_id")
                    .trialEndDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .shift(true)
                    .build()
            )

        mutatedSubscriptionModel.validate()
    }
}
