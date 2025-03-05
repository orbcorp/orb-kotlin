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
class BpsConfigModel
@JsonCreator
private constructor(
    @JsonProperty("bps") @ExcludeMissing private val bps: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("per_unit_maximum")
    @ExcludeMissing
    private val perUnitMaximum: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Basis point take rate per event */
    fun bps(): Double = bps.getRequired("bps")

    /** Optional currency amount maximum to cap spend per event */
    fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

    /** Basis point take rate per event */
    @JsonProperty("bps") @ExcludeMissing fun _bps(): JsonField<Double> = bps

    /** Optional currency amount maximum to cap spend per event */
    @JsonProperty("per_unit_maximum")
    @ExcludeMissing
    fun _perUnitMaximum(): JsonField<String> = perUnitMaximum

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BpsConfigModel = apply {
        if (validated) {
            return@apply
        }

        bps()
        perUnitMaximum()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BpsConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .bps()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BpsConfigModel]. */
    class Builder internal constructor() {

        private var bps: JsonField<Double>? = null
        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bpsConfigModel: BpsConfigModel) = apply {
            bps = bpsConfigModel.bps
            perUnitMaximum = bpsConfigModel.perUnitMaximum
            additionalProperties = bpsConfigModel.additionalProperties.toMutableMap()
        }

        /** Basis point take rate per event */
        fun bps(bps: Double) = bps(JsonField.of(bps))

        /** Basis point take rate per event */
        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

        /** Optional currency amount maximum to cap spend per event */
        fun perUnitMaximum(perUnitMaximum: String?) =
            perUnitMaximum(JsonField.ofNullable(perUnitMaximum))

        /** Optional currency amount maximum to cap spend per event */
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

        fun build(): BpsConfigModel =
            BpsConfigModel(
                checkRequired("bps", bps),
                perUnitMaximum,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BpsConfigModel && bps == other.bps && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bps, perUnitMaximum, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BpsConfigModel{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
}
