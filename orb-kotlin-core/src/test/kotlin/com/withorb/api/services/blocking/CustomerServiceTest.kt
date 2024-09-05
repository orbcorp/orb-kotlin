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
import com.withorb.api.services.blocking.CustomerService
import com.withorb.api.models.CustomerListPage
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class CustomerServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customer = customerService.create(CustomerCreateParams.builder()
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
          .build())
      println(customer)
      customer.validate()
    }

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customer = customerService.update(CustomerUpdateParams.builder()
          .customerId("customer_id")
          .accountingSyncConfiguration(CustomerUpdateParams.AccountingSyncConfiguration.builder()
              .accountingProviders(listOf(CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider.builder()
                  .externalProviderId("external_provider_id")
                  .providerType("provider_type")
                  .build()))
              .excluded(true)
              .build())
          .additionalEmails(listOf("string"))
          .autoCollection(true)
          .billingAddress(CustomerUpdateParams.BillingAddress.builder()
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
          .metadata(CustomerUpdateParams.Metadata.builder().build())
          .name("name")
          .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
          .paymentProviderId("payment_provider_id")
          .reportingConfiguration(CustomerUpdateParams.ReportingConfiguration.builder()
              .exempt(true)
              .build())
          .shippingAddress(CustomerUpdateParams.ShippingAddress.builder()
              .city("city")
              .country("country")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .taxId(CustomerUpdateParams.TaxId.builder()
              .country(CustomerUpdateParams.TaxId.Country.AD)
              .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
              .value("value")
              .build())
          .build())
      println(customer)
      customer.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customers = customerService.list(CustomerListParams.builder().build())
      println(customers)
      customers.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callDelete() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      customerService.delete(CustomerDeleteParams.builder()
          .customerId("customer_id")
          .build())
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customer = customerService.fetch(CustomerFetchParams.builder()
          .customerId("customer_id")
          .build())
      println(customer)
      customer.validate()
    }

    @Test
    fun callFetchByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customer = customerService.fetchByExternalId(CustomerFetchByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())
      println(customer)
      customer.validate()
    }

    @Test
    fun callUpdateByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val customerService = client.customers()
      val customer = customerService.updateByExternalId(CustomerUpdateByExternalIdParams.builder()
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
          .build())
      println(customer)
      customer.validate()
    }
}
