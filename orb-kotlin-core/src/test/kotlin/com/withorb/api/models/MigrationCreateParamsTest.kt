// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCreateParamsTest {

    @Test
    fun create() {
        MigrationCreateParams.builder()
            .effectiveTime(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
            .targetPlanVersionNumber(0L)
            .allowInvoiceCreditOrVoid(true)
            .canDeferBilling(true)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .addExcludedSubscriptionId("string")
            .externalPlanId("external_plan_id")
            .inTrial(true)
            .addIncludedSubscriptionId("string")
            .planId("plan_id")
            .addPlanVersionNumber(0L)
            .reason("reason")
            .addStatus(MigrationCreateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            MigrationCreateParams.builder()
                .effectiveTime(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
                .targetPlanVersionNumber(0L)
                .allowInvoiceCreditOrVoid(true)
                .canDeferBilling(true)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .addExcludedSubscriptionId("string")
                .externalPlanId("external_plan_id")
                .inTrial(true)
                .addIncludedSubscriptionId("string")
                .planId("plan_id")
                .addPlanVersionNumber(0L)
                .reason("reason")
                .addStatus(MigrationCreateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.effectiveTime()).isEqualTo(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
        assertThat(body.targetPlanVersionNumber()).isEqualTo(0L)
        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.canDeferBilling()).isEqualTo(true)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.excludedSubscriptionIds()).containsExactly("string")
        assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(body.inTrial()).isEqualTo(true)
        assertThat(body.includedSubscriptionIds()).containsExactly("string")
        assertThat(body.planId()).isEqualTo("plan_id")
        assertThat(body.planVersionNumbers()).containsExactly(0L)
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.statuses()).containsExactly(MigrationCreateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MigrationCreateParams.builder()
                .effectiveTime(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
                .targetPlanVersionNumber(0L)
                .build()

        val body = params._body()

        assertThat(body.effectiveTime()).isEqualTo(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
        assertThat(body.targetPlanVersionNumber()).isEqualTo(0L)
    }
}
