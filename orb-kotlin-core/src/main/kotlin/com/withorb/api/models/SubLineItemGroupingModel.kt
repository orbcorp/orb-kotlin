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

@NoAutoDetect
class SubLineItemGroupingModel
@JsonCreator
private constructor(
    @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun key(): String = key.getRequired("key")

    /** No value indicates the default group */
    fun value(): String? = value.getNullable("value")

    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /** No value indicates the default group */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubLineItemGroupingModel = apply {
        if (validated) {
            return@apply
        }

        key()
        value()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubLineItemGroupingModel].
         *
         * The following fields are required:
         * ```kotlin
         * .key()
         * .value()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubLineItemGroupingModel]. */
    class Builder internal constructor() {

        private var key: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subLineItemGroupingModel: SubLineItemGroupingModel) = apply {
            key = subLineItemGroupingModel.key
            value = subLineItemGroupingModel.value
            additionalProperties = subLineItemGroupingModel.additionalProperties.toMutableMap()
        }

        fun key(key: String) = key(JsonField.of(key))

        fun key(key: JsonField<String>) = apply { this.key = key }

        /** No value indicates the default group */
        fun value(value: String?) = value(JsonField.ofNullable(value))

        /** No value indicates the default group */
        fun value(value: JsonField<String>) = apply { this.value = value }

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

        fun build(): SubLineItemGroupingModel =
            SubLineItemGroupingModel(
                checkRequired("key", key),
                checkRequired("value", value),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubLineItemGroupingModel && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubLineItemGroupingModel{key=$key, value=$value, additionalProperties=$additionalProperties}"
}
