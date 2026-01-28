// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val page = ledgerServiceAsync.list("customer_id")

        page.response().validate()
    }

    @Test
    suspend fun createEntry() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val response =
            ledgerServiceAsync.createEntry(
                CustomerCreditLedgerCreateEntryParams.builder()
                    .customerId("customer_id")
                    .body(
                        CustomerCreditLedgerCreateEntryParams.Body.Increment.builder()
                            .amount(0.0)
                            .currency("currency")
                            .description("description")
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addFilter(
                                CustomerCreditLedgerCreateEntryParams.Body.Increment.Filter
                                    .builder()
                                    .field(
                                        CustomerCreditLedgerCreateEntryParams.Body.Increment.Filter
                                            .Field
                                            .ITEM_ID
                                    )
                                    .operator(
                                        CustomerCreditLedgerCreateEntryParams.Body.Increment.Filter
                                            .Operator
                                            .INCLUDES
                                    )
                                    .addValue("string")
                                    .build()
                            )
                            .invoiceSettings(
                                CustomerCreditLedgerCreateEntryParams.Body.Increment.InvoiceSettings
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
                                CustomerCreditLedgerCreateEntryParams.Body.Increment.Metadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun createEntryByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val response =
            ledgerServiceAsync.createEntryByExternalId(
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
                                CustomerCreditLedgerCreateEntryByExternalIdParams.Body.Increment
                                    .Filter
                                    .builder()
                                    .field(
                                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                                            .Increment
                                            .Filter
                                            .Field
                                            .ITEM_ID
                                    )
                                    .operator(
                                        CustomerCreditLedgerCreateEntryByExternalIdParams.Body
                                            .Increment
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
            )

        response.validate()
    }

    @Test
    suspend fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val page = ledgerServiceAsync.listByExternalId("external_customer_id")

        page.response().validate()
    }
}
