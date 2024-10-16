// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class CustomerBalanceTransactionListParams
constructor(
    private val customerId: String,
    private val cursor: String?,
    private val limit: Long?,
    private val operationTimeGt: OffsetDateTime?,
    private val operationTimeGte: OffsetDateTime?,
    private val operationTimeLt: OffsetDateTime?,
    private val operationTimeLte: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun customerId(): String = customerId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun operationTimeGt(): OffsetDateTime? = operationTimeGt

    fun operationTimeGte(): OffsetDateTime? = operationTimeGte

    fun operationTimeLt(): OffsetDateTime? = operationTimeLt

    fun operationTimeLte(): OffsetDateTime? = operationTimeLte

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.operationTimeGt?.let {
            params.put(
                "operation_time[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeGte?.let {
            params.put(
                "operation_time[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeLt?.let {
            params.put(
                "operation_time[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeLte?.let {
            params.put(
                "operation_time[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListParams && this.customerId == other.customerId && this.cursor == other.cursor && this.limit == other.limit && this.operationTimeGt == other.operationTimeGt && this.operationTimeGte == other.operationTimeGte && this.operationTimeLt == other.operationTimeLt && this.operationTimeLte == other.operationTimeLte && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, cursor, limit, operationTimeGt, operationTimeGte, operationTimeLt, operationTimeLte, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerBalanceTransactionListParams{customerId=$customerId, cursor=$cursor, limit=$limit, operationTimeGt=$operationTimeGt, operationTimeGte=$operationTimeGte, operationTimeLt=$operationTimeLt, operationTimeLte=$operationTimeLte, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var operationTimeGt: OffsetDateTime? = null
        private var operationTimeGte: OffsetDateTime? = null
        private var operationTimeLt: OffsetDateTime? = null
        private var operationTimeLte: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            customerBalanceTransactionListParams: CustomerBalanceTransactionListParams
        ) = apply {
            this.customerId = customerBalanceTransactionListParams.customerId
            this.cursor = customerBalanceTransactionListParams.cursor
            this.limit = customerBalanceTransactionListParams.limit
            this.operationTimeGt = customerBalanceTransactionListParams.operationTimeGt
            this.operationTimeGte = customerBalanceTransactionListParams.operationTimeGte
            this.operationTimeLt = customerBalanceTransactionListParams.operationTimeLt
            this.operationTimeLte = customerBalanceTransactionListParams.operationTimeLte
            additionalQueryParams(customerBalanceTransactionListParams.additionalQueryParams)
            additionalHeaders(customerBalanceTransactionListParams.additionalHeaders)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun operationTimeGt(operationTimeGt: OffsetDateTime) = apply {
            this.operationTimeGt = operationTimeGt
        }

        fun operationTimeGte(operationTimeGte: OffsetDateTime) = apply {
            this.operationTimeGte = operationTimeGte
        }

        fun operationTimeLt(operationTimeLt: OffsetDateTime) = apply {
            this.operationTimeLt = operationTimeLt
        }

        fun operationTimeLte(operationTimeLte: OffsetDateTime) = apply {
            this.operationTimeLte = operationTimeLte
        }

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

        fun build(): CustomerBalanceTransactionListParams =
            CustomerBalanceTransactionListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                cursor,
                limit,
                operationTimeGt,
                operationTimeGte,
                operationTimeLt,
                operationTimeLte,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
