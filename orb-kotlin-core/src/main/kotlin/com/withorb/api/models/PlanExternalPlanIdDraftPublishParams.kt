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
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint publishes the plan's draft as the next numbered version. A draft that fails plan
 * version validation is a 400 and is left as it was.
 */
class PlanExternalPlanIdDraftPublishParams
private constructor(
    private val externalPlanId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalPlanId(): String? = externalPlanId

    /**
     * Also make the new version the plan's default.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun setAsDefault(): Boolean? = body.setAsDefault()

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

        fun none(): PlanExternalPlanIdDraftPublishParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlanExternalPlanIdDraftPublishParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanExternalPlanIdDraftPublishParams]. */
    class Builder internal constructor() {

        private var externalPlanId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            planExternalPlanIdDraftPublishParams: PlanExternalPlanIdDraftPublishParams
        ) = apply {
            externalPlanId = planExternalPlanIdDraftPublishParams.externalPlanId
            body = planExternalPlanIdDraftPublishParams.body.toBuilder()
            additionalHeaders = planExternalPlanIdDraftPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                planExternalPlanIdDraftPublishParams.additionalQueryParams.toBuilder()
        }

        fun externalPlanId(externalPlanId: String?) = apply { this.externalPlanId = externalPlanId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [setAsDefault]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Also make the new version the plan's default. */
        fun setAsDefault(setAsDefault: Boolean) = apply { body.setAsDefault(setAsDefault) }

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
         * Returns an immutable instance of [PlanExternalPlanIdDraftPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlanExternalPlanIdDraftPublishParams =
            PlanExternalPlanIdDraftPublishParams(
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val setAsDefault: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("set_as_default")
            @ExcludeMissing
            setAsDefault: JsonField<Boolean> = JsonMissing.of()
        ) : this(setAsDefault, mutableMapOf())

        /**
         * Also make the new version the plan's default.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun setAsDefault(): Boolean? = setAsDefault.getNullable("set_as_default")

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var setAsDefault: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                setAsDefault = body.setAsDefault
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Also make the new version the plan's default. */
            fun setAsDefault(setAsDefault: Boolean) = setAsDefault(JsonField.of(setAsDefault))

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
             */
            fun build(): Body = Body(setAsDefault, additionalProperties.toMutableMap())
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
        internal fun validity(): Int = (if (setAsDefault.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                setAsDefault == other.setAsDefault &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(setAsDefault, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{setAsDefault=$setAsDefault, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanExternalPlanIdDraftPublishParams &&
            externalPlanId == other.externalPlanId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalPlanId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanExternalPlanIdDraftPublishParams{externalPlanId=$externalPlanId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
