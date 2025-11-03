// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerCreateEntryByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .body(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.builder()
                    .amount(0.0)
                    .currency("currency")
                    .description("description")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFilter(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.Filter
                            .builder()
                            .field(
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                    .Filter
                                    .Field
                                    .ITEM_ID
                            )
                            .operator(
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                    .Filter
                                    .Operator
                                    .INCLUDES
                            )
                            .addValue("string")
                            .build()
                    )
                    .invoiceSettings(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                            .InvoiceSettings
                            .builder()
                            .autoCollection(true)
                            .customDueDate(LocalDate.parse("2019-12-27"))
                            .invoiceDate(LocalDate.parse("2019-12-27"))
                            .itemId("item_id")
                            .memo("memo")
                            .netTerms(0L)
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.Metadata
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
    fun pathParams() {
        val params =
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .incrementBody(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .body(
                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.builder()
                        .amount(0.0)
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.Filter
                                .builder()
                                .field(
                                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                        .Filter
                                        .Field
                                        .ITEM_ID
                                )
                                .operator(
                                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                        .Filter
                                        .Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                .InvoiceSettings
                                .builder()
                                .autoCollection(true)
                                .customDueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .itemId("item_id")
                                .memo("memo")
                                .netTerms(0L)
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .metadata(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
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

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.ofIncrement(
                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.builder()
                        .amount(0.0)
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.Filter
                                .builder()
                                .field(
                                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                        .Filter
                                        .Field
                                        .ITEM_ID
                                )
                                .operator(
                                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                        .Filter
                                        .Operator
                                        .INCLUDES
                                )
                                .addValue("string")
                                .build()
                        )
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                .InvoiceSettings
                                .builder()
                                .autoCollection(true)
                                .customDueDate(LocalDate.parse("2019-12-27"))
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .itemId("item_id")
                                .memo("memo")
                                .netTerms(0L)
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .metadata(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
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
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .incrementBody(0.0)
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.ofIncrement(
                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment.builder()
                        .amount(0.0)
                        .build()
                )
            )
    }
}
