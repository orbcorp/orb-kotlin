// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint can be used to update properties on the Item. */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ItemListPage =
        list(ItemListParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    fun fetch(params: ItemFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Item

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemService.create].
         */
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the same as
         * [ItemService.update].
         */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemService.list].
         */
        @MustBeClosed
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ItemListPage> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the same as
         * [ItemService.fetch].
         */
        @MustBeClosed
        fun fetch(
            params: ItemFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>
    }
}
