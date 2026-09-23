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

/** Issued when a dunning schedule is reset. */
class InvoiceDunningScheduleResetWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val invoice: JsonField<Invoice>,
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
        @JsonProperty("invoice") @ExcludeMissing invoice: JsonField<Invoice> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, createdAt, invoice, properties, type, mutableMapOf())

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
     * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
     * request for payment for a single subscription. This includes a set of line items, which
     * correspond to prices in the subscription's plan and can represent fixed recurring fees or
     * usage-based fees. They are generated at the end of a billing period, or as the result of an
     * action, such as a cancellation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoice(): Invoice = invoice.getRequired("invoice")

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
     * Returns the raw JSON value of [invoice].
     *
     * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<Invoice> = invoice

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
         * [InvoiceDunningScheduleResetWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .invoice()
         * .properties()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceDunningScheduleResetWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var invoice: JsonField<Invoice>? = null
        private var properties: JsonField<Properties>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            invoiceDunningScheduleResetWebhookEvent: InvoiceDunningScheduleResetWebhookEvent
        ) = apply {
            id = invoiceDunningScheduleResetWebhookEvent.id
            createdAt = invoiceDunningScheduleResetWebhookEvent.createdAt
            invoice = invoiceDunningScheduleResetWebhookEvent.invoice
            properties = invoiceDunningScheduleResetWebhookEvent.properties
            type = invoiceDunningScheduleResetWebhookEvent.type
            additionalProperties =
                invoiceDunningScheduleResetWebhookEvent.additionalProperties.toMutableMap()
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

        /**
         * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the
         * request for payment for a single subscription. This includes a set of line items, which
         * correspond to prices in the subscription's plan and can represent fixed recurring fees or
         * usage-based fees. They are generated at the end of a billing period, or as the result of
         * an action, such as a cancellation.
         */
        fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

        /**
         * Sets [Builder.invoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoice] with a well-typed [Invoice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

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
         * Returns an immutable instance of [InvoiceDunningScheduleResetWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .invoice()
         * .properties()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceDunningScheduleResetWebhookEvent =
            InvoiceDunningScheduleResetWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("invoice", invoice),
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
    fun validate(): InvoiceDunningScheduleResetWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        invoice().validate()
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
            (invoice.asKnown()?.validity() ?: 0) +
            (properties.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    class Properties
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dunningSchedule: JsonField<DunningSchedule>,
        private val previousSchedule: JsonField<PreviousSchedule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dunning_schedule")
            @ExcludeMissing
            dunningSchedule: JsonField<DunningSchedule> = JsonMissing.of(),
            @JsonProperty("previous_schedule")
            @ExcludeMissing
            previousSchedule: JsonField<PreviousSchedule> = JsonMissing.of(),
        ) : this(dunningSchedule, previousSchedule, mutableMapOf())

        /**
         * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
         * narrower than the schedule's api resource.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dunningSchedule(): DunningSchedule = dunningSchedule.getRequired("dunning_schedule")

        /**
         * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
         * narrower than the schedule's api resource.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun previousSchedule(): PreviousSchedule = previousSchedule.getRequired("previous_schedule")

        /**
         * Returns the raw JSON value of [dunningSchedule].
         *
         * Unlike [dunningSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dunning_schedule")
        @ExcludeMissing
        fun _dunningSchedule(): JsonField<DunningSchedule> = dunningSchedule

        /**
         * Returns the raw JSON value of [previousSchedule].
         *
         * Unlike [previousSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_schedule")
        @ExcludeMissing
        fun _previousSchedule(): JsonField<PreviousSchedule> = previousSchedule

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
             * .dunningSchedule()
             * .previousSchedule()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var dunningSchedule: JsonField<DunningSchedule>? = null
            private var previousSchedule: JsonField<PreviousSchedule>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                dunningSchedule = properties.dunningSchedule
                previousSchedule = properties.previousSchedule
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            /**
             * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
             * narrower than the schedule's api resource.
             */
            fun dunningSchedule(dunningSchedule: DunningSchedule) =
                dunningSchedule(JsonField.of(dunningSchedule))

            /**
             * Sets [Builder.dunningSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dunningSchedule] with a well-typed [DunningSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dunningSchedule(dunningSchedule: JsonField<DunningSchedule>) = apply {
                this.dunningSchedule = dunningSchedule
            }

            /**
             * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
             * narrower than the schedule's api resource.
             */
            fun previousSchedule(previousSchedule: PreviousSchedule) =
                previousSchedule(JsonField.of(previousSchedule))

            /**
             * Sets [Builder.previousSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousSchedule] with a well-typed
             * [PreviousSchedule] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun previousSchedule(previousSchedule: JsonField<PreviousSchedule>) = apply {
                this.previousSchedule = previousSchedule
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
             * .dunningSchedule()
             * .previousSchedule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("dunningSchedule", dunningSchedule),
                    checkRequired("previousSchedule", previousSchedule),
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

            dunningSchedule().validate()
            previousSchedule().validate()
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
            (dunningSchedule.asKnown()?.validity() ?: 0) +
                (previousSchedule.asKnown()?.validity() ?: 0)

        /**
         * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
         * narrower than the schedule's api resource.
         */
        class DunningSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val completionTime: JsonField<OffsetDateTime>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val invoiceId: JsonField<String>,
            private val modifiedAt: JsonField<OffsetDateTime>,
            private val startTime: JsonField<OffsetDateTime>,
            private val status: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("completion_time")
                @ExcludeMissing
                completionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("modified_at")
                @ExcludeMissing
                modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(
                completionTime,
                createdAt,
                invoiceId,
                modifiedAt,
                startTime,
                status,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun completionTime(): OffsetDateTime? = completionTime.getNullable("completion_time")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun modifiedAt(): OffsetDateTime? = modifiedAt.getNullable("modified_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun startTime(): OffsetDateTime? = startTime.getNullable("start_time")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun status(): String? = status.getNullable("status")

            /**
             * Returns the raw JSON value of [completionTime].
             *
             * Unlike [completionTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_time")
            @ExcludeMissing
            fun _completionTime(): JsonField<OffsetDateTime> = completionTime

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [modifiedAt].
             *
             * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("modified_at")
            @ExcludeMissing
            fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
                 * Returns a mutable builder for constructing an instance of [DunningSchedule].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTime()
                 * .createdAt()
                 * .invoiceId()
                 * .modifiedAt()
                 * .startTime()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DunningSchedule]. */
            class Builder internal constructor() {

                private var completionTime: JsonField<OffsetDateTime>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var invoiceId: JsonField<String>? = null
                private var modifiedAt: JsonField<OffsetDateTime>? = null
                private var startTime: JsonField<OffsetDateTime>? = null
                private var status: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dunningSchedule: DunningSchedule) = apply {
                    completionTime = dunningSchedule.completionTime
                    createdAt = dunningSchedule.createdAt
                    invoiceId = dunningSchedule.invoiceId
                    modifiedAt = dunningSchedule.modifiedAt
                    startTime = dunningSchedule.startTime
                    status = dunningSchedule.status
                    additionalProperties = dunningSchedule.additionalProperties.toMutableMap()
                }

                fun completionTime(completionTime: OffsetDateTime?) =
                    completionTime(JsonField.ofNullable(completionTime))

                /**
                 * Sets [Builder.completionTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun completionTime(completionTime: JsonField<OffsetDateTime>) = apply {
                    this.completionTime = completionTime
                }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun modifiedAt(modifiedAt: OffsetDateTime?) =
                    modifiedAt(JsonField.ofNullable(modifiedAt))

                /**
                 * Sets [Builder.modifiedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
                    this.modifiedAt = modifiedAt
                }

                fun startTime(startTime: OffsetDateTime?) =
                    startTime(JsonField.ofNullable(startTime))

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                fun status(status: String?) = status(JsonField.ofNullable(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

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
                 * Returns an immutable instance of [DunningSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTime()
                 * .createdAt()
                 * .invoiceId()
                 * .modifiedAt()
                 * .startTime()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DunningSchedule =
                    DunningSchedule(
                        checkRequired("completionTime", completionTime),
                        checkRequired("createdAt", createdAt),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("modifiedAt", modifiedAt),
                        checkRequired("startTime", startTime),
                        checkRequired("status", status),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DunningSchedule = apply {
                if (validated) {
                    return@apply
                }

                completionTime()
                createdAt()
                invoiceId()
                modifiedAt()
                startTime()
                status()
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
                (if (completionTime.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (invoiceId.asKnown() == null) 0 else 1) +
                    (if (modifiedAt.asKnown() == null) 0 else 1) +
                    (if (startTime.asKnown() == null) 0 else 1) +
                    (if (status.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DunningSchedule &&
                    completionTime == other.completionTime &&
                    createdAt == other.createdAt &&
                    invoiceId == other.invoiceId &&
                    modifiedAt == other.modifiedAt &&
                    startTime == other.startTime &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    completionTime,
                    createdAt,
                    invoiceId,
                    modifiedAt,
                    startTime,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DunningSchedule{completionTime=$completionTime, createdAt=$createdAt, invoiceId=$invoiceId, modifiedAt=$modifiedAt, startTime=$startTime, status=$status, additionalProperties=$additionalProperties}"
        }

        /**
         * The schedule shape `DunningScheduleV2.external_serialization()` produces, which is
         * narrower than the schedule's api resource.
         */
        class PreviousSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val completionTime: JsonField<OffsetDateTime>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val invoiceId: JsonField<String>,
            private val modifiedAt: JsonField<OffsetDateTime>,
            private val startTime: JsonField<OffsetDateTime>,
            private val status: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("completion_time")
                @ExcludeMissing
                completionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("modified_at")
                @ExcludeMissing
                modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            ) : this(
                completionTime,
                createdAt,
                invoiceId,
                modifiedAt,
                startTime,
                status,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun completionTime(): OffsetDateTime? = completionTime.getNullable("completion_time")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun modifiedAt(): OffsetDateTime? = modifiedAt.getNullable("modified_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun startTime(): OffsetDateTime? = startTime.getNullable("start_time")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun status(): String? = status.getNullable("status")

            /**
             * Returns the raw JSON value of [completionTime].
             *
             * Unlike [completionTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_time")
            @ExcludeMissing
            fun _completionTime(): JsonField<OffsetDateTime> = completionTime

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [modifiedAt].
             *
             * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("modified_at")
            @ExcludeMissing
            fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
                 * Returns a mutable builder for constructing an instance of [PreviousSchedule].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTime()
                 * .createdAt()
                 * .invoiceId()
                 * .modifiedAt()
                 * .startTime()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PreviousSchedule]. */
            class Builder internal constructor() {

                private var completionTime: JsonField<OffsetDateTime>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var invoiceId: JsonField<String>? = null
                private var modifiedAt: JsonField<OffsetDateTime>? = null
                private var startTime: JsonField<OffsetDateTime>? = null
                private var status: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(previousSchedule: PreviousSchedule) = apply {
                    completionTime = previousSchedule.completionTime
                    createdAt = previousSchedule.createdAt
                    invoiceId = previousSchedule.invoiceId
                    modifiedAt = previousSchedule.modifiedAt
                    startTime = previousSchedule.startTime
                    status = previousSchedule.status
                    additionalProperties = previousSchedule.additionalProperties.toMutableMap()
                }

                fun completionTime(completionTime: OffsetDateTime?) =
                    completionTime(JsonField.ofNullable(completionTime))

                /**
                 * Sets [Builder.completionTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun completionTime(completionTime: JsonField<OffsetDateTime>) = apply {
                    this.completionTime = completionTime
                }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun modifiedAt(modifiedAt: OffsetDateTime?) =
                    modifiedAt(JsonField.ofNullable(modifiedAt))

                /**
                 * Sets [Builder.modifiedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
                    this.modifiedAt = modifiedAt
                }

                fun startTime(startTime: OffsetDateTime?) =
                    startTime(JsonField.ofNullable(startTime))

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                fun status(status: String?) = status(JsonField.ofNullable(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

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
                 * Returns an immutable instance of [PreviousSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTime()
                 * .createdAt()
                 * .invoiceId()
                 * .modifiedAt()
                 * .startTime()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PreviousSchedule =
                    PreviousSchedule(
                        checkRequired("completionTime", completionTime),
                        checkRequired("createdAt", createdAt),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("modifiedAt", modifiedAt),
                        checkRequired("startTime", startTime),
                        checkRequired("status", status),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PreviousSchedule = apply {
                if (validated) {
                    return@apply
                }

                completionTime()
                createdAt()
                invoiceId()
                modifiedAt()
                startTime()
                status()
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
                (if (completionTime.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (invoiceId.asKnown() == null) 0 else 1) +
                    (if (modifiedAt.asKnown() == null) 0 else 1) +
                    (if (startTime.asKnown() == null) 0 else 1) +
                    (if (status.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PreviousSchedule &&
                    completionTime == other.completionTime &&
                    createdAt == other.createdAt &&
                    invoiceId == other.invoiceId &&
                    modifiedAt == other.modifiedAt &&
                    startTime == other.startTime &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    completionTime,
                    createdAt,
                    invoiceId,
                    modifiedAt,
                    startTime,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PreviousSchedule{completionTime=$completionTime, createdAt=$createdAt, invoiceId=$invoiceId, modifiedAt=$modifiedAt, startTime=$startTime, status=$status, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                dunningSchedule == other.dunningSchedule &&
                previousSchedule == other.previousSchedule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dunningSchedule, previousSchedule, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{dunningSchedule=$dunningSchedule, previousSchedule=$previousSchedule, additionalProperties=$additionalProperties}"
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

            val INVOICE_DUNNING_SCHEDULE_RESET = of("invoice.dunning_schedule_reset")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INVOICE_DUNNING_SCHEDULE_RESET
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
            INVOICE_DUNNING_SCHEDULE_RESET,
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
                INVOICE_DUNNING_SCHEDULE_RESET -> Value.INVOICE_DUNNING_SCHEDULE_RESET
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
                INVOICE_DUNNING_SCHEDULE_RESET -> Known.INVOICE_DUNNING_SCHEDULE_RESET
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

        return other is InvoiceDunningScheduleResetWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            invoice == other.invoice &&
            properties == other.properties &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, invoice, properties, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceDunningScheduleResetWebhookEvent{id=$id, createdAt=$createdAt, invoice=$invoice, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
