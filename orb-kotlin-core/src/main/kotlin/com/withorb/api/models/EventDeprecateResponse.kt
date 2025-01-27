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
class EventDeprecateResponse
@JsonCreator
private constructor(
    @JsonProperty("deprecated")
    @ExcludeMissing
    private val deprecated: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** event_id of the deprecated event, if successfully updated */
    fun deprecated(): String = deprecated.getRequired("deprecated")

    /** event_id of the deprecated event, if successfully updated */
    @JsonProperty("deprecated") @ExcludeMissing fun _deprecated(): JsonField<String> = deprecated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventDeprecateResponse = apply {
        if (validated) {
            return@apply
        }

        deprecated()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [EventDeprecateResponse]. */
    class Builder internal constructor() {

        private var deprecated: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventDeprecateResponse: EventDeprecateResponse) = apply {
            deprecated = eventDeprecateResponse.deprecated
            additionalProperties = eventDeprecateResponse.additionalProperties.toMutableMap()
        }

        /** event_id of the deprecated event, if successfully updated */
        fun deprecated(deprecated: String) = deprecated(JsonField.of(deprecated))

        /** event_id of the deprecated event, if successfully updated */
        fun deprecated(deprecated: JsonField<String>) = apply { this.deprecated = deprecated }

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

        fun build(): EventDeprecateResponse =
            EventDeprecateResponse(
                checkRequired("deprecated", deprecated),
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventDeprecateResponse && deprecated == other.deprecated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(deprecated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventDeprecateResponse{deprecated=$deprecated, additionalProperties=$additionalProperties}"
}
