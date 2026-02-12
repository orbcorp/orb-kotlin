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

/**
 * The LicenseType resource represents a type of license that can be assigned to users. License
 * types are used during billing by grouping metrics on the configured grouping key.
 */
class LicenseTypeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val groupingKey: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grouping_key")
        @ExcludeMissing
        groupingKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(id, groupingKey, name, mutableMapOf())

    /**
     * The Orb-assigned unique identifier for the license type.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The key used for grouping licenses of this type. This is typically a user identifier field.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupingKey(): String = groupingKey.getRequired("grouping_key")

    /**
     * The name of the license type.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [groupingKey].
     *
     * Unlike [groupingKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grouping_key")
    @ExcludeMissing
    fun _groupingKey(): JsonField<String> = groupingKey

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [LicenseTypeListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .groupingKey()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseTypeListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var groupingKey: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseTypeListResponse: LicenseTypeListResponse) = apply {
            id = licenseTypeListResponse.id
            groupingKey = licenseTypeListResponse.groupingKey
            name = licenseTypeListResponse.name
            additionalProperties = licenseTypeListResponse.additionalProperties.toMutableMap()
        }

        /** The Orb-assigned unique identifier for the license type. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The key used for grouping licenses of this type. This is typically a user identifier
         * field.
         */
        fun groupingKey(groupingKey: String) = groupingKey(JsonField.of(groupingKey))

        /**
         * Sets [Builder.groupingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupingKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupingKey(groupingKey: JsonField<String>) = apply { this.groupingKey = groupingKey }

        /** The name of the license type. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [LicenseTypeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .groupingKey()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseTypeListResponse =
            LicenseTypeListResponse(
                checkRequired("id", id),
                checkRequired("groupingKey", groupingKey),
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseTypeListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        groupingKey()
        name()
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
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (groupingKey.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseTypeListResponse &&
            id == other.id &&
            groupingKey == other.groupingKey &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, groupingKey, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseTypeListResponse{id=$id, groupingKey=$groupingKey, name=$name, additionalProperties=$additionalProperties}"
}
