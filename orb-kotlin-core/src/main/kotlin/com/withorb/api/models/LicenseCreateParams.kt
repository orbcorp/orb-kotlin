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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * This endpoint is used to create a new license for a user.
 *
 * If a start date is provided, the license will be activated at the **start** of the specified date
 * in the customer's timezone. Otherwise, the activation time will default to the **start** of the
 * current day in the customer's timezone.
 */
class LicenseCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The external identifier for the license.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalLicenseId(): String = body.externalLicenseId()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseTypeId(): String = body.licenseTypeId()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = body.subscriptionId()

    /**
     * The end date of the license. If not provided, the license will remain active until
     * deactivated.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): LocalDate? = body.endDate()

    /**
     * The start date of the license. If not provided, defaults to start of day today in the
     * customer's timezone.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun startDate(): LocalDate? = body.startDate()

    /**
     * Returns the raw JSON value of [externalLicenseId].
     *
     * Unlike [externalLicenseId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalLicenseId(): JsonField<String> = body._externalLicenseId()

    /**
     * Returns the raw JSON value of [licenseTypeId].
     *
     * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _licenseTypeId(): JsonField<String> = body._licenseTypeId()

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriptionId(): JsonField<String> = body._subscriptionId()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<LocalDate> = body._endDate()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .externalLicenseId()
         * .licenseTypeId()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(licenseCreateParams: LicenseCreateParams) = apply {
            body = licenseCreateParams.body.toBuilder()
            additionalHeaders = licenseCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = licenseCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [externalLicenseId]
         * - [licenseTypeId]
         * - [subscriptionId]
         * - [endDate]
         * - [startDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The external identifier for the license. */
        fun externalLicenseId(externalLicenseId: String) = apply {
            body.externalLicenseId(externalLicenseId)
        }

        /**
         * Sets [Builder.externalLicenseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalLicenseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalLicenseId(externalLicenseId: JsonField<String>) = apply {
            body.externalLicenseId(externalLicenseId)
        }

        fun licenseTypeId(licenseTypeId: String) = apply { body.licenseTypeId(licenseTypeId) }

        /**
         * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
            body.licenseTypeId(licenseTypeId)
        }

        fun subscriptionId(subscriptionId: String) = apply { body.subscriptionId(subscriptionId) }

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            body.subscriptionId(subscriptionId)
        }

        /**
         * The end date of the license. If not provided, the license will remain active until
         * deactivated.
         */
        fun endDate(endDate: LocalDate?) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { body.endDate(endDate) }

        /**
         * The start date of the license. If not provided, defaults to start of day today in the
         * customer's timezone.
         */
        fun startDate(startDate: LocalDate?) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

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
         * Returns an immutable instance of [LicenseCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .externalLicenseId()
         * .licenseTypeId()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseCreateParams =
            LicenseCreateParams(
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
        private val externalLicenseId: JsonField<String>,
        private val licenseTypeId: JsonField<String>,
        private val subscriptionId: JsonField<String>,
        private val endDate: JsonField<LocalDate>,
        private val startDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_license_id")
            @ExcludeMissing
            externalLicenseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_type_id")
            @ExcludeMissing
            licenseTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            externalLicenseId,
            licenseTypeId,
            subscriptionId,
            endDate,
            startDate,
            mutableMapOf(),
        )

        /**
         * The external identifier for the license.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalLicenseId(): String = externalLicenseId.getRequired("external_license_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun licenseTypeId(): String = licenseTypeId.getRequired("license_type_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

        /**
         * The end date of the license. If not provided, the license will remain active until
         * deactivated.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): LocalDate? = endDate.getNullable("end_date")

        /**
         * The start date of the license. If not provided, defaults to start of day today in the
         * customer's timezone.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): LocalDate? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [externalLicenseId].
         *
         * Unlike [externalLicenseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_license_id")
        @ExcludeMissing
        fun _externalLicenseId(): JsonField<String> = externalLicenseId

        /**
         * Returns the raw JSON value of [licenseTypeId].
         *
         * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("license_type_id")
        @ExcludeMissing
        fun _licenseTypeId(): JsonField<String> = licenseTypeId

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

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
             * .externalLicenseId()
             * .licenseTypeId()
             * .subscriptionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var externalLicenseId: JsonField<String>? = null
            private var licenseTypeId: JsonField<String>? = null
            private var subscriptionId: JsonField<String>? = null
            private var endDate: JsonField<LocalDate> = JsonMissing.of()
            private var startDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                externalLicenseId = body.externalLicenseId
                licenseTypeId = body.licenseTypeId
                subscriptionId = body.subscriptionId
                endDate = body.endDate
                startDate = body.startDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The external identifier for the license. */
            fun externalLicenseId(externalLicenseId: String) =
                externalLicenseId(JsonField.of(externalLicenseId))

            /**
             * Sets [Builder.externalLicenseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalLicenseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalLicenseId(externalLicenseId: JsonField<String>) = apply {
                this.externalLicenseId = externalLicenseId
            }

            fun licenseTypeId(licenseTypeId: String) = licenseTypeId(JsonField.of(licenseTypeId))

            /**
             * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                this.licenseTypeId = licenseTypeId
            }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /**
             * The end date of the license. If not provided, the license will remain active until
             * deactivated.
             */
            fun endDate(endDate: LocalDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /**
             * The start date of the license. If not provided, defaults to start of day today in the
             * customer's timezone.
             */
            fun startDate(startDate: LocalDate?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

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
             * .externalLicenseId()
             * .licenseTypeId()
             * .subscriptionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("externalLicenseId", externalLicenseId),
                    checkRequired("licenseTypeId", licenseTypeId),
                    checkRequired("subscriptionId", subscriptionId),
                    endDate,
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            externalLicenseId()
            licenseTypeId()
            subscriptionId()
            endDate()
            startDate()
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
            (if (externalLicenseId.asKnown() == null) 0 else 1) +
                (if (licenseTypeId.asKnown() == null) 0 else 1) +
                (if (subscriptionId.asKnown() == null) 0 else 1) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                externalLicenseId == other.externalLicenseId &&
                licenseTypeId == other.licenseTypeId &&
                subscriptionId == other.subscriptionId &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                externalLicenseId,
                licenseTypeId,
                subscriptionId,
                endDate,
                startDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{externalLicenseId=$externalLicenseId, licenseTypeId=$licenseTypeId, subscriptionId=$subscriptionId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LicenseCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
