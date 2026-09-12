// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/** This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier. */
class InvoiceFetchParams
private constructor(
    private val invoiceId: String?,
    private val includeZeroQuantityLineItems: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invoiceId(): String? = invoiceId

    /**
     * Whether to return line items with a quantity of zero. When omitted, Orb returns every line
     * item. A line item that is grouped as part of a line item minimum is always returned; an
     * invoice-level minimum does not exempt it.
     */
    fun includeZeroQuantityLineItems(): Boolean? = includeZeroQuantityLineItems

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): InvoiceFetchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvoiceFetchParams]. */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceFetchParams]. */
    class Builder internal constructor() {

        private var invoiceId: String? = null
        private var includeZeroQuantityLineItems: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceFetchParams: InvoiceFetchParams) = apply {
            invoiceId = invoiceFetchParams.invoiceId
            includeZeroQuantityLineItems = invoiceFetchParams.includeZeroQuantityLineItems
            additionalHeaders = invoiceFetchParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceFetchParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String?) = apply { this.invoiceId = invoiceId }

        /**
         * Whether to return line items with a quantity of zero. When omitted, Orb returns every
         * line item. A line item that is grouped as part of a line item minimum is always returned;
         * an invoice-level minimum does not exempt it.
         */
        fun includeZeroQuantityLineItems(includeZeroQuantityLineItems: Boolean?) = apply {
            this.includeZeroQuantityLineItems = includeZeroQuantityLineItems
        }

        /**
         * Alias for [Builder.includeZeroQuantityLineItems].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeZeroQuantityLineItems(includeZeroQuantityLineItems: Boolean) =
            includeZeroQuantityLineItems(includeZeroQuantityLineItems as Boolean?)

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
         * Returns an immutable instance of [InvoiceFetchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvoiceFetchParams =
            InvoiceFetchParams(
                invoiceId,
                includeZeroQuantityLineItems,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invoiceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeZeroQuantityLineItems?.let {
                    put("include_zero_quantity_line_items", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceFetchParams &&
            invoiceId == other.invoiceId &&
            includeZeroQuantityLineItems == other.includeZeroQuantityLineItems &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            invoiceId,
            includeZeroQuantityLineItems,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvoiceFetchParams{invoiceId=$invoiceId, includeZeroQuantityLineItems=$includeZeroQuantityLineItems, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
