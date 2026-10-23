// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockUpdateResponseTest {

    @Test
    fun create() {
        val creditBlockUpdateResponse =
            CreditBlockUpdateResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(CreditBlockUpdateResponse.CreditBlockSource.ALLOCATION)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockUpdateResponse.Filter.builder()
                        .field(CreditBlockUpdateResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockUpdateResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CreditBlockUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockUpdateResponse.Status.ACTIVE)
                .creditAllocation(
                    CreditBlockUpdateResponse.CreditAllocation.builder()
                        .allowsRollover(true)
                        .currency("currency")
                        .customExpiration(
                            CustomExpiration.builder()
                                .duration(0L)
                                .durationUnit(CustomExpiration.DurationUnit.DAY)
                                .build()
                        )
                        .itemId("item_id")
                        .addFilter(
                            CreditBlockUpdateResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CreditBlockUpdateResponse.CreditAllocation.Filter.Field.PRICE_ID
                                )
                                .operator(
                                    CreditBlockUpdateResponse.CreditAllocation.Filter.Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .creditCommitment(
                    CreditBlockUpdateResponse.CreditCommitment.builder()
                        .id("id")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .build()

        assertThat(creditBlockUpdateResponse.id()).isEqualTo("id")
        assertThat(creditBlockUpdateResponse.balance()).isEqualTo(0.0)
        assertThat(creditBlockUpdateResponse.creditBlockSource())
            .isEqualTo(CreditBlockUpdateResponse.CreditBlockSource.ALLOCATION)
        assertThat(creditBlockUpdateResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockUpdateResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockUpdateResponse.filters())
            .containsExactly(
                CreditBlockUpdateResponse.Filter.builder()
                    .field(CreditBlockUpdateResponse.Filter.Field.PRICE_ID)
                    .operator(CreditBlockUpdateResponse.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(creditBlockUpdateResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(creditBlockUpdateResponse.metadata())
            .isEqualTo(
                CreditBlockUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(creditBlockUpdateResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(creditBlockUpdateResponse.status())
            .isEqualTo(CreditBlockUpdateResponse.Status.ACTIVE)
        assertThat(creditBlockUpdateResponse.creditAllocation())
            .isEqualTo(
                CreditBlockUpdateResponse.CreditAllocation.builder()
                    .allowsRollover(true)
                    .currency("currency")
                    .customExpiration(
                        CustomExpiration.builder()
                            .duration(0L)
                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                            .build()
                    )
                    .itemId("item_id")
                    .addFilter(
                        CreditBlockUpdateResponse.CreditAllocation.Filter.builder()
                            .field(CreditBlockUpdateResponse.CreditAllocation.Filter.Field.PRICE_ID)
                            .operator(
                                CreditBlockUpdateResponse.CreditAllocation.Filter.Operator.INCLUDES
                            )
                            .addValue("string")
                            .build()
                    )
                    .licenseTypeId("license_type_id")
                    .build()
            )
        assertThat(creditBlockUpdateResponse.creditCommitment())
            .isEqualTo(
                CreditBlockUpdateResponse.CreditCommitment.builder()
                    .id("id")
                    .subscriptionId("subscription_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditBlockUpdateResponse =
            CreditBlockUpdateResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(CreditBlockUpdateResponse.CreditBlockSource.ALLOCATION)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockUpdateResponse.Filter.builder()
                        .field(CreditBlockUpdateResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockUpdateResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CreditBlockUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockUpdateResponse.Status.ACTIVE)
                .creditAllocation(
                    CreditBlockUpdateResponse.CreditAllocation.builder()
                        .allowsRollover(true)
                        .currency("currency")
                        .customExpiration(
                            CustomExpiration.builder()
                                .duration(0L)
                                .durationUnit(CustomExpiration.DurationUnit.DAY)
                                .build()
                        )
                        .itemId("item_id")
                        .addFilter(
                            CreditBlockUpdateResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CreditBlockUpdateResponse.CreditAllocation.Filter.Field.PRICE_ID
                                )
                                .operator(
                                    CreditBlockUpdateResponse.CreditAllocation.Filter.Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .creditCommitment(
                    CreditBlockUpdateResponse.CreditCommitment.builder()
                        .id("id")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .build()

        val roundtrippedCreditBlockUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditBlockUpdateResponse),
                jacksonTypeRef<CreditBlockUpdateResponse>(),
            )

        assertThat(roundtrippedCreditBlockUpdateResponse).isEqualTo(creditBlockUpdateResponse)
    }
}
