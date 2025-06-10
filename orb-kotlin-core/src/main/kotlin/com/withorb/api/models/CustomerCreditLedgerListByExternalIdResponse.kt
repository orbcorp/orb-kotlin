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
@JsonDeserialize(using = CustomerCreditLedgerListByExternalIdResponse.Deserializer::class)
@JsonSerialize(using = CustomerCreditLedgerListByExternalIdResponse.Serializer::class)
class CustomerCreditLedgerListByExternalIdResponse
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

    fun validate(): CustomerCreditLedgerListByExternalIdResponse = apply {
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

        fun ofIncrement(increment: IncrementLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(increment = increment)

        fun ofDecrement(decrement: DecrementLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(decrement = decrement)

        fun ofExpirationChange(expirationChange: ExpirationChangeLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(expirationChange = expirationChange)

        fun ofCreditBlockExpiry(creditBlockExpiry: CreditBlockExpiryLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(creditBlockExpiry = creditBlockExpiry)

        fun ofVoid(void: VoidLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(void = void)

        fun ofVoidInitiated(voidInitiated: VoidInitiatedLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(voidInitiated = voidInitiated)

        fun ofAmendment(amendment: AmendmentLedgerEntry) =
            CustomerCreditLedgerListByExternalIdResponse(amendment = amendment)
    }

    /**
     * An interface that defines how to map each variant of
     * [CustomerCreditLedgerListByExternalIdResponse] to a value of type [T].
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
                    return tryDeserialize(node, jacksonTypeRef<IncrementLedgerEntry>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(increment = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "decrement" -> {
                    return tryDeserialize(node, jacksonTypeRef<DecrementLedgerEntry>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(decrement = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "expiration_change" -> {
                    return tryDeserialize(node, jacksonTypeRef<ExpirationChangeLedgerEntry>())
                        ?.let {
                            CustomerCreditLedgerListByExternalIdResponse(
                                expirationChange = it,
                                _json = json,
                            )
                        } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "credit_block_expiry" -> {
                    return tryDeserialize(node, jacksonTypeRef<CreditBlockExpiryLedgerEntry>())
                        ?.let {
                            CustomerCreditLedgerListByExternalIdResponse(
                                creditBlockExpiry = it,
                                _json = json,
                            )
                        } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "void" -> {
                    return tryDeserialize(node, jacksonTypeRef<VoidLedgerEntry>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(void = it, _json = json)
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "void_initiated" -> {
                    return tryDeserialize(node, jacksonTypeRef<VoidInitiatedLedgerEntry>())?.let {
                        CustomerCreditLedgerListByExternalIdResponse(
                            voidInitiated = it,
                            _json = json,
                        )
                    } ?: CustomerCreditLedgerListByExternalIdResponse(_json = json)
                }
                "amendment" -> {
                    return tryDeserialize(node, jacksonTypeRef<AmendmentLedgerEntry>())?.let {
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
}
