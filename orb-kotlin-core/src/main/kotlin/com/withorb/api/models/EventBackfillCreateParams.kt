// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class EventBackfillCreateParams constructor(
  private val timeframeEnd: OffsetDateTime,
  private val timeframeStart: OffsetDateTime,
  private val closeTime: OffsetDateTime?,
  private val customerId: String?,
  private val deprecationFilter: String?,
  private val externalCustomerId: String?,
  private val replaceExistingEvents: Boolean?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun timeframeEnd(): OffsetDateTime = timeframeEnd

    fun timeframeStart(): OffsetDateTime = timeframeStart

    fun closeTime(): OffsetDateTime? = closeTime

    fun customerId(): String? = customerId

    fun deprecationFilter(): String? = deprecationFilter

    fun externalCustomerId(): String? = externalCustomerId

    fun replaceExistingEvents(): Boolean? = replaceExistingEvents

    internal fun getBody(): EventBackfillCreateBody {
      return EventBackfillCreateBody(
          timeframeEnd,
          timeframeStart,
          closeTime,
          customerId,
          deprecationFilter,
          externalCustomerId,
          replaceExistingEvents,
          additionalBodyProperties,
      )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EventBackfillCreateBody.Builder::class)
    @NoAutoDetect
    class EventBackfillCreateBody internal constructor(
      private val timeframeEnd: OffsetDateTime?,
      private val timeframeStart: OffsetDateTime?,
      private val closeTime: OffsetDateTime?,
      private val customerId: String?,
      private val deprecationFilter: String?,
      private val externalCustomerId: String?,
      private val replaceExistingEvents: Boolean?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_end")
        fun timeframeEnd(): OffsetDateTime? = timeframeEnd

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_start")
        fun timeframeStart(): OffsetDateTime? = timeframeStart

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        @JsonProperty("close_time")
        fun closeTime(): OffsetDateTime? = closeTime

        /** The ID of the customer to which this backfill is scoped. */
        @JsonProperty("customer_id")
        fun customerId(): String? = customerId

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
         * used to filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter")
        fun deprecationFilter(): String? = deprecationFilter

        /** The external customer ID of the customer to which this backfill is scoped. */
        @JsonProperty("external_customer_id")
        fun externalCustomerId(): String? = externalCustomerId

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        @JsonProperty("replace_existing_events")
        fun replaceExistingEvents(): Boolean? = replaceExistingEvents

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is EventBackfillCreateBody &&
              this.timeframeEnd == other.timeframeEnd &&
              this.timeframeStart == other.timeframeStart &&
              this.closeTime == other.closeTime &&
              this.customerId == other.customerId &&
              this.deprecationFilter == other.deprecationFilter &&
              this.externalCustomerId == other.externalCustomerId &&
              this.replaceExistingEvents == other.replaceExistingEvents &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
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
          return hashCode
        }

        override fun toString() = "EventBackfillCreateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var timeframeEnd: OffsetDateTime? = null
            private var timeframeStart: OffsetDateTime? = null
            private var closeTime: OffsetDateTime? = null
            private var customerId: String? = null
            private var deprecationFilter: String? = null
            private var externalCustomerId: String? = null
            private var replaceExistingEvents: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventBackfillCreateBody: EventBackfillCreateBody) = apply {
                this.timeframeEnd = eventBackfillCreateBody.timeframeEnd
                this.timeframeStart = eventBackfillCreateBody.timeframeStart
                this.closeTime = eventBackfillCreateBody.closeTime
                this.customerId = eventBackfillCreateBody.customerId
                this.deprecationFilter = eventBackfillCreateBody.deprecationFilter
                this.externalCustomerId = eventBackfillCreateBody.externalCustomerId
                this.replaceExistingEvents = eventBackfillCreateBody.replaceExistingEvents
                additionalProperties(eventBackfillCreateBody.additionalProperties)
            }

            /** The (exclusive) end of the usage timeframe affected by this backfill. */
            @JsonProperty("timeframe_end")
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The (inclusive) start of the usage timeframe affected by this backfill. */
            @JsonProperty("timeframe_start")
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            /**
             * The time at which no more events will be accepted for this backfill. The
             * backfill will automatically begin reflecting throughout Orb at the close time.
             * If not specified, it will default to 1 day after the creation of the backfill.
             */
            @JsonProperty("close_time")
            fun closeTime(closeTime: OffsetDateTime) = apply {
                this.closeTime = closeTime
            }

            /** The ID of the customer to which this backfill is scoped. */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply {
                this.customerId = customerId
            }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the set of events to deprecate
             */
            @JsonProperty("deprecation_filter")
            fun deprecationFilter(deprecationFilter: String) = apply {
                this.deprecationFilter = deprecationFilter
            }

            /** The external customer ID of the customer to which this backfill is scoped. */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            @JsonProperty("replace_existing_events")
            fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
                this.replaceExistingEvents = replaceExistingEvents
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EventBackfillCreateBody = EventBackfillCreateBody(
                checkNotNull(timeframeEnd) {
                    "`timeframeEnd` is required but was not set"
                },
                checkNotNull(timeframeStart) {
                    "`timeframeStart` is required but was not set"
                },
                closeTime,
                customerId,
                deprecationFilter,
                externalCustomerId,
                replaceExistingEvents,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EventBackfillCreateParams &&
          this.timeframeEnd == other.timeframeEnd &&
          this.timeframeStart == other.timeframeStart &&
          this.closeTime == other.closeTime &&
          this.customerId == other.customerId &&
          this.deprecationFilter == other.deprecationFilter &&
          this.externalCustomerId == other.externalCustomerId &&
          this.replaceExistingEvents == other.replaceExistingEvents &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          timeframeEnd,
          timeframeStart,
          closeTime,
          customerId,
          deprecationFilter,
          externalCustomerId,
          replaceExistingEvents,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "EventBackfillCreateParams{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var closeTime: OffsetDateTime? = null
        private var customerId: String? = null
        private var deprecationFilter: String? = null
        private var externalCustomerId: String? = null
        private var replaceExistingEvents: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillCreateParams: EventBackfillCreateParams) = apply {
            this.timeframeEnd = eventBackfillCreateParams.timeframeEnd
            this.timeframeStart = eventBackfillCreateParams.timeframeStart
            this.closeTime = eventBackfillCreateParams.closeTime
            this.customerId = eventBackfillCreateParams.customerId
            this.deprecationFilter = eventBackfillCreateParams.deprecationFilter
            this.externalCustomerId = eventBackfillCreateParams.externalCustomerId
            this.replaceExistingEvents = eventBackfillCreateParams.replaceExistingEvents
            additionalQueryParams(eventBackfillCreateParams.additionalQueryParams)
            additionalHeaders(eventBackfillCreateParams.additionalHeaders)
            additionalBodyProperties(eventBackfillCreateParams.additionalBodyProperties)
        }

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
            this.timeframeEnd = timeframeEnd
        }

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * The time at which no more events will be accepted for this backfill. The
         * backfill will automatically begin reflecting throughout Orb at the close time.
         * If not specified, it will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: OffsetDateTime) = apply {
            this.closeTime = closeTime
        }

        /** The ID of the customer to which this backfill is scoped. */
        fun customerId(customerId: String) = apply {
            this.customerId = customerId
        }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
         * used to filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) = apply {
            this.deprecationFilter = deprecationFilter
        }

        /** The external customer ID of the customer to which this backfill is scoped. */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested
         * events. If false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
            this.replaceExistingEvents = replaceExistingEvents
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): EventBackfillCreateParams = EventBackfillCreateParams(
            checkNotNull(timeframeEnd) {
                "`timeframeEnd` is required but was not set"
            },
            checkNotNull(timeframeStart) {
                "`timeframeStart` is required but was not set"
            },
            closeTime,
            customerId,
            deprecationFilter,
            externalCustomerId,
            replaceExistingEvents,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
