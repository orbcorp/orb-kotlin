// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The [Credit Note](/guides/invoicing/credit-notes) resource represents a credit that has been
 * applied to a particular invoice.
 */
@JsonDeserialize(builder = CreditNote.Builder::class)
@NoAutoDetect
class CreditNote
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val voidedAt: JsonField<OffsetDateTime>,
    private val creditNoteNumber: JsonField<String>,
    private val invoiceId: JsonField<String>,
    private val memo: JsonField<String>,
    private val reason: JsonField<Reason>,
    private val type: JsonField<Type>,
    private val subtotal: JsonField<String>,
    private val total: JsonField<String>,
    private val customer: JsonField<Customer>,
    private val creditNotePdf: JsonField<String>,
    private val minimumAmountRefunded: JsonField<String>,
    private val discounts: JsonField<List<Discount>>,
    private val maximumAmountAdjustment: JsonField<MaximumAmountAdjustment>,
    private val lineItems: JsonField<List<LineItem>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Orb id of this credit note. */
    fun id(): String = id.getRequired("id")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time at which the credit note was voided in Orb, if applicable. */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    /** The unique identifier for credit notes. */
    fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

    /** The id of the invoice resource that this credit note is applied to. */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /** An optional memo supplied on the credit note. */
    fun memo(): String? = memo.getNullable("memo")

    fun reason(): Reason? = reason.getNullable("reason")

    fun type(): Type = type.getRequired("type")

    /** The total prior to any creditable invoice-level discounts or minimums. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /** The total including creditable invoice-level discounts or minimums, and tax. */
    fun total(): String = total.getRequired("total")

    fun customer(): Customer = customer.getRequired("customer")

    /** A URL to a PDF of the credit note. */
    fun creditNotePdf(): String? = creditNotePdf.getNullable("credit_note_pdf")

    /** Any credited amount from the applied minimum on the invoice. */
    fun minimumAmountRefunded(): String? =
        minimumAmountRefunded.getNullable("minimum_amount_refunded")

    /** Any discounts applied on the original invoice. */
    fun discounts(): List<Discount>? = discounts.getNullable("discounts")

    /** The maximum amount applied on the original invoice */
    fun maximumAmountAdjustment(): MaximumAmountAdjustment? =
        maximumAmountAdjustment.getNullable("maximum_amount_adjustment")

    /** All of the line items associated with this credit note. */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    /** The Orb id of this credit note. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The time at which the credit note was voided in Orb, if applicable. */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt() = voidedAt

    /** The unique identifier for credit notes. */
    @JsonProperty("credit_note_number") @ExcludeMissing fun _creditNoteNumber() = creditNoteNumber

    /** The id of the invoice resource that this credit note is applied to. */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

    /** An optional memo supplied on the credit note. */
    @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The total prior to any creditable invoice-level discounts or minimums. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /** The total including creditable invoice-level discounts or minimums, and tax. */
    @JsonProperty("total") @ExcludeMissing fun _total() = total

    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /** A URL to a PDF of the credit note. */
    @JsonProperty("credit_note_pdf") @ExcludeMissing fun _creditNotePdf() = creditNotePdf

    /** Any credited amount from the applied minimum on the invoice. */
    @JsonProperty("minimum_amount_refunded")
    @ExcludeMissing
    fun _minimumAmountRefunded() = minimumAmountRefunded

    /** Any discounts applied on the original invoice. */
    @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

    /** The maximum amount applied on the original invoice */
    @JsonProperty("maximum_amount_adjustment")
    @ExcludeMissing
    fun _maximumAmountAdjustment() = maximumAmountAdjustment

    /** All of the line items associated with this credit note. */
    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreditNote = apply {
        if (!validated) {
            id()
            createdAt()
            voidedAt()
            creditNoteNumber()
            invoiceId()
            memo()
            reason()
            type()
            subtotal()
            total()
            customer().validate()
            creditNotePdf()
            minimumAmountRefunded()
            discounts()?.forEach { it.validate() }
            maximumAmountAdjustment()?.validate()
            lineItems().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditNote &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.voidedAt == other.voidedAt &&
            this.creditNoteNumber == other.creditNoteNumber &&
            this.invoiceId == other.invoiceId &&
            this.memo == other.memo &&
            this.reason == other.reason &&
            this.type == other.type &&
            this.subtotal == other.subtotal &&
            this.total == other.total &&
            this.customer == other.customer &&
            this.creditNotePdf == other.creditNotePdf &&
            this.minimumAmountRefunded == other.minimumAmountRefunded &&
            this.discounts == other.discounts &&
            this.maximumAmountAdjustment == other.maximumAmountAdjustment &&
            this.lineItems == other.lineItems &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    voidedAt,
                    creditNoteNumber,
                    invoiceId,
                    memo,
                    reason,
                    type,
                    subtotal,
                    total,
                    customer,
                    creditNotePdf,
                    minimumAmountRefunded,
                    discounts,
                    maximumAmountAdjustment,
                    lineItems,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreditNote{id=$id, createdAt=$createdAt, voidedAt=$voidedAt, creditNoteNumber=$creditNoteNumber, invoiceId=$invoiceId, memo=$memo, reason=$reason, type=$type, subtotal=$subtotal, total=$total, customer=$customer, creditNotePdf=$creditNotePdf, minimumAmountRefunded=$minimumAmountRefunded, discounts=$discounts, maximumAmountAdjustment=$maximumAmountAdjustment, lineItems=$lineItems, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var voidedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditNoteNumber: JsonField<String> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var subtotal: JsonField<String> = JsonMissing.of()
        private var total: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var creditNotePdf: JsonField<String> = JsonMissing.of()
        private var minimumAmountRefunded: JsonField<String> = JsonMissing.of()
        private var discounts: JsonField<List<Discount>> = JsonMissing.of()
        private var maximumAmountAdjustment: JsonField<MaximumAmountAdjustment> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditNote: CreditNote) = apply {
            this.id = creditNote.id
            this.createdAt = creditNote.createdAt
            this.voidedAt = creditNote.voidedAt
            this.creditNoteNumber = creditNote.creditNoteNumber
            this.invoiceId = creditNote.invoiceId
            this.memo = creditNote.memo
            this.reason = creditNote.reason
            this.type = creditNote.type
            this.subtotal = creditNote.subtotal
            this.total = creditNote.total
            this.customer = creditNote.customer
            this.creditNotePdf = creditNote.creditNotePdf
            this.minimumAmountRefunded = creditNote.minimumAmountRefunded
            this.discounts = creditNote.discounts
            this.maximumAmountAdjustment = creditNote.maximumAmountAdjustment
            this.lineItems = creditNote.lineItems
            additionalProperties(creditNote.additionalProperties)
        }

        /** The Orb id of this credit note. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Orb id of this credit note. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time at which the credit note was voided in Orb, if applicable. */
        fun voidedAt(voidedAt: OffsetDateTime) = voidedAt(JsonField.of(voidedAt))

        /** The time at which the credit note was voided in Orb, if applicable. */
        @JsonProperty("voided_at")
        @ExcludeMissing
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /** The unique identifier for credit notes. */
        fun creditNoteNumber(creditNoteNumber: String) =
            creditNoteNumber(JsonField.of(creditNoteNumber))

        /** The unique identifier for credit notes. */
        @JsonProperty("credit_note_number")
        @ExcludeMissing
        fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
            this.creditNoteNumber = creditNoteNumber
        }

        /** The id of the invoice resource that this credit note is applied to. */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /** The id of the invoice resource that this credit note is applied to. */
        @JsonProperty("invoice_id")
        @ExcludeMissing
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** An optional memo supplied on the credit note. */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /** An optional memo supplied on the credit note. */
        @JsonProperty("memo")
        @ExcludeMissing
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        fun reason(reason: Reason) = reason(JsonField.of(reason))

        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The total prior to any creditable invoice-level discounts or minimums. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The total prior to any creditable invoice-level discounts or minimums. */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** The total including creditable invoice-level discounts or minimums, and tax. */
        fun total(total: String) = total(JsonField.of(total))

        /** The total including creditable invoice-level discounts or minimums, and tax. */
        @JsonProperty("total")
        @ExcludeMissing
        fun total(total: JsonField<String>) = apply { this.total = total }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        @JsonProperty("customer")
        @ExcludeMissing
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** A URL to a PDF of the credit note. */
        fun creditNotePdf(creditNotePdf: String) = creditNotePdf(JsonField.of(creditNotePdf))

        /** A URL to a PDF of the credit note. */
        @JsonProperty("credit_note_pdf")
        @ExcludeMissing
        fun creditNotePdf(creditNotePdf: JsonField<String>) = apply {
            this.creditNotePdf = creditNotePdf
        }

        /** Any credited amount from the applied minimum on the invoice. */
        fun minimumAmountRefunded(minimumAmountRefunded: String) =
            minimumAmountRefunded(JsonField.of(minimumAmountRefunded))

        /** Any credited amount from the applied minimum on the invoice. */
        @JsonProperty("minimum_amount_refunded")
        @ExcludeMissing
        fun minimumAmountRefunded(minimumAmountRefunded: JsonField<String>) = apply {
            this.minimumAmountRefunded = minimumAmountRefunded
        }

        /** Any discounts applied on the original invoice. */
        fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

        /** Any discounts applied on the original invoice. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun discounts(discounts: JsonField<List<Discount>>) = apply { this.discounts = discounts }

        /** The maximum amount applied on the original invoice */
        fun maximumAmountAdjustment(maximumAmountAdjustment: MaximumAmountAdjustment) =
            maximumAmountAdjustment(JsonField.of(maximumAmountAdjustment))

        /** The maximum amount applied on the original invoice */
        @JsonProperty("maximum_amount_adjustment")
        @ExcludeMissing
        fun maximumAmountAdjustment(maximumAmountAdjustment: JsonField<MaximumAmountAdjustment>) =
            apply {
                this.maximumAmountAdjustment = maximumAmountAdjustment
            }

        /** All of the line items associated with this credit note. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** All of the line items associated with this credit note. */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CreditNote =
            CreditNote(
                id,
                createdAt,
                voidedAt,
                creditNoteNumber,
                invoiceId,
                memo,
                reason,
                type,
                subtotal,
                total,
                customer,
                creditNotePdf,
                minimumAmountRefunded,
                discounts.map { it.toUnmodifiable() },
                maximumAmountAdjustment,
                lineItems.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Customer.Builder::class)
    @NoAutoDetect
    class Customer
    private constructor(
        private val id: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId() = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Customer = apply {
            if (!validated) {
                id()
                externalCustomerId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Customer &&
                this.id == other.id &&
                this.externalCustomerId == other.externalCustomerId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        externalCustomerId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Customer{id=$id, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customer: Customer) = apply {
                this.id = customer.id
                this.externalCustomerId = customer.externalCustomerId
                additionalProperties(customer.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun externalCustomerId(externalCustomerId: String) =
                externalCustomerId(JsonField.of(externalCustomerId))

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Customer =
                Customer(
                    id,
                    externalCustomerId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val subtotal: JsonField<String>,
        private val amount: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val discounts: JsonField<List<Discount>>,
        private val taxAmounts: JsonField<List<TaxAmount>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The Orb id of this resource. */
        fun id(): String = id.getRequired("id")

        /** The name of the corresponding invoice line item. */
        fun name(): String = name.getRequired("name")

        /** The amount of the line item, excluding any line item minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /** The amount of the line item, including any line item minimums and discounts. */
        fun amount(): String = amount.getRequired("amount")

        /** An optional quantity credited. */
        fun quantity(): Double? = quantity.getNullable("quantity")

        /** Any line item discounts from the invoice's line item. */
        fun discounts(): List<Discount>? = discounts.getNullable("discounts")

        /** Any tax amounts applied onto the line item. */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /** The Orb id of this resource. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The name of the corresponding invoice line item. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The amount of the line item, excluding any line item minimums and discounts. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        /** The amount of the line item, including any line item minimums and discounts. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** An optional quantity credited. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Any line item discounts from the invoice's line item. */
        @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

        /** Any tax amounts applied onto the line item. */
        @JsonProperty("tax_amounts") @ExcludeMissing fun _taxAmounts() = taxAmounts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LineItem = apply {
            if (!validated) {
                id()
                name()
                subtotal()
                amount()
                quantity()
                discounts()?.forEach { it.validate() }
                taxAmounts().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItem &&
                this.id == other.id &&
                this.name == other.name &&
                this.subtotal == other.subtotal &&
                this.amount == other.amount &&
                this.quantity == other.quantity &&
                this.discounts == other.discounts &&
                this.taxAmounts == other.taxAmounts &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        name,
                        subtotal,
                        amount,
                        quantity,
                        discounts,
                        taxAmounts,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LineItem{id=$id, name=$name, subtotal=$subtotal, amount=$amount, quantity=$quantity, discounts=$discounts, taxAmounts=$taxAmounts, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var subtotal: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var discounts: JsonField<List<Discount>> = JsonMissing.of()
            private var taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItem: LineItem) = apply {
                this.id = lineItem.id
                this.name = lineItem.name
                this.subtotal = lineItem.subtotal
                this.amount = lineItem.amount
                this.quantity = lineItem.quantity
                this.discounts = lineItem.discounts
                this.taxAmounts = lineItem.taxAmounts
                additionalProperties(lineItem.additionalProperties)
            }

            /** The Orb id of this resource. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Orb id of this resource. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The name of the corresponding invoice line item. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the corresponding invoice line item. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The amount of the line item, excluding any line item minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** The amount of the line item, excluding any line item minimums and discounts. */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /** The amount of the line item, including any line item minimums and discounts. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of the line item, including any line item minimums and discounts. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** An optional quantity credited. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** An optional quantity credited. */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Any line item discounts from the invoice's line item. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /** Any line item discounts from the invoice's line item. */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts
            }

            /** Any tax amounts applied onto the line item. */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /** Any tax amounts applied onto the line item. */
            @JsonProperty("tax_amounts")
            @ExcludeMissing
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): LineItem =
                LineItem(
                    id,
                    name,
                    subtotal,
                    amount,
                    quantity,
                    discounts.map { it.toUnmodifiable() },
                    taxAmounts.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = TaxAmount.Builder::class)
        @NoAutoDetect
        class TaxAmount
        private constructor(
            private val taxRateDescription: JsonField<String>,
            private val taxRatePercentage: JsonField<String>,
            private val amount: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(): String = amount.getRequired("amount")

            /** The human-readable description of the applied tax rate. */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription() = taxRateDescription

            /** The tax rate percentage, out of 100. */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage() = taxRatePercentage

            /** The amount of additional tax incurred by this tax rate. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TaxAmount = apply {
                if (!validated) {
                    taxRateDescription()
                    taxRatePercentage()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TaxAmount &&
                    this.taxRateDescription == other.taxRateDescription &&
                    this.taxRatePercentage == other.taxRatePercentage &&
                    this.amount == other.amount &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            taxRateDescription,
                            taxRatePercentage,
                            amount,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "TaxAmount{taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, amount=$amount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var taxRateDescription: JsonField<String> = JsonMissing.of()
                private var taxRatePercentage: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(taxAmount: TaxAmount) = apply {
                    this.taxRateDescription = taxAmount.taxRateDescription
                    this.taxRatePercentage = taxAmount.taxRatePercentage
                    this.amount = taxAmount.amount
                    additionalProperties(taxAmount.additionalProperties)
                }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /** The human-readable description of the applied tax rate. */
                @JsonProperty("tax_rate_description")
                @ExcludeMissing
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String) =
                    taxRatePercentage(JsonField.of(taxRatePercentage))

                /** The tax rate percentage, out of 100. */
                @JsonProperty("tax_rate_percentage")
                @ExcludeMissing
                fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                    this.taxRatePercentage = taxRatePercentage
                }

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The amount of additional tax incurred by this tax rate. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TaxAmount =
                    TaxAmount(
                        taxRateDescription,
                        taxRatePercentage,
                        amount,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = Discount.Builder::class)
        @NoAutoDetect
        class Discount
        private constructor(
            private val id: JsonField<String>,
            private val discountType: JsonField<DiscountType>,
            private val percentageDiscount: JsonField<Double>,
            private val amountDiscount: JsonField<String>,
            private val amountApplied: JsonField<String>,
            private val reason: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

            fun amountApplied(): String = amountApplied.getRequired("amount_applied")

            fun reason(): String? = reason.getNullable("reason")

            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount() = percentageDiscount

            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

            @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Discount = apply {
                if (!validated) {
                    id()
                    discountType()
                    percentageDiscount()
                    amountDiscount()
                    amountApplied()
                    reason()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Discount &&
                    this.id == other.id &&
                    this.discountType == other.discountType &&
                    this.percentageDiscount == other.percentageDiscount &&
                    this.amountDiscount == other.amountDiscount &&
                    this.amountApplied == other.amountApplied &&
                    this.reason == other.reason &&
                    this.appliesToPriceIds == other.appliesToPriceIds &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            discountType,
                            percentageDiscount,
                            amountDiscount,
                            amountApplied,
                            reason,
                            appliesToPriceIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Discount{id=$id, discountType=$discountType, percentageDiscount=$percentageDiscount, amountDiscount=$amountDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var amountApplied: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(discount: Discount) = apply {
                    this.id = discount.id
                    this.discountType = discount.discountType
                    this.percentageDiscount = discount.percentageDiscount
                    this.amountDiscount = discount.amountDiscount
                    this.amountApplied = discount.amountApplied
                    this.reason = discount.reason
                    this.appliesToPriceIds = discount.appliesToPriceIds
                    additionalProperties(discount.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                fun amountApplied(amountApplied: String) =
                    amountApplied(JsonField.of(amountApplied))

                @JsonProperty("amount_applied")
                @ExcludeMissing
                fun amountApplied(amountApplied: JsonField<String>) = apply {
                    this.amountApplied = amountApplied
                }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Discount =
                    Discount(
                        id,
                        discountType,
                        percentageDiscount,
                        amountDiscount,
                        amountApplied,
                        reason,
                        appliesToPriceIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DiscountType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                    val AMOUNT = DiscountType(JsonField.of("amount"))

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    PERCENTAGE,
                    AMOUNT,
                }

                enum class Value {
                    PERCENTAGE,
                    AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    /** The maximum amount applied on the original invoice */
    @JsonDeserialize(builder = MaximumAmountAdjustment.Builder::class)
    @NoAutoDetect
    class MaximumAmountAdjustment
    private constructor(
        private val discountType: JsonField<DiscountType>,
        private val percentageDiscount: JsonField<Double>,
        private val amountApplied: JsonField<String>,
        private val reason: JsonField<String>,
        private val appliesToPrices: JsonField<List<AppliesToPrice>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        fun reason(): String? = reason.getNullable("reason")

        fun appliesToPrices(): List<AppliesToPrice>? =
            appliesToPrices.getNullable("applies_to_prices")

        @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount() = percentageDiscount

        @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("applies_to_prices") @ExcludeMissing fun _appliesToPrices() = appliesToPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MaximumAmountAdjustment = apply {
            if (!validated) {
                discountType()
                percentageDiscount()
                amountApplied()
                reason()
                appliesToPrices()?.forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MaximumAmountAdjustment &&
                this.discountType == other.discountType &&
                this.percentageDiscount == other.percentageDiscount &&
                this.amountApplied == other.amountApplied &&
                this.reason == other.reason &&
                this.appliesToPrices == other.appliesToPrices &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        discountType,
                        percentageDiscount,
                        amountApplied,
                        reason,
                        appliesToPrices,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MaximumAmountAdjustment{discountType=$discountType, percentageDiscount=$percentageDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPrices=$appliesToPrices, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var discountType: JsonField<DiscountType> = JsonMissing.of()
            private var percentageDiscount: JsonField<Double> = JsonMissing.of()
            private var amountApplied: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximumAmountAdjustment: MaximumAmountAdjustment) = apply {
                this.discountType = maximumAmountAdjustment.discountType
                this.percentageDiscount = maximumAmountAdjustment.percentageDiscount
                this.amountApplied = maximumAmountAdjustment.amountApplied
                this.reason = maximumAmountAdjustment.reason
                this.appliesToPrices = maximumAmountAdjustment.appliesToPrices
                additionalProperties(maximumAmountAdjustment.additionalProperties)
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            @JsonProperty("amount_applied")
            @ExcludeMissing
            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>) =
                appliesToPrices(JsonField.of(appliesToPrices))

            @JsonProperty("applies_to_prices")
            @ExcludeMissing
            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): MaximumAmountAdjustment =
                MaximumAmountAdjustment(
                    discountType,
                    percentageDiscount,
                    amountApplied,
                    reason,
                    appliesToPrices.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiscountType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            enum class Known {
                PERCENTAGE,
            }

            enum class Value {
                PERCENTAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = AppliesToPrice.Builder::class)
        @NoAutoDetect
        class AppliesToPrice
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AppliesToPrice = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AppliesToPrice &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    this.id = appliesToPrice.id
                    this.name = appliesToPrice.name
                    additionalProperties(appliesToPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DUPLICATE = Reason(JsonField.of("Duplicate"))

            val FRAUDULENT = Reason(JsonField.of("Fraudulent"))

            val ORDER_CHANGE = Reason(JsonField.of("Order change"))

            val PRODUCT_UNSATISFACTORY = Reason(JsonField.of("Product unsatisfactory"))

            fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
        }

        enum class Value {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                FRAUDULENT -> Value.FRAUDULENT
                ORDER_CHANGE -> Value.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Value.PRODUCT_UNSATISFACTORY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DUPLICATE -> Known.DUPLICATE
                FRAUDULENT -> Known.FRAUDULENT
                ORDER_CHANGE -> Known.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Known.PRODUCT_UNSATISFACTORY
                else -> throw OrbInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val REFUND = Type(JsonField.of("refund"))

            val ADJUSTMENT = Type(JsonField.of("adjustment"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REFUND,
            ADJUSTMENT,
        }

        enum class Value {
            REFUND,
            ADJUSTMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REFUND -> Value.REFUND
                ADJUSTMENT -> Value.ADJUSTMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REFUND -> Known.REFUND
                ADJUSTMENT -> Known.ADJUSTMENT
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Discount.Builder::class)
    @NoAutoDetect
    class Discount
    private constructor(
        private val discountType: JsonField<DiscountType>,
        private val percentageDiscount: JsonField<Double>,
        private val amountApplied: JsonField<String>,
        private val reason: JsonField<String>,
        private val appliesToPrices: JsonField<List<AppliesToPrice>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        fun reason(): String? = reason.getNullable("reason")

        fun appliesToPrices(): List<AppliesToPrice>? =
            appliesToPrices.getNullable("applies_to_prices")

        @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount() = percentageDiscount

        @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("applies_to_prices") @ExcludeMissing fun _appliesToPrices() = appliesToPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Discount = apply {
            if (!validated) {
                discountType()
                percentageDiscount()
                amountApplied()
                reason()
                appliesToPrices()?.forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Discount &&
                this.discountType == other.discountType &&
                this.percentageDiscount == other.percentageDiscount &&
                this.amountApplied == other.amountApplied &&
                this.reason == other.reason &&
                this.appliesToPrices == other.appliesToPrices &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        discountType,
                        percentageDiscount,
                        amountApplied,
                        reason,
                        appliesToPrices,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPrices=$appliesToPrices, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var discountType: JsonField<DiscountType> = JsonMissing.of()
            private var percentageDiscount: JsonField<Double> = JsonMissing.of()
            private var amountApplied: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(discount: Discount) = apply {
                this.discountType = discount.discountType
                this.percentageDiscount = discount.percentageDiscount
                this.amountApplied = discount.amountApplied
                this.reason = discount.reason
                this.appliesToPrices = discount.appliesToPrices
                additionalProperties(discount.additionalProperties)
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            @JsonProperty("amount_applied")
            @ExcludeMissing
            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>) =
                appliesToPrices(JsonField.of(appliesToPrices))

            @JsonProperty("applies_to_prices")
            @ExcludeMissing
            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Discount =
                Discount(
                    discountType,
                    percentageDiscount,
                    amountApplied,
                    reason,
                    appliesToPrices.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiscountType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                fun of(value: String) = DiscountType(JsonField.of(value))
            }

            enum class Known {
                PERCENTAGE,
            }

            enum class Value {
                PERCENTAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = AppliesToPrice.Builder::class)
        @NoAutoDetect
        class AppliesToPrice
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AppliesToPrice = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AppliesToPrice &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    this.id = appliesToPrice.id
                    this.name = appliesToPrice.name
                    additionalProperties(appliesToPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        id,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
