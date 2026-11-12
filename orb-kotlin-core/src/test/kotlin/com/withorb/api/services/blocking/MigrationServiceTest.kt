// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.MigrationCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.migrations()

        val migration =
            migrationService.create(
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
            )

        migration.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.migrations()

        val migration = migrationService.retrieve("migration_id")

        migration.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.migrations()

        val page = migrationService.list()

        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.migrations()

        val response = migrationService.cancel("migration_id")

        response.validate()
    }
}
