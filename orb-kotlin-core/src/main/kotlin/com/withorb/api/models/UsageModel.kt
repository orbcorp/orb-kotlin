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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class UsageModel
@JsonCreator
private constructor(
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("timeframe_start")
    @ExcludeMissing
    private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun quantity(): Double = quantity.getRequired("quantity")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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

    fun validate(): UsageModel = apply {
        if (validated) {
            return@apply
        }

        quantity()
        timeframeEnd()
        timeframeStart()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageModel].
         *
         * The following fields are required:
         * ```kotlin
         * .quantity()
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UsageModel]. */
    class Builder internal constructor() {

        private var quantity: JsonField<Double>? = null
        private var timeframeEnd: JsonField<OffsetDateTime>? = null
        private var timeframeStart: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(usageModel: UsageModel) = apply {
            quantity = usageModel.quantity
            timeframeEnd = usageModel.timeframeEnd
            timeframeStart = usageModel.timeframeStart
            additionalProperties = usageModel.additionalProperties.toMutableMap()
        }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

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

        fun build(): UsageModel =
            UsageModel(
                checkRequired("quantity", quantity),
                checkRequired("timeframeEnd", timeframeEnd),
                checkRequired("timeframeStart", timeframeStart),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageModel && quantity == other.quantity && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(quantity, timeframeEnd, timeframeStart, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageModel{quantity=$quantity, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
}
