// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

interface ItemServiceAsync {

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    suspend fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint can be used to update properties on the Item. */
    suspend fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    suspend fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPageAsync

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    suspend fun list(requestOptions: RequestOptions): ItemListPageAsync =
        list(ItemListParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    suspend fun fetch(
        params: ItemFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item
}
