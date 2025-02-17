// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams

interface MetricServiceAsync {

    /**
     * This endpoint is used to create a [metric](/core-concepts###metric) using a SQL string. See
     * [SQL support](/extensibility/advanced-metrics#sql-support) for a description of constructing
     * SQL queries with examples.
     */
    suspend fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you pass `null`
     * for the metadata value, it will clear any existing metadata for that invoice.
     */
    suspend fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric

    /**
     * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    suspend fun list(
        params: MetricListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricListPageAsync

    /**
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     */
    suspend fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric
}
