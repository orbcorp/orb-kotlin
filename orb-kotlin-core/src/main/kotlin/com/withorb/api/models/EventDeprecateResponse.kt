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

class EventDeprecateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deprecated: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deprecated") @ExcludeMissing deprecated: JsonField<String> = JsonMissing.of()
    ) : this(deprecated, mutableMapOf())

    /**
     * event_id of the deprecated event, if successfully updated
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deprecated(): String = deprecated.getRequired("deprecated")

    /**
     * Returns the raw JSON value of [deprecated].
     *
     * Unlike [deprecated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deprecated") @ExcludeMissing fun _deprecated(): JsonField<String> = deprecated

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
         * Returns a mutable builder for constructing an instance of [EventDeprecateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .deprecated()
         * ```
         */
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

        /**
         * Sets [Builder.deprecated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deprecated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [EventDeprecateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .deprecated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventDeprecateResponse =
            EventDeprecateResponse(
                checkRequired("deprecated", deprecated),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventDeprecateResponse = apply {
        if (validated) {
            return@apply
        }

        deprecated()
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
    internal fun validity(): Int = (if (deprecated.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventDeprecateResponse &&
            deprecated == other.deprecated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deprecated, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventDeprecateResponse{deprecated=$deprecated, additionalProperties=$additionalProperties}"
}
