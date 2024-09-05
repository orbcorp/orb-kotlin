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
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerCreateParams.CustomerCreateBody

class CustomerCreateParamsTest {

    @Test
    fun createCustomerCreateParams() {
      CustomerCreateParams.builder()
          .email("email")
          .name("x")
          .accountingSyncConfiguration(CustomerCreateParams.AccountingSyncConfiguration.builder()
              .accountingProviders(listOf(CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider.builder()
                  .externalProviderId("external_provider_id")
                  .providerType("provider_type")
                  .build()))
              .excluded(true)
              .build())
          .additionalEmails(listOf("string"))
          .autoCollection(true)
          .billingAddress(CustomerCreateParams.BillingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .currency("currency")
          .emailDelivery(true)
          .externalCustomerId("external_customer_id")
          .metadata(CustomerCreateParams.Metadata.builder().build())
          .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
          .paymentProviderId("payment_provider_id")
          .reportingConfiguration(CustomerCreateParams.ReportingConfiguration.builder()
              .exempt(true)
              .build())
          .shippingAddress(CustomerCreateParams.ShippingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .taxId(CustomerCreateParams.TaxId.builder()
              .country(CustomerCreateParams.TaxId.Country.AD)
              .type(CustomerCreateParams.TaxId.Type.AD_NRT)
              .value("value")
              .build())
          .timezone("timezone")
          .build()
    }

    @Test
    fun getBody() {
      val params = CustomerCreateParams.builder()
          .email("email")
          .name("x")
          .accountingSyncConfiguration(CustomerCreateParams.AccountingSyncConfiguration.builder()
              .accountingProviders(listOf(CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider.builder()
                  .externalProviderId("external_provider_id")
                  .providerType("provider_type")
                  .build()))
              .excluded(true)
              .build())
          .additionalEmails(listOf("string"))
          .autoCollection(true)
          .billingAddress(CustomerCreateParams.BillingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .currency("currency")
          .emailDelivery(true)
          .externalCustomerId("external_customer_id")
          .metadata(CustomerCreateParams.Metadata.builder().build())
          .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
          .paymentProviderId("payment_provider_id")
          .reportingConfiguration(CustomerCreateParams.ReportingConfiguration.builder()
              .exempt(true)
              .build())
          .shippingAddress(CustomerCreateParams.ShippingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .taxId(CustomerCreateParams.TaxId.builder()
              .country(CustomerCreateParams.TaxId.Country.AD)
              .type(CustomerCreateParams.TaxId.Type.AD_NRT)
              .value("value")
              .build())
          .timezone("timezone")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.email()).isEqualTo("email")
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.accountingSyncConfiguration()).isEqualTo(CustomerCreateParams.AccountingSyncConfiguration.builder()
          .accountingProviders(listOf(CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider.builder()
              .externalProviderId("external_provider_id")
              .providerType("provider_type")
              .build()))
          .excluded(true)
          .build())
      assertThat(body.additionalEmails()).isEqualTo(listOf("string"))
      assertThat(body.autoCollection()).isEqualTo(true)
      assertThat(body.billingAddress()).isEqualTo(CustomerCreateParams.BillingAddress.builder()
          .city("city")
          .country("country")
          .line1("line1")
          .line2("line2")
          .postalCode("postal_code")
          .state("state")
          .build())
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.emailDelivery()).isEqualTo(true)
      assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
      assertThat(body.metadata()).isEqualTo(CustomerCreateParams.Metadata.builder().build())
      assertThat(body.paymentProvider()).isEqualTo(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
      assertThat(body.paymentProviderId()).isEqualTo("payment_provider_id")
      assertThat(body.reportingConfiguration()).isEqualTo(CustomerCreateParams.ReportingConfiguration.builder()
          .exempt(true)
          .build())
      assertThat(body.shippingAddress()).isEqualTo(CustomerCreateParams.ShippingAddress.builder()
          .city("city")
          .country("country")
          .line1("line1")
          .line2("line2")
          .postalCode("postal_code")
          .state("state")
          .build())
      assertThat(body.taxId()).isEqualTo(CustomerCreateParams.TaxId.builder()
          .country(CustomerCreateParams.TaxId.Country.AD)
          .type(CustomerCreateParams.TaxId.Type.AD_NRT)
          .value("value")
          .build())
      assertThat(body.timezone()).isEqualTo("timezone")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CustomerCreateParams.builder()
          .email("email")
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.email()).isEqualTo("email")
      assertThat(body.name()).isEqualTo("x")
    }
}
