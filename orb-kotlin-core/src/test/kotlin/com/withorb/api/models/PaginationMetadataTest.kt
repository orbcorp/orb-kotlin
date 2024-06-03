// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaginationMetadataTest {

    @Test
    fun createPaginationMetadata() {
        val paginationMetadata =
            PaginationMetadata.builder().hasMore(true).nextCursor("string").build()
        assertThat(paginationMetadata).isNotNull
        assertThat(paginationMetadata.hasMore()).isEqualTo(true)
        assertThat(paginationMetadata.nextCursor()).isEqualTo("string")
    }
}
