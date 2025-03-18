// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUsageTest {

    @Test
    fun ofUngrouped() {
        val ungrouped =
            SubscriptionUsage.UngroupedSubscriptionUsage.builder()
                .addData(
                    SubscriptionUsage.UngroupedSubscriptionUsage.Data.builder()
                        .billableMetric(
                            SubscriptionUsage.UngroupedSubscriptionUsage.Data.BillableMetric
                                .builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .addUsage(
                            SubscriptionUsage.UngroupedSubscriptionUsage.Data.Usage.builder()
                                .quantity(0.0)
                                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .viewMode(
                            SubscriptionUsage.UngroupedSubscriptionUsage.Data.ViewMode.PERIODIC
                        )
                        .build()
                )
                .build()

        val subscriptionUsage = SubscriptionUsage.ofUngrouped(ungrouped)

        assertThat(subscriptionUsage.ungrouped()).isEqualTo(ungrouped)
        assertThat(subscriptionUsage.grouped()).isNull()
    }

    @Test
    fun ofGrouped() {
        val grouped =
            SubscriptionUsage.GroupedSubscriptionUsage.builder()
                .addData(
                    SubscriptionUsage.GroupedSubscriptionUsage.Data.builder()
                        .billableMetric(
                            SubscriptionUsage.GroupedSubscriptionUsage.Data.BillableMetric.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metricGroup(
                            SubscriptionUsage.GroupedSubscriptionUsage.Data.MetricGroup.builder()
                                .propertyKey("property_key")
                                .propertyValue("property_value")
                                .build()
                        )
                        .addUsage(
                            SubscriptionUsage.GroupedSubscriptionUsage.Data.Usage.builder()
                                .quantity(0.0)
                                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .viewMode(SubscriptionUsage.GroupedSubscriptionUsage.Data.ViewMode.PERIODIC)
                        .build()
                )
                .build()

        val subscriptionUsage = SubscriptionUsage.ofGrouped(grouped)

        assertThat(subscriptionUsage.ungrouped()).isNull()
        assertThat(subscriptionUsage.grouped()).isEqualTo(grouped)
    }
}
