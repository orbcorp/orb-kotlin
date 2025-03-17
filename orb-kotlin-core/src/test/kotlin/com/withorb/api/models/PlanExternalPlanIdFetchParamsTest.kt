// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanExternalPlanIdFetchParamsTest {

    @Test
    fun create() {
        PlanExternalPlanIdFetchParams.builder().externalPlanId("external_plan_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            PlanExternalPlanIdFetchParams.builder().externalPlanId("external_plan_id").build()
        assertThat(params).isNotNull
        // path param "externalPlanId"
        assertThat(params.getPathParam(0)).isEqualTo("external_plan_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
