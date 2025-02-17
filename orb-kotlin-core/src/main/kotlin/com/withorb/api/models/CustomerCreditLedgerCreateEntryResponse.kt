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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
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

    private var validated: Boolean = false

    fun validate(): CustomerCreditLedgerCreateEntryResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncrementLedgerEntry(incrementLedgerEntry: IncrementLedgerEntry) {
                    incrementLedgerEntry.validate()
                }

                override fun visitDecrementLedgerEntry(decrementLedgerEntry: DecrementLedgerEntry) {
                    decrementLedgerEntry.validate()
                }

                override fun visitExpirationChangeLedgerEntry(
                    expirationChangeLedgerEntry: ExpirationChangeLedgerEntry
                ) {
                    expirationChangeLedgerEntry.validate()
                }

                override fun visitCreditBlockExpiryLedgerEntry(
                    creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry
                ) {
                    creditBlockExpiryLedgerEntry.validate()
                }

                override fun visitVoidLedgerEntry(voidLedgerEntry: VoidLedgerEntry) {
                    voidLedgerEntry.validate()
                }

                override fun visitVoidInitiatedLedgerEntry(
                    voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry
                ) {
                    voidInitiatedLedgerEntry.validate()
                }

                override fun visitAmendmentLedgerEntry(amendmentLedgerEntry: AmendmentLedgerEntry) {
                    amendmentLedgerEntry.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryResponse && incrementLedgerEntry == other.incrementLedgerEntry && decrementLedgerEntry == other.decrementLedgerEntry && expirationChangeLedgerEntry == other.expirationChangeLedgerEntry && creditBlockExpiryLedgerEntry == other.creditBlockExpiryLedgerEntry && voidLedgerEntry == other.voidLedgerEntry && voidInitiatedLedgerEntry == other.voidInitiatedLedgerEntry && amendmentLedgerEntry == other.amendmentLedgerEntry /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(incrementLedgerEntry, decrementLedgerEntry, expirationChangeLedgerEntry, creditBlockExpiryLedgerEntry, voidLedgerEntry, voidInitiatedLedgerEntry, amendmentLedgerEntry) /* spotless:on */

    override fun toString(): String =
        when {
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

    /**
     * An interface that defines how to map each variant of
     * [CustomerCreditLedgerCreateEntryResponse] to a value of type [T].
     */
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

        /**
         * Maps an unknown variant of [CustomerCreditLedgerCreateEntryResponse] to a value of type
         * [T].
         *
         * An instance of [CustomerCreditLedgerCreateEntryResponse] can contain an unknown variant
         * if it was deserialized from data that doesn't match any known variant. For example, if
         * the SDK is on an older version than the API, then the API may respond with new variants
         * that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown CustomerCreditLedgerCreateEntryResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CustomerCreditLedgerCreateEntryResponse>(
            CustomerCreditLedgerCreateEntryResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): CustomerCreditLedgerCreateEntryResponse {
            val json = JsonValue.fromJsonNode(node)
            val entryType = json.asObject()?.get("entry_type")?.asString()

            when (entryType) {
                "increment" -> {
                    tryDeserialize(node, jacksonTypeRef<IncrementLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                incrementLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "decrement" -> {
                    tryDeserialize(node, jacksonTypeRef<DecrementLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                decrementLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "expiration_change" -> {
                    tryDeserialize(node, jacksonTypeRef<ExpirationChangeLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                expirationChangeLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "credit_block_expiry" -> {
                    tryDeserialize(node, jacksonTypeRef<CreditBlockExpiryLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                creditBlockExpiryLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "void" -> {
                    tryDeserialize(node, jacksonTypeRef<VoidLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                voidLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "void_initiated" -> {
                    tryDeserialize(node, jacksonTypeRef<VoidInitiatedLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                voidInitiatedLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
                "amendment" -> {
                    tryDeserialize(node, jacksonTypeRef<AmendmentLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryResponse(
                                amendmentLedgerEntry = it,
                                _json = json,
                            )
                        }
                }
            }

            return CustomerCreditLedgerCreateEntryResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerCreditLedgerCreateEntryResponse>(
            CustomerCreditLedgerCreateEntryResponse::class
        ) {

        override fun serialize(
            value: CustomerCreditLedgerCreateEntryResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
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

    @NoAutoDetect
    class IncrementLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): IncrementLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [IncrementLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(incrementLedgerEntry: IncrementLedgerEntry) = apply {
                id = incrementLedgerEntry.id
                amount = incrementLedgerEntry.amount
                createdAt = incrementLedgerEntry.createdAt
                creditBlock = incrementLedgerEntry.creditBlock
                currency = incrementLedgerEntry.currency
                customer = incrementLedgerEntry.customer
                description = incrementLedgerEntry.description
                endingBalance = incrementLedgerEntry.endingBalance
                entryStatus = incrementLedgerEntry.entryStatus
                entryType = incrementLedgerEntry.entryType
                ledgerSequenceNumber = incrementLedgerEntry.ledgerSequenceNumber
                metadata = incrementLedgerEntry.metadata
                startingBalance = incrementLedgerEntry.startingBalance
                additionalProperties = incrementLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

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

            fun build(): IncrementLedgerEntry =
                IncrementLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val INCREMENT = of("increment")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                INCREMENT
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCREMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    INCREMENT -> Value.INCREMENT
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
                    INCREMENT -> Known.INCREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is IncrementLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IncrementLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DecrementLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("event_id")
        @ExcludeMissing
        private val eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun eventId(): String? = eventId.getNullable("event_id")

        fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

        fun priceId(): String? = priceId.getNullable("price_id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DecrementLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            eventId()
            invoiceId()
            priceId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [DecrementLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var eventId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decrementLedgerEntry: DecrementLedgerEntry) = apply {
                id = decrementLedgerEntry.id
                amount = decrementLedgerEntry.amount
                createdAt = decrementLedgerEntry.createdAt
                creditBlock = decrementLedgerEntry.creditBlock
                currency = decrementLedgerEntry.currency
                customer = decrementLedgerEntry.customer
                description = decrementLedgerEntry.description
                endingBalance = decrementLedgerEntry.endingBalance
                entryStatus = decrementLedgerEntry.entryStatus
                entryType = decrementLedgerEntry.entryType
                ledgerSequenceNumber = decrementLedgerEntry.ledgerSequenceNumber
                metadata = decrementLedgerEntry.metadata
                startingBalance = decrementLedgerEntry.startingBalance
                eventId = decrementLedgerEntry.eventId
                invoiceId = decrementLedgerEntry.invoiceId
                priceId = decrementLedgerEntry.priceId
                additionalProperties = decrementLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun eventId(eventId: String?) = eventId(JsonField.ofNullable(eventId))

            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

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

            fun build(): DecrementLedgerEntry =
                DecrementLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    eventId,
                    invoiceId,
                    priceId,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val DECREMENT = of("decrement")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                DECREMENT
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DECREMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    DECREMENT -> Value.DECREMENT
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
                    DECREMENT -> Known.DECREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is DecrementLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && eventId == other.eventId && invoiceId == other.invoiceId && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, eventId, invoiceId, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DecrementLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, eventId=$eventId, invoiceId=$invoiceId, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ExpirationChangeLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        private val newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun newBlockExpiryDate(): OffsetDateTime? =
            newBlockExpiryDate.getNullable("new_block_expiry_date")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate(): JsonField<OffsetDateTime> = newBlockExpiryDate

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExpirationChangeLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            newBlockExpiryDate()
            startingBalance()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ExpirationChangeLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var newBlockExpiryDate: JsonField<OffsetDateTime>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expirationChangeLedgerEntry: ExpirationChangeLedgerEntry) = apply {
                id = expirationChangeLedgerEntry.id
                amount = expirationChangeLedgerEntry.amount
                createdAt = expirationChangeLedgerEntry.createdAt
                creditBlock = expirationChangeLedgerEntry.creditBlock
                currency = expirationChangeLedgerEntry.currency
                customer = expirationChangeLedgerEntry.customer
                description = expirationChangeLedgerEntry.description
                endingBalance = expirationChangeLedgerEntry.endingBalance
                entryStatus = expirationChangeLedgerEntry.entryStatus
                entryType = expirationChangeLedgerEntry.entryType
                ledgerSequenceNumber = expirationChangeLedgerEntry.ledgerSequenceNumber
                metadata = expirationChangeLedgerEntry.metadata
                newBlockExpiryDate = expirationChangeLedgerEntry.newBlockExpiryDate
                startingBalance = expirationChangeLedgerEntry.startingBalance
                additionalProperties =
                    expirationChangeLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime?) =
                newBlockExpiryDate(JsonField.ofNullable(newBlockExpiryDate))

            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

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

            fun build(): ExpirationChangeLedgerEntry =
                ExpirationChangeLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("newBlockExpiryDate", newBlockExpiryDate),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val EXPIRATION_CHANGE = of("expiration_change")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                EXPIRATION_CHANGE
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXPIRATION_CHANGE,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
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
                    EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is ExpirationChangeLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && newBlockExpiryDate == other.newBlockExpiryDate && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, newBlockExpiryDate, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpirationChangeLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, newBlockExpiryDate=$newBlockExpiryDate, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CreditBlockExpiryLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditBlockExpiryLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CreditBlockExpiryLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry) = apply {
                id = creditBlockExpiryLedgerEntry.id
                amount = creditBlockExpiryLedgerEntry.amount
                createdAt = creditBlockExpiryLedgerEntry.createdAt
                creditBlock = creditBlockExpiryLedgerEntry.creditBlock
                currency = creditBlockExpiryLedgerEntry.currency
                customer = creditBlockExpiryLedgerEntry.customer
                description = creditBlockExpiryLedgerEntry.description
                endingBalance = creditBlockExpiryLedgerEntry.endingBalance
                entryStatus = creditBlockExpiryLedgerEntry.entryStatus
                entryType = creditBlockExpiryLedgerEntry.entryType
                ledgerSequenceNumber = creditBlockExpiryLedgerEntry.ledgerSequenceNumber
                metadata = creditBlockExpiryLedgerEntry.metadata
                startingBalance = creditBlockExpiryLedgerEntry.startingBalance
                additionalProperties =
                    creditBlockExpiryLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

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

            fun build(): CreditBlockExpiryLedgerEntry =
                CreditBlockExpiryLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CREDIT_BLOCK_EXPIRY = of("credit_block_expiry")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                CREDIT_BLOCK_EXPIRY
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDIT_BLOCK_EXPIRY,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    CREDIT_BLOCK_EXPIRY -> Value.CREDIT_BLOCK_EXPIRY
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
                    CREDIT_BLOCK_EXPIRY -> Known.CREDIT_BLOCK_EXPIRY
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is CreditBlockExpiryLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditBlockExpiryLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class VoidLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_amount")
        @ExcludeMissing
        private val voidAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        private val voidReason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        fun voidReason(): String? = voidReason.getNullable("void_reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonProperty("void_amount")
        @ExcludeMissing
        fun _voidAmount(): JsonField<Double> = voidAmount

        @JsonProperty("void_reason")
        @ExcludeMissing
        fun _voidReason(): JsonField<String> = voidReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VoidLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            voidAmount()
            voidReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [VoidLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var voidAmount: JsonField<Double>? = null
            private var voidReason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(voidLedgerEntry: VoidLedgerEntry) = apply {
                id = voidLedgerEntry.id
                amount = voidLedgerEntry.amount
                createdAt = voidLedgerEntry.createdAt
                creditBlock = voidLedgerEntry.creditBlock
                currency = voidLedgerEntry.currency
                customer = voidLedgerEntry.customer
                description = voidLedgerEntry.description
                endingBalance = voidLedgerEntry.endingBalance
                entryStatus = voidLedgerEntry.entryStatus
                entryType = voidLedgerEntry.entryType
                ledgerSequenceNumber = voidLedgerEntry.ledgerSequenceNumber
                metadata = voidLedgerEntry.metadata
                startingBalance = voidLedgerEntry.startingBalance
                voidAmount = voidLedgerEntry.voidAmount
                voidReason = voidLedgerEntry.voidReason
                additionalProperties = voidLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

            fun voidReason(voidReason: String?) = voidReason(JsonField.ofNullable(voidReason))

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

            fun build(): VoidLedgerEntry =
                VoidLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("voidAmount", voidAmount),
                    checkRequired("voidReason", voidReason),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val VOID = of("void")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                VOID
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VOID,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    VOID -> Value.VOID
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
                    VOID -> Known.VOID
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is VoidLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && voidAmount == other.voidAmount && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, voidAmount, voidReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, voidAmount=$voidAmount, voidReason=$voidReason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class VoidInitiatedLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        private val newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_amount")
        @ExcludeMissing
        private val voidAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        private val voidReason: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun newBlockExpiryDate(): OffsetDateTime =
            newBlockExpiryDate.getRequired("new_block_expiry_date")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        fun voidAmount(): Double = voidAmount.getRequired("void_amount")

        fun voidReason(): String? = voidReason.getNullable("void_reason")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        fun _newBlockExpiryDate(): JsonField<OffsetDateTime> = newBlockExpiryDate

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonProperty("void_amount")
        @ExcludeMissing
        fun _voidAmount(): JsonField<Double> = voidAmount

        @JsonProperty("void_reason")
        @ExcludeMissing
        fun _voidReason(): JsonField<String> = voidReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VoidInitiatedLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            newBlockExpiryDate()
            startingBalance()
            voidAmount()
            voidReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [VoidInitiatedLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var newBlockExpiryDate: JsonField<OffsetDateTime>? = null
            private var startingBalance: JsonField<Double>? = null
            private var voidAmount: JsonField<Double>? = null
            private var voidReason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry) = apply {
                id = voidInitiatedLedgerEntry.id
                amount = voidInitiatedLedgerEntry.amount
                createdAt = voidInitiatedLedgerEntry.createdAt
                creditBlock = voidInitiatedLedgerEntry.creditBlock
                currency = voidInitiatedLedgerEntry.currency
                customer = voidInitiatedLedgerEntry.customer
                description = voidInitiatedLedgerEntry.description
                endingBalance = voidInitiatedLedgerEntry.endingBalance
                entryStatus = voidInitiatedLedgerEntry.entryStatus
                entryType = voidInitiatedLedgerEntry.entryType
                ledgerSequenceNumber = voidInitiatedLedgerEntry.ledgerSequenceNumber
                metadata = voidInitiatedLedgerEntry.metadata
                newBlockExpiryDate = voidInitiatedLedgerEntry.newBlockExpiryDate
                startingBalance = voidInitiatedLedgerEntry.startingBalance
                voidAmount = voidInitiatedLedgerEntry.voidAmount
                voidReason = voidInitiatedLedgerEntry.voidReason
                additionalProperties = voidInitiatedLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

            fun voidReason(voidReason: String?) = voidReason(JsonField.ofNullable(voidReason))

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

            fun build(): VoidInitiatedLedgerEntry =
                VoidInitiatedLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("newBlockExpiryDate", newBlockExpiryDate),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("voidAmount", voidAmount),
                    checkRequired("voidReason", voidReason),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val VOID_INITIATED = of("void_initiated")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                VOID_INITIATED
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VOID_INITIATED,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    VOID_INITIATED -> Value.VOID_INITIATED
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
                    VOID_INITIATED -> Known.VOID_INITIATED
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is VoidInitiatedLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && newBlockExpiryDate == other.newBlockExpiryDate && startingBalance == other.startingBalance && voidAmount == other.voidAmount && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, newBlockExpiryDate, startingBalance, voidAmount, voidReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidInitiatedLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, newBlockExpiryDate=$newBlockExpiryDate, startingBalance=$startingBalance, voidAmount=$voidAmount, voidReason=$voidReason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AmendmentLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amount(): Double = amount.getRequired("amount")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditBlock(): CreditBlock = creditBlock.getRequired("credit_block")

        fun currency(): String = currency.getRequired("currency")

        fun customer(): Customer = customer.getRequired("customer")

        fun description(): String? = description.getNullable("description")

        fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

        fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        fun ledgerSequenceNumber(): Long =
            ledgerSequenceNumber.getRequired("ledger_sequence_number")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_block")
        @ExcludeMissing
        fun _creditBlock(): JsonField<CreditBlock> = creditBlock

        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<Double> = endingBalance

        @JsonProperty("entry_status")
        @ExcludeMissing
        fun _entryStatus(): JsonField<EntryStatus> = entryStatus

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<Double> = startingBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AmendmentLedgerEntry = apply {
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
            entryStatus()
            entryType()
            ledgerSequenceNumber()
            metadata().validate()
            startingBalance()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [AmendmentLedgerEntry]. */
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
            private var entryType: JsonField<EntryType>? = null
            private var ledgerSequenceNumber: JsonField<Long>? = null
            private var metadata: JsonField<Metadata>? = null
            private var startingBalance: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amendmentLedgerEntry: AmendmentLedgerEntry) = apply {
                id = amendmentLedgerEntry.id
                amount = amendmentLedgerEntry.amount
                createdAt = amendmentLedgerEntry.createdAt
                creditBlock = amendmentLedgerEntry.creditBlock
                currency = amendmentLedgerEntry.currency
                customer = amendmentLedgerEntry.customer
                description = amendmentLedgerEntry.description
                endingBalance = amendmentLedgerEntry.endingBalance
                entryStatus = amendmentLedgerEntry.entryStatus
                entryType = amendmentLedgerEntry.entryType
                ledgerSequenceNumber = amendmentLedgerEntry.ledgerSequenceNumber
                metadata = amendmentLedgerEntry.metadata
                startingBalance = amendmentLedgerEntry.startingBalance
                additionalProperties = amendmentLedgerEntry.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

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
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

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

            fun build(): AmendmentLedgerEntry =
                AmendmentLedgerEntry(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditBlock", creditBlock),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("entryStatus", entryStatus),
                    checkRequired("entryType", entryType),
                    checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                    checkRequired("metadata", metadata),
                    checkRequired("startingBalance", startingBalance),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditBlock
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("expiry_date")
            @ExcludeMissing
            fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime?) =
                    expiryDate(JsonField.ofNullable(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String?) =
                    perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

                fun build(): CreditBlock =
                    CreditBlock(
                        checkRequired("id", id),
                        checkRequired("expiryDate", expiryDate),
                        checkRequired("perUnitCostBasis", perUnitCostBasis),
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Customer
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            private val externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val AMENDMENT = of("amendment")

                fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                AMENDMENT
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AMENDMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
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
                    AMENDMENT -> Value.AMENDMENT
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
                    AMENDMENT -> Known.AMENDMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is AmendmentLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && startingBalance == other.startingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, startingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmendmentLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, startingBalance=$startingBalance, additionalProperties=$additionalProperties}"
    }
}
