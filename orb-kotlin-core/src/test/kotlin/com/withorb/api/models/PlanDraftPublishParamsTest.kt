// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanDraftPublishParamsTest {

    @Test
    fun create() {
        PlanDraftPublishParams.builder().planId("plan_id").setAsDefault(true).build()
    }

    @Test
    fun pathParams() {
        val params = PlanDraftPublishParams.builder().planId("plan_id").build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = PlanDraftPublishParams.builder().planId("plan_id").setAsDefault(true).build()

        val body = params._body()

        assertThat(body.setAsDefault()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlanDraftPublishParams.builder().planId("plan_id").build()

        val body = params._body()
    }
}
