// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.models.CustomerCreditLedgerListPage
import com.withorb.api.models.CustomerCreditLedgerListParams
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPage
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class LedgerServiceTest {

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()
      val creditLedgerEntries = ledgerService.list(CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .build())
      println(creditLedgerEntries)
      creditLedgerEntries.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callCreateEntry() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()
      val customerCreditLedgerCreateEntryResponse = ledgerService.createEntry(CustomerCreditLedgerCreateEntryParams.builder()
          .customerId("customer_id")
          .forAddIncrementCreditLedgerEntryRequestParams(CustomerCreditLedgerCreateEntryParams.AddIncrementCreditLedgerEntryRequestParams.builder()
              .amount(42.23)
              .entryType(CustomerCreditLedgerCreateEntryParams.AddIncrementCreditLedgerEntryRequestParams.EntryType.INCREMENT)
              .currency("currency")
              .description("description")
              .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .invoiceSettings(CustomerCreditLedgerCreateEntryParams.AddIncrementCreditLedgerEntryRequestParams.InvoiceSettings.builder()
                  .autoCollection(true)
                  .netTerms(123L)
                  .memo("memo")
                  .requireSuccessfulPayment(true)
                  .build())
              .metadata(CustomerCreditLedgerCreateEntryParams.AddIncrementCreditLedgerEntryRequestParams.Metadata.builder().build())
              .perUnitCostBasis("per_unit_cost_basis")
              .build())
          .build())
      println(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun callCreateEntryByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()
      val customerCreditLedgerCreateEntryByExternalIdResponse = ledgerService.createEntryByExternalId(CustomerCreditLedgerCreateEntryByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .forAddIncrementCreditLedgerEntryRequestParams(CustomerCreditLedgerCreateEntryByExternalIdParams.AddIncrementCreditLedgerEntryRequestParams.builder()
              .amount(42.23)
              .entryType(CustomerCreditLedgerCreateEntryByExternalIdParams.AddIncrementCreditLedgerEntryRequestParams.EntryType.INCREMENT)
              .currency("currency")
              .description("description")
              .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .invoiceSettings(CustomerCreditLedgerCreateEntryByExternalIdParams.AddIncrementCreditLedgerEntryRequestParams.InvoiceSettings.builder()
                  .autoCollection(true)
                  .netTerms(123L)
                  .memo("memo")
                  .requireSuccessfulPayment(true)
                  .build())
              .metadata(CustomerCreditLedgerCreateEntryByExternalIdParams.AddIncrementCreditLedgerEntryRequestParams.Metadata.builder().build())
              .perUnitCostBasis("per_unit_cost_basis")
              .build())
          .build())
      println(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun callListByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val ledgerService = client.customers().credits().ledger()
      val creditLedgerEntries = ledgerService.listByExternalId(CustomerCreditLedgerListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())
      println(creditLedgerEntries)
      creditLedgerEntries.data().forEach {
          it.validate()
      }
    }
}
