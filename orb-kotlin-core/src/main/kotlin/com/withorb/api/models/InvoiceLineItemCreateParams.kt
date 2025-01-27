// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/**
 * This creates a one-off fixed fee invoice line item on an Invoice. This can only be done for
 * invoices that are in a `draft` status.
 */
class InvoiceLineItemCreateParams
private constructor(
    private val body: InvoiceLineItemCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The total amount in the invoice's currency to add to the line item. */
    fun amount(): String = body.amount()

    /** A date string to specify the line item's end date in the customer's timezone. */
    fun endDate(): LocalDate = body.endDate()

    /** The id of the Invoice to add this line item. */
    fun invoiceId(): String = body.invoiceId()

    /**
     * The item name associated with this line item. If an item with the same name exists in Orb,
     * that item will be associated with the line item.
     */
    fun name(): String = body.name()

    /** The number of units on the line item */
    fun quantity(): Double = body.quantity()

    /** A date string to specify the line item's start date in the customer's timezone. */
    fun startDate(): LocalDate = body.startDate()

    /** The total amount in the invoice's currency to add to the line item. */
    fun _amount(): JsonField<String> = body._amount()

    /** A date string to specify the line item's end date in the customer's timezone. */
    fun _endDate(): JsonField<LocalDate> = body._endDate()

    /** The id of the Invoice to add this line item. */
    fun _invoiceId(): JsonField<String> = body._invoiceId()

    /**
     * The item name associated with this line item. If an item with the same name exists in Orb,
     * that item will be associated with the line item.
     */
    fun _name(): JsonField<String> = body._name()

    /** The number of units on the line item */
    fun _quantity(): JsonField<Double> = body._quantity()

    /** A date string to specify the line item's start date in the customer's timezone. */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): InvoiceLineItemCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceLineItemCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The total amount in the invoice's currency to add to the line item. */
        fun amount(): String = amount.getRequired("amount")

        /** A date string to specify the line item's end date in the customer's timezone. */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /** The id of the Invoice to add this line item. */
        fun invoiceId(): String = invoiceId.getRequired("invoice_id")

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        fun name(): String = name.getRequired("name")

        /** The number of units on the line item */
        fun quantity(): Double = quantity.getRequired("quantity")

        /** A date string to specify the line item's start date in the customer's timezone. */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /** The total amount in the invoice's currency to add to the line item. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /** The id of the Invoice to add this line item. */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The number of units on the line item */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceLineItemCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            endDate()
            invoiceId()
            name()
            quantity()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InvoiceLineItemCreateBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<String>? = null
            private var endDate: JsonField<LocalDate>? = null
            private var invoiceId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var startDate: JsonField<LocalDate>? = null
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
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The total amount in the invoice's currency to add to the line item. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** A date string to specify the line item's end date in the customer's timezone. */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /** A date string to specify the line item's end date in the customer's timezone. */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** The id of the Invoice to add this line item. */
            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /** The id of the Invoice to add this line item. */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            /**
             * The item name associated with this line item. If an item with the same name exists in
             * Orb, that item will be associated with the line item.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * The item name associated with this line item. If an item with the same name exists in
             * Orb, that item will be associated with the line item.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The number of units on the line item */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** The number of units on the line item */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** A date string to specify the line item's start date in the customer's timezone. */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /** A date string to specify the line item's start date in the customer's timezone. */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

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
                    checkRequired("amount", amount),
                    checkRequired("endDate", endDate),
                    checkRequired("invoiceId", invoiceId),
                    checkRequired("name", name),
                    checkRequired("quantity", quantity),
                    checkRequired("startDate", startDate),
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

    /** A builder for [InvoiceLineItemCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: InvoiceLineItemCreateBody.Builder = InvoiceLineItemCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceLineItemCreateParams: InvoiceLineItemCreateParams) = apply {
            body = invoiceLineItemCreateParams.body.toBuilder()
            additionalHeaders = invoiceLineItemCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceLineItemCreateParams.additionalQueryParams.toBuilder()
        }

        /** The total amount in the invoice's currency to add to the line item. */
        fun amount(amount: String) = apply { body.amount(amount) }

        /** The total amount in the invoice's currency to add to the line item. */
        fun amount(amount: JsonField<String>) = apply { body.amount(amount) }

        /** A date string to specify the line item's end date in the customer's timezone. */
        fun endDate(endDate: LocalDate) = apply { body.endDate(endDate) }

        /** A date string to specify the line item's end date in the customer's timezone. */
        fun endDate(endDate: JsonField<LocalDate>) = apply { body.endDate(endDate) }

        /** The id of the Invoice to add this line item. */
        fun invoiceId(invoiceId: String) = apply { body.invoiceId(invoiceId) }

        /** The id of the Invoice to add this line item. */
        fun invoiceId(invoiceId: JsonField<String>) = apply { body.invoiceId(invoiceId) }

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * The item name associated with this line item. If an item with the same name exists in
         * Orb, that item will be associated with the line item.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The number of units on the line item */
        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

        /** The number of units on the line item */
        fun quantity(quantity: JsonField<Double>) = apply { body.quantity(quantity) }

        /** A date string to specify the line item's start date in the customer's timezone. */
        fun startDate(startDate: LocalDate) = apply { body.startDate(startDate) }

        /** A date string to specify the line item's start date in the customer's timezone. */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): InvoiceLineItemCreateParams =
            InvoiceLineItemCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
