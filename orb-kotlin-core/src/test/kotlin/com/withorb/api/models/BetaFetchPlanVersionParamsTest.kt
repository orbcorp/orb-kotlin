// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BetaFetchPlanVersionParamsTest {

    @Test
    fun create() {
        BetaFetchPlanVersionParams.builder().planId("plan_id").version("version").build()
    }

    @Test
    fun pathParams() {
        val params =
            BetaFetchPlanVersionParams.builder().planId("plan_id").version("version").build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        assertThat(params._pathParam(1)).isEqualTo("version")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
