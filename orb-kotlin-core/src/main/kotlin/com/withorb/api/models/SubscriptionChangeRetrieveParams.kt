// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint returns a subscription change given an identifier.
 *
 * A subscription change is created by including `Create-Pending-Subscription-Change: True` in the
 * header of a subscription mutation API call (e.g.
 * [create subscription endpoint](/api-reference/subscription/create-subscription), [schedule plan
 * change endpoint](/api-reference/subscription/schedule-plan-change), ...). The subscription change
 * will be referenced by the `pending_subscription_change` field in the response.
 */
class SubscriptionChangeRetrieveParams
private constructor(
    private val subscriptionChangeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionChangeId(): String? = subscriptionChangeId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionChangeRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionChangeRetrieveParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionChangeRetrieveParams]. */
    class Builder internal constructor() {

        private var subscriptionChangeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionChangeRetrieveParams: SubscriptionChangeRetrieveParams) =
            apply {
                subscriptionChangeId = subscriptionChangeRetrieveParams.subscriptionChangeId
                additionalHeaders = subscriptionChangeRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriptionChangeRetrieveParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionChangeId(subscriptionChangeId: String?) = apply {
            this.subscriptionChangeId = subscriptionChangeId
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

        /**
         * Returns an immutable instance of [SubscriptionChangeRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionChangeRetrieveParams =
            SubscriptionChangeRetrieveParams(
                subscriptionChangeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionChangeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionChangeRetrieveParams && subscriptionChangeId == other.subscriptionChangeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionChangeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionChangeRetrieveParams{subscriptionChangeId=$subscriptionChangeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
