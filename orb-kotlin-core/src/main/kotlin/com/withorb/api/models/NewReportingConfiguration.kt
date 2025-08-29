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

class NewReportingConfiguration
private constructor(
    private val exempt: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exempt") @ExcludeMissing exempt: JsonField<Boolean> = JsonMissing.of()
    ) : this(exempt, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exempt(): Boolean = exempt.getRequired("exempt")

    /**
     * Returns the raw JSON value of [exempt].
     *
     * Unlike [exempt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exempt") @ExcludeMissing fun _exempt(): JsonField<Boolean> = exempt

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
         * Returns a mutable builder for constructing an instance of [NewReportingConfiguration].
         *
         * The following fields are required:
         * ```kotlin
         * .exempt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewReportingConfiguration]. */
    class Builder internal constructor() {

        private var exempt: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newReportingConfiguration: NewReportingConfiguration) = apply {
            exempt = newReportingConfiguration.exempt
            additionalProperties = newReportingConfiguration.additionalProperties.toMutableMap()
        }

        fun exempt(exempt: Boolean) = exempt(JsonField.of(exempt))

        /**
         * Sets [Builder.exempt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exempt] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exempt(exempt: JsonField<Boolean>) = apply { this.exempt = exempt }

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
         * Returns an immutable instance of [NewReportingConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .exempt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewReportingConfiguration =
            NewReportingConfiguration(
                checkRequired("exempt", exempt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewReportingConfiguration = apply {
        if (validated) {
            return@apply
        }

        exempt()
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
    internal fun validity(): Int = (if (exempt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewReportingConfiguration &&
            exempt == other.exempt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(exempt, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewReportingConfiguration{exempt=$exempt, additionalProperties=$additionalProperties}"
}
