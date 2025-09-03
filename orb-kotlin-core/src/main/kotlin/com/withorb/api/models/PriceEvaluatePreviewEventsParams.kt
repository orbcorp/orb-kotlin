// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint evaluates prices on preview events instead of actual usage, making it ideal for
 * building price calculators and cost estimation tools. You can filter and group results using
 * [computed properties](/extensibility/advanced-metrics#computed-properties) to analyze pricing
 * across different dimensions.
 *
 * Prices may either reference existing prices in your Orb account or be defined inline in the
 * request body. The endpoint has the following limitations:
 * 1. Up to 100 prices can be evaluated in a single request.
 * 2. Up to 500 preview events can be provided in a single request.
 *
 * A top-level customer_id is required to evaluate the preview events. Additionally, all events
 * without a customer_id will have the top-level customer_id added.
 *
 * Note that this is a POST endpoint rather than a GET endpoint because it employs a JSON body
 * rather than query parameters.
 */
class PriceEvaluatePreviewEventsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The exclusive upper bound for event timestamps
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /**
     * The inclusive lower bound for event timestamps
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /**
     * The ID of the customer to which this evaluation is scoped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerId(): String? = body.customerId()

    /**
     * List of preview events to use instead of actual usage data
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun events(): List<Event>? = body.events()

    /**
     * The external customer ID of the customer to which this evaluation is scoped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /**
     * List of prices to evaluate (max 100)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun priceEvaluations(): List<PriceEvaluation>? = body.priceEvaluations()

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
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _events(): JsonField<List<Event>> = body._events()

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * Returns the raw JSON value of [priceEvaluations].
     *
     * Unlike [priceEvaluations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _priceEvaluations(): JsonField<List<PriceEvaluation>> = body._priceEvaluations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PriceEvaluatePreviewEventsParams].
         *
         * The following fields are required:
         * ```kotlin
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceEvaluatePreviewEventsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceEvaluatePreviewEventsParams: PriceEvaluatePreviewEventsParams) =
            apply {
                body = priceEvaluatePreviewEventsParams.body.toBuilder()
                additionalHeaders = priceEvaluatePreviewEventsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    priceEvaluatePreviewEventsParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [timeframeEnd]
         * - [timeframeStart]
         * - [customerId]
         * - [events]
         * - [externalCustomerId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The exclusive upper bound for event timestamps */
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

        /** The inclusive lower bound for event timestamps */
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

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** List of preview events to use instead of actual usage data */
        fun events(events: List<Event>) = apply { body.events(events) }

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply { body.events(events) }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply { body.addEvent(event) }

        /** The external customer ID of the customer to which this evaluation is scoped. */
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

        /** List of prices to evaluate (max 100) */
        fun priceEvaluations(priceEvaluations: List<PriceEvaluation>) = apply {
            body.priceEvaluations(priceEvaluations)
        }

        /**
         * Sets [Builder.priceEvaluations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceEvaluations] with a well-typed
         * `List<PriceEvaluation>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun priceEvaluations(priceEvaluations: JsonField<List<PriceEvaluation>>) = apply {
            body.priceEvaluations(priceEvaluations)
        }

        /**
         * Adds a single [PriceEvaluation] to [priceEvaluations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceEvaluation(priceEvaluation: PriceEvaluation) = apply {
            body.addPriceEvaluation(priceEvaluation)
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
         * Returns an immutable instance of [PriceEvaluatePreviewEventsParams].
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
        fun build(): PriceEvaluatePreviewEventsParams =
            PriceEvaluatePreviewEventsParams(
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
        private val customerId: JsonField<String>,
        private val events: JsonField<List<Event>>,
        private val externalCustomerId: JsonField<String>,
        private val priceEvaluations: JsonField<List<PriceEvaluation>>,
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
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Event>> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_evaluations")
            @ExcludeMissing
            priceEvaluations: JsonField<List<PriceEvaluation>> = JsonMissing.of(),
        ) : this(
            timeframeEnd,
            timeframeStart,
            customerId,
            events,
            externalCustomerId,
            priceEvaluations,
            mutableMapOf(),
        )

        /**
         * The exclusive upper bound for event timestamps
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * The inclusive lower bound for event timestamps
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * The ID of the customer to which this evaluation is scoped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * List of preview events to use instead of actual usage data
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun events(): List<Event>? = events.getNullable("events")

        /**
         * The external customer ID of the customer to which this evaluation is scoped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * List of prices to evaluate (max 100)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceEvaluations(): List<PriceEvaluation>? =
            priceEvaluations.getNullable("price_evaluations")

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
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

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
         * Returns the raw JSON value of [priceEvaluations].
         *
         * Unlike [priceEvaluations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_evaluations")
        @ExcludeMissing
        fun _priceEvaluations(): JsonField<List<PriceEvaluation>> = priceEvaluations

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
            private var customerId: JsonField<String> = JsonMissing.of()
            private var events: JsonField<MutableList<Event>>? = null
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var priceEvaluations: JsonField<MutableList<PriceEvaluation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                timeframeEnd = body.timeframeEnd
                timeframeStart = body.timeframeStart
                customerId = body.customerId
                events = body.events.map { it.toMutableList() }
                externalCustomerId = body.externalCustomerId
                priceEvaluations = body.priceEvaluations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The exclusive upper bound for event timestamps */
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

            /** The inclusive lower bound for event timestamps */
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

            /** The ID of the customer to which this evaluation is scoped. */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** List of preview events to use instead of actual usage data */
            fun events(events: List<Event>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<Event>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            /** The external customer ID of the customer to which this evaluation is scoped. */
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

            /** List of prices to evaluate (max 100) */
            fun priceEvaluations(priceEvaluations: List<PriceEvaluation>) =
                priceEvaluations(JsonField.of(priceEvaluations))

            /**
             * Sets [Builder.priceEvaluations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceEvaluations] with a well-typed
             * `List<PriceEvaluation>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun priceEvaluations(priceEvaluations: JsonField<List<PriceEvaluation>>) = apply {
                this.priceEvaluations = priceEvaluations.map { it.toMutableList() }
            }

            /**
             * Adds a single [PriceEvaluation] to [priceEvaluations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceEvaluation(priceEvaluation: PriceEvaluation) = apply {
                priceEvaluations =
                    (priceEvaluations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceEvaluations", it).add(priceEvaluation)
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
                    customerId,
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    externalCustomerId,
                    (priceEvaluations ?: JsonMissing.of()).map { it.toImmutable() },
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
            customerId()
            events()?.forEach { it.validate() }
            externalCustomerId()
            priceEvaluations()?.forEach { it.validate() }
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
                (if (customerId.asKnown() == null) 0 else 1) +
                (events.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalCustomerId.asKnown() == null) 0 else 1) +
                (priceEvaluations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                timeframeEnd == other.timeframeEnd &&
                timeframeStart == other.timeframeStart &&
                customerId == other.customerId &&
                events == other.events &&
                externalCustomerId == other.externalCustomerId &&
                priceEvaluations == other.priceEvaluations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                timeframeEnd,
                timeframeStart,
                customerId,
                events,
                externalCustomerId,
                priceEvaluations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, events=$events, externalCustomerId=$externalCustomerId, priceEvaluations=$priceEvaluations, additionalProperties=$additionalProperties}"
    }

    class Event
    private constructor(
        private val eventName: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_name")
            @ExcludeMissing
            eventName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(eventName, properties, timestamp, customerId, externalCustomerId, mutableMapOf())

        /**
         * A name to meaningfully identify the action or event type.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventName(): String = eventName.getRequired("event_name")

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun properties(): Properties = properties.getRequired("properties")

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * The Orb Customer identifier
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * An alias for the Orb customer, whose mapping is specified when creating the customer
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * Returns the raw JSON value of [eventName].
         *
         * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

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
             * Returns a mutable builder for constructing an instance of [Event].
             *
             * The following fields are required:
             * ```kotlin
             * .eventName()
             * .properties()
             * .timestamp()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var eventName: JsonField<String>? = null
            private var properties: JsonField<Properties>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(event: Event) = apply {
                eventName = event.eventName
                properties = event.properties
                timestamp = event.timestamp
                customerId = event.customerId
                externalCustomerId = event.externalCustomerId
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /**
             * Sets [Builder.eventName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            /** The Orb Customer identifier */
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
             * An alias for the Orb customer, whose mapping is specified when creating the customer
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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .eventName()
             * .properties()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Event =
                Event(
                    checkRequired("eventName", eventName),
                    checkRequired("properties", properties),
                    checkRequired("timestamp", timestamp),
                    customerId,
                    externalCustomerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            eventName()
            properties().validate()
            timestamp()
            customerId()
            externalCustomerId()
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
            (if (eventName.asKnown() == null) 0 else 1) +
                (properties.asKnown()?.validity() ?: 0) +
                (if (timestamp.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (externalCustomerId.asKnown() == null) 0 else 1)

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        class Properties
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Properties && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                eventName == other.eventName &&
                properties == other.properties &&
                timestamp == other.timestamp &&
                customerId == other.customerId &&
                externalCustomerId == other.externalCustomerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                eventName,
                properties,
                timestamp,
                customerId,
                externalCustomerId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    class PriceEvaluation
    private constructor(
        private val externalPriceId: JsonField<String>,
        private val filter: JsonField<String>,
        private val groupingKeys: JsonField<List<String>>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping_keys")
            @ExcludeMissing
            groupingKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(externalPriceId, filter, groupingKeys, price, priceId, mutableMapOf())

        /**
         * The external ID of a price to evaluate that exists in your Orb account.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the underlying billable metric
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * Properties (or
         * [computed properties](/extensibility/advanced-metrics#computed-properties)) used to group
         * the underlying billable metric
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupingKeys(): List<String>? = groupingKeys.getNullable("grouping_keys")

        /**
         * An inline price definition to evaluate, allowing you to test price configurations before
         * adding them to Orb.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * The ID of a price to evaluate that exists in your Orb account.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

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
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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

            /** Returns a mutable builder for constructing an instance of [PriceEvaluation]. */
            fun builder() = Builder()
        }

        /** A builder for [PriceEvaluation]. */
        class Builder internal constructor() {

            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var groupingKeys: JsonField<MutableList<String>>? = null
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceEvaluation: PriceEvaluation) = apply {
                externalPriceId = priceEvaluation.externalPriceId
                filter = priceEvaluation.filter
                groupingKeys = priceEvaluation.groupingKeys.map { it.toMutableList() }
                price = priceEvaluation.price
                priceId = priceEvaluation.priceId
                additionalProperties = priceEvaluation.additionalProperties.toMutableMap()
            }

            /** The external ID of a price to evaluate that exists in your Orb account. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * A boolean [computed property](/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
             */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * Properties (or
             * [computed properties](/extensibility/advanced-metrics#computed-properties)) used to
             * group the underlying billable metric
             */
            fun groupingKeys(groupingKeys: List<String>) = groupingKeys(JsonField.of(groupingKeys))

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

            /**
             * An inline price definition to evaluate, allowing you to test price configurations
             * before adding them to Orb.
             */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewFloatingUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewFloatingPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewFloatingMatrixPrice) = price(Price.ofMatrix(matrix))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewFloatingTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewFloatingBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewFloatingTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewFloatingGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewFloatingTieredWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewFloatingUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
             */
            fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
                price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

            /** Alias for calling [price] with `Price.ofMinimum(minimum)`. */
            fun price(minimum: NewFloatingMinimumCompositePrice) = price(Price.ofMinimum(minimum))

            /** The ID of a price to evaluate that exists in your Orb account. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [PriceEvaluation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PriceEvaluation =
                PriceEvaluation(
                    externalPriceId,
                    filter,
                    (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    price,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PriceEvaluation = apply {
            if (validated) {
                return@apply
            }

            externalPriceId()
            filter()
            groupingKeys()
            price()?.validate()
            priceId()
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
            (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (filter.asKnown() == null) 0 else 1) +
                (groupingKeys.asKnown()?.size ?: 0) +
                (price.asKnown()?.validity() ?: 0) +
                (if (priceId.asKnown() == null) 0 else 1)

        /**
         * An inline price definition to evaluate, allowing you to test price configurations before
         * adding them to Orb.
         */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewFloatingUnitPrice? = null,
            private val package_: NewFloatingPackagePrice? = null,
            private val matrix: NewFloatingMatrixPrice? = null,
            private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
            private val tiered: NewFloatingTieredPrice? = null,
            private val bulk: NewFloatingBulkPrice? = null,
            private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewFloatingTieredPackagePrice? = null,
            private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
            private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
            private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
            private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
            private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
            private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
            private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
            private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? =
                null,
            private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
            private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
            private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewFloatingScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewFloatingScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
            private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
            private val minimum: NewFloatingMinimumCompositePrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewFloatingUnitPrice? = unit

            fun package_(): NewFloatingPackagePrice? = package_

            fun matrix(): NewFloatingMatrixPrice? = matrix

            fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

            fun tiered(): NewFloatingTieredPrice? = tiered

            fun bulk(): NewFloatingBulkPrice? = bulk

            fun thresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice? = thresholdTotalAmount

            fun tieredPackage(): NewFloatingTieredPackagePrice? = tieredPackage

            fun groupedTiered(): NewFloatingGroupedTieredPrice? = groupedTiered

            fun maxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice? =
                maxGroupTieredPackage

            fun tieredWithMinimum(): NewFloatingTieredWithMinimumPrice? = tieredWithMinimum

            fun packageWithAllocation(): NewFloatingPackageWithAllocationPrice? =
                packageWithAllocation

            fun tieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun unitWithPercent(): NewFloatingUnitWithPercentPrice? = unitWithPercent

            fun tieredWithProration(): NewFloatingTieredWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewFloatingUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewFloatingGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun groupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice? =
                matrixWithDisplayName

            fun bulkWithProration(): NewFloatingBulkWithProrationPrice? = bulkWithProration

            fun groupedTieredPackage(): NewFloatingGroupedTieredPackagePrice? = groupedTieredPackage

            fun scalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice? =
                scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice? = scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice? =
                cumulativeGroupedBulk

            fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
                groupedWithMinMaxThresholds

            fun minimum(): NewFloatingMinimumCompositePrice? = minimum

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTiered(): Boolean = tiered != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

            fun isMinimum(): Boolean = minimum != null

            fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

            fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

            fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewFloatingTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
                groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

            fun asMinimum(): NewFloatingMinimumCompositePrice = minimum.getOrThrow("minimum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tiered != null -> visitor.visitTiered(tiered)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    groupedWithMinMaxThresholds != null ->
                        visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
                    minimum != null -> visitor.visitMinimum(minimum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewFloatingUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewFloatingPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTiered(tiered: NewFloatingTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitBulk(bulk: NewFloatingBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) {
                            groupedWithMinMaxThresholds.validate()
                        }

                        override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) {
                            minimum.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitUnit(unit: NewFloatingUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewFloatingPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                        override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) = groupedWithMinMaxThresholds.validity()

                        override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) =
                            minimum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    tiered == other.tiered &&
                    bulk == other.bulk &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    groupedTiered == other.groupedTiered &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    packageWithAllocation == other.packageWithAllocation &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    unitWithPercent == other.unitWithPercent &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    bulkWithProration == other.bulkWithProration &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                    minimum == other.minimum
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    package_,
                    matrix,
                    matrixWithAllocation,
                    tiered,
                    bulk,
                    thresholdTotalAmount,
                    tieredPackage,
                    groupedTiered,
                    maxGroupTieredPackage,
                    tieredWithMinimum,
                    packageWithAllocation,
                    tieredPackageWithMinimum,
                    unitWithPercent,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    groupedWithProratedMinimum,
                    groupedWithMeteredMinimum,
                    matrixWithDisplayName,
                    bulkWithProration,
                    groupedTieredPackage,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    groupedWithMinMaxThresholds,
                    minimum,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tiered != null -> "Price{tiered=$tiered}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    groupedWithMinMaxThresholds != null ->
                        "Price{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
                    minimum != null -> "Price{minimum=$minimum}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewFloatingUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewFloatingPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewFloatingMatrixPrice) = Price(matrix = matrix)

                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                fun ofTiered(tiered: NewFloatingTieredPrice) = Price(tiered = tiered)

                fun ofBulk(bulk: NewFloatingBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ) = Price(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

                fun ofMinimum(minimum: NewFloatingMinimumCompositePrice) = Price(minimum = minimum)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewFloatingUnitPrice): T

                fun visitPackage(package_: NewFloatingPackagePrice): T

                fun visitMatrix(matrix: NewFloatingMatrixPrice): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ): T

                fun visitTiered(tiered: NewFloatingTieredPrice): T

                fun visitBulk(bulk: NewFloatingBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

                fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

                fun visitTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ): T

                fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ): T

                fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ): T

                fun visitGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ): T

                fun visitMinimum(minimum: NewFloatingMinimumCompositePrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingScalableMatrixWithUnitPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewFloatingScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_min_max_thresholds" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<GroupedWithMinMaxThresholds>(),
                                )
                                ?.let { Price(groupedWithMinMaxThresholds = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMinimumCompositePrice>(),
                                )
                                ?.let { Price(minimum = it, _json = json) } ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.groupedWithMinMaxThresholds != null ->
                            generator.writeObject(value.groupedWithMinMaxThresholds)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }

            class GroupedWithMinMaxThresholds
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val currency: JsonField<String>,
                private val groupedWithMinMaxThresholdsConfig:
                    JsonField<GroupedWithMinMaxThresholdsConfig>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouped_with_min_max_thresholds_config")
                    @ExcludeMissing
                    groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig> =
                        JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    cadence,
                    currency,
                    groupedWithMinMaxThresholdsConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupedWithMinMaxThresholdsConfig(): GroupedWithMinMaxThresholdsConfig =
                    groupedWithMinMaxThresholdsConfig.getRequired(
                        "grouped_with_min_max_thresholds_config"
                    )

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("grouped_with_min_max_thresholds")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [groupedWithMinMaxThresholdsConfig].
                 *
                 * Unlike [groupedWithMinMaxThresholdsConfig], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("grouped_with_min_max_thresholds_config")
                @ExcludeMissing
                fun _groupedWithMinMaxThresholdsConfig():
                    JsonField<GroupedWithMinMaxThresholdsConfig> = groupedWithMinMaxThresholdsConfig

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of
                     * [GroupedWithMinMaxThresholds].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholds]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var currency: JsonField<String>? = null
                    private var groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig>? =
                        null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue =
                        JsonValue.from("grouped_with_min_max_thresholds")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds) =
                        apply {
                            cadence = groupedWithMinMaxThresholds.cadence
                            currency = groupedWithMinMaxThresholds.currency
                            groupedWithMinMaxThresholdsConfig =
                                groupedWithMinMaxThresholds.groupedWithMinMaxThresholdsConfig
                            itemId = groupedWithMinMaxThresholds.itemId
                            modelType = groupedWithMinMaxThresholds.modelType
                            name = groupedWithMinMaxThresholds.name
                            billableMetricId = groupedWithMinMaxThresholds.billableMetricId
                            billedInAdvance = groupedWithMinMaxThresholds.billedInAdvance
                            billingCycleConfiguration =
                                groupedWithMinMaxThresholds.billingCycleConfiguration
                            conversionRate = groupedWithMinMaxThresholds.conversionRate
                            conversionRateConfig = groupedWithMinMaxThresholds.conversionRateConfig
                            dimensionalPriceConfiguration =
                                groupedWithMinMaxThresholds.dimensionalPriceConfiguration
                            externalPriceId = groupedWithMinMaxThresholds.externalPriceId
                            fixedPriceQuantity = groupedWithMinMaxThresholds.fixedPriceQuantity
                            invoiceGroupingKey = groupedWithMinMaxThresholds.invoiceGroupingKey
                            invoicingCycleConfiguration =
                                groupedWithMinMaxThresholds.invoicingCycleConfiguration
                            metadata = groupedWithMinMaxThresholds.metadata
                            additionalProperties =
                                groupedWithMinMaxThresholds.additionalProperties.toMutableMap()
                        }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) =
                        groupedWithMinMaxThresholdsConfig(
                            JsonField.of(groupedWithMinMaxThresholdsConfig)
                        )

                    /**
                     * Sets [Builder.groupedWithMinMaxThresholdsConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupedWithMinMaxThresholdsConfig] with a
                     * well-typed [GroupedWithMinMaxThresholdsConfig] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig:
                            JsonField<GroupedWithMinMaxThresholdsConfig>
                    ) = apply {
                        this.groupedWithMinMaxThresholdsConfig = groupedWithMinMaxThresholdsConfig
                    }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("grouped_with_min_max_thresholds")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [GroupedWithMinMaxThresholds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupedWithMinMaxThresholds =
                        GroupedWithMinMaxThresholds(
                            checkRequired("cadence", cadence),
                            checkRequired("currency", currency),
                            checkRequired(
                                "groupedWithMinMaxThresholdsConfig",
                                groupedWithMinMaxThresholdsConfig,
                            ),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GroupedWithMinMaxThresholds = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    currency()
                    groupedWithMinMaxThresholdsConfig().validate()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("grouped_with_min_max_thresholds")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (cadence.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (groupedWithMinMaxThresholdsConfig.asKnown()?.validity() ?: 0) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let {
                            if (it == JsonValue.from("grouped_with_min_max_thresholds")) 1 else 0
                        } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class GroupedWithMinMaxThresholdsConfig
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [GroupedWithMinMaxThresholdsConfig].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                        ) = apply {
                            additionalProperties =
                                groupedWithMinMaxThresholdsConfig.additionalProperties
                                    .toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [GroupedWithMinMaxThresholdsConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): GroupedWithMinMaxThresholdsConfig =
                            GroupedWithMinMaxThresholdsConfig(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupedWithMinMaxThresholdsConfig &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "GroupedWithMinMaxThresholdsConfig{additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupedWithMinMaxThresholds &&
                        cadence == other.cadence &&
                        currency == other.currency &&
                        groupedWithMinMaxThresholdsConfig ==
                            other.groupedWithMinMaxThresholdsConfig &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        currency,
                        groupedWithMinMaxThresholdsConfig,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholds{cadence=$cadence, currency=$currency, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriceEvaluation &&
                externalPriceId == other.externalPriceId &&
                filter == other.filter &&
                groupingKeys == other.groupingKeys &&
                price == other.price &&
                priceId == other.priceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                externalPriceId,
                filter,
                groupingKeys,
                price,
                priceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceEvaluation{externalPriceId=$externalPriceId, filter=$filter, groupingKeys=$groupingKeys, price=$price, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PriceEvaluatePreviewEventsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PriceEvaluatePreviewEventsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
