// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.JsonValue
import com.withorb.api.core.getOrThrow
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
@JsonDeserialize(using = CustomerCreditLedgerCreateEntryByExternalIdResponse.Deserializer::class)
@JsonSerialize(using = CustomerCreditLedgerCreateEntryByExternalIdResponse.Serializer::class)
class CustomerCreditLedgerCreateEntryByExternalIdResponse
private constructor(
    private val increment: IncrementLedgerEntry? = null,
    private val decrement: DecrementLedgerEntry? = null,
    private val expirationChange: ExpirationChangeLedgerEntry? = null,
    private val creditBlockExpiry: CreditBlockExpiryLedgerEntry? = null,
    private val void: VoidLedgerEntry? = null,
    private val voidInitiated: VoidInitiatedLedgerEntry? = null,
    private val amendment: AmendmentLedgerEntry? = null,
    private val _json: JsonValue? = null,
) {

    fun increment(): IncrementLedgerEntry? = increment

    fun decrement(): DecrementLedgerEntry? = decrement

    fun expirationChange(): ExpirationChangeLedgerEntry? = expirationChange

    fun creditBlockExpiry(): CreditBlockExpiryLedgerEntry? = creditBlockExpiry

    fun void(): VoidLedgerEntry? = void

    fun voidInitiated(): VoidInitiatedLedgerEntry? = voidInitiated

    fun amendment(): AmendmentLedgerEntry? = amendment

    fun isIncrement(): Boolean = increment != null

    fun isDecrement(): Boolean = decrement != null

    fun isExpirationChange(): Boolean = expirationChange != null

    fun isCreditBlockExpiry(): Boolean = creditBlockExpiry != null

    fun isVoid(): Boolean = void != null

    fun isVoidInitiated(): Boolean = voidInitiated != null

    fun isAmendment(): Boolean = amendment != null

    fun asIncrement(): IncrementLedgerEntry = increment.getOrThrow("increment")

    fun asDecrement(): DecrementLedgerEntry = decrement.getOrThrow("decrement")

    fun asExpirationChange(): ExpirationChangeLedgerEntry =
        expirationChange.getOrThrow("expirationChange")

    fun asCreditBlockExpiry(): CreditBlockExpiryLedgerEntry =
        creditBlockExpiry.getOrThrow("creditBlockExpiry")

    fun asVoid(): VoidLedgerEntry = void.getOrThrow("void")

    fun asVoidInitiated(): VoidInitiatedLedgerEntry = voidInitiated.getOrThrow("voidInitiated")

    fun asAmendment(): AmendmentLedgerEntry = amendment.getOrThrow("amendment")

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

    fun validate(): CustomerCreditLedgerCreateEntryByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIncrement(increment: IncrementLedgerEntry) {
                    increment.validate()
                }

                override fun visitDecrement(decrement: DecrementLedgerEntry) {
                    decrement.validate()
                }

                override fun visitExpirationChange(expirationChange: ExpirationChangeLedgerEntry) {
                    expirationChange.validate()
                }

                override fun visitCreditBlockExpiry(
                    creditBlockExpiry: CreditBlockExpiryLedgerEntry
                ) {
                    creditBlockExpiry.validate()
                }

                override fun visitVoid(void: VoidLedgerEntry) {
                    void.validate()
                }

                override fun visitVoidInitiated(voidInitiated: VoidInitiatedLedgerEntry) {
                    voidInitiated.validate()
                }

                override fun visitAmendment(amendment: AmendmentLedgerEntry) {
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
                override fun visitIncrement(increment: IncrementLedgerEntry) = increment.validity()

                override fun visitDecrement(decrement: DecrementLedgerEntry) = decrement.validity()

                override fun visitExpirationChange(expirationChange: ExpirationChangeLedgerEntry) =
                    expirationChange.validity()

                override fun visitCreditBlockExpiry(
                    creditBlockExpiry: CreditBlockExpiryLedgerEntry
                ) = creditBlockExpiry.validity()

                override fun visitVoid(void: VoidLedgerEntry) = void.validity()

                override fun visitVoidInitiated(voidInitiated: VoidInitiatedLedgerEntry) =
                    voidInitiated.validity()

                override fun visitAmendment(amendment: AmendmentLedgerEntry) = amendment.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryByExternalIdResponse && increment == other.increment && decrement == other.decrement && expirationChange == other.expirationChange && creditBlockExpiry == other.creditBlockExpiry && void == other.void && voidInitiated == other.voidInitiated && amendment == other.amendment /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(increment, decrement, expirationChange, creditBlockExpiry, void, voidInitiated, amendment) /* spotless:on */

    override fun toString(): String =
        when {
            increment != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{increment=$increment}"
            decrement != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{decrement=$decrement}"
            expirationChange != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{expirationChange=$expirationChange}"
            creditBlockExpiry != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{creditBlockExpiry=$creditBlockExpiry}"
            void != null -> "CustomerCreditLedgerCreateEntryByExternalIdResponse{void=$void}"
            voidInitiated != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{voidInitiated=$voidInitiated}"
            amendment != null ->
                "CustomerCreditLedgerCreateEntryByExternalIdResponse{amendment=$amendment}"
            _json != null -> "CustomerCreditLedgerCreateEntryByExternalIdResponse{_unknown=$_json}"
            else ->
                throw IllegalStateException(
                    "Invalid CustomerCreditLedgerCreateEntryByExternalIdResponse"
                )
        }

    companion object {

        fun ofIncrement(increment: IncrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(increment = increment)

        fun ofDecrement(decrement: DecrementLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(decrement = decrement)

        fun ofExpirationChange(expirationChange: ExpirationChangeLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(expirationChange = expirationChange)

        fun ofCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiryLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                creditBlockExpiry = creditBlockExpiry
            )

        fun ofVoid(void: VoidLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(void = void)

        fun ofVoidInitiated(voidInitiated: VoidInitiatedLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(voidInitiated = voidInitiated)

        fun ofAmendment(amendment: AmendmentLedgerEntry) =
            CustomerCreditLedgerCreateEntryByExternalIdResponse(amendment = amendment)
    }

    /**
     * An interface that defines how to map each variant of
     * [CustomerCreditLedgerCreateEntryByExternalIdResponse] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitIncrement(increment: IncrementLedgerEntry): T

        fun visitDecrement(decrement: DecrementLedgerEntry): T

        fun visitExpirationChange(expirationChange: ExpirationChangeLedgerEntry): T

        fun visitCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiryLedgerEntry): T

        fun visitVoid(void: VoidLedgerEntry): T

        fun visitVoidInitiated(voidInitiated: VoidInitiatedLedgerEntry): T

        fun visitAmendment(amendment: AmendmentLedgerEntry): T

        /**
         * Maps an unknown variant of [CustomerCreditLedgerCreateEntryByExternalIdResponse] to a
         * value of type [T].
         *
         * An instance of [CustomerCreditLedgerCreateEntryByExternalIdResponse] can contain an
         * unknown variant if it was deserialized from data that doesn't match any known variant.
         * For example, if the SDK is on an older version than the API, then the API may respond
         * with new variants that the SDK is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException(
                "Unknown CustomerCreditLedgerCreateEntryByExternalIdResponse: $json"
            )
        }
    }

    internal class Deserializer :
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
                    return tryDeserialize(node, jacksonTypeRef<IncrementLedgerEntry>())?.let {
                        CustomerCreditLedgerCreateEntryByExternalIdResponse(
                            increment = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "decrement" -> {
                    return tryDeserialize(node, jacksonTypeRef<DecrementLedgerEntry>())?.let {
                        CustomerCreditLedgerCreateEntryByExternalIdResponse(
                            decrement = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "expiration_change" -> {
                    return tryDeserialize(node, jacksonTypeRef<ExpirationChangeLedgerEntry>())
                        ?.let {
                            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                expirationChange = it,
                                _json = json,
                            )
                        } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "credit_block_expiry" -> {
                    return tryDeserialize(node, jacksonTypeRef<CreditBlockExpiryLedgerEntry>())
                        ?.let {
                            CustomerCreditLedgerCreateEntryByExternalIdResponse(
                                creditBlockExpiry = it,
                                _json = json,
                            )
                        } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "void" -> {
                    return tryDeserialize(node, jacksonTypeRef<VoidLedgerEntry>())?.let {
                        CustomerCreditLedgerCreateEntryByExternalIdResponse(void = it, _json = json)
                    } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "void_initiated" -> {
                    return tryDeserialize(node, jacksonTypeRef<VoidInitiatedLedgerEntry>())?.let {
                        CustomerCreditLedgerCreateEntryByExternalIdResponse(
                            voidInitiated = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
                "amendment" -> {
                    return tryDeserialize(node, jacksonTypeRef<AmendmentLedgerEntry>())?.let {
                        CustomerCreditLedgerCreateEntryByExternalIdResponse(
                            amendment = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
                }
            }

            return CustomerCreditLedgerCreateEntryByExternalIdResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerCreditLedgerCreateEntryByExternalIdResponse>(
            CustomerCreditLedgerCreateEntryByExternalIdResponse::class
        ) {

        override fun serialize(
            value: CustomerCreditLedgerCreateEntryByExternalIdResponse,
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
                        "Invalid CustomerCreditLedgerCreateEntryByExternalIdResponse"
                    )
            }
        }
    }
}
