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

class SubscriptionUpdateParams constructor(
  private val subscriptionId: String,
  private val autoCollection: Boolean?,
  private val defaultInvoiceMemo: String?,
  private val invoicingThreshold: String?,
  private val metadata: Metadata?,
  private val netTerms: Long?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun subscriptionId(): String = subscriptionId

    fun autoCollection(): Boolean? = autoCollection

    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo

    fun invoicingThreshold(): String? = invoicingThreshold

    fun metadata(): Metadata? = metadata

    fun netTerms(): Long? = netTerms

    internal fun getBody(): SubscriptionUpdateBody {
      return SubscriptionUpdateBody(
          autoCollection,
          defaultInvoiceMemo,
          invoicingThreshold,
          metadata,
          netTerms,
          additionalBodyProperties,
      )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> subscriptionId
          else -> ""
      }
    }

    @JsonDeserialize(builder = SubscriptionUpdateBody.Builder::class)
    @NoAutoDetect
    class SubscriptionUpdateBody internal constructor(
      private val autoCollection: Boolean?,
      private val defaultInvoiceMemo: String?,
      private val invoicingThreshold: String?,
      private val metadata: Metadata?,
      private val netTerms: Long?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /**
         * Determines whether issued invoices for this subscription will automatically be
         * charged with the saved payment method on the due date. This property defaults to
         * the plan's behavior.
         */
        @JsonProperty("auto_collection")
        fun autoCollection(): Boolean? = autoCollection

        /**
         * Determines the default memo on this subscription's invoices. Note that if this
         * is not provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo")
        fun defaultInvoiceMemo(): String? = defaultInvoiceMemo

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will
         * be issued for the subscription. If not specified, invoices will only be issued
         * at the end of the billing period.
         */
        @JsonProperty("invoicing_threshold")
        fun invoicingThreshold(): String? = invoicingThreshold

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed
         * by setting the value to `null`, and the entire metadata mapping can be cleared
         * by setting `metadata` to `null`.
         */
        @JsonProperty("metadata")
        fun metadata(): Metadata? = metadata

        /**
         * Determines the difference between the invoice issue date for subscription
         * invoices as the date that they are due. A value of `0` here represents that the
         * invoice is due on issue, whereas a value of `30` represents that the customer
         * has a month to pay the invoice.
         */
        @JsonProperty("net_terms")
        fun netTerms(): Long? = netTerms

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is SubscriptionUpdateBody &&
              this.autoCollection == other.autoCollection &&
              this.defaultInvoiceMemo == other.defaultInvoiceMemo &&
              this.invoicingThreshold == other.invoicingThreshold &&
              this.metadata == other.metadata &&
              this.netTerms == other.netTerms &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                autoCollection,
                defaultInvoiceMemo,
                invoicingThreshold,
                metadata,
                netTerms,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "SubscriptionUpdateBody{autoCollection=$autoCollection, defaultInvoiceMemo=$defaultInvoiceMemo, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var autoCollection: Boolean? = null
            private var defaultInvoiceMemo: String? = null
            private var invoicingThreshold: String? = null
            private var metadata: Metadata? = null
            private var netTerms: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionUpdateBody: SubscriptionUpdateBody) = apply {
                this.autoCollection = subscriptionUpdateBody.autoCollection
                this.defaultInvoiceMemo = subscriptionUpdateBody.defaultInvoiceMemo
                this.invoicingThreshold = subscriptionUpdateBody.invoicingThreshold
                this.metadata = subscriptionUpdateBody.metadata
                this.netTerms = subscriptionUpdateBody.netTerms
                additionalProperties(subscriptionUpdateBody.additionalProperties)
            }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. This property defaults to
             * the plan's behavior.
             */
            @JsonProperty("auto_collection")
            fun autoCollection(autoCollection: Boolean) = apply {
                this.autoCollection = autoCollection
            }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this
             * is not provided, it is determined by the plan configuration.
             */
            @JsonProperty("default_invoice_memo")
            fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will
             * be issued for the subscription. If not specified, invoices will only be issued
             * at the end of the billing period.
             */
            @JsonProperty("invoicing_threshold")
            fun invoicingThreshold(invoicingThreshold: String) = apply {
                this.invoicingThreshold = invoicingThreshold
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed
             * by setting the value to `null`, and the entire metadata mapping can be cleared
             * by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply {
                this.metadata = metadata
            }

            /**
             * Determines the difference between the invoice issue date for subscription
             * invoices as the date that they are due. A value of `0` here represents that the
             * invoice is due on issue, whereas a value of `30` represents that the customer
             * has a month to pay the invoice.
             */
            @JsonProperty("net_terms")
            fun netTerms(netTerms: Long) = apply {
                this.netTerms = netTerms
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

            fun build(): SubscriptionUpdateBody = SubscriptionUpdateBody(
                autoCollection,
                defaultInvoiceMemo,
                invoicingThreshold,
                metadata,
                netTerms,
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

      return other is SubscriptionUpdateParams &&
          this.subscriptionId == other.subscriptionId &&
          this.autoCollection == other.autoCollection &&
          this.defaultInvoiceMemo == other.defaultInvoiceMemo &&
          this.invoicingThreshold == other.invoicingThreshold &&
          this.metadata == other.metadata &&
          this.netTerms == other.netTerms &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          subscriptionId,
          autoCollection,
          defaultInvoiceMemo,
          invoicingThreshold,
          metadata,
          netTerms,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "SubscriptionUpdateParams{subscriptionId=$subscriptionId, autoCollection=$autoCollection, defaultInvoiceMemo=$defaultInvoiceMemo, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var autoCollection: Boolean? = null
        private var defaultInvoiceMemo: String? = null
        private var invoicingThreshold: String? = null
        private var metadata: Metadata? = null
        private var netTerms: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            this.subscriptionId = subscriptionUpdateParams.subscriptionId
            this.autoCollection = subscriptionUpdateParams.autoCollection
            this.defaultInvoiceMemo = subscriptionUpdateParams.defaultInvoiceMemo
            this.invoicingThreshold = subscriptionUpdateParams.invoicingThreshold
            this.metadata = subscriptionUpdateParams.metadata
            this.netTerms = subscriptionUpdateParams.netTerms
            additionalQueryParams(subscriptionUpdateParams.additionalQueryParams)
            additionalHeaders(subscriptionUpdateParams.additionalHeaders)
            additionalBodyProperties(subscriptionUpdateParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply {
            this.subscriptionId = subscriptionId
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be
         * charged with the saved payment method on the due date. This property defaults to
         * the plan's behavior.
         */
        fun autoCollection(autoCollection: Boolean) = apply {
            this.autoCollection = autoCollection
        }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this
         * is not provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will
         * be issued for the subscription. If not specified, invoices will only be issued
         * at the end of the billing period.
         */
        fun invoicingThreshold(invoicingThreshold: String) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed
         * by setting the value to `null`, and the entire metadata mapping can be cleared
         * by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply {
            this.metadata = metadata
        }

        /**
         * Determines the difference between the invoice issue date for subscription
         * invoices as the date that they are due. A value of `0` here represents that the
         * invoice is due on issue, whereas a value of `30` represents that the customer
         * has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long) = apply {
            this.netTerms = netTerms
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

        fun build(): SubscriptionUpdateParams = SubscriptionUpdateParams(
            checkNotNull(subscriptionId) {
                "`subscriptionId` is required but was not set"
            },
            autoCollection,
            defaultInvoiceMemo,
            invoicingThreshold,
            metadata,
            netTerms,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed
     * by setting the value to `null`, and the entire metadata mapping can be cleared
     * by setting `metadata` to `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Metadata &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
