// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.PlanListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()
        val plan =
            planService.create(
                PlanCreateParams.builder()
                    .currency("string")
                    .name("string")
                    .prices(
                        listOf(
                            PlanCreateParams.Price.ofNewPlanUnitPrice(
                                PlanCreateParams.Price.NewPlanUnitPrice.builder()
                                    .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                                    .itemId("string")
                                    .modelType(
                                        PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                            .unitAmount("string")
                                            .build()
                                    )
                                    .billableMetricId("string")
                                    .billedInAdvance(true)
                                    .conversionRate(42.23)
                                    .currency("string")
                                    .externalPriceId("string")
                                    .fixedPriceQuantity(42.23)
                                    .invoiceGroupingKey("string")
                                    .build()
                            )
                        )
                    )
                    .defaultInvoiceMemo("string")
                    .externalPlanId("string")
                    .metadata(PlanCreateParams.Metadata.builder().build())
                    .netTerms(123L)
                    .status(PlanCreateParams.Status.ACTIVE)
                    .build()
            )
        println(plan)
        plan.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()
        val plan =
            planService.update(
                PlanUpdateParams.builder()
                    .planId("string")
                    .externalPlanId("string")
                    .metadata(PlanUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(plan)
        plan.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()
        val plans = planService.list(PlanListParams.builder().build())
        println(plans)
        plans.data().forEach { it.validate() }
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()
        val plan = planService.fetch(PlanFetchParams.builder().planId("string").build())
        println(plan)
        plan.validate()
    }
}
