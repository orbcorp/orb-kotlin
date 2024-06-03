// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditLedgerCreateEntryByExternalIdParamsTest {

    @Test
    fun createCustomerCreditLedgerCreateEntryByExternalIdParams() {
        CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
            .externalCustomerId("string")
            .forAddIncrementCreditLedgerEntryRequestParams(
                CustomerCreditLedgerCreateEntryByExternalIdParams
                    .AddIncrementCreditLedgerEntryRequestParams
                    .builder()
                    .amount(42.23)
                    .entryType(
                        CustomerCreditLedgerCreateEntryByExternalIdParams
                            .AddIncrementCreditLedgerEntryRequestParams
                            .EntryType
                            .INCREMENT
                    )
                    .currency("string")
                    .description("string")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceSettings(
                        CustomerCreditLedgerCreateEntryByExternalIdParams
                            .AddIncrementCreditLedgerEntryRequestParams
                            .InvoiceSettings
                            .builder()
                            .autoCollection(true)
                            .netTerms(123L)
                            .memo("string")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdParams
                            .AddIncrementCreditLedgerEntryRequestParams
                            .Metadata
                            .builder()
                            .build()
                    )
                    .perUnitCostBasis("string")
                    .build()
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                .externalCustomerId("string")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
