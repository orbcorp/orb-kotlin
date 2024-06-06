// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceCreateParamsTest {

    @Test
    fun createInvoiceCreateParams() {
        InvoiceCreateParams.builder()
            .currency("USD")
            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .lineItems(
                listOf(
                    InvoiceCreateParams.LineItem.builder()
                        .endDate(LocalDate.parse("2023-09-22"))
                        .itemId("4khy3nwzktxv7")
                        .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                        .name("Line Item Name")
                        .quantity(42.23)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(
                            InvoiceCreateParams.LineItem.UnitConfig.builder()
                                .unitAmount("string")
                                .build()
                        )
                        .build()
                )
            )
            .netTerms(123L)
            .customerId("4khy3nwzktxv7")
            .discount(
                Discount.ofPercentageDiscount(
                    Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("string")
                        .build()
                )
            )
            .externalCustomerId("external-customer-id")
            .memo("An optional memo for my invoice.")
            .metadata(InvoiceCreateParams.Metadata.builder().build())
            .willAutoIssue(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceCreateParams.builder()
                .currency("USD")
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lineItems(
                    listOf(
                        InvoiceCreateParams.LineItem.builder()
                            .endDate(LocalDate.parse("2023-09-22"))
                            .itemId("4khy3nwzktxv7")
                            .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                            .name("Line Item Name")
                            .quantity(42.23)
                            .startDate(LocalDate.parse("2023-09-22"))
                            .unitConfig(
                                InvoiceCreateParams.LineItem.UnitConfig.builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .build()
                    )
                )
                .netTerms(123L)
                .customerId("4khy3nwzktxv7")
                .discount(
                    Discount.ofPercentageDiscount(
                        Discount.PercentageDiscount.builder()
                            .appliesToPriceIds(listOf("string"))
                            .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                            .percentageDiscount(1.0)
                            .reason("string")
                            .build()
                    )
                )
                .externalCustomerId("external-customer-id")
                .memo("An optional memo for my invoice.")
                .metadata(InvoiceCreateParams.Metadata.builder().build())
                .willAutoIssue(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    InvoiceCreateParams.LineItem.builder()
                        .endDate(LocalDate.parse("2023-09-22"))
                        .itemId("4khy3nwzktxv7")
                        .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                        .name("Line Item Name")
                        .quantity(42.23)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(
                            InvoiceCreateParams.LineItem.UnitConfig.builder()
                                .unitAmount("string")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.netTerms()).isEqualTo(123L)
        assertThat(body.customerId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.discount())
            .isEqualTo(
                Discount.ofPercentageDiscount(
                    Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("string")
                        .build()
                )
            )
        assertThat(body.externalCustomerId()).isEqualTo("external-customer-id")
        assertThat(body.memo()).isEqualTo("An optional memo for my invoice.")
        assertThat(body.metadata()).isEqualTo(InvoiceCreateParams.Metadata.builder().build())
        assertThat(body.willAutoIssue()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .currency("USD")
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lineItems(
                    listOf(
                        InvoiceCreateParams.LineItem.builder()
                            .endDate(LocalDate.parse("2023-09-22"))
                            .itemId("4khy3nwzktxv7")
                            .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                            .name("Line Item Name")
                            .quantity(42.23)
                            .startDate(LocalDate.parse("2023-09-22"))
                            .unitConfig(
                                InvoiceCreateParams.LineItem.UnitConfig.builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .build()
                    )
                )
                .netTerms(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    InvoiceCreateParams.LineItem.builder()
                        .endDate(LocalDate.parse("2023-09-22"))
                        .itemId("4khy3nwzktxv7")
                        .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                        .name("Line Item Name")
                        .quantity(42.23)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(
                            InvoiceCreateParams.LineItem.UnitConfig.builder()
                                .unitAmount("string")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.netTerms()).isEqualTo(123L)
    }
}
