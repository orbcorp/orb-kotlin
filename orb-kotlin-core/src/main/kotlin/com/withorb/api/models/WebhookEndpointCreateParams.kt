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
 * This endpoint creates a webhook endpoint and returns the secret used to sign its webhook events.
 * The secret isn't returned by any other endpoint. An account can have at most 20 webhook endpoints
 * by default.
 */
class WebhookEndpointCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The HTTPS URL that Orb sends webhook events to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * The webhook event types to send to this endpoint. If omitted or null, all event types are
     * sent.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun enabledEventTypes(): List<String>? = body.enabledEventTypes()

    /**
     * The payload style of the webhook events sent to this endpoint. If omitted or null, the
     * account's default style is used.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun payloadStyle(): PayloadStyle? = body.payloadStyle()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [enabledEventTypes].
     *
     * Unlike [enabledEventTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _enabledEventTypes(): JsonField<List<String>> = body._enabledEventTypes()

    /**
     * Returns the raw JSON value of [payloadStyle].
     *
     * Unlike [payloadStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payloadStyle(): JsonField<PayloadStyle> = body._payloadStyle()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEndpointCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .url()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookEndpointCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(webhookEndpointCreateParams: WebhookEndpointCreateParams) = apply {
            body = webhookEndpointCreateParams.body.toBuilder()
            additionalHeaders = webhookEndpointCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookEndpointCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [enabledEventTypes]
         * - [payloadStyle]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The HTTPS URL that Orb sends webhook events to. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /**
         * The webhook event types to send to this endpoint. If omitted or null, all event types are
         * sent.
         */
        fun enabledEventTypes(enabledEventTypes: List<String>?) = apply {
            body.enabledEventTypes(enabledEventTypes)
        }

        /**
         * Sets [Builder.enabledEventTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabledEventTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enabledEventTypes(enabledEventTypes: JsonField<List<String>>) = apply {
            body.enabledEventTypes(enabledEventTypes)
        }

        /**
         * Adds a single [String] to [enabledEventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnabledEventType(enabledEventType: String) = apply {
            body.addEnabledEventType(enabledEventType)
        }

        /**
         * The payload style of the webhook events sent to this endpoint. If omitted or null, the
         * account's default style is used.
         */
        fun payloadStyle(payloadStyle: PayloadStyle?) = apply { body.payloadStyle(payloadStyle) }

        /**
         * Sets [Builder.payloadStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadStyle] with a well-typed [PayloadStyle] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloadStyle(payloadStyle: JsonField<PayloadStyle>) = apply {
            body.payloadStyle(payloadStyle)
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
         * Returns an immutable instance of [WebhookEndpointCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookEndpointCreateParams =
            WebhookEndpointCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val enabledEventTypes: JsonField<List<String>>,
        private val payloadStyle: JsonField<PayloadStyle>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled_event_types")
            @ExcludeMissing
            enabledEventTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("payload_style")
            @ExcludeMissing
            payloadStyle: JsonField<PayloadStyle> = JsonMissing.of(),
        ) : this(url, enabledEventTypes, payloadStyle, mutableMapOf())

        /**
         * The HTTPS URL that Orb sends webhook events to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * The webhook event types to send to this endpoint. If omitted or null, all event types are
         * sent.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabledEventTypes(): List<String>? =
            enabledEventTypes.getNullable("enabled_event_types")

        /**
         * The payload style of the webhook events sent to this endpoint. If omitted or null, the
         * account's default style is used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payloadStyle(): PayloadStyle? = payloadStyle.getNullable("payload_style")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [enabledEventTypes].
         *
         * Unlike [enabledEventTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enabled_event_types")
        @ExcludeMissing
        fun _enabledEventTypes(): JsonField<List<String>> = enabledEventTypes

        /**
         * Returns the raw JSON value of [payloadStyle].
         *
         * Unlike [payloadStyle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payload_style")
        @ExcludeMissing
        fun _payloadStyle(): JsonField<PayloadStyle> = payloadStyle

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
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var enabledEventTypes: JsonField<MutableList<String>>? = null
            private var payloadStyle: JsonField<PayloadStyle> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                url = body.url
                enabledEventTypes = body.enabledEventTypes.map { it.toMutableList() }
                payloadStyle = body.payloadStyle
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The HTTPS URL that Orb sends webhook events to. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * The webhook event types to send to this endpoint. If omitted or null, all event types
             * are sent.
             */
            fun enabledEventTypes(enabledEventTypes: List<String>?) =
                enabledEventTypes(JsonField.ofNullable(enabledEventTypes))

            /**
             * Sets [Builder.enabledEventTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabledEventTypes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enabledEventTypes(enabledEventTypes: JsonField<List<String>>) = apply {
                this.enabledEventTypes = enabledEventTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enabledEventTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnabledEventType(enabledEventType: String) = apply {
                enabledEventTypes =
                    (enabledEventTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enabledEventTypes", it).add(enabledEventType)
                    }
            }

            /**
             * The payload style of the webhook events sent to this endpoint. If omitted or null,
             * the account's default style is used.
             */
            fun payloadStyle(payloadStyle: PayloadStyle?) =
                payloadStyle(JsonField.ofNullable(payloadStyle))

            /**
             * Sets [Builder.payloadStyle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadStyle] with a well-typed [PayloadStyle] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadStyle(payloadStyle: JsonField<PayloadStyle>) = apply {
                this.payloadStyle = payloadStyle
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
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("url", url),
                    (enabledEventTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    payloadStyle,
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

            url()
            enabledEventTypes()
            payloadStyle()?.validate()
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
            (if (url.asKnown() == null) 0 else 1) +
                (enabledEventTypes.asKnown()?.size ?: 0) +
                (payloadStyle.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                enabledEventTypes == other.enabledEventTypes &&
                payloadStyle == other.payloadStyle &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, enabledEventTypes, payloadStyle, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, enabledEventTypes=$enabledEventTypes, payloadStyle=$payloadStyle, additionalProperties=$additionalProperties}"
    }

    /**
     * The payload style of the webhook events sent to this endpoint. If omitted or null, the
     * account's default style is used.
     */
    class PayloadStyle @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val EXPANDED = of("expanded")

            val STANDARD = of("standard")

            fun of(value: String) = PayloadStyle(JsonField.of(value))
        }

        /** An enum containing [PayloadStyle]'s known values. */
        enum class Known {
            EXPANDED,
            STANDARD,
        }

        /**
         * An enum containing [PayloadStyle]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayloadStyle] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPANDED,
            STANDARD,
            /**
             * An enum member indicating that [PayloadStyle] was instantiated with an unknown value.
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
                EXPANDED -> Value.EXPANDED
                STANDARD -> Value.STANDARD
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
                EXPANDED -> Known.EXPANDED
                STANDARD -> Known.STANDARD
                else -> throw OrbInvalidDataException("Unknown PayloadStyle: $value")
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
        fun validate(): PayloadStyle = apply {
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

            return other is PayloadStyle && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEndpointCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookEndpointCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
