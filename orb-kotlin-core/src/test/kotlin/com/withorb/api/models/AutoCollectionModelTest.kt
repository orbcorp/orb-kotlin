// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AutoCollectionModelTest {

    @Test
    fun createAutoCollectionModel() {
        val autoCollectionModel =
            AutoCollectionModel.builder()
                .enabled(true)
                .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .numAttempts(0L)
                .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(autoCollectionModel).isNotNull
        assertThat(autoCollectionModel.enabled()).isEqualTo(true)
        assertThat(autoCollectionModel.nextAttemptAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(autoCollectionModel.numAttempts()).isEqualTo(0L)
        assertThat(autoCollectionModel.previouslyAttemptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
