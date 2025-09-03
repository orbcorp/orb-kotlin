// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.PercentageDiscount
import com.withorb.api.models.TransformPriceFilter
import com.withorb.api.models.UnitConfig
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.create(
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
                                    .scalingFactor(0.0)
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
                                TransformPriceFilter.builder()
                                    .field(TransformPriceFilter.Field.PRICE_ID)
                                    .operator(TransformPriceFilter.Operator.INCLUDES)
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
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.update(
                InvoiceUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .dueDate(LocalDate.parse("2023-09-22"))
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
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val page = invoiceService.list()

        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.fetch("invoice_id")

        invoice.validate()
    }

    @Test
    fun fetchUpcoming() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val response =
            invoiceService.fetchUpcoming(
                InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
            )

        response.validate()
    }

    @Test
    fun issue() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.issue(
                InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
            )

        invoice.validate()
    }

    @Test
    fun markPaid() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.markPaid(
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
    fun pay() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.pay("invoice_id")

        invoice.validate()
    }

    @Test
    fun void() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.void("invoice_id")

        invoice.validate()
    }
}
