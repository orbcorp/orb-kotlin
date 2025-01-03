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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The [Credit Ledger Entry resource](/guides/product-catalog/prepurchase) models prepaid credits
 * within Orb.
 */
@JsonDeserialize(using = CustomerCreditLedgerCreateEntryByExternalIdResponse.Deserializer::class)
@JsonSerialize(using = CustomerCreditLedgerCreateEntryByExternalIdResponse.Serializer::class)
class CustomerCreditLedgerCreateEntryByExternalIdResponse
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

    fun validate(): CustomerCreditLedgerCreateEntryByExternalIdResponse = apply {
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
                    "Unknown CustomerCreditLedgerCreateEntryByExternalIdResponse: $_json"
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

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryByExternalIdResponse && incrementLedgerEntry == other.incrementLedgerEntry && decrementLedgerEntry == other.decrementLedgerEntry && expirationChangeLedgerEntry == other.expirationChangeLedgerEntry && creditBlockExpiryLedgerEntry == other.creditBlockExpiryLedgerEntry && voidLedgerEntry == other.voidLedgerEntry && voidInitiatedLedgerEntry == other.voidInitiatedLedgerEntry && amendmentLedgerEntry == other.amendmentLedgerEntry /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(incrementLedgerEntry, decrementLedgerEntry, expirationChangeLedgerEntry, creditBlockExpiryLedgerEntry, voidLedgerEntry, voidInitiatedLedgerEntry, amendmentLedgerEntry) /* spotless:on */

    override fun toString(): String =
        when {
            incrementLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{incrementLedgerEntry=$incrementLedgerEntry}"
            decrementLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{decrementLedgerEntry=$decrementLedgerEntry}"
            expirationChangeLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{expirationChangeLedgerEntry=$expirationChangeLedgerEntry}"
            creditBlockExpiryLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{creditBlockExpiryLedgerEntry=$creditBlockExpiryLedgerEntry}"
            voidLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{voidLedgerEntry=$voidLedgerEntry}"
            voidInitiatedLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{voidInitiatedLedgerEntry=$voidInitiatedLedgerEntry}"
            amendmentLedgerEntry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{amendmentLedgerEntry=$amendmentLedgerEntry}"
            _json != null -> "CustomerCreditLedgerCreateEntryByExternalIdResponse{_unknown=$_json}"
            else ->
                throw IllegalStateException(
                    "Invalid CustomerCreditLedgerCreateEntryByExternalIdResponse"
                )
        }

    companion object {

        fun ofIncrementLedgerEntry(incrementLedgerEntry: IncrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                incrementLedgerEntry = incrementLedgerEntry
            )

        fun ofDecrementLedgerEntry(decrementLedgerEntry: DecrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                decrementLedgerEntry = decrementLedgerEntry
            )

        fun ofExpirationChangeLedgerEntry(
            expirationChangeLedgerEntry: ExpirationChangeLedgerEntry
        ) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                expirationChangeLedgerEntry = expirationChangeLedgerEntry
            )

        fun ofCreditBlockExpiryLedgerEntry(
            creditBlockExpiryLedgerEntry: CreditBlockExpiryLedgerEntry
        ) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                creditBlockExpiryLedgerEntry = creditBlockExpiryLedgerEntry
            )

        fun ofVoidLedgerEntry(voidLedgerEntry: VoidLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(voidLedgerEntry = voidLedgerEntry)

        fun ofVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                voidInitiatedLedgerEntry = voidInitiatedLedgerEntry
            )

        fun ofAmendmentLedgerEntry(amendmentLedgerEntry: AmendmentLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                amendmentLedgerEntry = amendmentLedgerEntry
            )
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
            throw OrbInvalidDataException(
                "Unknown CustomerCreditLedgerCreateEntryByExternalIdResponse: $json"
            )
        }
    }

    class Deserializer :
        BaseDeserializer<CustomerCreditLedgerCreateEntryByExternalIdResponse>(
            CustomerCreditLedgerCreateEntryByExternalIdResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): CustomerCreditLedgerCreateEntryByExternalIdResponse {
            val json = JsonValue.fromJsonNode(node)
            val entryType = json.asObject()?.get("entry_type")?.asString()

            when (entryType) {
                "increment" -> {
                    tryDeserialize(node, jacksonTypeRef<IncrementLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                incrementLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "decrement" -> {
                    tryDeserialize(node, jacksonTypeRef<DecrementLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                decrementLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "expiration_change" -> {
                    tryDeserialize(node, jacksonTypeRef<ExpirationChangeLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                expirationChangeLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "credit_block_expiry" -> {
                    tryDeserialize(node, jacksonTypeRef<CreditBlockExpiryLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                creditBlockExpiryLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "void" -> {
                    tryDeserialize(node, jacksonTypeRef<VoidLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                voidLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "void_initiated" -> {
                    tryDeserialize(node, jacksonTypeRef<VoidInitiatedLedgerEntry>()) {
                            it.validate()
                        }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                voidInitiatedLedgerEntry = it,
                                _json = json
                            )
                        }
                }
                "amendment" -> {
                    tryDeserialize(node, jacksonTypeRef<AmendmentLedgerEntry>()) { it.validate() }
                        ?.let {
                            return CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                amendmentLedgerEntry = it,
                                _json = json
                            )
                        }
                }
            }

            return CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<CustomerCreditLedgerCreateEntryByExternalIdResponse>(
            CustomerCreditLedgerCreateEntryByExternalIdResponse::class
        ) {

        override fun serialize(
            value: CustomerCreditLedgerCreateEntryByExternalIdResponse,
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
                    throw IllegalStateException(
                        "Invalid CustomerCreditLedgerCreateEntryByExternalIdResponse"
                    )
            }
        }
    }

    @NoAutoDetect
    class IncrementLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = incrementLedgerEntry.metadata
                id = incrementLedgerEntry.id
                ledgerSequenceNumber = incrementLedgerEntry.ledgerSequenceNumber
                entryStatus = incrementLedgerEntry.entryStatus
                customer = incrementLedgerEntry.customer
                startingBalance = incrementLedgerEntry.startingBalance
                endingBalance = incrementLedgerEntry.endingBalance
                amount = incrementLedgerEntry.amount
                currency = incrementLedgerEntry.currency
                createdAt = incrementLedgerEntry.createdAt
                description = incrementLedgerEntry.description
                creditBlock = incrementLedgerEntry.creditBlock
                entryType = incrementLedgerEntry.entryType
                additionalProperties = incrementLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCREMENT = of("increment")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is IncrementLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IncrementLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DecrementLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_id")
        @ExcludeMissing
        private val eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = decrementLedgerEntry.metadata
                id = decrementLedgerEntry.id
                ledgerSequenceNumber = decrementLedgerEntry.ledgerSequenceNumber
                entryStatus = decrementLedgerEntry.entryStatus
                customer = decrementLedgerEntry.customer
                startingBalance = decrementLedgerEntry.startingBalance
                endingBalance = decrementLedgerEntry.endingBalance
                amount = decrementLedgerEntry.amount
                currency = decrementLedgerEntry.currency
                createdAt = decrementLedgerEntry.createdAt
                description = decrementLedgerEntry.description
                creditBlock = decrementLedgerEntry.creditBlock
                entryType = decrementLedgerEntry.entryType
                priceId = decrementLedgerEntry.priceId
                eventId = decrementLedgerEntry.eventId
                invoiceId = decrementLedgerEntry.invoiceId
                additionalProperties = decrementLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun eventId(eventId: String) = eventId(JsonField.of(eventId))

            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DECREMENT = of("decrement")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is DecrementLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && priceId == other.priceId && eventId == other.eventId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, priceId, eventId, invoiceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DecrementLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, priceId=$priceId, eventId=$eventId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ExpirationChangeLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        private val newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        fun newBlockExpiryDate(): OffsetDateTime? =
            newBlockExpiryDate.getNullable("new_block_expiry_date")

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

        private var validated: Boolean = false

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
                metadata = expirationChangeLedgerEntry.metadata
                id = expirationChangeLedgerEntry.id
                ledgerSequenceNumber = expirationChangeLedgerEntry.ledgerSequenceNumber
                entryStatus = expirationChangeLedgerEntry.entryStatus
                customer = expirationChangeLedgerEntry.customer
                startingBalance = expirationChangeLedgerEntry.startingBalance
                endingBalance = expirationChangeLedgerEntry.endingBalance
                amount = expirationChangeLedgerEntry.amount
                currency = expirationChangeLedgerEntry.currency
                createdAt = expirationChangeLedgerEntry.createdAt
                description = expirationChangeLedgerEntry.description
                creditBlock = expirationChangeLedgerEntry.creditBlock
                entryType = expirationChangeLedgerEntry.entryType
                newBlockExpiryDate = expirationChangeLedgerEntry.newBlockExpiryDate
                additionalProperties =
                    expirationChangeLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EXPIRATION_CHANGE = of("expiration_change")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is ExpirationChangeLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && newBlockExpiryDate == other.newBlockExpiryDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, newBlockExpiryDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpirationChangeLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, newBlockExpiryDate=$newBlockExpiryDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CreditBlockExpiryLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = creditBlockExpiryLedgerEntry.metadata
                id = creditBlockExpiryLedgerEntry.id
                ledgerSequenceNumber = creditBlockExpiryLedgerEntry.ledgerSequenceNumber
                entryStatus = creditBlockExpiryLedgerEntry.entryStatus
                customer = creditBlockExpiryLedgerEntry.customer
                startingBalance = creditBlockExpiryLedgerEntry.startingBalance
                endingBalance = creditBlockExpiryLedgerEntry.endingBalance
                amount = creditBlockExpiryLedgerEntry.amount
                currency = creditBlockExpiryLedgerEntry.currency
                createdAt = creditBlockExpiryLedgerEntry.createdAt
                description = creditBlockExpiryLedgerEntry.description
                creditBlock = creditBlockExpiryLedgerEntry.creditBlock
                entryType = creditBlockExpiryLedgerEntry.entryType
                additionalProperties =
                    creditBlockExpiryLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CREDIT_BLOCK_EXPIRY = of("credit_block_expiry")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is CreditBlockExpiryLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditBlockExpiryLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class VoidLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        private val voidReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("void_amount")
        @ExcludeMissing
        private val voidAmount: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = voidLedgerEntry.metadata
                id = voidLedgerEntry.id
                ledgerSequenceNumber = voidLedgerEntry.ledgerSequenceNumber
                entryStatus = voidLedgerEntry.entryStatus
                customer = voidLedgerEntry.customer
                startingBalance = voidLedgerEntry.startingBalance
                endingBalance = voidLedgerEntry.endingBalance
                amount = voidLedgerEntry.amount
                currency = voidLedgerEntry.currency
                createdAt = voidLedgerEntry.createdAt
                description = voidLedgerEntry.description
                creditBlock = voidLedgerEntry.creditBlock
                entryType = voidLedgerEntry.entryType
                voidReason = voidLedgerEntry.voidReason
                voidAmount = voidLedgerEntry.voidAmount
                additionalProperties = voidLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun voidReason(voidReason: String) = voidReason(JsonField.of(voidReason))

            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val VOID = of("void")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is VoidLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && voidReason == other.voidReason && voidAmount == other.voidAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, voidReason, voidAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, voidReason=$voidReason, voidAmount=$voidAmount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class VoidInitiatedLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        private val newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        private val voidReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("void_amount")
        @ExcludeMissing
        private val voidAmount: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = voidInitiatedLedgerEntry.metadata
                id = voidInitiatedLedgerEntry.id
                ledgerSequenceNumber = voidInitiatedLedgerEntry.ledgerSequenceNumber
                entryStatus = voidInitiatedLedgerEntry.entryStatus
                customer = voidInitiatedLedgerEntry.customer
                startingBalance = voidInitiatedLedgerEntry.startingBalance
                endingBalance = voidInitiatedLedgerEntry.endingBalance
                amount = voidInitiatedLedgerEntry.amount
                currency = voidInitiatedLedgerEntry.currency
                createdAt = voidInitiatedLedgerEntry.createdAt
                description = voidInitiatedLedgerEntry.description
                creditBlock = voidInitiatedLedgerEntry.creditBlock
                entryType = voidInitiatedLedgerEntry.entryType
                newBlockExpiryDate = voidInitiatedLedgerEntry.newBlockExpiryDate
                voidReason = voidInitiatedLedgerEntry.voidReason
                voidAmount = voidInitiatedLedgerEntry.voidAmount
                additionalProperties = voidInitiatedLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
                newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

            fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
                this.newBlockExpiryDate = newBlockExpiryDate
            }

            fun voidReason(voidReason: String) = voidReason(JsonField.of(voidReason))

            fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

            fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

            fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val VOID_INITIATED = of("void_initiated")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is VoidInitiatedLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && newBlockExpiryDate == other.newBlockExpiryDate && voidReason == other.voidReason && voidAmount == other.voidAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, newBlockExpiryDate, voidReason, voidAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidInitiatedLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, newBlockExpiryDate=$newBlockExpiryDate, voidReason=$voidReason, voidAmount=$voidAmount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AmendmentLedgerEntry
    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        private val ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        private val entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        private val creditBlock: JsonField<CreditBlock> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

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
                metadata = amendmentLedgerEntry.metadata
                id = amendmentLedgerEntry.id
                ledgerSequenceNumber = amendmentLedgerEntry.ledgerSequenceNumber
                entryStatus = amendmentLedgerEntry.entryStatus
                customer = amendmentLedgerEntry.customer
                startingBalance = amendmentLedgerEntry.startingBalance
                endingBalance = amendmentLedgerEntry.endingBalance
                amount = amendmentLedgerEntry.amount
                currency = amendmentLedgerEntry.currency
                createdAt = amendmentLedgerEntry.createdAt
                description = amendmentLedgerEntry.description
                creditBlock = amendmentLedgerEntry.creditBlock
                entryType = amendmentLedgerEntry.entryType
                additionalProperties = amendmentLedgerEntry.additionalProperties.toMutableMap()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
                ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

            fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
                this.ledgerSequenceNumber = ledgerSequenceNumber
            }

            fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

            fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
                this.entryStatus = entryStatus
            }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun startingBalance(startingBalance: Double) =
                startingBalance(JsonField.of(startingBalance))

            fun startingBalance(startingBalance: JsonField<Double>) = apply {
                this.startingBalance = startingBalance
            }

            fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

            fun endingBalance(endingBalance: JsonField<Double>) = apply {
                this.endingBalance = endingBalance
            }

            fun amount(amount: Double) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun currency(currency: String) = currency(JsonField.of(currency))

            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun creditBlock(creditBlock: CreditBlock) = creditBlock(JsonField.of(creditBlock))

            fun creditBlock(creditBlock: JsonField<CreditBlock>) = apply {
                this.creditBlock = creditBlock
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            fun _perUnitCostBasis() = perUnitCostBasis

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditBlock = apply {
                if (!validated) {
                    id()
                    expiryDate()
                    perUnitCostBasis()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBlock: CreditBlock) = apply {
                    id = creditBlock.id
                    expiryDate = creditBlock.expiryDate
                    perUnitCostBasis = creditBlock.perUnitCostBasis
                    additionalProperties = creditBlock.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

                fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                    this.expiryDate = expiryDate
                }

                fun perUnitCostBasis(perUnitCostBasis: String) =
                    perUnitCostBasis(JsonField.of(perUnitCostBasis))

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
                        id,
                        expiryDate,
                        perUnitCostBasis,
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId() = externalCustomerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Customer = apply {
                if (!validated) {
                    id()
                    externalCustomerId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customer: Customer) = apply {
                    id = customer.id
                    externalCustomerId = customer.externalCustomerId
                    additionalProperties = customer.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun externalCustomerId(externalCustomerId: String) =
                    externalCustomerId(JsonField.of(externalCustomerId))

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
                        id,
                        externalCustomerId,
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

        class EntryStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMMITTED = of("committed")

                val PENDING = of("pending")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AMENDMENT = of("amendment")

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
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

            return /* spotless:off */ other is AmendmentLedgerEntry && metadata == other.metadata && id == other.id && ledgerSequenceNumber == other.ledgerSequenceNumber && entryStatus == other.entryStatus && customer == other.customer && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && currency == other.currency && createdAt == other.createdAt && description == other.description && creditBlock == other.creditBlock && entryType == other.entryType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, id, ledgerSequenceNumber, entryStatus, customer, startingBalance, endingBalance, amount, currency, createdAt, description, creditBlock, entryType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmendmentLedgerEntry{metadata=$metadata, id=$id, ledgerSequenceNumber=$ledgerSequenceNumber, entryStatus=$entryStatus, customer=$customer, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, creditBlock=$creditBlock, entryType=$entryType, additionalProperties=$additionalProperties}"
    }
}
