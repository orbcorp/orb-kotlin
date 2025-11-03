// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint is used to fetch a plan version. It returns the phases, prices, and adjustments
 * present on this version of the plan.
 */
class BetaExternalPlanIdFetchPlanVersionParams
private constructor(
    private val externalPlanId: String,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalPlanId(): String = externalPlanId

    fun version(): String? = version

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BetaExternalPlanIdFetchPlanVersionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .externalPlanId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BetaExternalPlanIdFetchPlanVersionParams]. */
    class Builder internal constructor() {

        private var externalPlanId: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            betaExternalPlanIdFetchPlanVersionParams: BetaExternalPlanIdFetchPlanVersionParams
        ) = apply {
            externalPlanId = betaExternalPlanIdFetchPlanVersionParams.externalPlanId
            version = betaExternalPlanIdFetchPlanVersionParams.version
            additionalHeaders =
                betaExternalPlanIdFetchPlanVersionParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                betaExternalPlanIdFetchPlanVersionParams.additionalQueryParams.toBuilder()
        }

        fun externalPlanId(externalPlanId: String) = apply { this.externalPlanId = externalPlanId }

        fun version(version: String?) = apply { this.version = version }

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
         * Returns an immutable instance of [BetaExternalPlanIdFetchPlanVersionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .externalPlanId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BetaExternalPlanIdFetchPlanVersionParams =
            BetaExternalPlanIdFetchPlanVersionParams(
                checkRequired("externalPlanId", externalPlanId),
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalPlanId
            1 -> version ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BetaExternalPlanIdFetchPlanVersionParams &&
            externalPlanId == other.externalPlanId &&
            version == other.version &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalPlanId, version, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BetaExternalPlanIdFetchPlanVersionParams{externalPlanId=$externalPlanId, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
