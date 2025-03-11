// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    suspend fun create(params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Item

    /** This endpoint can be used to update properties on the Item. */
    suspend fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Item

    /**
     * This endpoint returns a list of all Items, ordered in descending order by
     * creation time.
     */
    suspend fun list(params: ItemListParams = ItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ItemListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ItemListPageAsync = list(ItemListParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    suspend fun fetch(params: ItemFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Item

    /**
     * A view of [ItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the
         * same as [ItemServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: ItemListParams = ItemListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ItemListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ItemListPageAsync> = list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the
         * same as [ItemServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(params: ItemFetchParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Item>
    }
}
