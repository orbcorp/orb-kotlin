// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanFetchParamsTest {

    @Test
    fun createPlanFetchParams() {
        PlanFetchParams.builder().planId("plan_id").build()
    }

    @Test
    fun getPathParam() {
        val params = PlanFetchParams.builder().planId("plan_id").build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
