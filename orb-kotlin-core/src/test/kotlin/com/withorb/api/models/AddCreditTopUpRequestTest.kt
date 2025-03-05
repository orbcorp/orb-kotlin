// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddCreditTopUpRequestTest {

    @Test
    fun createAddCreditTopUpRequest() {
        val addCreditTopUpRequest =
            AddCreditTopUpRequest.builder()
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    AddCreditTopUpRequest.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .memo("memo")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .activeFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAfter(0L)
                .expiresAfterUnit(AddCreditTopUpRequest.ExpiresAfterUnit.DAY)
                .build()
        assertThat(addCreditTopUpRequest).isNotNull
        assertThat(addCreditTopUpRequest.amount()).isEqualTo("amount")
        assertThat(addCreditTopUpRequest.currency()).isEqualTo("currency")
        assertThat(addCreditTopUpRequest.invoiceSettings())
            .isEqualTo(
                AddCreditTopUpRequest.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(addCreditTopUpRequest.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(addCreditTopUpRequest.threshold()).isEqualTo("threshold")
        assertThat(addCreditTopUpRequest.activeFrom())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addCreditTopUpRequest.expiresAfter()).isEqualTo(0L)
        assertThat(addCreditTopUpRequest.expiresAfterUnit())
            .isEqualTo(AddCreditTopUpRequest.ExpiresAfterUnit.DAY)
    }
}
