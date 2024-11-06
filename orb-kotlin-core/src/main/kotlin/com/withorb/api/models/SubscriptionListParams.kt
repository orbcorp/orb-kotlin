// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class SubscriptionListParams
constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: List<String>?,
    private val externalCustomerId: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    fun cursor(): String? = cursor

    fun customerId(): List<String>? = customerId

    fun externalCustomerId(): String? = externalCustomerId

    fun limit(): Long? = limit

    fun status(): Status? = status

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.customerId?.let { params.put("customer_id[]", it.map(Any::toString)) }
        this.externalCustomerId?.let { params.put("external_customer_id", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionListParams && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.cursor == other.cursor && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.limit == other.limit && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, customerId, externalCustomerId, limit, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, limit=$limit, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: MutableList<String> = mutableListOf()
        private var externalCustomerId: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(subscriptionListParams: SubscriptionListParams) = apply {
            this.createdAtGt = subscriptionListParams.createdAtGt
            this.createdAtGte = subscriptionListParams.createdAtGte
            this.createdAtLt = subscriptionListParams.createdAtLt
            this.createdAtLte = subscriptionListParams.createdAtLte
            this.cursor = subscriptionListParams.cursor
            this.customerId(subscriptionListParams.customerId ?: listOf())
            this.externalCustomerId = subscriptionListParams.externalCustomerId
            this.limit = subscriptionListParams.limit
            this.status = subscriptionListParams.status
            additionalHeaders(subscriptionListParams.additionalHeaders)
            additionalQueryParams(subscriptionListParams.additionalQueryParams)
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        fun customerId(customerId: List<String>) = apply {
            this.customerId.clear()
            this.customerId.addAll(customerId)
        }

        fun addCustomerId(customerId: String) = apply { this.customerId.add(customerId) }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun status(status: Status) = apply { this.status = status }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): SubscriptionListParams =
            SubscriptionListParams(
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                if (customerId.size == 0) null else customerId.toImmutable(),
                externalCustomerId,
                limit,
                status,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val ENDED = Status(JsonField.of("ended"))

            val UPCOMING = Status(JsonField.of("upcoming"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ENDED -> Value.ENDED
                UPCOMING -> Value.UPCOMING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ENDED -> Known.ENDED
                UPCOMING -> Known.UPCOMING
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
