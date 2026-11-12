// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSubscriptionListPageResponseTest {

    @Test
    fun create() {
        val migrationSubscriptionListPageResponse =
            MigrationSubscriptionListPageResponse.builder()
                .addData(
                    MigrationSubscription.builder()
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failure_reason")
                        .status(MigrationSubscription.Status.SCHEDULING)
                        .subscriptionId("subscription_id")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(migrationSubscriptionListPageResponse.data())
            .containsExactly(
                MigrationSubscription.builder()
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .failureReason("failure_reason")
                    .status(MigrationSubscription.Status.SCHEDULING)
                    .subscriptionId("subscription_id")
                    .build()
            )
        assertThat(migrationSubscriptionListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationSubscriptionListPageResponse =
            MigrationSubscriptionListPageResponse.builder()
                .addData(
                    MigrationSubscription.builder()
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failure_reason")
                        .status(MigrationSubscription.Status.SCHEDULING)
                        .subscriptionId("subscription_id")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedMigrationSubscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSubscriptionListPageResponse),
                jacksonTypeRef<MigrationSubscriptionListPageResponse>(),
            )

        assertThat(roundtrippedMigrationSubscriptionListPageResponse)
            .isEqualTo(migrationSubscriptionListPageResponse)
    }
}
