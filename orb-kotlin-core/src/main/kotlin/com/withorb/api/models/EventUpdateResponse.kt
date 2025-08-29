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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class EventUpdateResponse
private constructor(
    private val amended: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amended") @ExcludeMissing amended: JsonField<String> = JsonMissing.of()
    ) : this(amended, mutableMapOf())

    /**
     * event_id of the amended event, if successfully ingested
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amended(): String = amended.getRequired("amended")

    /**
     * Returns the raw JSON value of [amended].
     *
     * Unlike [amended], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amended") @ExcludeMissing fun _amended(): JsonField<String> = amended

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventUpdateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .amended()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventUpdateResponse]. */
    class Builder internal constructor() {

        private var amended: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventUpdateResponse: EventUpdateResponse) = apply {
            amended = eventUpdateResponse.amended
            additionalProperties = eventUpdateResponse.additionalProperties.toMutableMap()
        }

        /** event_id of the amended event, if successfully ingested */
        fun amended(amended: String) = amended(JsonField.of(amended))

        /**
         * Sets [Builder.amended] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amended] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amended(amended: JsonField<String>) = apply { this.amended = amended }

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

        /**
         * Returns an immutable instance of [EventUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amended()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventUpdateResponse =
            EventUpdateResponse(
                checkRequired("amended", amended),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        amended()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (if (amended.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventUpdateResponse &&
            amended == other.amended &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(amended, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventUpdateResponse{amended=$amended, additionalProperties=$additionalProperties}"
}
