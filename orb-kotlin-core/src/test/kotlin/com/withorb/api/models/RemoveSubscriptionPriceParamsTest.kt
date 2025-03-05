// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemoveSubscriptionPriceParamsTest {

    @Test
    fun createRemoveSubscriptionPriceParams() {
        val removeSubscriptionPriceParams =
            RemoveSubscriptionPriceParams.builder()
                .externalPriceId("external_price_id")
                .priceId("h74gfhdjvn7ujokd")
                .build()
        assertThat(removeSubscriptionPriceParams).isNotNull
        assertThat(removeSubscriptionPriceParams.externalPriceId()).isEqualTo("external_price_id")
        assertThat(removeSubscriptionPriceParams.priceId()).isEqualTo("h74gfhdjvn7ujokd")
    }
}
