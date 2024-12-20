// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): String = amount

    fun endDate(): LocalDate = endDate

    fun invoiceId(): String = invoiceId

    fun name(): String = name

    fun quantity(): Double = quantity

    fun startDate(): LocalDate = startDate

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceLineItemCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: String,
        @JsonProperty("end_date") private val endDate: LocalDate,
        @JsonProperty("invoice_id") private val invoiceId: String,
        @JsonProperty("name") private val name: String,
        @JsonProperty("quantity") private val quantity: Double,
        @JsonProperty("start_date") private val startDate: LocalDate,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The total amount in the invoice's currency to add to the line item. */
        @JsonProperty("amount") fun amount(): String = amount

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") fun endDate(): LocalDate = endDate

        /** The id of the Invoice to add this line item. */
        @JsonProperty("invoice_id") fun invoiceId(): String = invoiceId

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        @JsonProperty("name") fun name(): String = name

        /** The number of units on the line item */
        @JsonProperty("quantity") fun quantity(): Double = quantity

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date") fun startDate(): LocalDate = startDate

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
                amount = invoiceLineItemCreateBody.amount
                endDate = invoiceLineItemCreateBody.endDate
                invoiceId = invoiceLineItemCreateBody.invoiceId
                name = invoiceLineItemCreateBody.name
                quantity = invoiceLineItemCreateBody.quantity
                startDate = invoiceLineItemCreateBody.startDate
                additionalProperties = invoiceLineItemCreateBody.additionalProperties.toMutableMap()
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

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
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

            return /* spotless:off */ other is InvoiceLineItemCreateBody && amount == other.amount && endDate == other.endDate && invoiceId == other.invoiceId && name == other.name && quantity == other.quantity && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, endDate, invoiceId, name, quantity, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemCreateBody{amount=$amount, endDate=$endDate, invoiceId=$invoiceId, name=$name, quantity=$quantity, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreateParams: InvoiceLineItemCreateParams) = apply {
            amount = invoiceLineItemCreateParams.amount
            endDate = invoiceLineItemCreateParams.endDate
            invoiceId = invoiceLineItemCreateParams.invoiceId
            name = invoiceLineItemCreateParams.name
            quantity = invoiceLineItemCreateParams.quantity
            startDate = invoiceLineItemCreateParams.startDate
            additionalHeaders = invoiceLineItemCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceLineItemCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                invoiceLineItemCreateParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): InvoiceLineItemCreateParams =
            InvoiceLineItemCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(endDate) { "`endDate` is required but was not set" },
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(startDate) { "`startDate` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateParams && amount == other.amount && endDate == other.endDate && invoiceId == other.invoiceId && name == other.name && quantity == other.quantity && startDate == other.startDate && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, endDate, invoiceId, name, quantity, startDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemCreateParams{amount=$amount, endDate=$endDate, invoiceId=$invoiceId, name=$name, quantity=$quantity, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
