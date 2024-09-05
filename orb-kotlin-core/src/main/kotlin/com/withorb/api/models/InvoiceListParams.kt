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

class InvoiceListParams constructor(
  private val amount: String?,
  private val amountGt: String?,
  private val amountLt: String?,
  private val cursor: String?,
  private val customerId: String?,
  private val dateType: DateType?,
  private val dueDate: LocalDate?,
  private val dueDateWindow: String?,
  private val dueDateGt: LocalDate?,
  private val dueDateLt: LocalDate?,
  private val externalCustomerId: String?,
  private val invoiceDateGt: OffsetDateTime?,
  private val invoiceDateGte: OffsetDateTime?,
  private val invoiceDateLt: OffsetDateTime?,
  private val invoiceDateLte: OffsetDateTime?,
  private val isRecurring: Boolean?,
  private val limit: Long?,
  private val status: List<Status>?,
  private val subscriptionId: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,

) {

    fun amount(): String? = amount

    fun amountGt(): String? = amountGt

    fun amountLt(): String? = amountLt

    fun cursor(): String? = cursor

    fun customerId(): String? = customerId

    fun dateType(): DateType? = dateType

    fun dueDate(): LocalDate? = dueDate

    fun dueDateWindow(): String? = dueDateWindow

    fun dueDateGt(): LocalDate? = dueDateGt

    fun dueDateLt(): LocalDate? = dueDateLt

    fun externalCustomerId(): String? = externalCustomerId

    fun invoiceDateGt(): OffsetDateTime? = invoiceDateGt

    fun invoiceDateGte(): OffsetDateTime? = invoiceDateGte

    fun invoiceDateLt(): OffsetDateTime? = invoiceDateLt

    fun invoiceDateLte(): OffsetDateTime? = invoiceDateLte

    fun isRecurring(): Boolean? = isRecurring

    fun limit(): Long? = limit

    fun status(): List<Status>? = status

    fun subscriptionId(): String? = subscriptionId

    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.amount?.let {
          params.put("amount", listOf(it.toString()))
      }
      this.amountGt?.let {
          params.put("amount[gt]", listOf(it.toString()))
      }
      this.amountLt?.let {
          params.put("amount[lt]", listOf(it.toString()))
      }
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.customerId?.let {
          params.put("customer_id", listOf(it.toString()))
      }
      this.dateType?.let {
          params.put("date_type", listOf(it.toString()))
      }
      this.dueDate?.let {
          params.put("due_date", listOf(it.toString()))
      }
      this.dueDateWindow?.let {
          params.put("due_date_window", listOf(it.toString()))
      }
      this.dueDateGt?.let {
          params.put("due_date[gt]", listOf(it.toString()))
      }
      this.dueDateLt?.let {
          params.put("due_date[lt]", listOf(it.toString()))
      }
      this.externalCustomerId?.let {
          params.put("external_customer_id", listOf(it.toString()))
      }
      this.invoiceDateGt?.let {
          params.put("invoice_date[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.invoiceDateGte?.let {
          params.put("invoice_date[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.invoiceDateLt?.let {
          params.put("invoice_date[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.invoiceDateLte?.let {
          params.put("invoice_date[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.isRecurring?.let {
          params.put("is_recurring", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.status?.let {
          params.put("status[]", it.map(Any::toString))
      }
      this.subscriptionId?.let {
          params.put("subscription_id", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InvoiceListParams &&
          this.amount == other.amount &&
          this.amountGt == other.amountGt &&
          this.amountLt == other.amountLt &&
          this.cursor == other.cursor &&
          this.customerId == other.customerId &&
          this.dateType == other.dateType &&
          this.dueDate == other.dueDate &&
          this.dueDateWindow == other.dueDateWindow &&
          this.dueDateGt == other.dueDateGt &&
          this.dueDateLt == other.dueDateLt &&
          this.externalCustomerId == other.externalCustomerId &&
          this.invoiceDateGt == other.invoiceDateGt &&
          this.invoiceDateGte == other.invoiceDateGte &&
          this.invoiceDateLt == other.invoiceDateLt &&
          this.invoiceDateLte == other.invoiceDateLte &&
          this.isRecurring == other.isRecurring &&
          this.limit == other.limit &&
          this.status == other.status &&
          this.subscriptionId == other.subscriptionId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          amount,
          amountGt,
          amountLt,
          cursor,
          customerId,
          dateType,
          dueDate,
          dueDateWindow,
          dueDateGt,
          dueDateLt,
          externalCustomerId,
          invoiceDateGt,
          invoiceDateGte,
          invoiceDateLt,
          invoiceDateLte,
          isRecurring,
          limit,
          status,
          subscriptionId,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "InvoiceListParams{amount=$amount, amountGt=$amountGt, amountLt=$amountLt, cursor=$cursor, customerId=$customerId, dateType=$dateType, dueDate=$dueDate, dueDateWindow=$dueDateWindow, dueDateGt=$dueDateGt, dueDateLt=$dueDateLt, externalCustomerId=$externalCustomerId, invoiceDateGt=$invoiceDateGt, invoiceDateGte=$invoiceDateGte, invoiceDateLt=$invoiceDateLt, invoiceDateLte=$invoiceDateLte, isRecurring=$isRecurring, limit=$limit, status=$status, subscriptionId=$subscriptionId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: String? = null
        private var amountGt: String? = null
        private var amountLt: String? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var dateType: DateType? = null
        private var dueDate: LocalDate? = null
        private var dueDateWindow: String? = null
        private var dueDateGt: LocalDate? = null
        private var dueDateLt: LocalDate? = null
        private var externalCustomerId: String? = null
        private var invoiceDateGt: OffsetDateTime? = null
        private var invoiceDateGte: OffsetDateTime? = null
        private var invoiceDateLt: OffsetDateTime? = null
        private var invoiceDateLte: OffsetDateTime? = null
        private var isRecurring: Boolean? = null
        private var limit: Long? = null
        private var status: MutableList<Status> = mutableListOf()
        private var subscriptionId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            this.amount = invoiceListParams.amount
            this.amountGt = invoiceListParams.amountGt
            this.amountLt = invoiceListParams.amountLt
            this.cursor = invoiceListParams.cursor
            this.customerId = invoiceListParams.customerId
            this.dateType = invoiceListParams.dateType
            this.dueDate = invoiceListParams.dueDate
            this.dueDateWindow = invoiceListParams.dueDateWindow
            this.dueDateGt = invoiceListParams.dueDateGt
            this.dueDateLt = invoiceListParams.dueDateLt
            this.externalCustomerId = invoiceListParams.externalCustomerId
            this.invoiceDateGt = invoiceListParams.invoiceDateGt
            this.invoiceDateGte = invoiceListParams.invoiceDateGte
            this.invoiceDateLt = invoiceListParams.invoiceDateLt
            this.invoiceDateLte = invoiceListParams.invoiceDateLte
            this.isRecurring = invoiceListParams.isRecurring
            this.limit = invoiceListParams.limit
            this.status(invoiceListParams.status ?: listOf())
            this.subscriptionId = invoiceListParams.subscriptionId
            additionalQueryParams(invoiceListParams.additionalQueryParams)
            additionalHeaders(invoiceListParams.additionalHeaders)
        }

        fun amount(amount: String) = apply {
            this.amount = amount
        }

        fun amountGt(amountGt: String) = apply {
            this.amountGt = amountGt
        }

        fun amountLt(amountLt: String) = apply {
            this.amountLt = amountLt
        }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned
         * from the initial request.
         */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        fun customerId(customerId: String) = apply {
            this.customerId = customerId
        }

        fun dateType(dateType: DateType) = apply {
            this.dateType = dateType
        }

        fun dueDate(dueDate: LocalDate) = apply {
            this.dueDate = dueDate
        }

        fun dueDateWindow(dueDateWindow: String) = apply {
            this.dueDateWindow = dueDateWindow
        }

        fun dueDateGt(dueDateGt: LocalDate) = apply {
            this.dueDateGt = dueDateGt
        }

        fun dueDateLt(dueDateLt: LocalDate) = apply {
            this.dueDateLt = dueDateLt
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun invoiceDateGt(invoiceDateGt: OffsetDateTime) = apply {
            this.invoiceDateGt = invoiceDateGt
        }

        fun invoiceDateGte(invoiceDateGte: OffsetDateTime) = apply {
            this.invoiceDateGte = invoiceDateGte
        }

        fun invoiceDateLt(invoiceDateLt: OffsetDateTime) = apply {
            this.invoiceDateLt = invoiceDateLt
        }

        fun invoiceDateLte(invoiceDateLte: OffsetDateTime) = apply {
            this.invoiceDateLte = invoiceDateLte
        }

        fun isRecurring(isRecurring: Boolean) = apply {
            this.isRecurring = isRecurring
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        fun status(status: List<Status>) = apply {
            this.status.clear()
            this.status.addAll(status)
        }

        fun addStatus(status: Status) = apply {
            this.status.add(status)
        }

        fun subscriptionId(subscriptionId: String) = apply {
            this.subscriptionId = subscriptionId
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

        fun build(): InvoiceListParams = InvoiceListParams(
            amount,
            amountGt,
            amountLt,
            cursor,
            customerId,
            dateType,
            dueDate,
            dueDateWindow,
            dueDateGt,
            dueDateLt,
            externalCustomerId,
            invoiceDateGt,
            invoiceDateGte,
            invoiceDateLt,
            invoiceDateLte,
            isRecurring,
            limit,
            if(status.size == 0) null else status.toUnmodifiable(),
            subscriptionId,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    class DateType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is DateType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DUE_DATE = DateType(JsonField.of("due_date"))

            val INVOICE_DATE = DateType(JsonField.of("invoice_date"))

            fun of(value: String) = DateType(JsonField.of(value))
        }

        enum class Known {
            DUE_DATE,
            INVOICE_DATE,
        }

        enum class Value {
            DUE_DATE,
            INVOICE_DATE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            DUE_DATE -> Value.DUE_DATE
            INVOICE_DATE -> Value.INVOICE_DATE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            DUE_DATE -> Known.DUE_DATE
            INVOICE_DATE -> Known.INVOICE_DATE
            else -> throw OrbInvalidDataException("Unknown DateType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DRAFT = Status(JsonField.of("draft"))

            val ISSUED = Status(JsonField.of("issued"))

            val PAID = Status(JsonField.of("paid"))

            val SYNCED = Status(JsonField.of("synced"))

            val VOID = Status(JsonField.of("void"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
        }

        enum class Value {
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            DRAFT -> Value.DRAFT
            ISSUED -> Value.ISSUED
            PAID -> Value.PAID
            SYNCED -> Value.SYNCED
            VOID -> Value.VOID
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            DRAFT -> Known.DRAFT
            ISSUED -> Known.ISSUED
            PAID -> Known.PAID
            SYNCED -> Known.SYNCED
            VOID -> Known.VOID
            else -> throw OrbInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
