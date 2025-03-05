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
class ReplaceSubscriptionAdjustmentParams
@JsonCreator
private constructor(
    @JsonProperty("adjustment")
    @ExcludeMissing
    private val adjustment: JsonField<NewAdjustmentModel> = JsonMissing.of(),
    @JsonProperty("replaces_adjustment_id")
    @ExcludeMissing
    private val replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The definition of a new adjustment to create and add to the subscription. */
    fun adjustment(): NewAdjustmentModel = adjustment.getRequired("adjustment")

    /** The id of the adjustment on the plan to replace in the subscription. */
    fun replacesAdjustmentId(): String = replacesAdjustmentId.getRequired("replaces_adjustment_id")

    /** The definition of a new adjustment to create and add to the subscription. */
    @JsonProperty("adjustment")
    @ExcludeMissing
    fun _adjustment(): JsonField<NewAdjustmentModel> = adjustment

    /** The id of the adjustment on the plan to replace in the subscription. */
    @JsonProperty("replaces_adjustment_id")
    @ExcludeMissing
    fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ReplaceSubscriptionAdjustmentParams = apply {
        if (validated) {
            return@apply
        }

        adjustment().validate()
        replacesAdjustmentId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReplaceSubscriptionAdjustmentParams].
         *
         * The following fields are required:
         * ```kotlin
         * .adjustment()
         * .replacesAdjustmentId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ReplaceSubscriptionAdjustmentParams]. */
    class Builder internal constructor() {

        private var adjustment: JsonField<NewAdjustmentModel>? = null
        private var replacesAdjustmentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            replaceSubscriptionAdjustmentParams: ReplaceSubscriptionAdjustmentParams
        ) = apply {
            adjustment = replaceSubscriptionAdjustmentParams.adjustment
            replacesAdjustmentId = replaceSubscriptionAdjustmentParams.replacesAdjustmentId
            additionalProperties =
                replaceSubscriptionAdjustmentParams.additionalProperties.toMutableMap()
        }

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(adjustment: NewAdjustmentModel) = adjustment(JsonField.of(adjustment))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(adjustment: JsonField<NewAdjustmentModel>) = apply {
            this.adjustment = adjustment
        }

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(percentageDiscount: NewAdjustmentModel.NewPercentageDiscount) =
            adjustment(NewAdjustmentModel.ofPercentageDiscount(percentageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(usageDiscount: NewAdjustmentModel.NewUsageDiscount) =
            adjustment(NewAdjustmentModel.ofUsageDiscount(usageDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(amountDiscount: NewAdjustmentModel.NewAmountDiscount) =
            adjustment(NewAdjustmentModel.ofAmountDiscount(amountDiscount))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(minimum: NewAdjustmentModel.NewMinimum) =
            adjustment(NewAdjustmentModel.ofMinimum(minimum))

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(maximum: NewAdjustmentModel.NewMaximum) =
            adjustment(NewAdjustmentModel.ofMaximum(maximum))

        /** The id of the adjustment on the plan to replace in the subscription. */
        fun replacesAdjustmentId(replacesAdjustmentId: String) =
            replacesAdjustmentId(JsonField.of(replacesAdjustmentId))

        /** The id of the adjustment on the plan to replace in the subscription. */
        fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
            this.replacesAdjustmentId = replacesAdjustmentId
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

        fun build(): ReplaceSubscriptionAdjustmentParams =
            ReplaceSubscriptionAdjustmentParams(
                checkRequired("adjustment", adjustment),
                checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReplaceSubscriptionAdjustmentParams && adjustment == other.adjustment && replacesAdjustmentId == other.replacesAdjustmentId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(adjustment, replacesAdjustmentId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReplaceSubscriptionAdjustmentParams{adjustment=$adjustment, replacesAdjustmentId=$replacesAdjustmentId, additionalProperties=$additionalProperties}"
}
