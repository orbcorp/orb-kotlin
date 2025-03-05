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
class UnitConfigModel
@JsonCreator
private constructor(
    @JsonProperty("unit_amount")
    @ExcludeMissing
    private val unitAmount: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Rate per unit of usage */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

    /** Rate per unit of usage */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<String> = unitAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UnitConfigModel = apply {
        if (validated) {
            return@apply
        }

        unitAmount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UnitConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UnitConfigModel]. */
    class Builder internal constructor() {

        private var unitAmount: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(unitConfigModel: UnitConfigModel) = apply {
            unitAmount = unitConfigModel.unitAmount
            additionalProperties = unitConfigModel.additionalProperties.toMutableMap()
        }

        /** Rate per unit of usage */
        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

        /** Rate per unit of usage */
        fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

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

        fun build(): UnitConfigModel =
            UnitConfigModel(
                checkRequired("unitAmount", unitAmount),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UnitConfigModel && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(unitAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UnitConfigModel{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
}
