// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanExternalPlanIdUpdateParamsTest {

    @Test
    fun createPlanExternalPlanIdUpdateParams() {
        PlanExternalPlanIdUpdateParams.builder()
            .otherExternalPlanId("external_plan_id")
            .externalPlanId("external_plan_id")
            .metadata(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PlanExternalPlanIdUpdateParams.builder()
                .otherExternalPlanId("external_plan_id")
                .externalPlanId("external_plan_id")
                .metadata(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(body.metadata())
            .isEqualTo(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PlanExternalPlanIdUpdateParams.builder().otherExternalPlanId("external_plan_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            PlanExternalPlanIdUpdateParams.builder().otherExternalPlanId("external_plan_id").build()
        assertThat(params).isNotNull
        // path param "otherExternalPlanId"
        assertThat(params.getPathParam(0)).isEqualTo("external_plan_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
