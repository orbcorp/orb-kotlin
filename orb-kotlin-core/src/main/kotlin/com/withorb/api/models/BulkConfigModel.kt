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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class BulkConfigModel
@JsonCreator
private constructor(
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Bulk tiers for rating based on total usage volume */
    fun tiers(): List<Tier> = tiers.getRequired("tiers")

    /** Bulk tiers for rating based on total usage volume */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BulkConfigModel = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkConfigModel]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<Tier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkConfigModel: BulkConfigModel) = apply {
            tiers = bulkConfigModel.tiers.map { it.toMutableList() }
            additionalProperties = bulkConfigModel.additionalProperties.toMutableMap()
        }

        /** Bulk tiers for rating based on total usage volume */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Bulk tiers for rating based on total usage volume */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /** Bulk tiers for rating based on total usage volume */
        fun addTier(tier: Tier) = apply {
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

        fun build(): BulkConfigModel =
            BulkConfigModel(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Tier
    @JsonCreator
    private constructor(
        @JsonProperty("unit_amount")
        @ExcludeMissing
        private val unitAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum_units")
        @ExcludeMissing
        private val maximumUnits: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount per unit */
        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

        /** Upper bound for this tier */
        fun maximumUnits(): Double? = maximumUnits.getNullable("maximum_units")

        /** Amount per unit */
        @JsonProperty("unit_amount")
        @ExcludeMissing
        fun _unitAmount(): JsonField<String> = unitAmount

        /** Upper bound for this tier */
        @JsonProperty("maximum_units")
        @ExcludeMissing
        fun _maximumUnits(): JsonField<Double> = maximumUnits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            unitAmount()
            maximumUnits()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Tier].
             *
             * The following fields are required:
             * ```kotlin
             * .unitAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var unitAmount: JsonField<String>? = null
            private var maximumUnits: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tier: Tier) = apply {
                unitAmount = tier.unitAmount
                maximumUnits = tier.maximumUnits
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            /** Amount per unit */
            fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

            /** Amount per unit */
            fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

            /** Upper bound for this tier */
            fun maximumUnits(maximumUnits: Double?) =
                maximumUnits(JsonField.ofNullable(maximumUnits))

            /** Upper bound for this tier */
            fun maximumUnits(maximumUnits: Double) = maximumUnits(maximumUnits as Double?)

            /** Upper bound for this tier */
            fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
                this.maximumUnits = maximumUnits
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

            fun build(): Tier =
                Tier(
                    checkRequired("unitAmount", unitAmount),
                    maximumUnits,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tier && unitAmount == other.unitAmount && maximumUnits == other.maximumUnits && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(unitAmount, maximumUnits, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{unitAmount=$unitAmount, maximumUnits=$maximumUnits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkConfigModel && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkConfigModel{tiers=$tiers, additionalProperties=$additionalProperties}"
}
