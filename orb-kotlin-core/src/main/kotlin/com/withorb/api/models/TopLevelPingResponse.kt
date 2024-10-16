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
import java.util.Objects

@JsonDeserialize(builder = TopLevelPingResponse.Builder::class)
@NoAutoDetect
class TopLevelPingResponse
private constructor(
    private val response: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun response(): String = response.getRequired("response")

    @JsonProperty("response") @ExcludeMissing fun _response() = response

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TopLevelPingResponse = apply {
        if (!validated) {
            response()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var response: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(topLevelPingResponse: TopLevelPingResponse) = apply {
            this.response = topLevelPingResponse.response
            additionalProperties(topLevelPingResponse.additionalProperties)
        }

        fun response(response: String) = response(JsonField.of(response))

        @JsonProperty("response")
        @ExcludeMissing
        fun response(response: JsonField<String>) = apply { this.response = response }

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

        fun build(): TopLevelPingResponse =
            TopLevelPingResponse(response, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TopLevelPingResponse && this.response == other.response && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(response, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "TopLevelPingResponse{response=$response, additionalProperties=$additionalProperties}"
}
