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
class TieredConfigModel
@JsonCreator
private constructor(
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Tiers for rating based on total usage quantities into the specified tier */
    fun tiers(): List<Tier> = tiers.getRequired("tiers")

    /** Tiers for rating based on total usage quantities into the specified tier */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TieredConfigModel = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TieredConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TieredConfigModel]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<Tier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tieredConfigModel: TieredConfigModel) = apply {
            tiers = tieredConfigModel.tiers.map { it.toMutableList() }
            additionalProperties = tieredConfigModel.additionalProperties.toMutableMap()
        }

        /** Tiers for rating based on total usage quantities into the specified tier */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Tiers for rating based on total usage quantities into the specified tier */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /** Tiers for rating based on total usage quantities into the specified tier */
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

        fun build(): TieredConfigModel =
            TieredConfigModel(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Tier
    @JsonCreator
    private constructor(
        @JsonProperty("first_unit")
        @ExcludeMissing
        private val firstUnit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit_amount")
        @ExcludeMissing
        private val unitAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_unit")
        @ExcludeMissing
        private val lastUnit: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Inclusive tier starting value */
        fun firstUnit(): Double = firstUnit.getRequired("first_unit")

        /** Amount per unit */
        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

        /** Exclusive tier ending value. If null, this is treated as the last tier */
        fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

        /** Inclusive tier starting value */
        @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit(): JsonField<Double> = firstUnit

        /** Amount per unit */
        @JsonProperty("unit_amount")
        @ExcludeMissing
        fun _unitAmount(): JsonField<String> = unitAmount

        /** Exclusive tier ending value. If null, this is treated as the last tier */
        @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit(): JsonField<Double> = lastUnit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            firstUnit()
            unitAmount()
            lastUnit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Tier].
             *
             * The following fields are required:
             * ```kotlin
             * .firstUnit()
             * .unitAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var firstUnit: JsonField<Double>? = null
            private var unitAmount: JsonField<String>? = null
            private var lastUnit: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tier: Tier) = apply {
                firstUnit = tier.firstUnit
                unitAmount = tier.unitAmount
                lastUnit = tier.lastUnit
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            /** Inclusive tier starting value */
            fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

            /** Inclusive tier starting value */
            fun firstUnit(firstUnit: JsonField<Double>) = apply { this.firstUnit = firstUnit }

            /** Amount per unit */
            fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

            /** Amount per unit */
            fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

            /** Exclusive tier ending value. If null, this is treated as the last tier */
            fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

            /** Exclusive tier ending value. If null, this is treated as the last tier */
            fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

            /** Exclusive tier ending value. If null, this is treated as the last tier */
            fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

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
                    checkRequired("firstUnit", firstUnit),
                    checkRequired("unitAmount", unitAmount),
                    lastUnit,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tier && firstUnit == other.firstUnit && unitAmount == other.unitAmount && lastUnit == other.lastUnit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(firstUnit, unitAmount, lastUnit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{firstUnit=$firstUnit, unitAmount=$unitAmount, lastUnit=$lastUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TieredConfigModel && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TieredConfigModel{tiers=$tiers, additionalProperties=$additionalProperties}"
}
