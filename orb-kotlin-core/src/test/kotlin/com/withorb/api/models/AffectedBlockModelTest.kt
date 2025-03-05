// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AffectedBlockModelTest {

    @Test
    fun createAffectedBlockModel() {
        val affectedBlockModel =
            AffectedBlockModel.builder()
                .id("id")
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .perUnitCostBasis("per_unit_cost_basis")
                .build()
        assertThat(affectedBlockModel).isNotNull
        assertThat(affectedBlockModel.id()).isEqualTo("id")
        assertThat(affectedBlockModel.expiryDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(affectedBlockModel.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
    }
}
