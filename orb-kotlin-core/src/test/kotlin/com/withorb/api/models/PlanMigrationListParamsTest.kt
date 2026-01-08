// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationListParamsTest {

    @Test
    fun create() {
        PlanMigrationListParams.builder().planId("plan_id").cursor("cursor").limit(1L).build()
    }

    @Test
    fun pathParams() {
        val params = PlanMigrationListParams.builder().planId("plan_id").build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PlanMigrationListParams.builder().planId("plan_id").cursor("cursor").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlanMigrationListParams.builder().planId("plan_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
