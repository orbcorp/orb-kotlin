// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBlockRetrieveResponseTest {

    @Test
    fun create() {
        val creditBlockRetrieveResponse =
            CreditBlockRetrieveResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(CreditBlockRetrieveResponse.CreditBlockSource.ALLOCATION)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockRetrieveResponse.Filter.builder()
                        .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CreditBlockRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockRetrieveResponse.Status.ACTIVE)
                .creditAllocation(
                    CreditBlockRetrieveResponse.CreditAllocation.builder()
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
                            CreditBlockRetrieveResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CreditBlockRetrieveResponse.CreditAllocation.Filter.Field
                                        .PRICE_ID
                                )
                                .operator(
                                    CreditBlockRetrieveResponse.CreditAllocation.Filter.Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .creditCommitment(
                    CreditBlockRetrieveResponse.CreditCommitment.builder()
                        .id("id")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .build()

        assertThat(creditBlockRetrieveResponse.id()).isEqualTo("id")
        assertThat(creditBlockRetrieveResponse.balance()).isEqualTo(0.0)
        assertThat(creditBlockRetrieveResponse.creditBlockSource())
            .isEqualTo(CreditBlockRetrieveResponse.CreditBlockSource.ALLOCATION)
        assertThat(creditBlockRetrieveResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockRetrieveResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditBlockRetrieveResponse.filters())
            .containsExactly(
                CreditBlockRetrieveResponse.Filter.builder()
                    .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                    .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(creditBlockRetrieveResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(creditBlockRetrieveResponse.metadata())
            .isEqualTo(
                CreditBlockRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(creditBlockRetrieveResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(creditBlockRetrieveResponse.status())
            .isEqualTo(CreditBlockRetrieveResponse.Status.ACTIVE)
        assertThat(creditBlockRetrieveResponse.creditAllocation())
            .isEqualTo(
                CreditBlockRetrieveResponse.CreditAllocation.builder()
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
                        CreditBlockRetrieveResponse.CreditAllocation.Filter.builder()
                            .field(
                                CreditBlockRetrieveResponse.CreditAllocation.Filter.Field.PRICE_ID
                            )
                            .operator(
                                CreditBlockRetrieveResponse.CreditAllocation.Filter.Operator
                                    .INCLUDES
                            )
                            .addValue("string")
                            .build()
                    )
                    .licenseTypeId("license_type_id")
                    .build()
            )
        assertThat(creditBlockRetrieveResponse.creditCommitment())
            .isEqualTo(
                CreditBlockRetrieveResponse.CreditCommitment.builder()
                    .id("id")
                    .subscriptionId("subscription_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditBlockRetrieveResponse =
            CreditBlockRetrieveResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(CreditBlockRetrieveResponse.CreditBlockSource.ALLOCATION)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CreditBlockRetrieveResponse.Filter.builder()
                        .field(CreditBlockRetrieveResponse.Filter.Field.PRICE_ID)
                        .operator(CreditBlockRetrieveResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CreditBlockRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CreditBlockRetrieveResponse.Status.ACTIVE)
                .creditAllocation(
                    CreditBlockRetrieveResponse.CreditAllocation.builder()
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
                            CreditBlockRetrieveResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CreditBlockRetrieveResponse.CreditAllocation.Filter.Field
                                        .PRICE_ID
                                )
                                .operator(
                                    CreditBlockRetrieveResponse.CreditAllocation.Filter.Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .creditCommitment(
                    CreditBlockRetrieveResponse.CreditCommitment.builder()
                        .id("id")
                        .subscriptionId("subscription_id")
                        .build()
                )
                .build()

        val roundtrippedCreditBlockRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditBlockRetrieveResponse),
                jacksonTypeRef<CreditBlockRetrieveResponse>(),
            )

        assertThat(roundtrippedCreditBlockRetrieveResponse).isEqualTo(creditBlockRetrieveResponse)
    }
}
