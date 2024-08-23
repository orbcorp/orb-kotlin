// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams

interface ItemService {

    /** This endpoint is used to create an [Item](../guides/concepts#item). */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Item

    /** This endpoint can be used to update properties on the Item. */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Item

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    fun list(
        params: ItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ItemListPage

    /** This endpoint returns an item identified by its item_id. */
    fun fetch(params: ItemFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Item
}
