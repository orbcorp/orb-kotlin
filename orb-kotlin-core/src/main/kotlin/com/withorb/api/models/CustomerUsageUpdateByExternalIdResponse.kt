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

@JsonDeserialize(builder = CustomerUsageUpdateByExternalIdResponse.Builder::class)
@NoAutoDetect
class CustomerUsageUpdateByExternalIdResponse
private constructor(
    private val duplicate: JsonField<List<String>>,
    private val ingested: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * An array of strings, corresponding to idempotency_key's marked as duplicates (previously
     * ingested)
     */
    fun duplicate(): List<String> = duplicate.getRequired("duplicate")

    /** An array of strings, corresponding to idempotency_key's which were successfully ingested. */
    fun ingested(): List<String> = ingested.getRequired("ingested")

    /**
     * An array of strings, corresponding to idempotency_key's marked as duplicates (previously
     * ingested)
     */
    @JsonProperty("duplicate") @ExcludeMissing fun _duplicate() = duplicate

    /** An array of strings, corresponding to idempotency_key's which were successfully ingested. */
    @JsonProperty("ingested") @ExcludeMissing fun _ingested() = ingested

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerUsageUpdateByExternalIdResponse = apply {
        if (!validated) {
            duplicate()
            ingested()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerUsageUpdateByExternalIdResponse &&
            this.duplicate == other.duplicate &&
            this.ingested == other.ingested &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    duplicate,
                    ingested,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CustomerUsageUpdateByExternalIdResponse{duplicate=$duplicate, ingested=$ingested, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var duplicate: JsonField<List<String>> = JsonMissing.of()
        private var ingested: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerUsageUpdateByExternalIdResponse: CustomerUsageUpdateByExternalIdResponse
        ) = apply {
            this.duplicate = customerUsageUpdateByExternalIdResponse.duplicate
            this.ingested = customerUsageUpdateByExternalIdResponse.ingested
            additionalProperties(customerUsageUpdateByExternalIdResponse.additionalProperties)
        }

        /**
         * An array of strings, corresponding to idempotency_key's marked as duplicates (previously
         * ingested)
         */
        fun duplicate(duplicate: List<String>) = duplicate(JsonField.of(duplicate))

        /**
         * An array of strings, corresponding to idempotency_key's marked as duplicates (previously
         * ingested)
         */
        @JsonProperty("duplicate")
        @ExcludeMissing
        fun duplicate(duplicate: JsonField<List<String>>) = apply { this.duplicate = duplicate }

        /**
         * An array of strings, corresponding to idempotency_key's which were successfully ingested.
         */
        fun ingested(ingested: List<String>) = ingested(JsonField.of(ingested))

        /**
         * An array of strings, corresponding to idempotency_key's which were successfully ingested.
         */
        @JsonProperty("ingested")
        @ExcludeMissing
        fun ingested(ingested: JsonField<List<String>>) = apply { this.ingested = ingested }

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

        fun build(): CustomerUsageUpdateByExternalIdResponse =
            CustomerUsageUpdateByExternalIdResponse(
                duplicate.map { it.toUnmodifiable() },
                ingested.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }
}
