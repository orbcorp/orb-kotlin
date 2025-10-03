// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatrixSubLineItemTest {

    @Test
    fun create() {
        val matrixSubLineItem =
            MatrixSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .matrixConfig(SubLineItemMatrixConfig.builder().addDimensionValue("string").build())
                .name("Tier One")
                .quantity(5.0)
                .type(MatrixSubLineItem.Type.MATRIX)
                .scaledQuantity(0.0)
                .build()

        assertThat(matrixSubLineItem.amount()).isEqualTo("9.00")
        assertThat(matrixSubLineItem.grouping())
            .isEqualTo(SubLineItemGrouping.builder().key("region").value("west").build())
        assertThat(matrixSubLineItem.matrixConfig())
            .isEqualTo(SubLineItemMatrixConfig.builder().addDimensionValue("string").build())
        assertThat(matrixSubLineItem.name()).isEqualTo("Tier One")
        assertThat(matrixSubLineItem.quantity()).isEqualTo(5.0)
        assertThat(matrixSubLineItem.type()).isEqualTo(MatrixSubLineItem.Type.MATRIX)
        assertThat(matrixSubLineItem.scaledQuantity()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matrixSubLineItem =
            MatrixSubLineItem.builder()
                .amount("9.00")
                .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                .matrixConfig(SubLineItemMatrixConfig.builder().addDimensionValue("string").build())
                .name("Tier One")
                .quantity(5.0)
                .type(MatrixSubLineItem.Type.MATRIX)
                .scaledQuantity(0.0)
                .build()

        val roundtrippedMatrixSubLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matrixSubLineItem),
                jacksonTypeRef<MatrixSubLineItem>(),
            )

        assertThat(roundtrippedMatrixSubLineItem).isEqualTo(matrixSubLineItem)
    }
}
