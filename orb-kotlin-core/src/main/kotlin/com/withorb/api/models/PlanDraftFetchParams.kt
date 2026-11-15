// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint returns the plan's unpublished draft version, with its changes applied on top of
 * the latest published version. It returns a 404 if the plan has no draft.
 */
class PlanDraftFetchParams
private constructor(
    private val planId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun planId(): String? = planId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PlanDraftFetchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PlanDraftFetchParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PlanDraftFetchParams]. */
    class Builder internal constructor() {

        private var planId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(planDraftFetchParams: PlanDraftFetchParams) = apply {
            planId = planDraftFetchParams.planId
            additionalHeaders = planDraftFetchParams.additionalHeaders.toBuilder()
            additionalQueryParams = planDraftFetchParams.additionalQueryParams.toBuilder()
        }

        fun planId(planId: String?) = apply { this.planId = planId }

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
         * Returns an immutable instance of [PlanDraftFetchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlanDraftFetchParams =
            PlanDraftFetchParams(planId, additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> planId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanDraftFetchParams &&
            planId == other.planId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(planId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanDraftFetchParams{planId=$planId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
