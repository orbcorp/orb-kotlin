// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams

interface MetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MetricServiceAsync

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
        metricId: String,
        params: MetricUpdateParams = MetricUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric = update(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric

    /** @see [update] */
    suspend fun update(metricId: String, requestOptions: RequestOptions): BillableMetric =
        update(metricId, MetricUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    suspend fun list(
        params: MetricListParams = MetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): MetricListPageAsync =
        list(MetricListParams.none(), requestOptions)

    /**
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     */
    suspend fun fetch(
        metricId: String,
        params: MetricFetchParams = MetricFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric = fetch(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see [fetch] */
    suspend fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillableMetric

    /** @see [fetch] */
    suspend fun fetch(metricId: String, requestOptions: RequestOptions): BillableMetric =
        fetch(metricId, MetricFetchParams.none(), requestOptions)

    /**
     * A view of [MetricServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /metrics`, but is otherwise the same as
         * [MetricServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillableMetric>

        /**
         * Returns a raw HTTP response for `put /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            metricId: String,
            params: MetricUpdateParams = MetricUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillableMetric> =
            update(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillableMetric>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            metricId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetric> =
            update(metricId, MetricUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /metrics`, but is otherwise the same as
         * [MetricServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: MetricListParams = MetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<MetricListPageAsync> =
            list(MetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            metricId: String,
            params: MetricFetchParams = MetricFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillableMetric> =
            fetch(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillableMetric>

        /** @see [fetch] */
        @MustBeClosed
        suspend fun fetch(
            metricId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetric> =
            fetch(metricId, MetricFetchParams.none(), requestOptions)
    }
}
