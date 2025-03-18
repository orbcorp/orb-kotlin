// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillRevertParamsTest {

    @Test
    fun create() {
        EventBackfillRevertParams.builder().backfillId("backfill_id").build()
    }

    @Test
    fun pathParams() {
        val params = EventBackfillRevertParams.builder().backfillId("backfill_id").build()

        assertThat(params._pathParam(0)).isEqualTo("backfill_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
