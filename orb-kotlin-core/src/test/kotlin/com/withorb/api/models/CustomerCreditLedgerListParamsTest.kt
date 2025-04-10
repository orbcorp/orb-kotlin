// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerListParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerListParams.builder()
            .customerId("customer_id")
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .currency("currency")
            .cursor("cursor")
            .entryStatus(CustomerCreditLedgerListParams.EntryStatus.COMMITTED)
            .entryType(CustomerCreditLedgerListParams.EntryType.INCREMENT)
            .limit(1L)
            .minimumAmount("minimum_amount")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerCreditLedgerListParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditLedgerListParams.builder()
                .customerId("customer_id")
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .cursor("cursor")
                .entryStatus(CustomerCreditLedgerListParams.EntryStatus.COMMITTED)
                .entryType(CustomerCreditLedgerListParams.EntryType.INCREMENT)
                .limit(1L)
                .minimumAmount("minimum_amount")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at[gt]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[gte]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[lt]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[lte]", "2019-12-27T18:11:19.117Z")
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("entry_status", "committed")
                    .put("entry_type", "increment")
                    .put("limit", "1")
                    .put("minimum_amount", "minimum_amount")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerCreditLedgerListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
