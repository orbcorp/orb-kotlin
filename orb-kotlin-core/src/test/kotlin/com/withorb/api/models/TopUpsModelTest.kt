// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TopUpsModelTest {

    @Test
    fun createTopUpsModel() {
        val topUpsModel =
            TopUpsModel.builder()
                .addData(
                    TopUpModel.builder()
                        .id("id")
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            TopUpModel.InvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .expiresAfter(0L)
                        .expiresAfterUnit(TopUpModel.ExpiresAfterUnit.DAY)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()
        assertThat(topUpsModel).isNotNull
        assertThat(topUpsModel.data())
            .containsExactly(
                TopUpModel.builder()
                    .id("id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        TopUpModel.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .expiresAfter(0L)
                    .expiresAfterUnit(TopUpModel.ExpiresAfterUnit.DAY)
                    .build()
            )
        assertThat(topUpsModel.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }
}
