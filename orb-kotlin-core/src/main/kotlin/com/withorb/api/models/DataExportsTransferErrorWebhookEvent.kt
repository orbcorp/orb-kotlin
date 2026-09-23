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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a data export transfer fails. */
class DataExportsTransferErrorWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<Properties>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, createdAt, properties, type, mutableMapOf())

    /**
     * The ID of this webhook event.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time at which this event was created, to the second.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The event this payload describes.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [DataExportsTransferErrorWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .properties()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DataExportsTransferErrorWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<Properties>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            dataExportsTransferErrorWebhookEvent: DataExportsTransferErrorWebhookEvent
        ) = apply {
            id = dataExportsTransferErrorWebhookEvent.id
            createdAt = dataExportsTransferErrorWebhookEvent.createdAt
            properties = dataExportsTransferErrorWebhookEvent.properties
            type = dataExportsTransferErrorWebhookEvent.type
            additionalProperties =
                dataExportsTransferErrorWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The ID of this webhook event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time at which this event was created, to the second. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /** The event this payload describes. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [DataExportsTransferErrorWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .properties()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportsTransferErrorWebhookEvent =
            DataExportsTransferErrorWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("properties", properties),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): DataExportsTransferErrorWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        properties().validate()
        type().validate()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (properties.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    class Properties
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val destinationName: JsonField<String>,
        private val resources: JsonField<List<String>>,
        private val rowsTransferred: JsonField<Long>,
        private val transferBlamedParty: JsonField<String>,
        private val transferEndedAt: JsonField<OffsetDateTime>,
        private val transferStartedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_name")
            @ExcludeMissing
            destinationName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resources")
            @ExcludeMissing
            resources: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rows_transferred")
            @ExcludeMissing
            rowsTransferred: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("transfer_blamed_party")
            @ExcludeMissing
            transferBlamedParty: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transfer_ended_at")
            @ExcludeMissing
            transferEndedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transfer_started_at")
            @ExcludeMissing
            transferStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            description,
            destinationName,
            resources,
            rowsTransferred,
            transferBlamedParty,
            transferEndedAt,
            transferStartedAt,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationName(): String = destinationName.getRequired("destination_name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resources(): List<String> = resources.getRequired("resources")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rowsTransferred(): Long = rowsTransferred.getRequired("rows_transferred")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferBlamedParty(): String = transferBlamedParty.getRequired("transfer_blamed_party")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferEndedAt(): OffsetDateTime = transferEndedAt.getRequired("transfer_ended_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferStartedAt(): OffsetDateTime =
            transferStartedAt.getRequired("transfer_started_at")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [destinationName].
         *
         * Unlike [destinationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_name")
        @ExcludeMissing
        fun _destinationName(): JsonField<String> = destinationName

        /**
         * Returns the raw JSON value of [resources].
         *
         * Unlike [resources], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resources")
        @ExcludeMissing
        fun _resources(): JsonField<List<String>> = resources

        /**
         * Returns the raw JSON value of [rowsTransferred].
         *
         * Unlike [rowsTransferred], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rows_transferred")
        @ExcludeMissing
        fun _rowsTransferred(): JsonField<Long> = rowsTransferred

        /**
         * Returns the raw JSON value of [transferBlamedParty].
         *
         * Unlike [transferBlamedParty], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transfer_blamed_party")
        @ExcludeMissing
        fun _transferBlamedParty(): JsonField<String> = transferBlamedParty

        /**
         * Returns the raw JSON value of [transferEndedAt].
         *
         * Unlike [transferEndedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transfer_ended_at")
        @ExcludeMissing
        fun _transferEndedAt(): JsonField<OffsetDateTime> = transferEndedAt

        /**
         * Returns the raw JSON value of [transferStartedAt].
         *
         * Unlike [transferStartedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transfer_started_at")
        @ExcludeMissing
        fun _transferStartedAt(): JsonField<OffsetDateTime> = transferStartedAt

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
             * Returns a mutable builder for constructing an instance of [Properties].
             *
             * The following fields are required:
             * ```kotlin
             * .description()
             * .destinationName()
             * .resources()
             * .rowsTransferred()
             * .transferBlamedParty()
             * .transferEndedAt()
             * .transferStartedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var destinationName: JsonField<String>? = null
            private var resources: JsonField<MutableList<String>>? = null
            private var rowsTransferred: JsonField<Long>? = null
            private var transferBlamedParty: JsonField<String>? = null
            private var transferEndedAt: JsonField<OffsetDateTime>? = null
            private var transferStartedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                description = properties.description
                destinationName = properties.destinationName
                resources = properties.resources.map { it.toMutableList() }
                rowsTransferred = properties.rowsTransferred
                transferBlamedParty = properties.transferBlamedParty
                transferEndedAt = properties.transferEndedAt
                transferStartedAt = properties.transferStartedAt
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun destinationName(destinationName: String) =
                destinationName(JsonField.of(destinationName))

            /**
             * Sets [Builder.destinationName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationName(destinationName: JsonField<String>) = apply {
                this.destinationName = destinationName
            }

            fun resources(resources: List<String>) = resources(JsonField.of(resources))

            /**
             * Sets [Builder.resources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resources] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resources(resources: JsonField<List<String>>) = apply {
                this.resources = resources.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [resources].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResource(resource: String) = apply {
                resources =
                    (resources ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resources", it).add(resource)
                    }
            }

            fun rowsTransferred(rowsTransferred: Long) =
                rowsTransferred(JsonField.of(rowsTransferred))

            /**
             * Sets [Builder.rowsTransferred] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rowsTransferred] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rowsTransferred(rowsTransferred: JsonField<Long>) = apply {
                this.rowsTransferred = rowsTransferred
            }

            fun transferBlamedParty(transferBlamedParty: String) =
                transferBlamedParty(JsonField.of(transferBlamedParty))

            /**
             * Sets [Builder.transferBlamedParty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferBlamedParty] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferBlamedParty(transferBlamedParty: JsonField<String>) = apply {
                this.transferBlamedParty = transferBlamedParty
            }

            fun transferEndedAt(transferEndedAt: OffsetDateTime) =
                transferEndedAt(JsonField.of(transferEndedAt))

            /**
             * Sets [Builder.transferEndedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferEndedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferEndedAt(transferEndedAt: JsonField<OffsetDateTime>) = apply {
                this.transferEndedAt = transferEndedAt
            }

            fun transferStartedAt(transferStartedAt: OffsetDateTime) =
                transferStartedAt(JsonField.of(transferStartedAt))

            /**
             * Sets [Builder.transferStartedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferStartedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transferStartedAt(transferStartedAt: JsonField<OffsetDateTime>) = apply {
                this.transferStartedAt = transferStartedAt
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .description()
             * .destinationName()
             * .resources()
             * .rowsTransferred()
             * .transferBlamedParty()
             * .transferEndedAt()
             * .transferStartedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("description", description),
                    checkRequired("destinationName", destinationName),
                    checkRequired("resources", resources).map { it.toImmutable() },
                    checkRequired("rowsTransferred", rowsTransferred),
                    checkRequired("transferBlamedParty", transferBlamedParty),
                    checkRequired("transferEndedAt", transferEndedAt),
                    checkRequired("transferStartedAt", transferStartedAt),
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
        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

            description()
            destinationName()
            resources()
            rowsTransferred()
            transferBlamedParty()
            transferEndedAt()
            transferStartedAt()
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
            (if (description.asKnown() == null) 0 else 1) +
                (if (destinationName.asKnown() == null) 0 else 1) +
                (resources.asKnown()?.size ?: 0) +
                (if (rowsTransferred.asKnown() == null) 0 else 1) +
                (if (transferBlamedParty.asKnown() == null) 0 else 1) +
                (if (transferEndedAt.asKnown() == null) 0 else 1) +
                (if (transferStartedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                description == other.description &&
                destinationName == other.destinationName &&
                resources == other.resources &&
                rowsTransferred == other.rowsTransferred &&
                transferBlamedParty == other.transferBlamedParty &&
                transferEndedAt == other.transferEndedAt &&
                transferStartedAt == other.transferStartedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                destinationName,
                resources,
                rowsTransferred,
                transferBlamedParty,
                transferEndedAt,
                transferStartedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{description=$description, destinationName=$destinationName, resources=$resources, rowsTransferred=$rowsTransferred, transferBlamedParty=$transferBlamedParty, transferEndedAt=$transferEndedAt, transferStartedAt=$transferStartedAt, additionalProperties=$additionalProperties}"
    }

    /** The event this payload describes. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val DATA_EXPORTS_TRANSFER_ERROR = of("data_exports.transfer_error")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DATA_EXPORTS_TRANSFER_ERROR
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DATA_EXPORTS_TRANSFER_ERROR,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                DATA_EXPORTS_TRANSFER_ERROR -> Value.DATA_EXPORTS_TRANSFER_ERROR
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
                DATA_EXPORTS_TRANSFER_ERROR -> Known.DATA_EXPORTS_TRANSFER_ERROR
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportsTransferErrorWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            properties == other.properties &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, properties, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportsTransferErrorWebhookEvent{id=$id, createdAt=$createdAt, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
