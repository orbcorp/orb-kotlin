// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaginationMetadataModelTest {

    @Test
    fun createPaginationMetadataModel() {
        val paginationMetadataModel =
            PaginationMetadataModel.builder().hasMore(true).nextCursor("next_cursor").build()
        assertThat(paginationMetadataModel).isNotNull
        assertThat(paginationMetadataModel.hasMore()).isEqualTo(true)
        assertThat(paginationMetadataModel.nextCursor()).isEqualTo("next_cursor")
    }
}
