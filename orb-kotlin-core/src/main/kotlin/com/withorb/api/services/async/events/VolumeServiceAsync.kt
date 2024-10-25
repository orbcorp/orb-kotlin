// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.EventVolumeListParams
import com.withorb.api.models.EventVolumes

interface VolumeServiceAsync {

    /**
     * This endpoint returns the event volume for an account in a
     * [paginated list format](../reference/pagination).
     *
     * The event volume is aggregated by the hour and the
     * [timestamp](../reference/ingest#determining-event-timestamp) field is used to determine which
     * hour an event is associated with. Note, this means that late-arriving events increment the
     * volume count for the hour window the timestamp is in, not the latest hour window.
     *
     * Each item in the response contains the count of events aggregated by the hour where the start
     * and end time are hour-aligned and in UTC. When a specific timestamp is passed in for either
     * start or end time, the response includes the hours the timestamp falls in.
     */
    suspend fun list(
        params: EventVolumeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventVolumes
}
