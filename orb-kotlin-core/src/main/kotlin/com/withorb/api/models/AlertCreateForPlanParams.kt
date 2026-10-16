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
 * This endpoint is used to create alerts at the plan level. Plan level alerts are automatically
 * propagated to all subscriptions associated with the plan. These alerts are scoped to a specific
 * plan version; if no version is specified, the active plan version is used.
 *
 * Plan level alerts can be of three types: `usage_exceeded`, `cost_exceeded`, or `spend_exceeded`.
 * A `usage_exceeded` alert is scoped to a particular metric and is triggered when the usage of that
 * metric exceeds predefined thresholds during the current billing cycle. A `cost_exceeded` alert is
 * triggered when the total amount due during the current billing cycle surpasses predefined
 * thresholds. `cost_exceeded` alerts do not include burndown of pre-purchase credits. A
 * `spend_exceeded` alert is triggered when the rated spend (the pricing subtotal, before
 * invoice-level adjustments and credits) denominated in the alert's currency exceeds predefined
 * thresholds during the current billing cycle; `price_filters` can scope which prices contribute.
 * Each plan can have one `cost_exceeded` alert and one `usage_exceeded` alert per metric that is a
 * part of the plan.
 */
class AlertCreateForPlanParams
private constructor(
    private val planId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun planId(): String? = planId

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
     * The case sensitive currency or custom pricing unit the alert is denominated in. Required for
     * spend_exceeded alerts and when grouping_keys is set.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): String? = body.currency()

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
     * The plan version to create alerts for. If not specified, the default will be the plan's
     * active plan version.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planVersion(): Long? = body.planVersion()

    /**
     * Filters to scope which prices are included in alert evaluation. Supports filtering by
     * price_id, item_id, or price_type with includes/excludes operators. Only applicable to
     * spend_exceeded alerts and to cost_exceeded alerts with grouping_keys set.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun priceFilters(): List<PriceFilter>? = body.priceFilters()

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

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
     * Returns the raw JSON value of [planVersion].
     *
     * Unlike [planVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planVersion(): JsonField<Long> = body._planVersion()

    /**
     * Returns the raw JSON value of [priceFilters].
     *
     * Unlike [priceFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priceFilters(): JsonField<List<PriceFilter>> = body._priceFilters()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertCreateForPlanParams].
         *
         * The following fields are required:
         * ```kotlin
         * .thresholds()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AlertCreateForPlanParams]. */
    class Builder internal constructor() {

        private var planId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(alertCreateForPlanParams: AlertCreateForPlanParams) = apply {
            planId = alertCreateForPlanParams.planId
            body = alertCreateForPlanParams.body.toBuilder()
            additionalHeaders = alertCreateForPlanParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertCreateForPlanParams.additionalQueryParams.toBuilder()
        }

        fun planId(planId: String?) = apply { this.planId = planId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [thresholds]
         * - [type]
         * - [currency]
         * - [groupingKeys]
         * - [metricId]
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

        /**
         * The case sensitive currency or custom pricing unit the alert is denominated in. Required
         * for spend_exceeded alerts and when grouping_keys is set.
         */
        fun currency(currency: String?) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

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
         * The plan version to create alerts for. If not specified, the default will be the plan's
         * active plan version.
         */
        fun planVersion(planVersion: Long?) = apply { body.planVersion(planVersion) }

        /**
         * Alias for [Builder.planVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun planVersion(planVersion: Long) = planVersion(planVersion as Long?)

        /**
         * Sets [Builder.planVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planVersion] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planVersion(planVersion: JsonField<Long>) = apply { body.planVersion(planVersion) }

        /**
         * Filters to scope which prices are included in alert evaluation. Supports filtering by
         * price_id, item_id, or price_type with includes/excludes operators. Only applicable to
         * spend_exceeded alerts and to cost_exceeded alerts with grouping_keys set.
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
         * Returns an immutable instance of [AlertCreateForPlanParams].
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
        fun build(): AlertCreateForPlanParams =
            AlertCreateForPlanParams(
                planId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> planId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val thresholds: JsonField<List<Threshold>>,
        private val type: JsonField<Type>,
        private val currency: JsonField<String>,
        private val groupingKeys: JsonField<List<String>>,
        private val metricId: JsonField<String>,
        private val planVersion: JsonField<Long>,
        private val priceFilters: JsonField<List<PriceFilter>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("thresholds")
            @ExcludeMissing
            thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping_keys")
            @ExcludeMissing
            groupingKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("metric_id")
            @ExcludeMissing
            metricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_version")
            @ExcludeMissing
            planVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price_filters")
            @ExcludeMissing
            priceFilters: JsonField<List<PriceFilter>> = JsonMissing.of(),
        ) : this(
            thresholds,
            type,
            currency,
            groupingKeys,
            metricId,
            planVersion,
            priceFilters,
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
         * The case sensitive currency or custom pricing unit the alert is denominated in. Required
         * for spend_exceeded alerts and when grouping_keys is set.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

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
         * The plan version to create alerts for. If not specified, the default will be the plan's
         * active plan version.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planVersion(): Long? = planVersion.getNullable("plan_version")

        /**
         * Filters to scope which prices are included in alert evaluation. Supports filtering by
         * price_id, item_id, or price_type with includes/excludes operators. Only applicable to
         * spend_exceeded alerts and to cost_exceeded alerts with grouping_keys set.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceFilters(): List<PriceFilter>? = priceFilters.getNullable("price_filters")

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
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
         * Returns the raw JSON value of [planVersion].
         *
         * Unlike [planVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_version")
        @ExcludeMissing
        fun _planVersion(): JsonField<Long> = planVersion

        /**
         * Returns the raw JSON value of [priceFilters].
         *
         * Unlike [priceFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_filters")
        @ExcludeMissing
        fun _priceFilters(): JsonField<List<PriceFilter>> = priceFilters

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
            private var currency: JsonField<String> = JsonMissing.of()
            private var groupingKeys: JsonField<MutableList<String>>? = null
            private var metricId: JsonField<String> = JsonMissing.of()
            private var planVersion: JsonField<Long> = JsonMissing.of()
            private var priceFilters: JsonField<MutableList<PriceFilter>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                thresholds = body.thresholds.map { it.toMutableList() }
                type = body.type
                currency = body.currency
                groupingKeys = body.groupingKeys.map { it.toMutableList() }
                metricId = body.metricId
                planVersion = body.planVersion
                priceFilters = body.priceFilters.map { it.toMutableList() }
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
             * The case sensitive currency or custom pricing unit the alert is denominated in.
             * Required for spend_exceeded alerts and when grouping_keys is set.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * The plan version to create alerts for. If not specified, the default will be the
             * plan's active plan version.
             */
            fun planVersion(planVersion: Long?) = planVersion(JsonField.ofNullable(planVersion))

            /**
             * Alias for [Builder.planVersion].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planVersion(planVersion: Long) = planVersion(planVersion as Long?)

            /**
             * Sets [Builder.planVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planVersion] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planVersion(planVersion: JsonField<Long>) = apply { this.planVersion = planVersion }

            /**
             * Filters to scope which prices are included in alert evaluation. Supports filtering by
             * price_id, item_id, or price_type with includes/excludes operators. Only applicable to
             * spend_exceeded alerts and to cost_exceeded alerts with grouping_keys set.
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
                    currency,
                    (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    metricId,
                    planVersion,
                    (priceFilters ?: JsonMissing.of()).map { it.toImmutable() },
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
            currency()
            groupingKeys()
            metricId()
            planVersion()
            priceFilters()?.forEach { it.validate() }
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
                (if (currency.asKnown() == null) 0 else 1) +
                (groupingKeys.asKnown()?.size ?: 0) +
                (if (metricId.asKnown() == null) 0 else 1) +
                (if (planVersion.asKnown() == null) 0 else 1) +
                (priceFilters.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                thresholds == other.thresholds &&
                type == other.type &&
                currency == other.currency &&
                groupingKeys == other.groupingKeys &&
                metricId == other.metricId &&
                planVersion == other.planVersion &&
                priceFilters == other.priceFilters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                thresholds,
                type,
                currency,
                groupingKeys,
                metricId,
                planVersion,
                priceFilters,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{thresholds=$thresholds, type=$type, currency=$currency, groupingKeys=$groupingKeys, metricId=$metricId, planVersion=$planVersion, priceFilters=$priceFilters, additionalProperties=$additionalProperties}"
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

            val SPEND_EXCEEDED = of("spend_exceeded")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            SPEND_EXCEEDED,
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
            SPEND_EXCEEDED,
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
                SPEND_EXCEEDED -> Value.SPEND_EXCEEDED
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
                SPEND_EXCEEDED -> Known.SPEND_EXCEEDED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateForPlanParams &&
            planId == other.planId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(planId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertCreateForPlanParams{planId=$planId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
