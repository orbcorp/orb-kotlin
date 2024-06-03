// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceListParamsTest {

    @Test
    fun createInvoiceListParams() {
        InvoiceListParams.builder()
            .amount("string")
            .amountGt("string")
            .amountLt("string")
            .cursor("string")
            .customerId("string")
            .dateType(InvoiceListParams.DateType.DUE_DATE)
            .dueDate(LocalDate.parse("2019-12-27"))
            .dueDateWindow("string")
            .dueDateGt(LocalDate.parse("2019-12-27"))
            .dueDateLt(LocalDate.parse("2019-12-27"))
            .externalCustomerId("string")
            .invoiceDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .isRecurring(true)
            .limit(123L)
            .status(listOf(InvoiceListParams.Status.DRAFT))
            .subscriptionId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InvoiceListParams.builder()
                .amount("string")
                .amountGt("string")
                .amountLt("string")
                .cursor("string")
                .customerId("string")
                .dateType(InvoiceListParams.DateType.DUE_DATE)
                .dueDate(LocalDate.parse("2019-12-27"))
                .dueDateWindow("string")
                .dueDateGt(LocalDate.parse("2019-12-27"))
                .dueDateLt(LocalDate.parse("2019-12-27"))
                .externalCustomerId("string")
                .invoiceDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .limit(123L)
                .status(listOf(InvoiceListParams.Status.DRAFT))
                .subscriptionId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("amount", listOf("string"))
        expected.put("amount[gt]", listOf("string"))
        expected.put("amount[lt]", listOf("string"))
        expected.put("cursor", listOf("string"))
        expected.put("customer_id", listOf("string"))
        expected.put("date_type", listOf(InvoiceListParams.DateType.DUE_DATE.toString()))
        expected.put("due_date", listOf("2019-12-27"))
        expected.put("due_date_window", listOf("string"))
        expected.put("due_date[gt]", listOf("2019-12-27"))
        expected.put("due_date[lt]", listOf("2019-12-27"))
        expected.put("external_customer_id", listOf("string"))
        expected.put("invoice_date[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("invoice_date[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("invoice_date[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("invoice_date[lte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("is_recurring", listOf("true"))
        expected.put("limit", listOf("123"))
        expected.put("status[]", listOf(InvoiceListParams.Status.DRAFT.toString()))
        expected.put("subscription_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
