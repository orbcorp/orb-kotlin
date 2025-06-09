// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemSlimTest {

    @Test
    fun create() {
        val itemSlim = ItemSlim.builder().id("id").name("name").build()

        assertThat(itemSlim.id()).isEqualTo("id")
        assertThat(itemSlim.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemSlim = ItemSlim.builder().id("id").name("name").build()

        val roundtrippedItemSlim =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemSlim),
                jacksonTypeRef<ItemSlim>(),
            )

        assertThat(roundtrippedItemSlim).isEqualTo(itemSlim)
    }
}
