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
import com.withorb.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = EventDeprecateResponse.Builder::class)
@NoAutoDetect
class EventDeprecateResponse
private constructor(
    private val deprecated: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** event_id of the deprecated event, if successfully updated */
    fun deprecated(): String = deprecated.getRequired("deprecated")

    /** event_id of the deprecated event, if successfully updated */
    @JsonProperty("deprecated") @ExcludeMissing fun _deprecated() = deprecated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventDeprecateResponse = apply {
        if (!validated) {
            deprecated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var deprecated: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventDeprecateResponse: EventDeprecateResponse) = apply {
            deprecated = eventDeprecateResponse.deprecated
            additionalProperties = eventDeprecateResponse.additionalProperties.toMutableMap()
        }

        /** event_id of the deprecated event, if successfully updated */
        fun deprecated(deprecated: String) = deprecated(JsonField.of(deprecated))

        /** event_id of the deprecated event, if successfully updated */
        @JsonProperty("deprecated")
        @ExcludeMissing
        fun deprecated(deprecated: JsonField<String>) = apply { this.deprecated = deprecated }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
            EventDeprecateResponse(deprecated, additionalProperties.toImmutable())
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
