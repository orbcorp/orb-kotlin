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

@JsonDeserialize(builder = EventUpdateResponse.Builder::class)
@NoAutoDetect
class EventUpdateResponse
private constructor(
    private val amended: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** event_id of the amended event, if successfully ingested */
    fun amended(): String = amended.getRequired("amended")

    /** event_id of the amended event, if successfully ingested */
    @JsonProperty("amended") @ExcludeMissing fun _amended() = amended

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventUpdateResponse = apply {
        if (!validated) {
            amended()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amended: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventUpdateResponse: EventUpdateResponse) = apply {
            this.amended = eventUpdateResponse.amended
            additionalProperties(eventUpdateResponse.additionalProperties)
        }

        /** event_id of the amended event, if successfully ingested */
        fun amended(amended: String) = amended(JsonField.of(amended))

        /** event_id of the amended event, if successfully ingested */
        @JsonProperty("amended")
        @ExcludeMissing
        fun amended(amended: JsonField<String>) = apply { this.amended = amended }

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

        fun build(): EventUpdateResponse =
            EventUpdateResponse(amended, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventUpdateResponse && amended == other.amended && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amended, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventUpdateResponse{amended=$amended, additionalProperties=$additionalProperties}"
}
