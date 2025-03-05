// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.AddCreditLedgerEntryRequest
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val page =
            ledgerServiceAsync.list(
                CustomerCreditLedgerListParams.builder().customerId("customer_id").build()
            )

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

        val creditLedgerEntryModel =
            ledgerServiceAsync.createEntry(
                CustomerCreditLedgerCreateEntryParams.builder()
                    .customerId("customer_id")
                    .addCreditLedgerEntryRequest(
                        AddCreditLedgerEntryRequest.AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                AddCreditLedgerEntryRequest
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .EntryType
                                    .INCREMENT
                            )
                            .currency("currency")
                            .description("description")
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .invoiceSettings(
                                AddCreditLedgerEntryRequest
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
                                AddCreditLedgerEntryRequest
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
            )

        creditLedgerEntryModel.validate()
    }

    @Test
    suspend fun createEntryByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val creditLedgerEntryModel =
            ledgerServiceAsync.createEntryByExternalId(
                CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .addCreditLedgerEntryRequest(
                        AddCreditLedgerEntryRequest.AddIncrementCreditLedgerEntryRequestParams
                            .builder()
                            .amount(0.0)
                            .entryType(
                                AddCreditLedgerEntryRequest
                                    .AddIncrementCreditLedgerEntryRequestParams
                                    .EntryType
                                    .INCREMENT
                            )
                            .currency("currency")
                            .description("description")
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .invoiceSettings(
                                AddCreditLedgerEntryRequest
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
                                AddCreditLedgerEntryRequest
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
            )

        creditLedgerEntryModel.validate()
    }

    @Test
    suspend fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerServiceAsync = client.customers().credits().ledger()

        val page =
            ledgerServiceAsync.listByExternalId(
                CustomerCreditLedgerListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        page.response().validate()
    }
}
