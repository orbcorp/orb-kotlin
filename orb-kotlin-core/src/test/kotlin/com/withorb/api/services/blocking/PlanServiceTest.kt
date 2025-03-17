// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan =
            planService.create(
                PlanCreateParams.builder()
                    .currency("currency")
                    .name("name")
                    .addPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("item_id")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PlanCreateParams.Price.NewPlanUnitPrice
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .currency("currency")
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PlanCreateParams.Price.NewPlanUnitPrice
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .defaultInvoiceMemo("default_invoice_memo")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .status(PlanCreateParams.Status.ACTIVE)
                    .build()
            )

        plan.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan =
            planService.update(
                PlanUpdateParams.builder()
                    .planId("plan_id")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        plan.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val page = planService.list()

        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan = planService.fetch(PlanFetchParams.builder().planId("plan_id").build())

        plan.validate()
    }
}
