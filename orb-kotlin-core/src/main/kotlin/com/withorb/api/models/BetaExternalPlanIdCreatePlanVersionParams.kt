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
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This API endpoint is in beta and its interface may change. It is recommended for use only in test
 * mode.
 *
 * This endpoint allows the creation of a new plan version for an existing plan.
 */
class BetaExternalPlanIdCreatePlanVersionParams
private constructor(
    private val externalPlanId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalPlanId(): String? = externalPlanId

    /**
     * New version number.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = body.version()

    /**
     * Additional adjustments to be added to the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addAdjustments(): List<AddAdjustment>? = body.addAdjustments()

    /**
     * Additional prices to be added to the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addPrices(): List<AddPrice>? = body.addPrices()

    /**
     * Adjustments to be removed from the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removeAdjustments(): List<RemoveAdjustment>? = body.removeAdjustments()

    /**
     * Prices to be removed from the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removePrices(): List<RemovePrice>? = body.removePrices()

    /**
     * Adjustments to be replaced with additional adjustments on the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replaceAdjustments(): List<ReplaceAdjustment>? = body.replaceAdjustments()

    /**
     * Prices to be replaced with additional prices on the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replacePrices(): List<ReplacePrice>? = body.replacePrices()

    /**
     * Set this new plan version as the default
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun setAsDefault(): Boolean? = body.setAsDefault()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    /**
     * Returns the raw JSON value of [addAdjustments].
     *
     * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addAdjustments(): JsonField<List<AddAdjustment>> = body._addAdjustments()

    /**
     * Returns the raw JSON value of [addPrices].
     *
     * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addPrices(): JsonField<List<AddPrice>> = body._addPrices()

    /**
     * Returns the raw JSON value of [removeAdjustments].
     *
     * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = body._removeAdjustments()

    /**
     * Returns the raw JSON value of [removePrices].
     *
     * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _removePrices(): JsonField<List<RemovePrice>> = body._removePrices()

    /**
     * Returns the raw JSON value of [replaceAdjustments].
     *
     * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = body._replaceAdjustments()

    /**
     * Returns the raw JSON value of [replacePrices].
     *
     * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replacePrices(): JsonField<List<ReplacePrice>> = body._replacePrices()

    /**
     * Returns the raw JSON value of [setAsDefault].
     *
     * Unlike [setAsDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _setAsDefault(): JsonField<Boolean> = body._setAsDefault()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BetaExternalPlanIdCreatePlanVersionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .version()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BetaExternalPlanIdCreatePlanVersionParams]. */
    class Builder internal constructor() {

        private var externalPlanId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            betaExternalPlanIdCreatePlanVersionParams: BetaExternalPlanIdCreatePlanVersionParams
        ) = apply {
            externalPlanId = betaExternalPlanIdCreatePlanVersionParams.externalPlanId
            body = betaExternalPlanIdCreatePlanVersionParams.body.toBuilder()
            additionalHeaders =
                betaExternalPlanIdCreatePlanVersionParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                betaExternalPlanIdCreatePlanVersionParams.additionalQueryParams.toBuilder()
        }

        fun externalPlanId(externalPlanId: String?) = apply { this.externalPlanId = externalPlanId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [version]
         * - [addAdjustments]
         * - [addPrices]
         * - [removeAdjustments]
         * - [removePrices]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** New version number. */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

        /** Additional adjustments to be added to the plan. */
        fun addAdjustments(addAdjustments: List<AddAdjustment>?) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Sets [Builder.addAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addAdjustments] with a well-typed `List<AddAdjustment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Adds a single [AddAdjustment] to [addAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
            body.addAddAdjustment(addAdjustment)
        }

        /** Additional prices to be added to the plan. */
        fun addPrices(addPrices: List<AddPrice>?) = apply { body.addPrices(addPrices) }

        /**
         * Sets [Builder.addPrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply { body.addPrices(addPrices) }

        /**
         * Adds a single [AddPrice] to [addPrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddPrice(addPrice: AddPrice) = apply { body.addAddPrice(addPrice) }

        /** Adjustments to be removed from the plan. */
        fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /**
         * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeAdjustments] with a well-typed
         * `List<RemoveAdjustment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /**
         * Adds a single [RemoveAdjustment] to [removeAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
            body.addRemoveAdjustment(removeAdjustment)
        }

        /** Prices to be removed from the plan. */
        fun removePrices(removePrices: List<RemovePrice>?) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Sets [Builder.removePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Adds a single [RemovePrice] to [removePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemovePrice(removePrice: RemovePrice) = apply { body.addRemovePrice(removePrice) }

        /** Adjustments to be replaced with additional adjustments on the plan. */
        fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replaceAdjustments] with a well-typed
         * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
            body.addReplaceAdjustment(replaceAdjustment)
        }

        /** Prices to be replaced with additional prices on the plan. */
        fun replacePrices(replacePrices: List<ReplacePrice>?) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Sets [Builder.replacePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacePrices] with a well-typed `List<ReplacePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Adds a single [ReplacePrice] to [replacePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplacePrice(replacePrice: ReplacePrice) = apply {
            body.addReplacePrice(replacePrice)
        }

        /** Set this new plan version as the default */
        fun setAsDefault(setAsDefault: Boolean?) = apply { body.setAsDefault(setAsDefault) }

        /**
         * Alias for [Builder.setAsDefault].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun setAsDefault(setAsDefault: Boolean) = setAsDefault(setAsDefault as Boolean?)

        /**
         * Sets [Builder.setAsDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setAsDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun setAsDefault(setAsDefault: JsonField<Boolean>) = apply {
            body.setAsDefault(setAsDefault)
        }

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
         * Returns an immutable instance of [BetaExternalPlanIdCreatePlanVersionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BetaExternalPlanIdCreatePlanVersionParams =
            BetaExternalPlanIdCreatePlanVersionParams(
                externalPlanId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalPlanId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val version: JsonField<Long>,
        private val addAdjustments: JsonField<List<AddAdjustment>>,
        private val addPrices: JsonField<List<AddPrice>>,
        private val removeAdjustments: JsonField<List<RemoveAdjustment>>,
        private val removePrices: JsonField<List<RemovePrice>>,
        private val replaceAdjustments: JsonField<List<ReplaceAdjustment>>,
        private val replacePrices: JsonField<List<ReplacePrice>>,
        private val setAsDefault: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("add_adjustments")
            @ExcludeMissing
            addAdjustments: JsonField<List<AddAdjustment>> = JsonMissing.of(),
            @JsonProperty("add_prices")
            @ExcludeMissing
            addPrices: JsonField<List<AddPrice>> = JsonMissing.of(),
            @JsonProperty("remove_adjustments")
            @ExcludeMissing
            removeAdjustments: JsonField<List<RemoveAdjustment>> = JsonMissing.of(),
            @JsonProperty("remove_prices")
            @ExcludeMissing
            removePrices: JsonField<List<RemovePrice>> = JsonMissing.of(),
            @JsonProperty("replace_adjustments")
            @ExcludeMissing
            replaceAdjustments: JsonField<List<ReplaceAdjustment>> = JsonMissing.of(),
            @JsonProperty("replace_prices")
            @ExcludeMissing
            replacePrices: JsonField<List<ReplacePrice>> = JsonMissing.of(),
            @JsonProperty("set_as_default")
            @ExcludeMissing
            setAsDefault: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            version,
            addAdjustments,
            addPrices,
            removeAdjustments,
            removePrices,
            replaceAdjustments,
            replacePrices,
            setAsDefault,
            mutableMapOf(),
        )

        /**
         * New version number.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Long = version.getRequired("version")

        /**
         * Additional adjustments to be added to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addAdjustments(): List<AddAdjustment>? = addAdjustments.getNullable("add_adjustments")

        /**
         * Additional prices to be added to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addPrices(): List<AddPrice>? = addPrices.getNullable("add_prices")

        /**
         * Adjustments to be removed from the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removeAdjustments(): List<RemoveAdjustment>? =
            removeAdjustments.getNullable("remove_adjustments")

        /**
         * Prices to be removed from the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removePrices(): List<RemovePrice>? = removePrices.getNullable("remove_prices")

        /**
         * Adjustments to be replaced with additional adjustments on the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replaceAdjustments(): List<ReplaceAdjustment>? =
            replaceAdjustments.getNullable("replace_adjustments")

        /**
         * Prices to be replaced with additional prices on the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replacePrices(): List<ReplacePrice>? = replacePrices.getNullable("replace_prices")

        /**
         * Set this new plan version as the default
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun setAsDefault(): Boolean? = setAsDefault.getNullable("set_as_default")

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        /**
         * Returns the raw JSON value of [addAdjustments].
         *
         * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddAdjustment>> = addAdjustments

        /**
         * Returns the raw JSON value of [addPrices].
         *
         * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add_prices")
        @ExcludeMissing
        fun _addPrices(): JsonField<List<AddPrice>> = addPrices

        /**
         * Returns the raw JSON value of [removeAdjustments].
         *
         * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_adjustments")
        @ExcludeMissing
        fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = removeAdjustments

        /**
         * Returns the raw JSON value of [removePrices].
         *
         * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_prices")
        @ExcludeMissing
        fun _removePrices(): JsonField<List<RemovePrice>> = removePrices

        /**
         * Returns the raw JSON value of [replaceAdjustments].
         *
         * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replace_adjustments")
        @ExcludeMissing
        fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = replaceAdjustments

        /**
         * Returns the raw JSON value of [replacePrices].
         *
         * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replace_prices")
        @ExcludeMissing
        fun _replacePrices(): JsonField<List<ReplacePrice>> = replacePrices

        /**
         * Returns the raw JSON value of [setAsDefault].
         *
         * Unlike [setAsDefault], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("set_as_default")
        @ExcludeMissing
        fun _setAsDefault(): JsonField<Boolean> = setAsDefault

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
             * .version()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var version: JsonField<Long>? = null
            private var addAdjustments: JsonField<MutableList<AddAdjustment>>? = null
            private var addPrices: JsonField<MutableList<AddPrice>>? = null
            private var removeAdjustments: JsonField<MutableList<RemoveAdjustment>>? = null
            private var removePrices: JsonField<MutableList<RemovePrice>>? = null
            private var replaceAdjustments: JsonField<MutableList<ReplaceAdjustment>>? = null
            private var replacePrices: JsonField<MutableList<ReplacePrice>>? = null
            private var setAsDefault: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                version = body.version
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                addPrices = body.addPrices.map { it.toMutableList() }
                removeAdjustments = body.removeAdjustments.map { it.toMutableList() }
                removePrices = body.removePrices.map { it.toMutableList() }
                replaceAdjustments = body.replaceAdjustments.map { it.toMutableList() }
                replacePrices = body.replacePrices.map { it.toMutableList() }
                setAsDefault = body.setAsDefault
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** New version number. */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            /** Additional adjustments to be added to the plan. */
            fun addAdjustments(addAdjustments: List<AddAdjustment>?) =
                addAdjustments(JsonField.ofNullable(addAdjustments))

            /**
             * Sets [Builder.addAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addAdjustments] with a well-typed
             * `List<AddAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
                this.addAdjustments = addAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddAdjustment] to [addAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
                addAdjustments =
                    (addAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAdjustments", it).add(addAdjustment)
                    }
            }

            /** Additional prices to be added to the plan. */
            fun addPrices(addPrices: List<AddPrice>?) = addPrices(JsonField.ofNullable(addPrices))

            /**
             * Sets [Builder.addPrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply {
                this.addPrices = addPrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddPrice] to [addPrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddPrice(addPrice: AddPrice) = apply {
                addPrices =
                    (addPrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addPrices", it).add(addPrice)
                    }
            }

            /** Adjustments to be removed from the plan. */
            fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) =
                removeAdjustments(JsonField.ofNullable(removeAdjustments))

            /**
             * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeAdjustments] with a well-typed
             * `List<RemoveAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
                this.removeAdjustments = removeAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemoveAdjustment] to [removeAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
                removeAdjustments =
                    (removeAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeAdjustments", it).add(removeAdjustment)
                    }
            }

            /** Prices to be removed from the plan. */
            fun removePrices(removePrices: List<RemovePrice>?) =
                removePrices(JsonField.ofNullable(removePrices))

            /**
             * Sets [Builder.removePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
                this.removePrices = removePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemovePrice] to [removePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemovePrice(removePrice: RemovePrice) = apply {
                removePrices =
                    (removePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removePrices", it).add(removePrice)
                    }
            }

            /** Adjustments to be replaced with additional adjustments on the plan. */
            fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) =
                replaceAdjustments(JsonField.ofNullable(replaceAdjustments))

            /**
             * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replaceAdjustments] with a well-typed
             * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
                this.replaceAdjustments = replaceAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
                replaceAdjustments =
                    (replaceAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replaceAdjustments", it).add(replaceAdjustment)
                    }
            }

            /** Prices to be replaced with additional prices on the plan. */
            fun replacePrices(replacePrices: List<ReplacePrice>?) =
                replacePrices(JsonField.ofNullable(replacePrices))

            /**
             * Sets [Builder.replacePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacePrices] with a well-typed
             * `List<ReplacePrice>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
                this.replacePrices = replacePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplacePrice] to [replacePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplacePrice(replacePrice: ReplacePrice) = apply {
                replacePrices =
                    (replacePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replacePrices", it).add(replacePrice)
                    }
            }

            /** Set this new plan version as the default */
            fun setAsDefault(setAsDefault: Boolean?) =
                setAsDefault(JsonField.ofNullable(setAsDefault))

            /**
             * Alias for [Builder.setAsDefault].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun setAsDefault(setAsDefault: Boolean) = setAsDefault(setAsDefault as Boolean?)

            /**
             * Sets [Builder.setAsDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setAsDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun setAsDefault(setAsDefault: JsonField<Boolean>) = apply {
                this.setAsDefault = setAsDefault
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
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("version", version),
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (addPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (removePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    (replaceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (replacePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    setAsDefault,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            version()
            addAdjustments()?.forEach { it.validate() }
            addPrices()?.forEach { it.validate() }
            removeAdjustments()?.forEach { it.validate() }
            removePrices()?.forEach { it.validate() }
            replaceAdjustments()?.forEach { it.validate() }
            replacePrices()?.forEach { it.validate() }
            setAsDefault()
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
            (if (version.asKnown() == null) 0 else 1) +
                (addAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (addPrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (removeAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (removePrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (replaceAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (replacePrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (setAsDefault.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && version == other.version && addAdjustments == other.addAdjustments && addPrices == other.addPrices && removeAdjustments == other.removeAdjustments && removePrices == other.removePrices && replaceAdjustments == other.replaceAdjustments && replacePrices == other.replacePrices && setAsDefault == other.setAsDefault && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(version, addAdjustments, addPrices, removeAdjustments, removePrices, replaceAdjustments, replacePrices, setAsDefault, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{version=$version, addAdjustments=$addAdjustments, addPrices=$addPrices, removeAdjustments=$removeAdjustments, removePrices=$removePrices, replaceAdjustments=$replaceAdjustments, replacePrices=$replacePrices, setAsDefault=$setAsDefault, additionalProperties=$additionalProperties}"
    }

    class AddAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val planPhaseOrder: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        ) : this(adjustment, planPhaseOrder, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The phase to add this adjustment to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

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
             * Returns a mutable builder for constructing an instance of [AddAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AddAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addAdjustment: AddAdjustment) = apply {
                adjustment = addAdjustment.adjustment
                planPhaseOrder = addAdjustment.planPhaseOrder
                additionalProperties = addAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the plan. */
            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /** The phase to add this adjustment to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
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
             * Returns an immutable instance of [AddAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("adjustment", adjustment),
                    planPhaseOrder,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            planPhaseOrder()
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
            (adjustment.asKnown()?.validity() ?: 0) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1)

        /** The definition of a new adjustment to create and add to the plan. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

            fun usageDiscount(): NewUsageDiscount? = usageDiscount

            fun amountDiscount(): NewAmountDiscount? = amountDiscount

            fun minimum(): NewMinimum? = minimum

            fun maximum(): NewMaximum? = maximum

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
                            maximum.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                    when (adjustmentType) {
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
                                Adjustment(maximum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddAdjustment && adjustment == other.adjustment && planPhaseOrder == other.planPhaseOrder && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustment, planPhaseOrder, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAdjustment{adjustment=$adjustment, planPhaseOrder=$planPhaseOrder, additionalProperties=$additionalProperties}"
    }

    class AddPrice
    private constructor(
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val planPhaseOrder: JsonField<Long>,
        private val price: JsonField<Price>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        ) : this(allocationPrice, planPhaseOrder, price, mutableMapOf())

        /**
         * The allocation price to add to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): NewAllocationPrice? = allocationPrice.getNullable("allocation_price")

        /**
         * The phase to add this price to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * The price to add to the plan
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

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

            /** Returns a mutable builder for constructing an instance of [AddPrice]. */
            fun builder() = Builder()
        }

        /** A builder for [AddPrice]. */
        class Builder internal constructor() {

            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addPrice: AddPrice) = apply {
                allocationPrice = addPrice.allocationPrice
                planPhaseOrder = addPrice.planPhaseOrder
                price = addPrice.price
                additionalProperties = addPrice.additionalProperties.toMutableMap()
            }

            /** The allocation price to add to the plan. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /** The phase to add this price to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The price to add to the plan */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewPlanUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewPlanPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewPlanMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewPlanTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewPlanTieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewPlanBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewPlanBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewPlanBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewPlanThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewPlanTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewPlanTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewPlanUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewPlanPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewPlanTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewPlanUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewPlanGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewPlanBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewPlanGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewPlanMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewPlanGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

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
             * Returns an immutable instance of [AddPrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AddPrice =
                AddPrice(
                    allocationPrice,
                    planPhaseOrder,
                    price,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddPrice = apply {
            if (validated) {
                return@apply
            }

            allocationPrice()?.validate()
            planPhaseOrder()
            price()?.validate()
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
            (allocationPrice.asKnown()?.validity() ?: 0) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0)

        /** The price to add to the plan */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewPlanUnitPrice? = null,
            private val package_: NewPlanPackagePrice? = null,
            private val matrix: NewPlanMatrixPrice? = null,
            private val tiered: NewPlanTieredPrice? = null,
            private val tieredBps: NewPlanTieredBpsPrice? = null,
            private val bps: NewPlanBpsPrice? = null,
            private val bulkBps: NewPlanBulkBpsPrice? = null,
            private val bulk: NewPlanBulkPrice? = null,
            private val thresholdTotalAmount: NewPlanThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewPlanTieredPackagePrice? = null,
            private val tieredWithMinimum: NewPlanTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewPlanUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewPlanPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewPlanTierWithProrationPrice? = null,
            private val unitWithProration: NewPlanUnitWithProrationPrice? = null,
            private val groupedAllocation: NewPlanGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice? = null,
            private val groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice? = null,
            private val matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice? = null,
            private val bulkWithProration: NewPlanBulkWithProrationPrice? = null,
            private val groupedTieredPackage: NewPlanGroupedTieredPackagePrice? = null,
            private val maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewPlanScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice? = null,
            private val tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice? = null,
            private val matrixWithAllocation: NewPlanMatrixWithAllocationPrice? = null,
            private val groupedTiered: NewPlanGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewPlanUnitPrice? = unit

            fun package_(): NewPlanPackagePrice? = package_

            fun matrix(): NewPlanMatrixPrice? = matrix

            fun tiered(): NewPlanTieredPrice? = tiered

            fun tieredBps(): NewPlanTieredBpsPrice? = tieredBps

            fun bps(): NewPlanBpsPrice? = bps

            fun bulkBps(): NewPlanBulkBpsPrice? = bulkBps

            fun bulk(): NewPlanBulkPrice? = bulk

            fun thresholdTotalAmount(): NewPlanThresholdTotalAmountPrice? = thresholdTotalAmount

            fun tieredPackage(): NewPlanTieredPackagePrice? = tieredPackage

            fun tieredWithMinimum(): NewPlanTieredWithMinimumPrice? = tieredWithMinimum

            fun unitWithPercent(): NewPlanUnitWithPercentPrice? = unitWithPercent

            fun packageWithAllocation(): NewPlanPackageWithAllocationPrice? = packageWithAllocation

            fun tieredWithProration(): NewPlanTierWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewPlanUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewPlanGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewPlanGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun groupedWithMeteredMinimum(): NewPlanGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewPlanMatrixWithDisplayNamePrice? = matrixWithDisplayName

            fun bulkWithProration(): NewPlanBulkWithProrationPrice? = bulkWithProration

            fun groupedTieredPackage(): NewPlanGroupedTieredPackagePrice? = groupedTieredPackage

            fun maxGroupTieredPackage(): NewPlanMaxGroupTieredPackagePrice? = maxGroupTieredPackage

            fun scalableMatrixWithUnitPricing(): NewPlanScalableMatrixWithUnitPricingPrice? =
                scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing(): NewPlanScalableMatrixWithTieredPricingPrice? =
                scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewPlanCumulativeGroupedBulkPrice? = cumulativeGroupedBulk

            fun tieredPackageWithMinimum(): NewPlanTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun matrixWithAllocation(): NewPlanMatrixWithAllocationPrice? = matrixWithAllocation

            fun groupedTiered(): NewPlanGroupedTieredPrice? = groupedTiered

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewPlanUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewPlanPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewPlanMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewPlanTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewPlanTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewPlanBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewPlanBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewPlanBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewPlanThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewPlanTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewPlanTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewPlanUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewPlanPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewPlanTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewPlanUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewPlanGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewPlanGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewPlanGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewPlanMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asBulkWithProration(): NewPlanBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedTieredPackage(): NewPlanGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMaxGroupTieredPackage(): NewPlanMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewPlanScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing(): NewPlanScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewPlanCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asTieredPackageWithMinimum(): NewPlanTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asMatrixWithAllocation(): NewPlanMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asGroupedTiered(): NewPlanGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewPlanUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewPlanPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewPlanMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewPlanTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewPlanBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewPlanBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewPlanTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewPlanUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewPlanPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewPlanTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewPlanUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewPlanGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewPlanBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewPlanScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) {
                            groupedTiered.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitUnit(unit: NewPlanUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewPlanPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewPlanMatrixPrice) = matrix.validity()

                        override fun visitTiered(tiered: NewPlanTieredPrice) = tiered.validity()

                        override fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewPlanBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice) = bulkBps.validity()

                        override fun visitBulk(bulk: NewPlanBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice) =
                            tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewPlanTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewPlanUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewPlanPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewPlanTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewPlanUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewPlanGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewPlanBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewPlanScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) =
                            groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && tieredWithMinimum == other.tieredWithMinimum && unitWithPercent == other.unitWithPercent && packageWithAllocation == other.packageWithAllocation && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && bulkWithProration == other.bulkWithProration && groupedTieredPackage == other.groupedTieredPackage && maxGroupTieredPackage == other.maxGroupTieredPackage && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk && tieredPackageWithMinimum == other.tieredPackageWithMinimum && matrixWithAllocation == other.matrixWithAllocation && groupedTiered == other.groupedTiered /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, tieredWithMinimum, unitWithPercent, packageWithAllocation, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, groupedWithMeteredMinimum, matrixWithDisplayName, bulkWithProration, groupedTieredPackage, maxGroupTieredPackage, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk, tieredPackageWithMinimum, matrixWithAllocation, groupedTiered) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewPlanUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewPlanPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewPlanMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewPlanTieredPrice) = Price(tiered = tiered)

                fun ofTieredBps(tieredBps: NewPlanTieredBpsPrice) = Price(tieredBps = tieredBps)

                fun ofBps(bps: NewPlanBpsPrice) = Price(bps = bps)

                fun ofBulkBps(bulkBps: NewPlanBulkBpsPrice) = Price(bulkBps = bulkBps)

                fun ofBulk(bulk: NewPlanBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(thresholdTotalAmount: NewPlanThresholdTotalAmountPrice) =
                    Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewPlanTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewPlanTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewPlanUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewPlanPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredWithProration(tieredWithProration: NewPlanTierWithProrationPrice) =
                    Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewPlanUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewPlanGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofBulkWithProration(bulkWithProration: NewPlanBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofGroupedTieredPackage(groupedTieredPackage: NewPlanGroupedTieredPackagePrice) =
                    Price(groupedTieredPackage = groupedTieredPackage)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofMatrixWithAllocation(matrixWithAllocation: NewPlanMatrixWithAllocationPrice) =
                    Price(matrixWithAllocation = matrixWithAllocation)

                fun ofGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewPlanUnitPrice): T

                fun visitPackage(package_: NewPlanPackagePrice): T

                fun visitMatrix(matrix: NewPlanMatrixPrice): T

                fun visitTiered(tiered: NewPlanTieredPrice): T

                fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice): T

                fun visitBps(bps: NewPlanBpsPrice): T

                fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice): T

                fun visitBulk(bulk: NewPlanBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewPlanTieredWithMinimumPrice): T

                fun visitUnitWithPercent(unitWithPercent: NewPlanUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewPlanPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(tieredWithProration: NewPlanTierWithProrationPrice): T

                fun visitUnitWithProration(unitWithProration: NewPlanUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewPlanGroupedAllocationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                ): T

                fun visitBulkWithProration(bulkWithProration: NewPlanBulkWithProrationPrice): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanUnitPrice>())?.let {
                                Price(unit = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanMatrixPrice>())?.let {
                                Price(matrix = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredPrice>())?.let {
                                Price(tiered = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredBpsPrice>())
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBpsPrice>())?.let {
                                Price(bps = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBulkBpsPrice>())
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBulkPrice>())?.let {
                                Price(bulk = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredPackagePrice>())
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanScalableMatrixWithUnitPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanScalableMatrixWithTieredPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanGroupedTieredPrice>())
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddPrice && allocationPrice == other.allocationPrice && planPhaseOrder == other.planPhaseOrder && price == other.price && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(allocationPrice, planPhaseOrder, price, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddPrice{allocationPrice=$allocationPrice, planPhaseOrder=$planPhaseOrder, price=$price, additionalProperties=$additionalProperties}"
    }

    class RemoveAdjustment
    private constructor(
        private val adjustmentId: JsonField<String>,
        private val planPhaseOrder: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_id")
            @ExcludeMissing
            adjustmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        ) : this(adjustmentId, planPhaseOrder, mutableMapOf())

        /**
         * The id of the adjustment to remove from on the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentId(): String = adjustmentId.getRequired("adjustment_id")

        /**
         * The phase to remove this adjustment from.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * Returns the raw JSON value of [adjustmentId].
         *
         * Unlike [adjustmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_id")
        @ExcludeMissing
        fun _adjustmentId(): JsonField<String> = adjustmentId

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

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
             * Returns a mutable builder for constructing an instance of [RemoveAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RemoveAdjustment]. */
        class Builder internal constructor() {

            private var adjustmentId: JsonField<String>? = null
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(removeAdjustment: RemoveAdjustment) = apply {
                adjustmentId = removeAdjustment.adjustmentId
                planPhaseOrder = removeAdjustment.planPhaseOrder
                additionalProperties = removeAdjustment.additionalProperties.toMutableMap()
            }

            /** The id of the adjustment to remove from on the plan. */
            fun adjustmentId(adjustmentId: String) = adjustmentId(JsonField.of(adjustmentId))

            /**
             * Sets [Builder.adjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustmentId(adjustmentId: JsonField<String>) = apply {
                this.adjustmentId = adjustmentId
            }

            /** The phase to remove this adjustment from. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
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
             * Returns an immutable instance of [RemoveAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RemoveAdjustment =
                RemoveAdjustment(
                    checkRequired("adjustmentId", adjustmentId),
                    planPhaseOrder,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RemoveAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentId()
            planPhaseOrder()
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
            (if (adjustmentId.asKnown() == null) 0 else 1) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveAdjustment && adjustmentId == other.adjustmentId && planPhaseOrder == other.planPhaseOrder && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentId, planPhaseOrder, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveAdjustment{adjustmentId=$adjustmentId, planPhaseOrder=$planPhaseOrder, additionalProperties=$additionalProperties}"
    }

    class RemovePrice
    private constructor(
        private val priceId: JsonField<String>,
        private val planPhaseOrder: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        ) : this(priceId, planPhaseOrder, mutableMapOf())

        /**
         * The id of the price to remove from the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priceId(): String = priceId.getRequired("price_id")

        /**
         * The phase to remove this price from.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

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
             * Returns a mutable builder for constructing an instance of [RemovePrice].
             *
             * The following fields are required:
             * ```kotlin
             * .priceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RemovePrice]. */
        class Builder internal constructor() {

            private var priceId: JsonField<String>? = null
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(removePrice: RemovePrice) = apply {
                priceId = removePrice.priceId
                planPhaseOrder = removePrice.planPhaseOrder
                additionalProperties = removePrice.additionalProperties.toMutableMap()
            }

            /** The id of the price to remove from the plan. */
            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            /** The phase to remove this price from. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
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
             * Returns an immutable instance of [RemovePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .priceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RemovePrice =
                RemovePrice(
                    checkRequired("priceId", priceId),
                    planPhaseOrder,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RemovePrice = apply {
            if (validated) {
                return@apply
            }

            priceId()
            planPhaseOrder()
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
            (if (priceId.asKnown() == null) 0 else 1) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemovePrice && priceId == other.priceId && planPhaseOrder == other.planPhaseOrder && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, planPhaseOrder, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemovePrice{priceId=$priceId, planPhaseOrder=$planPhaseOrder, additionalProperties=$additionalProperties}"
    }

    class ReplaceAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val replacesAdjustmentId: JsonField<String>,
        private val planPhaseOrder: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("replaces_adjustment_id")
            @ExcludeMissing
            replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
        ) : this(adjustment, replacesAdjustmentId, planPhaseOrder, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The id of the adjustment on the plan to replace in the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesAdjustmentId(): String =
            replacesAdjustmentId.getRequired("replaces_adjustment_id")

        /**
         * The phase to replace this adjustment from.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [replacesAdjustmentId].
         *
         * Unlike [replacesAdjustmentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replaces_adjustment_id")
        @ExcludeMissing
        fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

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
             * Returns a mutable builder for constructing an instance of [ReplaceAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReplaceAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var replacesAdjustmentId: JsonField<String>? = null
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(replaceAdjustment: ReplaceAdjustment) = apply {
                adjustment = replaceAdjustment.adjustment
                replacesAdjustmentId = replaceAdjustment.replacesAdjustmentId
                planPhaseOrder = replaceAdjustment.planPhaseOrder
                additionalProperties = replaceAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the plan. */
            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /** The id of the adjustment on the plan to replace in the plan. */
            fun replacesAdjustmentId(replacesAdjustmentId: String) =
                replacesAdjustmentId(JsonField.of(replacesAdjustmentId))

            /**
             * Sets [Builder.replacesAdjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesAdjustmentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
                this.replacesAdjustmentId = replacesAdjustmentId
            }

            /** The phase to replace this adjustment from. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
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
             * Returns an immutable instance of [ReplaceAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplaceAdjustment =
                ReplaceAdjustment(
                    checkRequired("adjustment", adjustment),
                    checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                    planPhaseOrder,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplaceAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            replacesAdjustmentId()
            planPhaseOrder()
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
            (adjustment.asKnown()?.validity() ?: 0) +
                (if (replacesAdjustmentId.asKnown() == null) 0 else 1) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1)

        /** The definition of a new adjustment to create and add to the plan. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

            fun usageDiscount(): NewUsageDiscount? = usageDiscount

            fun amountDiscount(): NewAmountDiscount? = amountDiscount

            fun minimum(): NewMinimum? = minimum

            fun maximum(): NewMaximum? = maximum

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
                            maximum.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                    when (adjustmentType) {
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
                                Adjustment(maximum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReplaceAdjustment && adjustment == other.adjustment && replacesAdjustmentId == other.replacesAdjustmentId && planPhaseOrder == other.planPhaseOrder && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustment, replacesAdjustmentId, planPhaseOrder, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplaceAdjustment{adjustment=$adjustment, replacesAdjustmentId=$replacesAdjustmentId, planPhaseOrder=$planPhaseOrder, additionalProperties=$additionalProperties}"
    }

    class ReplacePrice
    private constructor(
        private val replacesPriceId: JsonField<String>,
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val planPhaseOrder: JsonField<Long>,
        private val price: JsonField<Price>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("replaces_price_id")
            @ExcludeMissing
            replacesPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        ) : this(replacesPriceId, allocationPrice, planPhaseOrder, price, mutableMapOf())

        /**
         * The id of the price on the plan to replace in the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesPriceId(): String = replacesPriceId.getRequired("replaces_price_id")

        /**
         * The allocation price to add to the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): NewAllocationPrice? = allocationPrice.getNullable("allocation_price")

        /**
         * The phase to replace this price from.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * The price to add to the plan
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * Returns the raw JSON value of [replacesPriceId].
         *
         * Unlike [replacesPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replaces_price_id")
        @ExcludeMissing
        fun _replacesPriceId(): JsonField<String> = replacesPriceId

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

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
             * Returns a mutable builder for constructing an instance of [ReplacePrice].
             *
             * The following fields are required:
             * ```kotlin
             * .replacesPriceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReplacePrice]. */
        class Builder internal constructor() {

            private var replacesPriceId: JsonField<String>? = null
            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(replacePrice: ReplacePrice) = apply {
                replacesPriceId = replacePrice.replacesPriceId
                allocationPrice = replacePrice.allocationPrice
                planPhaseOrder = replacePrice.planPhaseOrder
                price = replacePrice.price
                additionalProperties = replacePrice.additionalProperties.toMutableMap()
            }

            /** The id of the price on the plan to replace in the plan. */
            fun replacesPriceId(replacesPriceId: String) =
                replacesPriceId(JsonField.of(replacesPriceId))

            /**
             * Sets [Builder.replacesPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replacesPriceId(replacesPriceId: JsonField<String>) = apply {
                this.replacesPriceId = replacesPriceId
            }

            /** The allocation price to add to the plan. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /** The phase to replace this price from. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The price to add to the plan */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewPlanUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewPlanPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewPlanMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewPlanTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewPlanTieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewPlanBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewPlanBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewPlanBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewPlanThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewPlanTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewPlanTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewPlanUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewPlanPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewPlanTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewPlanUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewPlanGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewPlanBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewPlanGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewPlanMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewPlanGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

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
             * Returns an immutable instance of [ReplacePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .replacesPriceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplacePrice =
                ReplacePrice(
                    checkRequired("replacesPriceId", replacesPriceId),
                    allocationPrice,
                    planPhaseOrder,
                    price,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplacePrice = apply {
            if (validated) {
                return@apply
            }

            replacesPriceId()
            allocationPrice()?.validate()
            planPhaseOrder()
            price()?.validate()
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
            (if (replacesPriceId.asKnown() == null) 0 else 1) +
                (allocationPrice.asKnown()?.validity() ?: 0) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0)

        /** The price to add to the plan */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewPlanUnitPrice? = null,
            private val package_: NewPlanPackagePrice? = null,
            private val matrix: NewPlanMatrixPrice? = null,
            private val tiered: NewPlanTieredPrice? = null,
            private val tieredBps: NewPlanTieredBpsPrice? = null,
            private val bps: NewPlanBpsPrice? = null,
            private val bulkBps: NewPlanBulkBpsPrice? = null,
            private val bulk: NewPlanBulkPrice? = null,
            private val thresholdTotalAmount: NewPlanThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewPlanTieredPackagePrice? = null,
            private val tieredWithMinimum: NewPlanTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewPlanUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewPlanPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewPlanTierWithProrationPrice? = null,
            private val unitWithProration: NewPlanUnitWithProrationPrice? = null,
            private val groupedAllocation: NewPlanGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice? = null,
            private val groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice? = null,
            private val matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice? = null,
            private val bulkWithProration: NewPlanBulkWithProrationPrice? = null,
            private val groupedTieredPackage: NewPlanGroupedTieredPackagePrice? = null,
            private val maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewPlanScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice? = null,
            private val tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice? = null,
            private val matrixWithAllocation: NewPlanMatrixWithAllocationPrice? = null,
            private val groupedTiered: NewPlanGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewPlanUnitPrice? = unit

            fun package_(): NewPlanPackagePrice? = package_

            fun matrix(): NewPlanMatrixPrice? = matrix

            fun tiered(): NewPlanTieredPrice? = tiered

            fun tieredBps(): NewPlanTieredBpsPrice? = tieredBps

            fun bps(): NewPlanBpsPrice? = bps

            fun bulkBps(): NewPlanBulkBpsPrice? = bulkBps

            fun bulk(): NewPlanBulkPrice? = bulk

            fun thresholdTotalAmount(): NewPlanThresholdTotalAmountPrice? = thresholdTotalAmount

            fun tieredPackage(): NewPlanTieredPackagePrice? = tieredPackage

            fun tieredWithMinimum(): NewPlanTieredWithMinimumPrice? = tieredWithMinimum

            fun unitWithPercent(): NewPlanUnitWithPercentPrice? = unitWithPercent

            fun packageWithAllocation(): NewPlanPackageWithAllocationPrice? = packageWithAllocation

            fun tieredWithProration(): NewPlanTierWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewPlanUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewPlanGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewPlanGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun groupedWithMeteredMinimum(): NewPlanGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewPlanMatrixWithDisplayNamePrice? = matrixWithDisplayName

            fun bulkWithProration(): NewPlanBulkWithProrationPrice? = bulkWithProration

            fun groupedTieredPackage(): NewPlanGroupedTieredPackagePrice? = groupedTieredPackage

            fun maxGroupTieredPackage(): NewPlanMaxGroupTieredPackagePrice? = maxGroupTieredPackage

            fun scalableMatrixWithUnitPricing(): NewPlanScalableMatrixWithUnitPricingPrice? =
                scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing(): NewPlanScalableMatrixWithTieredPricingPrice? =
                scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewPlanCumulativeGroupedBulkPrice? = cumulativeGroupedBulk

            fun tieredPackageWithMinimum(): NewPlanTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun matrixWithAllocation(): NewPlanMatrixWithAllocationPrice? = matrixWithAllocation

            fun groupedTiered(): NewPlanGroupedTieredPrice? = groupedTiered

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewPlanUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewPlanPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewPlanMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewPlanTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewPlanTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewPlanBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewPlanBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewPlanBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewPlanThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewPlanTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewPlanTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewPlanUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewPlanPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewPlanTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewPlanUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewPlanGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewPlanGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewPlanGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewPlanMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asBulkWithProration(): NewPlanBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedTieredPackage(): NewPlanGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMaxGroupTieredPackage(): NewPlanMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewPlanScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing(): NewPlanScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewPlanCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asTieredPackageWithMinimum(): NewPlanTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asMatrixWithAllocation(): NewPlanMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asGroupedTiered(): NewPlanGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewPlanUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewPlanPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewPlanMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewPlanTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewPlanBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewPlanBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewPlanTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewPlanUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewPlanPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewPlanTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewPlanUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewPlanGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewPlanBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewPlanScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) {
                            groupedTiered.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitUnit(unit: NewPlanUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewPlanPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewPlanMatrixPrice) = matrix.validity()

                        override fun visitTiered(tiered: NewPlanTieredPrice) = tiered.validity()

                        override fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewPlanBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice) = bulkBps.validity()

                        override fun visitBulk(bulk: NewPlanBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice) =
                            tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewPlanTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewPlanUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewPlanPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewPlanTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewPlanUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewPlanGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewPlanBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewPlanScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) =
                            groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && tieredWithMinimum == other.tieredWithMinimum && unitWithPercent == other.unitWithPercent && packageWithAllocation == other.packageWithAllocation && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && bulkWithProration == other.bulkWithProration && groupedTieredPackage == other.groupedTieredPackage && maxGroupTieredPackage == other.maxGroupTieredPackage && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk && tieredPackageWithMinimum == other.tieredPackageWithMinimum && matrixWithAllocation == other.matrixWithAllocation && groupedTiered == other.groupedTiered /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, tieredWithMinimum, unitWithPercent, packageWithAllocation, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, groupedWithMeteredMinimum, matrixWithDisplayName, bulkWithProration, groupedTieredPackage, maxGroupTieredPackage, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk, tieredPackageWithMinimum, matrixWithAllocation, groupedTiered) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewPlanUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewPlanPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewPlanMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewPlanTieredPrice) = Price(tiered = tiered)

                fun ofTieredBps(tieredBps: NewPlanTieredBpsPrice) = Price(tieredBps = tieredBps)

                fun ofBps(bps: NewPlanBpsPrice) = Price(bps = bps)

                fun ofBulkBps(bulkBps: NewPlanBulkBpsPrice) = Price(bulkBps = bulkBps)

                fun ofBulk(bulk: NewPlanBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(thresholdTotalAmount: NewPlanThresholdTotalAmountPrice) =
                    Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewPlanTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewPlanTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewPlanUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewPlanPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredWithProration(tieredWithProration: NewPlanTierWithProrationPrice) =
                    Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewPlanUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewPlanGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofBulkWithProration(bulkWithProration: NewPlanBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofGroupedTieredPackage(groupedTieredPackage: NewPlanGroupedTieredPackagePrice) =
                    Price(groupedTieredPackage = groupedTieredPackage)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofMatrixWithAllocation(matrixWithAllocation: NewPlanMatrixWithAllocationPrice) =
                    Price(matrixWithAllocation = matrixWithAllocation)

                fun ofGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewPlanUnitPrice): T

                fun visitPackage(package_: NewPlanPackagePrice): T

                fun visitMatrix(matrix: NewPlanMatrixPrice): T

                fun visitTiered(tiered: NewPlanTieredPrice): T

                fun visitTieredBps(tieredBps: NewPlanTieredBpsPrice): T

                fun visitBps(bps: NewPlanBpsPrice): T

                fun visitBulkBps(bulkBps: NewPlanBulkBpsPrice): T

                fun visitBulk(bulk: NewPlanBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewPlanThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewPlanTieredPackagePrice): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewPlanTieredWithMinimumPrice): T

                fun visitUnitWithPercent(unitWithPercent: NewPlanUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewPlanPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(tieredWithProration: NewPlanTierWithProrationPrice): T

                fun visitUnitWithProration(unitWithProration: NewPlanUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewPlanGroupedAllocationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewPlanGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewPlanGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewPlanMatrixWithDisplayNamePrice
                ): T

                fun visitBulkWithProration(bulkWithProration: NewPlanBulkWithProrationPrice): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewPlanGroupedTieredPackagePrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewPlanMaxGroupTieredPackagePrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewPlanScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewPlanScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewPlanCumulativeGroupedBulkPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewPlanTieredPackageWithMinimumPrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewPlanMatrixWithAllocationPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewPlanGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanUnitPrice>())?.let {
                                Price(unit = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanMatrixPrice>())?.let {
                                Price(matrix = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredPrice>())?.let {
                                Price(tiered = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredBpsPrice>())
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBpsPrice>())?.let {
                                Price(bps = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBulkBpsPrice>())
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanBulkPrice>())?.let {
                                Price(bulk = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanTieredPackagePrice>())
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanScalableMatrixWithUnitPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanScalableMatrixWithTieredPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewPlanMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPlanGroupedTieredPrice>())
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReplacePrice && replacesPriceId == other.replacesPriceId && allocationPrice == other.allocationPrice && planPhaseOrder == other.planPhaseOrder && price == other.price && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(replacesPriceId, allocationPrice, planPhaseOrder, price, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplacePrice{replacesPriceId=$replacesPriceId, allocationPrice=$allocationPrice, planPhaseOrder=$planPhaseOrder, price=$price, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BetaExternalPlanIdCreatePlanVersionParams && externalPlanId == other.externalPlanId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPlanId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BetaExternalPlanIdCreatePlanVersionParams{externalPlanId=$externalPlanId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
