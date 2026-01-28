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

/** Configuration for package pricing */
class PackageConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val packageAmount: JsonField<String>,
    private val packageSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("package_amount")
        @ExcludeMissing
        packageAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("package_size")
        @ExcludeMissing
        packageSize: JsonField<Long> = JsonMissing.of(),
    ) : this(packageAmount, packageSize, mutableMapOf())

    /**
     * A currency amount to rate usage by
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun packageAmount(): String = packageAmount.getRequired("package_amount")

    /**
     * An integer amount to represent package size. For example, 1000 here would divide usage by
     * 1000 before multiplying by package_amount in rating
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun packageSize(): Long = packageSize.getRequired("package_size")

    /**
     * Returns the raw JSON value of [packageAmount].
     *
     * Unlike [packageAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("package_amount")
    @ExcludeMissing
    fun _packageAmount(): JsonField<String> = packageAmount

    /**
     * Returns the raw JSON value of [packageSize].
     *
     * Unlike [packageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("package_size") @ExcludeMissing fun _packageSize(): JsonField<Long> = packageSize

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
         * Returns a mutable builder for constructing an instance of [PackageConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .packageAmount()
         * .packageSize()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PackageConfig]. */
    class Builder internal constructor() {

        private var packageAmount: JsonField<String>? = null
        private var packageSize: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(packageConfig: PackageConfig) = apply {
            packageAmount = packageConfig.packageAmount
            packageSize = packageConfig.packageSize
            additionalProperties = packageConfig.additionalProperties.toMutableMap()
        }

        /** A currency amount to rate usage by */
        fun packageAmount(packageAmount: String) = packageAmount(JsonField.of(packageAmount))

        /**
         * Sets [Builder.packageAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.packageAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun packageAmount(packageAmount: JsonField<String>) = apply {
            this.packageAmount = packageAmount
        }

        /**
         * An integer amount to represent package size. For example, 1000 here would divide usage by
         * 1000 before multiplying by package_amount in rating
         */
        fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

        /**
         * Sets [Builder.packageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.packageSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun packageSize(packageSize: JsonField<Long>) = apply { this.packageSize = packageSize }

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
         * Returns an immutable instance of [PackageConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .packageAmount()
         * .packageSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PackageConfig =
            PackageConfig(
                checkRequired("packageAmount", packageAmount),
                checkRequired("packageSize", packageSize),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PackageConfig = apply {
        if (validated) {
            return@apply
        }

        packageAmount()
        packageSize()
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
        (if (packageAmount.asKnown() == null) 0 else 1) +
            (if (packageSize.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PackageConfig &&
            packageAmount == other.packageAmount &&
            packageSize == other.packageSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(packageAmount, packageSize, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"
}
