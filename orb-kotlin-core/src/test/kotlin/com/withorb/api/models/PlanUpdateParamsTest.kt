// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanUpdateParamsTest {

    @Test
    fun createPlanUpdateParams() {
        PlanUpdateParams.builder()
            .planId("plan_id")
            .externalPlanId("external_plan_id")
            .metadata(PlanUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PlanUpdateParams.builder()
                .planId("plan_id")
                .externalPlanId("external_plan_id")
                .metadata(PlanUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(body.metadata()).isEqualTo(PlanUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = PlanUpdateParams.builder().planId("plan_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = PlanUpdateParams.builder().planId("plan_id").build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
