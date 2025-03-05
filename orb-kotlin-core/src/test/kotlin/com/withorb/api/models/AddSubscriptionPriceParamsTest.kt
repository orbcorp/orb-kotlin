// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddSubscriptionPriceParamsTest {

    @Test
    fun createAddSubscriptionPriceParams() {
        val addSubscriptionPriceParams =
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
                        .cadence(NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(
                            NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType.UNIT
                        )
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
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
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .referenceId("reference_id")
                        .build()
                )
                .priceId("h74gfhdjvn7ujokd")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(addSubscriptionPriceParams).isNotNull
        assertThat(addSubscriptionPriceParams.allocationPrice())
            .isEqualTo(
                NewAllocationPriceModel.builder()
                    .amount("10.00")
                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                    .currency("USD")
                    .expiresAtEndOfCadence(true)
                    .build()
            )
        assertThat(addSubscriptionPriceParams.discounts())
            .containsExactly(
                DiscountOverrideModel.builder()
                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
                    .amountDiscount("amount_discount")
                    .percentageDiscount(0.15)
                    .usageDiscount(0.0)
                    .build()
            )
        assertThat(addSubscriptionPriceParams.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addSubscriptionPriceParams.externalPriceId()).isEqualTo("external_price_id")
        assertThat(addSubscriptionPriceParams.maximumAmount()).isEqualTo("1.23")
        assertThat(addSubscriptionPriceParams.minimumAmount()).isEqualTo("1.23")
        assertThat(addSubscriptionPriceParams.planPhaseOrder()).isEqualTo(0L)
        assertThat(addSubscriptionPriceParams.price())
            .isEqualTo(
                NewSubscriptionPriceModel.ofUnitPrice(
                    NewSubscriptionPriceModel.NewSubscriptionUnitPrice.builder()
                        .cadence(NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(
                            NewSubscriptionPriceModel.NewSubscriptionUnitPrice.ModelType.UNIT
                        )
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
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
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewSubscriptionPriceModel.NewSubscriptionUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .referenceId("reference_id")
                        .build()
                )
            )
        assertThat(addSubscriptionPriceParams.priceId()).isEqualTo("h74gfhdjvn7ujokd")
        assertThat(addSubscriptionPriceParams.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
