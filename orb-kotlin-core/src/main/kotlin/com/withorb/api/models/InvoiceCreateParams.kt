// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/** This endpoint is used to create a one-off invoice for a customer. */
class InvoiceCreateParams
private constructor(
    private val body: InvoiceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** An ISO 4217 currency string. Must be the same as the customer's currency if it is set. */
    fun currency(): String = body.currency()

    /**
     * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to the
     * current time in the customer's timezone.
     */
    fun invoiceDate(): OffsetDateTime = body.invoiceDate()

    fun lineItems(): List<LineItem> = body.lineItems()

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of '0' here represents that the invoice is due on issue,
     * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
     */
    fun netTerms(): Long = body.netTerms()

    /**
     * The id of the `Customer` to create this invoice for. One of `customer_id` and
     * `external_customer_id` are required.
     */
    fun customerId(): String? = body.customerId()

    /** An optional discount to attach to the invoice. */
    fun discount(): Discount? = body.discount()

    /**
     * The `external_customer_id` of the `Customer` to create this invoice for. One of `customer_id`
     * and `external_customer_id` are required.
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /** An optional memo to attach to the invoice. */
    fun memo(): String? = body.memo()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * When true, this invoice will automatically be issued upon creation. When false, the resulting
     * invoice will require manual review to issue. Defaulted to false.
     */
    fun willAutoIssue(): Boolean? = body.willAutoIssue()

    /** An ISO 4217 currency string. Must be the same as the customer's currency if it is set. */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to the
     * current time in the customer's timezone.
     */
    fun _invoiceDate(): JsonField<OffsetDateTime> = body._invoiceDate()

    fun _lineItems(): JsonField<List<LineItem>> = body._lineItems()

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of '0' here represents that the invoice is due on issue,
     * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
     */
    fun _netTerms(): JsonField<Long> = body._netTerms()

    /**
     * The id of the `Customer` to create this invoice for. One of `customer_id` and
     * `external_customer_id` are required.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /** An optional discount to attach to the invoice. */
    fun _discount(): JsonField<Discount> = body._discount()

    /**
     * The `external_customer_id` of the `Customer` to create this invoice for. One of `customer_id`
     * and `external_customer_id` are required.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /** An optional memo to attach to the invoice. */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * When true, this invoice will automatically be issued upon creation. When false, the resulting
     * invoice will require manual review to issue. Defaulted to false.
     */
    fun _willAutoIssue(): JsonField<Boolean> = body._willAutoIssue()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): InvoiceCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_date")
        @ExcludeMissing
        private val invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line_items")
        @ExcludeMissing
        private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("net_terms")
        @ExcludeMissing
        private val netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount")
        @ExcludeMissing
        private val discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("will_auto_issue")
        @ExcludeMissing
        private val willAutoIssue: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        fun invoiceDate(): OffsetDateTime = invoiceDate.getRequired("invoice_date")

        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        fun netTerms(): Long = netTerms.getRequired("net_terms")

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /** An optional discount to attach to the invoice. */
        fun discount(): Discount? = discount.getNullable("discount")

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /** An optional memo to attach to the invoice. */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        fun willAutoIssue(): Boolean? = willAutoIssue.getNullable("will_auto_issue")

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** An optional discount to attach to the invoice. */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /** An optional memo to attach to the invoice. */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        @JsonProperty("will_auto_issue")
        @ExcludeMissing
        fun _willAutoIssue(): JsonField<Boolean> = willAutoIssue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceCreateBody = apply {
            if (validated) {
                return@apply
            }

            currency()
            invoiceDate()
            lineItems().forEach { it.validate() }
            netTerms()
            customerId()
            discount()?.validate()
            externalCustomerId()
            memo()
            metadata()?.validate()
            willAutoIssue()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InvoiceCreateBody]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var invoiceDate: JsonField<OffsetDateTime>? = null
            private var lineItems: JsonField<MutableList<LineItem>>? = null
            private var netTerms: JsonField<Long>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var willAutoIssue: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                currency = invoiceCreateBody.currency
                invoiceDate = invoiceCreateBody.invoiceDate
                lineItems = invoiceCreateBody.lineItems.map { it.toMutableList() }
                netTerms = invoiceCreateBody.netTerms
                customerId = invoiceCreateBody.customerId
                discount = invoiceCreateBody.discount
                externalCustomerId = invoiceCreateBody.externalCustomerId
                memo = invoiceCreateBody.memo
                metadata = invoiceCreateBody.metadata
                willAutoIssue = invoiceCreateBody.willAutoIssue
                additionalProperties = invoiceCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * An ISO 4217 currency string. Must be the same as the customer's currency if it is
             * set.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * An ISO 4217 currency string. Must be the same as the customer's currency if it is
             * set.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set
             * to the current time in the customer's timezone.
             */
            fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

            /**
             * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set
             * to the current time in the customer's timezone.
             */
            fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
                this.invoiceDate = invoiceDate
            }

            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(lineItem)
                    }
            }

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of '0' here represents that the invoice is due on
             * issue, whereas a value of 30 represents that the customer has 30 days to pay the
             * invoice.
             */
            fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of '0' here represents that the invoice is due on
             * issue, whereas a value of 30 represents that the customer has 30 days to pay the
             * invoice.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

            /**
             * The id of the `Customer` to create this invoice for. One of `customer_id` and
             * `external_customer_id` are required.
             */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * The id of the `Customer` to create this invoice for. One of `customer_id` and
             * `external_customer_id` are required.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** An optional discount to attach to the invoice. */
            fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

            /** An optional discount to attach to the invoice. */
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            /** An optional discount to attach to the invoice. */
            fun discount(percentage: PercentageDiscount) =
                discount(Discount.ofPercentage(percentage))

            /** An optional discount to attach to the invoice. */
            fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

            /** An optional discount to attach to the invoice. */
            fun discount(usage: Discount.UsageDiscount) = discount(Discount.ofUsage(usage))

            /** An optional discount to attach to the invoice. */
            fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

            /**
             * The `external_customer_id` of the `Customer` to create this invoice for. One of
             * `customer_id` and `external_customer_id` are required.
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * The `external_customer_id` of the `Customer` to create this invoice for. One of
             * `customer_id` and `external_customer_id` are required.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** An optional memo to attach to the invoice. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** An optional memo to attach to the invoice. */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * When true, this invoice will automatically be issued upon creation. When false, the
             * resulting invoice will require manual review to issue. Defaulted to false.
             */
            fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

            /**
             * When true, this invoice will automatically be issued upon creation. When false, the
             * resulting invoice will require manual review to issue. Defaulted to false.
             */
            fun willAutoIssue(willAutoIssue: JsonField<Boolean>) = apply {
                this.willAutoIssue = willAutoIssue
            }

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

            fun build(): InvoiceCreateBody =
                InvoiceCreateBody(
                    checkRequired("currency", currency),
                    checkRequired("invoiceDate", invoiceDate),
                    checkRequired("lineItems", lineItems).map { it.toImmutable() },
                    checkRequired("netTerms", netTerms),
                    customerId,
                    discount,
                    externalCustomerId,
                    memo,
                    metadata,
                    willAutoIssue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceCreateBody && currency == other.currency && invoiceDate == other.invoiceDate && lineItems == other.lineItems && netTerms == other.netTerms && customerId == other.customerId && discount == other.discount && externalCustomerId == other.externalCustomerId && memo == other.memo && metadata == other.metadata && willAutoIssue == other.willAutoIssue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, invoiceDate, lineItems, netTerms, customerId, discount, externalCustomerId, memo, metadata, willAutoIssue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceCreateBody{currency=$currency, invoiceDate=$invoiceDate, lineItems=$lineItems, netTerms=$netTerms, customerId=$customerId, discount=$discount, externalCustomerId=$externalCustomerId, memo=$memo, metadata=$metadata, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InvoiceCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: InvoiceCreateBody.Builder = InvoiceCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            body = invoiceCreateParams.body.toBuilder()
            additionalHeaders = invoiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { body.invoiceDate(invoiceDate) }

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
            body.invoiceDate(invoiceDate)
        }

        fun lineItems(lineItems: List<LineItem>) = apply { body.lineItems(lineItems) }

        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { body.lineItems(lineItems) }

        fun addLineItem(lineItem: LineItem) = apply { body.addLineItem(lineItem) }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        fun netTerms(netTerms: Long) = apply { body.netTerms(netTerms) }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { body.netTerms(netTerms) }

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** An optional discount to attach to the invoice. */
        fun discount(discount: Discount?) = apply { body.discount(discount) }

        /** An optional discount to attach to the invoice. */
        fun discount(discount: JsonField<Discount>) = apply { body.discount(discount) }

        /** An optional discount to attach to the invoice. */
        fun discount(percentage: PercentageDiscount) = apply { body.discount(percentage) }

        /** An optional discount to attach to the invoice. */
        fun discount(trial: TrialDiscount) = apply { body.discount(trial) }

        /** An optional discount to attach to the invoice. */
        fun discount(usage: Discount.UsageDiscount) = apply { body.discount(usage) }

        /** An optional discount to attach to the invoice. */
        fun discount(amount: AmountDiscount) = apply { body.discount(amount) }

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** An optional memo to attach to the invoice. */
        fun memo(memo: String?) = apply { body.memo(memo) }

        /** An optional memo to attach to the invoice. */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = apply { body.willAutoIssue(willAutoIssue) }

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        fun willAutoIssue(willAutoIssue: JsonField<Boolean>) = apply {
            body.willAutoIssue(willAutoIssue)
        }

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

        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("item_id")
        @ExcludeMissing
        private val itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        private val modelType: JsonField<ModelType> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("unit_config")
        @ExcludeMissing
        private val unitConfig: JsonField<UnitConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A date string to specify the line item's end date in the customer's timezone. */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        fun itemId(): String = itemId.getRequired("item_id")

        fun modelType(): ModelType = modelType.getRequired("model_type")

        /** The name of the line item. */
        fun name(): String = name.getRequired("name")

        /** The number of units on the line item */
        fun quantity(): Double = quantity.getRequired("quantity")

        /** A date string to specify the line item's start date in the customer's timezone. */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        fun unitConfig(): UnitConfig = unitConfig.getRequired("unit_config")

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

        @JsonProperty("model_type")
        @ExcludeMissing
        fun _modelType(): JsonField<ModelType> = modelType

        /** The name of the line item. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The number of units on the line item */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        @JsonProperty("unit_config")
        @ExcludeMissing
        fun _unitConfig(): JsonField<UnitConfig> = unitConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            endDate()
            itemId()
            modelType()
            name()
            quantity()
            startDate()
            unitConfig().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var endDate: JsonField<LocalDate>? = null
            private var itemId: JsonField<String>? = null
            private var modelType: JsonField<ModelType>? = null
            private var name: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var unitConfig: JsonField<UnitConfig>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItem: LineItem) = apply {
                endDate = lineItem.endDate
                itemId = lineItem.itemId
                modelType = lineItem.modelType
                name = lineItem.name
                quantity = lineItem.quantity
                startDate = lineItem.startDate
                unitConfig = lineItem.unitConfig
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** A date string to specify the line item's end date in the customer's timezone. */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /** A date string to specify the line item's end date in the customer's timezone. */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            fun itemId(itemId: String) = itemId(JsonField.of(itemId))

            fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            /** The name of the line item. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the line item. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The number of units on the line item */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** The number of units on the line item */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** A date string to specify the line item's start date in the customer's timezone. */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /** A date string to specify the line item's start date in the customer's timezone. */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            fun unitConfig(unitConfig: UnitConfig) = unitConfig(JsonField.of(unitConfig))

            fun unitConfig(unitConfig: JsonField<UnitConfig>) = apply {
                this.unitConfig = unitConfig
            }

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

            fun build(): LineItem =
                LineItem(
                    checkRequired("endDate", endDate),
                    checkRequired("itemId", itemId),
                    checkRequired("modelType", modelType),
                    checkRequired("name", name),
                    checkRequired("quantity", quantity),
                    checkRequired("startDate", startDate),
                    checkRequired("unitConfig", unitConfig),
                    additionalProperties.toImmutable(),
                )
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNIT = of("unit")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            /** An enum containing [ModelType]'s known values. */
            enum class Known {
                UNIT,
            }

            /**
             * An enum containing [ModelType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ModelType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNIT,
                /**
                 * An enum member indicating that [ModelType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UNIT -> Value.UNIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    UNIT -> Known.UNIT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class UnitConfig
        @JsonCreator
        private constructor(
            @JsonProperty("unit_amount")
            @ExcludeMissing
            private val unitAmount: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Rate per unit of usage */
            fun unitAmount(): String = unitAmount.getRequired("unit_amount")

            /** Rate per unit of usage */
            @JsonProperty("unit_amount")
            @ExcludeMissing
            fun _unitAmount(): JsonField<String> = unitAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnitConfig = apply {
                if (validated) {
                    return@apply
                }

                unitAmount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [UnitConfig]. */
            class Builder internal constructor() {

                private var unitAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitConfig: UnitConfig) = apply {
                    unitAmount = unitConfig.unitAmount
                    additionalProperties = unitConfig.additionalProperties.toMutableMap()
                }

                /** Rate per unit of usage */
                fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                /** Rate per unit of usage */
                fun unitAmount(unitAmount: JsonField<String>) = apply {
                    this.unitAmount = unitAmount
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): UnitConfig =
                    UnitConfig(
                        checkRequired("unitAmount", unitAmount),
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitConfig && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(unitAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && endDate == other.endDate && itemId == other.itemId && modelType == other.modelType && name == other.name && quantity == other.quantity && startDate == other.startDate && unitConfig == other.unitConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, itemId, modelType, name, quantity, startDate, unitConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{endDate=$endDate, itemId=$itemId, modelType=$modelType, name=$name, quantity=$quantity, startDate=$startDate, unitConfig=$unitConfig, additionalProperties=$additionalProperties}"
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
