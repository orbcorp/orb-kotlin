// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint creates a new alert to monitor a customer's credit balance. There are three types
 * of alerts that can be scoped to customers: `credit_balance_depleted`, `credit_balance_dropped`,
 * and `credit_balance_recovered`. Customers can have a maximum of one of each type of alert per
 * [credit balance currency](/product-catalog/prepurchase). `credit_balance_dropped` alerts require
 * a list of thresholds to be provided while `credit_balance_depleted` and
 * `credit_balance_recovered` alerts do not require thresholds.
 */
class AlertCreateForExternalCustomerParams
private constructor(
    private val externalCustomerId: String,
    private val createCustomerAlertRequest: CreateCustomerAlertRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String = externalCustomerId

    fun createCustomerAlertRequest(): CreateCustomerAlertRequest = createCustomerAlertRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        createCustomerAlertRequest._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): CreateCustomerAlertRequest = createCustomerAlertRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AlertCreateForExternalCustomerParams].
         *
         * The following fields are required:
         * ```kotlin
         * .externalCustomerId()
         * .createCustomerAlertRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AlertCreateForExternalCustomerParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var createCustomerAlertRequest: CreateCustomerAlertRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            alertCreateForExternalCustomerParams: AlertCreateForExternalCustomerParams
        ) = apply {
            externalCustomerId = alertCreateForExternalCustomerParams.externalCustomerId
            createCustomerAlertRequest =
                alertCreateForExternalCustomerParams.createCustomerAlertRequest
            additionalHeaders = alertCreateForExternalCustomerParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                alertCreateForExternalCustomerParams.additionalQueryParams.toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun createCustomerAlertRequest(createCustomerAlertRequest: CreateCustomerAlertRequest) =
            apply {
                this.createCustomerAlertRequest = createCustomerAlertRequest
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AlertCreateForExternalCustomerParams =
            AlertCreateForExternalCustomerParams(
                checkRequired("externalCustomerId", externalCustomerId),
                checkRequired("createCustomerAlertRequest", createCustomerAlertRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertCreateForExternalCustomerParams && externalCustomerId == other.externalCustomerId && createCustomerAlertRequest == other.createCustomerAlertRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, createCustomerAlertRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AlertCreateForExternalCustomerParams{externalCustomerId=$externalCustomerId, createCustomerAlertRequest=$createCustomerAlertRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
