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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LicenseRetrieveByExternalIdResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val endDate: JsonField<OffsetDateTime>,
    private val externalLicenseId: JsonField<String>,
    private val licenseTypeId: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_license_id")
        @ExcludeMissing
        externalLicenseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license_type_id")
        @ExcludeMissing
        licenseTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        endDate,
        externalLicenseId,
        licenseTypeId,
        startDate,
        status,
        subscriptionId,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalLicenseId(): String = externalLicenseId.getRequired("external_license_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseTypeId(): String = licenseTypeId.getRequired("license_type_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

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
     * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("license_type_id")
    @ExcludeMissing
    fun _licenseTypeId(): JsonField<String> = licenseTypeId

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

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
         * [LicenseRetrieveByExternalIdResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .endDate()
         * .externalLicenseId()
         * .licenseTypeId()
         * .startDate()
         * .status()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseRetrieveByExternalIdResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var externalLicenseId: JsonField<String>? = null
        private var licenseTypeId: JsonField<String>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var subscriptionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            licenseRetrieveByExternalIdResponse: LicenseRetrieveByExternalIdResponse
        ) = apply {
            id = licenseRetrieveByExternalIdResponse.id
            endDate = licenseRetrieveByExternalIdResponse.endDate
            externalLicenseId = licenseRetrieveByExternalIdResponse.externalLicenseId
            licenseTypeId = licenseRetrieveByExternalIdResponse.licenseTypeId
            startDate = licenseRetrieveByExternalIdResponse.startDate
            status = licenseRetrieveByExternalIdResponse.status
            subscriptionId = licenseRetrieveByExternalIdResponse.subscriptionId
            additionalProperties =
                licenseRetrieveByExternalIdResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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
         * You should usually call [Builder.licenseTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
            this.licenseTypeId = licenseTypeId
        }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

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
         * Returns an immutable instance of [LicenseRetrieveByExternalIdResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .endDate()
         * .externalLicenseId()
         * .licenseTypeId()
         * .startDate()
         * .status()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseRetrieveByExternalIdResponse =
            LicenseRetrieveByExternalIdResponse(
                checkRequired("id", id),
                checkRequired("endDate", endDate),
                checkRequired("externalLicenseId", externalLicenseId),
                checkRequired("licenseTypeId", licenseTypeId),
                checkRequired("startDate", startDate),
                checkRequired("status", status),
                checkRequired("subscriptionId", subscriptionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseRetrieveByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        endDate()
        externalLicenseId()
        licenseTypeId()
        startDate()
        status().validate()
        subscriptionId()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (externalLicenseId.asKnown() == null) 0 else 1) +
            (if (licenseTypeId.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACTIVE = of("active")

            val INACTIVE = of("inactive")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
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
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw OrbInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseRetrieveByExternalIdResponse &&
            id == other.id &&
            endDate == other.endDate &&
            externalLicenseId == other.externalLicenseId &&
            licenseTypeId == other.licenseTypeId &&
            startDate == other.startDate &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            endDate,
            externalLicenseId,
            licenseTypeId,
            startDate,
            status,
            subscriptionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseRetrieveByExternalIdResponse{id=$id, endDate=$endDate, externalLicenseId=$externalLicenseId, licenseTypeId=$licenseTypeId, startDate=$startDate, status=$status, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
