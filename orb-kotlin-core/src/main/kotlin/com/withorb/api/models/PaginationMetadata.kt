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

@JsonDeserialize(builder = PaginationMetadata.Builder::class)
@NoAutoDetect
class PaginationMetadata
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    fun nextCursor(): String? = nextCursor.getNullable("next_cursor")

    @JsonProperty("has_more") @ExcludeMissing fun _hasMore() = hasMore

    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor() = nextCursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaginationMetadata = apply {
        if (!validated) {
            hasMore()
            nextCursor()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaginationMetadata &&
            this.hasMore == other.hasMore &&
            this.nextCursor == other.nextCursor &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    hasMore,
                    nextCursor,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaginationMetadata{hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var hasMore: JsonField<Boolean> = JsonMissing.of()
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paginationMetadata: PaginationMetadata) = apply {
            this.hasMore = paginationMetadata.hasMore
            this.nextCursor = paginationMetadata.nextCursor
            additionalProperties(paginationMetadata.additionalProperties)
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        @JsonProperty("has_more")
        @ExcludeMissing
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        @JsonProperty("next_cursor")
        @ExcludeMissing
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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

        fun build(): PaginationMetadata =
            PaginationMetadata(
                hasMore,
                nextCursor,
                additionalProperties.toUnmodifiable(),
            )
    }
}
