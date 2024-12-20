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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class EventVolumes
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
            data = eventVolumes.data
            additionalProperties = eventVolumes.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

        fun build(): EventVolumes =
            EventVolumes(data.map { it.toImmutable() }, additionalProperties.toImmutable())
    }

    /**
     * An EventVolume contains the event volume ingested in an hourly window. The timestamp used for
     * the aggregation is the `timestamp` datetime field on events.
     */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("count")
        @ExcludeMissing
        private val count: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                timeframeStart = data.timeframeStart
                timeframeEnd = data.timeframeEnd
                count = data.count
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The number of events ingested with a timestamp between the timeframe */
            fun count(count: Long) = count(JsonField.of(count))

            /** The number of events ingested with a timestamp between the timeframe */
            fun count(count: JsonField<Long>) = apply { this.count = count }

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

            fun build(): Data =
                Data(
                    timeframeStart,
                    timeframeEnd,
                    count,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && timeframeStart == other.timeframeStart && timeframeEnd == other.timeframeEnd && count == other.count && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeStart, timeframeEnd, count, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, count=$count, additionalProperties=$additionalProperties}"
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
