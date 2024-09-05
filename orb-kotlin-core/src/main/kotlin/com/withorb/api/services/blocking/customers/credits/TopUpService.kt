// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking.customers.credits

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
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdResponse
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpCreateResponse
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPage
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdResponse
import com.withorb.api.models.CustomerCreditTopUpListPage
import com.withorb.api.models.CustomerCreditTopUpListParams
import com.withorb.api.models.CustomerCreditTopUpListResponse
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

interface TopUpService {

    /**
     * This endpoint allows you to create a new top-up for a specified customer's
     * balance. While this top-up is active, the customer's balance will added in
     * increments of the specified amount whenever the balance reaches the specified
     * threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing
     * top-up will be replaced.
     */
    fun create(params: CustomerCreditTopUpCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditTopUpCreateResponse

    /** List top-ups */
    fun list(params: CustomerCreditTopUpListParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditTopUpListPage

    /** Delete top-up */
    fun delete(params: CustomerCreditTopUpDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * This endpoint allows you to create a new top-up for a specified customer's
     * balance. While this top-up is active, the customer's balance will added in
     * increments of the specified amount whenever the balance reaches the specified
     * threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing
     * top-up will be replaced.
     */
    fun createByExternalId(params: CustomerCreditTopUpCreateByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditTopUpCreateByExternalIdResponse

    /** Delete top-up by external ID */
    fun deleteByExternalId(params: CustomerCreditTopUpDeleteByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none())

    /** List top-ups by external ID */
    fun listByExternalId(params: CustomerCreditTopUpListByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditTopUpListByExternalIdPage
}
