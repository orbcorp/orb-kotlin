// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBillingEntityUnarchiveByExternalIdParamsTest {

    @Test
    fun create() {
        AccountBillingEntityUnarchiveByExternalIdParams.builder()
            .externalBillingEntityId("external_billing_entity_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountBillingEntityUnarchiveByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_billing_entity_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
