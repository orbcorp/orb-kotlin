// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerServiceTest {

    @Test
    fun list() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()

      val page = ledgerService.list(CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .build())

      page.response().validate()
    }

    @Test
    fun createEntry() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()

      val response = ledgerService.createEntry(CustomerCreditLedgerCreateEntryParams.builder()
          .customerId("customer_id")
          .body(CustomerCreditLedgerCreateEntryParams.Body.AddIncrementCreditLedgerEntryRequestParams.builder()
              .amount(0.0)
              .entryType(CustomerCreditLedgerCreateEntryParams.Body.AddIncrementCreditLedgerEntryRequestParams.EntryType.INCREMENT)
              .currency("currency")
              .description("description")
              .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .invoiceSettings(CustomerCreditLedgerCreateEntryParams.Body.AddIncrementCreditLedgerEntryRequestParams.InvoiceSettings.builder()
                  .autoCollection(true)
                  .netTerms(0L)
                  .memo("memo")
                  .requireSuccessfulPayment(true)
                  .build())
              .metadata(CustomerCreditLedgerCreateEntryParams.Body.AddIncrementCreditLedgerEntryRequestParams.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .perUnitCostBasis("per_unit_cost_basis")
              .build())
          .build())

      response.validate()
    }

    @Test
    fun createEntryByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()

      val response = ledgerService.createEntryByExternalId(CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .body(CustomerCreditLedgerCreateEntryByExternalIdParams.Body.AddIncrementCreditLedgerEntryRequestParams.builder()
              .amount(0.0)
              .entryType(CustomerCreditLedgerCreateEntryByExternalIdParams.Body.AddIncrementCreditLedgerEntryRequestParams.EntryType.INCREMENT)
              .currency("currency")
              .description("description")
              .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .invoiceSettings(CustomerCreditLedgerCreateEntryByExternalIdParams.Body.AddIncrementCreditLedgerEntryRequestParams.InvoiceSettings.builder()
                  .autoCollection(true)
                  .netTerms(0L)
                  .memo("memo")
                  .requireSuccessfulPayment(true)
                  .build())
              .metadata(CustomerCreditLedgerCreateEntryByExternalIdParams.Body.AddIncrementCreditLedgerEntryRequestParams.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .perUnitCostBasis("per_unit_cost_basis")
              .build())
          .build())

      response.validate()
    }

    @Test
    fun listByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()

      val page = ledgerService.listByExternalId(CustomerCreditLedgerListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())

      page.response().validate()
    }
}
