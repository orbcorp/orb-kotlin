// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.PercentageDiscount
import com.withorb.api.models.UnitConfig
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.create(
                InvoiceCreateParams.builder()
                    .currency("USD")
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addLineItem(
                        InvoiceCreateParams.LineItem.builder()
                            .endDate(LocalDate.parse("2023-09-22"))
                            .itemId("4khy3nwzktxv7")
                            .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                            .name("Line Item Name")
                            .quantity(1.0)
                            .startDate(LocalDate.parse("2023-09-22"))
                            .unitConfig(
                                UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .prorated(true)
                                    .build()
                            )
                            .build()
                    )
                    .customerId("4khy3nwzktxv7")
                    .discount(
                        PercentageDiscount.builder()
                            .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                            .percentageDiscount(0.15)
                            .addAppliesToPriceId("h74gfhdjvn7ujokd")
                            .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                            .addFilter(
                                PercentageDiscount.Filter.builder()
                                    .field(PercentageDiscount.Filter.Field.PRICE_ID)
                                    .operator(PercentageDiscount.Filter.Operator.INCLUDES)
                                    .addValue("string")
                                    .build()
                            )
                            .reason("reason")
                            .build()
                    )
                    .dueDate(LocalDate.parse("2023-09-22"))
                    .externalCustomerId("external-customer-id")
                    .memo("An optional memo for my invoice.")
                    .metadata(
                        InvoiceCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .willAutoIssue(false)
                    .build()
            )

        invoice.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.update(
                InvoiceUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .dueDate(LocalDate.parse("2023-09-22"))
                    .invoiceDate(LocalDate.parse("2023-09-22"))
                    .metadata(
                        InvoiceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .build()
            )

        invoice.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val page = invoiceServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice = invoiceServiceAsync.fetch("invoice_id")

        invoice.validate()
    }

    @Test
    suspend fun fetchUpcoming() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val response =
            invoiceServiceAsync.fetchUpcoming(
                InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
            )

        response.validate()
    }

    @Test
    suspend fun issue() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.issue(
                InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
            )

        invoice.validate()
    }

    @Test
    suspend fun markPaid() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.markPaid(
                InvoiceMarkPaidParams.builder()
                    .invoiceId("invoice_id")
                    .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                    .externalId("external_payment_id_123")
                    .notes("notes")
                    .build()
            )

        invoice.validate()
    }

    @Test
    suspend fun pay() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice = invoiceServiceAsync.pay("invoice_id")

        invoice.validate()
    }

    @Test
    suspend fun void() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice = invoiceServiceAsync.void("invoice_id")

        invoice.validate()
    }
}
