// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler
import com.withorb.api.services.blocking.plans.ExternalPlanIdService
import com.withorb.api.services.blocking.plans.ExternalPlanIdServiceImpl

interface PlanService {

    fun externalPlanId(): ExternalPlanIdService

    /** This endpoint allows creation of plans including their prices. */
    fun create(params: PlanCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Plan

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an
     * existing plan.
     *
     * Other fields on a customer are currently immutable.
     */
    fun update(params: PlanUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Plan

    /**
     * This endpoint returns a list of all [plans](../guides/concepts##plan-and-price)
     * for an account in a list format. The list of plans is ordered starting from the
     * most recently created plan. The response also includes
     * [`pagination_metadata`](../reference/pagination), which lets the caller retrieve
     * the next page of results if they exist.
     */
    fun list(params: PlanListParams, requestOptions: RequestOptions = RequestOptions.none()): PlanListPage

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price)
     * details given a plan identifier. It returns information about the prices
     * included in the plan and their configuration, as well as the product that the
     * plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models
     * is serialized differently in a given [Price](../guides/concepts#plan-and-price)
     * object. The `model_type` field determines the key for the configuration object
     * that is present. A detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases,
     * the serialized prices refer to all prices across all phases.
     */
    fun fetch(params: PlanFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Plan
}
