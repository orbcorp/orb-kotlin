// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = Discount.Deserializer::class)
@JsonSerialize(using = Discount.Serializer::class)
class Discount
private constructor(
    private val percentage: PercentageDiscount? = null,
    private val trial: TrialDiscount? = null,
    private val usage: UsageDiscount? = null,
    private val amount: AmountDiscount? = null,
    private val tieredPercentage: TieredPercentage? = null,
    private val _json: JsonValue? = null,
) {

    fun percentage(): PercentageDiscount? = percentage

    fun trial(): TrialDiscount? = trial

    fun usage(): UsageDiscount? = usage

    fun amount(): AmountDiscount? = amount

    fun tieredPercentage(): TieredPercentage? = tieredPercentage

    fun isPercentage(): Boolean = percentage != null

    fun isTrial(): Boolean = trial != null

    fun isUsage(): Boolean = usage != null

    fun isAmount(): Boolean = amount != null

    fun isTieredPercentage(): Boolean = tieredPercentage != null

    fun asPercentage(): PercentageDiscount = percentage.getOrThrow("percentage")

    fun asTrial(): TrialDiscount = trial.getOrThrow("trial")

    fun asUsage(): UsageDiscount = usage.getOrThrow("usage")

    fun asAmount(): AmountDiscount = amount.getOrThrow("amount")

    fun asTieredPercentage(): TieredPercentage = tieredPercentage.getOrThrow("tieredPercentage")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.withorb.api.core.JsonValue
     *
     * val result: String? = discount.accept(object : Discount.Visitor<String?> {
     *     override fun visitPercentage(percentage: PercentageDiscount): String? = percentage.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws OrbInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and the
     *   current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            percentage != null -> visitor.visitPercentage(percentage)
            trial != null -> visitor.visitTrial(trial)
            usage != null -> visitor.visitUsage(usage)
            amount != null -> visitor.visitAmount(amount)
            tieredPercentage != null -> visitor.visitTieredPercentage(tieredPercentage)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): Discount = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPercentage(percentage: PercentageDiscount) {
                    percentage.validate()
                }

                override fun visitTrial(trial: TrialDiscount) {
                    trial.validate()
                }

                override fun visitUsage(usage: UsageDiscount) {
                    usage.validate()
                }

                override fun visitAmount(amount: AmountDiscount) {
                    amount.validate()
                }

                override fun visitTieredPercentage(tieredPercentage: TieredPercentage) {
                    tieredPercentage.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitPercentage(percentage: PercentageDiscount) = percentage.validity()

                override fun visitTrial(trial: TrialDiscount) = trial.validity()

                override fun visitUsage(usage: UsageDiscount) = usage.validity()

                override fun visitAmount(amount: AmountDiscount) = amount.validity()

                override fun visitTieredPercentage(tieredPercentage: TieredPercentage) =
                    tieredPercentage.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Discount &&
            percentage == other.percentage &&
            trial == other.trial &&
            usage == other.usage &&
            amount == other.amount &&
            tieredPercentage == other.tieredPercentage
    }

    override fun hashCode(): Int = Objects.hash(percentage, trial, usage, amount, tieredPercentage)

    override fun toString(): String =
        when {
            percentage != null -> "Discount{percentage=$percentage}"
            trial != null -> "Discount{trial=$trial}"
            usage != null -> "Discount{usage=$usage}"
            amount != null -> "Discount{amount=$amount}"
            tieredPercentage != null -> "Discount{tieredPercentage=$tieredPercentage}"
            _json != null -> "Discount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Discount")
        }

    companion object {

        fun ofPercentage(percentage: PercentageDiscount) = Discount(percentage = percentage)

        fun ofTrial(trial: TrialDiscount) = Discount(trial = trial)

        fun ofUsage(usage: UsageDiscount) = Discount(usage = usage)

        fun ofAmount(amount: AmountDiscount) = Discount(amount = amount)

        fun ofTieredPercentage(tieredPercentage: TieredPercentage) =
            Discount(tieredPercentage = tieredPercentage)
    }

    /** An interface that defines how to map each variant of [Discount] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitPercentage(percentage: PercentageDiscount): T

        fun visitTrial(trial: TrialDiscount): T

        fun visitUsage(usage: UsageDiscount): T

        fun visitAmount(amount: AmountDiscount): T

        fun visitTieredPercentage(tieredPercentage: TieredPercentage): T

        /**
         * Maps an unknown variant of [Discount] to a value of type [T].
         *
         * An instance of [Discount] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown Discount: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Discount>(Discount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Discount {
            val json = JsonValue.fromJsonNode(node)
            val discountType = json.asObject()?.get("discount_type")?.asString()

            when (discountType) {
                "percentage" -> {
                    return tryDeserialize(node, jacksonTypeRef<PercentageDiscount>())?.let {
                        Discount(percentage = it, _json = json)
                    } ?: Discount(_json = json)
                }
                "trial" -> {
                    return tryDeserialize(node, jacksonTypeRef<TrialDiscount>())?.let {
                        Discount(trial = it, _json = json)
                    } ?: Discount(_json = json)
                }
                "usage" -> {
                    return tryDeserialize(node, jacksonTypeRef<UsageDiscount>())?.let {
                        Discount(usage = it, _json = json)
                    } ?: Discount(_json = json)
                }
                "amount" -> {
                    return tryDeserialize(node, jacksonTypeRef<AmountDiscount>())?.let {
                        Discount(amount = it, _json = json)
                    } ?: Discount(_json = json)
                }
                "tiered_percentage" -> {
                    return tryDeserialize(node, jacksonTypeRef<TieredPercentage>())?.let {
                        Discount(tieredPercentage = it, _json = json)
                    } ?: Discount(_json = json)
                }
            }

            return Discount(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Discount>(Discount::class) {

        override fun serialize(
            value: Discount,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.percentage != null -> generator.writeObject(value.percentage)
                value.trial != null -> generator.writeObject(value.trial)
                value.usage != null -> generator.writeObject(value.usage)
                value.amount != null -> generator.writeObject(value.amount)
                value.tieredPercentage != null -> generator.writeObject(value.tieredPercentage)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Discount")
            }
        }
    }

    class TieredPercentage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val discountType: JsonValue,
        private val tiers: JsonField<List<Tier>>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val filters: JsonField<List<Filter>>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("discount_type")
            @ExcludeMissing
            discountType: JsonValue = JsonMissing.of(),
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(discountType, tiers, appliesToPriceIds, filters, reason, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("tiered_percentage")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("discount_type") @ExcludeMissing fun _discountType(): JsonValue = discountType

        /**
         * Only available if discount_type is `tiered_percentage`. The ordered, contiguous bands of
         * cumulative eligible spend, each discounted at its own percentage (progressive
         * fill-a-tier).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tiers(): List<Tier> = tiers.getRequired("tiers")

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String>? =
            appliesToPriceIds.getNullable("applies_to_price_ids")

        /**
         * The filters that determine which prices to apply this discount to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filters(): List<Filter>? = filters.getNullable("filters")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
             * Returns a mutable builder for constructing an instance of [TieredPercentage].
             *
             * The following fields are required:
             * ```kotlin
             * .tiers()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TieredPercentage]. */
        class Builder internal constructor() {

            private var discountType: JsonValue = JsonValue.from("tiered_percentage")
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tieredPercentage: TieredPercentage) = apply {
                discountType = tieredPercentage.discountType
                tiers = tieredPercentage.tiers.map { it.toMutableList() }
                appliesToPriceIds = tieredPercentage.appliesToPriceIds.map { it.toMutableList() }
                filters = tieredPercentage.filters.map { it.toMutableList() }
                reason = tieredPercentage.reason
                additionalProperties = tieredPercentage.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("tiered_percentage")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountType(discountType: JsonValue) = apply { this.discountType = discountType }

            /**
             * Only available if discount_type is `tiered_percentage`. The ordered, contiguous bands
             * of cumulative eligible spend, each discounted at its own percentage (progressive
             * fill-a-tier).
             */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
                    }
            }

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts, this
             * can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>?) =
                appliesToPriceIds(JsonField.ofNullable(appliesToPriceIds))

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The filters that determine which prices to apply this discount to. */
            fun filters(filters: List<Filter>?) = filters(JsonField.ofNullable(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [TieredPercentage].
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
            fun build(): TieredPercentage =
                TieredPercentage(
                    discountType,
                    checkRequired("tiers", tiers).map { it.toImmutable() },
                    (appliesToPriceIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TieredPercentage = apply {
            if (validated) {
                return@apply
            }

            _discountType().let {
                if (it != JsonValue.from("tiered_percentage")) {
                    throw OrbInvalidDataException("'discountType' is invalid, received $it")
                }
            }
            tiers().forEach { it.validate() }
            appliesToPriceIds()
            filters()?.forEach { it.validate() }
            reason()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            discountType.let { if (it == JsonValue.from("tiered_percentage")) 1 else 0 } +
                (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (appliesToPriceIds.asKnown()?.size ?: 0) +
                (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (reason.asKnown() == null) 0 else 1)

        /**
         * One band of a tiered percentage discount. Bounds are denominated in the discount's
         * currency. `lower_bound` is the exclusive start of the band and `upper_bound` is the
         * inclusive end; `upper_bound` is null only for the open-ended final tier.
         */
        class Tier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lowerBound: JsonField<Double>,
            private val percentage: JsonField<Double>,
            private val upperBound: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lower_bound")
                @ExcludeMissing
                lowerBound: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("percentage")
                @ExcludeMissing
                percentage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("upper_bound")
                @ExcludeMissing
                upperBound: JsonField<Double> = JsonMissing.of(),
            ) : this(lowerBound, percentage, upperBound, mutableMapOf())

            /**
             * Exclusive lower bound of cumulative spend for this tier.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lowerBound(): Double = lowerBound.getRequired("lower_bound")

            /**
             * The percentage (between 0 and 1) discounted from spend that falls within this tier.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentage(): Double = percentage.getRequired("percentage")

            /**
             * Inclusive upper bound of cumulative spend for this tier; null for the final
             * open-ended tier.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun upperBound(): Double? = upperBound.getNullable("upper_bound")

            /**
             * Returns the raw JSON value of [lowerBound].
             *
             * Unlike [lowerBound], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lower_bound")
            @ExcludeMissing
            fun _lowerBound(): JsonField<Double> = lowerBound

            /**
             * Returns the raw JSON value of [percentage].
             *
             * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("percentage")
            @ExcludeMissing
            fun _percentage(): JsonField<Double> = percentage

            /**
             * Returns the raw JSON value of [upperBound].
             *
             * Unlike [upperBound], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("upper_bound")
            @ExcludeMissing
            fun _upperBound(): JsonField<Double> = upperBound

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
                 * Returns a mutable builder for constructing an instance of [Tier].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .lowerBound()
                 * .percentage()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var lowerBound: JsonField<Double>? = null
                private var percentage: JsonField<Double>? = null
                private var upperBound: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tier: Tier) = apply {
                    lowerBound = tier.lowerBound
                    percentage = tier.percentage
                    upperBound = tier.upperBound
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                /** Exclusive lower bound of cumulative spend for this tier. */
                fun lowerBound(lowerBound: Double) = lowerBound(JsonField.of(lowerBound))

                /**
                 * Sets [Builder.lowerBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lowerBound] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lowerBound(lowerBound: JsonField<Double>) = apply {
                    this.lowerBound = lowerBound
                }

                /**
                 * The percentage (between 0 and 1) discounted from spend that falls within this
                 * tier.
                 */
                fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                /**
                 * Sets [Builder.percentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun percentage(percentage: JsonField<Double>) = apply {
                    this.percentage = percentage
                }

                /**
                 * Inclusive upper bound of cumulative spend for this tier; null for the final
                 * open-ended tier.
                 */
                fun upperBound(upperBound: Double?) = upperBound(JsonField.ofNullable(upperBound))

                /**
                 * Alias for [Builder.upperBound].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun upperBound(upperBound: Double) = upperBound(upperBound as Double?)

                /**
                 * Sets [Builder.upperBound] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.upperBound] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun upperBound(upperBound: JsonField<Double>) = apply {
                    this.upperBound = upperBound
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .lowerBound()
                 * .percentage()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("lowerBound", lowerBound),
                        checkRequired("percentage", percentage),
                        upperBound,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                lowerBound()
                percentage()
                upperBound()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (lowerBound.asKnown() == null) 0 else 1) +
                    (if (percentage.asKnown() == null) 0 else 1) +
                    (if (upperBound.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tier &&
                    lowerBound == other.lowerBound &&
                    percentage == other.percentage &&
                    upperBound == other.upperBound &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(lowerBound, percentage, upperBound, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{lowerBound=$lowerBound, percentage=$percentage, upperBound=$upperBound, additionalProperties=$additionalProperties}"
        }

        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val field: JsonField<Field>,
            private val operator: JsonField<Operator>,
            private val values: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("values")
                @ExcludeMissing
                values: JsonField<List<String>> = JsonMissing.of(),
            ) : this(field, operator, values, mutableMapOf())

            /**
             * The property of the price to filter on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun field(): Field = field.getRequired("field")

            /**
             * Should prices that match the filter be included or excluded.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * The IDs or values that match this filter.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun values(): List<String> = values.getRequired("values")

            /**
             * Returns the raw JSON value of [field].
             *
             * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [values].
             *
             * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var field: JsonField<Field>? = null
                private var operator: JsonField<Operator>? = null
                private var values: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(filter: Filter) = apply {
                    field = filter.field
                    operator = filter.operator
                    values = filter.values.map { it.toMutableList() }
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** The property of the price to filter on. */
                fun field(field: Field) = field(JsonField.of(field))

                /**
                 * Sets [Builder.field] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.field] with a well-typed [Field] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun field(field: JsonField<Field>) = apply { this.field = field }

                /** Should prices that match the filter be included or excluded. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** The IDs or values that match this filter. */
                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun values(values: JsonField<List<String>>) = apply {
                    this.values = values.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [values].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: String) = apply {
                    values =
                        (values ?: JsonField.of(mutableListOf())).also {
                            checkKnown("values", it).add(value)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("field", field),
                        checkRequired("operator", operator),
                        checkRequired("values", values).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                field().validate()
                operator().validate()
                values()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (field.asKnown()?.validity() ?: 0) +
                    (operator.asKnown()?.validity() ?: 0) +
                    (values.asKnown()?.size ?: 0)

            /** The property of the price to filter on. */
            class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PRICE_ID = of("price_id")

                    val ITEM_ID = of("item_id")

                    val PRICE_TYPE = of("price_type")

                    val CURRENCY = of("currency")

                    val PRICING_UNIT_ID = of("pricing_unit_id")

                    fun of(value: String) = Field(JsonField.of(value))
                }

                /** An enum containing [Field]'s known values. */
                enum class Known {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                }

                /**
                 * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Field] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                    /**
                     * An enum member indicating that [Field] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PRICE_ID -> Value.PRICE_ID
                        ITEM_ID -> Value.ITEM_ID
                        PRICE_TYPE -> Value.PRICE_TYPE
                        CURRENCY -> Value.CURRENCY
                        PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PRICE_ID -> Known.PRICE_ID
                        ITEM_ID -> Known.ITEM_ID
                        PRICE_TYPE -> Known.PRICE_TYPE
                        CURRENCY -> Known.CURRENCY
                        PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                        else -> throw OrbInvalidDataException("Unknown Field: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Field = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Field && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Should prices that match the filter be included or excluded. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INCLUDES = of("includes")

                    val EXCLUDES = of("excludes")

                    fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    INCLUDES,
                    EXCLUDES,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCLUDES,
                    EXCLUDES,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INCLUDES -> Value.INCLUDES
                        EXCLUDES -> Value.EXCLUDES
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        INCLUDES -> Known.INCLUDES
                        EXCLUDES -> Known.EXCLUDES
                        else -> throw OrbInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Operator = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    field == other.field &&
                    operator == other.operator &&
                    values == other.values &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(field, operator, values, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TieredPercentage &&
                discountType == other.discountType &&
                tiers == other.tiers &&
                appliesToPriceIds == other.appliesToPriceIds &&
                filters == other.filters &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                discountType,
                tiers,
                appliesToPriceIds,
                filters,
                reason,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TieredPercentage{discountType=$discountType, tiers=$tiers, appliesToPriceIds=$appliesToPriceIds, filters=$filters, reason=$reason, additionalProperties=$additionalProperties}"
    }
}
