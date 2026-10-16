// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupPriceCreateParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupPriceCreateParams.builder()
            .dimensionalPriceGroupId("dimensional_price_group_id")
            .cadence(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
            .currency("USD")
            .itemId("item_id")
            .modelType(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
            .addPrice(
                DimensionalPriceGroupPriceCreateParams.Price.builder()
                    .addAmount(0.0)
                    .addDimensionValue("string")
                    .name("name")
                    .build()
            )
            .addTier(
                DimensionalPriceGroupPriceCreateParams.Tier.builder()
                    .firstUnit(0.0)
                    .lastUnit(0.0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DimensionalPriceGroupPriceCreateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .cadence(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
                .currency("USD")
                .itemId("item_id")
                .modelType(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
                .addPrice(
                    DimensionalPriceGroupPriceCreateParams.Price.builder()
                        .addAmount(0.0)
                        .addDimensionValue("string")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DimensionalPriceGroupPriceCreateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .cadence(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
                .currency("USD")
                .itemId("item_id")
                .modelType(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
                .addPrice(
                    DimensionalPriceGroupPriceCreateParams.Price.builder()
                        .addAmount(0.0)
                        .addDimensionValue("string")
                        .name("name")
                        .build()
                )
                .addTier(
                    DimensionalPriceGroupPriceCreateParams.Tier.builder()
                        .firstUnit(0.0)
                        .lastUnit(0.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.cadence())
            .isEqualTo(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.modelType())
            .isEqualTo(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
        assertThat(body.prices())
            .containsExactly(
                DimensionalPriceGroupPriceCreateParams.Price.builder()
                    .addAmount(0.0)
                    .addDimensionValue("string")
                    .name("name")
                    .build()
            )
        assertThat(body.tiers())
            .containsExactly(
                DimensionalPriceGroupPriceCreateParams.Tier.builder()
                    .firstUnit(0.0)
                    .lastUnit(0.0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DimensionalPriceGroupPriceCreateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .cadence(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
                .currency("USD")
                .itemId("item_id")
                .modelType(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
                .addPrice(
                    DimensionalPriceGroupPriceCreateParams.Price.builder()
                        .addAmount(0.0)
                        .addDimensionValue("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.cadence())
            .isEqualTo(DimensionalPriceGroupPriceCreateParams.Cadence.ONE_TIME)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.modelType())
            .isEqualTo(DimensionalPriceGroupPriceCreateParams.ModelType.UNIT)
        assertThat(body.prices())
            .containsExactly(
                DimensionalPriceGroupPriceCreateParams.Price.builder()
                    .addAmount(0.0)
                    .addDimensionValue("string")
                    .build()
            )
    }
}
