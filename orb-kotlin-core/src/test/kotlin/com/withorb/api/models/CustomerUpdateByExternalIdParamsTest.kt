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
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams.CustomerUpdateByExternalIdBody

class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun createCustomerUpdateByExternalIdParams() {
      CustomerUpdateByExternalIdParams.builder()
          .id("external_customer_id")
          .accountingSyncConfiguration(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
              .accountingProviders(listOf(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.AccountingProvider.builder()
                  .externalProviderId("external_provider_id")
                  .providerType("provider_type")
                  .build()))
              .excluded(true)
              .build())
          .additionalEmails(listOf("string"))
          .autoCollection(true)
          .billingAddress(CustomerUpdateByExternalIdParams.BillingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .currency("currency")
          .email("email")
          .emailDelivery(true)
          .externalCustomerId("external_customer_id")
          .metadata(CustomerUpdateByExternalIdParams.Metadata.builder().build())
          .name("name")
          .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
          .paymentProviderId("payment_provider_id")
          .reportingConfiguration(CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
              .exempt(true)
              .build())
          .shippingAddress(CustomerUpdateByExternalIdParams.ShippingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .taxId(CustomerUpdateByExternalIdParams.TaxId.builder()
              .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
              .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
              .value("value")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = CustomerUpdateByExternalIdParams.builder()
          .id("external_customer_id")
          .accountingSyncConfiguration(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
              .accountingProviders(listOf(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.AccountingProvider.builder()
                  .externalProviderId("external_provider_id")
                  .providerType("provider_type")
                  .build()))
              .excluded(true)
              .build())
          .additionalEmails(listOf("string"))
          .autoCollection(true)
          .billingAddress(CustomerUpdateByExternalIdParams.BillingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .currency("currency")
          .email("email")
          .emailDelivery(true)
          .externalCustomerId("external_customer_id")
          .metadata(CustomerUpdateByExternalIdParams.Metadata.builder().build())
          .name("name")
          .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
          .paymentProviderId("payment_provider_id")
          .reportingConfiguration(CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
              .exempt(true)
              .build())
          .shippingAddress(CustomerUpdateByExternalIdParams.ShippingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .taxId(CustomerUpdateByExternalIdParams.TaxId.builder()
              .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
              .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
              .value("value")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountingSyncConfiguration()).isEqualTo(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
          .accountingProviders(listOf(CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.AccountingProvider.builder()
              .externalProviderId("external_provider_id")
              .providerType("provider_type")
              .build()))
          .excluded(true)
          .build())
      assertThat(body.additionalEmails()).isEqualTo(listOf("string"))
      assertThat(body.autoCollection()).isEqualTo(true)
      assertThat(body.billingAddress()).isEqualTo(CustomerUpdateByExternalIdParams.BillingAddress.builder()
          .city("city")
          .country("country")
          .line1("line1")
          .line2("line2")
          .postalCode("postal_code")
          .state("state")
          .build())
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.email()).isEqualTo("email")
      assertThat(body.emailDelivery()).isEqualTo(true)
      assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
      assertThat(body.metadata()).isEqualTo(CustomerUpdateByExternalIdParams.Metadata.builder().build())
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.paymentProvider()).isEqualTo(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
      assertThat(body.paymentProviderId()).isEqualTo("payment_provider_id")
      assertThat(body.reportingConfiguration()).isEqualTo(CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
          .exempt(true)
          .build())
      assertThat(body.shippingAddress()).isEqualTo(CustomerUpdateByExternalIdParams.ShippingAddress.builder()
          .city("city")
          .country("country")
          .line1("line1")
          .line2("line2")
          .postalCode("postal_code")
          .state("state")
          .build())
      assertThat(body.taxId()).isEqualTo(CustomerUpdateByExternalIdParams.TaxId.builder()
          .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
          .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
          .value("value")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CustomerUpdateByExternalIdParams.builder()
          .id("external_customer_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = CustomerUpdateByExternalIdParams.builder()
          .id("external_customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "id"
      assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
