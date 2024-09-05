// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

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
import com.withorb.api.services.blocking.InvoiceLineItemService
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class InvoiceLineItemServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val invoiceLineItemService = client.invoiceLineItems()
      val invoiceLineItemCreateResponse = invoiceLineItemService.create(InvoiceLineItemCreateParams.builder()
          .amount("12.00")
          .endDate(LocalDate.parse("2023-09-22"))
          .invoiceId("4khy3nwzktxv7")
          .name("Item Name")
          .quantity(42.23)
          .startDate(LocalDate.parse("2023-09-22"))
          .build())
      println(invoiceLineItemCreateResponse)
      invoiceLineItemCreateResponse.validate()
    }
}
