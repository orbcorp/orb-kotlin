// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking.customers

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
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListByExternalIdResponse
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.models.CustomerCreditListResponse
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
import com.withorb.api.services.blocking.customers.credits.LedgerService
import com.withorb.api.services.blocking.customers.credits.LedgerServiceImpl
import com.withorb.api.services.blocking.customers.credits.TopUpService
import com.withorb.api.services.blocking.customers.credits.TopUpServiceImpl

interface CreditService {

    fun ledger(): LedgerService

    fun topUps(): TopUpService

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world
     * currency, set `currency` to an ISO 4217 string.
     */
    fun list(params: CustomerCreditListParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditListPage

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world
     * currency, set `currency` to an ISO 4217 string.
     */
    fun listByExternalId(params: CustomerCreditListByExternalIdParams, requestOptions: RequestOptions = RequestOptions.none()): CustomerCreditListByExternalIdPage
}
