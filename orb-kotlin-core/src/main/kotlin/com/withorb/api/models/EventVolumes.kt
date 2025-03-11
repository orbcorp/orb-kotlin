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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class EventVolumes @JsonCreator private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventVolumes =
        apply {
            if (validated) {
              return@apply
            }

            data().forEach { it.validate() }
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventVolumes].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventVolumes]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventVolumes: EventVolumes) =
            apply {
                data = eventVolumes.data.map { it.toMutableList() }
                additionalProperties = eventVolumes.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) =
            apply {
                this.data = data.map { it.toMutableList() }
            }

        fun addData(data: Data) =
            apply {
                this.data = (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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

        fun build(): EventVolumes =
            EventVolumes(
              checkRequired(
                "data", data
              ).map { it.toImmutable() }, additionalProperties.toImmutable()
            )
    }

    /**
     * An EventVolume contains the event volume ingested in an hourly window. The
     * timestamp used for the aggregation is the `timestamp` datetime field on events.
     */
    @NoAutoDetect
    class Data @JsonCreator private constructor(
        @JsonProperty("count") @ExcludeMissing private val count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("timeframe_end") @ExcludeMissing private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start") @ExcludeMissing private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The number of events ingested with a timestamp between the timeframe */
        fun count(): Long = count.getRequired("count")

        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /** The number of events ingested with a timestamp between the timeframe */
        @JsonProperty("count")
        @ExcludeMissing
        fun _count(): JsonField<Long> = count

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data =
            apply {
                if (validated) {
                  return@apply
                }

                count()
                timeframeEnd()
                timeframeStart()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .count()
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var count: JsonField<Long>? = null
            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) =
                apply {
                    count = data.count
                    timeframeEnd = data.timeframeEnd
                    timeframeStart = data.timeframeStart
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

            /** The number of events ingested with a timestamp between the timeframe */
            fun count(count: Long) = count(JsonField.of(count))

            /** The number of events ingested with a timestamp between the timeframe */
            fun count(count: JsonField<Long>) =
                apply {
                    this.count = count
                }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.timeframeEnd = timeframeEnd
                }

            fun timeframeStart(timeframeStart: OffsetDateTime) = timeframeStart(JsonField.of(timeframeStart))

            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) =
                apply {
                    this.timeframeStart = timeframeStart
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

            fun build(): Data =
                Data(
                  checkRequired(
                    "count", count
                  ),
                  checkRequired(
                    "timeframeEnd", timeframeEnd
                  ),
                  checkRequired(
                    "timeframeStart", timeframeStart
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Data && count == other.count && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(count, timeframeEnd, timeframeStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{count=$count, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EventVolumes && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "EventVolumes{data=$data, additionalProperties=$additionalProperties}"
}
