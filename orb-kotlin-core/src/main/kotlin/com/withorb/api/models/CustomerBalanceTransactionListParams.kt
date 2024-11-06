// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun customerId(): String = customerId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun operationTimeGt(): OffsetDateTime? = operationTimeGt

    fun operationTimeGte(): OffsetDateTime? = operationTimeGte

    fun operationTimeLt(): OffsetDateTime? = operationTimeLt

    fun operationTimeLte(): OffsetDateTime? = operationTimeLte

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListParams && this.customerId == other.customerId && this.cursor == other.cursor && this.limit == other.limit && this.operationTimeGt == other.operationTimeGt && this.operationTimeGte == other.operationTimeGte && this.operationTimeLt == other.operationTimeLt && this.operationTimeLte == other.operationTimeLte && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, cursor, limit, operationTimeGt, operationTimeGte, operationTimeLt, operationTimeLte, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CustomerBalanceTransactionListParams{customerId=$customerId, cursor=$cursor, limit=$limit, operationTimeGt=$operationTimeGt, operationTimeGte=$operationTimeGte, operationTimeLt=$operationTimeLt, operationTimeLte=$operationTimeLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

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
            additionalHeaders(customerBalanceTransactionListParams.additionalHeaders)
            additionalQueryParams(customerBalanceTransactionListParams.additionalQueryParams)
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

        fun build(): CustomerBalanceTransactionListParams =
            CustomerBalanceTransactionListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                cursor,
                limit,
                operationTimeGt,
                operationTimeGte,
                operationTimeLt,
                operationTimeLte,
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
}
