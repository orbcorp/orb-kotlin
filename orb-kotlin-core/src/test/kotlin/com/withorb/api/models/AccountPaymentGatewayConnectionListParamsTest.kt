// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPaymentGatewayConnectionListParamsTest {

    @Test
    fun create() {
        AccountPaymentGatewayConnectionListParams.builder()
            .billingEntityId("billing_entity_id")
            .cursor("cursor")
            .limit(1L)
            .providerType(AccountPaymentGatewayConnectionListParams.ProviderType.STRIPE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountPaymentGatewayConnectionListParams.builder()
                .billingEntityId("billing_entity_id")
                .cursor("cursor")
                .limit(1L)
                .providerType(AccountPaymentGatewayConnectionListParams.ProviderType.STRIPE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("billing_entity_id", "billing_entity_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("provider_type", "stripe")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountPaymentGatewayConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
