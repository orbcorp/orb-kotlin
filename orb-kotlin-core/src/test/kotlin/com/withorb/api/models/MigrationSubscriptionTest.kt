// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSubscriptionTest {

    @Test
    fun create() {
        val migrationSubscription =
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

        assertThat(migrationSubscription.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(migrationSubscription.effectiveDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationSubscription.failureReason()).isEqualTo("failure_reason")
        assertThat(migrationSubscription.status())
            .isEqualTo(MigrationSubscription.Status.SCHEDULING)
        assertThat(migrationSubscription.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationSubscription =
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

        val roundtrippedMigrationSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSubscription),
                jacksonTypeRef<MigrationSubscription>(),
            )

        assertThat(roundtrippedMigrationSubscription).isEqualTo(migrationSubscription)
    }
}
