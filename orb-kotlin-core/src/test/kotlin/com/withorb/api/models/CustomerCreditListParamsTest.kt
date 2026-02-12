// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListParamsTest {

    @Test
    fun create() {
        CustomerCreditListParams.builder()
            .customerId("customer_id")
            .currency("currency")
            .cursor("cursor")
            .effectiveDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeAllBlocks(true)
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerCreditListParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditListParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .cursor("cursor")
                .effectiveDateGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDateGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDateLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDateLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeAllBlocks(true)
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("effective_date[gt]", "2019-12-27T18:11:19.117Z")
                    .put("effective_date[gte]", "2019-12-27T18:11:19.117Z")
                    .put("effective_date[lt]", "2019-12-27T18:11:19.117Z")
                    .put("effective_date[lte]", "2019-12-27T18:11:19.117Z")
                    .put("include_all_blocks", "true")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerCreditListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
