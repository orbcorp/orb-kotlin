// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPage
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams

class AlertServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertService {

    private val withRawResponse: AlertService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertService.WithRawResponse = withRawResponse

    override fun retrieve(params: AlertRetrieveParams, requestOptions: RequestOptions): Alert =
        // get /alerts/{alert_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AlertUpdateParams, requestOptions: RequestOptions): Alert =
        // put /alerts/{alert_configuration_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AlertListParams, requestOptions: RequestOptions): AlertListPage =
        // get /alerts
        withRawResponse().list(params, requestOptions).parse()

    override fun createForCustomer(
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/customer_id/{customer_id}
        withRawResponse().createForCustomer(params, requestOptions).parse()

    override fun createForExternalCustomer(
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/external_customer_id/{external_customer_id}
        withRawResponse().createForExternalCustomer(params, requestOptions).parse()

    override fun createForSubscription(
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/subscription_id/{subscription_id}
        withRawResponse().createForSubscription(params, requestOptions).parse()

    override fun disable(params: AlertDisableParams, requestOptions: RequestOptions): Alert =
        // post /alerts/{alert_configuration_id}/disable
        withRawResponse().disable(params, requestOptions).parse()

    override fun enable(params: AlertEnableParams, requestOptions: RequestOptions): Alert =
        // post /alerts/{alert_configuration_id}/enable
        withRawResponse().enable(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("alerts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("alerts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AlertListPage.Response> =
            jsonHandler<AlertListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AlertListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("alerts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { AlertListPage.of(AlertServiceImpl(clientOptions), params, it) }
            }
        }

        private val createForCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForCustomer(
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("alerts", "customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createForCustomerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createForExternalCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForExternalCustomer(
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("alerts", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createForExternalCustomerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createForSubscriptionHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForSubscription(
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("alerts", "subscription_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createForSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val disableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun disable(
            params: AlertDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("alerts", params._pathParam(0), "disable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun enable(
            params: AlertEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("alerts", params._pathParam(0), "enable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
