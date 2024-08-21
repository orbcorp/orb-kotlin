// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    fun currency(): String? = currency

    fun cursor(): String? = cursor

    fun entryStatus(): EntryStatus? = entryStatus

    fun entryType(): EntryType? = entryType

    fun limit(): Long? = limit

    fun minimumAmount(): String? = minimumAmount

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.createdAtGt?.let {
            params.put("created_at[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtGte?.let {
            params.put("created_at[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLt?.let {
            params.put("created_at[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLte?.let {
            params.put("created_at[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.currency?.let { params.put("currency", listOf(it.toString())) }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.entryStatus?.let { params.put("entry_status", listOf(it.toString())) }
        this.entryType?.let { params.put("entry_type", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.minimumAmount?.let { params.put("minimum_amount", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditLedgerListParams &&
            this.customerId == other.customerId &&
            this.createdAtGt == other.createdAtGt &&
            this.createdAtGte == other.createdAtGte &&
            this.createdAtLt == other.createdAtLt &&
            this.createdAtLte == other.createdAtLte &&
            this.currency == other.currency &&
            this.cursor == other.cursor &&
            this.entryStatus == other.entryStatus &&
            this.entryType == other.entryType &&
            this.limit == other.limit &&
            this.minimumAmount == other.minimumAmount &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            customerId,
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CustomerCreditLedgerListParams{customerId=$customerId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, currency=$currency, cursor=$cursor, entryStatus=$entryStatus, entryType=$entryType, limit=$limit, minimumAmount=$minimumAmount, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerCreditLedgerListParams: CustomerCreditLedgerListParams) = apply {
            this.customerId = customerCreditLedgerListParams.customerId
            this.createdAtGt = customerCreditLedgerListParams.createdAtGt
            this.createdAtGte = customerCreditLedgerListParams.createdAtGte
            this.createdAtLt = customerCreditLedgerListParams.createdAtLt
            this.createdAtLte = customerCreditLedgerListParams.createdAtLte
            this.currency = customerCreditLedgerListParams.currency
            this.cursor = customerCreditLedgerListParams.cursor
            this.entryStatus = customerCreditLedgerListParams.entryStatus
            this.entryType = customerCreditLedgerListParams.entryType
            this.limit = customerCreditLedgerListParams.limit
            this.minimumAmount = customerCreditLedgerListParams.minimumAmount
            additionalQueryParams(customerCreditLedgerListParams.additionalQueryParams)
            additionalHeaders(customerCreditLedgerListParams.additionalHeaders)
            additionalBodyProperties(customerCreditLedgerListParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        fun entryStatus(entryStatus: EntryStatus) = apply { this.entryStatus = entryStatus }

        fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun minimumAmount(minimumAmount: String) = apply { this.minimumAmount = minimumAmount }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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

            val DECREMENT = EntryType(JsonField.of("decrement"))

            val EXPIRATION_CHANGE = EntryType(JsonField.of("expiration_change"))

            val CREDIT_BLOCK_EXPIRY = EntryType(JsonField.of("credit_block_expiry"))

            val VOID = EntryType(JsonField.of("void"))

            val VOID_INITIATED = EntryType(JsonField.of("void_initiated"))

            val AMENDMENT = EntryType(JsonField.of("amendment"))

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
    }
}
