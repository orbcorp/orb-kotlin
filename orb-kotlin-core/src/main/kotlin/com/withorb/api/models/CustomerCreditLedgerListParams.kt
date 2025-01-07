// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * The credits ledger provides _auditing_ functionality over Orb's credits system with a list of
 * actions that have taken place to modify a customer's credit balance. This
 * [paginated endpoint](../reference/pagination) lists these entries, starting from the most recent
 * ledger entry.
 *
 * More details on using Orb's real-time credit feature are
 * [here](../guides/product-catalog/prepurchase.md).
 *
 * There are four major types of modifications to credit balance, detailed below.
 *
 * ## Increment
 *
 * Credits (which optionally expire on a future date) can be added via the API ([Add Ledger
 * Entry](create-ledger-entry)). The ledger entry for such an action will always contain the total
 * eligible starting and ending balance for the customer at the time the entry was added to the
 * ledger.
 *
 * ## Decrement
 *
 * Deductions can occur as a result of an API call to create a ledger entry (see
 * [Add Ledger Entry](create-ledger-entry)), or automatically as a result of incurring usage. Both
 * ledger entries present the `decrement` entry type.
 *
 * As usage for a customer is reported into Orb, credits may be deducted according to the customer's
 * plan configuration. An automated deduction of this type will result in a ledger entry, also with
 * a starting and ending balance. In order to provide better tracing capabilities for automatic
 * deductions, Orb always associates each automatic deduction with the `event_id` at the time of
 * ingestion, used to pinpoint _why_ credit deduction took place and to ensure that credits are
 * never deducted without an associated usage event.
 *
 * By default, Orb uses an algorithm that automatically deducts from the _soonest expiring credit
 * block_ first in order to ensure that all credits are utilized appropriately. As an example, if
 * trial credits with an expiration date of 2 weeks from now are present for a customer, they will
 * be used before any deductions take place from a non-expiring credit block.
 *
 * If there are multiple blocks with the same expiration date, Orb will deduct from the block with
 * the _lower cost basis_ first (e.g. trial credits with a $0 cost basis before paid credits with a
 * $5.00 cost basis).
 *
 * It's also possible for a single usage event's deduction to _span_ credit blocks. In this case,
 * Orb will deduct from the next block, ending at the credit block which consists of unexpiring
 * credits. Each of these deductions will lead to a _separate_ ledger entry, one per credit block
 * that is deducted from. By default, the customer's total credit balance in Orb can be negative as
 * a result of a decrement.
 *
 * ## Expiration change
 *
 * The expiry of credits can be changed as a result of the API (See
 * [Add Ledger Entry](create-ledger-entry)). This will create a ledger entry that specifies the
 * balance as well as the initial and target expiry dates.
 *
 * Note that for this entry type, `starting_balance` will equal `ending_balance`, and the `amount`
 * represents the balance transferred. The credit block linked to the ledger entry is the source
 * credit block from which there was an expiration change
 *
 * ## Credits expiry
 *
 * When a set of credits expire on pre-set expiration date, the customer's balance automatically
 * reflects this change and adds an entry to the ledger indicating this event. Note that credit
 * expiry should always happen close to a date boundary in the customer's timezone.
 *
 * ## Void initiated
 *
 * Credit blocks can be voided via the API. The `amount` on this entry corresponds to the number of
 * credits that were remaining in the block at time of void. `void_reason` will be populated if the
 * void is created with a reason.
 *
 * ## Void
 *
 * When a set of credits is voided, the customer's balance automatically reflects this change and
 * adds an entry to the ledger indicating this event.
 *
 * ## Amendment
 *
 * When credits are added to a customer's balance as a result of a correction, this entry will be
 * added to the ledger to indicate the adjustment of credits.
 */
class CustomerCreditLedgerListParams
constructor(
    private val customerId: String,
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val currency: String?,
    private val cursor: String?,
    private val entryStatus: EntryStatus?,
    private val entryType: EntryType?,
    private val limit: Long?,
    private val minimumAmount: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    /** The ledger currency or custom pricing unit to use. */
    fun currency(): String? = currency

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): String? = cursor

    fun entryStatus(): EntryStatus? = entryStatus

    fun entryType(): EntryType? = entryType

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Long? = limit

    fun minimumAmount(): String? = minimumAmount

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAtGt?.let {
            queryParams.put(
                "created_at[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtGte?.let {
            queryParams.put(
                "created_at[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLt?.let {
            queryParams.put(
                "created_at[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLte?.let {
            queryParams.put(
                "created_at[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.currency?.let { queryParams.put("currency", listOf(it.toString())) }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.entryStatus?.let { queryParams.put("entry_status", listOf(it.toString())) }
        this.entryType?.let { queryParams.put("entry_type", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.minimumAmount?.let { queryParams.put("minimum_amount", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var currency: String? = null
        private var cursor: String? = null
        private var entryStatus: EntryStatus? = null
        private var entryType: EntryType? = null
        private var limit: Long? = null
        private var minimumAmount: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCreditLedgerListParams: CustomerCreditLedgerListParams) = apply {
            customerId = customerCreditLedgerListParams.customerId
            createdAtGt = customerCreditLedgerListParams.createdAtGt
            createdAtGte = customerCreditLedgerListParams.createdAtGte
            createdAtLt = customerCreditLedgerListParams.createdAtLt
            createdAtLte = customerCreditLedgerListParams.createdAtLte
            currency = customerCreditLedgerListParams.currency
            cursor = customerCreditLedgerListParams.cursor
            entryStatus = customerCreditLedgerListParams.entryStatus
            entryType = customerCreditLedgerListParams.entryType
            limit = customerCreditLedgerListParams.limit
            minimumAmount = customerCreditLedgerListParams.minimumAmount
            additionalHeaders = customerCreditLedgerListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreditLedgerListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun createdAtGt(createdAtGt: OffsetDateTime?) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime?) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String?) = apply { this.currency = currency }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        fun entryStatus(entryStatus: EntryStatus?) = apply { this.entryStatus = entryStatus }

        fun entryType(entryType: EntryType?) = apply { this.entryType = entryType }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = limit(limit as Long?)

        fun minimumAmount(minimumAmount: String?) = apply { this.minimumAmount = minimumAmount }

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

        fun build(): CustomerCreditLedgerListParams =
            CustomerCreditLedgerListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                currency,
                cursor,
                entryStatus,
                entryType,
                limit,
                minimumAmount,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

            val DECREMENT = of("decrement")

            val EXPIRATION_CHANGE = of("expiration_change")

            val CREDIT_BLOCK_EXPIRY = of("credit_block_expiry")

            val VOID = of("void")

            val VOID_INITIATED = of("void_initiated")

            val AMENDMENT = of("amendment")

            fun of(value: String) = EntryType(JsonField.of(value))
        }

        enum class Known {
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
        }

        enum class Value {
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCREMENT -> Value.INCREMENT
                DECREMENT -> Value.DECREMENT
                EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
                CREDIT_BLOCK_EXPIRY -> Value.CREDIT_BLOCK_EXPIRY
                VOID -> Value.VOID
                VOID_INITIATED -> Value.VOID_INITIATED
                AMENDMENT -> Value.AMENDMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCREMENT -> Known.INCREMENT
                DECREMENT -> Known.DECREMENT
                EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                CREDIT_BLOCK_EXPIRY -> Known.CREDIT_BLOCK_EXPIRY
                VOID -> Known.VOID
                VOID_INITIATED -> Known.VOID_INITIATED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListParams && customerId == other.customerId && createdAtGt == other.createdAtGt && createdAtGte == other.createdAtGte && createdAtLt == other.createdAtLt && createdAtLte == other.createdAtLte && currency == other.currency && cursor == other.cursor && entryStatus == other.entryStatus && entryType == other.entryType && limit == other.limit && minimumAmount == other.minimumAmount && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, createdAtGt, createdAtGte, createdAtLt, createdAtLte, currency, cursor, entryStatus, entryType, limit, minimumAmount, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListParams{customerId=$customerId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, currency=$currency, cursor=$cursor, entryStatus=$entryStatus, entryType=$entryType, limit=$limit, minimumAmount=$minimumAmount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
