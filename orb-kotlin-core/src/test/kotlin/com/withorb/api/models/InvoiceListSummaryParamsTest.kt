// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListSummaryParamsTest {

    @Test
    fun create() {
        InvoiceListSummaryParams.builder()
            .amount("amount")
            .amountGt("amount[gt]")
            .amountLt("amount[lt]")
            .cursor("cursor")
            .customerId("customer_id")
            .dateType(InvoiceListSummaryParams.DateType.DUE_DATE)
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
            .addStatus(InvoiceListSummaryParams.Status.DRAFT)
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListSummaryParams.builder()
                .amount("amount")
                .amountGt("amount[gt]")
                .amountLt("amount[lt]")
                .cursor("cursor")
                .customerId("customer_id")
                .dateType(InvoiceListSummaryParams.DateType.DUE_DATE)
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
                .addStatus(InvoiceListSummaryParams.Status.DRAFT)
                .subscriptionId("subscription_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("amount", "amount")
                    .put("amount[gt]", "amount[gt]")
                    .put("amount[lt]", "amount[lt]")
                    .put("cursor", "cursor")
                    .put("customer_id", "customer_id")
                    .put("date_type", "due_date")
                    .put("due_date", "2019-12-27")
                    .put("due_date_window", "due_date_window")
                    .put("due_date[gt]", "2019-12-27")
                    .put("due_date[lt]", "2019-12-27")
                    .put("external_customer_id", "external_customer_id")
                    .put("invoice_date[gt]", "2019-12-27T18:11:19.117Z")
                    .put("invoice_date[gte]", "2019-12-27T18:11:19.117Z")
                    .put("invoice_date[lt]", "2019-12-27T18:11:19.117Z")
                    .put("invoice_date[lte]", "2019-12-27T18:11:19.117Z")
                    .put("is_recurring", "true")
                    .put("limit", "1")
                    .put("status[]", "draft")
                    .put("subscription_id", "subscription_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceListSummaryParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
