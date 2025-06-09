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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class BulkBpsConfig
private constructor(
    private val tiers: JsonField<List<BulkBpsTier>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tiers")
        @ExcludeMissing
        tiers: JsonField<List<BulkBpsTier>> = JsonMissing.of()
    ) : this(tiers, mutableMapOf())

    /**
     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based on
     * total volume
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tiers(): List<BulkBpsTier> = tiers.getRequired("tiers")

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<BulkBpsTier>> = tiers

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
         * Returns a mutable builder for constructing an instance of [BulkBpsConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkBpsConfig]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<BulkBpsTier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
            tiers = bulkBpsConfig.tiers.map { it.toMutableList() }
            additionalProperties = bulkBpsConfig.additionalProperties.toMutableMap()
        }

        /**
         * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based
         * on total volume
         */
        fun tiers(tiers: List<BulkBpsTier>) = tiers(JsonField.of(tiers))

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<BulkBpsTier>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tiers(tiers: JsonField<List<BulkBpsTier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [BulkBpsTier] to [tiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTier(tier: BulkBpsTier) = apply {
            tiers =
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
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
         * Returns an immutable instance of [BulkBpsConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkBpsConfig =
            BulkBpsConfig(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkBpsConfig = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
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
    internal fun validity(): Int = (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkBpsConfig && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
}
