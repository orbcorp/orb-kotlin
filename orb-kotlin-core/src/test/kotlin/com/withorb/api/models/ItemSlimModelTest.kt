// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemSlimModelTest {

    @Test
    fun createItemSlimModel() {
        val itemSlimModel = ItemSlimModel.builder().id("id").name("name").build()
        assertThat(itemSlimModel).isNotNull
        assertThat(itemSlimModel.id()).isEqualTo("id")
        assertThat(itemSlimModel.name()).isEqualTo("name")
    }
}
