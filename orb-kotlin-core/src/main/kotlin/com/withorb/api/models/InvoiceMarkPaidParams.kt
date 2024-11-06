// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
import java.time.LocalDate
import java.util.Objects

class InvoiceMarkPaidParams
constructor(
    private val invoiceId: String,
    private val paymentReceivedDate: LocalDate,
    private val externalId: String?,
    private val notes: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> invoiceId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InvoiceMarkPaidBody.Builder::class)
    @NoAutoDetect
    class InvoiceMarkPaidBody
    internal constructor(
        private val paymentReceivedDate: LocalDate?,
        private val externalId: String?,
        private val notes: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A date string to specify the date of the payment. */
        @JsonProperty("payment_received_date")
        fun paymentReceivedDate(): LocalDate? = paymentReceivedDate

        /** An optional external ID to associate with the payment. */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /** An optional note to associate with the payment. */
        @JsonProperty("notes") fun notes(): String? = notes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
            fun externalId(externalId: String) = apply { this.externalId = externalId }

            /** An optional note to associate with the payment. */
            @JsonProperty("notes") fun notes(notes: String) = apply { this.notes = notes }

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

            fun build(): InvoiceMarkPaidBody =
                InvoiceMarkPaidBody(
                    checkNotNull(paymentReceivedDate) {
                        "`paymentReceivedDate` is required but was not set"
                    },
                    externalId,
                    notes,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceMarkPaidBody && this.paymentReceivedDate == other.paymentReceivedDate && this.externalId == other.externalId && this.notes == other.notes && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(paymentReceivedDate, externalId, notes, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceMarkPaidBody{paymentReceivedDate=$paymentReceivedDate, externalId=$externalId, notes=$notes, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceMarkPaidParams && this.invoiceId == other.invoiceId && this.paymentReceivedDate == other.paymentReceivedDate && this.externalId == other.externalId && this.notes == other.notes && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(invoiceId, paymentReceivedDate, externalId, notes, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InvoiceMarkPaidParams{invoiceId=$invoiceId, paymentReceivedDate=$paymentReceivedDate, externalId=$externalId, notes=$notes, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceMarkPaidParams: InvoiceMarkPaidParams) = apply {
            this.invoiceId = invoiceMarkPaidParams.invoiceId
            this.paymentReceivedDate = invoiceMarkPaidParams.paymentReceivedDate
            this.externalId = invoiceMarkPaidParams.externalId
            this.notes = invoiceMarkPaidParams.notes
            additionalHeaders(invoiceMarkPaidParams.additionalHeaders)
            additionalQueryParams(invoiceMarkPaidParams.additionalQueryParams)
            additionalBodyProperties(invoiceMarkPaidParams.additionalBodyProperties)
        }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        /** A date string to specify the date of the payment. */
        fun paymentReceivedDate(paymentReceivedDate: LocalDate) = apply {
            this.paymentReceivedDate = paymentReceivedDate
        }

        /** An optional external ID to associate with the payment. */
        fun externalId(externalId: String) = apply { this.externalId = externalId }

        /** An optional note to associate with the payment. */
        fun notes(notes: String) = apply { this.notes = notes }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): InvoiceMarkPaidParams =
            InvoiceMarkPaidParams(
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                checkNotNull(paymentReceivedDate) {
                    "`paymentReceivedDate` is required but was not set"
                },
                externalId,
                notes,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
