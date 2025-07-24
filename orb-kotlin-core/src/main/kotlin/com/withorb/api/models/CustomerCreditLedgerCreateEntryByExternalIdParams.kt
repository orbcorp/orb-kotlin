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
import com.withorb.api.core.Params
import com.withorb.api.core.allMaxBy
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows you to create a new ledger entry for a specified customer's balance. This
 * can be used to increment balance, deduct credits, and change the expiry date of existing credits.
 *
 * ## Effects of adding a ledger entry
 * 1. After calling this endpoint, [Fetch Credit Balance](fetch-customer-credits) will return a
 *    credit block that represents the changes (i.e. balance changes or transfers).
 * 2. A ledger entry will be added to the credits ledger for this customer, and therefore returned
 *    in the [View Credits Ledger](fetch-customer-credits-ledger) response as well as serialized in
 *    the response to this request. In the case of deductions without a specified block, multiple
 *    ledger entries may be created if the deduction spans credit blocks.
 * 3. If `invoice_settings` is specified, an invoice will be created that reflects the cost of the
 *    credits (based on `amount` and `per_unit_cost_basis`).
 *
 * ## Adding credits
 *
 * Adding credits is done by creating an entry of type `increment`. This requires the caller to
 * specify a number of credits as well as an optional expiry date in `YYYY-MM-DD` format. Orb also
 * recommends specifying a description to assist with auditing. When adding credits, the caller can
 * also specify a cost basis per-credit, to indicate how much in USD a customer paid for a single
 * credit in a block. This can later be used for revenue recognition.
 *
 * The following snippet illustrates a sample request body to increment credits which will expire in
 * January of 2022.
 *
 * ```json
 * {
 *   "entry_type": "increment",
 *   "amount": 100,
 *   "expiry_date": "2022-12-28",
 *   "per_unit_cost_basis": "0.20",
 *   "description": "Purchased 100 credits"
 * }
 * ```
 *
 * Note that by default, Orb will always first increment any _negative_ balance in existing blocks
 * before adding the remaining amount to the desired credit block.
 *
 * ### Invoicing for credits
 *
 * By default, Orb manipulates the credit ledger but does not charge for credits. However, if you
 * pass `invoice_settings` in the body of this request, Orb will also generate a one-off invoice for
 * the customer for the credits pre-purchase. Note that you _must_ provide the
 * `per_unit_cost_basis`, since the total charges on the invoice are calculated by multiplying the
 * cost basis with the number of credit units added.
 *
 * ## Deducting Credits
 *
 * Orb allows you to deduct credits from a customer by creating an entry of type `decrement`. Orb
 * matches the algorithm for automatic deductions for determining which credit blocks to decrement
 * from. In the case that the deduction leads to multiple ledger entries, the response from this
 * endpoint will be the final deduction. Orb also optionally allows specifying a description to
 * assist with auditing.
 *
 * The following snippet illustrates a sample request body to decrement credits.
 *
 * ```json
 * {
 *   "entry_type": "decrement",
 *   "amount": 20,
 *   "description": "Removing excess credits"
 * }
 * ```
 *
 * ## Changing credits expiry
 *
 * If you'd like to change when existing credits expire, you should create a ledger entry of type
 * `expiration_change`. For this entry, the required parameter `expiry_date` identifies the
 * _originating_ block, and the required parameter `target_expiry_date` identifies when the
 * transferred credits should now expire. A new credit block will be created with expiry date
 * `target_expiry_date`, with the same cost basis data as the original credit block, if present.
 *
 * Note that the balance of the block with the given `expiry_date` must be at least equal to the
 * desired transfer amount determined by the `amount` parameter.
 *
 * The following snippet illustrates a sample request body to extend the expiration date of credits
 * by one year:
 * ```json
 * {
 *   "entry_type": "expiration_change",
 *   "amount": 10,
 *   "expiry_date": "2022-12-28",
 *   "block_id": "UiUhFWeLHPrBY4Ad",
 *   "target_expiry_date": "2023-12-28",
 *   "description": "Extending credit validity"
 * }
 * ```
 *
 * ## Voiding credits
 *
 * If you'd like to void a credit block, create a ledger entry of type `void`. For this entry,
 * `block_id` is required to identify the block, and `amount` indicates how many credits to void, up
 * to the block's initial balance. Pass in a `void_reason` of `refund` if the void is due to a
 * refund.
 *
 * ## Amendment
 *
 * If you'd like to undo a decrement on a credit block, create a ledger entry of type `amendment`.
 * For this entry, `block_id` is required to identify the block that was originally decremented
 * from, and `amount` indicates how many credits to return to the customer, up to the block's
 * initial balance.
 */
class CustomerCreditLedgerCreateEntryByExternalIdParams
private constructor(
    private val externalCustomerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String? = externalCustomerId

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerCreateEntryByExternalIdParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreditLedgerCreateEntryByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerCreditLedgerCreateEntryByExternalIdParams:
                CustomerCreditLedgerCreateEntryByExternalIdParams
        ) = apply {
            externalCustomerId =
                customerCreditLedgerCreateEntryByExternalIdParams.externalCustomerId
            body = customerCreditLedgerCreateEntryByExternalIdParams.body
            additionalHeaders =
                customerCreditLedgerCreateEntryByExternalIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerCreditLedgerCreateEntryByExternalIdParams.additionalQueryParams.toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofIncrement(increment)`. */
        fun body(increment: Body.Increment) = body(Body.ofIncrement(increment))

        /**
         * Alias for calling [body] with the following:
         * ```kotlin
         * Body.Increment.builder()
         *     .amount(amount)
         *     .build()
         * ```
         */
        fun incrementBody(amount: Double) = body(Body.Increment.builder().amount(amount).build())

        /** Alias for calling [body] with `Body.ofDecrement(decrement)`. */
        fun body(decrement: Body.Decrement) = body(Body.ofDecrement(decrement))

        /**
         * Alias for calling [body] with the following:
         * ```kotlin
         * Body.Decrement.builder()
         *     .amount(amount)
         *     .build()
         * ```
         */
        fun decrementBody(amount: Double) = body(Body.Decrement.builder().amount(amount).build())

        /** Alias for calling [body] with `Body.ofExpirationChange(expirationChange)`. */
        fun body(expirationChange: Body.ExpirationChange) =
            body(Body.ofExpirationChange(expirationChange))

        /**
         * Alias for calling [body] with the following:
         * ```kotlin
         * Body.ExpirationChange.builder()
         *     .targetExpiryDate(targetExpiryDate)
         *     .build()
         * ```
         */
        fun expirationChangeBody(targetExpiryDate: LocalDate) =
            body(Body.ExpirationChange.builder().targetExpiryDate(targetExpiryDate).build())

        /** Alias for calling [body] with `Body.ofVoid(void)`. */
        fun body(void: Body.Void) = body(Body.ofVoid(void))

        /** Alias for calling [body] with `Body.ofAmendment(amendment)`. */
        fun body(amendment: Body.Amendment) = body(Body.ofAmendment(amendment))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerCreateEntryByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreditLedgerCreateEntryByExternalIdParams =
            CustomerCreditLedgerCreateEntryByExternalIdParams(
                externalCustomerId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val increment: Increment? = null,
        private val decrement: Decrement? = null,
        private val expirationChange: ExpirationChange? = null,
        private val void: Void? = null,
        private val amendment: Amendment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun increment(): Increment? = increment

        fun decrement(): Decrement? = decrement

        fun expirationChange(): ExpirationChange? = expirationChange

        fun void(): Void? = void

        fun amendment(): Amendment? = amendment

        fun isIncrement(): Boolean = increment != null

        fun isDecrement(): Boolean = decrement != null

        fun isExpirationChange(): Boolean = expirationChange != null

        fun isVoid(): Boolean = void != null

        fun isAmendment(): Boolean = amendment != null

        fun asIncrement(): Increment = increment.getOrThrow("increment")

        fun asDecrement(): Decrement = decrement.getOrThrow("decrement")

        fun asExpirationChange(): ExpirationChange = expirationChange.getOrThrow("expirationChange")

        fun asVoid(): Void = void.getOrThrow("void")

        fun asAmendment(): Amendment = amendment.getOrThrow("amendment")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                increment != null -> visitor.visitIncrement(increment)
                decrement != null -> visitor.visitDecrement(decrement)
                expirationChange != null -> visitor.visitExpirationChange(expirationChange)
                void != null -> visitor.visitVoid(void)
                amendment != null -> visitor.visitAmendment(amendment)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

                    override fun visitVoid(void: Void) {
                        void.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

                    override fun visitVoid(void: Void) = void.validity()

                    override fun visitAmendment(amendment: Amendment) = amendment.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && increment == other.increment && decrement == other.decrement && expirationChange == other.expirationChange && void == other.void && amendment == other.amendment /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(increment, decrement, expirationChange, void, amendment) /* spotless:on */

        override fun toString(): String =
            when {
                increment != null -> "Body{increment=$increment}"
                decrement != null -> "Body{decrement=$decrement}"
                expirationChange != null -> "Body{expirationChange=$expirationChange}"
                void != null -> "Body{void=$void}"
                amendment != null -> "Body{amendment=$amendment}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofIncrement(increment: Increment) = Body(increment = increment)

            fun ofDecrement(decrement: Decrement) = Body(decrement = decrement)

            fun ofExpirationChange(expirationChange: ExpirationChange) =
                Body(expirationChange = expirationChange)

            fun ofVoid(void: Void) = Body(void = void)

            fun ofAmendment(amendment: Amendment) = Body(amendment = amendment)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIncrement(increment: Increment): T

            fun visitDecrement(decrement: Decrement): T

            fun visitExpirationChange(expirationChange: ExpirationChange): T

            fun visitVoid(void: Void): T

            fun visitAmendment(amendment: Amendment): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val entryType = json.asObject()?.get("entry_type")?.asString()

                when (entryType) {
                    "increment" -> {
                        return tryDeserialize(node, jacksonTypeRef<Increment>())?.let {
                            Body(increment = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "decrement" -> {
                        return tryDeserialize(node, jacksonTypeRef<Decrement>())?.let {
                            Body(decrement = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "expiration_change" -> {
                        return tryDeserialize(node, jacksonTypeRef<ExpirationChange>())?.let {
                            Body(expirationChange = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "void" -> {
                        return tryDeserialize(node, jacksonTypeRef<Void>())?.let {
                            Body(void = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "amendment" -> {
                        return tryDeserialize(node, jacksonTypeRef<Amendment>())?.let {
                            Body(amendment = it, _json = json)
                        } ?: Body(_json = json)
                    }
                }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.increment != null -> generator.writeObject(value.increment)
                    value.decrement != null -> generator.writeObject(value.decrement)
                    value.expirationChange != null -> generator.writeObject(value.expirationChange)
                    value.void != null -> generator.writeObject(value.void)
                    value.amendment != null -> generator.writeObject(value.amendment)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class Increment
        private constructor(
            private val amount: JsonField<Double>,
            private val entryType: JsonValue,
            private val currency: JsonField<String>,
            private val description: JsonField<String>,
            private val effectiveDate: JsonField<OffsetDateTime>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val invoiceSettings: JsonField<InvoiceSettings>,
            private val metadata: JsonField<Metadata>,
            private val perUnitCostBasis: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("invoice_settings")
                @ExcludeMissing
                invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("per_unit_cost_basis")
                @ExcludeMissing
                perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                entryType,
                currency,
                description,
                effectiveDate,
                expiryDate,
                invoiceSettings,
                metadata,
                perUnitCostBasis,
                mutableMapOf(),
            )

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

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
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun effectiveDate(): OffsetDateTime? = effectiveDate.getNullable("effective_date")

            /**
             * An ISO 8601 format date that denotes when this credit balance should expire.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceSettings(): InvoiceSettings? =
                invoiceSettings.getNullable("invoice_settings")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

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
             * Returns the raw JSON value of [invoiceSettings].
             *
             * Unlike [invoiceSettings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_settings")
            @ExcludeMissing
            fun _invoiceSettings(): JsonField<InvoiceSettings> = invoiceSettings

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [Increment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Increment]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var entryType: JsonValue = JsonValue.from("increment")
                private var currency: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(increment: Increment) = apply {
                    amount = increment.amount
                    entryType = increment.entryType
                    currency = increment.currency
                    description = increment.description
                    effectiveDate = increment.effectiveDate
                    expiryDate = increment.expiryDate
                    invoiceSettings = increment.invoiceSettings
                    metadata = increment.metadata
                    perUnitCostBasis = increment.perUnitCostBasis
                    additionalProperties = increment.additionalProperties.toMutableMap()
                }

                /**
                 * The number of credits to effect. Note that this is required for increment,
                 * decrement, void, or undo operations.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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

                /**
                 * The currency or custom pricing unit to use for this ledger entry. If this is a
                 * real-world currency, it must match the customer's invoicing currency.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Optional metadata that can be specified when adding ledger results via the API.
                 * For example, this can be used to note an increment refers to trial credits, or
                 * for noting corrections as a result of an incident, etc.
                 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * An ISO 8601 format date that denotes when this credit balance should become
                 * available for use.
                 */
                fun effectiveDate(effectiveDate: OffsetDateTime?) =
                    effectiveDate(JsonField.ofNullable(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An ISO 8601 format date that denotes when this credit balance should expire. */
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

                /**
                 * Passing `invoice_settings` automatically generates an invoice for the newly added
                 * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis,
                 * as the calculation of the invoice total is done on that basis.
                 */
                fun invoiceSettings(invoiceSettings: InvoiceSettings?) =
                    invoiceSettings(JsonField.ofNullable(invoiceSettings))

                /**
                 * Sets [Builder.invoiceSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceSettings] with a well-typed
                 * [InvoiceSettings] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
                    this.invoiceSettings = invoiceSettings
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * Can only be specified when entry_type=increment. How much, in the customer's
                 * currency, a customer paid for a single credit in this block
                 */
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
                 * Returns an immutable instance of [Increment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Increment =
                    Increment(
                        checkRequired("amount", amount),
                        entryType,
                        currency,
                        description,
                        effectiveDate,
                        expiryDate,
                        invoiceSettings,
                        metadata,
                        perUnitCostBasis,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Increment = apply {
                if (validated) {
                    return@apply
                }

                amount()
                _entryType().let {
                    if (it != JsonValue.from("increment")) {
                        throw OrbInvalidDataException("'entryType' is invalid, received $it")
                    }
                }
                currency()
                description()
                effectiveDate()
                expiryDate()
                invoiceSettings()?.validate()
                metadata()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    entryType.let { if (it == JsonValue.from("increment")) 1 else 0 } +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (effectiveDate.asKnown() == null) 0 else 1) +
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (invoiceSettings.asKnown()?.validity() ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (perUnitCostBasis.asKnown() == null) 0 else 1)

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            class InvoiceSettings
            private constructor(
                private val autoCollection: JsonField<Boolean>,
                private val netTerms: JsonField<Long>,
                private val invoiceDate: JsonField<InvoiceDate>,
                private val memo: JsonField<String>,
                private val requireSuccessfulPayment: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("auto_collection")
                    @ExcludeMissing
                    autoCollection: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("net_terms")
                    @ExcludeMissing
                    netTerms: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("invoice_date")
                    @ExcludeMissing
                    invoiceDate: JsonField<InvoiceDate> = JsonMissing.of(),
                    @JsonProperty("memo")
                    @ExcludeMissing
                    memo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("require_successful_payment")
                    @ExcludeMissing
                    requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    autoCollection,
                    netTerms,
                    invoiceDate,
                    memo,
                    requireSuccessfulPayment,
                    mutableMapOf(),
                )

                /**
                 * Whether the credits purchase invoice should auto collect with the customer's
                 * saved payment method.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

                /**
                 * The net terms determines the difference between the invoice date and the issue
                 * date for the invoice. If you intend the invoice to be due on issue, set this
                 * to 0.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun netTerms(): Long? = netTerms.getNullable("net_terms")

                /**
                 * An ISO 8601 format date that denotes when this invoice should be dated in the
                 * customer's timezone. If not provided, the invoice date will default to the credit
                 * block's effective date.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceDate(): InvoiceDate? = invoiceDate.getNullable("invoice_date")

                /**
                 * An optional memo to display on the invoice.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun memo(): String? = memo.getNullable("memo")

                /**
                 * If true, the new credit block will require that the corresponding invoice is paid
                 * before it can be drawn down from.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun requireSuccessfulPayment(): Boolean? =
                    requireSuccessfulPayment.getNullable("require_successful_payment")

                /**
                 * Returns the raw JSON value of [autoCollection].
                 *
                 * Unlike [autoCollection], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("auto_collection")
                @ExcludeMissing
                fun _autoCollection(): JsonField<Boolean> = autoCollection

                /**
                 * Returns the raw JSON value of [netTerms].
                 *
                 * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("net_terms")
                @ExcludeMissing
                fun _netTerms(): JsonField<Long> = netTerms

                /**
                 * Returns the raw JSON value of [invoiceDate].
                 *
                 * Unlike [invoiceDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_date")
                @ExcludeMissing
                fun _invoiceDate(): JsonField<InvoiceDate> = invoiceDate

                /**
                 * Returns the raw JSON value of [memo].
                 *
                 * Unlike [memo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

                /**
                 * Returns the raw JSON value of [requireSuccessfulPayment].
                 *
                 * Unlike [requireSuccessfulPayment], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("require_successful_payment")
                @ExcludeMissing
                fun _requireSuccessfulPayment(): JsonField<Boolean> = requireSuccessfulPayment

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
                     * Returns a mutable builder for constructing an instance of [InvoiceSettings].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .autoCollection()
                     * .netTerms()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [InvoiceSettings]. */
                class Builder internal constructor() {

                    private var autoCollection: JsonField<Boolean>? = null
                    private var netTerms: JsonField<Long>? = null
                    private var invoiceDate: JsonField<InvoiceDate> = JsonMissing.of()
                    private var memo: JsonField<String> = JsonMissing.of()
                    private var requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(invoiceSettings: InvoiceSettings) = apply {
                        autoCollection = invoiceSettings.autoCollection
                        netTerms = invoiceSettings.netTerms
                        invoiceDate = invoiceSettings.invoiceDate
                        memo = invoiceSettings.memo
                        requireSuccessfulPayment = invoiceSettings.requireSuccessfulPayment
                        additionalProperties = invoiceSettings.additionalProperties.toMutableMap()
                    }

                    /**
                     * Whether the credits purchase invoice should auto collect with the customer's
                     * saved payment method.
                     */
                    fun autoCollection(autoCollection: Boolean) =
                        autoCollection(JsonField.of(autoCollection))

                    /**
                     * Sets [Builder.autoCollection] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.autoCollection] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                        this.autoCollection = autoCollection
                    }

                    /**
                     * The net terms determines the difference between the invoice date and the
                     * issue date for the invoice. If you intend the invoice to be due on issue, set
                     * this to 0.
                     */
                    fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

                    /**
                     * Alias for [Builder.netTerms].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

                    /**
                     * Sets [Builder.netTerms] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.netTerms] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

                    /**
                     * An ISO 8601 format date that denotes when this invoice should be dated in the
                     * customer's timezone. If not provided, the invoice date will default to the
                     * credit block's effective date.
                     */
                    fun invoiceDate(invoiceDate: InvoiceDate?) =
                        invoiceDate(JsonField.ofNullable(invoiceDate))

                    /**
                     * Sets [Builder.invoiceDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceDate] with a well-typed [InvoiceDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceDate(invoiceDate: JsonField<InvoiceDate>) = apply {
                        this.invoiceDate = invoiceDate
                    }

                    /** Alias for calling [invoiceDate] with `InvoiceDate.ofDate(date)`. */
                    fun invoiceDate(date: LocalDate) = invoiceDate(InvoiceDate.ofDate(date))

                    /** Alias for calling [invoiceDate] with `InvoiceDate.ofDateTime(dateTime)`. */
                    fun invoiceDate(dateTime: OffsetDateTime) =
                        invoiceDate(InvoiceDate.ofDateTime(dateTime))

                    /** An optional memo to display on the invoice. */
                    fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

                    /**
                     * Sets [Builder.memo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.memo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                    /**
                     * If true, the new credit block will require that the corresponding invoice is
                     * paid before it can be drawn down from.
                     */
                    fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) =
                        requireSuccessfulPayment(JsonField.of(requireSuccessfulPayment))

                    /**
                     * Sets [Builder.requireSuccessfulPayment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requireSuccessfulPayment] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun requireSuccessfulPayment(requireSuccessfulPayment: JsonField<Boolean>) =
                        apply {
                            this.requireSuccessfulPayment = requireSuccessfulPayment
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
                     * Returns an immutable instance of [InvoiceSettings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .autoCollection()
                     * .netTerms()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InvoiceSettings =
                        InvoiceSettings(
                            checkRequired("autoCollection", autoCollection),
                            checkRequired("netTerms", netTerms),
                            invoiceDate,
                            memo,
                            requireSuccessfulPayment,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InvoiceSettings = apply {
                    if (validated) {
                        return@apply
                    }

                    autoCollection()
                    netTerms()
                    invoiceDate()?.validate()
                    memo()
                    requireSuccessfulPayment()
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
                    (if (autoCollection.asKnown() == null) 0 else 1) +
                        (if (netTerms.asKnown() == null) 0 else 1) +
                        (invoiceDate.asKnown()?.validity() ?: 0) +
                        (if (memo.asKnown() == null) 0 else 1) +
                        (if (requireSuccessfulPayment.asKnown() == null) 0 else 1)

                /**
                 * An ISO 8601 format date that denotes when this invoice should be dated in the
                 * customer's timezone. If not provided, the invoice date will default to the credit
                 * block's effective date.
                 */
                @JsonDeserialize(using = InvoiceDate.Deserializer::class)
                @JsonSerialize(using = InvoiceDate.Serializer::class)
                class InvoiceDate
                private constructor(
                    private val date: LocalDate? = null,
                    private val dateTime: OffsetDateTime? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun date(): LocalDate? = date

                    fun dateTime(): OffsetDateTime? = dateTime

                    fun isDate(): Boolean = date != null

                    fun isDateTime(): Boolean = dateTime != null

                    fun asDate(): LocalDate = date.getOrThrow("date")

                    fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            date != null -> visitor.visitDate(date)
                            dateTime != null -> visitor.visitDateTime(dateTime)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): InvoiceDate = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitDate(date: LocalDate) {}

                                override fun visitDateTime(dateTime: OffsetDateTime) {}
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
                                override fun visitDate(date: LocalDate) = 1

                                override fun visitDateTime(dateTime: OffsetDateTime) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InvoiceDate && date == other.date && dateTime == other.dateTime /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(date, dateTime) /* spotless:on */

                    override fun toString(): String =
                        when {
                            date != null -> "InvoiceDate{date=$date}"
                            dateTime != null -> "InvoiceDate{dateTime=$dateTime}"
                            _json != null -> "InvoiceDate{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid InvoiceDate")
                        }

                    companion object {

                        fun ofDate(date: LocalDate) = InvoiceDate(date = date)

                        fun ofDateTime(dateTime: OffsetDateTime) = InvoiceDate(dateTime = dateTime)
                    }

                    /**
                     * An interface that defines how to map each variant of [InvoiceDate] to a value
                     * of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitDate(date: LocalDate): T

                        fun visitDateTime(dateTime: OffsetDateTime): T

                        /**
                         * Maps an unknown variant of [InvoiceDate] to a value of type [T].
                         *
                         * An instance of [InvoiceDate] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws OrbInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw OrbInvalidDataException("Unknown InvoiceDate: $json")
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<InvoiceDate>(InvoiceDate::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): InvoiceDate {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<LocalDate>())?.let {
                                            InvoiceDate(date = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())
                                            ?.let { InvoiceDate(dateTime = it, _json = json) },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> InvoiceDate(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<InvoiceDate>(InvoiceDate::class) {

                        override fun serialize(
                            value: InvoiceDate,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.date != null -> generator.writeObject(value.date)
                                value.dateTime != null -> generator.writeObject(value.dateTime)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid InvoiceDate")
                            }
                        }
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceSettings && autoCollection == other.autoCollection && netTerms == other.netTerms && invoiceDate == other.invoiceDate && memo == other.memo && requireSuccessfulPayment == other.requireSuccessfulPayment && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(autoCollection, netTerms, invoiceDate, memo, requireSuccessfulPayment, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, invoiceDate=$invoiceDate, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

                return /* spotless:off */ other is Increment && amount == other.amount && entryType == other.entryType && currency == other.currency && description == other.description && effectiveDate == other.effectiveDate && expiryDate == other.expiryDate && invoiceSettings == other.invoiceSettings && metadata == other.metadata && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, entryType, currency, description, effectiveDate, expiryDate, invoiceSettings, metadata, perUnitCostBasis, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Increment{amount=$amount, entryType=$entryType, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiryDate=$expiryDate, invoiceSettings=$invoiceSettings, metadata=$metadata, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
        }

        class Decrement
        private constructor(
            private val amount: JsonField<Double>,
            private val entryType: JsonValue,
            private val currency: JsonField<String>,
            private val description: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(amount, entryType, currency, description, metadata, mutableMapOf())

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

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
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * .amount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Decrement]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var entryType: JsonValue = JsonValue.from("decrement")
                private var currency: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decrement: Decrement) = apply {
                    amount = decrement.amount
                    entryType = decrement.entryType
                    currency = decrement.currency
                    description = decrement.description
                    metadata = decrement.metadata
                    additionalProperties = decrement.additionalProperties.toMutableMap()
                }

                /**
                 * The number of credits to effect. Note that this is required for increment,
                 * decrement, void, or undo operations.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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

                /**
                 * The currency or custom pricing unit to use for this ledger entry. If this is a
                 * real-world currency, it must match the customer's invoicing currency.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Optional metadata that can be specified when adding ledger results via the API.
                 * For example, this can be used to note an increment refers to trial credits, or
                 * for noting corrections as a result of an incident, etc.
                 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [Decrement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Decrement =
                    Decrement(
                        checkRequired("amount", amount),
                        entryType,
                        currency,
                        description,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Decrement = apply {
                if (validated) {
                    return@apply
                }

                amount()
                _entryType().let {
                    if (it != JsonValue.from("decrement")) {
                        throw OrbInvalidDataException("'entryType' is invalid, received $it")
                    }
                }
                currency()
                description()
                metadata()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    entryType.let { if (it == JsonValue.from("decrement")) 1 else 0 } +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

                return /* spotless:off */ other is Decrement && amount == other.amount && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, entryType, currency, description, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Decrement{amount=$amount, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class ExpirationChange
        private constructor(
            private val entryType: JsonValue,
            private val targetExpiryDate: JsonField<LocalDate>,
            private val amount: JsonField<Double>,
            private val blockId: JsonField<String>,
            private val currency: JsonField<String>,
            private val description: JsonField<String>,
            private val expiryDate: JsonField<OffsetDateTime>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
                @JsonProperty("target_expiry_date")
                @ExcludeMissing
                targetExpiryDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("block_id")
                @ExcludeMissing
                blockId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_date")
                @ExcludeMissing
                expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                entryType,
                targetExpiryDate,
                amount,
                blockId,
                currency,
                description,
                expiryDate,
                metadata,
                mutableMapOf(),
            )

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
             * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting
             * when credits transferred (as part of a partial block expiration) should expire.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun targetExpiryDate(): LocalDate = targetExpiryDate.getRequired("target_expiry_date")

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun amount(): Double? = amount.getNullable("amount")

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun blockId(): String? = blockId.getNullable("block_id")

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * An ISO 8601 format date that identifies the origination credit block to expire
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [targetExpiryDate].
             *
             * Unlike [targetExpiryDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("target_expiry_date")
            @ExcludeMissing
            fun _targetExpiryDate(): JsonField<LocalDate> = targetExpiryDate

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [blockId].
             *
             * Unlike [blockId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * .targetExpiryDate()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ExpirationChange]. */
            class Builder internal constructor() {

                private var entryType: JsonValue = JsonValue.from("expiration_change")
                private var targetExpiryDate: JsonField<LocalDate>? = null
                private var amount: JsonField<Double> = JsonMissing.of()
                private var blockId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(expirationChange: ExpirationChange) = apply {
                    entryType = expirationChange.entryType
                    targetExpiryDate = expirationChange.targetExpiryDate
                    amount = expirationChange.amount
                    blockId = expirationChange.blockId
                    currency = expirationChange.currency
                    description = expirationChange.description
                    expiryDate = expirationChange.expiryDate
                    metadata = expirationChange.metadata
                    additionalProperties = expirationChange.additionalProperties.toMutableMap()
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

                /**
                 * A future date (specified in YYYY-MM-DD format) used for expiration change,
                 * denoting when credits transferred (as part of a partial block expiration) should
                 * expire.
                 */
                fun targetExpiryDate(targetExpiryDate: LocalDate) =
                    targetExpiryDate(JsonField.of(targetExpiryDate))

                /**
                 * Sets [Builder.targetExpiryDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.targetExpiryDate] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun targetExpiryDate(targetExpiryDate: JsonField<LocalDate>) = apply {
                    this.targetExpiryDate = targetExpiryDate
                }

                /**
                 * The number of credits to effect. Note that this is required for increment,
                 * decrement, void, or undo operations.
                 */
                fun amount(amount: Double?) = amount(JsonField.ofNullable(amount))

                /**
                 * Alias for [Builder.amount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amount(amount: Double) = amount(amount as Double?)

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /**
                 * The ID of the block affected by an expiration_change, used to differentiate
                 * between multiple blocks with the same `expiry_date`.
                 */
                fun blockId(blockId: String?) = blockId(JsonField.ofNullable(blockId))

                /**
                 * Sets [Builder.blockId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                /**
                 * The currency or custom pricing unit to use for this ledger entry. If this is a
                 * real-world currency, it must match the customer's invoicing currency.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Optional metadata that can be specified when adding ledger results via the API.
                 * For example, this can be used to note an increment refers to trial credits, or
                 * for noting corrections as a result of an incident, etc.
                 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * An ISO 8601 format date that identifies the origination credit block to expire
                 */
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

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [ExpirationChange].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .targetExpiryDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExpirationChange =
                    ExpirationChange(
                        entryType,
                        checkRequired("targetExpiryDate", targetExpiryDate),
                        amount,
                        blockId,
                        currency,
                        description,
                        expiryDate,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExpirationChange = apply {
                if (validated) {
                    return@apply
                }

                _entryType().let {
                    if (it != JsonValue.from("expiration_change")) {
                        throw OrbInvalidDataException("'entryType' is invalid, received $it")
                    }
                }
                targetExpiryDate()
                amount()
                blockId()
                currency()
                description()
                expiryDate()
                metadata()?.validate()
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
                entryType.let { if (it == JsonValue.from("expiration_change")) 1 else 0 } +
                    (if (targetExpiryDate.asKnown() == null) 0 else 1) +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (if (blockId.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (expiryDate.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

                return /* spotless:off */ other is ExpirationChange && entryType == other.entryType && targetExpiryDate == other.targetExpiryDate && amount == other.amount && blockId == other.blockId && currency == other.currency && description == other.description && expiryDate == other.expiryDate && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(entryType, targetExpiryDate, amount, blockId, currency, description, expiryDate, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpirationChange{entryType=$entryType, targetExpiryDate=$targetExpiryDate, amount=$amount, blockId=$blockId, currency=$currency, description=$description, expiryDate=$expiryDate, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class Void
        private constructor(
            private val amount: JsonField<Double>,
            private val blockId: JsonField<String>,
            private val entryType: JsonValue,
            private val currency: JsonField<String>,
            private val description: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val voidReason: JsonField<VoidReason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("block_id")
                @ExcludeMissing
                blockId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("void_reason")
                @ExcludeMissing
                voidReason: JsonField<VoidReason> = JsonMissing.of(),
            ) : this(
                amount,
                blockId,
                entryType,
                currency,
                description,
                metadata,
                voidReason,
                mutableMapOf(),
            )

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The ID of the block to void.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun blockId(): String = blockId.getRequired("block_id")

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
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Can only be specified when `entry_type=void`. The reason for the void.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun voidReason(): VoidReason? = voidReason.getNullable("void_reason")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [blockId].
             *
             * Unlike [blockId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [voidReason].
             *
             * Unlike [voidReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("void_reason")
            @ExcludeMissing
            fun _voidReason(): JsonField<VoidReason> = voidReason

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
                 * .amount()
                 * .blockId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Void]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var blockId: JsonField<String>? = null
                private var entryType: JsonValue = JsonValue.from("void")
                private var currency: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var voidReason: JsonField<VoidReason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(void: Void) = apply {
                    amount = void.amount
                    blockId = void.blockId
                    entryType = void.entryType
                    currency = void.currency
                    description = void.description
                    metadata = void.metadata
                    voidReason = void.voidReason
                    additionalProperties = void.additionalProperties.toMutableMap()
                }

                /**
                 * The number of credits to effect. Note that this is required for increment,
                 * decrement, void, or undo operations.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The ID of the block to void. */
                fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                /**
                 * Sets [Builder.blockId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

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

                /**
                 * The currency or custom pricing unit to use for this ledger entry. If this is a
                 * real-world currency, it must match the customer's invoicing currency.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Optional metadata that can be specified when adding ledger results via the API.
                 * For example, this can be used to note an increment refers to trial credits, or
                 * for noting corrections as a result of an incident, etc.
                 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Can only be specified when `entry_type=void`. The reason for the void. */
                fun voidReason(voidReason: VoidReason?) =
                    voidReason(JsonField.ofNullable(voidReason))

                /**
                 * Sets [Builder.voidReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voidReason] with a well-typed [VoidReason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun voidReason(voidReason: JsonField<VoidReason>) = apply {
                    this.voidReason = voidReason
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
                 * Returns an immutable instance of [Void].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .blockId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Void =
                    Void(
                        checkRequired("amount", amount),
                        checkRequired("blockId", blockId),
                        entryType,
                        currency,
                        description,
                        metadata,
                        voidReason,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Void = apply {
                if (validated) {
                    return@apply
                }

                amount()
                blockId()
                _entryType().let {
                    if (it != JsonValue.from("void")) {
                        throw OrbInvalidDataException("'entryType' is invalid, received $it")
                    }
                }
                currency()
                description()
                metadata()?.validate()
                voidReason()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (blockId.asKnown() == null) 0 else 1) +
                    entryType.let { if (it == JsonValue.from("void")) 1 else 0 } +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (voidReason.asKnown()?.validity() ?: 0)

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            class VoidReason
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

                    val REFUND = of("refund")

                    fun of(value: String) = VoidReason(JsonField.of(value))
                }

                /** An enum containing [VoidReason]'s known values. */
                enum class Known {
                    REFUND
                }

                /**
                 * An enum containing [VoidReason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [VoidReason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REFUND,
                    /**
                     * An enum member indicating that [VoidReason] was instantiated with an unknown
                     * value.
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
                        REFUND -> Value.REFUND
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
                        REFUND -> Known.REFUND
                        else -> throw OrbInvalidDataException("Unknown VoidReason: $value")
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

                fun validate(): VoidReason = apply {
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

                    return /* spotless:off */ other is VoidReason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Void && amount == other.amount && blockId == other.blockId && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, blockId, entryType, currency, description, metadata, voidReason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Void{amount=$amount, blockId=$blockId, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, voidReason=$voidReason, additionalProperties=$additionalProperties}"
        }

        class Amendment
        private constructor(
            private val amount: JsonField<Double>,
            private val blockId: JsonField<String>,
            private val entryType: JsonValue,
            private val currency: JsonField<String>,
            private val description: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("block_id")
                @ExcludeMissing
                blockId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entry_type") @ExcludeMissing entryType: JsonValue = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(amount, blockId, entryType, currency, description, metadata, mutableMapOf())

            /**
             * The number of credits to effect. Note that this is required for increment, decrement
             * or void operations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * The ID of the block to reverse a decrement from.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun blockId(): String = blockId.getRequired("block_id")

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
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [blockId].
             *
             * Unlike [blockId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * .amount()
                 * .blockId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Amendment]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var blockId: JsonField<String>? = null
                private var entryType: JsonValue = JsonValue.from("amendment")
                private var currency: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amendment: Amendment) = apply {
                    amount = amendment.amount
                    blockId = amendment.blockId
                    entryType = amendment.entryType
                    currency = amendment.currency
                    description = amendment.description
                    metadata = amendment.metadata
                    additionalProperties = amendment.additionalProperties.toMutableMap()
                }

                /**
                 * The number of credits to effect. Note that this is required for increment,
                 * decrement or void operations.
                 */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The ID of the block to reverse a decrement from. */
                fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                /**
                 * Sets [Builder.blockId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

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

                /**
                 * The currency or custom pricing unit to use for this ledger entry. If this is a
                 * real-world currency, it must match the customer's invoicing currency.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Optional metadata that can be specified when adding ledger results via the API.
                 * For example, this can be used to note an increment refers to trial credits, or
                 * for noting corrections as a result of an incident, etc.
                 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [Amendment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .blockId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Amendment =
                    Amendment(
                        checkRequired("amount", amount),
                        checkRequired("blockId", blockId),
                        entryType,
                        currency,
                        description,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Amendment = apply {
                if (validated) {
                    return@apply
                }

                amount()
                blockId()
                _entryType().let {
                    if (it != JsonValue.from("amendment")) {
                        throw OrbInvalidDataException("'entryType' is invalid, received $it")
                    }
                }
                currency()
                description()
                metadata()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (blockId.asKnown() == null) 0 else 1) +
                    entryType.let { if (it == JsonValue.from("amendment")) 1 else 0 } +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

                return /* spotless:off */ other is Amendment && amount == other.amount && blockId == other.blockId && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, blockId, entryType, currency, description, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Amendment{amount=$amount, blockId=$blockId, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryByExternalIdParams && externalCustomerId == other.externalCustomerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerCreateEntryByExternalIdParams{externalCustomerId=$externalCustomerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
