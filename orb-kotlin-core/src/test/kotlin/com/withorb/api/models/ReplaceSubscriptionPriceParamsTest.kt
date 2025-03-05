// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReplaceSubscriptionPriceParamsTest {

    @Test
    fun createReplaceSubscriptionPriceParams() {
        val replaceSubscriptionPriceParams =
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
                .build()
        assertThat(replaceSubscriptionPriceParams).isNotNull
        assertThat(replaceSubscriptionPriceParams.replacesPriceId()).isEqualTo("replaces_price_id")
        assertThat(replaceSubscriptionPriceParams.allocationPrice())
            .isEqualTo(
                NewAllocationPriceModel.builder()
                    .amount("10.00")
                    .cadence(NewAllocationPriceModel.Cadence.ONE_TIME)
                    .currency("USD")
                    .expiresAtEndOfCadence(true)
                    .build()
            )
        assertThat(replaceSubscriptionPriceParams.discounts())
            .containsExactly(
                DiscountOverrideModel.builder()
                    .discountType(DiscountOverrideModel.DiscountType.PERCENTAGE)
                    .amountDiscount("amount_discount")
                    .percentageDiscount(0.15)
                    .usageDiscount(0.0)
                    .build()
            )
        assertThat(replaceSubscriptionPriceParams.externalPriceId()).isEqualTo("external_price_id")
        assertThat(replaceSubscriptionPriceParams.fixedPriceQuantity()).isEqualTo(2.0)
        assertThat(replaceSubscriptionPriceParams.maximumAmount()).isEqualTo("1.23")
        assertThat(replaceSubscriptionPriceParams.minimumAmount()).isEqualTo("1.23")
        assertThat(replaceSubscriptionPriceParams.price())
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
        assertThat(replaceSubscriptionPriceParams.priceId()).isEqualTo("h74gfhdjvn7ujokd")
    }
}
