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
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpCreateParams.CustomerCreditTopUpCreateBody

class CustomerCreditTopUpCreateParamsTest {

    @Test
    fun createCustomerCreditTopUpCreateParams() {
      CustomerCreditTopUpCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
          .build()
    }

    @Test
    fun getBody() {
      val params = CustomerCreditTopUpCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo("amount")
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.invoiceSettings()).isEqualTo(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(body.threshold()).isEqualTo("threshold")
      assertThat(body.expiresAfter()).isEqualTo(123L)
      assertThat(body.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CustomerCreditTopUpCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo("amount")
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.invoiceSettings()).isEqualTo(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .build())
      assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(body.threshold()).isEqualTo("threshold")
    }

    @Test
    fun getPathParam() {
      val params = CustomerCreditTopUpCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
