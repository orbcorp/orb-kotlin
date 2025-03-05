// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceCreateParamsTest {

    @Test
    fun create() {
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
                    .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                    .build()
            )
            .netTerms(0L)
            .customerId("4khy3nwzktxv7")
            .discount(
                PercentageDiscount.builder()
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(0.15)
                    .reason("reason")
                    .build()
            )
            .externalCustomerId("external-customer-id")
            .memo("An optional memo for my invoice.")
            .metadata(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .willAutoIssue(false)
            .build()
    }

    @Test
    fun body() {
        val params =
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
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .netTerms(0L)
                .customerId("4khy3nwzktxv7")
                .discount(
                    PercentageDiscount.builder()
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .reason("reason")
                        .build()
                )
                .externalCustomerId("external-customer-id")
                .memo("An optional memo for my invoice.")
                .metadata(
                    InvoiceCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .willAutoIssue(false)
                .build()

        val body = params._body()

        assertNotNull(body)
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
                        .quantity(1.0)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
            )
        assertThat(body.netTerms()).isEqualTo(0L)
        assertThat(body.customerId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.discount())
            .isEqualTo(
                Discount.ofPercentage(
                    PercentageDiscount.builder()
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(body.externalCustomerId()).isEqualTo("external-customer-id")
        assertThat(body.memo()).isEqualTo("An optional memo for my invoice.")
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.willAutoIssue()).isEqualTo(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .netTerms(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
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
                        .quantity(1.0)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
            )
        assertThat(body.netTerms()).isEqualTo(0L)
    }
}
