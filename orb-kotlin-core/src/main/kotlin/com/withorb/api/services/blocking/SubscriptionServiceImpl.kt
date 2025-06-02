// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.Subscription
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCancelResponse
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionCreateResponse
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchCostsResponse
import com.withorb.api.models.SubscriptionFetchParams
import com.withorb.api.models.SubscriptionFetchSchedulePage
import com.withorb.api.models.SubscriptionFetchSchedulePageResponse
import com.withorb.api.models.SubscriptionFetchScheduleParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionListPage
import com.withorb.api.models.SubscriptionListParams
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionPriceIntervalsResponse
import com.withorb.api.models.SubscriptionRedeemCouponParams
import com.withorb.api.models.SubscriptionRedeemCouponResponse
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeResponse
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionTriggerPhaseResponse
import com.withorb.api.models.SubscriptionUnscheduleCancellationParams
import com.withorb.api.models.SubscriptionUnscheduleCancellationResponse
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesResponse
import com.withorb.api.models.SubscriptionUnschedulePendingPlanChangesParams
import com.withorb.api.models.SubscriptionUnschedulePendingPlanChangesResponse
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityResponse
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateTrialParams
import com.withorb.api.models.SubscriptionUpdateTrialResponse
import com.withorb.api.models.SubscriptionUsage
import com.withorb.api.models.Subscriptions

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): SubscriptionCreateResponse =
        // post /subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // put /subscriptions/{subscription_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPage =
        // get /subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions,
    ): SubscriptionCancelResponse =
        // post /subscriptions/{subscription_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun fetch(
        params: SubscriptionFetchParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // get /subscriptions/{subscription_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchCosts(
        params: SubscriptionFetchCostsParams,
        requestOptions: RequestOptions,
    ): SubscriptionFetchCostsResponse =
        // get /subscriptions/{subscription_id}/costs
        withRawResponse().fetchCosts(params, requestOptions).parse()

    override fun fetchSchedule(
        params: SubscriptionFetchScheduleParams,
        requestOptions: RequestOptions,
    ): SubscriptionFetchSchedulePage =
        // get /subscriptions/{subscription_id}/schedule
        withRawResponse().fetchSchedule(params, requestOptions).parse()

    override fun fetchUsage(
        params: SubscriptionFetchUsageParams,
        requestOptions: RequestOptions,
    ): SubscriptionUsage =
        // get /subscriptions/{subscription_id}/usage
        withRawResponse().fetchUsage(params, requestOptions).parse()

    override fun priceIntervals(
        params: SubscriptionPriceIntervalsParams,
        requestOptions: RequestOptions,
    ): SubscriptionPriceIntervalsResponse =
        // post /subscriptions/{subscription_id}/price_intervals
        withRawResponse().priceIntervals(params, requestOptions).parse()

    override fun redeemCoupon(
        params: SubscriptionRedeemCouponParams,
        requestOptions: RequestOptions,
    ): SubscriptionRedeemCouponResponse =
        // post /subscriptions/{subscription_id}/redeem_coupon
        withRawResponse().redeemCoupon(params, requestOptions).parse()

    override fun schedulePlanChange(
        params: SubscriptionSchedulePlanChangeParams,
        requestOptions: RequestOptions,
    ): SubscriptionSchedulePlanChangeResponse =
        // post /subscriptions/{subscription_id}/schedule_plan_change
        withRawResponse().schedulePlanChange(params, requestOptions).parse()

    override fun triggerPhase(
        params: SubscriptionTriggerPhaseParams,
        requestOptions: RequestOptions,
    ): SubscriptionTriggerPhaseResponse =
        // post /subscriptions/{subscription_id}/trigger_phase
        withRawResponse().triggerPhase(params, requestOptions).parse()

    override fun unscheduleCancellation(
        params: SubscriptionUnscheduleCancellationParams,
        requestOptions: RequestOptions,
    ): SubscriptionUnscheduleCancellationResponse =
        // post /subscriptions/{subscription_id}/unschedule_cancellation
        withRawResponse().unscheduleCancellation(params, requestOptions).parse()

    override fun unscheduleFixedFeeQuantityUpdates(
        params: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams,
        requestOptions: RequestOptions,
    ): SubscriptionUnscheduleFixedFeeQuantityUpdatesResponse =
        // post /subscriptions/{subscription_id}/unschedule_fixed_fee_quantity_updates
        withRawResponse().unscheduleFixedFeeQuantityUpdates(params, requestOptions).parse()

    override fun unschedulePendingPlanChanges(
        params: SubscriptionUnschedulePendingPlanChangesParams,
        requestOptions: RequestOptions,
    ): SubscriptionUnschedulePendingPlanChangesResponse =
        // post /subscriptions/{subscription_id}/unschedule_pending_plan_changes
        withRawResponse().unschedulePendingPlanChanges(params, requestOptions).parse()

    override fun updateFixedFeeQuantity(
        params: SubscriptionUpdateFixedFeeQuantityParams,
        requestOptions: RequestOptions,
    ): SubscriptionUpdateFixedFeeQuantityResponse =
        // post /subscriptions/{subscription_id}/update_fixed_fee_quantity
        withRawResponse().updateFixedFeeQuantity(params, requestOptions).parse()

    override fun updateTrial(
        params: SubscriptionUpdateTrialParams,
        requestOptions: RequestOptions,
    ): SubscriptionUpdateTrialResponse =
        // post /subscriptions/{subscription_id}/update_trial
        withRawResponse().updateTrial(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<SubscriptionCreateResponse> =
            jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("subscriptions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<Subscriptions> =
            jsonHandler<Subscriptions>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SubscriptionListPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<SubscriptionCancelResponse> =
            jsonHandler<SubscriptionCancelResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: SubscriptionFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchCostsHandler: Handler<SubscriptionFetchCostsResponse> =
            jsonHandler<SubscriptionFetchCostsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchCosts(
            params: SubscriptionFetchCostsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionFetchCostsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params._pathParam(0), "costs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchCostsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchScheduleHandler: Handler<SubscriptionFetchSchedulePageResponse> =
            jsonHandler<SubscriptionFetchSchedulePageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchSchedule(
            params: SubscriptionFetchScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionFetchSchedulePage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params._pathParam(0), "schedule")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchScheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SubscriptionFetchSchedulePage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val fetchUsageHandler: Handler<SubscriptionUsage> =
            jsonHandler<SubscriptionUsage>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetchUsage(
            params: SubscriptionFetchUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUsage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params._pathParam(0), "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val priceIntervalsHandler: Handler<SubscriptionPriceIntervalsResponse> =
            jsonHandler<SubscriptionPriceIntervalsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun priceIntervals(
            params: SubscriptionPriceIntervalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionPriceIntervalsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "price_intervals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { priceIntervalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val redeemCouponHandler: Handler<SubscriptionRedeemCouponResponse> =
            jsonHandler<SubscriptionRedeemCouponResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun redeemCoupon(
            params: SubscriptionRedeemCouponParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRedeemCouponResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "redeem_coupon")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { redeemCouponHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val schedulePlanChangeHandler: Handler<SubscriptionSchedulePlanChangeResponse> =
            jsonHandler<SubscriptionSchedulePlanChangeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun schedulePlanChange(
            params: SubscriptionSchedulePlanChangeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionSchedulePlanChangeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "schedule_plan_change")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { schedulePlanChangeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerPhaseHandler: Handler<SubscriptionTriggerPhaseResponse> =
            jsonHandler<SubscriptionTriggerPhaseResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun triggerPhase(
            params: SubscriptionTriggerPhaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionTriggerPhaseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "trigger_phase")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { triggerPhaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unscheduleCancellationHandler:
            Handler<SubscriptionUnscheduleCancellationResponse> =
            jsonHandler<SubscriptionUnscheduleCancellationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unscheduleCancellation(
            params: SubscriptionUnscheduleCancellationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUnscheduleCancellationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "unschedule_cancellation",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { unscheduleCancellationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unscheduleFixedFeeQuantityUpdatesHandler:
            Handler<SubscriptionUnscheduleFixedFeeQuantityUpdatesResponse> =
            jsonHandler<SubscriptionUnscheduleFixedFeeQuantityUpdatesResponse>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun unscheduleFixedFeeQuantityUpdates(
            params: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUnscheduleFixedFeeQuantityUpdatesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "unschedule_fixed_fee_quantity_updates",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { unscheduleFixedFeeQuantityUpdatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unschedulePendingPlanChangesHandler:
            Handler<SubscriptionUnschedulePendingPlanChangesResponse> =
            jsonHandler<SubscriptionUnschedulePendingPlanChangesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unschedulePendingPlanChanges(
            params: SubscriptionUnschedulePendingPlanChangesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUnschedulePendingPlanChangesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "unschedule_pending_plan_changes",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { unschedulePendingPlanChangesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFixedFeeQuantityHandler:
            Handler<SubscriptionUpdateFixedFeeQuantityResponse> =
            jsonHandler<SubscriptionUpdateFixedFeeQuantityResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateFixedFeeQuantity(
            params: SubscriptionUpdateFixedFeeQuantityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUpdateFixedFeeQuantityResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "update_fixed_fee_quantity",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateFixedFeeQuantityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateTrialHandler: Handler<SubscriptionUpdateTrialResponse> =
            jsonHandler<SubscriptionUpdateTrialResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateTrial(
            params: SubscriptionUpdateTrialParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUpdateTrialResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params._pathParam(0), "update_trial")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateTrialHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
