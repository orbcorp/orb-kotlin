// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.ItemService
import java.util.Objects

/** @see [ItemService.list] */
class ItemListPage
private constructor(
    private val service: ItemService,
    private val params: ItemListParams,
    private val response: ItemListPageResponse,
) {

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.data]
     */
    fun data(): List<Item> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): PaginationMetadata? =
        response._paginationMetadata().getNullable("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata()?.let { it._nextCursor().getNullable("next_cursor") } != null

    fun getNextPageParams(): ItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params
            .toBuilder()
            .apply {
                paginationMetadata()
                    ?.let { it._nextCursor().getNullable("next_cursor") }
                    ?.let { cursor(it) }
            }
            .build()
    }

    fun getNextPage(): ItemListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): ItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemListPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ItemListPage]. */
    class Builder internal constructor() {

        private var service: ItemService? = null
        private var params: ItemListParams? = null
        private var response: ItemListPageResponse? = null

        internal fun from(itemListPage: ItemListPage) = apply {
            service = itemListPage.service
            params = itemListPage.params
            response = itemListPage.response
        }

        fun service(service: ItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ItemListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ItemListPage =
            ItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ItemListPage) : Sequence<Item> {

        override fun iterator(): Iterator<Item> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "ItemListPage{service=$service, params=$params, response=$response}"
}
