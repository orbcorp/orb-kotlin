// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricCreateResponse
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricFetchResponse
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListParams

interface MetricService {

    /**
     * This endpoint is used to create a [metric](../guides/concepts##metric) using a SQL string.
     * See [SQL support](../guides/extensibility/advanced-metrics#sql-support) for a description of
     * constructing SQL queries with examples.
     */
    fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MetricCreateResponse

    /**
     * This endpoint is used to fetch [metric](../guides/concepts#metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    fun list(
        params: MetricListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MetricListPage

    /**
     * This endpoint is used to list [metrics](../guides/concepts##metric). It returns information
     * about the metrics including its name, description, and item.
     */
    fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MetricFetchResponse
}
