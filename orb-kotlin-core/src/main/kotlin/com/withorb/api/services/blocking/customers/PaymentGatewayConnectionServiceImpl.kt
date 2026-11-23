// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

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
import com.withorb.api.core.prepare
import com.withorb.api.models.CustomerPaymentGatewayConnection
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionListParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateParams

/**
 * A customer is a buyer of your products, and the other party to the billing relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but it's often
 * desirable to have these match existing identifiers in your system. To avoid having to denormalize
 * Orb ID information, you can pass in an `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](/events-and-metrics/customer-aliases) for further information about how
 * these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a payment provider
 * solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum field to
 * express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
 * timezone. See [Timezone localization](/essentials/timezones) for information on what this
 * timezone parameter influences within Orb.
 */
class PaymentGatewayConnectionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PaymentGatewayConnectionService {

    private val withRawResponse: PaymentGatewayConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentGatewayConnectionService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PaymentGatewayConnectionService =
        PaymentGatewayConnectionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: CustomerPaymentGatewayConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // post /customers/{customer_id}/payment_gateway_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CustomerPaymentGatewayConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // put /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CustomerPaymentGatewayConnectionListParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnectionListResponse =
        // get /customers/{customer_id}/payment_gateway_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CustomerPaymentGatewayConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // delete
        // /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun createByExternalId(
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // post /customers/external_customer_id/{external_customer_id}/payment_gateway_connections
        withRawResponse().createByExternalId(params, requestOptions).parse()

    override fun deleteByExternalId(
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // delete
        // /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}
        withRawResponse().deleteByExternalId(params, requestOptions).parse()

    override fun listByExternalId(
        params: CustomerPaymentGatewayConnectionListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnectionListByExternalIdResponse =
        // get /customers/external_customer_id/{external_customer_id}/payment_gateway_connections
        withRawResponse().listByExternalId(params, requestOptions).parse()

    override fun updateByExternalId(
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): CustomerPaymentGatewayConnection =
        // put
        // /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}
        withRawResponse().updateByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentGatewayConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentGatewayConnectionService.WithRawResponse =
            PaymentGatewayConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerPaymentGatewayConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "payment_gateway_connections",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun update(
            params: CustomerPaymentGatewayConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentGatewayConnectionId", params.paymentGatewayConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "payment_gateway_connections",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<CustomerPaymentGatewayConnectionListResponse> =
            jsonHandler<CustomerPaymentGatewayConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerPaymentGatewayConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "payment_gateway_connections",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun delete(
            params: CustomerPaymentGatewayConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentGatewayConnectionId", params.paymentGatewayConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "payment_gateway_connections",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createByExternalIdHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun createByExternalId(
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "payment_gateway_connections",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteByExternalIdHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun deleteByExternalId(
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentGatewayConnectionId", params.paymentGatewayConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "payment_gateway_connections",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listByExternalIdHandler:
            Handler<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
            jsonHandler<CustomerPaymentGatewayConnectionListByExternalIdResponse>(
                clientOptions.jsonMapper
            )

        override fun listByExternalId(
            params: CustomerPaymentGatewayConnectionListByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "payment_gateway_connections",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateByExternalIdHandler: Handler<CustomerPaymentGatewayConnection> =
            jsonHandler<CustomerPaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun updateByExternalId(
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentGatewayConnectionId", params.paymentGatewayConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "payment_gateway_connections",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
