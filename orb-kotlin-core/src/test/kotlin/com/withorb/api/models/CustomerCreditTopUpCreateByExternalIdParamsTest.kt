// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpCreateByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .addCreditTopUpRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .addCreditTopUpRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .addCreditTopUpRequest(
                    AddCreditTopUpRequest.builder()
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            AddCreditTopUpRequest.InvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AddCreditTopUpRequest.builder()
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        AddCreditTopUpRequest.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .addCreditTopUpRequest(
                    AddCreditTopUpRequest.builder()
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            AddCreditTopUpRequest.InvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
