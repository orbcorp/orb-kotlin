// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPlanIdServiceTest {

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdService = client.plans().externalPlanId()

        val plan =
            externalPlanIdService.update(
                PlanExternalPlanIdUpdateParams.builder()
                    .otherExternalPlanId("external_plan_id")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanExternalPlanIdUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        plan.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdService = client.plans().externalPlanId()

        val plan = externalPlanIdService.fetch("external_plan_id")

        plan.validate()
    }
}
