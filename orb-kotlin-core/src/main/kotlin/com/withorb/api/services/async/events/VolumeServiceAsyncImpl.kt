// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.EventVolumeListParams
import com.withorb.api.models.EventVolumes

class VolumeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VolumeServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<EventVolumes> =
        jsonHandler<EventVolumes>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns the event volume for an account in a
     * [paginated list format](/api-reference/pagination).
     *
     * The event volume is aggregated by the hour and the
     * [timestamp](/api-reference/event/ingest-events) field is used to determine which hour an
     * event is associated with. Note, this means that late-arriving events increment the volume
     * count for the hour window the timestamp is in, not the latest hour window.
     *
     * Each item in the response contains the count of events aggregated by the hour where the start
     * and end time are hour-aligned and in UTC. When a specific timestamp is passed in for either
     * start or end time, the response includes the hours the timestamp falls in.
     */
    override suspend fun list(
        params: EventVolumeListParams,
        requestOptions: RequestOptions,
    ): EventVolumes {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", "volume")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
