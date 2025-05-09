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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
@JsonDeserialize(using = CustomerCreditLedgerListByExternalIdResponse.Deserializer::class)
@JsonSerialize(using = CustomerCreditLedgerListByExternalIdResponse.Serializer::class)
class CustomerCreditLedgerListByExternalIdResponse
private constructor(
    private val increment: Increment? = null,
    private val decrement: Decrement? = null,
    private val expirationChange: ExpirationChange? = null,
    private val creditBlockExpiry: CreditBlockExpiry? = null,
    private val void: Void? = null,
    private val voidInitiated: VoidInitiated? = null,
    private val amendment: Amendment? = null,
    private val _json: JsonValue? = null,
) {

    fun increment(): Increment? = increment

    fun decrement(): Decrement? = decrement

    fun expirationChange(): ExpirationChange? = expirationChange

    fun creditBlockExpiry(): CreditBlockExpiry? = creditBlockExpiry

    fun void(): Void? = void

    fun voidInitiated(): VoidInitiated? = voidInitiated

    fun amendment(): Amendment? = amendment

    fun isIncrement(): Boolean = increment != null

    fun isDecrement(): Boolean = decrement != null

    fun isExpirationChange(): Boolean = expirationChange != null

    fun isCreditBlockExpiry(): Boolean = creditBlockExpiry != null

    fun isVoid(): Boolean = void != null

    fun isVoidInitiated(): Boolean = voidInitiated != null

    fun isAmendment(): Boolean = amendment != null

    fun asIncrement(): Increment = increment.getOrThrow("increment")

    fun asDecrement(): Decrement = decrement.getOrThrow("decrement")

    fun asExpirationChange(): ExpirationChange = expirationChange.getOrThrow("expirationChange")

    fun asCreditBlockExpiry(): CreditBlockExpiry = creditBlockExpiry.getOrThrow("creditBlockExpiry")

    fun asVoid(): Void = void.getOrThrow("void")

    fun asVoidInitiated(): VoidInitiated = voidInitiated.getOrThrow("voidInitiated")

    fun asAmendment(): Amendment = amendment.getOrThrow("amendment")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            increment != null -> visitor.visitIncrement(increment)
            decrement != null -> visitor.visitDecrement(decrement)
            expirationChange != null -> visitor.visitExpirationChange(expirationChange)
            creditBlockExpiry != null -> visitor.visitCreditBlockExpiry(creditBlockExpiry)
            void != null -> visitor.visitVoid(void)
            voidInitiated != null -> visitor.visitVoidInitiated(voidInitiated)
            amendment != null -> visitor.visitAmendment(amendment)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CustomerCreditLedgerListByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncrement(increment: Increment) {
                    increment.validate()
                }

                override fun visitDecrement(decrement: Decrement) {
                    decrement.validate()
                }

                override fun visitExpirationChange(expirationChange: ExpirationChange) {
                    expirationChange.validate()
                }

                override fun visitCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiry) {
                    creditBlockExpiry.validate()
                }

                override fun visitVoid(void: Void) {
                    void.validate()
                }

                override fun visitVoidInitiated(voidInitiated: VoidInitiated) {
                    voidInitiated.validate()
                }

                override fun visitAmendment(amendment: Amendment) {
                    amendment.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitIncrement(increment: Increment) = increment.validity()

                override fun visitDecrement(decrement: Decrement) = decrement.validity()

                override fun visitExpirationChange(expirationChange: ExpirationChange) =
                    expirationChange.validity()

                override fun visitCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiry) =
                    creditBlockExpiry.validity()

                override fun visitVoid(void: Void) = void.validity()

                override fun visitVoidInitiated(voidInitiated: VoidInitiated) =
                    voidInitiated.validity()

                override fun visitAmendment(amendment: Amendment) = amendment.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdResponse && increment == other.increment && decrement == other.decrement && expirationChange == other.expirationChange && creditBlockExpiry == other.creditBlockExpiry && void == other.void && voidInitiated == other.voidInitiated && amendment == other.amendment /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(increment, decrement, expirationChange, creditBlockExpiry, void, voidInitiated, amendment) /* spotless:on */

    override fun toString(): String =
        when {
            increment != null ->
                "CustomerCreditLedgerListByExternalIdResponse{increment=$increment}"
            decrement != null ->
                "CustomerCreditLedgerListByExternalIdResponse{decrement=$decrement}"
            expirationChange != null ->
                "CustomerCreditLedgerListByExternalIdResponse{expirationChange=$expirationChange}"
            creditBlockExpiry != null ->
                "CustomerCreditLedgerListByExternalIdResponse{creditBlockExpiry=$creditBlockExpiry}"
            void != null -> "CustomerCreditLedgerListByExternalIdResponse{void=$void}"
            voidInitiated != null ->
                "CustomerCreditLedgerListByExternalIdResponse{voidInitiated=$voidInitiated}"
            amendment != null ->
                "CustomerCreditLedgerListByExternalIdResponse{amendment=$amendment}"
            _json != null -> "CustomerCreditLedgerListByExternalIdResponse{_unknown=$_json}"
            else ->
                throw IllegalStateException("Invalid CustomerCreditLedgerListByExternalIdResponse")
        }

    companion object {

        fun ofIncrement(increment: Increment) =
            CustomerCreditLedgerListByExternalIdResponse(increment = increment)

        fun ofDecrement(decrement: Decrement) =
            CustomerCreditLedgerListByExternalIdResponse(decrement = decrement)

        fun ofExpirationChange(expirationChange: ExpirationChange) =
            CustomerCreditLedgerListByExternalIdResponse(expirationChange = expirationChange)

        fun ofCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiry) =
            CustomerCreditLedgerListByExternalIdResponse(creditBlockExpiry = creditBlockExpiry)

        fun ofVoid(void: Void) = CustomerCreditLedgerListByExternalIdResponse(void = void)

        fun ofVoidInitiated(voidInitiated: VoidInitiated) =
            CustomerCreditLedgerListByExternalIdResponse(voidInitiated = voidInitiated)

        fun ofAmendment(amendment: Amendment) =
            CustomerCreditLedgerListByExternalIdResponse(amendment = amendment)
    }

    /**
     * An interface that defines how to map each variant of
     * [CustomerCreditLedgerListByExternalIdResponse] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitIncrement(increment: Increment): T

        fun visitDecrement(decrement: Decrement): T

        fun visitExpirationChange(expirationChange: ExpirationChange): T

        fun visitCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiry): T

        fun visitVoid(void: Void): T

        fun visitVoidInitiated(voidInitiated: VoidInitiated): T

        fun visitAmendment(amendment: Amendment): T

        /**
         * Maps an unknown variant of [CustomerCreditLedgerListByExternalIdResponse] to a value of
         * type [T].
         *
         * An instance of [CustomerCreditLedgerListByExternalIdResponse] can contain an unknown
         * variant if it was deserialized from data that doesn't match any known variant. For
         * example, if the SDK is on an older version than the API, then the API may respond with
         * new variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException(
                "Unknown CustomerCreditLedgerListByExternalIdResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<CustomerCreditLedgerListByExternalIdResponse>(
            CustomerCreditLedgerListByExternalIdResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): CustomerCreditLedgerListByExternalIdResponse {
            val json = JsonValue.fromJsonNode(node)
            val entryType = json.asObject()?.get("entry_type")?.asString()

            when (entryType) {
                "increment" -> {
                    return tryDeserialize(node, jacksonTypeRef<Increment>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(increment = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "decrement" -> {
                    return tryDeserialize(node, jacksonTypeRef<Decrement>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(decrement = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "expiration_change" -> {
                    return tryDeserialize(node, jacksonTypeRef<ExpirationChange>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(
                            expirationChange = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "credit_block_expiry" -> {
                    return tryDeserialize(node, jacksonTypeRef<CreditBlockExpiry>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(
                            creditBlockExpiry = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "void" -> {
                    return tryDeserialize(node, jacksonTypeRef<Void>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(void = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "void_initiated" -> {
                    return tryDeserialize(node, jacksonTypeRef<VoidInitiated>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(
                            voidInitiated = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "amendment" -> {
                    return tryDeserialize(node, jacksonTypeRef<Amendment>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(amendment = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
            }

            return CustomerCreditLedgerListByExternalIdResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerCreditLedgerListByExternalIdResponse>(
            CustomerCreditLedgerListByExternalIdResponse::class
        ) {

        override fun serialize(
            value: CustomerCreditLedgerListByExternalIdResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.increment != null -> generator.writeObject(value.increment)
                value.decrement != null -> generator.writeObject(value.decrement)
                value.expirationChange != null -> generator.writeObject(value.expirationChange)
                value.creditBlockExpiry != null -> generator.writeObject(value.creditBlockExpiry)
                value.void != null -> generator.writeObject(value.void)
                value.voidInitiated != null -> generator.writeObject(value.voidInitiated)
                value.amendment != null -> generator.writeObject(value.amendment)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException(
                        "Invalid CustomerCreditLedgerListByExternalIdResponse"
                    )
            }
        }
    }

    class Increment
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val startingBalance: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            startingBalance,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("increment")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

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
             * Returns a mutable builder for constructing an instance of [Increment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Increment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("increment")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(increment: Increment) = apply {
                id = increment.id
                amount = increment.amount
                createdAt = increment.createdAt
                creditBlock = increment.creditBlock
                currency = increment.currency
                customer = increment.customer
                description = increment.description
                endingBalance = increment.endingBalance
                entryStatus = increment.entryStatus
                entryType = increment.entryType
                ledgerSequenceNumber = increment.ledgerSequenceNumber
                metadata = increment.metadata
                startingBalance = increment.startingBalance
                additionalProperties = increment.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("increment")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
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
             * Returns an immutable instance of [Increment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Increment =
                Increment(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Increment = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("increment")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("increment")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Increment && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Increment{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    class Decrement
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val startingBalance: JsonField<Double>,
        private val eventId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            startingBalance,
            eventId,
            invoiceId,
            priceId,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("decrement")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventId(): String? = eventId.getNullable("event_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        /**
         * Returns the raw JSON value of [eventId].
         *
         * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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
             * Returns a mutable builder for constructing an instance of [Decrement].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Decrement]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("decrement")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var eventId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decrement: Decrement) = apply {
                id = decrement.id
                amount = decrement.amount
                createdAt = decrement.createdAt
                creditBlock = decrement.creditBlock
                currency = decrement.currency
                customer = decrement.customer
                description = decrement.description
                endingBalance = decrement.endingBalance
                entryStatus = decrement.entryStatus
                entryType = decrement.entryType
                ledgerSequenceNumber = decrement.ledgerSequenceNumber
                metadata = decrement.metadata
                startingBalance = decrement.startingBalance
                eventId = decrement.eventId
                invoiceId = decrement.invoiceId
                priceId = decrement.priceId
                additionalProperties = decrement.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("decrement")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun eventId(eventId: String?) = eventId(JsonField.ofNullable(eventId))

            /**
             * Sets [Builder.eventId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [Decrement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Decrement =
                Decrement(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    eventId,
                    invoiceId,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Decrement = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("decrement")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            eventId()
            invoiceId()
            priceId()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("decrement")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1) +
                (if (eventId.asKnown() == null) 0 else 1) +
                (if (invoiceId.asKnown() == null) 0 else 1) +
                (if (priceId.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Decrement && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && eventId == other.eventId && invoiceId == other.invoiceId && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, eventId, invoiceId, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decrement{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, eventId=$eventId, invoiceId=$invoiceId, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    class ExpirationChange
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val newBlockExpiryDate: JsonField<OffsetDateTime>,
        private val startingBalance: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("new_block_expiry_date")
            @ExcludeMissing
            newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            newBlockExpiryDate,
            startingBalance,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("expiration_change")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun newBlockExpiryDate(): OffsetDateTime? =
            newBlockExpiryDate.getNullable("new_block_expiry_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [newBlockExpiryDate].
         *
         * Unlike [newBlockExpiryDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate(): JsonField<OffsetDateTime> = newBlockExpiryDate

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

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
             * Returns a mutable builder for constructing an instance of [ExpirationChange].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .newBlockExpiryDate()
             * .startingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ExpirationChange]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("expiration_change")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var newBlockExpiryDate: JsonField<OffsetDateTime>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expirationChange: ExpirationChange) = apply {
                id = expirationChange.id
                amount = expirationChange.amount
                createdAt = expirationChange.createdAt
                creditBlock = expirationChange.creditBlock
                currency = expirationChange.currency
                customer = expirationChange.customer
                description = expirationChange.description
                endingBalance = expirationChange.endingBalance
                entryStatus = expirationChange.entryStatus
                entryType = expirationChange.entryType
                ledgerSequenceNumber = expirationChange.ledgerSequenceNumber
                metadata = expirationChange.metadata
                newBlockExpiryDate = expirationChange.newBlockExpiryDate
                startingBalance = expirationChange.startingBalance
                additionalProperties = expirationChange.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("expiration_change")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime?) =
                newBlockExpiryDate(JsonField.ofNullable(newBlockExpiryDate))

            /**
             * Sets [Builder.newBlockExpiryDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.newBlockExpiryDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
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
             * Returns an immutable instance of [ExpirationChange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .newBlockExpiryDate()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExpirationChange =
                ExpirationChange(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("newBlockExpiryDate", newBlockExpiryDate),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExpirationChange = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("expiration_change")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            newBlockExpiryDate()
            startingBalance()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("expiration_change")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (newBlockExpiryDate.asKnown() == null) 0 else 1) +
                (if (startingBalance.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpirationChange && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && newBlockExpiryDate == other.newBlockExpiryDate && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, newBlockExpiryDate, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpirationChange{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, newBlockExpiryDate=$newBlockExpiryDate, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    class CreditBlockExpiry
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val startingBalance: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            startingBalance,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("credit_block_expiry")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

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
             * Returns a mutable builder for constructing an instance of [CreditBlockExpiry].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditBlockExpiry]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("credit_block_expiry")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditBlockExpiry: CreditBlockExpiry) = apply {
                id = creditBlockExpiry.id
                amount = creditBlockExpiry.amount
                createdAt = creditBlockExpiry.createdAt
                creditBlock = creditBlockExpiry.creditBlock
                currency = creditBlockExpiry.currency
                customer = creditBlockExpiry.customer
                description = creditBlockExpiry.description
                endingBalance = creditBlockExpiry.endingBalance
                entryStatus = creditBlockExpiry.entryStatus
                entryType = creditBlockExpiry.entryType
                ledgerSequenceNumber = creditBlockExpiry.ledgerSequenceNumber
                metadata = creditBlockExpiry.metadata
                startingBalance = creditBlockExpiry.startingBalance
                additionalProperties = creditBlockExpiry.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("credit_block_expiry")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
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
             * Returns an immutable instance of [CreditBlockExpiry].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditBlockExpiry =
                CreditBlockExpiry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditBlockExpiry = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("credit_block_expiry")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("credit_block_expiry")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditBlockExpiry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditBlockExpiry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    class Void
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val startingBalance: JsonField<Double>,
        private val voidAmount: JsonField<Double>,
        private val voidReason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("void_amount")
            @ExcludeMissing
            voidAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("void_reason")
            @ExcludeMissing
            voidReason: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            startingBalance,
            voidAmount,
            voidReason,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("void")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voidReason(): String? = voidReason.getNullable("void_reason")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        /**
         * Returns the raw JSON value of [voidAmount].
         *
         * Unlike [voidAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("void_amount")
        @ExcludeMissing
        fun _voidAmount(): JsonField<Double> = voidAmount

        /**
         * Returns the raw JSON value of [voidReason].
         *
         * Unlike [voidReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("void_reason")
        @ExcludeMissing
        fun _voidReason(): JsonField<String> = voidReason

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
             * Returns a mutable builder for constructing an instance of [Void].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * .voidAmount()
             * .voidReason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Void]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("void")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var voidAmount: JsonField<Double>? = null
            private var voidReason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(void: Void) = apply {
                id = void.id
                amount = void.amount
                createdAt = void.createdAt
                creditBlock = void.creditBlock
                currency = void.currency
                customer = void.customer
                description = void.description
                endingBalance = void.endingBalance
                entryStatus = void.entryStatus
                entryType = void.entryType
                ledgerSequenceNumber = void.ledgerSequenceNumber
                metadata = void.metadata
                startingBalance = void.startingBalance
                voidAmount = void.voidAmount
                voidReason = void.voidReason
                additionalProperties = void.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("void")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            /**
             * Sets [Builder.voidAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidAmount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

            fun voidReason(voidReason: String?) = voidReason(JsonField.ofNullable(voidReason))

            /**
             * Sets [Builder.voidReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

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
             * Returns an immutable instance of [Void].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * .voidAmount()
             * .voidReason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Void =
                Void(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("voidAmount", voidAmount),
                    checkRequired("voidReason", voidReason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Void = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("void")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            voidAmount()
            voidReason()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("void")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1) +
                (if (voidAmount.asKnown() == null) 0 else 1) +
                (if (voidReason.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Void && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && voidAmount == other.voidAmount && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, voidAmount, voidReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Void{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, voidAmount=$voidAmount, voidReason=$voidReason, additionalProperties=$additionalProperties}"
    }

    class VoidInitiated
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val newBlockExpiryDate: JsonField<OffsetDateTime>,
        private val startingBalance: JsonField<Double>,
        private val voidAmount: JsonField<Double>,
        private val voidReason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("new_block_expiry_date")
            @ExcludeMissing
            newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("void_amount")
            @ExcludeMissing
            voidAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("void_reason")
            @ExcludeMissing
            voidReason: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            newBlockExpiryDate,
            startingBalance,
            voidAmount,
            voidReason,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("void_initiated")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun newBlockExpiryDate(): OffsetDateTime =
            newBlockExpiryDate.getRequired("new_block_expiry_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voidReason(): String? = voidReason.getNullable("void_reason")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [newBlockExpiryDate].
         *
         * Unlike [newBlockExpiryDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate(): JsonField<OffsetDateTime> = newBlockExpiryDate

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        /**
         * Returns the raw JSON value of [voidAmount].
         *
         * Unlike [voidAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("void_amount")
        @ExcludeMissing
        fun _voidAmount(): JsonField<Double> = voidAmount

        /**
         * Returns the raw JSON value of [voidReason].
         *
         * Unlike [voidReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("void_reason")
        @ExcludeMissing
        fun _voidReason(): JsonField<String> = voidReason

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
             * Returns a mutable builder for constructing an instance of [VoidInitiated].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .newBlockExpiryDate()
             * .startingBalance()
             * .voidAmount()
             * .voidReason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [VoidInitiated]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("void_initiated")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var newBlockExpiryDate: JsonField<OffsetDateTime>? = null
            private var startingBalance: JsonField<Double>? = null
            private var voidAmount: JsonField<Double>? = null
            private var voidReason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(voidInitiated: VoidInitiated) = apply {
                id = voidInitiated.id
                amount = voidInitiated.amount
                createdAt = voidInitiated.createdAt
                creditBlock = voidInitiated.creditBlock
                currency = voidInitiated.currency
                customer = voidInitiated.customer
                description = voidInitiated.description
                endingBalance = voidInitiated.endingBalance
                entryStatus = voidInitiated.entryStatus
                entryType = voidInitiated.entryType
                ledgerSequenceNumber = voidInitiated.ledgerSequenceNumber
                metadata = voidInitiated.metadata
                newBlockExpiryDate = voidInitiated.newBlockExpiryDate
                startingBalance = voidInitiated.startingBalance
                voidAmount = voidInitiated.voidAmount
                voidReason = voidInitiated.voidReason
                additionalProperties = voidInitiated.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("void_initiated")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            /**
             * Sets [Builder.newBlockExpiryDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.newBlockExpiryDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            /**
             * Sets [Builder.voidAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidAmount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

            fun voidReason(voidReason: String?) = voidReason(JsonField.ofNullable(voidReason))

            /**
             * Sets [Builder.voidReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

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
             * Returns an immutable instance of [VoidInitiated].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .newBlockExpiryDate()
             * .startingBalance()
             * .voidAmount()
             * .voidReason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VoidInitiated =
                VoidInitiated(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("newBlockExpiryDate", newBlockExpiryDate),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("voidAmount", voidAmount),
                    checkRequired("voidReason", voidReason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VoidInitiated = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("void_initiated")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            newBlockExpiryDate()
            startingBalance()
            voidAmount()
            voidReason()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("void_initiated")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (newBlockExpiryDate.asKnown() == null) 0 else 1) +
                (if (startingBalance.asKnown() == null) 0 else 1) +
                (if (voidAmount.asKnown() == null) 0 else 1) +
                (if (voidReason.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VoidInitiated && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && newBlockExpiryDate == other.newBlockExpiryDate && startingBalance == other.startingBalance && voidAmount == other.voidAmount && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, newBlockExpiryDate, startingBalance, voidAmount, voidReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidInitiated{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, newBlockExpiryDate=$newBlockExpiryDate, startingBalance=$startingBalance, voidAmount=$voidAmount, voidReason=$voidReason, additionalProperties=$additionalProperties}"
    }

    class Amendment
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditBlock: JsonField<CreditBlock>,
        private val currency: JsonField<String>,
        private val customer: JsonField<Customer>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<Double>,
        private val entryStatus: JsonField<EntryStatus>,
        private val entryType: JsonValue,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val startingBalance: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_block")
            @ExcludeMissing
            creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<Customer> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("entry_status")
            @ExcludeMissing
            entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
            @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            creditBlock,
            currency,
            customer,
            description,
            endingBalance,
            entryStatus,
            entryType,
            ledgerSequenceNumber,
            metadata,
            startingBalance,
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
        fun amount(): Double = amount.getRequired("amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Customer = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("amendment")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonValue = entryType

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

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
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditBlock].
         *
         * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        /**
         * Returns the raw JSON value of [entryStatus].
         *
         * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        /**
         * Returns the raw JSON value of [ledgerSequenceNumber].
         *
         * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

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
             * Returns a mutable builder for constructing an instance of [Amendment].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Amendment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditBlock: JsonField<CreditBlock>? = null
            private var currency: JsonField<String>? = null
            private var customer: JsonField<Customer>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<Double>? = null
            private var entryStatus: JsonField<EntryStatus>? = null
            private var entryType: JsonValue = JsonValue.from("amendment")
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amendment: Amendment) = apply {
                id = amendment.id
                amount = amendment.amount
                createdAt = amendment.createdAt
                creditBlock = amendment.creditBlock
                currency = amendment.currency
                customer = amendment.customer
                description = amendment.description
                endingBalance = amendment.endingBalance
                entryStatus = amendment.entryStatus
                entryType = amendment.entryType
                ledgerSequenceNumber = amendment.ledgerSequenceNumber
                metadata = amendment.metadata
                startingBalance = amendment.startingBalance
                additionalProperties = amendment.additionalProperties.toMutableMap()
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

            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            /**
             * Sets [Builder.creditBlock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditBlock] with a well-typed [CreditBlock] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [Customer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            /**
             * Sets [Builder.entryStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("amendment")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryType(entryType: JsonValue) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            /**
             * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
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
             * Returns an immutable instance of [Amendment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .creditBlock()
             * .currency()
             * .customer()
             * .description()
             * .endingBalance()
             * .entryStatus()
             * .ledgerSequenceNumber()
             * .metadata()
             * .startingBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Amendment =
                Amendment(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    entryType,
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Amendment = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            creditBlock().validate()
            currency()
            customer().validate()
            description()
            endingBalance()
            entryStatus().validate()
            _entryType().let {
                if (it != JsonValue.from("amendment")) {
                    throw OrbInvalidDataException("'entryType' is invalid, received $it")
                }
            }
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditBlock.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (entryStatus.asKnown()?.validity() ?: 0) +
                entryType.let { if (it == JsonValue.from("amendment")) 1 else 0 } +
                (if (ledgerSequenceNumber.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1)

        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiryDate].
             *
             * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            /**
             * Returns the raw JSON value of [perUnitCostBasis].
             *
             * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
                 * Returns a mutable builder for constructing an instance of [CreditBlock].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBlock]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var expiryDate: JsonField<OffsetDateTime>? = null
                private var perUnitCostBasis: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
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

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                /**
                 * Sets [Builder.expiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

                /**
                 * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perUnitCostBasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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
                 * Returns an immutable instance of [CreditBlock].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .expiryDate()
                 * .perUnitCostBasis()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (validated) {
                    return@apply
                }

                id()
                expiryDate()
                perUnitCostBasis()
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
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditBlock && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Customer
        private constructor(
            private val id: JsonField<String>,
            private val externalCustomerId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
            ) : this(id, externalCustomerId, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Customer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .externalCustomerId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Customer =
                    Customer(
                        checkRequired("id", id),
                        checkRequired("externalCustomerId", externalCustomerId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (validated) {
                    return@apply
                }

                id()
                externalCustomerId()
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
                    (if (externalCustomerId.asKnown() == null) 0 else 1)

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

        class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val COMMITTED = of("committed")

                val PENDING = of("pending")

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            /** An enum containing [EntryStatus]'s known values. */
            enum class Known {
                COMMITTED,
                PENDING,
            }

            /**
             * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMITTED,
                PENDING,
                /**
                 * An enum member indicating that [EntryStatus] was instantiated with an unknown
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
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
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
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EntryStatus = apply {
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

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amendment && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amendment{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }
}
