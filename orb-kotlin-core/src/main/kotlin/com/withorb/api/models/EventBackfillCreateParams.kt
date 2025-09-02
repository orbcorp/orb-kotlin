// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Creating the backfill enables adding or replacing past events, even those that are older than the
 * ingestion grace period. Performing a backfill in Orb involves 3 steps:
 * 1. Create the backfill, specifying its parameters.
 * 2. [Ingest](ingest) usage events, referencing the backfill (query parameter `backfill_id`).
 * 3. [Close](close-backfill) the backfill, propagating the update in past usage throughout Orb.
 *
 * Changes from a backfill are not reflected until the backfill is closed, so you won’t need to
 * worry about your customers seeing partially updated usage data. Backfills are also reversible, so
 * you’ll be able to revert a backfill if you’ve made a mistake.
 *
 * This endpoint will return a backfill object, which contains an `id`. That `id` can then be used
 * as the `backfill_id` query parameter to the event ingestion endpoint to associate ingested events
 * with this backfill. The effects (e.g. updated usage graphs) of this backfill will not take place
 * until the backfill is closed.
 *
 * If the `replace_existing_events` is `true`, existing events in the backfill's timeframe will be
 * replaced with the newly ingested events associated with the backfill. If `false`, newly ingested
 * events will be added to the existing events.
 *
 * If a `customer_id` or `external_customer_id` is specified, the backfill will only affect events
 * for that customer. If neither is specified, the backfill will affect all customers.
 *
 * When `replace_existing_events` is `true`, this indicates that existing events in the timeframe
 * should no longer be counted towards invoiced usage. In this scenario, the parameter
 * `deprecation_filter` can be optionally added which enables filtering using
 * [computed properties](/extensibility/advanced-metrics#computed-properties). The expressiveness of
 * computed properties allows you to deprecate existing events based on both a period of time and
 * specific property values.
 */
class EventBackfillCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The (exclusive) end of the usage timeframe affected by this backfill. By default, Orb allows
     * backfills up to 31 days in duration at a time. Reach out to discuss extending this limit and
     * your use case.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /**
     * The (inclusive) start of the usage timeframe affected by this backfill. By default, Orb
     * allows backfills up to 31 days in duration at a time. Reach out to discuss extending this
     * limit and your use case.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /**
     * The time at which no more events will be accepted for this backfill. The backfill will
     * automatically begin reflecting throughout Orb at the close time. If not specified, it will
     * default to 1 day after the creation of the backfill.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun closeTime(): OffsetDateTime? = body.closeTime()

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this field
     * will scope the backfill to all customers.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerId(): String? = body.customerId()

    /**
     * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun deprecationFilter(): String? = body.deprecationFilter()

    /**
     * The external customer ID of the customer to which this backfill is scoped. Omitting this
     * field will scope the backfill to all customers.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /**
     * If true, replaces all existing events in the timeframe with the newly ingested events. If
     * false, adds the newly ingested events to the existing events.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replaceExistingEvents(): Boolean? = body.replaceExistingEvents()

    /**
     * Returns the raw JSON value of [timeframeEnd].
     *
     * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeframeEnd(): JsonField<OffsetDateTime> = body._timeframeEnd()

    /**
     * Returns the raw JSON value of [timeframeStart].
     *
     * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeframeStart(): JsonField<OffsetDateTime> = body._timeframeStart()

    /**
     * Returns the raw JSON value of [closeTime].
     *
     * Unlike [closeTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _closeTime(): JsonField<OffsetDateTime> = body._closeTime()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [deprecationFilter].
     *
     * Unlike [deprecationFilter], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deprecationFilter(): JsonField<String> = body._deprecationFilter()

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * Returns the raw JSON value of [replaceExistingEvents].
     *
     * Unlike [replaceExistingEvents], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _replaceExistingEvents(): JsonField<Boolean> = body._replaceExistingEvents()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventBackfillCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventBackfillCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventBackfillCreateParams: EventBackfillCreateParams) = apply {
            body = eventBackfillCreateParams.body.toBuilder()
            additionalHeaders = eventBackfillCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventBackfillCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [timeframeEnd]
         * - [timeframeStart]
         * - [closeTime]
         * - [customerId]
         * - [deprecationFilter]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By default, Orb
         * allows backfills up to 31 days in duration at a time. Reach out to discuss extending this
         * limit and your use case.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { body.timeframeEnd(timeframeEnd) }

        /**
         * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            body.timeframeEnd(timeframeEnd)
        }

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By default, Orb
         * allows backfills up to 31 days in duration at a time. Reach out to discuss extending this
         * limit and your use case.
         */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            body.timeframeStart(timeframeStart)
        }

        /**
         * Sets [Builder.timeframeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            body.timeframeStart(timeframeStart)
        }

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: OffsetDateTime?) = apply { body.closeTime(closeTime) }

        /**
         * Sets [Builder.closeTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closeTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply { body.closeTime(closeTime) }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String?) = apply {
            body.deprecationFilter(deprecationFilter)
        }

        /**
         * Sets [Builder.deprecationFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deprecationFilter] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deprecationFilter(deprecationFilter: JsonField<String>) = apply {
            body.deprecationFilter(deprecationFilter)
        }

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
            body.replaceExistingEvents(replaceExistingEvents)
        }

        /**
         * Sets [Builder.replaceExistingEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replaceExistingEvents] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replaceExistingEvents(replaceExistingEvents: JsonField<Boolean>) = apply {
            body.replaceExistingEvents(replaceExistingEvents)
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
         * Returns an immutable instance of [EventBackfillCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventBackfillCreateParams =
            EventBackfillCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val timeframeEnd: JsonField<OffsetDateTime>,
        private val timeframeStart: JsonField<OffsetDateTime>,
        private val closeTime: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val deprecationFilter: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val replaceExistingEvents: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("timeframe_end")
            @ExcludeMissing
            timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("timeframe_start")
            @ExcludeMissing
            timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("close_time")
            @ExcludeMissing
            closeTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deprecation_filter")
            @ExcludeMissing
            deprecationFilter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("replace_existing_events")
            @ExcludeMissing
            replaceExistingEvents: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            timeframeEnd,
            timeframeStart,
            closeTime,
            customerId,
            deprecationFilter,
            externalCustomerId,
            replaceExistingEvents,
            mutableMapOf(),
        )

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By default, Orb
         * allows backfills up to 31 days in duration at a time. Reach out to discuss extending this
         * limit and your use case.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By default, Orb
         * allows backfills up to 31 days in duration at a time. Reach out to discuss extending this
         * limit and your use case.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the set of events to deprecate
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replaceExistingEvents(): Boolean? =
            replaceExistingEvents.getNullable("replace_existing_events")

        /**
         * Returns the raw JSON value of [timeframeEnd].
         *
         * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * Returns the raw JSON value of [timeframeStart].
         *
         * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /**
         * Returns the raw JSON value of [closeTime].
         *
         * Unlike [closeTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("close_time")
        @ExcludeMissing
        fun _closeTime(): JsonField<OffsetDateTime> = closeTime

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [deprecationFilter].
         *
         * Unlike [deprecationFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deprecation_filter")
        @ExcludeMissing
        fun _deprecationFilter(): JsonField<String> = deprecationFilter

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * Returns the raw JSON value of [replaceExistingEvents].
         *
         * Unlike [replaceExistingEvents], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replace_existing_events")
        @ExcludeMissing
        fun _replaceExistingEvents(): JsonField<Boolean> = replaceExistingEvents

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
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var closeTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var deprecationFilter: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var replaceExistingEvents: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                timeframeEnd = body.timeframeEnd
                timeframeStart = body.timeframeStart
                closeTime = body.closeTime
                customerId = body.customerId
                deprecationFilter = body.deprecationFilter
                externalCustomerId = body.externalCustomerId
                replaceExistingEvents = body.replaceExistingEvents
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The (exclusive) end of the usage timeframe affected by this backfill. By default, Orb
             * allows backfills up to 31 days in duration at a time. Reach out to discuss extending
             * this limit and your use case.
             */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            /**
             * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /**
             * The (inclusive) start of the usage timeframe affected by this backfill. By default,
             * Orb allows backfills up to 31 days in duration at a time. Reach out to discuss
             * extending this limit and your use case.
             */
            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            /**
             * Sets [Builder.timeframeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /**
             * The time at which no more events will be accepted for this backfill. The backfill
             * will automatically begin reflecting throughout Orb at the close time. If not
             * specified, it will default to 1 day after the creation of the backfill.
             */
            fun closeTime(closeTime: OffsetDateTime?) = closeTime(JsonField.ofNullable(closeTime))

            /**
             * Sets [Builder.closeTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.closeTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply {
                this.closeTime = closeTime
            }

            /**
             * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
             * field will scope the backfill to all customers.
             */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * A boolean [computed property](/extensibility/advanced-metrics#computed-properties)
             * used to filter the set of events to deprecate
             */
            fun deprecationFilter(deprecationFilter: String?) =
                deprecationFilter(JsonField.ofNullable(deprecationFilter))

            /**
             * Sets [Builder.deprecationFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deprecationFilter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deprecationFilter(deprecationFilter: JsonField<String>) = apply {
                this.deprecationFilter = deprecationFilter
            }

            /**
             * The external customer ID of the customer to which this backfill is scoped. Omitting
             * this field will scope the backfill to all customers.
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            fun replaceExistingEvents(replaceExistingEvents: Boolean) =
                replaceExistingEvents(JsonField.of(replaceExistingEvents))

            /**
             * Sets [Builder.replaceExistingEvents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replaceExistingEvents] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replaceExistingEvents(replaceExistingEvents: JsonField<Boolean>) = apply {
                this.replaceExistingEvents = replaceExistingEvents
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
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    closeTime,
                    customerId,
                    deprecationFilter,
                    externalCustomerId,
                    replaceExistingEvents,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            timeframeEnd()
            timeframeStart()
            closeTime()
            customerId()
            deprecationFilter()
            externalCustomerId()
            replaceExistingEvents()
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
            (if (timeframeEnd.asKnown() == null) 0 else 1) +
                (if (timeframeStart.asKnown() == null) 0 else 1) +
                (if (closeTime.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (deprecationFilter.asKnown() == null) 0 else 1) +
                (if (externalCustomerId.asKnown() == null) 0 else 1) +
                (if (replaceExistingEvents.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                timeframeEnd == other.timeframeEnd &&
                timeframeStart == other.timeframeStart &&
                closeTime == other.closeTime &&
                customerId == other.customerId &&
                deprecationFilter == other.deprecationFilter &&
                externalCustomerId == other.externalCustomerId &&
                replaceExistingEvents == other.replaceExistingEvents &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                timeframeEnd,
                timeframeStart,
                closeTime,
                customerId,
                deprecationFilter,
                externalCustomerId,
                replaceExistingEvents,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventBackfillCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EventBackfillCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
