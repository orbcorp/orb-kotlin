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
import java.util.Objects

/** Thresholds are used to define the conditions under which an alert will be triggered. */
@NoAutoDetect
class ThresholdModel
@JsonCreator
private constructor(
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The value at which an alert will fire. For credit balance alerts, the alert will fire at or
     * below this value. For usage and cost alerts, the alert will fire at or above this value.
     */
    fun value(): Double = value.getRequired("value")

    /**
     * The value at which an alert will fire. For credit balance alerts, the alert will fire at or
     * below this value. For usage and cost alerts, the alert will fire at or above this value.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ThresholdModel = apply {
        if (validated) {
            return@apply
        }

        value()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThresholdModel].
         *
         * The following fields are required:
         * ```kotlin
         * .value()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ThresholdModel]. */
    class Builder internal constructor() {

        private var value: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(thresholdModel: ThresholdModel) = apply {
            value = thresholdModel.value
            additionalProperties = thresholdModel.additionalProperties.toMutableMap()
        }

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        fun value(value: Double) = value(JsonField.of(value))

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): ThresholdModel =
            ThresholdModel(checkRequired("value", value), additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ThresholdModel && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThresholdModel{value=$value, additionalProperties=$additionalProperties}"
}
