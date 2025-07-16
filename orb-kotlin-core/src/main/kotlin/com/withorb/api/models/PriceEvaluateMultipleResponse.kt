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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class PriceEvaluateMultipleResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of
         * [PriceEvaluateMultipleResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceEvaluateMultipleResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceEvaluateMultipleResponse: PriceEvaluateMultipleResponse) = apply {
            data = priceEvaluateMultipleResponse.data.map { it.toMutableList() }
            additionalProperties = priceEvaluateMultipleResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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
         * Returns an immutable instance of [PriceEvaluateMultipleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceEvaluateMultipleResponse =
            PriceEvaluateMultipleResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PriceEvaluateMultipleResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
    internal fun validity(): Int = (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    private constructor(
        private val currency: JsonField<String>,
        private val priceGroups: JsonField<List<EvaluatePriceGroup>>,
        private val externalPriceId: JsonField<String>,
        private val inlinePriceIndex: JsonField<Long>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_groups")
            @ExcludeMissing
            priceGroups: JsonField<List<EvaluatePriceGroup>> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inline_price_index")
            @ExcludeMissing
            inlinePriceIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(currency, priceGroups, externalPriceId, inlinePriceIndex, priceId, mutableMapOf())

        /**
         * The currency of the price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The computed price groups associated with input price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priceGroups(): List<EvaluatePriceGroup> = priceGroups.getRequired("price_groups")

        /**
         * The external ID of the price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * The index of the inline price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inlinePriceIndex(): Long? = inlinePriceIndex.getNullable("inline_price_index")

        /**
         * The ID of the price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [priceGroups].
         *
         * Unlike [priceGroups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_groups")
        @ExcludeMissing
        fun _priceGroups(): JsonField<List<EvaluatePriceGroup>> = priceGroups

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [inlinePriceIndex].
         *
         * Unlike [inlinePriceIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inline_price_index")
        @ExcludeMissing
        fun _inlinePriceIndex(): JsonField<Long> = inlinePriceIndex

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .priceGroups()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var priceGroups: JsonField<MutableList<EvaluatePriceGroup>>? = null
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var inlinePriceIndex: JsonField<Long> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                currency = data.currency
                priceGroups = data.priceGroups.map { it.toMutableList() }
                externalPriceId = data.externalPriceId
                inlinePriceIndex = data.inlinePriceIndex
                priceId = data.priceId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The currency of the price */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The computed price groups associated with input price. */
            fun priceGroups(priceGroups: List<EvaluatePriceGroup>) =
                priceGroups(JsonField.of(priceGroups))

            /**
             * Sets [Builder.priceGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceGroups] with a well-typed
             * `List<EvaluatePriceGroup>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun priceGroups(priceGroups: JsonField<List<EvaluatePriceGroup>>) = apply {
                this.priceGroups = priceGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [EvaluatePriceGroup] to [priceGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceGroup(priceGroup: EvaluatePriceGroup) = apply {
                priceGroups =
                    (priceGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceGroups", it).add(priceGroup)
                    }
            }

            /** The external ID of the price */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The index of the inline price */
            fun inlinePriceIndex(inlinePriceIndex: Long?) =
                inlinePriceIndex(JsonField.ofNullable(inlinePriceIndex))

            /**
             * Alias for [Builder.inlinePriceIndex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inlinePriceIndex(inlinePriceIndex: Long) =
                inlinePriceIndex(inlinePriceIndex as Long?)

            /**
             * Sets [Builder.inlinePriceIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inlinePriceIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inlinePriceIndex(inlinePriceIndex: JsonField<Long>) = apply {
                this.inlinePriceIndex = inlinePriceIndex
            }

            /** The ID of the price */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .priceGroups()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("currency", currency),
                    checkRequired("priceGroups", priceGroups).map { it.toImmutable() },
                    externalPriceId,
                    inlinePriceIndex,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            currency()
            priceGroups().forEach { it.validate() }
            externalPriceId()
            inlinePriceIndex()
            priceId()
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
            (if (currency.asKnown() == null) 0 else 1) +
                (priceGroups.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (inlinePriceIndex.asKnown() == null) 0 else 1) +
                (if (priceId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && currency == other.currency && priceGroups == other.priceGroups && externalPriceId == other.externalPriceId && inlinePriceIndex == other.inlinePriceIndex && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, priceGroups, externalPriceId, inlinePriceIndex, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{currency=$currency, priceGroups=$priceGroups, externalPriceId=$externalPriceId, inlinePriceIndex=$inlinePriceIndex, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceEvaluateMultipleResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceEvaluateMultipleResponse{data=$data, additionalProperties=$additionalProperties}"
}
