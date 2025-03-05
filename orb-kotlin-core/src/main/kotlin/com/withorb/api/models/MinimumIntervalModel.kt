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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class MinimumIntervalModel
@JsonCreator
private constructor(
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The price ids that this minimum interval applies to. */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    /** The price interval ids that this minimum interval applies to. */
    fun appliesToPriceIntervalIds(): List<String> =
        appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

    /** The end date of the minimum interval. */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * The minimum amount to charge in a given billing period for the price intervals this minimum
     * applies to.
     */
    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

    /** The start date of the minimum interval. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /** The price ids that this minimum interval applies to. */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    /** The price interval ids that this minimum interval applies to. */
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

    /** The end date of the minimum interval. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * The minimum amount to charge in a given billing period for the price intervals this minimum
     * applies to.
     */
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** The start date of the minimum interval. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MinimumIntervalModel = apply {
        if (validated) {
            return@apply
        }

        appliesToPriceIds()
        appliesToPriceIntervalIds()
        endDate()
        minimumAmount()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MinimumIntervalModel].
         *
         * The following fields are required:
         * ```kotlin
         * .appliesToPriceIds()
         * .appliesToPriceIntervalIds()
         * .endDate()
         * .minimumAmount()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MinimumIntervalModel]. */
    class Builder internal constructor() {

        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var minimumAmount: JsonField<String>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(minimumIntervalModel: MinimumIntervalModel) = apply {
            appliesToPriceIds = minimumIntervalModel.appliesToPriceIds.map { it.toMutableList() }
            appliesToPriceIntervalIds =
                minimumIntervalModel.appliesToPriceIntervalIds.map { it.toMutableList() }
            endDate = minimumIntervalModel.endDate
            minimumAmount = minimumIntervalModel.minimumAmount
            startDate = minimumIntervalModel.startDate
            additionalProperties = minimumIntervalModel.additionalProperties.toMutableMap()
        }

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(appliesToPriceIds: List<String>) =
            appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /** The price ids that this minimum interval applies to. */
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
        }

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
            appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIntervalIds = appliesToPriceIntervalIds.map { it.toMutableList() }
        }

        /** The price interval ids that this minimum interval applies to. */
        fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
            appliesToPriceIntervalIds =
                (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                }
        }

        /** The end date of the minimum interval. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** The end date of the minimum interval. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** The start date of the minimum interval. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the minimum interval. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): MinimumIntervalModel =
            MinimumIntervalModel(
                checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                    it.toImmutable()
                },
                checkRequired("endDate", endDate),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("startDate", startDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MinimumIntervalModel && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && minimumAmount == other.minimumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, endDate, minimumAmount, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MinimumIntervalModel{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, minimumAmount=$minimumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
}
