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

class InvoiceMarkPaidParams constructor(
  private val invoiceId: String,
  private val paymentReceivedDate: LocalDate,
  private val externalId: String?,
  private val notes: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun invoiceId(): String = invoiceId

    fun paymentReceivedDate(): LocalDate = paymentReceivedDate

    fun externalId(): String? = externalId

    fun notes(): String? = notes

    internal fun getBody(): InvoiceMarkPaidBody {
      return InvoiceMarkPaidBody(
          paymentReceivedDate,
          externalId,
          notes,
          additionalBodyProperties,
      )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> invoiceId
          else -> ""
      }
    }

    @JsonDeserialize(builder = InvoiceMarkPaidBody.Builder::class)
    @NoAutoDetect
    class InvoiceMarkPaidBody internal constructor(
      private val paymentReceivedDate: LocalDate?,
      private val externalId: String?,
      private val notes: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** A date string to specify the date of the payment. */
        @JsonProperty("payment_received_date")
        fun paymentReceivedDate(): LocalDate? = paymentReceivedDate

        /** An optional external ID to associate with the payment. */
        @JsonProperty("external_id")
        fun externalId(): String? = externalId

        /** An optional note to associate with the payment. */
        @JsonProperty("notes")
        fun notes(): String? = notes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is InvoiceMarkPaidBody &&
              this.paymentReceivedDate == other.paymentReceivedDate &&
              this.externalId == other.externalId &&
              this.notes == other.notes &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                paymentReceivedDate,
                externalId,
                notes,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "InvoiceMarkPaidBody{paymentReceivedDate=$paymentReceivedDate, externalId=$externalId, notes=$notes, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paymentReceivedDate: LocalDate? = null
            private var externalId: String? = null
            private var notes: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceMarkPaidBody: InvoiceMarkPaidBody) = apply {
                this.paymentReceivedDate = invoiceMarkPaidBody.paymentReceivedDate
                this.externalId = invoiceMarkPaidBody.externalId
                this.notes = invoiceMarkPaidBody.notes
                additionalProperties(invoiceMarkPaidBody.additionalProperties)
            }

            /** A date string to specify the date of the payment. */
            @JsonProperty("payment_received_date")
            fun paymentReceivedDate(paymentReceivedDate: LocalDate) = apply {
                this.paymentReceivedDate = paymentReceivedDate
            }

            /** An optional external ID to associate with the payment. */
            @JsonProperty("external_id")
            fun externalId(externalId: String) = apply {
                this.externalId = externalId
            }

            /** An optional note to associate with the payment. */
            @JsonProperty("notes")
            fun notes(notes: String) = apply {
                this.notes = notes
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InvoiceMarkPaidBody = InvoiceMarkPaidBody(
                checkNotNull(paymentReceivedDate) {
                    "`paymentReceivedDate` is required but was not set"
                },
                externalId,
                notes,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InvoiceMarkPaidParams &&
          this.invoiceId == other.invoiceId &&
          this.paymentReceivedDate == other.paymentReceivedDate &&
          this.externalId == other.externalId &&
          this.notes == other.notes &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          invoiceId,
          paymentReceivedDate,
          externalId,
          notes,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "InvoiceMarkPaidParams{invoiceId=$invoiceId, paymentReceivedDate=$paymentReceivedDate, externalId=$externalId, notes=$notes, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var invoiceId: String? = null
        private var paymentReceivedDate: LocalDate? = null
        private var externalId: String? = null
        private var notes: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceMarkPaidParams: InvoiceMarkPaidParams) = apply {
            this.invoiceId = invoiceMarkPaidParams.invoiceId
            this.paymentReceivedDate = invoiceMarkPaidParams.paymentReceivedDate
            this.externalId = invoiceMarkPaidParams.externalId
            this.notes = invoiceMarkPaidParams.notes
            additionalQueryParams(invoiceMarkPaidParams.additionalQueryParams)
            additionalHeaders(invoiceMarkPaidParams.additionalHeaders)
            additionalBodyProperties(invoiceMarkPaidParams.additionalBodyProperties)
        }

        fun invoiceId(invoiceId: String) = apply {
            this.invoiceId = invoiceId
        }

        /** A date string to specify the date of the payment. */
        fun paymentReceivedDate(paymentReceivedDate: LocalDate) = apply {
            this.paymentReceivedDate = paymentReceivedDate
        }

        /** An optional external ID to associate with the payment. */
        fun externalId(externalId: String) = apply {
            this.externalId = externalId
        }

        /** An optional note to associate with the payment. */
        fun notes(notes: String) = apply {
            this.notes = notes
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

        fun build(): InvoiceMarkPaidParams = InvoiceMarkPaidParams(
            checkNotNull(invoiceId) {
                "`invoiceId` is required but was not set"
            },
            checkNotNull(paymentReceivedDate) {
                "`paymentReceivedDate` is required but was not set"
            },
            externalId,
            notes,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }
}
