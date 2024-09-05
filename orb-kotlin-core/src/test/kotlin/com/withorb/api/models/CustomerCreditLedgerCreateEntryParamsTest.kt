// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams.CustomerCreditLedgerCreateEntryBody

class CustomerCreditLedgerCreateEntryParamsTest {

    @Test
    fun createCustomerCreditLedgerCreateEntryParams() {
      CustomerCreditLedgerCreateEntryParams.builder()
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
          .build()
    }

    @Test
    fun getPathParam() {
      val params = CustomerCreditLedgerCreateEntryParams.builder()
          .customerId("customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
