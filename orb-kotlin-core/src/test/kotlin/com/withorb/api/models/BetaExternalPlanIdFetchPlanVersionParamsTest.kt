// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BetaExternalPlanIdFetchPlanVersionParamsTest {

    @Test
    fun create() {
        BetaExternalPlanIdFetchPlanVersionParams.builder()
            .externalPlanId("external_plan_id")
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BetaExternalPlanIdFetchPlanVersionParams.builder()
                .externalPlanId("external_plan_id")
                .version("version")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_plan_id")
        assertThat(params._pathParam(1)).isEqualTo("version")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
