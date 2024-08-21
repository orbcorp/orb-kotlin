// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

class TopLevelServiceImpl constructor(private val clientOptions: ClientOptions, ) : TopLevelService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val pingHandler: Handler<TopLevelPingResponse> =
    jsonHandler<TopLevelPingResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to test your connection to the Orb API and check the
     * validity of your API key, passed in the Authorization header. This is
     * particularly useful for checking that your environment is set up properly, and
     * is a great choice for connectors and integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    override fun ping(params: TopLevelPingParams, requestOptions: RequestOptions): TopLevelPingResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("ping")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              pingHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
