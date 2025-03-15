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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The [Credit Note](/invoicing/credit-notes) resource represents a credit that has been applied to
 * a particular invoice.
 */
@NoAutoDetect
class CreditNote
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_note_number")
    @ExcludeMissing
    private val creditNoteNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_note_pdf")
    @ExcludeMissing
    private val creditNotePdf: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonProperty("maximum_amount_adjustment")
    @ExcludeMissing
    private val maximumAmountAdjustment: JsonField<MaximumAmountAdjustment> = JsonMissing.of(),
    @JsonProperty("memo") @ExcludeMissing private val memo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum_amount_refunded")
    @ExcludeMissing
    private val minimumAmountRefunded: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<Reason> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("voided_at")
    @ExcludeMissing
    private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Orb id of this credit note.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The creation time of the resource in Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The unique identifier for credit notes.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

    /**
     * A URL to a PDF of the credit note.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creditNotePdf(): String? = creditNotePdf.getNullable("credit_note_pdf")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * The id of the invoice resource that this credit note is applied to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /**
     * All of the line items associated with this credit note.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    /**
     * The maximum amount applied on the original invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximumAmountAdjustment(): MaximumAmountAdjustment? =
        maximumAmountAdjustment.getNullable("maximum_amount_adjustment")

    /**
     * An optional memo supplied on the credit note.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun memo(): String? = memo.getNullable("memo")

    /**
     * Any credited amount from the applied minimum on the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun minimumAmountRefunded(): String? =
        minimumAmountRefunded.getNullable("minimum_amount_refunded")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): Reason? = reason.getNullable("reason")

    /**
     * The total prior to any creditable invoice-level discounts or minimums.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * The total including creditable invoice-level discounts or minimums, and tax.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The time at which the credit note was voided in Orb, if applicable.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    /**
     * Any discounts applied on the original invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun discounts(): List<Discount>? = discounts.getNullable("discounts")

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
     * Returns the raw JSON value of [creditNoteNumber].
     *
     * Unlike [creditNoteNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_note_number")
    @ExcludeMissing
    fun _creditNoteNumber(): JsonField<String> = creditNoteNumber

    /**
     * Returns the raw JSON value of [creditNotePdf].
     *
     * Unlike [creditNotePdf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_note_pdf")
    @ExcludeMissing
    fun _creditNotePdf(): JsonField<String> = creditNotePdf

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [maximumAmountAdjustment].
     *
     * Unlike [maximumAmountAdjustment], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maximum_amount_adjustment")
    @ExcludeMissing
    fun _maximumAmountAdjustment(): JsonField<MaximumAmountAdjustment> = maximumAmountAdjustment

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [minimumAmountRefunded].
     *
     * Unlike [minimumAmountRefunded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minimum_amount_refunded")
    @ExcludeMissing
    fun _minimumAmountRefunded(): JsonField<String> = minimumAmountRefunded

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [voidedAt].
     *
     * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    /**
     * Returns the raw JSON value of [discounts].
     *
     * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<Discount>> = discounts

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditNote = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        creditNoteNumber()
        creditNotePdf()
        customer().validate()
        invoiceId()
        lineItems().forEach { it.validate() }
        maximumAmountAdjustment()?.validate()
        memo()
        minimumAmountRefunded()
        reason()
        subtotal()
        total()
        type()
        voidedAt()
        discounts()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNote].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .creditNoteNumber()
         * .creditNotePdf()
         * .customer()
         * .invoiceId()
         * .lineItems()
         * .maximumAmountAdjustment()
         * .memo()
         * .minimumAmountRefunded()
         * .reason()
         * .subtotal()
         * .total()
         * .type()
         * .voidedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditNote]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditNoteNumber: JsonField<String>? = null
        private var creditNotePdf: JsonField<String>? = null
        private var customer: JsonField<Customer>? = null
        private var invoiceId: JsonField<String>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var maximumAmountAdjustment: JsonField<MaximumAmountAdjustment>? = null
        private var memo: JsonField<String>? = null
        private var minimumAmountRefunded: JsonField<String>? = null
        private var reason: JsonField<Reason>? = null
        private var subtotal: JsonField<String>? = null
        private var total: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var discounts: JsonField<MutableList<Discount>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditNote: CreditNote) = apply {
            id = creditNote.id
            createdAt = creditNote.createdAt
            creditNoteNumber = creditNote.creditNoteNumber
            creditNotePdf = creditNote.creditNotePdf
            customer = creditNote.customer
            invoiceId = creditNote.invoiceId
            lineItems = creditNote.lineItems.map { it.toMutableList() }
            maximumAmountAdjustment = creditNote.maximumAmountAdjustment
            memo = creditNote.memo
            minimumAmountRefunded = creditNote.minimumAmountRefunded
            reason = creditNote.reason
            subtotal = creditNote.subtotal
            total = creditNote.total
            type = creditNote.type
            voidedAt = creditNote.voidedAt
            discounts = creditNote.discounts.map { it.toMutableList() }
            additionalProperties = creditNote.additionalProperties.toMutableMap()
        }

        /** The Orb id of this credit note. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The unique identifier for credit notes. */
        fun creditNoteNumber(creditNoteNumber: String) =
            creditNoteNumber(JsonField.of(creditNoteNumber))

        /**
         * Sets [Builder.creditNoteNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditNoteNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
            this.creditNoteNumber = creditNoteNumber
        }

        /** A URL to a PDF of the credit note. */
        fun creditNotePdf(creditNotePdf: String?) =
            creditNotePdf(JsonField.ofNullable(creditNotePdf))

        /**
         * Sets [Builder.creditNotePdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditNotePdf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditNotePdf(creditNotePdf: JsonField<String>) = apply {
            this.creditNotePdf = creditNotePdf
        }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** The id of the invoice resource that this credit note is applied to. */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** All of the line items associated with this credit note. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        /** The maximum amount applied on the original invoice */
        fun maximumAmountAdjustment(maximumAmountAdjustment: MaximumAmountAdjustment?) =
            maximumAmountAdjustment(JsonField.ofNullable(maximumAmountAdjustment))

        /**
         * Sets [Builder.maximumAmountAdjustment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmountAdjustment] with a well-typed
         * [MaximumAmountAdjustment] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun maximumAmountAdjustment(maximumAmountAdjustment: JsonField<MaximumAmountAdjustment>) =
            apply {
                this.maximumAmountAdjustment = maximumAmountAdjustment
            }

        /** An optional memo supplied on the credit note. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /** Any credited amount from the applied minimum on the invoice. */
        fun minimumAmountRefunded(minimumAmountRefunded: String?) =
            minimumAmountRefunded(JsonField.ofNullable(minimumAmountRefunded))

        /**
         * Sets [Builder.minimumAmountRefunded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumAmountRefunded] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minimumAmountRefunded(minimumAmountRefunded: JsonField<String>) = apply {
            this.minimumAmountRefunded = minimumAmountRefunded
        }

        fun reason(reason: Reason?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** The total prior to any creditable invoice-level discounts or minimums. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** The total including creditable invoice-level discounts or minimums, and tax. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The time at which the credit note was voided in Orb, if applicable. */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /**
         * Sets [Builder.voidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /** Any discounts applied on the original invoice. */
        fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

        /**
         * Sets [Builder.discounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discounts(discounts: JsonField<List<Discount>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Discount] to [discounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscount(discount: Discount) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
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

        fun build(): CreditNote =
            CreditNote(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("creditNoteNumber", creditNoteNumber),
                checkRequired("creditNotePdf", creditNotePdf),
                checkRequired("customer", customer),
                checkRequired("invoiceId", invoiceId),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("maximumAmountAdjustment", maximumAmountAdjustment),
                checkRequired("memo", memo),
                checkRequired("minimumAmountRefunded", minimumAmountRefunded),
                checkRequired("reason", reason),
                checkRequired("subtotal", subtotal),
                checkRequired("total", total),
                checkRequired("type", type),
                checkRequired("voidedAt", voidedAt),
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            id()
            externalCustomerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .externalCustomerId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalCustomerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customer: Customer) = apply {
                id = customer.id
                externalCustomerId = customer.externalCustomerId
                additionalProperties = customer.additionalProperties.toMutableMap()
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

            fun build(): Customer =
                Customer(
                    checkRequired("id", id),
                    checkRequired("externalCustomerId", externalCustomerId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && id == other.id && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{id=$id, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_id")
        @ExcludeMissing
        private val itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The Orb id of this resource.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The amount of the line item, including any line item minimums and discounts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The id of the item associated with this line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun itemId(): String = itemId.getRequired("item_id")

        /**
         * The name of the corresponding invoice line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * An optional quantity credited.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantity(): Double? = quantity.getNullable("quantity")

        /**
         * The amount of the line item, excluding any line item minimums and discounts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * Any tax amounts applied onto the line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /**
         * Any line item discounts from the invoice's line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discounts(): List<Discount>? = discounts.getNullable("discounts")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [itemId].
         *
         * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        /**
         * Returns the raw JSON value of [taxAmounts].
         *
         * Unlike [taxAmounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            itemId()
            name()
            quantity()
            subtotal()
            taxAmounts().forEach { it.validate() }
            discounts()?.forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .itemId()
             * .name()
             * .quantity()
             * .subtotal()
             * .taxAmounts()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<String>? = null
            private var itemId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var subtotal: JsonField<String>? = null
            private var taxAmounts: JsonField<MutableList<TaxAmount>>? = null
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItem: LineItem) = apply {
                id = lineItem.id
                amount = lineItem.amount
                itemId = lineItem.itemId
                name = lineItem.name
                quantity = lineItem.quantity
                subtotal = lineItem.subtotal
                taxAmounts = lineItem.taxAmounts.map { it.toMutableList() }
                discounts = lineItem.discounts.map { it.toMutableList() }
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The Orb id of this resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of the line item, including any line item minimums and discounts. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The id of the item associated with this line item. */
            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            /**
             * Sets [Builder.itemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            /** The name of the corresponding invoice line item. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** An optional quantity credited. */
            fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

            /**
             * Alias for [Builder.quantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quantity(quantity: Double) = quantity(quantity as Double?)

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The amount of the line item, excluding any line item minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /** Any tax amounts applied onto the line item. */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /**
             * Sets [Builder.taxAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxAmounts] with a well-typed `List<TaxAmount>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [TaxAmount] to [taxAmounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTaxAmount(taxAmount: TaxAmount) = apply {
                taxAmounts =
                    (taxAmounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxAmounts", it).add(taxAmount)
                    }
            }

            /** Any line item discounts from the invoice's line item. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Discount] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
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

            fun build(): LineItem =
                LineItem(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("itemId", itemId),
                    checkRequired("name", name),
                    checkRequired("quantity", quantity),
                    checkRequired("subtotal", subtotal),
                    checkRequired("taxAmounts", taxAmounts).map { it.toImmutable() },
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class TaxAmount
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            private val taxRateDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The amount of additional tax incurred by this tax rate.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * The human-readable description of the applied tax rate.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /**
             * The tax rate percentage, out of 100.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [taxRateDescription].
             *
             * Unlike [taxRateDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription(): JsonField<String> = taxRateDescription

            /**
             * Returns the raw JSON value of [taxRatePercentage].
             *
             * Unlike [taxRatePercentage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TaxAmount = apply {
                if (validated) {
                    return@apply
                }

                amount()
                taxRateDescription()
                taxRatePercentage()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TaxAmount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .taxRateDescription()
                 * .taxRatePercentage()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TaxAmount]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var taxRateDescription: JsonField<String>? = null
                private var taxRatePercentage: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(taxAmount: TaxAmount) = apply {
                    amount = taxAmount.amount
                    taxRateDescription = taxAmount.taxRateDescription
                    taxRatePercentage = taxAmount.taxRatePercentage
                    additionalProperties = taxAmount.additionalProperties.toMutableMap()
                }

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /**
                 * Sets [Builder.taxRateDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxRateDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String?) =
                    taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

                /**
                 * Sets [Builder.taxRatePercentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxRatePercentage] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                    this.taxRatePercentage = taxRatePercentage
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

                fun build(): TaxAmount =
                    TaxAmount(
                        checkRequired("amount", amount),
                        checkRequired("taxRateDescription", taxRateDescription),
                        checkRequired("taxRatePercentage", taxRatePercentage),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxAmount && amount == other.amount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Discount
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_applied")
            @ExcludeMissing
            private val amountApplied: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountApplied(): String = amountApplied.getRequired("amount_applied")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amountApplied].
             *
             * Unlike [amountApplied], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("amount_applied")
            @ExcludeMissing
            fun _amountApplied(): JsonField<String> = amountApplied

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [discountType].
             *
             * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /**
             * Returns the raw JSON value of [percentageDiscount].
             *
             * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /**
             * Returns the raw JSON value of [amountDiscount].
             *
             * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Discount = apply {
                if (validated) {
                    return@apply
                }

                id()
                amountApplied()
                appliesToPriceIds()
                discountType()
                percentageDiscount()
                amountDiscount()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Discount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amountApplied()
                 * .appliesToPriceIds()
                 * .discountType()
                 * .percentageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Discount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amountApplied: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(discount: Discount) = apply {
                    id = discount.id
                    amountApplied = discount.amountApplied
                    appliesToPriceIds = discount.appliesToPriceIds.map { it.toMutableList() }
                    discountType = discount.discountType
                    percentageDiscount = discount.percentageDiscount
                    amountDiscount = discount.amountDiscount
                    reason = discount.reason
                    additionalProperties = discount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun amountApplied(amountApplied: String) =
                    amountApplied(JsonField.of(amountApplied))

                /**
                 * Sets [Builder.amountApplied] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountApplied] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountApplied(amountApplied: JsonField<String>) = apply {
                    this.amountApplied = amountApplied
                }

                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                /**
                 * Sets [Builder.discountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountType] with a well-typed [DiscountType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                fun amountDiscount(amountDiscount: String?) =
                    amountDiscount(JsonField.ofNullable(amountDiscount))

                /**
                 * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDiscount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                fun build(): Discount =
                    Discount(
                        checkRequired("id", id),
                        checkRequired("amountApplied", amountApplied),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("discountType", discountType),
                        checkRequired("percentageDiscount", percentageDiscount),
                        amountDiscount,
                        reason,
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERCENTAGE = of("percentage")

                    val AMOUNT = of("amount")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    PERCENTAGE,
                    AMOUNT,
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERCENTAGE,
                    AMOUNT,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Discount && id == other.id && amountApplied == other.amountApplied && appliesToPriceIds == other.appliesToPriceIds && discountType == other.discountType && percentageDiscount == other.percentageDiscount && amountDiscount == other.amountDiscount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amountApplied, appliesToPriceIds, discountType, percentageDiscount, amountDiscount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Discount{id=$id, amountApplied=$amountApplied, appliesToPriceIds=$appliesToPriceIds, discountType=$discountType, percentageDiscount=$percentageDiscount, amountDiscount=$amountDiscount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && id == other.id && amount == other.amount && itemId == other.itemId && name == other.name && quantity == other.quantity && subtotal == other.subtotal && taxAmounts == other.taxAmounts && discounts == other.discounts && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, itemId, name, quantity, subtotal, taxAmounts, discounts, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, amount=$amount, itemId=$itemId, name=$name, quantity=$quantity, subtotal=$subtotal, taxAmounts=$taxAmounts, discounts=$discounts, additionalProperties=$additionalProperties}"
    }

    /** The maximum amount applied on the original invoice */
    @NoAutoDetect
    class MaximumAmountAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("amount_applied")
        @ExcludeMissing
        private val amountApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_type")
        @ExcludeMissing
        private val discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        private val appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliesToPrices(): List<AppliesToPrice>? =
            appliesToPrices.getNullable("applies_to_prices")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Returns the raw JSON value of [amountApplied].
         *
         * Unlike [amountApplied], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_applied")
        @ExcludeMissing
        fun _amountApplied(): JsonField<String> = amountApplied

        /**
         * Returns the raw JSON value of [discountType].
         *
         * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_type")
        @ExcludeMissing
        fun _discountType(): JsonField<DiscountType> = discountType

        /**
         * Returns the raw JSON value of [percentageDiscount].
         *
         * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount(): JsonField<Double> = percentageDiscount

        /**
         * Returns the raw JSON value of [appliesToPrices].
         *
         * Unlike [appliesToPrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        fun _appliesToPrices(): JsonField<List<AppliesToPrice>> = appliesToPrices

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MaximumAmountAdjustment = apply {
            if (validated) {
                return@apply
            }

            amountApplied()
            discountType()
            percentageDiscount()
            appliesToPrices()?.forEach { it.validate() }
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [MaximumAmountAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .amountApplied()
             * .discountType()
             * .percentageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [MaximumAmountAdjustment]. */
        class Builder internal constructor() {

            private var amountApplied: JsonField<String>? = null
            private var discountType: JsonField<DiscountType>? = null
            private var percentageDiscount: JsonField<Double>? = null
            private var appliesToPrices: JsonField<MutableList<AppliesToPrice>>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximumAmountAdjustment: MaximumAmountAdjustment) = apply {
                amountApplied = maximumAmountAdjustment.amountApplied
                discountType = maximumAmountAdjustment.discountType
                percentageDiscount = maximumAmountAdjustment.percentageDiscount
                appliesToPrices = maximumAmountAdjustment.appliesToPrices.map { it.toMutableList() }
                reason = maximumAmountAdjustment.reason
                additionalProperties = maximumAmountAdjustment.additionalProperties.toMutableMap()
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            /**
             * Sets [Builder.amountApplied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountApplied] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            /**
             * Sets [Builder.discountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountType] with a well-typed [DiscountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            /**
             * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentageDiscount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>?) =
                appliesToPrices(JsonField.ofNullable(appliesToPrices))

            /**
             * Sets [Builder.appliesToPrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPrices] with a well-typed
             * `List<AppliesToPrice>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [AppliesToPrice] to [appliesToPrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPrice(appliesToPrice: AppliesToPrice) = apply {
                appliesToPrices =
                    (appliesToPrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPrices", it).add(appliesToPrice)
                    }
            }

            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): MaximumAmountAdjustment =
                MaximumAmountAdjustment(
                    checkRequired("amountApplied", amountApplied),
                    checkRequired("discountType", discountType),
                    checkRequired("percentageDiscount", percentageDiscount),
                    (appliesToPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PERCENTAGE = of("percentage")

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            /** An enum containing [DiscountType]'s known values. */
            enum class Known {
                PERCENTAGE
            }

            /**
             * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DiscountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERCENTAGE,
                /**
                 * An enum member indicating that [DiscountType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AppliesToPrice
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliesToPrice = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AppliesToPrice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AppliesToPrice]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    id = appliesToPrice.id
                    name = appliesToPrice.name
                    additionalProperties = appliesToPrice.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppliesToPrice && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumAmountAdjustment && amountApplied == other.amountApplied && discountType == other.discountType && percentageDiscount == other.percentageDiscount && appliesToPrices == other.appliesToPrices && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountApplied, discountType, percentageDiscount, appliesToPrices, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MaximumAmountAdjustment{amountApplied=$amountApplied, discountType=$discountType, percentageDiscount=$percentageDiscount, appliesToPrices=$appliesToPrices, reason=$reason, additionalProperties=$additionalProperties}"
    }

    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val DUPLICATE = of("Duplicate")

            val FRAUDULENT = of("Fraudulent")

            val ORDER_CHANGE = of("Order change")

            val PRODUCT_UNSATISFACTORY = of("Product unsatisfactory")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
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
                DUPLICATE -> Value.DUPLICATE
                FRAUDULENT -> Value.FRAUDULENT
                ORDER_CHANGE -> Value.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Value.PRODUCT_UNSATISFACTORY
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
                DUPLICATE -> Known.DUPLICATE
                FRAUDULENT -> Known.FRAUDULENT
                ORDER_CHANGE -> Known.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Known.PRODUCT_UNSATISFACTORY
                else -> throw OrbInvalidDataException("Unknown Reason: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            val REFUND = of("refund")

            val ADJUSTMENT = of("adjustment")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REFUND,
            ADJUSTMENT,
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
            REFUND,
            ADJUSTMENT,
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
                REFUND -> Value.REFUND
                ADJUSTMENT -> Value.ADJUSTMENT
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
                REFUND -> Known.REFUND
                ADJUSTMENT -> Known.ADJUSTMENT
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Discount
    @JsonCreator
    private constructor(
        @JsonProperty("amount_applied")
        @ExcludeMissing
        private val amountApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_type")
        @ExcludeMissing
        private val discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        private val appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliesToPrices(): List<AppliesToPrice>? =
            appliesToPrices.getNullable("applies_to_prices")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Returns the raw JSON value of [amountApplied].
         *
         * Unlike [amountApplied], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_applied")
        @ExcludeMissing
        fun _amountApplied(): JsonField<String> = amountApplied

        /**
         * Returns the raw JSON value of [discountType].
         *
         * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_type")
        @ExcludeMissing
        fun _discountType(): JsonField<DiscountType> = discountType

        /**
         * Returns the raw JSON value of [percentageDiscount].
         *
         * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount(): JsonField<Double> = percentageDiscount

        /**
         * Returns the raw JSON value of [appliesToPrices].
         *
         * Unlike [appliesToPrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        fun _appliesToPrices(): JsonField<List<AppliesToPrice>> = appliesToPrices

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            amountApplied()
            discountType()
            percentageDiscount()
            appliesToPrices()?.forEach { it.validate() }
            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Discount].
             *
             * The following fields are required:
             * ```kotlin
             * .amountApplied()
             * .discountType()
             * .percentageDiscount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Discount]. */
        class Builder internal constructor() {

            private var amountApplied: JsonField<String>? = null
            private var discountType: JsonField<DiscountType>? = null
            private var percentageDiscount: JsonField<Double>? = null
            private var appliesToPrices: JsonField<MutableList<AppliesToPrice>>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(discount: Discount) = apply {
                amountApplied = discount.amountApplied
                discountType = discount.discountType
                percentageDiscount = discount.percentageDiscount
                appliesToPrices = discount.appliesToPrices.map { it.toMutableList() }
                reason = discount.reason
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            /**
             * Sets [Builder.amountApplied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountApplied] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            /**
             * Sets [Builder.discountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountType] with a well-typed [DiscountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            /**
             * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentageDiscount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>?) =
                appliesToPrices(JsonField.ofNullable(appliesToPrices))

            /**
             * Sets [Builder.appliesToPrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPrices] with a well-typed
             * `List<AppliesToPrice>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [AppliesToPrice] to [appliesToPrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPrice(appliesToPrice: AppliesToPrice) = apply {
                appliesToPrices =
                    (appliesToPrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPrices", it).add(appliesToPrice)
                    }
            }

            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): Discount =
                Discount(
                    checkRequired("amountApplied", amountApplied),
                    checkRequired("discountType", discountType),
                    checkRequired("percentageDiscount", percentageDiscount),
                    (appliesToPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PERCENTAGE = of("percentage")

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            /** An enum containing [DiscountType]'s known values. */
            enum class Known {
                PERCENTAGE
            }

            /**
             * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DiscountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PERCENTAGE,
                /**
                 * An enum member indicating that [DiscountType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AppliesToPrice
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliesToPrice = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AppliesToPrice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AppliesToPrice]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    id = appliesToPrice.id
                    name = appliesToPrice.name
                    additionalProperties = appliesToPrice.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppliesToPrice && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && amountApplied == other.amountApplied && discountType == other.discountType && percentageDiscount == other.percentageDiscount && appliesToPrices == other.appliesToPrices && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountApplied, discountType, percentageDiscount, appliesToPrices, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{amountApplied=$amountApplied, discountType=$discountType, percentageDiscount=$percentageDiscount, appliesToPrices=$appliesToPrices, reason=$reason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNote && id == other.id && createdAt == other.createdAt && creditNoteNumber == other.creditNoteNumber && creditNotePdf == other.creditNotePdf && customer == other.customer && invoiceId == other.invoiceId && lineItems == other.lineItems && maximumAmountAdjustment == other.maximumAmountAdjustment && memo == other.memo && minimumAmountRefunded == other.minimumAmountRefunded && reason == other.reason && subtotal == other.subtotal && total == other.total && type == other.type && voidedAt == other.voidedAt && discounts == other.discounts && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, creditNoteNumber, creditNotePdf, customer, invoiceId, lineItems, maximumAmountAdjustment, memo, minimumAmountRefunded, reason, subtotal, total, type, voidedAt, discounts, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditNote{id=$id, createdAt=$createdAt, creditNoteNumber=$creditNoteNumber, creditNotePdf=$creditNotePdf, customer=$customer, invoiceId=$invoiceId, lineItems=$lineItems, maximumAmountAdjustment=$maximumAmountAdjustment, memo=$memo, minimumAmountRefunded=$minimumAmountRefunded, reason=$reason, subtotal=$subtotal, total=$total, type=$type, voidedAt=$voidedAt, discounts=$discounts, additionalProperties=$additionalProperties}"
}
