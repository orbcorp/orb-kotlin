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
 * This endpoint allows you to update the `metadata` property on a price. If you pass null for the
 * metadata value, it will clear any existing metadata for that price.
 */
class PriceExternalPriceIdUpdateParams
private constructor(
    private val externalPriceId: String,
    private val updatePriceRequestParams: UpdatePriceRequestParams,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalPriceId(): String = externalPriceId

    fun updatePriceRequestParams(): UpdatePriceRequestParams = updatePriceRequestParams

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        updatePriceRequestParams._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): UpdatePriceRequestParams = updatePriceRequestParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalPriceId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PriceExternalPriceIdUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .externalPriceId()
         * .updatePriceRequestParams()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceExternalPriceIdUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var externalPriceId: String? = null
        private var updatePriceRequestParams: UpdatePriceRequestParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceExternalPriceIdUpdateParams: PriceExternalPriceIdUpdateParams) =
            apply {
                externalPriceId = priceExternalPriceIdUpdateParams.externalPriceId
                updatePriceRequestParams = priceExternalPriceIdUpdateParams.updatePriceRequestParams
                additionalHeaders = priceExternalPriceIdUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    priceExternalPriceIdUpdateParams.additionalQueryParams.toBuilder()
            }

        fun externalPriceId(externalPriceId: String) = apply {
            this.externalPriceId = externalPriceId
        }

        fun updatePriceRequestParams(updatePriceRequestParams: UpdatePriceRequestParams) = apply {
            this.updatePriceRequestParams = updatePriceRequestParams
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

        fun build(): PriceExternalPriceIdUpdateParams =
            PriceExternalPriceIdUpdateParams(
                checkRequired("externalPriceId", externalPriceId),
                checkRequired("updatePriceRequestParams", updatePriceRequestParams),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceExternalPriceIdUpdateParams && externalPriceId == other.externalPriceId && updatePriceRequestParams == other.updatePriceRequestParams && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPriceId, updatePriceRequestParams, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceExternalPriceIdUpdateParams{externalPriceId=$externalPriceId, updatePriceRequestParams=$updatePriceRequestParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
