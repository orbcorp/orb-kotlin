// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemExternalConnectionModelTest {

    @Test
    fun createItemExternalConnectionModel() {
        val itemExternalConnectionModel =
            ItemExternalConnectionModel.builder()
                .externalConnectionName(ItemExternalConnectionModel.ExternalConnectionName.STRIPE)
                .externalEntityId("external_entity_id")
                .build()
        assertThat(itemExternalConnectionModel).isNotNull
        assertThat(itemExternalConnectionModel.externalConnectionName())
            .isEqualTo(ItemExternalConnectionModel.ExternalConnectionName.STRIPE)
        assertThat(itemExternalConnectionModel.externalEntityId()).isEqualTo("external_entity_id")
    }
}
