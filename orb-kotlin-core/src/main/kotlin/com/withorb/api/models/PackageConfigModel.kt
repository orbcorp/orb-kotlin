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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class PackageConfigModel
@JsonCreator
private constructor(
    @JsonProperty("package_amount")
    @ExcludeMissing
    private val packageAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("package_size")
    @ExcludeMissing
    private val packageSize: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A currency amount to rate usage by */
    fun packageAmount(): String = packageAmount.getRequired("package_amount")

    /**
     * An integer amount to represent package size. For example, 1000 here would divide usage by
     * 1000 before multiplying by package_amount in rating
     */
    fun packageSize(): Long = packageSize.getRequired("package_size")

    /** A currency amount to rate usage by */
    @JsonProperty("package_amount")
    @ExcludeMissing
    fun _packageAmount(): JsonField<String> = packageAmount

    /**
     * An integer amount to represent package size. For example, 1000 here would divide usage by
     * 1000 before multiplying by package_amount in rating
     */
    @JsonProperty("package_size") @ExcludeMissing fun _packageSize(): JsonField<Long> = packageSize

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PackageConfigModel = apply {
        if (validated) {
            return@apply
        }

        packageAmount()
        packageSize()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PackageConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .packageAmount()
         * .packageSize()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PackageConfigModel]. */
    class Builder internal constructor() {

        private var packageAmount: JsonField<String>? = null
        private var packageSize: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(packageConfigModel: PackageConfigModel) = apply {
            packageAmount = packageConfigModel.packageAmount
            packageSize = packageConfigModel.packageSize
            additionalProperties = packageConfigModel.additionalProperties.toMutableMap()
        }

        /** A currency amount to rate usage by */
        fun packageAmount(packageAmount: String) = packageAmount(JsonField.of(packageAmount))

        /** A currency amount to rate usage by */
        fun packageAmount(packageAmount: JsonField<String>) = apply {
            this.packageAmount = packageAmount
        }

        /**
         * An integer amount to represent package size. For example, 1000 here would divide usage by
         * 1000 before multiplying by package_amount in rating
         */
        fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

        /**
         * An integer amount to represent package size. For example, 1000 here would divide usage by
         * 1000 before multiplying by package_amount in rating
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

        fun build(): PackageConfigModel =
            PackageConfigModel(
                checkRequired("packageAmount", packageAmount),
                checkRequired("packageSize", packageSize),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PackageConfigModel && packageAmount == other.packageAmount && packageSize == other.packageSize && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(packageAmount, packageSize, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PackageConfigModel{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"
}
