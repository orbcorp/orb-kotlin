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
class BetaCreatePlanVersionParams
private constructor(
    private val planId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun planId(): String? = planId

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BetaCreatePlanVersionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .version()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BetaCreatePlanVersionParams]. */
    class Builder internal constructor() {

        private var planId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(betaCreatePlanVersionParams: BetaCreatePlanVersionParams) = apply {
            planId = betaCreatePlanVersionParams.planId
            body = betaCreatePlanVersionParams.body.toBuilder()
            additionalHeaders = betaCreatePlanVersionParams.additionalHeaders.toBuilder()
            additionalQueryParams = betaCreatePlanVersionParams.additionalQueryParams.toBuilder()
        }

        fun planId(planId: String?) = apply { this.planId = planId }

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
         * Returns an immutable instance of [BetaCreatePlanVersionParams].
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
        fun build(): BetaCreatePlanVersionParams =
            BetaCreatePlanVersionParams(
                planId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> planId ?: ""
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

            return other is Body &&
                version == other.version &&
                addAdjustments == other.addAdjustments &&
                addPrices == other.addPrices &&
                removeAdjustments == other.removeAdjustments &&
                removePrices == other.removePrices &&
                replaceAdjustments == other.replaceAdjustments &&
                replacePrices == other.replacePrices &&
                setAsDefault == other.setAsDefault &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                version,
                addAdjustments,
                addPrices,
                removeAdjustments,
                removePrices,
                replaceAdjustments,
                replacePrices,
                setAsDefault,
                additionalProperties,
            )
        }

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

                return other is Adjustment &&
                    percentageDiscount == other.percentageDiscount &&
                    usageDiscount == other.usageDiscount &&
                    amountDiscount == other.amountDiscount &&
                    minimum == other.minimum &&
                    maximum == other.maximum
            }

            override fun hashCode(): Int =
                Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum)

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

            return other is AddAdjustment &&
                adjustment == other.adjustment &&
                planPhaseOrder == other.planPhaseOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustment, planPhaseOrder, additionalProperties)
        }

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
             * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
             */
            fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
                price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

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

            /** Alias for calling [price] with `Price.ofMinimum(minimum)`. */
            fun price(minimum: Price.Minimum) = price(Price.ofMinimum(minimum))

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
            private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
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
            private val minimum: Minimum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewPlanUnitPrice? = unit

            fun package_(): NewPlanPackagePrice? = package_

            fun matrix(): NewPlanMatrixPrice? = matrix

            fun tiered(): NewPlanTieredPrice? = tiered

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

            fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
                groupedWithMinMaxThresholds

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

            fun minimum(): Minimum? = minimum

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

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

            fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

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

            fun isMinimum(): Boolean = minimum != null

            fun asUnit(): NewPlanUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewPlanPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewPlanMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewPlanTieredPrice = tiered.getOrThrow("tiered")

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

            fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
                groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

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

            fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
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
                    groupedWithMinMaxThresholds != null ->
                        visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
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
                    minimum != null -> visitor.visitMinimum(minimum)
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

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) {
                            groupedWithMinMaxThresholds.validate()
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

                        override fun visitMinimum(minimum: Minimum) {
                            minimum.validate()
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

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) = groupedWithMinMaxThresholds.validity()

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

                        override fun visitMinimum(minimum: Minimum) = minimum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    tiered == other.tiered &&
                    bulk == other.bulk &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    unitWithPercent == other.unitWithPercent &&
                    packageWithAllocation == other.packageWithAllocation &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    bulkWithProration == other.bulkWithProration &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    groupedTiered == other.groupedTiered &&
                    minimum == other.minimum
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    package_,
                    matrix,
                    tiered,
                    bulk,
                    thresholdTotalAmount,
                    tieredPackage,
                    tieredWithMinimum,
                    unitWithPercent,
                    packageWithAllocation,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    groupedWithProratedMinimum,
                    groupedWithMeteredMinimum,
                    groupedWithMinMaxThresholds,
                    matrixWithDisplayName,
                    bulkWithProration,
                    groupedTieredPackage,
                    maxGroupTieredPackage,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    tieredPackageWithMinimum,
                    matrixWithAllocation,
                    groupedTiered,
                    minimum,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
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
                    groupedWithMinMaxThresholds != null ->
                        "Price{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
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
                    minimum != null -> "Price{minimum=$minimum}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewPlanUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewPlanPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewPlanMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewPlanTieredPrice) = Price(tiered = tiered)

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

                fun ofGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ) = Price(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

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

                fun ofMinimum(minimum: Minimum) = Price(minimum = minimum)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewPlanUnitPrice): T

                fun visitPackage(package_: NewPlanPackagePrice): T

                fun visitMatrix(matrix: NewPlanMatrixPrice): T

                fun visitTiered(tiered: NewPlanTieredPrice): T

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

                fun visitGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
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

                fun visitMinimum(minimum: Minimum): T

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
                        "grouped_with_min_max_thresholds" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<GroupedWithMinMaxThresholds>(),
                                )
                                ?.let { Price(groupedWithMinMaxThresholds = it, _json = json) }
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
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                                Price(minimum = it, _json = json)
                            } ?: Price(_json = json)
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
                        value.groupedWithMinMaxThresholds != null ->
                            generator.writeObject(value.groupedWithMinMaxThresholds)
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
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }

            class GroupedWithMinMaxThresholds
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val groupedWithMinMaxThresholdsConfig:
                    JsonField<GroupedWithMinMaxThresholdsConfig>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val currency: JsonField<String>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val referenceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("grouped_with_min_max_thresholds_config")
                    @ExcludeMissing
                    groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig> =
                        JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("reference_id")
                    @ExcludeMissing
                    referenceId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    cadence,
                    groupedWithMinMaxThresholdsConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    currency,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    referenceId,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupedWithMinMaxThresholdsConfig(): GroupedWithMinMaxThresholdsConfig =
                    groupedWithMinMaxThresholdsConfig.getRequired(
                        "grouped_with_min_max_thresholds_config"
                    )

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("grouped_with_min_max_thresholds")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                 * price is billed.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun currency(): String? = currency.getNullable("currency")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A transient ID that can be used to reference this price when adding adjustments
                 * in the same API call.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun referenceId(): String? = referenceId.getNullable("reference_id")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [groupedWithMinMaxThresholdsConfig].
                 *
                 * Unlike [groupedWithMinMaxThresholdsConfig], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("grouped_with_min_max_thresholds_config")
                @ExcludeMissing
                fun _groupedWithMinMaxThresholdsConfig():
                    JsonField<GroupedWithMinMaxThresholdsConfig> = groupedWithMinMaxThresholdsConfig

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [referenceId].
                 *
                 * Unlike [referenceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reference_id")
                @ExcludeMissing
                fun _referenceId(): JsonField<String> = referenceId

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
                     * [GroupedWithMinMaxThresholds].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholds]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig>? =
                        null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue =
                        JsonValue.from("grouped_with_min_max_thresholds")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var referenceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds) =
                        apply {
                            cadence = groupedWithMinMaxThresholds.cadence
                            groupedWithMinMaxThresholdsConfig =
                                groupedWithMinMaxThresholds.groupedWithMinMaxThresholdsConfig
                            itemId = groupedWithMinMaxThresholds.itemId
                            modelType = groupedWithMinMaxThresholds.modelType
                            name = groupedWithMinMaxThresholds.name
                            billableMetricId = groupedWithMinMaxThresholds.billableMetricId
                            billedInAdvance = groupedWithMinMaxThresholds.billedInAdvance
                            billingCycleConfiguration =
                                groupedWithMinMaxThresholds.billingCycleConfiguration
                            conversionRate = groupedWithMinMaxThresholds.conversionRate
                            conversionRateConfig = groupedWithMinMaxThresholds.conversionRateConfig
                            currency = groupedWithMinMaxThresholds.currency
                            dimensionalPriceConfiguration =
                                groupedWithMinMaxThresholds.dimensionalPriceConfiguration
                            externalPriceId = groupedWithMinMaxThresholds.externalPriceId
                            fixedPriceQuantity = groupedWithMinMaxThresholds.fixedPriceQuantity
                            invoiceGroupingKey = groupedWithMinMaxThresholds.invoiceGroupingKey
                            invoicingCycleConfiguration =
                                groupedWithMinMaxThresholds.invoicingCycleConfiguration
                            metadata = groupedWithMinMaxThresholds.metadata
                            referenceId = groupedWithMinMaxThresholds.referenceId
                            additionalProperties =
                                groupedWithMinMaxThresholds.additionalProperties.toMutableMap()
                        }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) =
                        groupedWithMinMaxThresholdsConfig(
                            JsonField.of(groupedWithMinMaxThresholdsConfig)
                        )

                    /**
                     * Sets [Builder.groupedWithMinMaxThresholdsConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupedWithMinMaxThresholdsConfig] with a
                     * well-typed [GroupedWithMinMaxThresholdsConfig] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig:
                            JsonField<GroupedWithMinMaxThresholdsConfig>
                    ) = apply {
                        this.groupedWithMinMaxThresholdsConfig = groupedWithMinMaxThresholdsConfig
                    }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("grouped_with_min_max_thresholds")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /**
                     * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                     * price is billed.
                     */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A transient ID that can be used to reference this price when adding
                     * adjustments in the same API call.
                     */
                    fun referenceId(referenceId: String?) =
                        referenceId(JsonField.ofNullable(referenceId))

                    /**
                     * Sets [Builder.referenceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.referenceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun referenceId(referenceId: JsonField<String>) = apply {
                        this.referenceId = referenceId
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
                     * Returns an immutable instance of [GroupedWithMinMaxThresholds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupedWithMinMaxThresholds =
                        GroupedWithMinMaxThresholds(
                            checkRequired("cadence", cadence),
                            checkRequired(
                                "groupedWithMinMaxThresholdsConfig",
                                groupedWithMinMaxThresholdsConfig,
                            ),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            currency,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            referenceId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GroupedWithMinMaxThresholds = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    groupedWithMinMaxThresholdsConfig().validate()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("grouped_with_min_max_thresholds")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    currency()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
                    referenceId()
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
                        (groupedWithMinMaxThresholdsConfig.asKnown()?.validity() ?: 0) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let {
                            if (it == JsonValue.from("grouped_with_min_max_thresholds")) 1 else 0
                        } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (referenceId.asKnown() == null) 0 else 1)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

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

                class GroupedWithMinMaxThresholdsConfig
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [GroupedWithMinMaxThresholdsConfig].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                        ) = apply {
                            additionalProperties =
                                groupedWithMinMaxThresholdsConfig.additionalProperties
                                    .toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [GroupedWithMinMaxThresholdsConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): GroupedWithMinMaxThresholdsConfig =
                            GroupedWithMinMaxThresholdsConfig(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupedWithMinMaxThresholdsConfig &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "GroupedWithMinMaxThresholdsConfig{additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupedWithMinMaxThresholds &&
                        cadence == other.cadence &&
                        groupedWithMinMaxThresholdsConfig ==
                            other.groupedWithMinMaxThresholdsConfig &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        currency == other.currency &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        referenceId == other.referenceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        groupedWithMinMaxThresholdsConfig,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        currency,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        referenceId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholds{cadence=$cadence, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
            }

            class Minimum
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val itemId: JsonField<String>,
                private val minimumConfig: JsonField<MinimumConfig>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val currency: JsonField<String>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val referenceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_config")
                    @ExcludeMissing
                    minimumConfig: JsonField<MinimumConfig> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("reference_id")
                    @ExcludeMissing
                    referenceId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    cadence,
                    itemId,
                    minimumConfig,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    currency,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    referenceId,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumConfig(): MinimumConfig = minimumConfig.getRequired("minimum_config")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("minimum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                 * price is billed.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun currency(): String? = currency.getNullable("currency")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A transient ID that can be used to reference this price when adding adjustments
                 * in the same API call.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun referenceId(): String? = referenceId.getNullable("reference_id")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [minimumConfig].
                 *
                 * Unlike [minimumConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_config")
                @ExcludeMissing
                fun _minimumConfig(): JsonField<MinimumConfig> = minimumConfig

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [referenceId].
                 *
                 * Unlike [referenceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reference_id")
                @ExcludeMissing
                fun _referenceId(): JsonField<String> = referenceId

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
                     * Returns a mutable builder for constructing an instance of [Minimum].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .itemId()
                     * .minimumConfig()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Minimum]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumConfig: JsonField<MinimumConfig>? = null
                    private var modelType: JsonValue = JsonValue.from("minimum")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var referenceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(minimum: Minimum) = apply {
                        cadence = minimum.cadence
                        itemId = minimum.itemId
                        minimumConfig = minimum.minimumConfig
                        modelType = minimum.modelType
                        name = minimum.name
                        billableMetricId = minimum.billableMetricId
                        billedInAdvance = minimum.billedInAdvance
                        billingCycleConfiguration = minimum.billingCycleConfiguration
                        conversionRate = minimum.conversionRate
                        conversionRateConfig = minimum.conversionRateConfig
                        currency = minimum.currency
                        dimensionalPriceConfiguration = minimum.dimensionalPriceConfiguration
                        externalPriceId = minimum.externalPriceId
                        fixedPriceQuantity = minimum.fixedPriceQuantity
                        invoiceGroupingKey = minimum.invoiceGroupingKey
                        invoicingCycleConfiguration = minimum.invoicingCycleConfiguration
                        metadata = minimum.metadata
                        referenceId = minimum.referenceId
                        additionalProperties = minimum.additionalProperties.toMutableMap()
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    fun minimumConfig(minimumConfig: MinimumConfig) =
                        minimumConfig(JsonField.of(minimumConfig))

                    /**
                     * Sets [Builder.minimumConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumConfig] with a well-typed
                     * [MinimumConfig] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun minimumConfig(minimumConfig: JsonField<MinimumConfig>) = apply {
                        this.minimumConfig = minimumConfig
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("minimum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /**
                     * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                     * price is billed.
                     */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A transient ID that can be used to reference this price when adding
                     * adjustments in the same API call.
                     */
                    fun referenceId(referenceId: String?) =
                        referenceId(JsonField.ofNullable(referenceId))

                    /**
                     * Sets [Builder.referenceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.referenceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun referenceId(referenceId: JsonField<String>) = apply {
                        this.referenceId = referenceId
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
                     * Returns an immutable instance of [Minimum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .itemId()
                     * .minimumConfig()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Minimum =
                        Minimum(
                            checkRequired("cadence", cadence),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumConfig", minimumConfig),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            currency,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            referenceId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Minimum = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    itemId()
                    minimumConfig().validate()
                    _modelType().let {
                        if (it != JsonValue.from("minimum")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    currency()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
                    referenceId()
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
                        (if (itemId.asKnown() == null) 0 else 1) +
                        (minimumConfig.asKnown()?.validity() ?: 0) +
                        modelType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (referenceId.asKnown() == null) 0 else 1)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

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

                class MinimumConfig
                private constructor(
                    private val minimumAmount: JsonField<String>,
                    private val prorated: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("minimum_amount")
                        @ExcludeMissing
                        minimumAmount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("prorated")
                        @ExcludeMissing
                        prorated: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(minimumAmount, prorated, mutableMapOf())

                    /**
                     * The minimum amount to apply
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                    /**
                     * By default, subtotals from minimum composite prices are prorated based on the
                     * service period. Set to false to disable proration.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun prorated(): Boolean? = prorated.getNullable("prorated")

                    /**
                     * Returns the raw JSON value of [minimumAmount].
                     *
                     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun _minimumAmount(): JsonField<String> = minimumAmount

                    /**
                     * Returns the raw JSON value of [prorated].
                     *
                     * Unlike [prorated], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prorated")
                    @ExcludeMissing
                    fun _prorated(): JsonField<Boolean> = prorated

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
                         * [MinimumConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .minimumAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [MinimumConfig]. */
                    class Builder internal constructor() {

                        private var minimumAmount: JsonField<String>? = null
                        private var prorated: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(minimumConfig: MinimumConfig) = apply {
                            minimumAmount = minimumConfig.minimumAmount
                            prorated = minimumConfig.prorated
                            additionalProperties = minimumConfig.additionalProperties.toMutableMap()
                        }

                        /** The minimum amount to apply */
                        fun minimumAmount(minimumAmount: String) =
                            minimumAmount(JsonField.of(minimumAmount))

                        /**
                         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minimumAmount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                            this.minimumAmount = minimumAmount
                        }

                        /**
                         * By default, subtotals from minimum composite prices are prorated based on
                         * the service period. Set to false to disable proration.
                         */
                        fun prorated(prorated: Boolean?) = prorated(JsonField.ofNullable(prorated))

                        /**
                         * Alias for [Builder.prorated].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun prorated(prorated: Boolean) = prorated(prorated as Boolean?)

                        /**
                         * Sets [Builder.prorated] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prorated] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prorated(prorated: JsonField<Boolean>) = apply {
                            this.prorated = prorated
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MinimumConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .minimumAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MinimumConfig =
                            MinimumConfig(
                                checkRequired("minimumAmount", minimumAmount),
                                prorated,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): MinimumConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        minimumAmount()
                        prorated()
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
                        (if (minimumAmount.asKnown() == null) 0 else 1) +
                            (if (prorated.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MinimumConfig &&
                            minimumAmount == other.minimumAmount &&
                            prorated == other.prorated &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(minimumAmount, prorated, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MinimumConfig{minimumAmount=$minimumAmount, prorated=$prorated, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Minimum &&
                        cadence == other.cadence &&
                        itemId == other.itemId &&
                        minimumConfig == other.minimumConfig &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        currency == other.currency &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        referenceId == other.referenceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        itemId,
                        minimumConfig,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        currency,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        referenceId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Minimum{cadence=$cadence, itemId=$itemId, minimumConfig=$minimumConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddPrice &&
                allocationPrice == other.allocationPrice &&
                planPhaseOrder == other.planPhaseOrder &&
                price == other.price &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(allocationPrice, planPhaseOrder, price, additionalProperties)
        }

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

            return other is RemoveAdjustment &&
                adjustmentId == other.adjustmentId &&
                planPhaseOrder == other.planPhaseOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustmentId, planPhaseOrder, additionalProperties)
        }

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

            return other is RemovePrice &&
                priceId == other.priceId &&
                planPhaseOrder == other.planPhaseOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(priceId, planPhaseOrder, additionalProperties)
        }

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

                return other is Adjustment &&
                    percentageDiscount == other.percentageDiscount &&
                    usageDiscount == other.usageDiscount &&
                    amountDiscount == other.amountDiscount &&
                    minimum == other.minimum &&
                    maximum == other.maximum
            }

            override fun hashCode(): Int =
                Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum)

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

            return other is ReplaceAdjustment &&
                adjustment == other.adjustment &&
                replacesAdjustmentId == other.replacesAdjustmentId &&
                planPhaseOrder == other.planPhaseOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustment, replacesAdjustmentId, planPhaseOrder, additionalProperties)
        }

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
             * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
             */
            fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
                price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

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

            /** Alias for calling [price] with `Price.ofMinimum(minimum)`. */
            fun price(minimum: Price.Minimum) = price(Price.ofMinimum(minimum))

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
            private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
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
            private val minimum: Minimum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewPlanUnitPrice? = unit

            fun package_(): NewPlanPackagePrice? = package_

            fun matrix(): NewPlanMatrixPrice? = matrix

            fun tiered(): NewPlanTieredPrice? = tiered

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

            fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
                groupedWithMinMaxThresholds

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

            fun minimum(): Minimum? = minimum

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

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

            fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

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

            fun isMinimum(): Boolean = minimum != null

            fun asUnit(): NewPlanUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewPlanPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewPlanMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewPlanTieredPrice = tiered.getOrThrow("tiered")

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

            fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
                groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

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

            fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
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
                    groupedWithMinMaxThresholds != null ->
                        visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
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
                    minimum != null -> visitor.visitMinimum(minimum)
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

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) {
                            groupedWithMinMaxThresholds.validate()
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

                        override fun visitMinimum(minimum: Minimum) {
                            minimum.validate()
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

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) = groupedWithMinMaxThresholds.validity()

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

                        override fun visitMinimum(minimum: Minimum) = minimum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    tiered == other.tiered &&
                    bulk == other.bulk &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    unitWithPercent == other.unitWithPercent &&
                    packageWithAllocation == other.packageWithAllocation &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    bulkWithProration == other.bulkWithProration &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    groupedTiered == other.groupedTiered &&
                    minimum == other.minimum
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    package_,
                    matrix,
                    tiered,
                    bulk,
                    thresholdTotalAmount,
                    tieredPackage,
                    tieredWithMinimum,
                    unitWithPercent,
                    packageWithAllocation,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    groupedWithProratedMinimum,
                    groupedWithMeteredMinimum,
                    groupedWithMinMaxThresholds,
                    matrixWithDisplayName,
                    bulkWithProration,
                    groupedTieredPackage,
                    maxGroupTieredPackage,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    tieredPackageWithMinimum,
                    matrixWithAllocation,
                    groupedTiered,
                    minimum,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
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
                    groupedWithMinMaxThresholds != null ->
                        "Price{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
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
                    minimum != null -> "Price{minimum=$minimum}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewPlanUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewPlanPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewPlanMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewPlanTieredPrice) = Price(tiered = tiered)

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

                fun ofGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ) = Price(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

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

                fun ofMinimum(minimum: Minimum) = Price(minimum = minimum)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewPlanUnitPrice): T

                fun visitPackage(package_: NewPlanPackagePrice): T

                fun visitMatrix(matrix: NewPlanMatrixPrice): T

                fun visitTiered(tiered: NewPlanTieredPrice): T

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

                fun visitGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
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

                fun visitMinimum(minimum: Minimum): T

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
                        "grouped_with_min_max_thresholds" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<GroupedWithMinMaxThresholds>(),
                                )
                                ?.let { Price(groupedWithMinMaxThresholds = it, _json = json) }
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
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                                Price(minimum = it, _json = json)
                            } ?: Price(_json = json)
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
                        value.groupedWithMinMaxThresholds != null ->
                            generator.writeObject(value.groupedWithMinMaxThresholds)
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
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }

            class GroupedWithMinMaxThresholds
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val groupedWithMinMaxThresholdsConfig:
                    JsonField<GroupedWithMinMaxThresholdsConfig>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val currency: JsonField<String>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val referenceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("grouped_with_min_max_thresholds_config")
                    @ExcludeMissing
                    groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig> =
                        JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("reference_id")
                    @ExcludeMissing
                    referenceId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    cadence,
                    groupedWithMinMaxThresholdsConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    currency,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    referenceId,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupedWithMinMaxThresholdsConfig(): GroupedWithMinMaxThresholdsConfig =
                    groupedWithMinMaxThresholdsConfig.getRequired(
                        "grouped_with_min_max_thresholds_config"
                    )

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("grouped_with_min_max_thresholds")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                 * price is billed.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun currency(): String? = currency.getNullable("currency")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A transient ID that can be used to reference this price when adding adjustments
                 * in the same API call.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun referenceId(): String? = referenceId.getNullable("reference_id")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [groupedWithMinMaxThresholdsConfig].
                 *
                 * Unlike [groupedWithMinMaxThresholdsConfig], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("grouped_with_min_max_thresholds_config")
                @ExcludeMissing
                fun _groupedWithMinMaxThresholdsConfig():
                    JsonField<GroupedWithMinMaxThresholdsConfig> = groupedWithMinMaxThresholdsConfig

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [referenceId].
                 *
                 * Unlike [referenceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reference_id")
                @ExcludeMissing
                fun _referenceId(): JsonField<String> = referenceId

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
                     * [GroupedWithMinMaxThresholds].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholds]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig>? =
                        null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue =
                        JsonValue.from("grouped_with_min_max_thresholds")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var referenceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds) =
                        apply {
                            cadence = groupedWithMinMaxThresholds.cadence
                            groupedWithMinMaxThresholdsConfig =
                                groupedWithMinMaxThresholds.groupedWithMinMaxThresholdsConfig
                            itemId = groupedWithMinMaxThresholds.itemId
                            modelType = groupedWithMinMaxThresholds.modelType
                            name = groupedWithMinMaxThresholds.name
                            billableMetricId = groupedWithMinMaxThresholds.billableMetricId
                            billedInAdvance = groupedWithMinMaxThresholds.billedInAdvance
                            billingCycleConfiguration =
                                groupedWithMinMaxThresholds.billingCycleConfiguration
                            conversionRate = groupedWithMinMaxThresholds.conversionRate
                            conversionRateConfig = groupedWithMinMaxThresholds.conversionRateConfig
                            currency = groupedWithMinMaxThresholds.currency
                            dimensionalPriceConfiguration =
                                groupedWithMinMaxThresholds.dimensionalPriceConfiguration
                            externalPriceId = groupedWithMinMaxThresholds.externalPriceId
                            fixedPriceQuantity = groupedWithMinMaxThresholds.fixedPriceQuantity
                            invoiceGroupingKey = groupedWithMinMaxThresholds.invoiceGroupingKey
                            invoicingCycleConfiguration =
                                groupedWithMinMaxThresholds.invoicingCycleConfiguration
                            metadata = groupedWithMinMaxThresholds.metadata
                            referenceId = groupedWithMinMaxThresholds.referenceId
                            additionalProperties =
                                groupedWithMinMaxThresholds.additionalProperties.toMutableMap()
                        }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) =
                        groupedWithMinMaxThresholdsConfig(
                            JsonField.of(groupedWithMinMaxThresholdsConfig)
                        )

                    /**
                     * Sets [Builder.groupedWithMinMaxThresholdsConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupedWithMinMaxThresholdsConfig] with a
                     * well-typed [GroupedWithMinMaxThresholdsConfig] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig:
                            JsonField<GroupedWithMinMaxThresholdsConfig>
                    ) = apply {
                        this.groupedWithMinMaxThresholdsConfig = groupedWithMinMaxThresholdsConfig
                    }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("grouped_with_min_max_thresholds")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /**
                     * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                     * price is billed.
                     */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A transient ID that can be used to reference this price when adding
                     * adjustments in the same API call.
                     */
                    fun referenceId(referenceId: String?) =
                        referenceId(JsonField.ofNullable(referenceId))

                    /**
                     * Sets [Builder.referenceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.referenceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun referenceId(referenceId: JsonField<String>) = apply {
                        this.referenceId = referenceId
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
                     * Returns an immutable instance of [GroupedWithMinMaxThresholds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupedWithMinMaxThresholds =
                        GroupedWithMinMaxThresholds(
                            checkRequired("cadence", cadence),
                            checkRequired(
                                "groupedWithMinMaxThresholdsConfig",
                                groupedWithMinMaxThresholdsConfig,
                            ),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            currency,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            referenceId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GroupedWithMinMaxThresholds = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    groupedWithMinMaxThresholdsConfig().validate()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("grouped_with_min_max_thresholds")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    currency()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
                    referenceId()
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
                        (groupedWithMinMaxThresholdsConfig.asKnown()?.validity() ?: 0) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let {
                            if (it == JsonValue.from("grouped_with_min_max_thresholds")) 1 else 0
                        } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (referenceId.asKnown() == null) 0 else 1)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

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

                class GroupedWithMinMaxThresholdsConfig
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [GroupedWithMinMaxThresholdsConfig].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                        ) = apply {
                            additionalProperties =
                                groupedWithMinMaxThresholdsConfig.additionalProperties
                                    .toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [GroupedWithMinMaxThresholdsConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): GroupedWithMinMaxThresholdsConfig =
                            GroupedWithMinMaxThresholdsConfig(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupedWithMinMaxThresholdsConfig &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "GroupedWithMinMaxThresholdsConfig{additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupedWithMinMaxThresholds &&
                        cadence == other.cadence &&
                        groupedWithMinMaxThresholdsConfig ==
                            other.groupedWithMinMaxThresholdsConfig &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        currency == other.currency &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        referenceId == other.referenceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        groupedWithMinMaxThresholdsConfig,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        currency,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        referenceId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholds{cadence=$cadence, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
            }

            class Minimum
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val itemId: JsonField<String>,
                private val minimumConfig: JsonField<MinimumConfig>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val currency: JsonField<String>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val referenceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_config")
                    @ExcludeMissing
                    minimumConfig: JsonField<MinimumConfig> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("reference_id")
                    @ExcludeMissing
                    referenceId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    cadence,
                    itemId,
                    minimumConfig,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    currency,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    referenceId,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumConfig(): MinimumConfig = minimumConfig.getRequired("minimum_config")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("minimum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                 * price is billed.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun currency(): String? = currency.getNullable("currency")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * A transient ID that can be used to reference this price when adding adjustments
                 * in the same API call.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun referenceId(): String? = referenceId.getNullable("reference_id")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [minimumConfig].
                 *
                 * Unlike [minimumConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_config")
                @ExcludeMissing
                fun _minimumConfig(): JsonField<MinimumConfig> = minimumConfig

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Returns the raw JSON value of [referenceId].
                 *
                 * Unlike [referenceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reference_id")
                @ExcludeMissing
                fun _referenceId(): JsonField<String> = referenceId

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
                     * Returns a mutable builder for constructing an instance of [Minimum].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .itemId()
                     * .minimumConfig()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Minimum]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumConfig: JsonField<MinimumConfig>? = null
                    private var modelType: JsonValue = JsonValue.from("minimum")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var referenceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(minimum: Minimum) = apply {
                        cadence = minimum.cadence
                        itemId = minimum.itemId
                        minimumConfig = minimum.minimumConfig
                        modelType = minimum.modelType
                        name = minimum.name
                        billableMetricId = minimum.billableMetricId
                        billedInAdvance = minimum.billedInAdvance
                        billingCycleConfiguration = minimum.billingCycleConfiguration
                        conversionRate = minimum.conversionRate
                        conversionRateConfig = minimum.conversionRateConfig
                        currency = minimum.currency
                        dimensionalPriceConfiguration = minimum.dimensionalPriceConfiguration
                        externalPriceId = minimum.externalPriceId
                        fixedPriceQuantity = minimum.fixedPriceQuantity
                        invoiceGroupingKey = minimum.invoiceGroupingKey
                        invoicingCycleConfiguration = minimum.invoicingCycleConfiguration
                        metadata = minimum.metadata
                        referenceId = minimum.referenceId
                        additionalProperties = minimum.additionalProperties.toMutableMap()
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    fun minimumConfig(minimumConfig: MinimumConfig) =
                        minimumConfig(JsonField.of(minimumConfig))

                    /**
                     * Sets [Builder.minimumConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumConfig] with a well-typed
                     * [MinimumConfig] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun minimumConfig(minimumConfig: JsonField<MinimumConfig>) = apply {
                        this.minimumConfig = minimumConfig
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("minimum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /**
                     * An ISO 4217 currency string, or custom pricing unit identifier, in which this
                     * price is billed.
                     */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A transient ID that can be used to reference this price when adding
                     * adjustments in the same API call.
                     */
                    fun referenceId(referenceId: String?) =
                        referenceId(JsonField.ofNullable(referenceId))

                    /**
                     * Sets [Builder.referenceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.referenceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun referenceId(referenceId: JsonField<String>) = apply {
                        this.referenceId = referenceId
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
                     * Returns an immutable instance of [Minimum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .itemId()
                     * .minimumConfig()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Minimum =
                        Minimum(
                            checkRequired("cadence", cadence),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumConfig", minimumConfig),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            currency,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            referenceId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Minimum = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    itemId()
                    minimumConfig().validate()
                    _modelType().let {
                        if (it != JsonValue.from("minimum")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    currency()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
                    referenceId()
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
                        (if (itemId.asKnown() == null) 0 else 1) +
                        (minimumConfig.asKnown()?.validity() ?: 0) +
                        modelType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0) +
                        (if (referenceId.asKnown() == null) 0 else 1)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

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

                class MinimumConfig
                private constructor(
                    private val minimumAmount: JsonField<String>,
                    private val prorated: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("minimum_amount")
                        @ExcludeMissing
                        minimumAmount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("prorated")
                        @ExcludeMissing
                        prorated: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(minimumAmount, prorated, mutableMapOf())

                    /**
                     * The minimum amount to apply
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                    /**
                     * By default, subtotals from minimum composite prices are prorated based on the
                     * service period. Set to false to disable proration.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun prorated(): Boolean? = prorated.getNullable("prorated")

                    /**
                     * Returns the raw JSON value of [minimumAmount].
                     *
                     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun _minimumAmount(): JsonField<String> = minimumAmount

                    /**
                     * Returns the raw JSON value of [prorated].
                     *
                     * Unlike [prorated], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prorated")
                    @ExcludeMissing
                    fun _prorated(): JsonField<Boolean> = prorated

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
                         * [MinimumConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .minimumAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [MinimumConfig]. */
                    class Builder internal constructor() {

                        private var minimumAmount: JsonField<String>? = null
                        private var prorated: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(minimumConfig: MinimumConfig) = apply {
                            minimumAmount = minimumConfig.minimumAmount
                            prorated = minimumConfig.prorated
                            additionalProperties = minimumConfig.additionalProperties.toMutableMap()
                        }

                        /** The minimum amount to apply */
                        fun minimumAmount(minimumAmount: String) =
                            minimumAmount(JsonField.of(minimumAmount))

                        /**
                         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minimumAmount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                            this.minimumAmount = minimumAmount
                        }

                        /**
                         * By default, subtotals from minimum composite prices are prorated based on
                         * the service period. Set to false to disable proration.
                         */
                        fun prorated(prorated: Boolean?) = prorated(JsonField.ofNullable(prorated))

                        /**
                         * Alias for [Builder.prorated].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun prorated(prorated: Boolean) = prorated(prorated as Boolean?)

                        /**
                         * Sets [Builder.prorated] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prorated] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prorated(prorated: JsonField<Boolean>) = apply {
                            this.prorated = prorated
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MinimumConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .minimumAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MinimumConfig =
                            MinimumConfig(
                                checkRequired("minimumAmount", minimumAmount),
                                prorated,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): MinimumConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        minimumAmount()
                        prorated()
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
                        (if (minimumAmount.asKnown() == null) 0 else 1) +
                            (if (prorated.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MinimumConfig &&
                            minimumAmount == other.minimumAmount &&
                            prorated == other.prorated &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(minimumAmount, prorated, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MinimumConfig{minimumAmount=$minimumAmount, prorated=$prorated, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                class Metadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Minimum &&
                        cadence == other.cadence &&
                        itemId == other.itemId &&
                        minimumConfig == other.minimumConfig &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        currency == other.currency &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        referenceId == other.referenceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        itemId,
                        minimumConfig,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        currency,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        referenceId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Minimum{cadence=$cadence, itemId=$itemId, minimumConfig=$minimumConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReplacePrice &&
                replacesPriceId == other.replacesPriceId &&
                allocationPrice == other.allocationPrice &&
                planPhaseOrder == other.planPhaseOrder &&
                price == other.price &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                replacesPriceId,
                allocationPrice,
                planPhaseOrder,
                price,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplacePrice{replacesPriceId=$replacesPriceId, allocationPrice=$allocationPrice, planPhaseOrder=$planPhaseOrder, price=$price, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BetaCreatePlanVersionParams &&
            planId == other.planId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(planId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BetaCreatePlanVersionParams{planId=$planId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
