// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCancelParamsTest {

    @Test
    fun create() {
        MigrationCancelParams.builder().migrationId("migration_id").build()
    }

    @Test
    fun pathParams() {
        val params = MigrationCancelParams.builder().migrationId("migration_id").build()

        assertThat(params._pathParam(0)).isEqualTo("migration_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
