// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.blocking.plans.ExternalPlanIdService

interface PlanService {

    fun externalPlanId(): ExternalPlanIdService

    /** This endpoint allows creation of plans including their prices. */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Plan

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a customer are currently immutable.
     */
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Plan

    /**
     * This endpoint returns a list of all [plans](../guides/concepts##plan-and-price) for an
     * account in a list format. The list of plans is ordered starting from the most recently
     * created plan. The response also includes [`pagination_metadata`](../reference/pagination),
     * which lets the caller retrieve the next page of results if they exist.
     */
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanListPage

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given a
     * plan identifier. It returns information about the prices included in the plan and their
     * configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized
     * prices refer to all prices across all phases.
     */
    fun fetch(params: PlanFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Plan
}
