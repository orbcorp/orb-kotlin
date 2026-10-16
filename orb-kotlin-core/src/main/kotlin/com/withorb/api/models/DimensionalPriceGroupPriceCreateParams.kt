// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Create prices in a dimensional price group. Every price shares `item_id`, `cadence`, `currency`,
 * and `model_type`. Tiered prices also share tier boundaries; each row supplies its own amounts.
 * The request is one transaction.
 */
class DimensionalPriceGroupPriceCreateParams
private constructor(
    private val dimensionalPriceGroupId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dimensionalPriceGroupId(): String? = dimensionalPriceGroupId

    /**
     * Billing cadence for every price
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cadence(): Cadence = body.cadence()

    /**
     * An ISO 4217 currency string for every price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The item for every price. Must be the group's billable metric item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemId(): String = body.itemId()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelType(): ModelType = body.modelType()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prices(): List<Price> = body.prices()

    /**
     * Shared tier boundaries. Required for tiered prices and omitted for unit prices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun tiers(): List<Tier>? = body.tiers()

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cadence(): JsonField<Cadence> = body._cadence()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _itemId(): JsonField<String> = body._itemId()

    /**
     * Returns the raw JSON value of [modelType].
     *
     * Unlike [modelType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelType(): JsonField<ModelType> = body._modelType()

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prices(): JsonField<List<Price>> = body._prices()

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tiers(): JsonField<List<Tier>> = body._tiers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupPriceCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .currency()
         * .itemId()
         * .modelType()
         * .prices()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DimensionalPriceGroupPriceCreateParams]. */
    class Builder internal constructor() {

        private var dimensionalPriceGroupId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            dimensionalPriceGroupPriceCreateParams: DimensionalPriceGroupPriceCreateParams
        ) = apply {
            dimensionalPriceGroupId = dimensionalPriceGroupPriceCreateParams.dimensionalPriceGroupId
            body = dimensionalPriceGroupPriceCreateParams.body.toBuilder()
            additionalHeaders = dimensionalPriceGroupPriceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                dimensionalPriceGroupPriceCreateParams.additionalQueryParams.toBuilder()
        }

        fun dimensionalPriceGroupId(dimensionalPriceGroupId: String?) = apply {
            this.dimensionalPriceGroupId = dimensionalPriceGroupId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cadence]
         * - [currency]
         * - [itemId]
         * - [modelType]
         * - [prices]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Billing cadence for every price */
        fun cadence(cadence: Cadence) = apply { body.cadence(cadence) }

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<Cadence>) = apply { body.cadence(cadence) }

        /** An ISO 4217 currency string for every price. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The item for every price. Must be the group's billable metric item. */
        fun itemId(itemId: String) = apply { body.itemId(itemId) }

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { body.itemId(itemId) }

        fun modelType(modelType: ModelType) = apply { body.modelType(modelType) }

        /**
         * Sets [Builder.modelType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelType] with a well-typed [ModelType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelType(modelType: JsonField<ModelType>) = apply { body.modelType(modelType) }

        fun prices(prices: List<Price>) = apply { body.prices(prices) }

        /**
         * Sets [Builder.prices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prices] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prices(prices: JsonField<List<Price>>) = apply { body.prices(prices) }

        /**
         * Adds a single [Price] to [prices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrice(price: Price) = apply { body.addPrice(price) }

        /** Shared tier boundaries. Required for tiered prices and omitted for unit prices. */
        fun tiers(tiers: List<Tier>?) = apply { body.tiers(tiers) }

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tiers(tiers: JsonField<List<Tier>>) = apply { body.tiers(tiers) }

        /**
         * Adds a single [Tier] to [tiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTier(tier: Tier) = apply { body.addTier(tier) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupPriceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .currency()
         * .itemId()
         * .modelType()
         * .prices()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DimensionalPriceGroupPriceCreateParams =
            DimensionalPriceGroupPriceCreateParams(
                dimensionalPriceGroupId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dimensionalPriceGroupId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cadence: JsonField<Cadence>,
        private val currency: JsonField<String>,
        private val itemId: JsonField<String>,
        private val modelType: JsonField<ModelType>,
        private val prices: JsonField<List<Price>>,
        private val tiers: JsonField<List<Tier>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_type")
            @ExcludeMissing
            modelType: JsonField<ModelType> = JsonMissing.of(),
            @JsonProperty("prices")
            @ExcludeMissing
            prices: JsonField<List<Price>> = JsonMissing.of(),
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
        ) : this(cadence, currency, itemId, modelType, prices, tiers, mutableMapOf())

        /**
         * Billing cadence for every price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cadence(): Cadence = cadence.getRequired("cadence")

        /**
         * An ISO 4217 currency string for every price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The item for every price. Must be the group's billable metric item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelType(): ModelType = modelType.getRequired("model_type")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prices(): List<Price> = prices.getRequired("prices")

        /**
         * Shared tier boundaries. Required for tiered prices and omitted for unit prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiers(): List<Tier>? = tiers.getNullable("tiers")

        /**
         * Returns the raw JSON value of [cadence].
         *
         * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [modelType].
         *
         * Unlike [modelType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_type")
        @ExcludeMissing
        fun _modelType(): JsonField<ModelType> = modelType

        /**
         * Returns the raw JSON value of [prices].
         *
         * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .cadence()
             * .currency()
             * .itemId()
             * .modelType()
             * .prices()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cadence: JsonField<Cadence>? = null
            private var currency: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var modelType: JsonField<ModelType>? = null
            private var prices: JsonField<MutableList<Price>>? = null
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                cadence = body.cadence
                currency = body.currency
                itemId = body.itemId
                modelType = body.modelType
                prices = body.prices.map { it.toMutableList() }
                tiers = body.tiers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Billing cadence for every price */
            fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

            /**
             * Sets [Builder.cadence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for every price. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The item for every price. Must be the group's billable metric item. */
            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            /**
             * Sets [Builder.modelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelType] with a well-typed [ModelType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun prices(prices: List<Price>) = prices(JsonField.of(prices))

            /**
             * Sets [Builder.prices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prices] with a well-typed `List<Price>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prices(prices: JsonField<List<Price>>) = apply {
                this.prices = prices.map { it.toMutableList() }
            }

            /**
             * Adds a single [Price] to [prices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPrice(price: Price) = apply {
                prices =
                    (prices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("prices", it).add(price)
                    }
            }

            /** Shared tier boundaries. Required for tiered prices and omitted for unit prices. */
            fun tiers(tiers: List<Tier>?) = tiers(JsonField.ofNullable(tiers))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .cadence()
             * .currency()
             * .itemId()
             * .modelType()
             * .prices()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("cadence", cadence),
                    checkRequired("currency", currency),
                    checkRequired("itemId", itemId),
                    checkRequired("modelType", modelType),
                    checkRequired("prices", prices).map { it.toImmutable() },
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cadence().validate()
            currency()
            itemId()
            modelType().validate()
            prices().forEach { it.validate() }
            tiers()?.forEach { it.validate() }
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
            (cadence.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (itemId.asKnown() == null) 0 else 1) +
                (modelType.asKnown()?.validity() ?: 0) +
                (prices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cadence == other.cadence &&
                currency == other.currency &&
                itemId == other.itemId &&
                modelType == other.modelType &&
                prices == other.prices &&
                tiers == other.tiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cadence, currency, itemId, modelType, prices, tiers, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, prices=$prices, tiers=$tiers, additionalProperties=$additionalProperties}"
    }

    /** Billing cadence for every price */
    class Cadence @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ONE_TIME = of("one_time")

            val MONTHLY = of("monthly")

            val QUARTERLY = of("quarterly")

            val SEMI_ANNUAL = of("semi_annual")

            val ANNUAL = of("annual")

            fun of(value: String) = Cadence(JsonField.of(value))
        }

        /** An enum containing [Cadence]'s known values. */
        enum class Known {
            ONE_TIME,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
        }

        /**
         * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ONE_TIME,
            MONTHLY,
            QUARTERLY,
            SEMI_ANNUAL,
            ANNUAL,
            /** An enum member indicating that [Cadence] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ONE_TIME -> Value.ONE_TIME
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                SEMI_ANNUAL -> Value.SEMI_ANNUAL
                ANNUAL -> Value.ANNUAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                ONE_TIME -> Known.ONE_TIME
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                SEMI_ANNUAL -> Known.SEMI_ANNUAL
                ANNUAL -> Known.ANNUAL
                else -> throw OrbInvalidDataException("Unknown Cadence: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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
        fun validate(): Cadence = apply {
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

            return other is Cadence && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ModelType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val UNIT = of("unit")

            val TIERED = of("tiered")

            fun of(value: String) = ModelType(JsonField.of(value))
        }

        /** An enum containing [ModelType]'s known values. */
        enum class Known {
            UNIT,
            TIERED,
        }

        /**
         * An enum containing [ModelType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModelType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNIT,
            TIERED,
            /**
             * An enum member indicating that [ModelType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                UNIT -> Value.UNIT
                TIERED -> Value.TIERED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                UNIT -> Known.UNIT
                TIERED -> Known.TIERED
                else -> throw OrbInvalidDataException("Unknown ModelType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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
        fun validate(): ModelType = apply {
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

            return other is ModelType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Price
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amounts: JsonField<List<Double>>,
        private val dimensionValues: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amounts")
            @ExcludeMissing
            amounts: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("dimension_values")
            @ExcludeMissing
            dimensionValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(amounts, dimensionValues, name, mutableMapOf())

        /**
         * One amount for a unit price. One amount per tier for a tiered price, in tier order.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amounts(): List<Double> = amounts.getRequired("amounts")

        /**
         * Dimension values, in the group's dimension order.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dimensionValues(): List<String> = dimensionValues.getRequired("dimension_values")

        /**
         * Price name. Defaults to the dimension values.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [amounts].
         *
         * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amounts") @ExcludeMissing fun _amounts(): JsonField<List<Double>> = amounts

        /**
         * Returns the raw JSON value of [dimensionValues].
         *
         * Unlike [dimensionValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimension_values")
        @ExcludeMissing
        fun _dimensionValues(): JsonField<List<String>> = dimensionValues

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Price].
             *
             * The following fields are required:
             * ```kotlin
             * .amounts()
             * .dimensionValues()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Price]. */
        class Builder internal constructor() {

            private var amounts: JsonField<MutableList<Double>>? = null
            private var dimensionValues: JsonField<MutableList<String>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(price: Price) = apply {
                amounts = price.amounts.map { it.toMutableList() }
                dimensionValues = price.dimensionValues.map { it.toMutableList() }
                name = price.name
                additionalProperties = price.additionalProperties.toMutableMap()
            }

            /**
             * One amount for a unit price. One amount per tier for a tiered price, in tier order.
             */
            fun amounts(amounts: List<Double>) = amounts(JsonField.of(amounts))

            /**
             * Sets [Builder.amounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amounts] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amounts(amounts: JsonField<List<Double>>) = apply {
                this.amounts = amounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [amounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAmount(amount: Double) = apply {
                amounts =
                    (amounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("amounts", it).add(amount)
                    }
            }

            /** Dimension values, in the group's dimension order. */
            fun dimensionValues(dimensionValues: List<String>) =
                dimensionValues(JsonField.of(dimensionValues))

            /**
             * Sets [Builder.dimensionValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionValues] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dimensionValues(dimensionValues: JsonField<List<String>>) = apply {
                this.dimensionValues = dimensionValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [dimensionValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDimensionValue(dimensionValue: String) = apply {
                dimensionValues =
                    (dimensionValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dimensionValues", it).add(dimensionValue)
                    }
            }

            /** Price name. Defaults to the dimension values. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Price].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amounts()
             * .dimensionValues()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Price =
                Price(
                    checkRequired("amounts", amounts).map { it.toImmutable() },
                    checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                    name,
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
        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            amounts()
            dimensionValues()
            name()
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
            (amounts.asKnown()?.size ?: 0) +
                (dimensionValues.asKnown()?.size ?: 0) +
                (if (name.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Price &&
                amounts == other.amounts &&
                dimensionValues == other.dimensionValues &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amounts, dimensionValues, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Price{amounts=$amounts, dimensionValues=$dimensionValues, name=$name, additionalProperties=$additionalProperties}"
    }

    class Tier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val firstUnit: JsonField<Double>,
        private val lastUnit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_unit")
            @ExcludeMissing
            firstUnit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("last_unit")
            @ExcludeMissing
            lastUnit: JsonField<Double> = JsonMissing.of(),
        ) : this(firstUnit, lastUnit, mutableMapOf())

        /**
         * Exclusive tier starting value
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstUnit(): Double = firstUnit.getRequired("first_unit")

        /**
         * Inclusive tier ending value. Null on the last tier.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

        /**
         * Returns the raw JSON value of [firstUnit].
         *
         * Unlike [firstUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit(): JsonField<Double> = firstUnit

        /**
         * Returns the raw JSON value of [lastUnit].
         *
         * Unlike [lastUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit(): JsonField<Double> = lastUnit

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
             * .firstUnit()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var firstUnit: JsonField<Double>? = null
            private var lastUnit: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tier: Tier) = apply {
                firstUnit = tier.firstUnit
                lastUnit = tier.lastUnit
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            /** Exclusive tier starting value */
            fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

            /**
             * Sets [Builder.firstUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstUnit] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstUnit(firstUnit: JsonField<Double>) = apply { this.firstUnit = firstUnit }

            /** Inclusive tier ending value. Null on the last tier. */
            fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

            /**
             * Alias for [Builder.lastUnit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

            /**
             * Sets [Builder.lastUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUnit] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Tier].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .firstUnit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Tier =
                Tier(
                    checkRequired("firstUnit", firstUnit),
                    lastUnit,
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
        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            firstUnit()
            lastUnit()
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
            (if (firstUnit.asKnown() == null) 0 else 1) + (if (lastUnit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tier &&
                firstUnit == other.firstUnit &&
                lastUnit == other.lastUnit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(firstUnit, lastUnit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DimensionalPriceGroupPriceCreateParams &&
            dimensionalPriceGroupId == other.dimensionalPriceGroupId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dimensionalPriceGroupId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DimensionalPriceGroupPriceCreateParams{dimensionalPriceGroupId=$dimensionalPriceGroupId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
