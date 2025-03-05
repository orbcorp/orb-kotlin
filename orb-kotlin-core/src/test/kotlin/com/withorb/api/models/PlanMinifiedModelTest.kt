// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanMinifiedModelTest {

    @Test
    fun createPlanMinifiedModel() {
        val planMinifiedModel =
            PlanMinifiedModel.builder()
                .id("m2t5akQeh2obwxeU")
                .externalPlanId("m2t5akQeh2obwxeU")
                .name("Example plan")
                .build()
        assertThat(planMinifiedModel).isNotNull
        assertThat(planMinifiedModel.id()).isEqualTo("m2t5akQeh2obwxeU")
        assertThat(planMinifiedModel.externalPlanId()).isEqualTo("m2t5akQeh2obwxeU")
        assertThat(planMinifiedModel.name()).isEqualTo("Example plan")
    }
}
