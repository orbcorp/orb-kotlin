// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanListParamsTest {

    @Test
    fun createPlanListParams() {
        PlanListParams.builder()
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .limit(1L)
            .status(PlanListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PlanListParams.builder()
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .limit(1L)
                .status(PlanListParams.Status.ACTIVE)
                .build()
        val expected = QueryParams.builder()
        expected.put("created_at[gt]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[gte]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[lt]", "2019-12-27T18:11:19.117Z")
        expected.put("created_at[lte]", "2019-12-27T18:11:19.117Z")
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("status", PlanListParams.Status.ACTIVE.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PlanListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
