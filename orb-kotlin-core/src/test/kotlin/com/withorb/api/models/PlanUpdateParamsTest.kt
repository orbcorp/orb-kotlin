// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanUpdateParamsTest {

    @Test
    fun create() {
        PlanUpdateParams.builder()
            .planId("plan_id")
            .externalPlanId("external_plan_id")
            .metadata(
                PlanUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlanUpdateParams.builder().planId("plan_id").build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanUpdateParams.builder()
                .planId("plan_id")
                .externalPlanId("external_plan_id")
                .metadata(
                    PlanUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(body.metadata())
            .isEqualTo(
                PlanUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlanUpdateParams.builder().planId("plan_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
