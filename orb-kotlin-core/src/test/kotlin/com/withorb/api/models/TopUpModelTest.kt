// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TopUpModelTest {

    @Test
    fun createTopUpModel() {
        val topUpModel =
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
        assertThat(topUpModel).isNotNull
        assertThat(topUpModel.id()).isEqualTo("id")
        assertThat(topUpModel.amount()).isEqualTo("amount")
        assertThat(topUpModel.currency()).isEqualTo("currency")
        assertThat(topUpModel.invoiceSettings())
            .isEqualTo(
                TopUpModel.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(topUpModel.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(topUpModel.threshold()).isEqualTo("threshold")
        assertThat(topUpModel.expiresAfter()).isEqualTo(0L)
        assertThat(topUpModel.expiresAfterUnit()).isEqualTo(TopUpModel.ExpiresAfterUnit.DAY)
    }
}
