// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DiscountTest {

    @Test
    fun ofPercentage() {
        val percentage =
            PercentageDiscount.builder()
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    PercentageDiscount.Filter.builder()
                        .field(PercentageDiscount.Filter.Field.PRICE_ID)
                        .operator(PercentageDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .build()

        val discount = Discount.ofPercentage(percentage)

        assertThat(discount.percentage()).isEqualTo(percentage)
        assertThat(discount.trial()).isNull()
        assertThat(discount.usage()).isNull()
        assertThat(discount.amount()).isNull()
    }

    @Test
    fun ofPercentageRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofPercentage(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(0.15)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .addFilter(
                        PercentageDiscount.Filter.builder()
                            .field(PercentageDiscount.Filter.Field.PRICE_ID)
                            .operator(PercentageDiscount.Filter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofTrial() {
        val trial =
            TrialDiscount.builder()
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    TrialDiscount.Filter.builder()
                        .field(TrialDiscount.Filter.Field.PRICE_ID)
                        .operator(TrialDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        val discount = Discount.ofTrial(trial)

        assertThat(discount.percentage()).isNull()
        assertThat(discount.trial()).isEqualTo(trial)
        assertThat(discount.usage()).isNull()
        assertThat(discount.amount()).isNull()
    }

    @Test
    fun ofTrialRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofTrial(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .addFilter(
                        TrialDiscount.Filter.builder()
                            .field(TrialDiscount.Filter.Field.PRICE_ID)
                            .operator(TrialDiscount.Filter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .reason("reason")
                    .trialAmountDiscount("trial_amount_discount")
                    .trialPercentageDiscount(0.0)
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofUsage() {
        val usage =
            UsageDiscount.builder()
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    UsageDiscount.Filter.builder()
                        .field(UsageDiscount.Filter.Field.PRICE_ID)
                        .operator(UsageDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .build()

        val discount = Discount.ofUsage(usage)

        assertThat(discount.percentage()).isNull()
        assertThat(discount.trial()).isNull()
        assertThat(discount.usage()).isEqualTo(usage)
        assertThat(discount.amount()).isNull()
    }

    @Test
    fun ofUsageRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofUsage(
                UsageDiscount.builder()
                    .discountType(UsageDiscount.DiscountType.USAGE)
                    .usageDiscount(0.0)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .addFilter(
                        UsageDiscount.Filter.builder()
                            .field(UsageDiscount.Filter.Field.PRICE_ID)
                            .operator(UsageDiscount.Filter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofAmount() {
        val amount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    AmountDiscount.Filter.builder()
                        .field(AmountDiscount.Filter.Field.PRICE_ID)
                        .operator(AmountDiscount.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .build()

        val discount = Discount.ofAmount(amount)

        assertThat(discount.percentage()).isNull()
        assertThat(discount.trial()).isNull()
        assertThat(discount.usage()).isNull()
        assertThat(discount.amount()).isEqualTo(amount)
    }

    @Test
    fun ofAmountRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofAmount(
                AmountDiscount.builder()
                    .amountDiscount("amount_discount")
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .addFilter(
                        AmountDiscount.Filter.builder()
                            .field(AmountDiscount.Filter.Field.PRICE_ID)
                            .operator(AmountDiscount.Filter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val discount = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Discount>())

        val e = assertThrows<OrbInvalidDataException> { discount.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
