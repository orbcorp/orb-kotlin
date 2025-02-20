// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditLedgerCreateEntryByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .body(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                    .AddIncrementCreditLedgerEntryRequestParams
                    .builder()
                    .amount(0.0)
                    .entryType(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .EntryType
                            .INCREMENT
                    )
                    .currency("currency")
                    .description("description")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceSettings(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .body(
                    CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                        .AddIncrementCreditLedgerEntryRequestParams
                        .builder()
                        .amount(0.0)
                        .entryType(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                                .AddIncrementCreditLedgerEntryRequestParams
                                .EntryType
                                .INCREMENT
                        )
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
                            CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                    .ofAddIncrementCreditLedgerEntryRequestParams(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .EntryType
                                    .INCREMENT
                            )
                            .currency("currency")
                            .description("description")
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .invoiceSettings(
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .addIncrementCreditLedgerEntryRequestParamsBody(0.0)
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                    .ofAddIncrementCreditLedgerEntryRequestParams(
                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                            .AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body
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
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .addIncrementCreditLedgerEntryRequestParamsBody(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
