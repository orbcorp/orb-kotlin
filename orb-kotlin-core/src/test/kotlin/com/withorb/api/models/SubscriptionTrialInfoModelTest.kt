// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionTrialInfoModelTest {

    @Test
    fun createSubscriptionTrialInfoModel() {
        val subscriptionTrialInfoModel =
            SubscriptionTrialInfoModel.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(subscriptionTrialInfoModel).isNotNull
        assertThat(subscriptionTrialInfoModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
