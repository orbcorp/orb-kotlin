// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Item
import com.withorb.api.models.ItemArchiveParams
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemServiceAsync

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    suspend fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint can be used to update properties on the Item. */
    suspend fun update(
        itemId: String,
        params: ItemUpdateParams = ItemUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** @see update */
    suspend fun update(itemId: String, requestOptions: RequestOptions): Item =
        update(itemId, ItemUpdateParams.none(), requestOptions)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    suspend fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ItemListPageAsync =
        list(ItemListParams.none(), requestOptions)

    /** Archive item */
    suspend fun archive(
        itemId: String,
        params: ItemArchiveParams = ItemArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = archive(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: ItemArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** @see archive */
    suspend fun archive(itemId: String, requestOptions: RequestOptions): Item =
        archive(itemId, ItemArchiveParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    suspend fun fetch(
        itemId: String,
        params: ItemFetchParams = ItemFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see fetch */
    suspend fun fetch(
        params: ItemFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** @see fetch */
    suspend fun fetch(itemId: String, requestOptions: RequestOptions): Item =
        fetch(itemId, ItemFetchParams.none(), requestOptions)

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            itemId: String,
            params: ItemUpdateParams = ItemUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> = update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see update */
        @MustBeClosed
        suspend fun update(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            update(itemId, ItemUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ItemListPageAsync> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /items/{item_id}/archive`, but is otherwise the
         * same as [ItemServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            itemId: String,
            params: ItemArchiveParams = ItemArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> =
            archive(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: ItemArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see archive */
        @MustBeClosed
        suspend fun archive(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            archive(itemId, ItemArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            itemId: String,
            params: ItemFetchParams = ItemFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> = fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            params: ItemFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            fetch(itemId, ItemFetchParams.none(), requestOptions)
    }
}
