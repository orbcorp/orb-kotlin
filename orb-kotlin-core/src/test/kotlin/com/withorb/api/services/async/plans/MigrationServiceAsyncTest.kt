// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.plans().migrations()

        val migration =
            migrationServiceAsync.retrieve(
                PlanMigrationRetrieveParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

        migration.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.plans().migrations()

        val page = migrationServiceAsync.list("plan_id")

        page.response().validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.plans().migrations()

        val response =
            migrationServiceAsync.cancel(
                PlanMigrationCancelParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

        response.validate()
    }
}
