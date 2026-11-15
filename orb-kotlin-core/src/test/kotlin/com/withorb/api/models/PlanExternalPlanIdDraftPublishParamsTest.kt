// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanExternalPlanIdDraftPublishParamsTest {

    @Test
    fun create() {
        PlanExternalPlanIdDraftPublishParams.builder()
            .externalPlanId("external_plan_id")
            .setAsDefault(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanExternalPlanIdDraftPublishParams.builder()
                .externalPlanId("external_plan_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanExternalPlanIdDraftPublishParams.builder()
                .externalPlanId("external_plan_id")
                .setAsDefault(true)
                .build()

        val body = params._body()

        assertThat(body.setAsDefault()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanExternalPlanIdDraftPublishParams.builder()
                .externalPlanId("external_plan_id")
                .build()

        val body = params._body()
    }
}
