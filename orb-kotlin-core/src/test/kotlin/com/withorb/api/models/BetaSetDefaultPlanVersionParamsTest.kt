// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BetaSetDefaultPlanVersionParamsTest {

    @Test
    fun create() {
        BetaSetDefaultPlanVersionParams.builder().planId("plan_id").version(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BetaSetDefaultPlanVersionParams.builder().planId("plan_id").version(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = BetaSetDefaultPlanVersionParams.builder().planId("plan_id").version(0L).build()

        val body = params._body()

        assertThat(body.version()).isEqualTo(0L)
    }
}
