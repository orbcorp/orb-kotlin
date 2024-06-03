// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanUpdateParamsTest {

    @Test
    fun createPlanUpdateParams() {
        PlanUpdateParams.builder()
            .planId("string")
            .externalPlanId("string")
            .metadata(PlanUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PlanUpdateParams.builder()
                .planId("string")
                .externalPlanId("string")
                .metadata(PlanUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.externalPlanId()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(PlanUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = PlanUpdateParams.builder().planId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = PlanUpdateParams.builder().planId("string").build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
