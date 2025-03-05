// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.EditPlanModel
import com.withorb.api.models.NewBillingCycleConfigurationModel
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.models.UnitConfigModel
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val planModel =
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
                            .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                NewBillingCycleConfigurationModel.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        NewBillingCycleConfigurationModel.DurationUnit.DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .currency("currency")
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                NewBillingCycleConfigurationModel.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        NewBillingCycleConfigurationModel.DurationUnit.DAY
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

        planModel.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val planModel =
            planService.update(
                PlanUpdateParams.builder()
                    .planId("plan_id")
                    .editPlanModel(
                        EditPlanModel.builder()
                            .externalPlanId("external_plan_id")
                            .metadata(
                                EditPlanModel.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        planModel.validate()
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

        val planModel = planService.fetch(PlanFetchParams.builder().planId("plan_id").build())

        planModel.validate()
    }
}
