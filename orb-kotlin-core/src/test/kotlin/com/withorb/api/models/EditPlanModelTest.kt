// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EditPlanModelTest {

    @Test
    fun createEditPlanModel() {
        val editPlanModel =
            EditPlanModel.builder()
                .externalPlanId("external_plan_id")
                .metadata(
                    EditPlanModel.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        assertThat(editPlanModel).isNotNull
        assertThat(editPlanModel.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(editPlanModel.metadata())
            .isEqualTo(
                EditPlanModel.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
