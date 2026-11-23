// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPaymentGatewayConnectionListPageResponseTest {

    @Test
    fun create() {
        val accountPaymentGatewayConnectionListPageResponse =
            AccountPaymentGatewayConnectionListPageResponse.builder()
                .addData(
                    PaymentGatewayConnection.builder()
                        .id("id")
                        .billingEntityId("billing_entity_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalAccountId("external_account_id")
                        .isDefault(true)
                        .providerType(PaymentGatewayConnection.ProviderType.STRIPE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(accountPaymentGatewayConnectionListPageResponse.data())
            .containsExactly(
                PaymentGatewayConnection.builder()
                    .id("id")
                    .billingEntityId("billing_entity_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalAccountId("external_account_id")
                    .isDefault(true)
                    .providerType(PaymentGatewayConnection.ProviderType.STRIPE)
                    .build()
            )
        assertThat(accountPaymentGatewayConnectionListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountPaymentGatewayConnectionListPageResponse =
            AccountPaymentGatewayConnectionListPageResponse.builder()
                .addData(
                    PaymentGatewayConnection.builder()
                        .id("id")
                        .billingEntityId("billing_entity_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalAccountId("external_account_id")
                        .isDefault(true)
                        .providerType(PaymentGatewayConnection.ProviderType.STRIPE)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedAccountPaymentGatewayConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountPaymentGatewayConnectionListPageResponse),
                jacksonTypeRef<AccountPaymentGatewayConnectionListPageResponse>(),
            )

        assertThat(roundtrippedAccountPaymentGatewayConnectionListPageResponse)
            .isEqualTo(accountPaymentGatewayConnectionListPageResponse)
    }
}
