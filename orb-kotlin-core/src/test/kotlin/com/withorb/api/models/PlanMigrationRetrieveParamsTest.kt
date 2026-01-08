// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanMigrationRetrieveParamsTest {

    @Test
    fun create() {
        PlanMigrationRetrieveParams.builder().planId("plan_id").migrationId("migration_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanMigrationRetrieveParams.builder()
                .planId("plan_id")
                .migrationId("migration_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        assertThat(params._pathParam(1)).isEqualTo("migration_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
