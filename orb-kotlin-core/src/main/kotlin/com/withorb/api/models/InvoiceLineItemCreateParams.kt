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

class InvoiceLineItemCreateParams
constructor(
    private val amount: String,
    private val endDate: LocalDate,
    private val invoiceId: String,
    private val name: String,
    private val quantity: Double,
    private val startDate: LocalDate,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): String = amount

    fun endDate(): LocalDate = endDate

    fun invoiceId(): String = invoiceId

    fun name(): String = name

    fun quantity(): Double = quantity

    fun startDate(): LocalDate = startDate

    internal fun getBody(): InvoiceLineItemCreateBody {
        return InvoiceLineItemCreateBody(
            amount,
            endDate,
            invoiceId,
            name,
            quantity,
            startDate,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = InvoiceLineItemCreateBody.Builder::class)
    @NoAutoDetect
    class InvoiceLineItemCreateBody
    internal constructor(
        private val amount: String?,
        private val endDate: LocalDate?,
        private val invoiceId: String?,
        private val name: String?,
        private val quantity: Double?,
        private val startDate: LocalDate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The total amount in the invoice's currency to add to the line item. */
        @JsonProperty("amount") fun amount(): String? = amount

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") fun endDate(): LocalDate? = endDate

        /** The id of the Invoice to add this line item. */
        @JsonProperty("invoice_id") fun invoiceId(): String? = invoiceId

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        @JsonProperty("name") fun name(): String? = name

        /** The number of units on the line item */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date") fun startDate(): LocalDate? = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: String? = null
            private var endDate: LocalDate? = null
            private var invoiceId: String? = null
            private var name: String? = null
            private var quantity: Double? = null
            private var startDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceLineItemCreateBody: InvoiceLineItemCreateBody) = apply {
                this.amount = invoiceLineItemCreateBody.amount
                this.endDate = invoiceLineItemCreateBody.endDate
                this.invoiceId = invoiceLineItemCreateBody.invoiceId
                this.name = invoiceLineItemCreateBody.name
                this.quantity = invoiceLineItemCreateBody.quantity
                this.startDate = invoiceLineItemCreateBody.startDate
                additionalProperties(invoiceLineItemCreateBody.additionalProperties)
            }

            /** The total amount in the invoice's currency to add to the line item. */
            @JsonProperty("amount") fun amount(amount: String) = apply { this.amount = amount }

            /** A date string to specify the line item's end date in the customer's timezone. */
            @JsonProperty("end_date")
            fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

            /** The id of the Invoice to add this line item. */
            @JsonProperty("invoice_id")
            fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

            /**
             * The item name associated with this line item. If an item with the same name exists in
             * Orb, that item will be associated with the line item.
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The number of units on the line item */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** A date string to specify the line item's start date in the customer's timezone. */
            @JsonProperty("start_date")
            fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

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

            fun build(): InvoiceLineItemCreateBody =
                InvoiceLineItemCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemCreateBody && this.amount == other.amount && this.endDate == other.endDate && this.invoiceId == other.invoiceId && this.name == other.name && this.quantity == other.quantity && this.startDate == other.startDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, endDate, invoiceId, name, quantity, startDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceLineItemCreateBody{amount=$amount, endDate=$endDate, invoiceId=$invoiceId, name=$name, quantity=$quantity, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateParams && this.amount == other.amount && this.endDate == other.endDate && this.invoiceId == other.invoiceId && this.name == other.name && this.quantity == other.quantity && this.startDate == other.startDate && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, endDate, invoiceId, name, quantity, startDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InvoiceLineItemCreateParams{amount=$amount, endDate=$endDate, invoiceId=$invoiceId, name=$name, quantity=$quantity, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: String? = null
        private var endDate: LocalDate? = null
        private var invoiceId: String? = null
        private var name: String? = null
        private var quantity: Double? = null
        private var startDate: LocalDate? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreateParams: InvoiceLineItemCreateParams) = apply {
            this.amount = invoiceLineItemCreateParams.amount
            this.endDate = invoiceLineItemCreateParams.endDate
            this.invoiceId = invoiceLineItemCreateParams.invoiceId
            this.name = invoiceLineItemCreateParams.name
            this.quantity = invoiceLineItemCreateParams.quantity
            this.startDate = invoiceLineItemCreateParams.startDate
            additionalHeaders(invoiceLineItemCreateParams.additionalHeaders)
            additionalQueryParams(invoiceLineItemCreateParams.additionalQueryParams)
            additionalBodyProperties(invoiceLineItemCreateParams.additionalBodyProperties)
        }

        /** The total amount in the invoice's currency to add to the line item. */
        fun amount(amount: String) = apply { this.amount = amount }

        /** A date string to specify the line item's end date in the customer's timezone. */
        fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

        /** The id of the Invoice to add this line item. */
        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        fun name(name: String) = apply { this.name = name }

        /** The number of units on the line item */
        fun quantity(quantity: Double) = apply { this.quantity = quantity }

        /** A date string to specify the line item's start date in the customer's timezone. */
        fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

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

        fun build(): InvoiceLineItemCreateParams =
            InvoiceLineItemCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(endDate) { "`endDate` is required but was not set" },
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(startDate) { "`startDate` is required but was not set" },
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
