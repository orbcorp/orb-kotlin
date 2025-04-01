// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

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
    fun ofUngroupedRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUsage =
            SubscriptionUsage.ofUngrouped(
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
                                    .timeframeStart(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .build()
                            )
                            .viewMode(
                                SubscriptionUsage.UngroupedSubscriptionUsage.Data.ViewMode.PERIODIC
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedSubscriptionUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUsage),
                jacksonTypeRef<SubscriptionUsage>(),
            )

        assertThat(roundtrippedSubscriptionUsage).isEqualTo(subscriptionUsage)
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
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val subscriptionUsage = SubscriptionUsage.ofGrouped(grouped)

        assertThat(subscriptionUsage.ungrouped()).isNull()
        assertThat(subscriptionUsage.grouped()).isEqualTo(grouped)
    }

    @Test
    fun ofGroupedRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUsage =
            SubscriptionUsage.ofGrouped(
                SubscriptionUsage.GroupedSubscriptionUsage.builder()
                    .addData(
                        SubscriptionUsage.GroupedSubscriptionUsage.Data.builder()
                            .billableMetric(
                                SubscriptionUsage.GroupedSubscriptionUsage.Data.BillableMetric
                                    .builder()
                                    .id("id")
                                    .name("name")
                                    .build()
                            )
                            .metricGroup(
                                SubscriptionUsage.GroupedSubscriptionUsage.Data.MetricGroup
                                    .builder()
                                    .propertyKey("property_key")
                                    .propertyValue("property_value")
                                    .build()
                            )
                            .addUsage(
                                SubscriptionUsage.GroupedSubscriptionUsage.Data.Usage.builder()
                                    .quantity(0.0)
                                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .timeframeStart(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .build()
                            )
                            .viewMode(
                                SubscriptionUsage.GroupedSubscriptionUsage.Data.ViewMode.PERIODIC
                            )
                            .build()
                    )
                    .paginationMetadata(
                        PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                    )
                    .build()
            )

        val roundtrippedSubscriptionUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUsage),
                jacksonTypeRef<SubscriptionUsage>(),
            )

        assertThat(roundtrippedSubscriptionUsage).isEqualTo(subscriptionUsage)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val subscriptionUsage =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<SubscriptionUsage>())

        val e = assertThrows<OrbInvalidDataException> { subscriptionUsage.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
