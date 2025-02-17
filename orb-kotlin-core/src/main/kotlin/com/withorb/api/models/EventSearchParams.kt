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
 * This endpoint returns a filtered set of events for an account in a
 * [paginated list format](/api-reference/pagination).
 *
 * Note that this is a `POST` endpoint rather than a `GET` endpoint because it employs a JSON body
 * for search criteria rather than query parameters, allowing for a more flexible search syntax.
 *
 * Note that a search criteria _must_ be specified. Currently, Orb supports the following criteria:
 * - `event_ids`: This is an explicit array of IDs to filter by. Note that an event's ID is the
 *   `idempotency_key` that was originally used for ingestion.
 *
 * By default, Orb will not throw a `404` if no events matched, Orb will return an empty array for
 * `data` instead.
 */
class EventSearchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * This is an explicit array of IDs to filter by. Note that an event's ID is the idempotency_key
     * that was originally used for ingestion, and this only supports events that have not been
     * amended. Values in this array will be treated case sensitively.
     */
    fun eventIds(): List<String> = body.eventIds()

    /**
     * The end of the timeframe, exclusive, in which to search events. If not specified, the current
     * time is used.
     */
    fun timeframeEnd(): OffsetDateTime? = body.timeframeEnd()

    /**
     * The start of the timeframe, inclusive, in which to search events. If not specified, the one
     * week ago is used.
     */
    fun timeframeStart(): OffsetDateTime? = body.timeframeStart()

    /**
     * This is an explicit array of IDs to filter by. Note that an event's ID is the idempotency_key
     * that was originally used for ingestion, and this only supports events that have not been
     * amended. Values in this array will be treated case sensitively.
     */
    fun _eventIds(): JsonField<List<String>> = body._eventIds()

    /**
     * The end of the timeframe, exclusive, in which to search events. If not specified, the current
     * time is used.
     */
    fun _timeframeEnd(): JsonField<OffsetDateTime> = body._timeframeEnd()

    /**
     * The start of the timeframe, inclusive, in which to search events. If not specified, the one
     * week ago is used.
     */
    fun _timeframeStart(): JsonField<OffsetDateTime> = body._timeframeStart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("event_ids")
        @ExcludeMissing
        private val eventIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun eventIds(): List<String> = eventIds.getRequired("event_ids")

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        fun timeframeEnd(): OffsetDateTime? = timeframeEnd.getNullable("timeframe_end")

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        fun timeframeStart(): OffsetDateTime? = timeframeStart.getNullable("timeframe_start")

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        @JsonProperty("event_ids")
        @ExcludeMissing
        fun _eventIds(): JsonField<List<String>> = eventIds

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            eventIds()
            timeframeEnd()
            timeframeStart()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var eventIds: JsonField<MutableList<String>>? = null
            private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                eventIds = body.eventIds.map { it.toMutableList() }
                timeframeEnd = body.timeframeEnd
                timeframeStart = body.timeframeStart
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * This is an explicit array of IDs to filter by. Note that an event's ID is the
             * idempotency_key that was originally used for ingestion, and this only supports events
             * that have not been amended. Values in this array will be treated case sensitively.
             */
            fun eventIds(eventIds: List<String>) = eventIds(JsonField.of(eventIds))

            /**
             * This is an explicit array of IDs to filter by. Note that an event's ID is the
             * idempotency_key that was originally used for ingestion, and this only supports events
             * that have not been amended. Values in this array will be treated case sensitively.
             */
            fun eventIds(eventIds: JsonField<List<String>>) = apply {
                this.eventIds = eventIds.map { it.toMutableList() }
            }

            /**
             * This is an explicit array of IDs to filter by. Note that an event's ID is the
             * idempotency_key that was originally used for ingestion, and this only supports events
             * that have not been amended. Values in this array will be treated case sensitively.
             */
            fun addEventId(eventId: String) = apply {
                eventIds =
                    (eventIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(eventId)
                    }
            }

            /**
             * The end of the timeframe, exclusive, in which to search events. If not specified, the
             * current time is used.
             */
            fun timeframeEnd(timeframeEnd: OffsetDateTime?) =
                timeframeEnd(JsonField.ofNullable(timeframeEnd))

            /**
             * The end of the timeframe, exclusive, in which to search events. If not specified, the
             * current time is used.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /**
             * The start of the timeframe, inclusive, in which to search events. If not specified,
             * the one week ago is used.
             */
            fun timeframeStart(timeframeStart: OffsetDateTime?) =
                timeframeStart(JsonField.ofNullable(timeframeStart))

            /**
             * The start of the timeframe, inclusive, in which to search events. If not specified,
             * the one week ago is used.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
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

            fun build(): Body =
                Body(
                    checkRequired("eventIds", eventIds).map { it.toImmutable() },
                    timeframeEnd,
                    timeframeStart,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && eventIds == other.eventIds && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventIds, timeframeEnd, timeframeStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{eventIds=$eventIds, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [EventSearchParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(eventSearchParams: EventSearchParams) = apply {
            body = eventSearchParams.body.toBuilder()
            additionalHeaders = eventSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun eventIds(eventIds: List<String>) = apply { body.eventIds(eventIds) }

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun eventIds(eventIds: JsonField<List<String>>) = apply { body.eventIds(eventIds) }

        /**
         * This is an explicit array of IDs to filter by. Note that an event's ID is the
         * idempotency_key that was originally used for ingestion, and this only supports events
         * that have not been amended. Values in this array will be treated case sensitively.
         */
        fun addEventId(eventId: String) = apply { body.addEventId(eventId) }

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) = apply { body.timeframeEnd(timeframeEnd) }

        /**
         * The end of the timeframe, exclusive, in which to search events. If not specified, the
         * current time is used.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            body.timeframeEnd(timeframeEnd)
        }

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        fun timeframeStart(timeframeStart: OffsetDateTime?) = apply {
            body.timeframeStart(timeframeStart)
        }

        /**
         * The start of the timeframe, inclusive, in which to search events. If not specified, the
         * one week ago is used.
         */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            body.timeframeStart(timeframeStart)
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

        fun build(): EventSearchParams =
            EventSearchParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSearchParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventSearchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
