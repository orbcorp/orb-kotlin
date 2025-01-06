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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class CustomerBalanceTransactionListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("action")
    @ExcludeMissing
    private val action: JsonField<Action> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_note")
    @ExcludeMissing
    private val creditNote: JsonField<CreditNote> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice")
    @ExcludeMissing
    private val invoice: JsonField<Invoice> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A unique id for this transaction. */
    fun id(): String = id.getRequired("id")

    fun action(): Action = action.getRequired("action")

    /** The value of the amount changed in the transaction. */
    fun amount(): String = amount.getRequired("amount")

    /** The creation time of this transaction. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun creditNote(): CreditNote? = creditNote.getNullable("credit_note")

    /** An optional description provided for manual customer balance adjustments. */
    fun description(): String? = description.getNullable("description")

    /**
     * The new value of the customer's balance prior to the transaction, in the customer's currency.
     */
    fun endingBalance(): String = endingBalance.getRequired("ending_balance")

    fun invoice(): Invoice? = invoice.getNullable("invoice")

    /**
     * The original value of the customer's balance prior to the transaction, in the customer's
     * currency.
     */
    fun startingBalance(): String = startingBalance.getRequired("starting_balance")

    fun type(): Type = type.getRequired("type")

    /** A unique id for this transaction. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("action") @ExcludeMissing fun _action() = action

    /** The value of the amount changed in the transaction. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The creation time of this transaction. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("credit_note") @ExcludeMissing fun _creditNote() = creditNote

    /** An optional description provided for manual customer balance adjustments. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The new value of the customer's balance prior to the transaction, in the customer's currency.
     */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    @JsonProperty("invoice") @ExcludeMissing fun _invoice() = invoice

    /**
     * The original value of the customer's balance prior to the transaction, in the customer's
     * currency.
     */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerBalanceTransactionListResponse = apply {
        if (!validated) {
            id()
            action()
            amount()
            createdAt()
            creditNote()?.validate()
            description()
            endingBalance()
            invoice()?.validate()
            startingBalance()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var action: JsonField<Action> = JsonMissing.of()
        private var amount: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditNote: JsonField<CreditNote> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var endingBalance: JsonField<String> = JsonMissing.of()
        private var invoice: JsonField<Invoice> = JsonMissing.of()
        private var startingBalance: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerBalanceTransactionListResponse: CustomerBalanceTransactionListResponse
        ) = apply {
            id = customerBalanceTransactionListResponse.id
            action = customerBalanceTransactionListResponse.action
            amount = customerBalanceTransactionListResponse.amount
            createdAt = customerBalanceTransactionListResponse.createdAt
            creditNote = customerBalanceTransactionListResponse.creditNote
            description = customerBalanceTransactionListResponse.description
            endingBalance = customerBalanceTransactionListResponse.endingBalance
            invoice = customerBalanceTransactionListResponse.invoice
            startingBalance = customerBalanceTransactionListResponse.startingBalance
            type = customerBalanceTransactionListResponse.type
            additionalProperties =
                customerBalanceTransactionListResponse.additionalProperties.toMutableMap()
        }

        /** A unique id for this transaction. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique id for this transaction. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun action(action: Action) = action(JsonField.of(action))

        fun action(action: JsonField<Action>) = apply { this.action = action }

        /** The value of the amount changed in the transaction. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The value of the amount changed in the transaction. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The creation time of this transaction. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of this transaction. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun creditNote(creditNote: CreditNote) = creditNote(JsonField.of(creditNote))

        fun creditNote(creditNote: JsonField<CreditNote>) = apply { this.creditNote = creditNote }

        /** An optional description provided for manual customer balance adjustments. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description provided for manual customer balance adjustments. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun endingBalance(endingBalance: JsonField<String>) = apply {
            this.endingBalance = endingBalance
        }

        fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun startingBalance(startingBalance: String) =
            startingBalance(JsonField.of(startingBalance))

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun startingBalance(startingBalance: JsonField<String>) = apply {
            this.startingBalance = startingBalance
        }

        fun type(type: Type) = type(JsonField.of(type))

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

        fun build(): CustomerBalanceTransactionListResponse =
            CustomerBalanceTransactionListResponse(
                id,
                action,
                amount,
                createdAt,
                creditNote,
                description,
                endingBalance,
                invoice,
                startingBalance,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Action
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPLIED_TO_INVOICE = of("applied_to_invoice")

            val MANUAL_ADJUSTMENT = of("manual_adjustment")

            val PRORATED_REFUND = of("prorated_refund")

            val REVERT_PRORATED_REFUND = of("revert_prorated_refund")

            val RETURN_FROM_VOIDING = of("return_from_voiding")

            val CREDIT_NOTE_APPLIED = of("credit_note_applied")

            val CREDIT_NOTE_VOIDED = of("credit_note_voided")

            val OVERPAYMENT_REFUND = of("overpayment_refund")

            fun of(value: String) = Action(JsonField.of(value))
        }

        enum class Known {
            APPLIED_TO_INVOICE,
            MANUAL_ADJUSTMENT,
            PRORATED_REFUND,
            REVERT_PRORATED_REFUND,
            RETURN_FROM_VOIDING,
            CREDIT_NOTE_APPLIED,
            CREDIT_NOTE_VOIDED,
            OVERPAYMENT_REFUND,
        }

        enum class Value {
            APPLIED_TO_INVOICE,
            MANUAL_ADJUSTMENT,
            PRORATED_REFUND,
            REVERT_PRORATED_REFUND,
            RETURN_FROM_VOIDING,
            CREDIT_NOTE_APPLIED,
            CREDIT_NOTE_VOIDED,
            OVERPAYMENT_REFUND,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLIED_TO_INVOICE -> Value.APPLIED_TO_INVOICE
                MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                PRORATED_REFUND -> Value.PRORATED_REFUND
                REVERT_PRORATED_REFUND -> Value.REVERT_PRORATED_REFUND
                RETURN_FROM_VOIDING -> Value.RETURN_FROM_VOIDING
                CREDIT_NOTE_APPLIED -> Value.CREDIT_NOTE_APPLIED
                CREDIT_NOTE_VOIDED -> Value.CREDIT_NOTE_VOIDED
                OVERPAYMENT_REFUND -> Value.OVERPAYMENT_REFUND
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLIED_TO_INVOICE -> Known.APPLIED_TO_INVOICE
                MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                PRORATED_REFUND -> Known.PRORATED_REFUND
                REVERT_PRORATED_REFUND -> Known.REVERT_PRORATED_REFUND
                RETURN_FROM_VOIDING -> Known.RETURN_FROM_VOIDING
                CREDIT_NOTE_APPLIED -> Known.CREDIT_NOTE_APPLIED
                CREDIT_NOTE_VOIDED -> Known.CREDIT_NOTE_VOIDED
                OVERPAYMENT_REFUND -> Known.OVERPAYMENT_REFUND
                else -> throw OrbInvalidDataException("Unknown Action: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Action && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class CreditNote
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the Credit note */
        fun id(): String = id.getRequired("id")

        /** The id of the Credit note */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditNote = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditNote: CreditNote) = apply {
                id = creditNote.id
                additionalProperties = creditNote.additionalProperties.toMutableMap()
            }

            /** The id of the Credit note */
            fun id(id: String) = id(JsonField.of(id))

            /** The id of the Credit note */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): CreditNote = CreditNote(id, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditNote && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreditNote{id=$id, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Invoice
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Invoice id */
        fun id(): String = id.getRequired("id")

        /** The Invoice id */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Invoice = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoice: Invoice) = apply {
                id = invoice.id
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            /** The Invoice id */
            fun id(id: String) = id(JsonField.of(id))

            /** The Invoice id */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Invoice = Invoice(id, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Invoice && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Invoice{id=$id, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INCREMENT = of("increment")

            val DECREMENT = of("decrement")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INCREMENT,
            DECREMENT,
        }

        enum class Value {
            INCREMENT,
            DECREMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCREMENT -> Value.INCREMENT
                DECREMENT -> Value.DECREMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCREMENT -> Known.INCREMENT
                DECREMENT -> Known.DECREMENT
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListResponse && id == other.id && action == other.action && amount == other.amount && createdAt == other.createdAt && creditNote == other.creditNote && description == other.description && endingBalance == other.endingBalance && invoice == other.invoice && startingBalance == other.startingBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, action, amount, createdAt, creditNote, description, endingBalance, invoice, startingBalance, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerBalanceTransactionListResponse{id=$id, action=$action, amount=$amount, createdAt=$createdAt, creditNote=$creditNote, description=$description, endingBalance=$endingBalance, invoice=$invoice, startingBalance=$startingBalance, type=$type, additionalProperties=$additionalProperties}"
}
