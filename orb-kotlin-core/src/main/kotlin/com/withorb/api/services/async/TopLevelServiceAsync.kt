// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse

interface TopLevelServiceAsync {

    /**
     * This endpoint allows you to test your connection to the Orb API and check the validity of
     * your API key, passed in the Authorization header. This is particularly useful for checking
     * that your environment is set up properly, and is a great choice for connectors and
     * integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    suspend fun ping(
        params: TopLevelPingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopLevelPingResponse
}
