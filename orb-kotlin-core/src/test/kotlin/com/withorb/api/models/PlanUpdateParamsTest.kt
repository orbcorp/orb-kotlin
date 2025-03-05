// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanUpdateParamsTest {

    @Test
    fun create() {
        PlanUpdateParams.builder()
            .planId("plan_id")
            .editPlanModel(
                EditPlanModel.builder()
                    .externalPlanId("external_plan_id")
                    .metadata(
                        EditPlanModel.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanUpdateParams.builder()
                .planId("plan_id")
                .editPlanModel(
                    EditPlanModel.builder()
                        .externalPlanId("external_plan_id")
                        .metadata(
                            EditPlanModel.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EditPlanModel.builder()
                    .externalPlanId("external_plan_id")
                    .metadata(
                        EditPlanModel.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanUpdateParams.builder()
                .planId("plan_id")
                .editPlanModel(EditPlanModel.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(EditPlanModel.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            PlanUpdateParams.builder()
                .planId("plan_id")
                .editPlanModel(EditPlanModel.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "planId"
        assertThat(params.getPathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
