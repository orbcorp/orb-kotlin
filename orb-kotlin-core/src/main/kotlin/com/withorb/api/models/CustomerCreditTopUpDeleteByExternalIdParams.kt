// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
import java.util.Objects

class CustomerCreditTopUpDeleteByExternalIdParams
constructor(
    private val externalCustomerId: String,
    private val topUpId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun topUpId(): String = topUpId

    internal fun getBody(): Map<String, JsonValue>? {
        return additionalBodyProperties.ifEmpty { null }
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            1 -> topUpId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpDeleteByExternalIdParams && this.externalCustomerId == other.externalCustomerId && this.topUpId == other.topUpId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalCustomerId, topUpId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditTopUpDeleteByExternalIdParams{externalCustomerId=$externalCustomerId, topUpId=$topUpId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var topUpId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerCreditTopUpDeleteByExternalIdParams: CustomerCreditTopUpDeleteByExternalIdParams
        ) = apply {
            this.externalCustomerId = customerCreditTopUpDeleteByExternalIdParams.externalCustomerId
            this.topUpId = customerCreditTopUpDeleteByExternalIdParams.topUpId
            additionalQueryParams(customerCreditTopUpDeleteByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerCreditTopUpDeleteByExternalIdParams.additionalHeaders)
            additionalBodyProperties(
                customerCreditTopUpDeleteByExternalIdParams.additionalBodyProperties
            )
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun topUpId(topUpId: String) = apply { this.topUpId = topUpId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CustomerCreditTopUpDeleteByExternalIdParams =
            CustomerCreditTopUpDeleteByExternalIdParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
                checkNotNull(topUpId) { "`topUpId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
