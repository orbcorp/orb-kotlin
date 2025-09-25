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

class Allocation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowsRollover: JsonField<Boolean>,
    private val currency: JsonField<String>,
    private val customExpiration: JsonField<CustomExpiration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allows_rollover")
        @ExcludeMissing
        allowsRollover: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_expiration")
        @ExcludeMissing
        customExpiration: JsonField<CustomExpiration> = JsonMissing.of(),
    ) : this(allowsRollover, currency, customExpiration, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customExpiration(): CustomExpiration? = customExpiration.getNullable("custom_expiration")

    /**
     * Returns the raw JSON value of [allowsRollover].
     *
     * Unlike [allowsRollover], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allows_rollover")
    @ExcludeMissing
    fun _allowsRollover(): JsonField<Boolean> = allowsRollover

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customExpiration].
     *
     * Unlike [customExpiration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_expiration")
    @ExcludeMissing
    fun _customExpiration(): JsonField<CustomExpiration> = customExpiration

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
         * Returns a mutable builder for constructing an instance of [Allocation].
         *
         * The following fields are required:
         * ```kotlin
         * .allowsRollover()
         * .currency()
         * .customExpiration()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Allocation]. */
    class Builder internal constructor() {

        private var allowsRollover: JsonField<Boolean>? = null
        private var currency: JsonField<String>? = null
        private var customExpiration: JsonField<CustomExpiration>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(allocation: Allocation) = apply {
            allowsRollover = allocation.allowsRollover
            currency = allocation.currency
            customExpiration = allocation.customExpiration
            additionalProperties = allocation.additionalProperties.toMutableMap()
        }

        fun allowsRollover(allowsRollover: Boolean) = allowsRollover(JsonField.of(allowsRollover))

        /**
         * Sets [Builder.allowsRollover] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowsRollover] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
            this.allowsRollover = allowsRollover
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customExpiration(customExpiration: CustomExpiration?) =
            customExpiration(JsonField.ofNullable(customExpiration))

        /**
         * Sets [Builder.customExpiration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customExpiration] with a well-typed [CustomExpiration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customExpiration(customExpiration: JsonField<CustomExpiration>) = apply {
            this.customExpiration = customExpiration
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
         * Returns an immutable instance of [Allocation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .allowsRollover()
         * .currency()
         * .customExpiration()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Allocation =
            Allocation(
                checkRequired("allowsRollover", allowsRollover),
                checkRequired("currency", currency),
                checkRequired("customExpiration", customExpiration),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Allocation = apply {
        if (validated) {
            return@apply
        }

        allowsRollover()
        currency()
        customExpiration()?.validate()
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
        (if (allowsRollover.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (customExpiration.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Allocation &&
            allowsRollover == other.allowsRollover &&
            currency == other.currency &&
            customExpiration == other.customExpiration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(allowsRollover, currency, customExpiration, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Allocation{allowsRollover=$allowsRollover, currency=$currency, customExpiration=$customExpiration, additionalProperties=$additionalProperties}"
}
