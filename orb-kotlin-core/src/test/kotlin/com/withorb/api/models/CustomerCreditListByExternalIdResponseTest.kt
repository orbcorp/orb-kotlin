// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreditListByExternalIdResponse =
            CustomerCreditListByExternalIdResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(
                    CustomerCreditListByExternalIdResponse.CreditBlockSource.ALLOCATION
                )
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CustomerCreditListByExternalIdResponse.Filter.builder()
                        .field(CustomerCreditListByExternalIdResponse.Filter.Field.ITEM_ID)
                        .operator(CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CustomerCreditListByExternalIdResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                .creditAllocation(
                    CustomerCreditListByExternalIdResponse.CreditAllocation.builder()
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
                            CustomerCreditListByExternalIdResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CustomerCreditListByExternalIdResponse.CreditAllocation.Filter
                                        .Field
                                        .PRICE_ID
                                )
                                .operator(
                                    CustomerCreditListByExternalIdResponse.CreditAllocation.Filter
                                        .Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .build()

        assertThat(customerCreditListByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditListByExternalIdResponse.balance()).isEqualTo(0.0)
        assertThat(customerCreditListByExternalIdResponse.creditBlockSource())
            .isEqualTo(CustomerCreditListByExternalIdResponse.CreditBlockSource.ALLOCATION)
        assertThat(customerCreditListByExternalIdResponse.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditListByExternalIdResponse.filters())
            .containsExactly(
                CustomerCreditListByExternalIdResponse.Filter.builder()
                    .field(CustomerCreditListByExternalIdResponse.Filter.Field.ITEM_ID)
                    .operator(CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(customerCreditListByExternalIdResponse.maximumInitialBalance()).isEqualTo(0.0)
        assertThat(customerCreditListByExternalIdResponse.metadata())
            .isEqualTo(
                CustomerCreditListByExternalIdResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customerCreditListByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditListByExternalIdResponse.status())
            .isEqualTo(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
        assertThat(customerCreditListByExternalIdResponse.creditAllocation())
            .isEqualTo(
                CustomerCreditListByExternalIdResponse.CreditAllocation.builder()
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
                        CustomerCreditListByExternalIdResponse.CreditAllocation.Filter.builder()
                            .field(
                                CustomerCreditListByExternalIdResponse.CreditAllocation.Filter.Field
                                    .PRICE_ID
                            )
                            .operator(
                                CustomerCreditListByExternalIdResponse.CreditAllocation.Filter
                                    .Operator
                                    .INCLUDES
                            )
                            .addValue("string")
                            .build()
                    )
                    .licenseTypeId("license_type_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditListByExternalIdResponse =
            CustomerCreditListByExternalIdResponse.builder()
                .id("id")
                .balance(0.0)
                .creditBlockSource(
                    CustomerCreditListByExternalIdResponse.CreditBlockSource.ALLOCATION
                )
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    CustomerCreditListByExternalIdResponse.Filter.builder()
                        .field(CustomerCreditListByExternalIdResponse.Filter.Field.ITEM_ID)
                        .operator(CustomerCreditListByExternalIdResponse.Filter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .maximumInitialBalance(0.0)
                .metadata(
                    CustomerCreditListByExternalIdResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
                .creditAllocation(
                    CustomerCreditListByExternalIdResponse.CreditAllocation.builder()
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
                            CustomerCreditListByExternalIdResponse.CreditAllocation.Filter.builder()
                                .field(
                                    CustomerCreditListByExternalIdResponse.CreditAllocation.Filter
                                        .Field
                                        .PRICE_ID
                                )
                                .operator(
                                    CustomerCreditListByExternalIdResponse.CreditAllocation.Filter
                                        .Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .licenseTypeId("license_type_id")
                        .build()
                )
                .build()

        val roundtrippedCustomerCreditListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditListByExternalIdResponse)
            .isEqualTo(customerCreditListByExternalIdResponse)
    }
}
