// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.account

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
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.AccountPaymentGatewayConnectionFetchParams
import com.withorb.api.models.AccountPaymentGatewayConnectionListPage
import com.withorb.api.models.AccountPaymentGatewayConnectionListPageResponse
import com.withorb.api.models.AccountPaymentGatewayConnectionListParams
import com.withorb.api.models.PaymentGatewayConnection

/**
 * A payment gateway connection is one Stripe account or one Adyen merchant account that a billing
 * entity collects payments through.
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

    override fun list(
        params: AccountPaymentGatewayConnectionListParams,
        requestOptions: RequestOptions,
    ): AccountPaymentGatewayConnectionListPage =
        // get /account/payment_gateway_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(
        params: AccountPaymentGatewayConnectionFetchParams,
        requestOptions: RequestOptions,
    ): PaymentGatewayConnection =
        // get /account/payment_gateway_connections/{payment_gateway_connection_id}
        withRawResponse().fetch(params, requestOptions).parse()

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

        private val listHandler: Handler<AccountPaymentGatewayConnectionListPageResponse> =
            jsonHandler<AccountPaymentGatewayConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountPaymentGatewayConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPaymentGatewayConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "payment_gateway_connections")
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
                    .let {
                        AccountPaymentGatewayConnectionListPage.builder()
                            .service(PaymentGatewayConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val fetchHandler: Handler<PaymentGatewayConnection> =
            jsonHandler<PaymentGatewayConnection>(clientOptions.jsonMapper)

        override fun fetch(
            params: AccountPaymentGatewayConnectionFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentGatewayConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentGatewayConnectionId", params.paymentGatewayConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account", "payment_gateway_connections", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
    }
}
