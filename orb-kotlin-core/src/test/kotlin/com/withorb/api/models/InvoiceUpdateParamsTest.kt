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
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceUpdateParams.InvoiceUpdateBody

class InvoiceUpdateParamsTest {

    @Test
    fun createInvoiceUpdateParams() {
      InvoiceUpdateParams.builder()
          .invoiceId("invoice_id")
          .metadata(InvoiceUpdateParams.Metadata.builder().build())
          .build()
    }

    @Test
    fun getBody() {
      val params = InvoiceUpdateParams.builder()
          .invoiceId("invoice_id")
          .metadata(InvoiceUpdateParams.Metadata.builder().build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.metadata()).isEqualTo(InvoiceUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = InvoiceUpdateParams.builder()
          .invoiceId("invoice_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = InvoiceUpdateParams.builder()
          .invoiceId("invoice_id")
          .build()
      assertThat(params).isNotNull
      // path param "invoiceId"
      assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
