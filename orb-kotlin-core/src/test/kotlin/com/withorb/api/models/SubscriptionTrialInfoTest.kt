// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTrialInfoTest {

    @Test
    fun create() {
        val subscriptionTrialInfo =
            SubscriptionTrialInfo.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionTrialInfo.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionTrialInfo =
            SubscriptionTrialInfo.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionTrialInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionTrialInfo),
                jacksonTypeRef<SubscriptionTrialInfo>(),
            )

        assertThat(roundtrippedSubscriptionTrialInfo).isEqualTo(subscriptionTrialInfo)
    }
}
