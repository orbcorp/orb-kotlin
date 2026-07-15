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
 * Creates a portal session for the customer, returning a short-lived URL that provides
 * authenticated access to the customer's billing portal. The session expires after
 * `expires_in_minutes` (default 60, max 180). By default, creating a new session invalidates any
 * other active portal sessions for the customer; pass `invalidate_existing=false` to allow
 * concurrent sessions.
 */
class CustomerCreatePortalSessionParams
private constructor(
    private val customerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String? = customerId

    /**
     * Duration in minutes until the portal session expires. Defaults to 60. Maximum 180.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun expiresInMinutes(): Long? = body.expiresInMinutes()

    /**
     * When true (default), creating this session soft-deletes any other active portal sessions for
     * the customer. Set to false to allow concurrent sessions — useful when minting portal links
     * for multiple authenticated end-users at once. The customer's permanent portal link (if any)
     * is never invalidated by this.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invalidateExisting(): Boolean? = body.invalidateExisting()

    /**
     * Returns the raw JSON value of [expiresInMinutes].
     *
     * Unlike [expiresInMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expiresInMinutes(): JsonField<Long> = body._expiresInMinutes()

    /**
     * Returns the raw JSON value of [invalidateExisting].
     *
     * Unlike [invalidateExisting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invalidateExisting(): JsonField<Boolean> = body._invalidateExisting()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CustomerCreatePortalSessionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreatePortalSessionParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreatePortalSessionParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCreatePortalSessionParams: CustomerCreatePortalSessionParams) =
            apply {
                customerId = customerCreatePortalSessionParams.customerId
                body = customerCreatePortalSessionParams.body.toBuilder()
                additionalHeaders = customerCreatePortalSessionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerCreatePortalSessionParams.additionalQueryParams.toBuilder()
            }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [expiresInMinutes]
         * - [invalidateExisting]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Duration in minutes until the portal session expires. Defaults to 60. Maximum 180. */
        fun expiresInMinutes(expiresInMinutes: Long) = apply {
            body.expiresInMinutes(expiresInMinutes)
        }

        /**
         * Sets [Builder.expiresInMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresInMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresInMinutes(expiresInMinutes: JsonField<Long>) = apply {
            body.expiresInMinutes(expiresInMinutes)
        }

        /**
         * When true (default), creating this session soft-deletes any other active portal sessions
         * for the customer. Set to false to allow concurrent sessions — useful when minting portal
         * links for multiple authenticated end-users at once. The customer's permanent portal link
         * (if any) is never invalidated by this.
         */
        fun invalidateExisting(invalidateExisting: Boolean) = apply {
            body.invalidateExisting(invalidateExisting)
        }

        /**
         * Sets [Builder.invalidateExisting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidateExisting] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidateExisting(invalidateExisting: JsonField<Boolean>) = apply {
            body.invalidateExisting(invalidateExisting)
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
         * Returns an immutable instance of [CustomerCreatePortalSessionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerCreatePortalSessionParams =
            CustomerCreatePortalSessionParams(
                customerId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresInMinutes: JsonField<Long>,
        private val invalidateExisting: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_in_minutes")
            @ExcludeMissing
            expiresInMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invalidate_existing")
            @ExcludeMissing
            invalidateExisting: JsonField<Boolean> = JsonMissing.of(),
        ) : this(expiresInMinutes, invalidateExisting, mutableMapOf())

        /**
         * Duration in minutes until the portal session expires. Defaults to 60. Maximum 180.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresInMinutes(): Long? = expiresInMinutes.getNullable("expires_in_minutes")

        /**
         * When true (default), creating this session soft-deletes any other active portal sessions
         * for the customer. Set to false to allow concurrent sessions — useful when minting portal
         * links for multiple authenticated end-users at once. The customer's permanent portal link
         * (if any) is never invalidated by this.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invalidateExisting(): Boolean? = invalidateExisting.getNullable("invalidate_existing")

        /**
         * Returns the raw JSON value of [expiresInMinutes].
         *
         * Unlike [expiresInMinutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_in_minutes")
        @ExcludeMissing
        fun _expiresInMinutes(): JsonField<Long> = expiresInMinutes

        /**
         * Returns the raw JSON value of [invalidateExisting].
         *
         * Unlike [invalidateExisting], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invalidate_existing")
        @ExcludeMissing
        fun _invalidateExisting(): JsonField<Boolean> = invalidateExisting

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

            private var expiresInMinutes: JsonField<Long> = JsonMissing.of()
            private var invalidateExisting: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                expiresInMinutes = body.expiresInMinutes
                invalidateExisting = body.invalidateExisting
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Duration in minutes until the portal session expires. Defaults to 60. Maximum 180.
             */
            fun expiresInMinutes(expiresInMinutes: Long) =
                expiresInMinutes(JsonField.of(expiresInMinutes))

            /**
             * Sets [Builder.expiresInMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresInMinutes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresInMinutes(expiresInMinutes: JsonField<Long>) = apply {
                this.expiresInMinutes = expiresInMinutes
            }

            /**
             * When true (default), creating this session soft-deletes any other active portal
             * sessions for the customer. Set to false to allow concurrent sessions — useful when
             * minting portal links for multiple authenticated end-users at once. The customer's
             * permanent portal link (if any) is never invalidated by this.
             */
            fun invalidateExisting(invalidateExisting: Boolean) =
                invalidateExisting(JsonField.of(invalidateExisting))

            /**
             * Sets [Builder.invalidateExisting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invalidateExisting] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invalidateExisting(invalidateExisting: JsonField<Boolean>) = apply {
                this.invalidateExisting = invalidateExisting
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
            fun build(): Body =
                Body(expiresInMinutes, invalidateExisting, additionalProperties.toMutableMap())
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

            expiresInMinutes()
            invalidateExisting()
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
            (if (expiresInMinutes.asKnown() == null) 0 else 1) +
                (if (invalidateExisting.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                expiresInMinutes == other.expiresInMinutes &&
                invalidateExisting == other.invalidateExisting &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresInMinutes, invalidateExisting, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{expiresInMinutes=$expiresInMinutes, invalidateExisting=$invalidateExisting, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreatePortalSessionParams &&
            customerId == other.customerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerCreatePortalSessionParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
