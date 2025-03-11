// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint returns a list of all coupons for an account in a list format.
 *
 * The list of coupons is ordered starting from the most recently created coupon.
 * The response also includes `pagination_metadata`, which lets the caller retrieve
 * the next page of results if they exist. More information about pagination can be
 * found in the Pagination-metadata schema.
 */
class CouponListParams private constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val redemptionCode: String?,
    private val showArchived: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned
     * from the initial request.
     */
    fun cursor(): String? = cursor

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Long? = limit

    /** Filter to coupons matching this redemption code. */
    fun redemptionCode(): String? = redemptionCode

    /**
     * Show archived coupons as well (by default, this endpoint only returns active
     * coupons).
     */
    fun showArchived(): Boolean? = showArchived

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
      val queryParams = QueryParams.builder()
      this.cursor?.let {
          queryParams.put(
            "cursor", listOf(it.toString())
          )
      }
      this.limit?.let {
          queryParams.put(
            "limit", listOf(it.toString())
          )
      }
      this.redemptionCode?.let {
          queryParams.put(
            "redemption_code", listOf(it.toString())
          )
      }
      this.showArchived?.let {
          queryParams.put(
            "show_archived", listOf(it.toString())
          )
      }
      queryParams.putAll(additionalQueryParams)
      return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CouponListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CouponListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CouponListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var cursor: String? = null
        private var limit: Long? = null
        private var redemptionCode: String? = null
        private var showArchived: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(couponListParams: CouponListParams) =
            apply {
                cursor = couponListParams.cursor
                limit = couponListParams.limit
                redemptionCode = couponListParams.redemptionCode
                showArchived = couponListParams.showArchived
                additionalHeaders = couponListParams.additionalHeaders.toBuilder()
                additionalQueryParams = couponListParams.additionalQueryParams.toBuilder()
            }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned
         * from the initial request.
         */
        fun cursor(cursor: String?) =
            apply {
                this.cursor = cursor
            }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) =
            apply {
                this.limit = limit
            }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Filter to coupons matching this redemption code. */
        fun redemptionCode(redemptionCode: String?) =
            apply {
                this.redemptionCode = redemptionCode
            }

        /**
         * Show archived coupons as well (by default, this endpoint only returns active
         * coupons).
         */
        fun showArchived(showArchived: Boolean?) =
            apply {
                this.showArchived = showArchived
            }

        /**
         * Show archived coupons as well (by default, this endpoint only returns active
         * coupons).
         */
        fun showArchived(showArchived: Boolean) = showArchived(showArchived as Boolean?)

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): CouponListParams =
            CouponListParams(
              cursor,
              limit,
              redemptionCode,
              showArchived,
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is CouponListParams && cursor == other.cursor && limit == other.limit && redemptionCode == other.redemptionCode && showArchived == other.showArchived && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cursor, limit, redemptionCode, showArchived, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "CouponListParams{cursor=$cursor, limit=$limit, redemptionCode=$redemptionCode, showArchived=$showArchived, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
