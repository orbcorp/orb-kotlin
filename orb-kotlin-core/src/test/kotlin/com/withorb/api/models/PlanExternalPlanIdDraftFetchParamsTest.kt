// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanExternalPlanIdDraftFetchParamsTest {

    @Test
    fun create() {
        PlanExternalPlanIdDraftFetchParams.builder().externalPlanId("external_plan_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanExternalPlanIdDraftFetchParams.builder().externalPlanId("external_plan_id").build()

        assertThat(params._pathParam(0)).isEqualTo("external_plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
