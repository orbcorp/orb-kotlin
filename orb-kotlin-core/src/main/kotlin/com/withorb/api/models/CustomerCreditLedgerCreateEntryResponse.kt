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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = CustomerCreditLedgerCreateEntryResponse.Deserializer::class)
@JsonSerialize(using = CustomerCreditLedgerCreateEntryResponse.Serializer::class)
class CustomerCreditLedgerCreateEntryResponse
private constructor(
    private val incrementLedgerEntry: IncrementLedgerEntry? = null,
    private val decrementLedgerEntry: DecrementLedgerEntry? = null,
    private val expirationChangeLedgerEntry: ExpirationChangeLedgerEntry? = null,
    private val creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry? = null,
    private val voidLedgerEntry: VoidLedgerEntry? = null,
    private val voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry? = null,
    private val amendmentLedgerEntry: AmendmentLedgerEntry? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun incrementLedgerEntry(): IncrementLedgerEntry? = incrementLedgerEntry

    fun decrementLedgerEntry(): DecrementLedgerEntry? = decrementLedgerEntry

    fun expirationChangeLedgerEntry(): ExpirationChangeLedgerEntry? = expirationChangeLedgerEntry

    fun creditBlockExpiryLedgerEntry(): CreditBlockExpiryLedgerEntry? = creditBlockExpiryLedgerEntry

    fun voidLedgerEntry(): VoidLedgerEntry? = voidLedgerEntry

    fun voidInitiatedLedgerEntry(): VoidInitiatedLedgerEntry? = voidInitiatedLedgerEntry

    fun amendmentLedgerEntry(): AmendmentLedgerEntry? = amendmentLedgerEntry

    fun isIncrementLedgerEntry(): Boolean = incrementLedgerEntry != null

    fun isDecrementLedgerEntry(): Boolean = decrementLedgerEntry != null

    fun isExpirationChangeLedgerEntry(): Boolean = expirationChangeLedgerEntry != null

    fun isCreditBlockExpiryLedgerEntry(): Boolean = creditBlockExpiryLedgerEntry != null

    fun isVoidLedgerEntry(): Boolean = voidLedgerEntry != null

    fun isVoidInitiatedLedgerEntry(): Boolean = voidInitiatedLedgerEntry != null

    fun isAmendmentLedgerEntry(): Boolean = amendmentLedgerEntry != null

    fun asIncrementLedgerEntry(): IncrementLedgerEntry =
        incrementLedgerEntry.getOrThrow("incrementLedgerEntry")

    fun asDecrementLedgerEntry(): DecrementLedgerEntry =
        decrementLedgerEntry.getOrThrow("decrementLedgerEntry")

    fun asExpirationChangeLedgerEntry(): ExpirationChangeLedgerEntry =
        expirationChangeLedgerEntry.getOrThrow("expirationChangeLedgerEntry")

    fun asCreditBlockExpiryLedgerEntry(): CreditBlockExpiryLedgerEntry =
        creditBlockExpiryLedgerEntry.getOrThrow("creditBlockExpiryLedgerEntry")

    fun asVoidLedgerEntry(): VoidLedgerEntry = voidLedgerEntry.getOrThrow("voidLedgerEntry")

    fun asVoidInitiatedLedgerEntry(): VoidInitiatedLedgerEntry =
        voidInitiatedLedgerEntry.getOrThrow("voidInitiatedLedgerEntry")

    fun asAmendmentLedgerEntry(): AmendmentLedgerEntry =
        amendmentLedgerEntry.getOrThrow("amendmentLedgerEntry")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            incrementLedgerEntry != null -> visitor.visitIncrementLedgerEntry(incrementLedgerEntry)
            decrementLedgerEntry != null -> visitor.visitDecrementLedgerEntry(decrementLedgerEntry)
            expirationChangeLedgerEntry != null ->
                visitor.visitExpirationChangeLedgerEntry(expirationChangeLedgerEntry)
            creditBlockExpiryLedgerEntry != null ->
                visitor.visitCreditBlockExpiryLedgerEntry(creditBlockExpiryLedgerEntry)
            voidLedgerEntry != null -> visitor.visitVoidLedgerEntry(voidLedgerEntry)
            voidInitiatedLedgerEntry != null ->
                visitor.visitVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry)
            amendmentLedgerEntry != null -> visitor.visitAmendmentLedgerEntry(amendmentLedgerEntry)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): CustomerCreditLedgerCreateEntryResponse = apply {
        if (!validated) {
            if (
                incrementLedgerEntry == null &&
                    decrementLedgerEntry == null &&
                    expirationChangeLedgerEntry == null &&
                    creditBlockExpiryLedgerEntry == null &&
                    voidLedgerEntry == null &&
                    voidInitiatedLedgerEntry == null &&
                    amendmentLedgerEntry == null
            ) {
                throw OrbInvalidDataException(
                    "Unknown CustomerCreditLedgerCreateEntryResponse: $_json"
                )
            }
            incrementLedgerEntry?.validate()
            decrementLedgerEntry?.validate()
            expirationChangeLedgerEntry?.validate()
            creditBlockExpiryLedgerEntry?.validate()
            voidLedgerEntry?.validate()
            voidInitiatedLedgerEntry?.validate()
            amendmentLedgerEntry?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditLedgerCreateEntryResponse &&
            this.incrementLedgerEntry == other.incrementLedgerEntry &&
            this.decrementLedgerEntry == other.decrementLedgerEntry &&
            this.expirationChangeLedgerEntry == other.expirationChangeLedgerEntry &&
            this.creditBlockExpiryLedgerEntry == other.creditBlockExpiryLedgerEntry &&
            this.voidLedgerEntry == other.voidLedgerEntry &&
            this.voidInitiatedLedgerEntry == other.voidInitiatedLedgerEntry &&
            this.amendmentLedgerEntry == other.amendmentLedgerEntry
    }

    override fun hashCode(): Int {
        return Objects.hash(
            incrementLedgerEntry,
            decrementLedgerEntry,
            expirationChangeLedgerEntry,
            creditBlockExpiryLedgerEntry,
            voidLedgerEntry,
            voidInitiatedLedgerEntry,
            amendmentLedgerEntry,
        )
    }

    override fun toString(): String {
        return when {
            incrementLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{incrementLedgerEntry=$incrementLedgerEntry}"
            decrementLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{decrementLedgerEntry=$decrementLedgerEntry}"
            expirationChangeLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{expirationChangeLedgerEntry=$expirationChangeLedgerEntry}"
            creditBlockExpiryLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{creditBlockExpiryLedgerEntry=$creditBlockExpiryLedgerEntry}"
            voidLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{voidLedgerEntry=$voidLedgerEntry}"
            voidInitiatedLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{voidInitiatedLedgerEntry=$voidInitiatedLedgerEntry}"
            amendmentLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryResponse{amendmentLedgerEntry=$amendmentLedgerEntry}"
            _json != null -> "CustomerCreditLedgerCreateEntryResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryResponse")
        }
    }

    companion object {

        fun ofIncrementLedgerEntry(incrementLedgerEntry: IncrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryResponse(incrementLedgerEntry = incrementLedgerEntry)

        fun ofDecrementLedgerEntry(decrementLedgerEntry: DecrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryResponse(decrementLedgerEntry = decrementLedgerEntry)

        fun ofExpirationChangeLedgerEntry(
            expirationChangeLedgerEntry: ExpirationChangeLedgerEntry
        ) =
            CustomerCreditLedgerCreateEntryResponse(
                expirationChangeLedgerEntry = expirationChangeLedgerEntry
            )

        fun ofCreditBlockExpiryLedgerEntry(
            creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry
        ) =
            CustomerCreditLedgerCreateEntryResponse(
                creditBlockExpiryLedgerEntry = creditBlockExpiryLedgerEntry
            )

        fun ofVoidLedgerEntry(voidLedgerEntry: VoidLedgerEntry) =
            CustomerCreditLedgerCreateEntryResponse(voidLedgerEntry = voidLedgerEntry)

        fun ofVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry) =
            CustomerCreditLedgerCreateEntryResponse(
                voidInitiatedLedgerEntry = voidInitiatedLedgerEntry
            )

        fun ofAmendmentLedgerEntry(amendmentLedgerEntry: AmendmentLedgerEntry) =
            CustomerCreditLedgerCreateEntryResponse(amendmentLedgerEntry = amendmentLedgerEntry)
    }

    interface Visitor<out T> {

        fun visitIncrementLedgerEntry(incrementLedgerEntry: IncrementLedgerEntry): T

        fun visitDecrementLedgerEntry(decrementLedgerEntry: DecrementLedgerEntry): T

        fun visitExpirationChangeLedgerEntry(
            expirationChangeLedgerEntry: ExpirationChangeLedgerEntry
        ): T

        fun visitCreditBlockExpiryLedgerEntry(
            creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry
        ): T

        fun visitVoidLedgerEntry(voidLedgerEntry: VoidLedgerEntry): T

        fun visitVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry): T

        fun visitAmendmentLedgerEntry(amendmentLedgerEntry: AmendmentLedgerEntry): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown CustomerCreditLedgerCreateEntryResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<CustomerCreditLedgerCreateEntryResponse>(
            CustomerCreditLedgerCreateEntryResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): CustomerCreditLedgerCreateEntryResponse {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<IncrementLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        incrementLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<DecrementLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        decrementLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<ExpirationChangeLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        expirationChangeLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<CreditBlockExpiryLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        creditBlockExpiryLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<VoidLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        voidLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<VoidInitiatedLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        voidInitiatedLedgerEntry = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<AmendmentLedgerEntry>()) { it.validate() }
                ?.let {
                    return CustomerCreditLedgerCreateEntryResponse(
                        amendmentLedgerEntry = it,
                        _json = json
                    )
                }

            return CustomerCreditLedgerCreateEntryResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<CustomerCreditLedgerCreateEntryResponse>(
            CustomerCreditLedgerCreateEntryResponse::class
        ) {

        override fun serialize(
            value: CustomerCreditLedgerCreateEntryResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.incrementLedgerEntry != null ->
                    generator.writeObject(value.incrementLedgerEntry)
                value.decrementLedgerEntry != null ->
                    generator.writeObject(value.decrementLedgerEntry)
                value.expirationChangeLedgerEntry != null ->
                    generator.writeObject(value.expirationChangeLedgerEntry)
                value.creditBlockExpiryLedgerEntry != null ->
                    generator.writeObject(value.creditBlockExpiryLedgerEntry)
                value.voidLedgerEntry != null -> generator.writeObject(value.voidLedgerEntry)
                value.voidInitiatedLedgerEntry != null ->
                    generator.writeObject(value.voidInitiatedLedgerEntry)
                value.amendmentLedgerEntry != null ->
                    generator.writeObject(value.amendmentLedgerEntry)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryResponse")
            }
        }
    }

    @JsonDeserialize(builder = IncrementLedgerEntry.Builder::class)
    @NoAutoDetect
    class IncrementLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): IncrementLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncrementLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "IncrementLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(incrementLedgerEntry: IncrementLedgerEntry) = apply {
                this.metadata = incrementLedgerEntry.metadata
                this.id = incrementLedgerEntry.id
                this.ledgerSequenceNumber = incrementLedgerEntry.ledgerSequenceNumber
                this.entryStatus = incrementLedgerEntry.entryStatus
                this.customer = incrementLedgerEntry.customer
                this.startingBalance = incrementLedgerEntry.startingBalance
                this.endingBalance = incrementLedgerEntry.endingBalance
                this.amount = incrementLedgerEntry.amount
                this.currency = incrementLedgerEntry.currency
                this.createdAt = incrementLedgerEntry.createdAt
                this.description = incrementLedgerEntry.description
                this.creditBlock = incrementLedgerEntry.creditBlock
                this.entryType = incrementLedgerEntry.entryType
                additionalProperties(incrementLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            fun build(): IncrementLedgerEntry =
                IncrementLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val INCREMENT = EntryType(JsonField.of("increment"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                INCREMENT,
            }

            enum class Value {
                INCREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCREMENT -> Value.INCREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCREMENT -> Known.INCREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = DecrementLedgerEntry.Builder::class)
    @NoAutoDetect
    class DecrementLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val priceId: JsonField<String>,
        private val eventId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun priceId(): String? = priceId.getNullable("price_id")

        fun eventId(): String? = eventId.getNullable("event_id")

        fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonProperty("price_id") @ExcludeMissing fun _priceId() = priceId

        @JsonProperty("event_id") @ExcludeMissing fun _eventId() = eventId

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DecrementLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                priceId()
                eventId()
                invoiceId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DecrementLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.priceId == other.priceId &&
                this.eventId == other.eventId &&
                this.invoiceId == other.invoiceId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        priceId,
                        eventId,
                        invoiceId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DecrementLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, priceId=$priceId, eventId=$eventId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var eventId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decrementLedgerEntry: DecrementLedgerEntry) = apply {
                this.metadata = decrementLedgerEntry.metadata
                this.id = decrementLedgerEntry.id
                this.ledgerSequenceNumber = decrementLedgerEntry.ledgerSequenceNumber
                this.entryStatus = decrementLedgerEntry.entryStatus
                this.customer = decrementLedgerEntry.customer
                this.startingBalance = decrementLedgerEntry.startingBalance
                this.endingBalance = decrementLedgerEntry.endingBalance
                this.amount = decrementLedgerEntry.amount
                this.currency = decrementLedgerEntry.currency
                this.createdAt = decrementLedgerEntry.createdAt
                this.description = decrementLedgerEntry.description
                this.creditBlock = decrementLedgerEntry.creditBlock
                this.entryType = decrementLedgerEntry.entryType
                this.priceId = decrementLedgerEntry.priceId
                this.eventId = decrementLedgerEntry.eventId
                this.invoiceId = decrementLedgerEntry.invoiceId
                additionalProperties(decrementLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            @JsonProperty("price_id")
            @ExcludeMissing
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun eventId(eventId: String) = eventId(JsonField.of(eventId))

            @JsonProperty("event_id")
            @ExcludeMissing
            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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

            fun build(): DecrementLedgerEntry =
                DecrementLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    priceId,
                    eventId,
                    invoiceId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val DECREMENT = EntryType(JsonField.of("decrement"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                DECREMENT,
            }

            enum class Value {
                DECREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DECREMENT -> Value.DECREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DECREMENT -> Known.DECREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = ExpirationChangeLedgerEntry.Builder::class)
    @NoAutoDetect
    class ExpirationChangeLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val newBlockExpiryDate: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun newBlockExpiryDate(): OffsetDateTime =
            newBlockExpiryDate.getRequired("new_block_expiry_date")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate() = newBlockExpiryDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExpirationChangeLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                newBlockExpiryDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExpirationChangeLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.newBlockExpiryDate == other.newBlockExpiryDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        newBlockExpiryDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExpirationChangeLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, newBlockExpiryDate=$newBlockExpiryDate, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expirationChangeLedgerEntry: ExpirationChangeLedgerEntry) = apply {
                this.metadata = expirationChangeLedgerEntry.metadata
                this.id = expirationChangeLedgerEntry.id
                this.ledgerSequenceNumber = expirationChangeLedgerEntry.ledgerSequenceNumber
                this.entryStatus = expirationChangeLedgerEntry.entryStatus
                this.customer = expirationChangeLedgerEntry.customer
                this.startingBalance = expirationChangeLedgerEntry.startingBalance
                this.endingBalance = expirationChangeLedgerEntry.endingBalance
                this.amount = expirationChangeLedgerEntry.amount
                this.currency = expirationChangeLedgerEntry.currency
                this.createdAt = expirationChangeLedgerEntry.createdAt
                this.description = expirationChangeLedgerEntry.description
                this.creditBlock = expirationChangeLedgerEntry.creditBlock
                this.entryType = expirationChangeLedgerEntry.entryType
                this.newBlockExpiryDate = expirationChangeLedgerEntry.newBlockExpiryDate
                additionalProperties(expirationChangeLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            @JsonProperty("new_block_expiry_date")
            @ExcludeMissing
            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
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

            fun build(): ExpirationChangeLedgerEntry =
                ExpirationChangeLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    newBlockExpiryDate,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EXPIRATION_CHANGE = EntryType(JsonField.of("expiration_change"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                EXPIRATION_CHANGE,
            }

            enum class Value {
                EXPIRATION_CHANGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = CreditBlockExpiryLedgerEntry.Builder::class)
    @NoAutoDetect
    class CreditBlockExpiryLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CreditBlockExpiryLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditBlockExpiryLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreditBlockExpiryLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry) = apply {
                this.metadata = creditBlockExpiryLedgerEntry.metadata
                this.id = creditBlockExpiryLedgerEntry.id
                this.ledgerSequenceNumber = creditBlockExpiryLedgerEntry.ledgerSequenceNumber
                this.entryStatus = creditBlockExpiryLedgerEntry.entryStatus
                this.customer = creditBlockExpiryLedgerEntry.customer
                this.startingBalance = creditBlockExpiryLedgerEntry.startingBalance
                this.endingBalance = creditBlockExpiryLedgerEntry.endingBalance
                this.amount = creditBlockExpiryLedgerEntry.amount
                this.currency = creditBlockExpiryLedgerEntry.currency
                this.createdAt = creditBlockExpiryLedgerEntry.createdAt
                this.description = creditBlockExpiryLedgerEntry.description
                this.creditBlock = creditBlockExpiryLedgerEntry.creditBlock
                this.entryType = creditBlockExpiryLedgerEntry.entryType
                additionalProperties(creditBlockExpiryLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            fun build(): CreditBlockExpiryLedgerEntry =
                CreditBlockExpiryLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val CREDIT_BLOCK_EXPIRY = EntryType(JsonField.of("credit_block_expiry"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                CREDIT_BLOCK_EXPIRY,
            }

            enum class Value {
                CREDIT_BLOCK_EXPIRY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CREDIT_BLOCK_EXPIRY -> Value.CREDIT_BLOCK_EXPIRY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CREDIT_BLOCK_EXPIRY -> Known.CREDIT_BLOCK_EXPIRY
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = VoidLedgerEntry.Builder::class)
    @NoAutoDetect
    class VoidLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val voidReason: JsonField<String>,
        private val voidAmount: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun voidReason(): String? = voidReason.getNullable("void_reason")

        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonProperty("void_reason") @ExcludeMissing fun _voidReason() = voidReason

        @JsonProperty("void_amount") @ExcludeMissing fun _voidAmount() = voidAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): VoidLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                voidReason()
                voidAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoidLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.voidReason == other.voidReason &&
                this.voidAmount == other.voidAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        voidReason,
                        voidAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "VoidLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, voidReason=$voidReason, voidAmount=$voidAmount, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var voidReason: JsonField<String> = JsonMissing.of()
            private var voidAmount: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(voidLedgerEntry: VoidLedgerEntry) = apply {
                this.metadata = voidLedgerEntry.metadata
                this.id = voidLedgerEntry.id
                this.ledgerSequenceNumber = voidLedgerEntry.ledgerSequenceNumber
                this.entryStatus = voidLedgerEntry.entryStatus
                this.customer = voidLedgerEntry.customer
                this.startingBalance = voidLedgerEntry.startingBalance
                this.endingBalance = voidLedgerEntry.endingBalance
                this.amount = voidLedgerEntry.amount
                this.currency = voidLedgerEntry.currency
                this.createdAt = voidLedgerEntry.createdAt
                this.description = voidLedgerEntry.description
                this.creditBlock = voidLedgerEntry.creditBlock
                this.entryType = voidLedgerEntry.entryType
                this.voidReason = voidLedgerEntry.voidReason
                this.voidAmount = voidLedgerEntry.voidAmount
                additionalProperties(voidLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun voidReason(voidReason: String) = voidReason(JsonField.of(voidReason))

            @JsonProperty("void_reason")
            @ExcludeMissing
            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            @JsonProperty("void_amount")
            @ExcludeMissing
            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

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

            fun build(): VoidLedgerEntry =
                VoidLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    voidReason,
                    voidAmount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val VOID = EntryType(JsonField.of("void"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                VOID,
            }

            enum class Value {
                VOID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    VOID -> Value.VOID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    VOID -> Known.VOID
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = VoidInitiatedLedgerEntry.Builder::class)
    @NoAutoDetect
    class VoidInitiatedLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val newBlockExpiryDate: JsonField<OffsetDateTime>,
        private val voidReason: JsonField<String>,
        private val voidAmount: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun newBlockExpiryDate(): OffsetDateTime =
            newBlockExpiryDate.getRequired("new_block_expiry_date")

        fun voidReason(): String? = voidReason.getNullable("void_reason")

        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate() = newBlockExpiryDate

        @JsonProperty("void_reason") @ExcludeMissing fun _voidReason() = voidReason

        @JsonProperty("void_amount") @ExcludeMissing fun _voidAmount() = voidAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): VoidInitiatedLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                newBlockExpiryDate()
                voidReason()
                voidAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoidInitiatedLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.newBlockExpiryDate == other.newBlockExpiryDate &&
                this.voidReason == other.voidReason &&
                this.voidAmount == other.voidAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        newBlockExpiryDate,
                        voidReason,
                        voidAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "VoidInitiatedLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, newBlockExpiryDate=$newBlockExpiryDate, voidReason=$voidReason, voidAmount=$voidAmount, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var voidReason: JsonField<String> = JsonMissing.of()
            private var voidAmount: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry) = apply {
                this.metadata = voidInitiatedLedgerEntry.metadata
                this.id = voidInitiatedLedgerEntry.id
                this.ledgerSequenceNumber = voidInitiatedLedgerEntry.ledgerSequenceNumber
                this.entryStatus = voidInitiatedLedgerEntry.entryStatus
                this.customer = voidInitiatedLedgerEntry.customer
                this.startingBalance = voidInitiatedLedgerEntry.startingBalance
                this.endingBalance = voidInitiatedLedgerEntry.endingBalance
                this.amount = voidInitiatedLedgerEntry.amount
                this.currency = voidInitiatedLedgerEntry.currency
                this.createdAt = voidInitiatedLedgerEntry.createdAt
                this.description = voidInitiatedLedgerEntry.description
                this.creditBlock = voidInitiatedLedgerEntry.creditBlock
                this.entryType = voidInitiatedLedgerEntry.entryType
                this.newBlockExpiryDate = voidInitiatedLedgerEntry.newBlockExpiryDate
                this.voidReason = voidInitiatedLedgerEntry.voidReason
                this.voidAmount = voidInitiatedLedgerEntry.voidAmount
                additionalProperties(voidInitiatedLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            @JsonProperty("new_block_expiry_date")
            @ExcludeMissing
            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun voidReason(voidReason: String) = voidReason(JsonField.of(voidReason))

            @JsonProperty("void_reason")
            @ExcludeMissing
            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            @JsonProperty("void_amount")
            @ExcludeMissing
            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

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

            fun build(): VoidInitiatedLedgerEntry =
                VoidInitiatedLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    newBlockExpiryDate,
                    voidReason,
                    voidAmount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val VOID_INITIATED = EntryType(JsonField.of("void_initiated"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                VOID_INITIATED,
            }

            enum class Value {
                VOID_INITIATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    VOID_INITIATED -> Value.VOID_INITIATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    VOID_INITIATED -> Known.VOID_INITIATED
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(builder = AmendmentLedgerEntry.Builder::class)
    @NoAutoDetect
    class AmendmentLedgerEntry
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val id: JsonField<String>,
        private val ledgerSequenceNumber: JsonField<Long>,
        private val entryStatus: JsonField<EntryStatus>,
        private val customer: JsonField<Customer>,
        private val startingBalance: JsonField<Double>,
        private val endingBalance: JsonField<Double>,
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val creditBlock: JsonField<CreditBlock>,
        private val entryType: JsonField<EntryType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun id(): String = id.getRequired("id")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun customer(): Customer = customer.getRequired("customer")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun amount(): Double = amount.getRequired("amount")

        fun currency(): String = currency.getRequired("currency")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun description(): String? = description.getNullable("description")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber() = ledgerSequenceNumber

        @JsonProperty("entry_status") @ExcludeMissing fun _entryStatus() = entryStatus

        @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("credit_block") @ExcludeMissing fun _creditBlock() = creditBlock

        @JsonProperty("entry_type") @ExcludeMissing fun _entryType() = entryType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AmendmentLedgerEntry = apply {
            if (!validated) {
                metadata().validate()
                id()
                ledgerSequenceNumber()
                entryStatus()
                customer().validate()
                startingBalance()
                endingBalance()
                amount()
                currency()
                createdAt()
                description()
                creditBlock().validate()
                entryType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmendmentLedgerEntry &&
                this.metadata == other.metadata &&
                this.id == other.id &&
                this.ledgerSequenceNumber == other.ledgerSequenceNumber &&
                this.entryStatus == other.entryStatus &&
                this.customer == other.customer &&
                this.startingBalance == other.startingBalance &&
                this.endingBalance == other.endingBalance &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.creditBlock == other.creditBlock &&
                this.entryType == other.entryType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        id,
                        ledgerSequenceNumber,
                        entryStatus,
                        customer,
                        startingBalance,
                        endingBalance,
                        amount,
                        currency,
                        createdAt,
                        description,
                        creditBlock,
                        entryType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AmendmentLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var ledgerSequenceNumber: JsonField<Long> = JsonMissing.of()
            private var entryStatus: JsonField<EntryStatus> = JsonMissing.of()
            private var customer: JsonField<Customer> = JsonMissing.of()
            private var startingBalance: JsonField<Double> = JsonMissing.of()
            private var endingBalance: JsonField<Double> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var creditBlock: JsonField<CreditBlock> = JsonMissing.of()
            private var entryType: JsonField<EntryType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amendmentLedgerEntry: AmendmentLedgerEntry) = apply {
                this.metadata = amendmentLedgerEntry.metadata
                this.id = amendmentLedgerEntry.id
                this.ledgerSequenceNumber = amendmentLedgerEntry.ledgerSequenceNumber
                this.entryStatus = amendmentLedgerEntry.entryStatus
                this.customer = amendmentLedgerEntry.customer
                this.startingBalance = amendmentLedgerEntry.startingBalance
                this.endingBalance = amendmentLedgerEntry.endingBalance
                this.amount = amendmentLedgerEntry.amount
                this.currency = amendmentLedgerEntry.currency
                this.createdAt = amendmentLedgerEntry.createdAt
                this.description = amendmentLedgerEntry.description
                this.creditBlock = amendmentLedgerEntry.creditBlock
                this.entryType = amendmentLedgerEntry.entryType
                additionalProperties(amendmentLedgerEntry.additionalProperties)
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            @JsonProperty("ledger_sequence_number")
            @ExcludeMissing
            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            @JsonProperty("entry_status")
            @ExcludeMissing
            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            @JsonProperty("customer")
            @ExcludeMissing
            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            @JsonProperty("credit_block")
            @ExcludeMissing
            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            @JsonProperty("entry_type")
            @ExcludeMissing
            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            fun build(): AmendmentLedgerEntry =
                AmendmentLedgerEntry(
                    metadata,
                    id,
                    ledgerSequenceNumber,
                    entryStatus,
                    customer,
                    startingBalance,
                    endingBalance,
                    amount,
                    currency,
                    createdAt,
                    description,
                    creditBlock,
                    entryType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditBlock.Builder::class)
        @NoAutoDetect
        class CreditBlock
        private constructor(
            private val id: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBlock &&
                    this.id == other.id &&
                    this.expiryDate == other.expiryDate &&
                    this.perUnitCostBasis == other.perUnitCostBasis &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiryDate,
                            perUnitCostBasis,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CreditBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    this.id = creditBlock.id
                    this.expiryDate = creditBlock.expiryDate
                    this.perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties(creditBlock.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                @JsonProperty("expiry_date")
                @ExcludeMissing
                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                    this.perUnitCostBasis = perUnitCostBasis
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

                fun build(): CreditBlock =
                    CreditBlock(
                        id,
                        expiryDate,
                        perUnitCostBasis,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMMITTED = EntryStatus(JsonField.of("committed"))

                val PENDING = EntryStatus(JsonField.of("pending"))

                fun of(value: String) = EntryStatus(JsonField.of(value))
            }

            enum class Known {
                COMMITTED,
                PENDING,
            }

            enum class Value {
                COMMITTED,
                PENDING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMITTED -> Value.COMMITTED
                    PENDING -> Value.PENDING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMITTED -> Known.COMMITTED
                    PENDING -> Known.PENDING
                    else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntryType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val AMENDMENT = EntryType(JsonField.of("amendment"))

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                AMENDMENT,
            }

            enum class Value {
                AMENDMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AMENDMENT -> Value.AMENDMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AMENDMENT -> Known.AMENDMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
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

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }
}
