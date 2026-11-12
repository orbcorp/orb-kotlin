// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationListParamsTest {

    @Test
    fun create() {
        MigrationListParams.builder()
            .cursor("cursor")
            .externalPlanId("external_plan_id")
            .limit(1L)
            .planId("plan_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MigrationListParams.builder()
                .cursor("cursor")
                .externalPlanId("external_plan_id")
                .limit(1L)
                .planId("plan_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("external_plan_id", "external_plan_id")
                    .put("limit", "1")
                    .put("plan_id", "plan_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MigrationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
