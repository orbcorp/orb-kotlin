// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = EventVolumes.Builder::class)
@NoAutoDetect
class EventVolumes
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventVolumes = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventVolumes: EventVolumes) = apply {
            this.data = eventVolumes.data
            additionalProperties(eventVolumes.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

        fun build(): EventVolumes =
            EventVolumes(data.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
    }

    /**
     * An EventVolume contains the event volume ingested in an hourly window. The timestamp used for
     * the aggregation is the `timestamp` datetime field on events.
     */
    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val timeframeStart: JsonField<OffsetDateTime>,
        private val timeframeEnd: JsonField<OffsetDateTime>,
        private val count: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /** The number of events ingested with a timestamp between the timeframe */
        fun count(): Long = count.getRequired("count")

        @JsonProperty("timeframe_start") @ExcludeMissing fun _timeframeStart() = timeframeStart

        @JsonProperty("timeframe_end") @ExcludeMissing fun _timeframeEnd() = timeframeEnd

        /** The number of events ingested with a timestamp between the timeframe */
        @JsonProperty("count") @ExcludeMissing fun _count() = count

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                timeframeStart()
                timeframeEnd()
                count()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var count: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.timeframeStart = data.timeframeStart
                this.timeframeEnd = data.timeframeEnd
                this.count = data.count
                additionalProperties(data.additionalProperties)
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            @JsonProperty("timeframe_start")
            @ExcludeMissing
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            @JsonProperty("timeframe_end")
            @ExcludeMissing
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The number of events ingested with a timestamp between the timeframe */
            fun count(count: Long) = count(JsonField.of(count))

            /** The number of events ingested with a timestamp between the timeframe */
            @JsonProperty("count")
            @ExcludeMissing
            fun count(count: JsonField<Long>) = apply { this.count = count }

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

            fun build(): Data =
                Data(
                    timeframeStart,
                    timeframeEnd,
                    count,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && this.timeframeStart == other.timeframeStart && this.timeframeEnd == other.timeframeEnd && this.count == other.count && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(timeframeStart, timeframeEnd, count, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Data{timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, count=$count, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventVolumes && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(data, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() = "EventVolumes{data=$data, additionalProperties=$additionalProperties}"
}
