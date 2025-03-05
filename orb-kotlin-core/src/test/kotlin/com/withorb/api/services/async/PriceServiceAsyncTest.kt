// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.NewBillingCycleConfigurationModel
import com.withorb.api.models.NewFloatingPriceModel
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.models.UnitConfigModel
import com.withorb.api.models.UpdatePriceRequestParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PriceServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val priceModel =
            priceServiceAsync.create(
                PriceCreateParams.builder()
                    .newFloatingPriceModel(
                        NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                            .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
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
                                NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        priceModel.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val priceModel =
            priceServiceAsync.update(
                PriceUpdateParams.builder()
                    .priceId("price_id")
                    .updatePriceRequestParams(
                        UpdatePriceRequestParams.builder()
                            .metadata(
                                UpdatePriceRequestParams.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        priceModel.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val page = priceServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun evaluate() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val response =
            priceServiceAsync.evaluate(
                PriceEvaluateParams.builder()
                    .priceId("price_id")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val priceModel =
            priceServiceAsync.fetch(PriceFetchParams.builder().priceId("price_id").build())

        priceModel.validate()
    }
}
