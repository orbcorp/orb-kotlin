// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.util.Objects

class CouponListParams
constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val redemptionCode: String?,
    private val showArchived: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun redemptionCode(): String? = redemptionCode

    fun showArchived(): Boolean? = showArchived

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.redemptionCode?.let { params.put("redemption_code", listOf(it.toString())) }
        this.showArchived?.let { params.put("show_archived", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponListParams && this.cursor == other.cursor && this.limit == other.limit && this.redemptionCode == other.redemptionCode && this.showArchived == other.showArchived && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cursor, limit, redemptionCode, showArchived, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CouponListParams{cursor=$cursor, limit=$limit, redemptionCode=$redemptionCode, showArchived=$showArchived, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cursor: String? = null
        private var limit: Long? = null
        private var redemptionCode: String? = null
        private var showArchived: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(couponListParams: CouponListParams) = apply {
            this.cursor = couponListParams.cursor
            this.limit = couponListParams.limit
            this.redemptionCode = couponListParams.redemptionCode
            this.showArchived = couponListParams.showArchived
            additionalQueryParams(couponListParams.additionalQueryParams)
            additionalHeaders(couponListParams.additionalHeaders)
        }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter to coupons matching this redemption code. */
        fun redemptionCode(redemptionCode: String) = apply { this.redemptionCode = redemptionCode }

        /**
         * Show archived coupons as well (by default, this endpoint only returns active coupons).
         */
        fun showArchived(showArchived: Boolean) = apply { this.showArchived = showArchived }

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

        fun build(): CouponListParams =
            CouponListParams(
                cursor,
                limit,
                redemptionCode,
                showArchived,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
