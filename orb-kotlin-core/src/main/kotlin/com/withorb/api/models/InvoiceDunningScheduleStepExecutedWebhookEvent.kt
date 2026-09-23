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

/** Issued when a dunning schedule step is executed. */
class InvoiceDunningScheduleStepExecutedWebhookEvent
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
         * [InvoiceDunningScheduleStepExecutedWebhookEvent].
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

    /** A builder for [InvoiceDunningScheduleStepExecutedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var invoice: JsonField<Invoice>? = null
        private var properties: JsonField<Properties>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            invoiceDunningScheduleStepExecutedWebhookEvent:
                InvoiceDunningScheduleStepExecutedWebhookEvent
        ) = apply {
            id = invoiceDunningScheduleStepExecutedWebhookEvent.id
            createdAt = invoiceDunningScheduleStepExecutedWebhookEvent.createdAt
            invoice = invoiceDunningScheduleStepExecutedWebhookEvent.invoice
            properties = invoiceDunningScheduleStepExecutedWebhookEvent.properties
            type = invoiceDunningScheduleStepExecutedWebhookEvent.type
            additionalProperties =
                invoiceDunningScheduleStepExecutedWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [InvoiceDunningScheduleStepExecutedWebhookEvent].
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
        fun build(): InvoiceDunningScheduleStepExecutedWebhookEvent =
            InvoiceDunningScheduleStepExecutedWebhookEvent(
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
    fun validate(): InvoiceDunningScheduleStepExecutedWebhookEvent = apply {
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
        private val dunningStep: JsonField<DunningStep>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dunning_step")
            @ExcludeMissing
            dunningStep: JsonField<DunningStep> = JsonMissing.of()
        ) : this(dunningStep, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dunningStep(): DunningStep = dunningStep.getRequired("dunning_step")

        /**
         * Returns the raw JSON value of [dunningStep].
         *
         * Unlike [dunningStep], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dunning_step")
        @ExcludeMissing
        fun _dunningStep(): JsonField<DunningStep> = dunningStep

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
             * .dunningStep()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var dunningStep: JsonField<DunningStep>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                dunningStep = properties.dunningStep
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            fun dunningStep(dunningStep: DunningStep) = dunningStep(JsonField.of(dunningStep))

            /**
             * Sets [Builder.dunningStep] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dunningStep] with a well-typed [DunningStep] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dunningStep(dunningStep: JsonField<DunningStep>) = apply {
                this.dunningStep = dunningStep
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
             * .dunningStep()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("dunningStep", dunningStep),
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

            dunningStep().validate()
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
        internal fun validity(): Int = (dunningStep.asKnown()?.validity() ?: 0)

        class DunningStep
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actions: JsonField<List<String>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val executionTime: JsonField<OffsetDateTime>,
            private val manuallyTriggeredAt: JsonField<OffsetDateTime>,
            private val modifiedAt: JsonField<OffsetDateTime>,
            private val status: JsonField<String>,
            private val stepNumber: JsonField<Long>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("execution_time")
                @ExcludeMissing
                executionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("manually_triggered_at")
                @ExcludeMissing
                manuallyTriggeredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("modified_at")
                @ExcludeMissing
                modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("step_number")
                @ExcludeMissing
                stepNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                actions,
                createdAt,
                executionTime,
                manuallyTriggeredAt,
                modifiedAt,
                status,
                stepNumber,
                timestamp,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actions(): List<String> = actions.getRequired("actions")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun executionTime(): OffsetDateTime? = executionTime.getNullable("execution_time")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun manuallyTriggeredAt(): OffsetDateTime? =
                manuallyTriggeredAt.getNullable("manually_triggered_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun modifiedAt(): OffsetDateTime? = modifiedAt.getNullable("modified_at")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): String = status.getRequired("status")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun stepNumber(): Long? = stepNumber.getNullable("step_number")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun timestamp(): OffsetDateTime? = timestamp.getNullable("timestamp")

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<String>> = actions

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
             * Returns the raw JSON value of [executionTime].
             *
             * Unlike [executionTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("execution_time")
            @ExcludeMissing
            fun _executionTime(): JsonField<OffsetDateTime> = executionTime

            /**
             * Returns the raw JSON value of [manuallyTriggeredAt].
             *
             * Unlike [manuallyTriggeredAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("manually_triggered_at")
            @ExcludeMissing
            fun _manuallyTriggeredAt(): JsonField<OffsetDateTime> = manuallyTriggeredAt

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
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            /**
             * Returns the raw JSON value of [stepNumber].
             *
             * Unlike [stepNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("step_number")
            @ExcludeMissing
            fun _stepNumber(): JsonField<Long> = stepNumber

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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
                 * Returns a mutable builder for constructing an instance of [DunningStep].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .actions()
                 * .createdAt()
                 * .executionTime()
                 * .manuallyTriggeredAt()
                 * .modifiedAt()
                 * .status()
                 * .stepNumber()
                 * .timestamp()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DunningStep]. */
            class Builder internal constructor() {

                private var actions: JsonField<MutableList<String>>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var executionTime: JsonField<OffsetDateTime>? = null
                private var manuallyTriggeredAt: JsonField<OffsetDateTime>? = null
                private var modifiedAt: JsonField<OffsetDateTime>? = null
                private var status: JsonField<String>? = null
                private var stepNumber: JsonField<Long>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dunningStep: DunningStep) = apply {
                    actions = dunningStep.actions.map { it.toMutableList() }
                    createdAt = dunningStep.createdAt
                    executionTime = dunningStep.executionTime
                    manuallyTriggeredAt = dunningStep.manuallyTriggeredAt
                    modifiedAt = dunningStep.modifiedAt
                    status = dunningStep.status
                    stepNumber = dunningStep.stepNumber
                    timestamp = dunningStep.timestamp
                    additionalProperties = dunningStep.additionalProperties.toMutableMap()
                }

                fun actions(actions: List<String>) = actions(JsonField.of(actions))

                /**
                 * Sets [Builder.actions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actions] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun actions(actions: JsonField<List<String>>) = apply {
                    this.actions = actions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [actions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAction(action: String) = apply {
                    actions =
                        (actions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("actions", it).add(action)
                        }
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

                fun executionTime(executionTime: OffsetDateTime?) =
                    executionTime(JsonField.ofNullable(executionTime))

                /**
                 * Sets [Builder.executionTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.executionTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun executionTime(executionTime: JsonField<OffsetDateTime>) = apply {
                    this.executionTime = executionTime
                }

                fun manuallyTriggeredAt(manuallyTriggeredAt: OffsetDateTime?) =
                    manuallyTriggeredAt(JsonField.ofNullable(manuallyTriggeredAt))

                /**
                 * Sets [Builder.manuallyTriggeredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.manuallyTriggeredAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun manuallyTriggeredAt(manuallyTriggeredAt: JsonField<OffsetDateTime>) = apply {
                    this.manuallyTriggeredAt = manuallyTriggeredAt
                }

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

                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                fun stepNumber(stepNumber: Long?) = stepNumber(JsonField.ofNullable(stepNumber))

                /**
                 * Alias for [Builder.stepNumber].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun stepNumber(stepNumber: Long) = stepNumber(stepNumber as Long?)

                /**
                 * Sets [Builder.stepNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stepNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stepNumber(stepNumber: JsonField<Long>) = apply { this.stepNumber = stepNumber }

                fun timestamp(timestamp: OffsetDateTime?) =
                    timestamp(JsonField.ofNullable(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
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
                 * Returns an immutable instance of [DunningStep].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .actions()
                 * .createdAt()
                 * .executionTime()
                 * .manuallyTriggeredAt()
                 * .modifiedAt()
                 * .status()
                 * .stepNumber()
                 * .timestamp()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DunningStep =
                    DunningStep(
                        checkRequired("actions", actions).map { it.toImmutable() },
                        checkRequired("createdAt", createdAt),
                        checkRequired("executionTime", executionTime),
                        checkRequired("manuallyTriggeredAt", manuallyTriggeredAt),
                        checkRequired("modifiedAt", modifiedAt),
                        checkRequired("status", status),
                        checkRequired("stepNumber", stepNumber),
                        checkRequired("timestamp", timestamp),
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
            fun validate(): DunningStep = apply {
                if (validated) {
                    return@apply
                }

                actions()
                createdAt()
                executionTime()
                manuallyTriggeredAt()
                modifiedAt()
                status()
                stepNumber()
                timestamp()
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
                (actions.asKnown()?.size ?: 0) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (executionTime.asKnown() == null) 0 else 1) +
                    (if (manuallyTriggeredAt.asKnown() == null) 0 else 1) +
                    (if (modifiedAt.asKnown() == null) 0 else 1) +
                    (if (status.asKnown() == null) 0 else 1) +
                    (if (stepNumber.asKnown() == null) 0 else 1) +
                    (if (timestamp.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DunningStep &&
                    actions == other.actions &&
                    createdAt == other.createdAt &&
                    executionTime == other.executionTime &&
                    manuallyTriggeredAt == other.manuallyTriggeredAt &&
                    modifiedAt == other.modifiedAt &&
                    status == other.status &&
                    stepNumber == other.stepNumber &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    actions,
                    createdAt,
                    executionTime,
                    manuallyTriggeredAt,
                    modifiedAt,
                    status,
                    stepNumber,
                    timestamp,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DunningStep{actions=$actions, createdAt=$createdAt, executionTime=$executionTime, manuallyTriggeredAt=$manuallyTriggeredAt, modifiedAt=$modifiedAt, status=$status, stepNumber=$stepNumber, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                dunningStep == other.dunningStep &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(dunningStep, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{dunningStep=$dunningStep, additionalProperties=$additionalProperties}"
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

            val INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED =
                of("invoice.dunning_schedule_step_executed")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED
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
            INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED,
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
                INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED ->
                    Value.INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED
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
                INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED ->
                    Known.INVOICE_DUNNING_SCHEDULE_STEP_EXECUTED
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

        return other is InvoiceDunningScheduleStepExecutedWebhookEvent &&
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
        "InvoiceDunningScheduleStepExecutedWebhookEvent{id=$id, createdAt=$createdAt, invoice=$invoice, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
