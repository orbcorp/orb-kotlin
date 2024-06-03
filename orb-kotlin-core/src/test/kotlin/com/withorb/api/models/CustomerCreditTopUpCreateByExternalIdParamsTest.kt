// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateByExternalIdParamsTest {

    @Test
    fun createCustomerCreditTopUpCreateByExternalIdParams() {
        CustomerCreditTopUpCreateByExternalIdParams.builder()
            .externalCustomerId("string")
            .amount("string")
            .currency("string")
            .invoiceSettings(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
            .perUnitCostBasis("string")
            .threshold("string")
            .expiresAfter(123L)
            .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("string")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .expiresAfter(123L)
                .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("string")
        assertThat(body.threshold()).isEqualTo("string")
        assertThat(body.expiresAfter()).isEqualTo(123L)
        assertThat(body.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("string")
        assertThat(body.threshold()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
