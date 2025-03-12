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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Creating the backfill enables adding or replacing past events, even those that
 * are older than the ingestion grace period. Performing a backfill in Orb involves
 * 3 steps:
 *
 * 1. Create the backfill, specifying its parameters.
 * 2. [Ingest](ingest) usage events, referencing the backfill (query parameter
 *    `backfill_id`).
 * 3. [Close](close-backfill) the backfill, propagating the update in past usage
 *    throughout Orb.
 *
 * Changes from a backfill are not reflected until the backfill is closed, so you
 * won’t need to worry about your customers seeing partially updated usage data.
 * Backfills are also reversible, so you’ll be able to revert a backfill if you’ve
 * made a mistake.
 *
 * This endpoint will return a backfill object, which contains an `id`. That `id`
 * can then be used as the `backfill_id` query parameter to the event ingestion
 * endpoint to associate ingested events with this backfill. The effects (e.g.
 * updated usage graphs) of this backfill will not take place until the backfill is
 * closed.
 *
 * If the `replace_existing_events` is `true`, existing events in the backfill's
 * timeframe will be replaced with the newly ingested events associated with the
 * backfill. If `false`, newly ingested events will be added to the existing
 * events.
 *
 * If a `customer_id` or `external_customer_id` is specified, the backfill will
 * only affect events for that customer. If neither is specified, the backfill will
 * affect all customers.
 *
 * When `replace_existing_events` is `true`, this indicates that existing events in
 * the timeframe should no longer be counted towards invoiced usage. In this
 * scenario, the parameter `filter` can be optionally added which enables filtering
 * using
 * [computed properties](/extensibility/advanced-metrics#computed-properties). The
 * expressiveness of computed properties allows you to deprecate existing events
 * based on both a period of time and specific property values.
 */
class EventBackfillCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /**
     * The (exclusive) end of the usage timeframe affected by this backfill. By
     * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
     * discuss extending this limit and your use case.
     */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /**
     * The (inclusive) start of the usage timeframe affected by this backfill. By
     * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
     * discuss extending this limit and your use case.
     */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /**
     * The time at which no more events will be accepted for this backfill. The
     * backfill will automatically begin reflecting throughout Orb at the close time.
     * If not specified, it will default to 1 day after the creation of the backfill.
     */
    fun closeTime(): OffsetDateTime? = body.closeTime()

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
     * this field will scope the backfill to all customers.
     */
    fun customerId(): String? = body.customerId()

    /**
     * A boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     */
    fun deprecationFilter(): String? = body.deprecationFilter()

    /**
     * The external customer ID of the customer to which this backfill is scoped.
     * Omitting this field will scope the backfill to all customers.
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /**
     * If true, replaces all existing events in the timeframe with the newly ingested
     * events. If false, adds the newly ingested events to the existing events.
     */
    fun replaceExistingEvents(): Boolean? = body.replaceExistingEvents()

    /**
     * The (exclusive) end of the usage timeframe affected by this backfill. By
     * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
     * discuss extending this limit and your use case.
     */
    fun _timeframeEnd(): JsonField<OffsetDateTime> = body._timeframeEnd()

    /**
     * The (inclusive) start of the usage timeframe affected by this backfill. By
     * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
     * discuss extending this limit and your use case.
     */
    fun _timeframeStart(): JsonField<OffsetDateTime> = body._timeframeStart()

    /**
     * The time at which no more events will be accepted for this backfill. The
     * backfill will automatically begin reflecting throughout Orb at the close time.
     * If not specified, it will default to 1 day after the creation of the backfill.
     */
    fun _closeTime(): JsonField<OffsetDateTime> = body._closeTime()

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
     * this field will scope the backfill to all customers.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * A boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties) used to
     * filter the set of events to deprecate
     */
    fun _deprecationFilter(): JsonField<String> = body._deprecationFilter()

    /**
     * The external customer ID of the customer to which this backfill is scoped.
     * Omitting this field will scope the backfill to all customers.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * If true, replaces all existing events in the timeframe with the newly ingested
     * events. If false, adds the newly ingested events to the existing events.
     */
    fun _replaceExistingEvents(): JsonField<Boolean> = body._replaceExistingEvents()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("timeframe_end") @ExcludeMissing private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start") @ExcludeMissing private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("close_time") @ExcludeMissing private val closeTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id") @ExcludeMissing private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deprecation_filter") @ExcludeMissing private val deprecationFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id") @ExcludeMissing private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replace_existing_events") @ExcludeMissing private val replaceExistingEvents: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        fun closeTime(): OffsetDateTime? = closeTime.getNullable("close_time")

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
         * this field will scope the backfill to all customers.
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * A boolean
         * [computed property](/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(): String? = deprecationFilter.getNullable("deprecation_filter")

        /**
         * The external customer ID of the customer to which this backfill is scoped.
         * Omitting this field will scope the backfill to all customers.
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(): Boolean? = replaceExistingEvents.getNullable("replace_existing_events")

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        @JsonProperty("close_time")
        @ExcludeMissing
        fun _closeTime(): JsonField<OffsetDateTime> = closeTime

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
         * this field will scope the backfill to all customers.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * A boolean
         * [computed property](/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter")
        @ExcludeMissing
        fun _deprecationFilter(): JsonField<String> = deprecationFilter

        /**
         * The external customer ID of the customer to which this backfill is scoped.
         * Omitting this field will scope the backfill to all customers.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        @JsonProperty("replace_existing_events")
        @ExcludeMissing
        fun _replaceExistingEvents(): JsonField<Boolean> = replaceExistingEvents

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
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

            internal fun from(body: Body) =
                apply {
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
             * The (exclusive) end of the usage timeframe affected by this backfill. By
             * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
             * discuss extending this limit and your use case.
             */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

            /**
             * The (exclusive) end of the usage timeframe affected by this backfill. By
             * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
             * discuss extending this limit and your use case.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.timeframeEnd = timeframeEnd
                }

            /**
             * The (inclusive) start of the usage timeframe affected by this backfill. By
             * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
             * discuss extending this limit and your use case.
             */
            fun timeframeStart(timeframeStart: OffsetDateTime) = timeframeStart(JsonField.of(timeframeStart))

            /**
             * The (inclusive) start of the usage timeframe affected by this backfill. By
             * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
             * discuss extending this limit and your use case.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) =
                apply {
                    this.timeframeStart = timeframeStart
                }

            /**
             * The time at which no more events will be accepted for this backfill. The
             * backfill will automatically begin reflecting throughout Orb at the close time.
             * If not specified, it will default to 1 day after the creation of the backfill.
             */
            fun closeTime(closeTime: OffsetDateTime?) = closeTime(JsonField.ofNullable(closeTime))

            /**
             * The time at which no more events will be accepted for this backfill. The
             * backfill will automatically begin reflecting throughout Orb at the close time.
             * If not specified, it will default to 1 day after the creation of the backfill.
             */
            fun closeTime(closeTime: JsonField<OffsetDateTime>) =
                apply {
                    this.closeTime = closeTime
                }

            /**
             * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
             * this field will scope the backfill to all customers.
             */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
             * this field will scope the backfill to all customers.
             */
            fun customerId(customerId: JsonField<String>) =
                apply {
                    this.customerId = customerId
                }

            /**
             * A boolean
             * [computed property](/extensibility/advanced-metrics#computed-properties) used to
             * filter the set of events to deprecate
             */
            fun deprecationFilter(deprecationFilter: String?) = deprecationFilter(JsonField.ofNullable(deprecationFilter))

            /**
             * A boolean
             * [computed property](/extensibility/advanced-metrics#computed-properties) used to
             * filter the set of events to deprecate
             */
            fun deprecationFilter(deprecationFilter: JsonField<String>) =
                apply {
                    this.deprecationFilter = deprecationFilter
                }

            /**
             * The external customer ID of the customer to which this backfill is scoped.
             * Omitting this field will scope the backfill to all customers.
             */
            fun externalCustomerId(externalCustomerId: String?) = externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * The external customer ID of the customer to which this backfill is scoped.
             * Omitting this field will scope the backfill to all customers.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) =
                apply {
                    this.externalCustomerId = externalCustomerId
                }

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            fun replaceExistingEvents(replaceExistingEvents: Boolean) = replaceExistingEvents(JsonField.of(replaceExistingEvents))

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            fun replaceExistingEvents(replaceExistingEvents: JsonField<Boolean>) =
                apply {
                    this.replaceExistingEvents = replaceExistingEvents
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "timeframeEnd", timeframeEnd
                  ),
                  checkRequired(
                    "timeframeStart", timeframeStart
                  ),
                  closeTime,
                  customerId,
                  deprecationFilter,
                  externalCustomerId,
                  replaceExistingEvents,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && closeTime == other.closeTime && customerId == other.customerId && deprecationFilter == other.deprecationFilter && externalCustomerId == other.externalCustomerId && replaceExistingEvents == other.replaceExistingEvents && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeEnd, timeframeStart, closeTime, customerId, deprecationFilter, externalCustomerId, replaceExistingEvents, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventBackfillCreateParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventBackfillCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventBackfillCreateParams: EventBackfillCreateParams) =
            apply {
                body = eventBackfillCreateParams.body.toBuilder()
                additionalHeaders = eventBackfillCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = eventBackfillCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) =
            apply {
                body.timeframeEnd(timeframeEnd)
            }

        /**
         * The (exclusive) end of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) =
            apply {
                body.timeframeEnd(timeframeEnd)
            }

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeStart(timeframeStart: OffsetDateTime) =
            apply {
                body.timeframeStart(timeframeStart)
            }

        /**
         * The (inclusive) start of the usage timeframe affected by this backfill. By
         * default, Orb allows backfills up to 10 days in duration at a time. Reach out to
         * discuss extending this limit and your use case.
         */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) =
            apply {
                body.timeframeStart(timeframeStart)
            }

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: OffsetDateTime?) =
            apply {
                body.closeTime(closeTime)
            }

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: JsonField<OffsetDateTime>) =
            apply {
                body.closeTime(closeTime)
            }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
         * this field will scope the backfill to all customers.
         */
        fun customerId(customerId: String?) =
            apply {
                body.customerId(customerId)
            }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting
         * this field will scope the backfill to all customers.
         */
        fun customerId(customerId: JsonField<String>) =
            apply {
                body.customerId(customerId)
            }

        /**
         * A boolean
         * [computed property](/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String?) =
            apply {
                body.deprecationFilter(deprecationFilter)
            }

        /**
         * A boolean
         * [computed property](/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: JsonField<String>) =
            apply {
                body.deprecationFilter(deprecationFilter)
            }

        /**
         * The external customer ID of the customer to which this backfill is scoped.
         * Omitting this field will scope the backfill to all customers.
         */
        fun externalCustomerId(externalCustomerId: String?) =
            apply {
                body.externalCustomerId(externalCustomerId)
            }

        /**
         * The external customer ID of the customer to which this backfill is scoped.
         * Omitting this field will scope the backfill to all customers.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) =
            apply {
                body.externalCustomerId(externalCustomerId)
            }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) =
            apply {
                body.replaceExistingEvents(replaceExistingEvents)
            }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: JsonField<Boolean>) =
            apply {
                body.replaceExistingEvents(replaceExistingEvents)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): EventBackfillCreateParams =
            EventBackfillCreateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EventBackfillCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "EventBackfillCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
