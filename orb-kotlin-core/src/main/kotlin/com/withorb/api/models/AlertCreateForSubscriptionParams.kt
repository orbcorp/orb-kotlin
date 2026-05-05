// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint is used to create alerts at the subscription level.
 *
 * Subscription level alerts can be one of two types: `usage_exceeded` or `cost_exceeded`. A
 * `usage_exceeded` alert is scoped to a particular metric and is triggered when the usage of that
 * metric exceeds predefined thresholds during the current billing cycle. A `cost_exceeded` alert is
 * triggered when the total amount due during the current billing cycle surpasses predefined
 * thresholds. `cost_exceeded` alerts do not include burndown of pre-purchase credits. Each
 * subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert per metric that is
 * a part of the subscription. Alerts are triggered based on usage or cost conditions met during the
 * current billing cycle.
 */
class AlertCreateForSubscriptionParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    /**
     * The thresholds that define the values at which the alert will be triggered.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thresholds(): List<Threshold> = body.thresholds()

    /**
     * The type of alert to create. This must be a valid alert type.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * The property keys to group cost alerts by. Only applicable for cost_exceeded alerts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun groupingKeys(): List<String>? = body.groupingKeys()

    /**
     * The metric to track usage for.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metricId(): String? = body.metricId()

    /**
     * Filters to scope which prices are included in grouped cost alert evaluation. Supports
     * filtering by price_id, item_id, or price_type with includes/excludes operators. Only
     * applicable when grouping_keys is set.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun priceFilters(): List<PriceFilter>? = body.priceFilters()

    /**
     * The pricing unit to use for grouped cost alerts. Required when grouping_keys is set.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun pricingUnitId(): String? = body.pricingUnitId()

    /**
     * Per-group threshold overrides. Each override maps a specific combination of grouping_keys
     * values to a list of thresholds that fully replaces the default thresholds for that group. An
     * empty thresholds list silences the group. Groups without an override use the default
     * thresholds. Only applicable when grouping_keys is set.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun thresholdOverrides(): List<ThresholdOverride>? = body.thresholdOverrides()

    /**
     * Returns the raw JSON value of [thresholds].
     *
     * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _thresholds(): JsonField<List<Threshold>> = body._thresholds()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [groupingKeys].
     *
     * Unlike [groupingKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupingKeys(): JsonField<List<String>> = body._groupingKeys()

    /**
     * Returns the raw JSON value of [metricId].
     *
     * Unlike [metricId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metricId(): JsonField<String> = body._metricId()

    /**
     * Returns the raw JSON value of [priceFilters].
     *
     * Unlike [priceFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priceFilters(): JsonField<List<PriceFilter>> = body._priceFilters()

    /**
     * Returns the raw JSON value of [pricingUnitId].
     *
     * Unlike [pricingUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricingUnitId(): JsonField<String> = body._pricingUnitId()

    /**
     * Returns the raw JSON value of [thresholdOverrides].
     *
     * Unlike [thresholdOverrides], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _thresholdOverrides(): JsonField<List<ThresholdOverride>> = body._thresholdOverrides()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AlertCreateForSubscriptionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .thresholds()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AlertCreateForSubscriptionParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(alertCreateForSubscriptionParams: AlertCreateForSubscriptionParams) =
            apply {
                subscriptionId = alertCreateForSubscriptionParams.subscriptionId
                body = alertCreateForSubscriptionParams.body.toBuilder()
                additionalHeaders = alertCreateForSubscriptionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    alertCreateForSubscriptionParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [thresholds]
         * - [type]
         * - [groupingKeys]
         * - [metricId]
         * - [priceFilters]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>) = apply { body.thresholds(thresholds) }

        /**
         * Sets [Builder.thresholds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            body.thresholds(thresholds)
        }

        /**
         * Adds a single [Threshold] to [thresholds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThreshold(threshold: Threshold) = apply { body.addThreshold(threshold) }

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The property keys to group cost alerts by. Only applicable for cost_exceeded alerts. */
        fun groupingKeys(groupingKeys: List<String>?) = apply { body.groupingKeys(groupingKeys) }

        /**
         * Sets [Builder.groupingKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupingKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
            body.groupingKeys(groupingKeys)
        }

        /**
         * Adds a single [String] to [groupingKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupingKey(groupingKey: String) = apply { body.addGroupingKey(groupingKey) }

        /** The metric to track usage for. */
        fun metricId(metricId: String?) = apply { body.metricId(metricId) }

        /**
         * Sets [Builder.metricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metricId(metricId: JsonField<String>) = apply { body.metricId(metricId) }

        /**
         * Filters to scope which prices are included in grouped cost alert evaluation. Supports
         * filtering by price_id, item_id, or price_type with includes/excludes operators. Only
         * applicable when grouping_keys is set.
         */
        fun priceFilters(priceFilters: List<PriceFilter>?) = apply {
            body.priceFilters(priceFilters)
        }

        /**
         * Sets [Builder.priceFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceFilters] with a well-typed `List<PriceFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priceFilters(priceFilters: JsonField<List<PriceFilter>>) = apply {
            body.priceFilters(priceFilters)
        }

        /**
         * Adds a single [PriceFilter] to [priceFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceFilter(priceFilter: PriceFilter) = apply { body.addPriceFilter(priceFilter) }

        /** The pricing unit to use for grouped cost alerts. Required when grouping_keys is set. */
        fun pricingUnitId(pricingUnitId: String?) = apply { body.pricingUnitId(pricingUnitId) }

        /**
         * Sets [Builder.pricingUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingUnitId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricingUnitId(pricingUnitId: JsonField<String>) = apply {
            body.pricingUnitId(pricingUnitId)
        }

        /**
         * Per-group threshold overrides. Each override maps a specific combination of grouping_keys
         * values to a list of thresholds that fully replaces the default thresholds for that group.
         * An empty thresholds list silences the group. Groups without an override use the default
         * thresholds. Only applicable when grouping_keys is set.
         */
        fun thresholdOverrides(thresholdOverrides: List<ThresholdOverride>?) = apply {
            body.thresholdOverrides(thresholdOverrides)
        }

        /**
         * Sets [Builder.thresholdOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdOverrides] with a well-typed
         * `List<ThresholdOverride>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun thresholdOverrides(thresholdOverrides: JsonField<List<ThresholdOverride>>) = apply {
            body.thresholdOverrides(thresholdOverrides)
        }

        /**
         * Adds a single [ThresholdOverride] to [thresholdOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThresholdOverride(thresholdOverride: ThresholdOverride) = apply {
            body.addThresholdOverride(thresholdOverride)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AlertCreateForSubscriptionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .thresholds()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertCreateForSubscriptionParams =
            AlertCreateForSubscriptionParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val thresholds: JsonField<List<Threshold>>,
        private val type: JsonField<Type>,
        private val groupingKeys: JsonField<List<String>>,
        private val metricId: JsonField<String>,
        private val priceFilters: JsonField<List<PriceFilter>>,
        private val pricingUnitId: JsonField<String>,
        private val thresholdOverrides: JsonField<List<ThresholdOverride>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("thresholds")
            @ExcludeMissing
            thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("grouping_keys")
            @ExcludeMissing
            groupingKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("metric_id")
            @ExcludeMissing
            metricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_filters")
            @ExcludeMissing
            priceFilters: JsonField<List<PriceFilter>> = JsonMissing.of(),
            @JsonProperty("pricing_unit_id")
            @ExcludeMissing
            pricingUnitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("threshold_overrides")
            @ExcludeMissing
            thresholdOverrides: JsonField<List<ThresholdOverride>> = JsonMissing.of(),
        ) : this(
            thresholds,
            type,
            groupingKeys,
            metricId,
            priceFilters,
            pricingUnitId,
            thresholdOverrides,
            mutableMapOf(),
        )

        /**
         * The thresholds that define the values at which the alert will be triggered.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

        /**
         * The type of alert to create. This must be a valid alert type.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The property keys to group cost alerts by. Only applicable for cost_exceeded alerts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupingKeys(): List<String>? = groupingKeys.getNullable("grouping_keys")

        /**
         * The metric to track usage for.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metricId(): String? = metricId.getNullable("metric_id")

        /**
         * Filters to scope which prices are included in grouped cost alert evaluation. Supports
         * filtering by price_id, item_id, or price_type with includes/excludes operators. Only
         * applicable when grouping_keys is set.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceFilters(): List<PriceFilter>? = priceFilters.getNullable("price_filters")

        /**
         * The pricing unit to use for grouped cost alerts. Required when grouping_keys is set.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricingUnitId(): String? = pricingUnitId.getNullable("pricing_unit_id")

        /**
         * Per-group threshold overrides. Each override maps a specific combination of grouping_keys
         * values to a list of thresholds that fully replaces the default thresholds for that group.
         * An empty thresholds list silences the group. Groups without an override use the default
         * thresholds. Only applicable when grouping_keys is set.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thresholdOverrides(): List<ThresholdOverride>? =
            thresholdOverrides.getNullable("threshold_overrides")

        /**
         * Returns the raw JSON value of [thresholds].
         *
         * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thresholds")
        @ExcludeMissing
        fun _thresholds(): JsonField<List<Threshold>> = thresholds

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [groupingKeys].
         *
         * Unlike [groupingKeys], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("grouping_keys")
        @ExcludeMissing
        fun _groupingKeys(): JsonField<List<String>> = groupingKeys

        /**
         * Returns the raw JSON value of [metricId].
         *
         * Unlike [metricId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric_id") @ExcludeMissing fun _metricId(): JsonField<String> = metricId

        /**
         * Returns the raw JSON value of [priceFilters].
         *
         * Unlike [priceFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_filters")
        @ExcludeMissing
        fun _priceFilters(): JsonField<List<PriceFilter>> = priceFilters

        /**
         * Returns the raw JSON value of [pricingUnitId].
         *
         * Unlike [pricingUnitId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricing_unit_id")
        @ExcludeMissing
        fun _pricingUnitId(): JsonField<String> = pricingUnitId

        /**
         * Returns the raw JSON value of [thresholdOverrides].
         *
         * Unlike [thresholdOverrides], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("threshold_overrides")
        @ExcludeMissing
        fun _thresholdOverrides(): JsonField<List<ThresholdOverride>> = thresholdOverrides

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .thresholds()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var thresholds: JsonField<MutableList<Threshold>>? = null
            private var type: JsonField<Type>? = null
            private var groupingKeys: JsonField<MutableList<String>>? = null
            private var metricId: JsonField<String> = JsonMissing.of()
            private var priceFilters: JsonField<MutableList<PriceFilter>>? = null
            private var pricingUnitId: JsonField<String> = JsonMissing.of()
            private var thresholdOverrides: JsonField<MutableList<ThresholdOverride>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                thresholds = body.thresholds.map { it.toMutableList() }
                type = body.type
                groupingKeys = body.groupingKeys.map { it.toMutableList() }
                metricId = body.metricId
                priceFilters = body.priceFilters.map { it.toMutableList() }
                pricingUnitId = body.pricingUnitId
                thresholdOverrides = body.thresholdOverrides.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The thresholds that define the values at which the alert will be triggered. */
            fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

            /**
             * Sets [Builder.thresholds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                this.thresholds = thresholds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Threshold] to [thresholds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThreshold(threshold: Threshold) = apply {
                thresholds =
                    (thresholds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thresholds", it).add(threshold)
                    }
            }

            /** The type of alert to create. This must be a valid alert type. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The property keys to group cost alerts by. Only applicable for cost_exceeded alerts.
             */
            fun groupingKeys(groupingKeys: List<String>?) =
                groupingKeys(JsonField.ofNullable(groupingKeys))

            /**
             * Sets [Builder.groupingKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupingKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
                this.groupingKeys = groupingKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groupingKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupingKey(groupingKey: String) = apply {
                groupingKeys =
                    (groupingKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupingKeys", it).add(groupingKey)
                    }
            }

            /** The metric to track usage for. */
            fun metricId(metricId: String?) = metricId(JsonField.ofNullable(metricId))

            /**
             * Sets [Builder.metricId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metricId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metricId(metricId: JsonField<String>) = apply { this.metricId = metricId }

            /**
             * Filters to scope which prices are included in grouped cost alert evaluation. Supports
             * filtering by price_id, item_id, or price_type with includes/excludes operators. Only
             * applicable when grouping_keys is set.
             */
            fun priceFilters(priceFilters: List<PriceFilter>?) =
                priceFilters(JsonField.ofNullable(priceFilters))

            /**
             * Sets [Builder.priceFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceFilters] with a well-typed `List<PriceFilter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun priceFilters(priceFilters: JsonField<List<PriceFilter>>) = apply {
                this.priceFilters = priceFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [PriceFilter] to [priceFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceFilter(priceFilter: PriceFilter) = apply {
                priceFilters =
                    (priceFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceFilters", it).add(priceFilter)
                    }
            }

            /**
             * The pricing unit to use for grouped cost alerts. Required when grouping_keys is set.
             */
            fun pricingUnitId(pricingUnitId: String?) =
                pricingUnitId(JsonField.ofNullable(pricingUnitId))

            /**
             * Sets [Builder.pricingUnitId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingUnitId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingUnitId(pricingUnitId: JsonField<String>) = apply {
                this.pricingUnitId = pricingUnitId
            }

            /**
             * Per-group threshold overrides. Each override maps a specific combination of
             * grouping_keys values to a list of thresholds that fully replaces the default
             * thresholds for that group. An empty thresholds list silences the group. Groups
             * without an override use the default thresholds. Only applicable when grouping_keys is
             * set.
             */
            fun thresholdOverrides(thresholdOverrides: List<ThresholdOverride>?) =
                thresholdOverrides(JsonField.ofNullable(thresholdOverrides))

            /**
             * Sets [Builder.thresholdOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdOverrides] with a well-typed
             * `List<ThresholdOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun thresholdOverrides(thresholdOverrides: JsonField<List<ThresholdOverride>>) = apply {
                this.thresholdOverrides = thresholdOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [ThresholdOverride] to [thresholdOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThresholdOverride(thresholdOverride: ThresholdOverride) = apply {
                thresholdOverrides =
                    (thresholdOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thresholdOverrides", it).add(thresholdOverride)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .thresholds()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("thresholds", thresholds).map { it.toImmutable() },
                    checkRequired("type", type),
                    (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    metricId,
                    (priceFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    pricingUnitId,
                    (thresholdOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            thresholds().forEach { it.validate() }
            type().validate()
            groupingKeys()
            metricId()
            priceFilters()?.forEach { it.validate() }
            pricingUnitId()
            thresholdOverrides()?.forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (thresholds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (groupingKeys.asKnown()?.size ?: 0) +
                (if (metricId.asKnown() == null) 0 else 1) +
                (priceFilters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (pricingUnitId.asKnown() == null) 0 else 1) +
                (thresholdOverrides.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                thresholds == other.thresholds &&
                type == other.type &&
                groupingKeys == other.groupingKeys &&
                metricId == other.metricId &&
                priceFilters == other.priceFilters &&
                pricingUnitId == other.pricingUnitId &&
                thresholdOverrides == other.thresholdOverrides &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                thresholds,
                type,
                groupingKeys,
                metricId,
                priceFilters,
                pricingUnitId,
                thresholdOverrides,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{thresholds=$thresholds, type=$type, groupingKeys=$groupingKeys, metricId=$metricId, priceFilters=$priceFilters, pricingUnitId=$pricingUnitId, thresholdOverrides=$thresholdOverrides, additionalProperties=$additionalProperties}"
    }

    /** The type of alert to create. This must be a valid alert type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USAGE_EXCEEDED = of("usage_exceeded")

            val COST_EXCEEDED = of("cost_exceeded")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PriceFilter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<Field>,
        private val operator: JsonField<Operator>,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(field, operator, values, mutableMapOf())

        /**
         * The property of the price to filter on.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun field(): Field = field.getRequired("field")

        /**
         * Should prices that match the filter be included or excluded.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): Operator = operator.getRequired("operator")

        /**
         * The IDs or values that match this filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun values(): List<String> = values.getRequired("values")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PriceFilter].
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .values()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PriceFilter]. */
        class Builder internal constructor() {

            private var field: JsonField<Field>? = null
            private var operator: JsonField<Operator>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceFilter: PriceFilter) = apply {
                field = priceFilter.field
                operator = priceFilter.operator
                values = priceFilter.values.map { it.toMutableList() }
                additionalProperties = priceFilter.additionalProperties.toMutableMap()
            }

            /** The property of the price to filter on. */
            fun field(field: Field) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [Field] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun field(field: JsonField<Field>) = apply { this.field = field }

            /** Should prices that match the filter be included or excluded. */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** The IDs or values that match this filter. */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PriceFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .values()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PriceFilter =
                PriceFilter(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("values", values).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PriceFilter = apply {
            if (validated) {
                return@apply
            }

            field().validate()
            operator().validate()
            values()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (field.asKnown()?.validity() ?: 0) +
                (operator.asKnown()?.validity() ?: 0) +
                (values.asKnown()?.size ?: 0)

        /** The property of the price to filter on. */
        class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PRICE_ID = of("price_id")

                val ITEM_ID = of("item_id")

                val PRICE_TYPE = of("price_type")

                val CURRENCY = of("currency")

                val PRICING_UNIT_ID = of("pricing_unit_id")

                fun of(value: String) = Field(JsonField.of(value))
            }

            /** An enum containing [Field]'s known values. */
            enum class Known {
                PRICE_ID,
                ITEM_ID,
                PRICE_TYPE,
                CURRENCY,
                PRICING_UNIT_ID,
            }

            /**
             * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Field] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRICE_ID,
                ITEM_ID,
                PRICE_TYPE,
                CURRENCY,
                PRICING_UNIT_ID,
                /**
                 * An enum member indicating that [Field] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PRICE_ID -> Value.PRICE_ID
                    ITEM_ID -> Value.ITEM_ID
                    PRICE_TYPE -> Value.PRICE_TYPE
                    CURRENCY -> Value.CURRENCY
                    PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PRICE_ID -> Known.PRICE_ID
                    ITEM_ID -> Known.ITEM_ID
                    PRICE_TYPE -> Known.PRICE_TYPE
                    CURRENCY -> Known.CURRENCY
                    PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                    else -> throw OrbInvalidDataException("Unknown Field: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Field = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Field && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Should prices that match the filter be included or excluded. */
        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCLUDES = of("includes")

                val EXCLUDES = of("excludes")

                fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                INCLUDES,
                EXCLUDES,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCLUDES,
                EXCLUDES,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INCLUDES -> Value.INCLUDES
                    EXCLUDES -> Value.EXCLUDES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INCLUDES -> Known.INCLUDES
                    EXCLUDES -> Known.EXCLUDES
                    else -> throw OrbInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Operator = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Operator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriceFilter &&
                field == other.field &&
                operator == other.operator &&
                values == other.values &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(field, operator, values, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceFilter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
    }

    /**
     * Per-group threshold override on a grouped cost alert.
     * - An empty `thresholds` list silences alerts for this group (never fires).
     * - A non-empty list fully replaces the default thresholds for this group.
     */
    class ThresholdOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val groupValues: JsonField<List<String>>,
        private val thresholds: JsonField<List<Threshold>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group_values")
            @ExcludeMissing
            groupValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("thresholds")
            @ExcludeMissing
            thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
        ) : this(groupValues, thresholds, mutableMapOf())

        /**
         * The values of the grouping keys that identify this group. The list length must match the
         * alert's grouping_keys, and values appear in the same order as grouping_keys.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groupValues(): List<String> = groupValues.getRequired("group_values")

        /**
         * The thresholds to apply to this group. An empty list silences alerts for this group. A
         * non-empty list fully replaces the default thresholds for this group.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

        /**
         * Returns the raw JSON value of [groupValues].
         *
         * Unlike [groupValues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_values")
        @ExcludeMissing
        fun _groupValues(): JsonField<List<String>> = groupValues

        /**
         * Returns the raw JSON value of [thresholds].
         *
         * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thresholds")
        @ExcludeMissing
        fun _thresholds(): JsonField<List<Threshold>> = thresholds

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ThresholdOverride].
             *
             * The following fields are required:
             * ```kotlin
             * .groupValues()
             * .thresholds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ThresholdOverride]. */
        class Builder internal constructor() {

            private var groupValues: JsonField<MutableList<String>>? = null
            private var thresholds: JsonField<MutableList<Threshold>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(thresholdOverride: ThresholdOverride) = apply {
                groupValues = thresholdOverride.groupValues.map { it.toMutableList() }
                thresholds = thresholdOverride.thresholds.map { it.toMutableList() }
                additionalProperties = thresholdOverride.additionalProperties.toMutableMap()
            }

            /**
             * The values of the grouping keys that identify this group. The list length must match
             * the alert's grouping_keys, and values appear in the same order as grouping_keys.
             */
            fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

            /**
             * Sets [Builder.groupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupValues] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupValues(groupValues: JsonField<List<String>>) = apply {
                this.groupValues = groupValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groupValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupValue(groupValue: String) = apply {
                groupValues =
                    (groupValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupValues", it).add(groupValue)
                    }
            }

            /**
             * The thresholds to apply to this group. An empty list silences alerts for this group.
             * A non-empty list fully replaces the default thresholds for this group.
             */
            fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

            /**
             * Sets [Builder.thresholds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                this.thresholds = thresholds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Threshold] to [thresholds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThreshold(threshold: Threshold) = apply {
                thresholds =
                    (thresholds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thresholds", it).add(threshold)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ThresholdOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .groupValues()
             * .thresholds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ThresholdOverride =
                ThresholdOverride(
                    checkRequired("groupValues", groupValues).map { it.toImmutable() },
                    checkRequired("thresholds", thresholds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ThresholdOverride = apply {
            if (validated) {
                return@apply
            }

            groupValues()
            thresholds().forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (groupValues.asKnown()?.size ?: 0) +
                (thresholds.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThresholdOverride &&
                groupValues == other.groupValues &&
                thresholds == other.thresholds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(groupValues, thresholds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThresholdOverride{groupValues=$groupValues, thresholds=$thresholds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateForSubscriptionParams &&
            subscriptionId == other.subscriptionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertCreateForSubscriptionParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
