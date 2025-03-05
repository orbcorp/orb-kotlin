// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionPriceIntervalsParamsTest {

    @Test
    fun create() {
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
                            .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
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
                                NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
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
    }

    @Test
    fun body() {
        val params =
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
                                .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
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
                                    NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.add())
            .isEqualTo(
                listOf(
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
                                .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
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
                                    NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .priceId("h74gfhdjvn7ujokd")
                        .addUsageCustomerId("string")
                        .build()
                )
            )
        assertThat(body.addAdjustments())
            .isEqualTo(
                listOf(
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
            )
        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.edit())
            .isEqualTo(
                listOf(
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
            )
        assertThat(body.editAdjustments())
            .isEqualTo(
                listOf(
                    SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                        .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionPriceIntervalsParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionPriceIntervalsParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
