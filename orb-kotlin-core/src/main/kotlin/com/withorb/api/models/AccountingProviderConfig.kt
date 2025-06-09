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

class AccountingProviderConfig
private constructor(
    private val externalProviderId: JsonField<String>,
    private val providerType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("external_provider_id")
        @ExcludeMissing
        externalProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        providerType: JsonField<String> = JsonMissing.of(),
    ) : this(externalProviderId, providerType, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalProviderId(): String = externalProviderId.getRequired("external_provider_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerType(): String = providerType.getRequired("provider_type")

    /**
     * Returns the raw JSON value of [externalProviderId].
     *
     * Unlike [externalProviderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_provider_id")
    @ExcludeMissing
    fun _externalProviderId(): JsonField<String> = externalProviderId

    /**
     * Returns the raw JSON value of [providerType].
     *
     * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<String> = providerType

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
         * Returns a mutable builder for constructing an instance of [AccountingProviderConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .externalProviderId()
         * .providerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountingProviderConfig]. */
    class Builder internal constructor() {

        private var externalProviderId: JsonField<String>? = null
        private var providerType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountingProviderConfig: AccountingProviderConfig) = apply {
            externalProviderId = accountingProviderConfig.externalProviderId
            providerType = accountingProviderConfig.providerType
            additionalProperties = accountingProviderConfig.additionalProperties.toMutableMap()
        }

        fun externalProviderId(externalProviderId: String) =
            externalProviderId(JsonField.of(externalProviderId))

        /**
         * Sets [Builder.externalProviderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalProviderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalProviderId(externalProviderId: JsonField<String>) = apply {
            this.externalProviderId = externalProviderId
        }

        fun providerType(providerType: String) = providerType(JsonField.of(providerType))

        /**
         * Sets [Builder.providerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerType(providerType: JsonField<String>) = apply {
            this.providerType = providerType
        }

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
         * Returns an immutable instance of [AccountingProviderConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .externalProviderId()
         * .providerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountingProviderConfig =
            AccountingProviderConfig(
                checkRequired("externalProviderId", externalProviderId),
                checkRequired("providerType", providerType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountingProviderConfig = apply {
        if (validated) {
            return@apply
        }

        externalProviderId()
        providerType()
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
        (if (externalProviderId.asKnown() == null) 0 else 1) +
            (if (providerType.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountingProviderConfig && externalProviderId == other.externalProviderId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(externalProviderId, providerType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountingProviderConfig{externalProviderId=$externalProviderId, providerType=$providerType, additionalProperties=$additionalProperties}"
}
