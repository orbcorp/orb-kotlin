// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class CustomerBalanceTransactionListParams constructor(
  private val customerId: String,
  private val cursor: String?,
  private val limit: Long?,
  private val operationTimeGt: OffsetDateTime?,
  private val operationTimeGte: OffsetDateTime?,
  private val operationTimeLt: OffsetDateTime?,
  private val operationTimeLte: OffsetDateTime?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun customerId(): String = customerId

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun operationTimeGt(): OffsetDateTime? = operationTimeGt

    fun operationTimeGte(): OffsetDateTime? = operationTimeGte

    fun operationTimeLt(): OffsetDateTime? = operationTimeLt

    fun operationTimeLte(): OffsetDateTime? = operationTimeLte

    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.operationTimeGt?.let {
          params.put("operation_time[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.operationTimeGte?.let {
          params.put("operation_time[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.operationTimeLt?.let {
          params.put("operation_time[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.operationTimeLte?.let {
          params.put("operation_time[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> customerId
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

      return other is CustomerBalanceTransactionListParams &&
          this.customerId == other.customerId &&
          this.cursor == other.cursor &&
          this.limit == other.limit &&
          this.operationTimeGt == other.operationTimeGt &&
          this.operationTimeGte == other.operationTimeGte &&
          this.operationTimeLt == other.operationTimeLt &&
          this.operationTimeLte == other.operationTimeLte &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          customerId,
          cursor,
          limit,
          operationTimeGt,
          operationTimeGte,
          operationTimeLt,
          operationTimeLte,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CustomerBalanceTransactionListParams{customerId=$customerId, cursor=$cursor, limit=$limit, operationTimeGt=$operationTimeGt, operationTimeGte=$operationTimeGte, operationTimeLt=$operationTimeLt, operationTimeLte=$operationTimeLte, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var operationTimeGt: OffsetDateTime? = null
        private var operationTimeGte: OffsetDateTime? = null
        private var operationTimeLt: OffsetDateTime? = null
        private var operationTimeLte: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerBalanceTransactionListParams: CustomerBalanceTransactionListParams) = apply {
            this.customerId = customerBalanceTransactionListParams.customerId
            this.cursor = customerBalanceTransactionListParams.cursor
            this.limit = customerBalanceTransactionListParams.limit
            this.operationTimeGt = customerBalanceTransactionListParams.operationTimeGt
            this.operationTimeGte = customerBalanceTransactionListParams.operationTimeGte
            this.operationTimeLt = customerBalanceTransactionListParams.operationTimeLt
            this.operationTimeLte = customerBalanceTransactionListParams.operationTimeLte
            additionalQueryParams(customerBalanceTransactionListParams.additionalQueryParams)
            additionalHeaders(customerBalanceTransactionListParams.additionalHeaders)
            additionalBodyProperties(customerBalanceTransactionListParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply {
            this.customerId = customerId
        }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned
         * from the initial request.
         */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        fun operationTimeGt(operationTimeGt: OffsetDateTime) = apply {
            this.operationTimeGt = operationTimeGt
        }

        fun operationTimeGte(operationTimeGte: OffsetDateTime) = apply {
            this.operationTimeGte = operationTimeGte
        }

        fun operationTimeLt(operationTimeLt: OffsetDateTime) = apply {
            this.operationTimeLt = operationTimeLt
        }

        fun operationTimeLte(operationTimeLte: OffsetDateTime) = apply {
            this.operationTimeLte = operationTimeLte
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): CustomerBalanceTransactionListParams = CustomerBalanceTransactionListParams(
            checkNotNull(customerId) {
                "`customerId` is required but was not set"
            },
            cursor,
            limit,
            operationTimeGt,
            operationTimeGte,
            operationTimeLt,
            operationTimeLte,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
