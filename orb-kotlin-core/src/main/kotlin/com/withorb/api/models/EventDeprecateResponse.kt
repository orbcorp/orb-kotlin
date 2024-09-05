// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

@JsonDeserialize(builder = EventDeprecateResponse.Builder::class)
@NoAutoDetect
class EventDeprecateResponse private constructor(private val deprecated: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** event_id of the deprecated event, if successfully updated */
    fun deprecated(): String = deprecated.getRequired("deprecated")

    /** event_id of the deprecated event, if successfully updated */
    @JsonProperty("deprecated")
    @ExcludeMissing
    fun _deprecated() = deprecated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventDeprecateResponse = apply {
        if (!validated) {
          deprecated()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EventDeprecateResponse &&
          this.deprecated == other.deprecated &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(deprecated, additionalProperties)
      }
      return hashCode
    }

    override fun toString() = "EventDeprecateResponse{deprecated=$deprecated, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var deprecated: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventDeprecateResponse: EventDeprecateResponse) = apply {
            this.deprecated = eventDeprecateResponse.deprecated
            additionalProperties(eventDeprecateResponse.additionalProperties)
        }

        /** event_id of the deprecated event, if successfully updated */
        fun deprecated(deprecated: String) = deprecated(JsonField.of(deprecated))

        /** event_id of the deprecated event, if successfully updated */
        @JsonProperty("deprecated")
        @ExcludeMissing
        fun deprecated(deprecated: JsonField<String>) = apply {
            this.deprecated = deprecated
        }

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

        fun build(): EventDeprecateResponse = EventDeprecateResponse(deprecated, additionalProperties.toUnmodifiable())
    }
}
