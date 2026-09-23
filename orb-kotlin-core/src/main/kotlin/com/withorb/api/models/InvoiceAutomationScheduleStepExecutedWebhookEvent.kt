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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a collections-automation schedule step is executed for an invoice. */
class InvoiceAutomationScheduleStepExecutedWebhookEvent
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
     * The invoice fields a consumer needs to run their own notification flows without a follow-up
     * API call, mirroring the variables Orb's own automation emails render against.
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
         * [InvoiceAutomationScheduleStepExecutedWebhookEvent].
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

    /** A builder for [InvoiceAutomationScheduleStepExecutedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var invoice: JsonField<Invoice>? = null
        private var properties: JsonField<Properties>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            invoiceAutomationScheduleStepExecutedWebhookEvent:
                InvoiceAutomationScheduleStepExecutedWebhookEvent
        ) = apply {
            id = invoiceAutomationScheduleStepExecutedWebhookEvent.id
            createdAt = invoiceAutomationScheduleStepExecutedWebhookEvent.createdAt
            invoice = invoiceAutomationScheduleStepExecutedWebhookEvent.invoice
            properties = invoiceAutomationScheduleStepExecutedWebhookEvent.properties
            type = invoiceAutomationScheduleStepExecutedWebhookEvent.type
            additionalProperties =
                invoiceAutomationScheduleStepExecutedWebhookEvent.additionalProperties
                    .toMutableMap()
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
         * The invoice fields a consumer needs to run their own notification flows without a
         * follow-up API call, mirroring the variables Orb's own automation emails render against.
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
         * Returns an immutable instance of [InvoiceAutomationScheduleStepExecutedWebhookEvent].
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
        fun build(): InvoiceAutomationScheduleStepExecutedWebhookEvent =
            InvoiceAutomationScheduleStepExecutedWebhookEvent(
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
    fun validate(): InvoiceAutomationScheduleStepExecutedWebhookEvent = apply {
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

    /**
     * The invoice fields a consumer needs to run their own notification flows without a follow-up
     * API call, mirroring the variables Orb's own automation emails render against.
     */
    class Invoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amountDue: JsonField<String>,
        private val currency: JsonField<String>,
        private val customerId: JsonField<String>,
        private val customerName: JsonField<String>,
        private val dueDate: JsonField<LocalDate>,
        private val externalCustomerId: JsonField<String>,
        private val hostedInvoiceUrl: JsonField<String>,
        private val invoiceDate: JsonField<OffsetDateTime>,
        private val invoiceNumber: JsonField<String>,
        private val issuedAt: JsonField<OffsetDateTime>,
        private val memo: JsonField<String>,
        private val paymentMethodLastFourDigits: JsonField<String>,
        private val status: JsonField<String>,
        private val subscriptionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_due")
            @ExcludeMissing
            amountDue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("due_date")
            @ExcludeMissing
            dueDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hosted_invoice_url")
            @ExcludeMissing
            hostedInvoiceUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_date")
            @ExcludeMissing
            invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoice_number")
            @ExcludeMissing
            invoiceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issued_at")
            @ExcludeMissing
            issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_method_last_four_digits")
            @ExcludeMissing
            paymentMethodLastFourDigits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            amountDue,
            currency,
            customerId,
            customerName,
            dueDate,
            externalCustomerId,
            hostedInvoiceUrl,
            invoiceDate,
            invoiceNumber,
            issuedAt,
            memo,
            paymentMethodLastFourDigits,
            status,
            subscriptionId,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountDue(): String = amountDue.getRequired("amount_due")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerName(): String = customerName.getRequired("customer_name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hostedInvoiceUrl(): String? = hostedInvoiceUrl.getNullable("hosted_invoice_url")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceDate(): OffsetDateTime = invoiceDate.getRequired("invoice_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun issuedAt(): OffsetDateTime? = issuedAt.getNullable("issued_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethodLastFourDigits(): String? =
            paymentMethodLastFourDigits.getNullable("payment_method_last_four_digits")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amountDue].
         *
         * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

        /**
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * Returns the raw JSON value of [hostedInvoiceUrl].
         *
         * Unlike [hostedInvoiceUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hosted_invoice_url")
        @ExcludeMissing
        fun _hostedInvoiceUrl(): JsonField<String> = hostedInvoiceUrl

        /**
         * Returns the raw JSON value of [invoiceDate].
         *
         * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

        /**
         * Returns the raw JSON value of [invoiceNumber].
         *
         * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_number")
        @ExcludeMissing
        fun _invoiceNumber(): JsonField<String> = invoiceNumber

        /**
         * Returns the raw JSON value of [issuedAt].
         *
         * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("issued_at")
        @ExcludeMissing
        fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [paymentMethodLastFourDigits].
         *
         * Unlike [paymentMethodLastFourDigits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_method_last_four_digits")
        @ExcludeMissing
        fun _paymentMethodLastFourDigits(): JsonField<String> = paymentMethodLastFourDigits

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Invoice].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amountDue()
             * .currency()
             * .customerId()
             * .customerName()
             * .dueDate()
             * .externalCustomerId()
             * .hostedInvoiceUrl()
             * .invoiceDate()
             * .invoiceNumber()
             * .issuedAt()
             * .memo()
             * .paymentMethodLastFourDigits()
             * .status()
             * .subscriptionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Invoice]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amountDue: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var customerName: JsonField<String>? = null
            private var dueDate: JsonField<LocalDate>? = null
            private var externalCustomerId: JsonField<String>? = null
            private var hostedInvoiceUrl: JsonField<String>? = null
            private var invoiceDate: JsonField<OffsetDateTime>? = null
            private var invoiceNumber: JsonField<String>? = null
            private var issuedAt: JsonField<OffsetDateTime>? = null
            private var memo: JsonField<String>? = null
            private var paymentMethodLastFourDigits: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var subscriptionId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoice: Invoice) = apply {
                id = invoice.id
                amountDue = invoice.amountDue
                currency = invoice.currency
                customerId = invoice.customerId
                customerName = invoice.customerName
                dueDate = invoice.dueDate
                externalCustomerId = invoice.externalCustomerId
                hostedInvoiceUrl = invoice.hostedInvoiceUrl
                invoiceDate = invoice.invoiceDate
                invoiceNumber = invoice.invoiceNumber
                issuedAt = invoice.issuedAt
                memo = invoice.memo
                paymentMethodLastFourDigits = invoice.paymentMethodLastFourDigits
                status = invoice.status
                subscriptionId = invoice.subscriptionId
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

            /**
             * Sets [Builder.amountDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountDue] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun customerName(customerName: String) = customerName(JsonField.of(customerName))

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
            }

            fun dueDate(dueDate: LocalDate?) = dueDate(JsonField.ofNullable(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            fun hostedInvoiceUrl(hostedInvoiceUrl: String?) =
                hostedInvoiceUrl(JsonField.ofNullable(hostedInvoiceUrl))

            /**
             * Sets [Builder.hostedInvoiceUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostedInvoiceUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
                this.hostedInvoiceUrl = hostedInvoiceUrl
            }

            fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

            /**
             * Sets [Builder.invoiceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
                this.invoiceDate = invoiceDate
            }

            fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

            /**
             * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
                this.invoiceNumber = invoiceNumber
            }

            fun issuedAt(issuedAt: OffsetDateTime?) = issuedAt(JsonField.ofNullable(issuedAt))

            /**
             * Sets [Builder.issuedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun paymentMethodLastFourDigits(paymentMethodLastFourDigits: String?) =
                paymentMethodLastFourDigits(JsonField.ofNullable(paymentMethodLastFourDigits))

            /**
             * Sets [Builder.paymentMethodLastFourDigits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethodLastFourDigits] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentMethodLastFourDigits(paymentMethodLastFourDigits: JsonField<String>) =
                apply {
                    this.paymentMethodLastFourDigits = paymentMethodLastFourDigits
                }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun subscriptionId(subscriptionId: String?) =
                subscriptionId(JsonField.ofNullable(subscriptionId))

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
             * Returns an immutable instance of [Invoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amountDue()
             * .currency()
             * .customerId()
             * .customerName()
             * .dueDate()
             * .externalCustomerId()
             * .hostedInvoiceUrl()
             * .invoiceDate()
             * .invoiceNumber()
             * .issuedAt()
             * .memo()
             * .paymentMethodLastFourDigits()
             * .status()
             * .subscriptionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Invoice =
                Invoice(
                    checkRequired("id", id),
                    checkRequired("amountDue", amountDue),
                    checkRequired("currency", currency),
                    checkRequired("customerId", customerId),
                    checkRequired("customerName", customerName),
                    checkRequired("dueDate", dueDate),
                    checkRequired("externalCustomerId", externalCustomerId),
                    checkRequired("hostedInvoiceUrl", hostedInvoiceUrl),
                    checkRequired("invoiceDate", invoiceDate),
                    checkRequired("invoiceNumber", invoiceNumber),
                    checkRequired("issuedAt", issuedAt),
                    checkRequired("memo", memo),
                    checkRequired("paymentMethodLastFourDigits", paymentMethodLastFourDigits),
                    checkRequired("status", status),
                    checkRequired("subscriptionId", subscriptionId),
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
        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

            id()
            amountDue()
            currency()
            customerId()
            customerName()
            dueDate()
            externalCustomerId()
            hostedInvoiceUrl()
            invoiceDate()
            invoiceNumber()
            issuedAt()
            memo()
            paymentMethodLastFourDigits()
            status()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (amountDue.asKnown() == null) 0 else 1) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (customerName.asKnown() == null) 0 else 1) +
                (if (dueDate.asKnown() == null) 0 else 1) +
                (if (externalCustomerId.asKnown() == null) 0 else 1) +
                (if (hostedInvoiceUrl.asKnown() == null) 0 else 1) +
                (if (invoiceDate.asKnown() == null) 0 else 1) +
                (if (invoiceNumber.asKnown() == null) 0 else 1) +
                (if (issuedAt.asKnown() == null) 0 else 1) +
                (if (memo.asKnown() == null) 0 else 1) +
                (if (paymentMethodLastFourDigits.asKnown() == null) 0 else 1) +
                (if (status.asKnown() == null) 0 else 1) +
                (if (subscriptionId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Invoice &&
                id == other.id &&
                amountDue == other.amountDue &&
                currency == other.currency &&
                customerId == other.customerId &&
                customerName == other.customerName &&
                dueDate == other.dueDate &&
                externalCustomerId == other.externalCustomerId &&
                hostedInvoiceUrl == other.hostedInvoiceUrl &&
                invoiceDate == other.invoiceDate &&
                invoiceNumber == other.invoiceNumber &&
                issuedAt == other.issuedAt &&
                memo == other.memo &&
                paymentMethodLastFourDigits == other.paymentMethodLastFourDigits &&
                status == other.status &&
                subscriptionId == other.subscriptionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amountDue,
                currency,
                customerId,
                customerName,
                dueDate,
                externalCustomerId,
                hostedInvoiceUrl,
                invoiceDate,
                invoiceNumber,
                issuedAt,
                memo,
                paymentMethodLastFourDigits,
                status,
                subscriptionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{id=$id, amountDue=$amountDue, currency=$currency, customerId=$customerId, customerName=$customerName, dueDate=$dueDate, externalCustomerId=$externalCustomerId, hostedInvoiceUrl=$hostedInvoiceUrl, invoiceDate=$invoiceDate, invoiceNumber=$invoiceNumber, issuedAt=$issuedAt, memo=$memo, paymentMethodLastFourDigits=$paymentMethodLastFourDigits, status=$status, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    class Properties
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actions: JsonField<List<Action>>,
        private val automationScheduleTemplateId: JsonField<String>,
        private val automationScheduleTemplateName: JsonField<String>,
        private val executedAt: JsonField<OffsetDateTime>,
        private val label: JsonField<String>,
        private val scheduledAt: JsonField<OffsetDateTime>,
        private val stepId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actions")
            @ExcludeMissing
            actions: JsonField<List<Action>> = JsonMissing.of(),
            @JsonProperty("automation_schedule_template_id")
            @ExcludeMissing
            automationScheduleTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("automation_schedule_template_name")
            @ExcludeMissing
            automationScheduleTemplateName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("executed_at")
            @ExcludeMissing
            executedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduled_at")
            @ExcludeMissing
            scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
        ) : this(
            actions,
            automationScheduleTemplateId,
            automationScheduleTemplateName,
            executedAt,
            label,
            scheduledAt,
            stepId,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actions(): List<Action> = actions.getRequired("actions")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun automationScheduleTemplateId(): String? =
            automationScheduleTemplateId.getNullable("automation_schedule_template_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun automationScheduleTemplateName(): String? =
            automationScheduleTemplateName.getNullable("automation_schedule_template_name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun executedAt(): OffsetDateTime = executedAt.getRequired("executed_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun label(): String = label.getRequired("label")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduledAt(): OffsetDateTime = scheduledAt.getRequired("scheduled_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stepId(): String = stepId.getRequired("step_id")

        /**
         * Returns the raw JSON value of [actions].
         *
         * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

        /**
         * Returns the raw JSON value of [automationScheduleTemplateId].
         *
         * Unlike [automationScheduleTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("automation_schedule_template_id")
        @ExcludeMissing
        fun _automationScheduleTemplateId(): JsonField<String> = automationScheduleTemplateId

        /**
         * Returns the raw JSON value of [automationScheduleTemplateName].
         *
         * Unlike [automationScheduleTemplateName], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("automation_schedule_template_name")
        @ExcludeMissing
        fun _automationScheduleTemplateName(): JsonField<String> = automationScheduleTemplateName

        /**
         * Returns the raw JSON value of [executedAt].
         *
         * Unlike [executedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("executed_at")
        @ExcludeMissing
        fun _executedAt(): JsonField<OffsetDateTime> = executedAt

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [scheduledAt].
         *
         * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

        /**
         * Returns the raw JSON value of [stepId].
         *
         * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

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
             * .actions()
             * .automationScheduleTemplateId()
             * .automationScheduleTemplateName()
             * .executedAt()
             * .label()
             * .scheduledAt()
             * .stepId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var actions: JsonField<MutableList<Action>>? = null
            private var automationScheduleTemplateId: JsonField<String>? = null
            private var automationScheduleTemplateName: JsonField<String>? = null
            private var executedAt: JsonField<OffsetDateTime>? = null
            private var label: JsonField<String>? = null
            private var scheduledAt: JsonField<OffsetDateTime>? = null
            private var stepId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                actions = properties.actions.map { it.toMutableList() }
                automationScheduleTemplateId = properties.automationScheduleTemplateId
                automationScheduleTemplateName = properties.automationScheduleTemplateName
                executedAt = properties.executedAt
                label = properties.label
                scheduledAt = properties.scheduledAt
                stepId = properties.stepId
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            fun actions(actions: List<Action>) = actions(JsonField.of(actions))

            /**
             * Sets [Builder.actions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actions] with a well-typed `List<Action>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actions(actions: JsonField<List<Action>>) = apply {
                this.actions = actions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Action] to [actions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAction(action: Action) = apply {
                actions =
                    (actions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("actions", it).add(action)
                    }
            }

            /** Alias for calling [addAction] with `Action.ofSendEmail(sendEmail)`. */
            fun addAction(sendEmail: Action.SendEmail) = addAction(Action.ofSendEmail(sendEmail))

            /** Alias for calling [addAction] with `Action.ofRetryPayment(retryPayment)`. */
            fun addAction(retryPayment: Action.RetryPayment) =
                addAction(Action.ofRetryPayment(retryPayment))

            fun automationScheduleTemplateId(automationScheduleTemplateId: String?) =
                automationScheduleTemplateId(JsonField.ofNullable(automationScheduleTemplateId))

            /**
             * Sets [Builder.automationScheduleTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automationScheduleTemplateId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun automationScheduleTemplateId(automationScheduleTemplateId: JsonField<String>) =
                apply {
                    this.automationScheduleTemplateId = automationScheduleTemplateId
                }

            fun automationScheduleTemplateName(automationScheduleTemplateName: String?) =
                automationScheduleTemplateName(JsonField.ofNullable(automationScheduleTemplateName))

            /**
             * Sets [Builder.automationScheduleTemplateName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automationScheduleTemplateName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun automationScheduleTemplateName(automationScheduleTemplateName: JsonField<String>) =
                apply {
                    this.automationScheduleTemplateName = automationScheduleTemplateName
                }

            fun executedAt(executedAt: OffsetDateTime) = executedAt(JsonField.of(executedAt))

            /**
             * Sets [Builder.executedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun executedAt(executedAt: JsonField<OffsetDateTime>) = apply {
                this.executedAt = executedAt
            }

            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

            /**
             * Sets [Builder.scheduledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
                this.scheduledAt = scheduledAt
            }

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            /**
             * Sets [Builder.stepId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

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
             * .actions()
             * .automationScheduleTemplateId()
             * .automationScheduleTemplateName()
             * .executedAt()
             * .label()
             * .scheduledAt()
             * .stepId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("actions", actions).map { it.toImmutable() },
                    checkRequired("automationScheduleTemplateId", automationScheduleTemplateId),
                    checkRequired("automationScheduleTemplateName", automationScheduleTemplateName),
                    checkRequired("executedAt", executedAt),
                    checkRequired("label", label),
                    checkRequired("scheduledAt", scheduledAt),
                    checkRequired("stepId", stepId),
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

            actions().forEach { it.validate() }
            automationScheduleTemplateId()
            automationScheduleTemplateName()
            executedAt()
            label()
            scheduledAt()
            stepId()
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
            (actions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (automationScheduleTemplateId.asKnown() == null) 0 else 1) +
                (if (automationScheduleTemplateName.asKnown() == null) 0 else 1) +
                (if (executedAt.asKnown() == null) 0 else 1) +
                (if (label.asKnown() == null) 0 else 1) +
                (if (scheduledAt.asKnown() == null) 0 else 1) +
                (if (stepId.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Action.Deserializer::class)
        @JsonSerialize(using = Action.Serializer::class)
        class Action
        private constructor(
            private val sendEmail: SendEmail? = null,
            private val retryPayment: RetryPayment? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sendEmail(): SendEmail? = sendEmail

            fun retryPayment(): RetryPayment? = retryPayment

            fun isSendEmail(): Boolean = sendEmail != null

            fun isRetryPayment(): Boolean = retryPayment != null

            fun asSendEmail(): SendEmail = sendEmail.getOrThrow("sendEmail")

            fun asRetryPayment(): RetryPayment = retryPayment.getOrThrow("retryPayment")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.withorb.api.core.JsonValue
             *
             * val result: String? = action.accept(object : Action.Visitor<String?> {
             *     override fun visitSendEmail(sendEmail: SendEmail): String? = sendEmail.toString()
             *
             *     // ...
             *
             *     override fun unknown(json: JsonValue?): String? {
             *         // Or inspect the `json`.
             *         return null
             *     }
             * })
             * ```
             *
             * @throws OrbInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
             *   and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sendEmail != null -> visitor.visitSendEmail(sendEmail)
                    retryPayment != null -> visitor.visitRetryPayment(retryPayment)
                    else -> visitor.unknown(_json)
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
            fun validate(): Action = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSendEmail(sendEmail: SendEmail) {
                            sendEmail.validate()
                        }

                        override fun visitRetryPayment(retryPayment: RetryPayment) {
                            retryPayment.validate()
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
                        override fun visitSendEmail(sendEmail: SendEmail) = sendEmail.validity()

                        override fun visitRetryPayment(retryPayment: RetryPayment) =
                            retryPayment.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Action &&
                    sendEmail == other.sendEmail &&
                    retryPayment == other.retryPayment
            }

            override fun hashCode(): Int = Objects.hash(sendEmail, retryPayment)

            override fun toString(): String =
                when {
                    sendEmail != null -> "Action{sendEmail=$sendEmail}"
                    retryPayment != null -> "Action{retryPayment=$retryPayment}"
                    _json != null -> "Action{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Action")
                }

            companion object {

                fun ofSendEmail(sendEmail: SendEmail) = Action(sendEmail = sendEmail)

                fun ofRetryPayment(retryPayment: RetryPayment) = Action(retryPayment = retryPayment)
            }

            /**
             * An interface that defines how to map each variant of [Action] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSendEmail(sendEmail: SendEmail): T

                fun visitRetryPayment(retryPayment: RetryPayment): T

                /**
                 * Maps an unknown variant of [Action] to a value of type [T].
                 *
                 * An instance of [Action] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Action: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Action>(Action::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Action {
                    val json = JsonValue.fromJsonNode(node)
                    val actionType = json.asObject()?.get("action_type")?.asString()

                    when (actionType) {
                        "send_email" -> {
                            return tryDeserialize(node, jacksonTypeRef<SendEmail>())?.let {
                                Action(sendEmail = it, _json = json)
                            } ?: Action(_json = json)
                        }
                        "retry_payment" -> {
                            return tryDeserialize(node, jacksonTypeRef<RetryPayment>())?.let {
                                Action(retryPayment = it, _json = json)
                            } ?: Action(_json = json)
                        }
                    }

                    return Action(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Action>(Action::class) {

                override fun serialize(
                    value: Action,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sendEmail != null -> generator.writeObject(value.sendEmail)
                        value.retryPayment != null -> generator.writeObject(value.retryPayment)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Action")
                    }
                }
            }

            class SendEmail
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val recipient: JsonField<String>,
                private val sent: JsonField<Boolean>,
                private val actionType: JsonField<ActionType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("recipient")
                    @ExcludeMissing
                    recipient: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sent")
                    @ExcludeMissing
                    sent: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("action_type")
                    @ExcludeMissing
                    actionType: JsonField<ActionType> = JsonMissing.of(),
                ) : this(recipient, sent, actionType, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun recipient(): String? = recipient.getNullable("recipient")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun sent(): Boolean = sent.getRequired("sent")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun actionType(): ActionType? = actionType.getNullable("action_type")

                /**
                 * Returns the raw JSON value of [recipient].
                 *
                 * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("recipient")
                @ExcludeMissing
                fun _recipient(): JsonField<String> = recipient

                /**
                 * Returns the raw JSON value of [sent].
                 *
                 * Unlike [sent], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<Boolean> = sent

                /**
                 * Returns the raw JSON value of [actionType].
                 *
                 * Unlike [actionType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("action_type")
                @ExcludeMissing
                fun _actionType(): JsonField<ActionType> = actionType

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
                     * Returns a mutable builder for constructing an instance of [SendEmail].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .recipient()
                     * .sent()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [SendEmail]. */
                class Builder internal constructor() {

                    private var recipient: JsonField<String>? = null
                    private var sent: JsonField<Boolean>? = null
                    private var actionType: JsonField<ActionType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(sendEmail: SendEmail) = apply {
                        recipient = sendEmail.recipient
                        sent = sendEmail.sent
                        actionType = sendEmail.actionType
                        additionalProperties = sendEmail.additionalProperties.toMutableMap()
                    }

                    fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

                    /**
                     * Sets [Builder.recipient] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recipient] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun recipient(recipient: JsonField<String>) = apply {
                        this.recipient = recipient
                    }

                    fun sent(sent: Boolean) = sent(JsonField.of(sent))

                    /**
                     * Sets [Builder.sent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sent] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sent(sent: JsonField<Boolean>) = apply { this.sent = sent }

                    fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

                    /**
                     * Sets [Builder.actionType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actionType] with a well-typed [ActionType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actionType(actionType: JsonField<ActionType>) = apply {
                        this.actionType = actionType
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
                     * Returns an immutable instance of [SendEmail].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .recipient()
                     * .sent()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SendEmail =
                        SendEmail(
                            checkRequired("recipient", recipient),
                            checkRequired("sent", sent),
                            actionType,
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): SendEmail = apply {
                    if (validated) {
                        return@apply
                    }

                    recipient()
                    sent()
                    actionType()?.validate()
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
                    (if (recipient.asKnown() == null) 0 else 1) +
                        (if (sent.asKnown() == null) 0 else 1) +
                        (actionType.asKnown()?.validity() ?: 0)

                class ActionType
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

                        val SEND_EMAIL = of("send_email")

                        fun of(value: String) = ActionType(JsonField.of(value))
                    }

                    /** An enum containing [ActionType]'s known values. */
                    enum class Known {
                        SEND_EMAIL
                    }

                    /**
                     * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ActionType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SEND_EMAIL,
                        /**
                         * An enum member indicating that [ActionType] was instantiated with an
                         * unknown value.
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
                            SEND_EMAIL -> Value.SEND_EMAIL
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
                            SEND_EMAIL -> Known.SEND_EMAIL
                            else -> throw OrbInvalidDataException("Unknown ActionType: $value")
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ActionType = apply {
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

                        return other is ActionType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SendEmail &&
                        recipient == other.recipient &&
                        sent == other.sent &&
                        actionType == other.actionType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(recipient, sent, actionType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SendEmail{recipient=$recipient, sent=$sent, actionType=$actionType, additionalProperties=$additionalProperties}"
            }

            class RetryPayment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amountAttempted: JsonField<String>,
                private val currency: JsonField<String>,
                private val failureReason: JsonField<String>,
                private val outcome: JsonField<Outcome>,
                private val paymentProvider: JsonField<String>,
                private val paymentProviderTransactionId: JsonField<String>,
                private val paymentTransactionRecordId: JsonField<String>,
                private val actionType: JsonField<ActionType>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount_attempted")
                    @ExcludeMissing
                    amountAttempted: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("failure_reason")
                    @ExcludeMissing
                    failureReason: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("outcome")
                    @ExcludeMissing
                    outcome: JsonField<Outcome> = JsonMissing.of(),
                    @JsonProperty("payment_provider")
                    @ExcludeMissing
                    paymentProvider: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("payment_provider_transaction_id")
                    @ExcludeMissing
                    paymentProviderTransactionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("payment_transaction_record_id")
                    @ExcludeMissing
                    paymentTransactionRecordId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action_type")
                    @ExcludeMissing
                    actionType: JsonField<ActionType> = JsonMissing.of(),
                ) : this(
                    amountAttempted,
                    currency,
                    failureReason,
                    outcome,
                    paymentProvider,
                    paymentProviderTransactionId,
                    paymentTransactionRecordId,
                    actionType,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun amountAttempted(): String? = amountAttempted.getNullable("amount_attempted")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun currency(): String? = currency.getNullable("currency")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun failureReason(): String? = failureReason.getNullable("failure_reason")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun outcome(): Outcome = outcome.getRequired("outcome")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun paymentProvider(): String? = paymentProvider.getNullable("payment_provider")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun paymentProviderTransactionId(): String? =
                    paymentProviderTransactionId.getNullable("payment_provider_transaction_id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun paymentTransactionRecordId(): String? =
                    paymentTransactionRecordId.getNullable("payment_transaction_record_id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun actionType(): ActionType? = actionType.getNullable("action_type")

                /**
                 * Returns the raw JSON value of [amountAttempted].
                 *
                 * Unlike [amountAttempted], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_attempted")
                @ExcludeMissing
                fun _amountAttempted(): JsonField<String> = amountAttempted

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
                 * Returns the raw JSON value of [failureReason].
                 *
                 * Unlike [failureReason], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("failure_reason")
                @ExcludeMissing
                fun _failureReason(): JsonField<String> = failureReason

                /**
                 * Returns the raw JSON value of [outcome].
                 *
                 * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("outcome")
                @ExcludeMissing
                fun _outcome(): JsonField<Outcome> = outcome

                /**
                 * Returns the raw JSON value of [paymentProvider].
                 *
                 * Unlike [paymentProvider], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("payment_provider")
                @ExcludeMissing
                fun _paymentProvider(): JsonField<String> = paymentProvider

                /**
                 * Returns the raw JSON value of [paymentProviderTransactionId].
                 *
                 * Unlike [paymentProviderTransactionId], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("payment_provider_transaction_id")
                @ExcludeMissing
                fun _paymentProviderTransactionId(): JsonField<String> =
                    paymentProviderTransactionId

                /**
                 * Returns the raw JSON value of [paymentTransactionRecordId].
                 *
                 * Unlike [paymentTransactionRecordId], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("payment_transaction_record_id")
                @ExcludeMissing
                fun _paymentTransactionRecordId(): JsonField<String> = paymentTransactionRecordId

                /**
                 * Returns the raw JSON value of [actionType].
                 *
                 * Unlike [actionType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("action_type")
                @ExcludeMissing
                fun _actionType(): JsonField<ActionType> = actionType

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
                     * Returns a mutable builder for constructing an instance of [RetryPayment].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amountAttempted()
                     * .currency()
                     * .failureReason()
                     * .outcome()
                     * .paymentProvider()
                     * .paymentProviderTransactionId()
                     * .paymentTransactionRecordId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [RetryPayment]. */
                class Builder internal constructor() {

                    private var amountAttempted: JsonField<String>? = null
                    private var currency: JsonField<String>? = null
                    private var failureReason: JsonField<String>? = null
                    private var outcome: JsonField<Outcome>? = null
                    private var paymentProvider: JsonField<String>? = null
                    private var paymentProviderTransactionId: JsonField<String>? = null
                    private var paymentTransactionRecordId: JsonField<String>? = null
                    private var actionType: JsonField<ActionType> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(retryPayment: RetryPayment) = apply {
                        amountAttempted = retryPayment.amountAttempted
                        currency = retryPayment.currency
                        failureReason = retryPayment.failureReason
                        outcome = retryPayment.outcome
                        paymentProvider = retryPayment.paymentProvider
                        paymentProviderTransactionId = retryPayment.paymentProviderTransactionId
                        paymentTransactionRecordId = retryPayment.paymentTransactionRecordId
                        actionType = retryPayment.actionType
                        additionalProperties = retryPayment.additionalProperties.toMutableMap()
                    }

                    fun amountAttempted(amountAttempted: String?) =
                        amountAttempted(JsonField.ofNullable(amountAttempted))

                    /**
                     * Sets [Builder.amountAttempted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountAttempted] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amountAttempted(amountAttempted: JsonField<String>) = apply {
                        this.amountAttempted = amountAttempted
                    }

                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun failureReason(failureReason: String?) =
                        failureReason(JsonField.ofNullable(failureReason))

                    /**
                     * Sets [Builder.failureReason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.failureReason] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun failureReason(failureReason: JsonField<String>) = apply {
                        this.failureReason = failureReason
                    }

                    fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

                    /**
                     * Sets [Builder.outcome] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outcome] with a well-typed [Outcome] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

                    fun paymentProvider(paymentProvider: String?) =
                        paymentProvider(JsonField.ofNullable(paymentProvider))

                    /**
                     * Sets [Builder.paymentProvider] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentProvider] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentProvider(paymentProvider: JsonField<String>) = apply {
                        this.paymentProvider = paymentProvider
                    }

                    fun paymentProviderTransactionId(paymentProviderTransactionId: String?) =
                        paymentProviderTransactionId(
                            JsonField.ofNullable(paymentProviderTransactionId)
                        )

                    /**
                     * Sets [Builder.paymentProviderTransactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentProviderTransactionId] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun paymentProviderTransactionId(
                        paymentProviderTransactionId: JsonField<String>
                    ) = apply { this.paymentProviderTransactionId = paymentProviderTransactionId }

                    fun paymentTransactionRecordId(paymentTransactionRecordId: String?) =
                        paymentTransactionRecordId(JsonField.ofNullable(paymentTransactionRecordId))

                    /**
                     * Sets [Builder.paymentTransactionRecordId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentTransactionRecordId] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun paymentTransactionRecordId(paymentTransactionRecordId: JsonField<String>) =
                        apply {
                            this.paymentTransactionRecordId = paymentTransactionRecordId
                        }

                    fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

                    /**
                     * Sets [Builder.actionType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actionType] with a well-typed [ActionType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actionType(actionType: JsonField<ActionType>) = apply {
                        this.actionType = actionType
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
                     * Returns an immutable instance of [RetryPayment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amountAttempted()
                     * .currency()
                     * .failureReason()
                     * .outcome()
                     * .paymentProvider()
                     * .paymentProviderTransactionId()
                     * .paymentTransactionRecordId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RetryPayment =
                        RetryPayment(
                            checkRequired("amountAttempted", amountAttempted),
                            checkRequired("currency", currency),
                            checkRequired("failureReason", failureReason),
                            checkRequired("outcome", outcome),
                            checkRequired("paymentProvider", paymentProvider),
                            checkRequired(
                                "paymentProviderTransactionId",
                                paymentProviderTransactionId,
                            ),
                            checkRequired("paymentTransactionRecordId", paymentTransactionRecordId),
                            actionType,
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RetryPayment = apply {
                    if (validated) {
                        return@apply
                    }

                    amountAttempted()
                    currency()
                    failureReason()
                    outcome().validate()
                    paymentProvider()
                    paymentProviderTransactionId()
                    paymentTransactionRecordId()
                    actionType()?.validate()
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
                    (if (amountAttempted.asKnown() == null) 0 else 1) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (if (failureReason.asKnown() == null) 0 else 1) +
                        (outcome.asKnown()?.validity() ?: 0) +
                        (if (paymentProvider.asKnown() == null) 0 else 1) +
                        (if (paymentProviderTransactionId.asKnown() == null) 0 else 1) +
                        (if (paymentTransactionRecordId.asKnown() == null) 0 else 1) +
                        (actionType.asKnown()?.validity() ?: 0)

                class Outcome
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

                        val SUCCEEDED = of("succeeded")

                        val FAILED = of("failed")

                        val SKIPPED = of("skipped")

                        fun of(value: String) = Outcome(JsonField.of(value))
                    }

                    /** An enum containing [Outcome]'s known values. */
                    enum class Known {
                        SUCCEEDED,
                        FAILED,
                        SKIPPED,
                    }

                    /**
                     * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Outcome] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUCCEEDED,
                        FAILED,
                        SKIPPED,
                        /**
                         * An enum member indicating that [Outcome] was instantiated with an unknown
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
                            SUCCEEDED -> Value.SUCCEEDED
                            FAILED -> Value.FAILED
                            SKIPPED -> Value.SKIPPED
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
                            SUCCEEDED -> Known.SUCCEEDED
                            FAILED -> Known.FAILED
                            SKIPPED -> Known.SKIPPED
                            else -> throw OrbInvalidDataException("Unknown Outcome: $value")
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Outcome = apply {
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

                        return other is Outcome && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class ActionType
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

                        val RETRY_PAYMENT = of("retry_payment")

                        fun of(value: String) = ActionType(JsonField.of(value))
                    }

                    /** An enum containing [ActionType]'s known values. */
                    enum class Known {
                        RETRY_PAYMENT
                    }

                    /**
                     * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ActionType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        RETRY_PAYMENT,
                        /**
                         * An enum member indicating that [ActionType] was instantiated with an
                         * unknown value.
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
                            RETRY_PAYMENT -> Value.RETRY_PAYMENT
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
                            RETRY_PAYMENT -> Known.RETRY_PAYMENT
                            else -> throw OrbInvalidDataException("Unknown ActionType: $value")
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ActionType = apply {
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

                        return other is ActionType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RetryPayment &&
                        amountAttempted == other.amountAttempted &&
                        currency == other.currency &&
                        failureReason == other.failureReason &&
                        outcome == other.outcome &&
                        paymentProvider == other.paymentProvider &&
                        paymentProviderTransactionId == other.paymentProviderTransactionId &&
                        paymentTransactionRecordId == other.paymentTransactionRecordId &&
                        actionType == other.actionType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        amountAttempted,
                        currency,
                        failureReason,
                        outcome,
                        paymentProvider,
                        paymentProviderTransactionId,
                        paymentTransactionRecordId,
                        actionType,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RetryPayment{amountAttempted=$amountAttempted, currency=$currency, failureReason=$failureReason, outcome=$outcome, paymentProvider=$paymentProvider, paymentProviderTransactionId=$paymentProviderTransactionId, paymentTransactionRecordId=$paymentTransactionRecordId, actionType=$actionType, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                actions == other.actions &&
                automationScheduleTemplateId == other.automationScheduleTemplateId &&
                automationScheduleTemplateName == other.automationScheduleTemplateName &&
                executedAt == other.executedAt &&
                label == other.label &&
                scheduledAt == other.scheduledAt &&
                stepId == other.stepId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actions,
                automationScheduleTemplateId,
                automationScheduleTemplateName,
                executedAt,
                label,
                scheduledAt,
                stepId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{actions=$actions, automationScheduleTemplateId=$automationScheduleTemplateId, automationScheduleTemplateName=$automationScheduleTemplateName, executedAt=$executedAt, label=$label, scheduledAt=$scheduledAt, stepId=$stepId, additionalProperties=$additionalProperties}"
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

            val INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED =
                of("invoice.automation_schedule_step_executed")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
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
            INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED,
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
                INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED ->
                    Value.INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
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
                INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED ->
                    Known.INVOICE_AUTOMATION_SCHEDULE_STEP_EXECUTED
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

        return other is InvoiceAutomationScheduleStepExecutedWebhookEvent &&
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
        "InvoiceAutomationScheduleStepExecutedWebhookEvent{id=$id, createdAt=$createdAt, invoice=$invoice, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
