// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceListParamsTest {

    @Test
    fun createInvoiceListParams() {
        InvoiceListParams.builder()
            .amount("amount")
            .amountGt("amount[gt]")
            .amountLt("amount[lt]")
            .cursor("cursor")
            .customerId("customer_id")
            .dateType(InvoiceListParams.DateType.DUE_DATE)
            .dueDate(LocalDate.parse("2019-12-27"))
            .dueDateWindow("due_date_window")
            .dueDateGt(LocalDate.parse("2019-12-27"))
            .dueDateLt(LocalDate.parse("2019-12-27"))
            .externalCustomerId("external_customer_id")
            .invoiceDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .invoiceDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .isRecurring(true)
            .limit(1L)
            .status(listOf(InvoiceListParams.Status.DRAFT))
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InvoiceListParams.builder()
                .amount("amount")
                .amountGt("amount[gt]")
                .amountLt("amount[lt]")
                .cursor("cursor")
                .customerId("customer_id")
                .dateType(InvoiceListParams.DateType.DUE_DATE)
                .dueDate(LocalDate.parse("2019-12-27"))
                .dueDateWindow("due_date_window")
                .dueDateGt(LocalDate.parse("2019-12-27"))
                .dueDateLt(LocalDate.parse("2019-12-27"))
                .externalCustomerId("external_customer_id")
                .invoiceDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .invoiceDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .limit(1L)
                .status(listOf(InvoiceListParams.Status.DRAFT))
                .subscriptionId("subscription_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("amount", "amount")
        expected.put("amount[gt]", "amount[gt]")
        expected.put("amount[lt]", "amount[lt]")
        expected.put("cursor", "cursor")
        expected.put("customer_id", "customer_id")
        expected.put("date_type", InvoiceListParams.DateType.DUE_DATE.toString())
        expected.put("due_date", "2019-12-27")
        expected.put("due_date_window", "due_date_window")
        expected.put("due_date[gt]", "2019-12-27")
        expected.put("due_date[lt]", "2019-12-27")
        expected.put("external_customer_id", "external_customer_id")
        expected.put("invoice_date[gt]", "2019-12-27T18:11:19.117Z")
        expected.put("invoice_date[gte]", "2019-12-27T18:11:19.117Z")
        expected.put("invoice_date[lt]", "2019-12-27T18:11:19.117Z")
        expected.put("invoice_date[lte]", "2019-12-27T18:11:19.117Z")
        expected.put("is_recurring", "true")
        expected.put("limit", "1")
        expected.put("status[]", InvoiceListParams.Status.DRAFT.toString())
        expected.put("subscription_id", "subscription_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
