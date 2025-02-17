// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpCreateParams.builder()
            .customerId("customer_id")
            .amount("amount")
            .currency("currency")
            .invoiceSettings(
                CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
            .perUnitCostBasis("per_unit_cost_basis")
            .threshold("threshold")
            .expiresAfter(0L)
            .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditTopUpCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .memo("memo")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .expiresAfter(0L)
                .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(body.threshold()).isEqualTo("threshold")
        assertThat(body.expiresAfter()).isEqualTo(0L)
        assertThat(body.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(body.threshold()).isEqualTo("threshold")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
