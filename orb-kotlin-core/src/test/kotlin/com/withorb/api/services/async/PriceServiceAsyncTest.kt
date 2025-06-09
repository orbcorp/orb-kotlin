// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.ConversionRateUnitConfig
import com.withorb.api.models.NewBillingCycleConfiguration
import com.withorb.api.models.NewDimensionalPriceConfiguration
import com.withorb.api.models.NewFloatingUnitPrice
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateMultipleParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluatePreviewEventsParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.models.UnitConfig
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PriceServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val price =
            priceServiceAsync.create(
                PriceCreateParams.builder()
                    .body(
                        NewFloatingUnitPrice.builder()
                            .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                NewBillingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                    .build()
                            )
                            .conversionRate(0.0)
                            .unitConversionRateConfig(
                                ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                            )
                            .dimensionalPriceConfiguration(
                                NewDimensionalPriceConfiguration.builder()
                                    .addDimensionValue("string")
                                    .dimensionalPriceGroupId("dimensional_price_group_id")
                                    .externalDimensionalPriceGroupId(
                                        "external_dimensional_price_group_id"
                                    )
                                    .build()
                            )
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("x")
                            .invoicingCycleConfiguration(
                                NewBillingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                    .build()
                            )
                            .metadata(
                                NewFloatingUnitPrice.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        price.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val price =
            priceServiceAsync.update(
                PriceUpdateParams.builder()
                    .priceId("price_id")
                    .metadata(
                        PriceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        price.validate()
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
    suspend fun evaluateMultiple() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val response =
            priceServiceAsync.evaluateMultiple(
                PriceEvaluateMultipleParams.builder()
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .addPriceEvaluation(
                        PriceEvaluateMultipleParams.PriceEvaluation.builder()
                            .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                            .addGroupingKey(
                                "case when my_event_type = 'foo' then true else false end"
                            )
                            .price(
                                NewFloatingUnitPrice.builder()
                                    .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                                    .currency("currency")
                                    .itemId("item_id")
                                    .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewFloatingUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .priceId("price_id")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun evaluatePreviewEvents() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val response =
            priceServiceAsync.evaluatePreviewEvents(
                PriceEvaluatePreviewEventsParams.builder()
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .addEvent(
                        PriceEvaluatePreviewEventsParams.Event.builder()
                            .eventName("event_name")
                            .properties(
                                PriceEvaluatePreviewEventsParams.Event.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .customerId("customer_id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .externalCustomerId("external_customer_id")
                    .addPriceEvaluation(
                        PriceEvaluatePreviewEventsParams.PriceEvaluation.builder()
                            .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                            .addGroupingKey(
                                "case when my_event_type = 'foo' then true else false end"
                            )
                            .price(
                                NewFloatingUnitPrice.builder()
                                    .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                                    .currency("currency")
                                    .itemId("item_id")
                                    .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("string")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewFloatingUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .priceId("price_id")
                            .build()
                    )
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

        val price = priceServiceAsync.fetch("price_id")

        price.validate()
    }
}
