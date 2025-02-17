// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditLedgerCreateEntryParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerCreateEntryParams.builder()
            .customerId("customer_id")
            .body(
                CustomerCreditLedgerCreateEntryParams.Body
                    .AddIncrementCreditLedgerEntryRequestParams
                    .builder()
                    .amount(0.0)
                    .entryType(
                        CustomerCreditLedgerCreateEntryParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .EntryType
                            .INCREMENT
                    )
                    .currency("currency")
                    .description("description")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceSettings(
                        CustomerCreditLedgerCreateEntryParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .InvoiceSettings
                            .builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .metadata(
                        CustomerCreditLedgerCreateEntryParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .body(
                    CustomerCreditLedgerCreateEntryParams.Body
                        .AddIncrementCreditLedgerEntryRequestParams
                        .builder()
                        .amount(0.0)
                        .entryType(
                            CustomerCreditLedgerCreateEntryParams.Body
                                .AddIncrementCreditLedgerEntryRequestParams
                                .EntryType
                                .INCREMENT
                        )
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryParams.Body
                                .AddIncrementCreditLedgerEntryRequestParams
                                .InvoiceSettings
                                .builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .metadata(
                            CustomerCreditLedgerCreateEntryParams.Body
                                .AddIncrementCreditLedgerEntryRequestParams
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryParams.Body
                    .ofAddIncrementCreditLedgerEntryRequestParams(
                        CustomerCreditLedgerCreateEntryParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                CustomerCreditLedgerCreateEntryParams.Body
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .EntryType
                                    .INCREMENT
                            )
                            .currency("currency")
                            .description("description")
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .invoiceSettings(
                                CustomerCreditLedgerCreateEntryParams.Body
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .InvoiceSettings
                                    .builder()
                                    .autoCollection(true)
                                    .netTerms(0L)
                                    .memo("memo")
                                    .requireSuccessfulPayment(true)
                                    .build()
                            )
                            .metadata(
                                CustomerCreditLedgerCreateEntryParams.Body
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .addIncrementCreditLedgerEntryRequestParamsBody(0.0)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryParams.Body
                    .ofAddIncrementCreditLedgerEntryRequestParams(
                        CustomerCreditLedgerCreateEntryParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                CustomerCreditLedgerCreateEntryParams.Body
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .EntryType
                                    .INCREMENT
                            )
                            .build()
                    )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .addIncrementCreditLedgerEntryRequestParamsBody(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
