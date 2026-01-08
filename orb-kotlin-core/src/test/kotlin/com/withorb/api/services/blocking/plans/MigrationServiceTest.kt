// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.plans().migrations()

        val migration =
            migrationService.retrieve(
                PlanMigrationRetrieveParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

        migration.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.plans().migrations()

        val page = migrationService.list("plan_id")

        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationService = client.plans().migrations()

        val response =
            migrationService.cancel(
                PlanMigrationCancelParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

        response.validate()
    }
}
