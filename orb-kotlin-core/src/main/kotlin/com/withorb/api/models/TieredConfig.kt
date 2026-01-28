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

/** Configuration for tiered pricing */
class TieredConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val tiers: JsonField<List<Tier>>,
    private val prorated: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
        @JsonProperty("prorated") @ExcludeMissing prorated: JsonField<Boolean> = JsonMissing.of(),
    ) : this(tiers, prorated, mutableMapOf())

    /**
     * Tiers for rating based on total usage quantities into the specified tier
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tiers(): List<Tier> = tiers.getRequired("tiers")

    /**
     * If true, subtotals from this price are prorated based on the service period
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun prorated(): Boolean? = prorated.getNullable("prorated")

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    /**
     * Returns the raw JSON value of [prorated].
     *
     * Unlike [prorated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prorated") @ExcludeMissing fun _prorated(): JsonField<Boolean> = prorated

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
         * Returns a mutable builder for constructing an instance of [TieredConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TieredConfig]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<Tier>>? = null
        private var prorated: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tieredConfig: TieredConfig) = apply {
            tiers = tieredConfig.tiers.map { it.toMutableList() }
            prorated = tieredConfig.prorated
            additionalProperties = tieredConfig.additionalProperties.toMutableMap()
        }

        /** Tiers for rating based on total usage quantities into the specified tier */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tier] to [tiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTier(tier: Tier) = apply {
            tiers =
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
        }

        /** If true, subtotals from this price are prorated based on the service period */
        fun prorated(prorated: Boolean) = prorated(JsonField.of(prorated))

        /**
         * Sets [Builder.prorated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prorated(prorated: JsonField<Boolean>) = apply { this.prorated = prorated }

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
         * Returns an immutable instance of [TieredConfig].
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
        fun build(): TieredConfig =
            TieredConfig(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                prorated,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TieredConfig = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
        prorated()
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
        (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (prorated.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TieredConfig &&
            tiers == other.tiers &&
            prorated == other.prorated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(tiers, prorated, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TieredConfig{tiers=$tiers, prorated=$prorated, additionalProperties=$additionalProperties}"
}
