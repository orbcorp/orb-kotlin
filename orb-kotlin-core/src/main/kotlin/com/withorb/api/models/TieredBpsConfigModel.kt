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
class TieredBpsConfigModel
@JsonCreator
private constructor(
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers */
    fun tiers(): List<Tier> = tiers.getRequired("tiers")

    /** Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TieredBpsConfigModel = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TieredBpsConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .tiers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TieredBpsConfigModel]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<Tier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tieredBpsConfigModel: TieredBpsConfigModel) = apply {
            tiers = tieredBpsConfigModel.tiers.map { it.toMutableList() }
            additionalProperties = tieredBpsConfigModel.additionalProperties.toMutableMap()
        }

        /** Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /** Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /** Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers */
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

        fun build(): TieredBpsConfigModel =
            TieredBpsConfigModel(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Tier
    @JsonCreator
    private constructor(
        @JsonProperty("bps") @ExcludeMissing private val bps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_unit_maximum")
        @ExcludeMissing
        private val perUnitMaximum: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Per-event basis point rate */
        fun bps(): Double = bps.getRequired("bps")

        /** Inclusive tier starting value */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** Exclusive tier ending value */
        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        /** Per unit maximum to charge */
        fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

        /** Per-event basis point rate */
        @JsonProperty("bps") @ExcludeMissing fun _bps(): JsonField<Double> = bps

        /** Inclusive tier starting value */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /** Exclusive tier ending value */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** Per unit maximum to charge */
        @JsonProperty("per_unit_maximum")
        @ExcludeMissing
        fun _perUnitMaximum(): JsonField<String> = perUnitMaximum

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            bps()
            minimumAmount()
            maximumAmount()
            perUnitMaximum()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Tier].
             *
             * The following fields are required:
             * ```kotlin
             * .bps()
             * .minimumAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var bps: JsonField<Double>? = null
            private var minimumAmount: JsonField<String>? = null
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var perUnitMaximum: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tier: Tier) = apply {
                bps = tier.bps
                minimumAmount = tier.minimumAmount
                maximumAmount = tier.maximumAmount
                perUnitMaximum = tier.perUnitMaximum
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            /** Per-event basis point rate */
            fun bps(bps: Double) = bps(JsonField.of(bps))

            /** Per-event basis point rate */
            fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

            /** Inclusive tier starting value */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Inclusive tier starting value */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** Exclusive tier ending value */
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Exclusive tier ending value */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** Per unit maximum to charge */
            fun perUnitMaximum(perUnitMaximum: String?) =
                perUnitMaximum(JsonField.ofNullable(perUnitMaximum))

            /** Per unit maximum to charge */
            fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                this.perUnitMaximum = perUnitMaximum
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
                    checkRequired("bps", bps),
                    checkRequired("minimumAmount", minimumAmount),
                    maximumAmount,
                    perUnitMaximum,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tier && bps == other.bps && minimumAmount == other.minimumAmount && maximumAmount == other.maximumAmount && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bps, minimumAmount, maximumAmount, perUnitMaximum, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{bps=$bps, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TieredBpsConfigModel && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TieredBpsConfigModel{tiers=$tiers, additionalProperties=$additionalProperties}"
}
