// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class InvoiceCreateParams
constructor(
    private val body: InvoiceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): InvoiceCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("invoice_date") private val invoiceDate: OffsetDateTime,
        @JsonProperty("line_items") private val lineItems: List<LineItem>,
        @JsonProperty("net_terms") private val netTerms: Long,
        @JsonProperty("customer_id") private val customerId: String?,
        @JsonProperty("discount") private val discount: Discount?,
        @JsonProperty("external_customer_id") private val externalCustomerId: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("will_auto_issue") private val willAutoIssue: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        @JsonProperty("currency") fun currency(): String = currency

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        @JsonProperty("invoice_date") fun invoiceDate(): OffsetDateTime = invoiceDate

        @JsonProperty("line_items") fun lineItems(): List<LineItem> = lineItems

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        @JsonProperty("net_terms") fun netTerms(): Long = netTerms

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** An optional discount to attach to the invoice. */
        @JsonProperty("discount") fun discount(): Discount? = discount

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /** An optional memo to attach to the invoice. */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        @JsonProperty("will_auto_issue") fun willAutoIssue(): Boolean? = willAutoIssue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var invoiceDate: OffsetDateTime? = null
            private var lineItems: MutableList<LineItem>? = null
            private var netTerms: Long? = null
            private var customerId: String? = null
            private var discount: Discount? = null
            private var externalCustomerId: String? = null
            private var memo: String? = null
            private var metadata: Metadata? = null
            private var willAutoIssue: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                currency = invoiceCreateBody.currency
                invoiceDate = invoiceCreateBody.invoiceDate
                lineItems = invoiceCreateBody.lineItems.toMutableList()
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
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set
             * to the current time in the customer's timezone.
             */
            fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

            fun lineItems(lineItems: List<LineItem>) = apply {
                this.lineItems = lineItems.toMutableList()
            }

            fun addLineItem(lineItem: LineItem) = apply {
                lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
            }

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of '0' here represents that the invoice is due on
             * issue, whereas a value of 30 represents that the customer has 30 days to pay the
             * invoice.
             */
            fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

            /**
             * The id of the `Customer` to create this invoice for. One of `customer_id` and
             * `external_customer_id` are required.
             */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** An optional discount to attach to the invoice. */
            fun discount(discount: Discount) = apply { this.discount = discount }

            fun discount(percentageDiscount: PercentageDiscount) = apply {
                this.discount = Discount.ofPercentageDiscount(percentageDiscount)
            }

            fun discount(trialDiscount: TrialDiscount) = apply {
                this.discount = Discount.ofTrialDiscount(trialDiscount)
            }

            fun discount(usageDiscount: Discount.UsageDiscount) = apply {
                this.discount = Discount.ofUsageDiscount(usageDiscount)
            }

            fun discount(amountDiscount: AmountDiscount) = apply {
                this.discount = Discount.ofAmountDiscount(amountDiscount)
            }

            /**
             * The `external_customer_id` of the `Customer` to create this invoice for. One of
             * `customer_id` and `external_customer_id` are required.
             */
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** An optional memo to attach to the invoice. */
            fun memo(memo: String) = apply { this.memo = memo }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * When true, this invoice will automatically be issued upon creation. When false, the
             * resulting invoice will require manual review to issue. Defaulted to false.
             */
            fun willAutoIssue(willAutoIssue: Boolean) = apply { this.willAutoIssue = willAutoIssue }

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
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(invoiceDate) { "`invoiceDate` is required but was not set" },
                    checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(netTerms) { "`netTerms` is required but was not set" },
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

    @NoAutoDetect
    class Builder {

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
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { body.invoiceDate(invoiceDate) }

        fun lineItems(lineItems: List<LineItem>) = apply { body.lineItems(lineItems) }

        fun addLineItem(lineItem: LineItem) = apply { body.addLineItem(lineItem) }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        fun netTerms(netTerms: Long) = apply { body.netTerms(netTerms) }

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** An optional discount to attach to the invoice. */
        fun discount(discount: Discount) = apply { body.discount(discount) }

        fun discount(percentageDiscount: PercentageDiscount) = apply {
            body.discount(percentageDiscount)
        }

        fun discount(trialDiscount: TrialDiscount) = apply { body.discount(trialDiscount) }

        fun discount(usageDiscount: Discount.UsageDiscount) = apply { body.discount(usageDiscount) }

        fun discount(amountDiscount: AmountDiscount) = apply { body.discount(amountDiscount) }

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        fun externalCustomerId(externalCustomerId: String) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** An optional memo to attach to the invoice. */
        fun memo(memo: String) = apply { body.memo(memo) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = apply { body.willAutoIssue(willAutoIssue) }

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
        @JsonProperty("end_date") private val endDate: LocalDate,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("quantity") private val quantity: Double,
        @JsonProperty("start_date") private val startDate: LocalDate,
        @JsonProperty("unit_config") private val unitConfig: UnitConfig,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") fun endDate(): LocalDate = endDate

        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the line item. */
        @JsonProperty("name") fun name(): String = name

        /** The number of units on the line item */
        @JsonProperty("quantity") fun quantity(): Double = quantity

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date") fun startDate(): LocalDate = startDate

        @JsonProperty("unit_config") fun unitConfig(): UnitConfig = unitConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var endDate: LocalDate? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var quantity: Double? = null
            private var startDate: LocalDate? = null
            private var unitConfig: UnitConfig? = null
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
            fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the line item. */
            fun name(name: String) = apply { this.name = name }

            /** The number of units on the line item */
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** A date string to specify the line item's start date in the customer's timezone. */
            fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

            fun unitConfig(unitConfig: UnitConfig) = apply { this.unitConfig = unitConfig }

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
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    checkNotNull(unitConfig) { "`unitConfig` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNIT = of("unit")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT,
            }

            enum class Value {
                UNIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT -> Value.UNIT
                    else -> Value._UNKNOWN
                }

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
            @JsonProperty("unit_amount") private val unitAmount: String,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Rate per unit of usage */
            @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var unitAmount: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitConfig: UnitConfig) = apply {
                    unitAmount = unitConfig.unitAmount
                    additionalProperties = unitConfig.additionalProperties.toMutableMap()
                }

                /** Rate per unit of usage */
                fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

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
                        checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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
