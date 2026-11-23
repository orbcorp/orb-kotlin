// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.AccountBillingEntityArchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityArchiveParams
import com.withorb.api.models.AccountBillingEntityCreateParams
import com.withorb.api.models.AccountBillingEntityFetchByExternalIdParams
import com.withorb.api.models.AccountBillingEntityFetchParams
import com.withorb.api.models.AccountBillingEntityListPageAsync
import com.withorb.api.models.AccountBillingEntityListPageResponse
import com.withorb.api.models.AccountBillingEntityListParams
import com.withorb.api.models.AccountBillingEntityUnarchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUnarchiveParams
import com.withorb.api.models.AccountBillingEntityUpdateByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUpdateParams
import com.withorb.api.models.BillingEntity

/**
 * A billing entity is a legal entity an account invoices from, with its own legal name, address and
 * tax registrations.
 */
class BillingEntityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingEntityServiceAsync {

    private val withRawResponse: BillingEntityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingEntityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillingEntityServiceAsync =
        BillingEntityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AccountBillingEntityCreateParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // post /account/billing_entities
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: AccountBillingEntityUpdateParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // put /account/billing_entities/{billing_entity_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AccountBillingEntityListParams,
        requestOptions: RequestOptions,
    ): AccountBillingEntityListPageAsync =
        // get /account/billing_entities
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: AccountBillingEntityArchiveParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // post /account/billing_entities/{billing_entity_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override suspend fun archiveByExternalId(
        params: AccountBillingEntityArchiveByExternalIdParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // post
        // /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/archive
        withRawResponse().archiveByExternalId(params, requestOptions).parse()

    override suspend fun fetch(
        params: AccountBillingEntityFetchParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // get /account/billing_entities/{billing_entity_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override suspend fun fetchByExternalId(
        params: AccountBillingEntityFetchByExternalIdParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // get /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}
        withRawResponse().fetchByExternalId(params, requestOptions).parse()

    override suspend fun unarchive(
        params: AccountBillingEntityUnarchiveParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // post /account/billing_entities/{billing_entity_id}/unarchive
        withRawResponse().unarchive(params, requestOptions).parse()

    override suspend fun unarchiveByExternalId(
        params: AccountBillingEntityUnarchiveByExternalIdParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // post
        // /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/unarchive
        withRawResponse().unarchiveByExternalId(params, requestOptions).parse()

    override suspend fun updateByExternalId(
        params: AccountBillingEntityUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): BillingEntity =
        // put /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}
        withRawResponse().updateByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingEntityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BillingEntityServiceAsync.WithRawResponse =
            BillingEntityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AccountBillingEntityCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "billing_entities")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AccountBillingEntityUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billingEntityId", params.billingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "billing_entities", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccountBillingEntityListPageResponse> =
            jsonHandler<AccountBillingEntityListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AccountBillingEntityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountBillingEntityListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "billing_entities")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AccountBillingEntityListPageAsync.builder()
                            .service(BillingEntityServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun archive(
            params: AccountBillingEntityArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billingEntityId", params.billingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "billing_entities", params._pathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveByExternalIdHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun archiveByExternalId(
            params: AccountBillingEntityArchiveByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBillingEntityId", params.externalBillingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account",
                        "billing_entities",
                        "external_billing_entity_id",
                        params._pathParam(0),
                        "archive",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun fetch(
            params: AccountBillingEntityFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billingEntityId", params.billingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "billing_entities", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchByExternalIdHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun fetchByExternalId(
            params: AccountBillingEntityFetchByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBillingEntityId", params.externalBillingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account",
                        "billing_entities",
                        "external_billing_entity_id",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unarchiveHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun unarchive(
            params: AccountBillingEntityUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billingEntityId", params.billingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account",
                        "billing_entities",
                        params._pathParam(0),
                        "unarchive",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unarchiveByExternalIdHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun unarchiveByExternalId(
            params: AccountBillingEntityUnarchiveByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBillingEntityId", params.externalBillingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account",
                        "billing_entities",
                        "external_billing_entity_id",
                        params._pathParam(0),
                        "unarchive",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateByExternalIdHandler: Handler<BillingEntity> =
            jsonHandler<BillingEntity>(clientOptions.jsonMapper)

        override suspend fun updateByExternalId(
            params: AccountBillingEntityUpdateByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalBillingEntityId", params.externalBillingEntityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account",
                        "billing_entities",
                        "external_billing_entity_id",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
