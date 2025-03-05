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
class AllocationModel
@JsonCreator
private constructor(
    @JsonProperty("allows_rollover")
    @ExcludeMissing
    private val allowsRollover: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun allowsRollover(): Boolean = allowsRollover.getRequired("allows_rollover")

    fun currency(): String = currency.getRequired("currency")

    @JsonProperty("allows_rollover")
    @ExcludeMissing
    fun _allowsRollover(): JsonField<Boolean> = allowsRollover

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AllocationModel = apply {
        if (validated) {
            return@apply
        }

        allowsRollover()
        currency()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AllocationModel].
         *
         * The following fields are required:
         * ```kotlin
         * .allowsRollover()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AllocationModel]. */
    class Builder internal constructor() {

        private var allowsRollover: JsonField<Boolean>? = null
        private var currency: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(allocationModel: AllocationModel) = apply {
            allowsRollover = allocationModel.allowsRollover
            currency = allocationModel.currency
            additionalProperties = allocationModel.additionalProperties.toMutableMap()
        }

        fun allowsRollover(allowsRollover: Boolean) = allowsRollover(JsonField.of(allowsRollover))

        fun allowsRollover(allowsRollover: JsonField<Boolean>) = apply {
            this.allowsRollover = allowsRollover
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

        fun build(): AllocationModel =
            AllocationModel(
                checkRequired("allowsRollover", allowsRollover),
                checkRequired("currency", currency),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AllocationModel && allowsRollover == other.allowsRollover && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(allowsRollover, currency, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AllocationModel{allowsRollover=$allowsRollover, currency=$currency, additionalProperties=$additionalProperties}"
}
