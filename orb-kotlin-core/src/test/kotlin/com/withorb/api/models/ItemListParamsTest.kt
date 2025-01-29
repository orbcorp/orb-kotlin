// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemListParamsTest {

    @Test
    fun createItemListParams() {
        ItemListParams.builder().cursor("cursor").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params = ItemListParams.builder().cursor("cursor").limit(1L).build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ItemListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
