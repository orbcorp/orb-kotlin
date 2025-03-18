// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerListByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .currency("currency")
            .cursor("cursor")
            .entryStatus(CustomerCreditLedgerListByExternalIdParams.EntryStatus.COMMITTED)
            .entryType(CustomerCreditLedgerListByExternalIdParams.EntryType.INCREMENT)
            .limit(1L)
            .minimumAmount("minimum_amount")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .cursor("cursor")
                .entryStatus(CustomerCreditLedgerListByExternalIdParams.EntryStatus.COMMITTED)
                .entryType(CustomerCreditLedgerListByExternalIdParams.EntryType.INCREMENT)
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
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
