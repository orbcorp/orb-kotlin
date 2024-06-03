// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class SubscriptionPriceIntervalsParams
constructor(
    private val subscriptionId: String,
    private val add: List<Add>?,
    private val edit: List<Edit>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun add(): List<Add>? = add

    fun edit(): List<Edit>? = edit

    internal fun getBody(): SubscriptionPriceIntervalsBody {
        return SubscriptionPriceIntervalsBody(
            add,
            edit,
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

    @JsonDeserialize(builder = SubscriptionPriceIntervalsBody.Builder::class)
    @NoAutoDetect
    class SubscriptionPriceIntervalsBody
    internal constructor(
        private val add: List<Add>?,
        private val edit: List<Edit>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A list of price intervals to add to the subscription. */
        @JsonProperty("add") fun add(): List<Add>? = add

        /** A list of price intervals to edit on the subscription. */
        @JsonProperty("edit") fun edit(): List<Edit>? = edit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionPriceIntervalsBody &&
                this.add == other.add &&
                this.edit == other.edit &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        add,
                        edit,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionPriceIntervalsBody{add=$add, edit=$edit, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var add: List<Add>? = null
            private var edit: List<Edit>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionPriceIntervalsBody: SubscriptionPriceIntervalsBody) =
                apply {
                    this.add = subscriptionPriceIntervalsBody.add
                    this.edit = subscriptionPriceIntervalsBody.edit
                    additionalProperties(subscriptionPriceIntervalsBody.additionalProperties)
                }

            /** A list of price intervals to add to the subscription. */
            @JsonProperty("add") fun add(add: List<Add>) = apply { this.add = add }

            /** A list of price intervals to edit on the subscription. */
            @JsonProperty("edit") fun edit(edit: List<Edit>) = apply { this.edit = edit }

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

            fun build(): SubscriptionPriceIntervalsBody =
                SubscriptionPriceIntervalsBody(
                    add?.toUnmodifiable(),
                    edit?.toUnmodifiable(),
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

        return other is SubscriptionPriceIntervalsParams &&
            this.subscriptionId == other.subscriptionId &&
            this.add == other.add &&
            this.edit == other.edit &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            subscriptionId,
            add,
            edit,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SubscriptionPriceIntervalsParams{subscriptionId=$subscriptionId, add=$add, edit=$edit, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var add: MutableList<Add> = mutableListOf()
        private var edit: MutableList<Edit> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionPriceIntervalsParams: SubscriptionPriceIntervalsParams) =
            apply {
                this.subscriptionId = subscriptionPriceIntervalsParams.subscriptionId
                this.add(subscriptionPriceIntervalsParams.add ?: listOf())
                this.edit(subscriptionPriceIntervalsParams.edit ?: listOf())
                additionalQueryParams(subscriptionPriceIntervalsParams.additionalQueryParams)
                additionalHeaders(subscriptionPriceIntervalsParams.additionalHeaders)
                additionalBodyProperties(subscriptionPriceIntervalsParams.additionalBodyProperties)
            }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** A list of price intervals to add to the subscription. */
        fun add(add: List<Add>) = apply {
            this.add.clear()
            this.add.addAll(add)
        }

        /** A list of price intervals to add to the subscription. */
        fun addAdd(add: Add) = apply { this.add.add(add) }

        /** A list of price intervals to edit on the subscription. */
        fun edit(edit: List<Edit>) = apply {
            this.edit.clear()
            this.edit.addAll(edit)
        }

        /** A list of price intervals to edit on the subscription. */
        fun addEdit(edit: Edit) = apply { this.edit.add(edit) }

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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): SubscriptionPriceIntervalsParams =
            SubscriptionPriceIntervalsParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                if (add.size == 0) null else add.toUnmodifiable(),
                if (edit.size == 0) null else edit.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Add.Builder::class)
    @NoAutoDetect
    class Add
    private constructor(
        private val priceId: String?,
        private val externalPriceId: String?,
        private val price: Price?,
        private val startDate: StartDate?,
        private val endDate: EndDate?,
        private val fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?,
        private val discounts: List<Discount>?,
        private val minimumAmount: Double?,
        private val maximumAmount: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The id of the price to add to the subscription. */
        @JsonProperty("price_id") fun priceId(): String? = priceId

        /** The external price id of the price to add to the subscription. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The definition of a new price to create and add to the subscription. */
        @JsonProperty("price") fun price(): Price? = price

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription.
         */
        @JsonProperty("start_date") fun startDate(): StartDate? = startDate

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription.
         */
        @JsonProperty("end_date") fun endDate(): EndDate? = endDate

        /** A list of fixed fee quantity transitions to initialize on the price interval. */
        @JsonProperty("fixed_fee_quantity_transitions")
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions

        /** A list of discounts to initialize on the price interval. */
        @JsonProperty("discounts") fun discounts(): List<Discount>? = discounts

        /**
         * The minimum amount that will be billed for this price interval for a given billing
         * period.
         */
        @JsonProperty("minimum_amount") fun minimumAmount(): Double? = minimumAmount

        /**
         * The maximum amount that will be billed for this price interval for a given billing
         * period.
         */
        @JsonProperty("maximum_amount") fun maximumAmount(): Double? = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Add &&
                this.priceId == other.priceId &&
                this.externalPriceId == other.externalPriceId &&
                this.price == other.price &&
                this.startDate == other.startDate &&
                this.endDate == other.endDate &&
                this.fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions &&
                this.discounts == other.discounts &&
                this.minimumAmount == other.minimumAmount &&
                this.maximumAmount == other.maximumAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        priceId,
                        externalPriceId,
                        price,
                        startDate,
                        endDate,
                        fixedFeeQuantityTransitions,
                        discounts,
                        minimumAmount,
                        maximumAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Add{priceId=$priceId, externalPriceId=$externalPriceId, price=$price, startDate=$startDate, endDate=$endDate, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, discounts=$discounts, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceId: String? = null
            private var externalPriceId: String? = null
            private var price: Price? = null
            private var startDate: StartDate? = null
            private var endDate: EndDate? = null
            private var fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>? = null
            private var discounts: List<Discount>? = null
            private var minimumAmount: Double? = null
            private var maximumAmount: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(add: Add) = apply {
                this.priceId = add.priceId
                this.externalPriceId = add.externalPriceId
                this.price = add.price
                this.startDate = add.startDate
                this.endDate = add.endDate
                this.fixedFeeQuantityTransitions = add.fixedFeeQuantityTransitions
                this.discounts = add.discounts
                this.minimumAmount = add.minimumAmount
                this.maximumAmount = add.maximumAmount
                additionalProperties(add.additionalProperties)
            }

            /** The id of the price to add to the subscription. */
            @JsonProperty("price_id")
            fun priceId(priceId: String) = apply { this.priceId = priceId }

            /** The external price id of the price to add to the subscription. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The definition of a new price to create and add to the subscription. */
            @JsonProperty("price") fun price(price: Price) = apply { this.price = price }

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription.
             */
            @JsonProperty("start_date")
            fun startDate(startDate: StartDate) = apply { this.startDate = startDate }

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            @JsonProperty("end_date")
            fun endDate(endDate: EndDate) = apply { this.endDate = endDate }

            /** A list of fixed fee quantity transitions to initialize on the price interval. */
            @JsonProperty("fixed_fee_quantity_transitions")
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>
            ) = apply { this.fixedFeeQuantityTransitions = fixedFeeQuantityTransitions }

            /** A list of discounts to initialize on the price interval. */
            @JsonProperty("discounts")
            fun discounts(discounts: List<Discount>) = apply { this.discounts = discounts }

            /**
             * The minimum amount that will be billed for this price interval for a given billing
             * period.
             */
            @JsonProperty("minimum_amount")
            fun minimumAmount(minimumAmount: Double) = apply { this.minimumAmount = minimumAmount }

            /**
             * The maximum amount that will be billed for this price interval for a given billing
             * period.
             */
            @JsonProperty("maximum_amount")
            fun maximumAmount(maximumAmount: Double) = apply { this.maximumAmount = maximumAmount }

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

            fun build(): Add =
                Add(
                    priceId,
                    externalPriceId,
                    price,
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    endDate,
                    fixedFeeQuantityTransitions?.toUnmodifiable(),
                    discounts?.toUnmodifiable(),
                    minimumAmount,
                    maximumAmount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val billingCycleRelativeDate: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun offsetDateTime(): OffsetDateTime? = offsetDateTime

            fun billingCycleRelativeDate(): BillingCycleRelativeDate? = billingCycleRelativeDate

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isBillingCycleRelativeDate(): Boolean = billingCycleRelativeDate != null

            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            fun asBillingCycleRelativeDate(): BillingCycleRelativeDate =
                billingCycleRelativeDate.getOrThrow("billingCycleRelativeDate")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    billingCycleRelativeDate != null ->
                        visitor.visitBillingCycleRelativeDate(billingCycleRelativeDate)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): StartDate = apply {
                if (!validated) {
                    if (offsetDateTime == null && billingCycleRelativeDate == null) {
                        throw OrbInvalidDataException("Unknown StartDate: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    this.offsetDateTime == other.offsetDateTime &&
                    this.billingCycleRelativeDate == other.billingCycleRelativeDate
            }

            override fun hashCode(): Int {
                return Objects.hash(offsetDateTime, billingCycleRelativeDate)
            }

            override fun toString(): String {
                return when {
                    offsetDateTime != null -> "StartDate{offsetDateTime=$offsetDateTime}"
                    billingCycleRelativeDate != null ->
                        "StartDate{billingCycleRelativeDate=$billingCycleRelativeDate}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }
            }

            companion object {

                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    StartDate(offsetDateTime = offsetDateTime)

                fun ofBillingCycleRelativeDate(billingCycleRelativeDate: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelativeDate = billingCycleRelativeDate)
            }

            interface Visitor<out T> {

                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                fun visitBillingCycleRelativeDate(
                    billingCycleRelativeDate: BillingCycleRelativeDate
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(offsetDateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelativeDate = it, _json = json)
                    }

                    return StartDate(_json = json)
                }
            }

            class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                        value.billingCycleRelativeDate != null ->
                            generator.writeObject(value.billingCycleRelativeDate)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }

        @JsonDeserialize(using = Discount.Deserializer::class)
        @JsonSerialize(using = Discount.Serializer::class)
        class Discount
        private constructor(
            private val amountDiscountCreationParams: AmountDiscountCreationParams? = null,
            private val percentageDiscountCreationParams: PercentageDiscountCreationParams? = null,
            private val usageDiscountCreationParams: UsageDiscountCreationParams? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun amountDiscountCreationParams(): AmountDiscountCreationParams? =
                amountDiscountCreationParams

            fun percentageDiscountCreationParams(): PercentageDiscountCreationParams? =
                percentageDiscountCreationParams

            fun usageDiscountCreationParams(): UsageDiscountCreationParams? =
                usageDiscountCreationParams

            fun isAmountDiscountCreationParams(): Boolean = amountDiscountCreationParams != null

            fun isPercentageDiscountCreationParams(): Boolean =
                percentageDiscountCreationParams != null

            fun isUsageDiscountCreationParams(): Boolean = usageDiscountCreationParams != null

            fun asAmountDiscountCreationParams(): AmountDiscountCreationParams =
                amountDiscountCreationParams.getOrThrow("amountDiscountCreationParams")

            fun asPercentageDiscountCreationParams(): PercentageDiscountCreationParams =
                percentageDiscountCreationParams.getOrThrow("percentageDiscountCreationParams")

            fun asUsageDiscountCreationParams(): UsageDiscountCreationParams =
                usageDiscountCreationParams.getOrThrow("usageDiscountCreationParams")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    amountDiscountCreationParams != null ->
                        visitor.visitAmountDiscountCreationParams(amountDiscountCreationParams)
                    percentageDiscountCreationParams != null ->
                        visitor.visitPercentageDiscountCreationParams(
                            percentageDiscountCreationParams
                        )
                    usageDiscountCreationParams != null ->
                        visitor.visitUsageDiscountCreationParams(usageDiscountCreationParams)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Discount = apply {
                if (!validated) {
                    if (
                        amountDiscountCreationParams == null &&
                            percentageDiscountCreationParams == null &&
                            usageDiscountCreationParams == null
                    ) {
                        throw OrbInvalidDataException("Unknown Discount: $_json")
                    }
                    amountDiscountCreationParams?.validate()
                    percentageDiscountCreationParams?.validate()
                    usageDiscountCreationParams?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Discount &&
                    this.amountDiscountCreationParams == other.amountDiscountCreationParams &&
                    this.percentageDiscountCreationParams ==
                        other.percentageDiscountCreationParams &&
                    this.usageDiscountCreationParams == other.usageDiscountCreationParams
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    amountDiscountCreationParams,
                    percentageDiscountCreationParams,
                    usageDiscountCreationParams,
                )
            }

            override fun toString(): String {
                return when {
                    amountDiscountCreationParams != null ->
                        "Discount{amountDiscountCreationParams=$amountDiscountCreationParams}"
                    percentageDiscountCreationParams != null ->
                        "Discount{percentageDiscountCreationParams=$percentageDiscountCreationParams}"
                    usageDiscountCreationParams != null ->
                        "Discount{usageDiscountCreationParams=$usageDiscountCreationParams}"
                    _json != null -> "Discount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Discount")
                }
            }

            companion object {

                fun ofAmountDiscountCreationParams(
                    amountDiscountCreationParams: AmountDiscountCreationParams
                ) = Discount(amountDiscountCreationParams = amountDiscountCreationParams)

                fun ofPercentageDiscountCreationParams(
                    percentageDiscountCreationParams: PercentageDiscountCreationParams
                ) = Discount(percentageDiscountCreationParams = percentageDiscountCreationParams)

                fun ofUsageDiscountCreationParams(
                    usageDiscountCreationParams: UsageDiscountCreationParams
                ) = Discount(usageDiscountCreationParams = usageDiscountCreationParams)
            }

            interface Visitor<out T> {

                fun visitAmountDiscountCreationParams(
                    amountDiscountCreationParams: AmountDiscountCreationParams
                ): T

                fun visitPercentageDiscountCreationParams(
                    percentageDiscountCreationParams: PercentageDiscountCreationParams
                ): T

                fun visitUsageDiscountCreationParams(
                    usageDiscountCreationParams: UsageDiscountCreationParams
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Discount: $json")
                }
            }

            class Deserializer : BaseDeserializer<Discount>(Discount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Discount {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<AmountDiscountCreationParams>()) {
                            it.validate()
                        }
                        ?.let {
                            return Discount(amountDiscountCreationParams = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PercentageDiscountCreationParams>()) {
                            it.validate()
                        }
                        ?.let {
                            return Discount(percentageDiscountCreationParams = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<UsageDiscountCreationParams>()) {
                            it.validate()
                        }
                        ?.let {
                            return Discount(usageDiscountCreationParams = it, _json = json)
                        }

                    return Discount(_json = json)
                }
            }

            class Serializer : BaseSerializer<Discount>(Discount::class) {

                override fun serialize(
                    value: Discount,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.amountDiscountCreationParams != null ->
                            generator.writeObject(value.amountDiscountCreationParams)
                        value.percentageDiscountCreationParams != null ->
                            generator.writeObject(value.percentageDiscountCreationParams)
                        value.usageDiscountCreationParams != null ->
                            generator.writeObject(value.usageDiscountCreationParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Discount")
                    }
                }
            }

            @JsonDeserialize(builder = AmountDiscountCreationParams.Builder::class)
            @NoAutoDetect
            class AmountDiscountCreationParams
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val amountDiscount: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Double = amountDiscount.getRequired("amount_discount")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): AmountDiscountCreationParams = apply {
                    if (!validated) {
                        discountType()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AmountDiscountCreationParams &&
                        this.discountType == other.discountType &&
                        this.amountDiscount == other.amountDiscount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                amountDiscount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AmountDiscountCreationParams{discountType=$discountType, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var amountDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(amountDiscountCreationParams: AmountDiscountCreationParams) =
                        apply {
                            this.discountType = amountDiscountCreationParams.discountType
                            this.amountDiscount = amountDiscountCreationParams.amountDiscount
                            additionalProperties(amountDiscountCreationParams.additionalProperties)
                        }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: Double) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<Double>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): AmountDiscountCreationParams =
                        AmountDiscountCreationParams(
                            discountType,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        AMOUNT,
                    }

                    enum class Value {
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = PercentageDiscountCreationParams.Builder::class)
            @NoAutoDetect
            class PercentageDiscountCreationParams
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PercentageDiscountCreationParams = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PercentageDiscountCreationParams &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PercentageDiscountCreationParams{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        percentageDiscountCreationParams: PercentageDiscountCreationParams
                    ) = apply {
                        this.discountType = percentageDiscountCreationParams.discountType
                        this.percentageDiscount =
                            percentageDiscountCreationParams.percentageDiscount
                        additionalProperties(percentageDiscountCreationParams.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PercentageDiscountCreationParams =
                        PercentageDiscountCreationParams(
                            discountType,
                            percentageDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                    }

                    enum class Value {
                        PERCENTAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = UsageDiscountCreationParams.Builder::class)
            @NoAutoDetect
            class UsageDiscountCreationParams
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val usageDiscount: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for.
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UsageDiscountCreationParams = apply {
                    if (!validated) {
                        discountType()
                        usageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UsageDiscountCreationParams &&
                        this.discountType == other.discountType &&
                        this.usageDiscount == other.usageDiscount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                usageDiscount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "UsageDiscountCreationParams{discountType=$discountType, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usageDiscountCreationParams: UsageDiscountCreationParams) =
                        apply {
                            this.discountType = usageDiscountCreationParams.discountType
                            this.usageDiscount = usageDiscountCreationParams.usageDiscount
                            additionalProperties(usageDiscountCreationParams.additionalProperties)
                        }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for.
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): UsageDiscountCreationParams =
                        UsageDiscountCreationParams(
                            discountType,
                            usageDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val USAGE = DiscountType(JsonField.of("usage"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        USAGE,
                    }

                    enum class Value {
                        USAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            USAGE -> Value.USAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            USAGE -> Known.USAGE
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val billingCycleRelativeDate: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun offsetDateTime(): OffsetDateTime? = offsetDateTime

            fun billingCycleRelativeDate(): BillingCycleRelativeDate? = billingCycleRelativeDate

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isBillingCycleRelativeDate(): Boolean = billingCycleRelativeDate != null

            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            fun asBillingCycleRelativeDate(): BillingCycleRelativeDate =
                billingCycleRelativeDate.getOrThrow("billingCycleRelativeDate")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    billingCycleRelativeDate != null ->
                        visitor.visitBillingCycleRelativeDate(billingCycleRelativeDate)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): EndDate = apply {
                if (!validated) {
                    if (offsetDateTime == null && billingCycleRelativeDate == null) {
                        throw OrbInvalidDataException("Unknown EndDate: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    this.offsetDateTime == other.offsetDateTime &&
                    this.billingCycleRelativeDate == other.billingCycleRelativeDate
            }

            override fun hashCode(): Int {
                return Objects.hash(offsetDateTime, billingCycleRelativeDate)
            }

            override fun toString(): String {
                return when {
                    offsetDateTime != null -> "EndDate{offsetDateTime=$offsetDateTime}"
                    billingCycleRelativeDate != null ->
                        "EndDate{billingCycleRelativeDate=$billingCycleRelativeDate}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }
            }

            companion object {

                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    EndDate(offsetDateTime = offsetDateTime)

                fun ofBillingCycleRelativeDate(billingCycleRelativeDate: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelativeDate = billingCycleRelativeDate)
            }

            interface Visitor<out T> {

                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                fun visitBillingCycleRelativeDate(
                    billingCycleRelativeDate: BillingCycleRelativeDate
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(offsetDateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelativeDate = it, _json = json)
                    }

                    return EndDate(_json = json)
                }
            }

            class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                        value.billingCycleRelativeDate != null ->
                            generator.writeObject(value.billingCycleRelativeDate)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        @JsonDeserialize(builder = FixedFeeQuantityTransition.Builder::class)
        @NoAutoDetect
        class FixedFeeQuantityTransition
        private constructor(
            private val quantity: Long?,
            private val effectiveDate: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The quantity of the fixed fee quantity transition. */
            @JsonProperty("quantity") fun quantity(): Long? = quantity

            /** The date that the fixed fee quantity transition should take effect. */
            @JsonProperty("effective_date") fun effectiveDate(): OffsetDateTime? = effectiveDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FixedFeeQuantityTransition &&
                    this.quantity == other.quantity &&
                    this.effectiveDate == other.effectiveDate &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            quantity,
                            effectiveDate,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FixedFeeQuantityTransition{quantity=$quantity, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var quantity: Long? = null
                private var effectiveDate: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    this.quantity = fixedFeeQuantityTransition.quantity
                    this.effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    additionalProperties(fixedFeeQuantityTransition.additionalProperties)
                }

                /** The quantity of the fixed fee quantity transition. */
                @JsonProperty("quantity")
                fun quantity(quantity: Long) = apply { this.quantity = quantity }

                /** The date that the fixed fee quantity transition should take effect. */
                @JsonProperty("effective_date")
                fun effectiveDate(effectiveDate: OffsetDateTime) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkNotNull(quantity) { "`quantity` is required but was not set" },
                        checkNotNull(effectiveDate) {
                            "`effectiveDate` is required but was not set"
                        },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val newFloatingUnitPrice: NewFloatingUnitPrice? = null,
            private val newFloatingPackagePrice: NewFloatingPackagePrice? = null,
            private val newFloatingMatrixPrice: NewFloatingMatrixPrice? = null,
            private val newFloatingMatrixWithAllocationPrice:
                NewFloatingMatrixWithAllocationPrice? =
                null,
            private val newFloatingTieredPrice: NewFloatingTieredPrice? = null,
            private val newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice? = null,
            private val newFloatingBpsPrice: NewFloatingBpsPrice? = null,
            private val newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice? = null,
            private val newFloatingBulkPrice: NewFloatingBulkPrice? = null,
            private val newFloatingThresholdTotalAmountPrice:
                NewFloatingThresholdTotalAmountPrice? =
                null,
            private val newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice? = null,
            private val newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice? = null,
            private val newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice? =
                null,
            private val newFloatingPackageWithAllocationPrice:
                NewFloatingPackageWithAllocationPrice? =
                null,
            private val newFloatingTieredPackageWithMinimumPrice:
                NewFloatingTieredPackageWithMinimumPrice? =
                null,
            private val newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice? = null,
            private val newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice? =
                null,
            private val newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice? =
                null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun newFloatingUnitPrice(): NewFloatingUnitPrice? = newFloatingUnitPrice

            fun newFloatingPackagePrice(): NewFloatingPackagePrice? = newFloatingPackagePrice

            fun newFloatingMatrixPrice(): NewFloatingMatrixPrice? = newFloatingMatrixPrice

            fun newFloatingMatrixWithAllocationPrice(): NewFloatingMatrixWithAllocationPrice? =
                newFloatingMatrixWithAllocationPrice

            fun newFloatingTieredPrice(): NewFloatingTieredPrice? = newFloatingTieredPrice

            fun newFloatingTieredBpsPrice(): NewFloatingTieredBpsPrice? = newFloatingTieredBpsPrice

            fun newFloatingBpsPrice(): NewFloatingBpsPrice? = newFloatingBpsPrice

            fun newFloatingBulkBpsPrice(): NewFloatingBulkBpsPrice? = newFloatingBulkBpsPrice

            fun newFloatingBulkPrice(): NewFloatingBulkPrice? = newFloatingBulkPrice

            fun newFloatingThresholdTotalAmountPrice(): NewFloatingThresholdTotalAmountPrice? =
                newFloatingThresholdTotalAmountPrice

            fun newFloatingTieredPackagePrice(): NewFloatingTieredPackagePrice? =
                newFloatingTieredPackagePrice

            fun newFloatingGroupedTieredPrice(): NewFloatingGroupedTieredPrice? =
                newFloatingGroupedTieredPrice

            fun newFloatingTieredWithMinimumPrice(): NewFloatingTieredWithMinimumPrice? =
                newFloatingTieredWithMinimumPrice

            fun newFloatingPackageWithAllocationPrice(): NewFloatingPackageWithAllocationPrice? =
                newFloatingPackageWithAllocationPrice

            fun newFloatingTieredPackageWithMinimumPrice():
                NewFloatingTieredPackageWithMinimumPrice? = newFloatingTieredPackageWithMinimumPrice

            fun newFloatingUnitWithPercentPrice(): NewFloatingUnitWithPercentPrice? =
                newFloatingUnitWithPercentPrice

            fun newFloatingTieredWithProrationPrice(): NewFloatingTieredWithProrationPrice? =
                newFloatingTieredWithProrationPrice

            fun newFloatingUnitWithProrationPrice(): NewFloatingUnitWithProrationPrice? =
                newFloatingUnitWithProrationPrice

            fun isNewFloatingUnitPrice(): Boolean = newFloatingUnitPrice != null

            fun isNewFloatingPackagePrice(): Boolean = newFloatingPackagePrice != null

            fun isNewFloatingMatrixPrice(): Boolean = newFloatingMatrixPrice != null

            fun isNewFloatingMatrixWithAllocationPrice(): Boolean =
                newFloatingMatrixWithAllocationPrice != null

            fun isNewFloatingTieredPrice(): Boolean = newFloatingTieredPrice != null

            fun isNewFloatingTieredBpsPrice(): Boolean = newFloatingTieredBpsPrice != null

            fun isNewFloatingBpsPrice(): Boolean = newFloatingBpsPrice != null

            fun isNewFloatingBulkBpsPrice(): Boolean = newFloatingBulkBpsPrice != null

            fun isNewFloatingBulkPrice(): Boolean = newFloatingBulkPrice != null

            fun isNewFloatingThresholdTotalAmountPrice(): Boolean =
                newFloatingThresholdTotalAmountPrice != null

            fun isNewFloatingTieredPackagePrice(): Boolean = newFloatingTieredPackagePrice != null

            fun isNewFloatingGroupedTieredPrice(): Boolean = newFloatingGroupedTieredPrice != null

            fun isNewFloatingTieredWithMinimumPrice(): Boolean =
                newFloatingTieredWithMinimumPrice != null

            fun isNewFloatingPackageWithAllocationPrice(): Boolean =
                newFloatingPackageWithAllocationPrice != null

            fun isNewFloatingTieredPackageWithMinimumPrice(): Boolean =
                newFloatingTieredPackageWithMinimumPrice != null

            fun isNewFloatingUnitWithPercentPrice(): Boolean =
                newFloatingUnitWithPercentPrice != null

            fun isNewFloatingTieredWithProrationPrice(): Boolean =
                newFloatingTieredWithProrationPrice != null

            fun isNewFloatingUnitWithProrationPrice(): Boolean =
                newFloatingUnitWithProrationPrice != null

            fun asNewFloatingUnitPrice(): NewFloatingUnitPrice =
                newFloatingUnitPrice.getOrThrow("newFloatingUnitPrice")

            fun asNewFloatingPackagePrice(): NewFloatingPackagePrice =
                newFloatingPackagePrice.getOrThrow("newFloatingPackagePrice")

            fun asNewFloatingMatrixPrice(): NewFloatingMatrixPrice =
                newFloatingMatrixPrice.getOrThrow("newFloatingMatrixPrice")

            fun asNewFloatingMatrixWithAllocationPrice(): NewFloatingMatrixWithAllocationPrice =
                newFloatingMatrixWithAllocationPrice.getOrThrow(
                    "newFloatingMatrixWithAllocationPrice"
                )

            fun asNewFloatingTieredPrice(): NewFloatingTieredPrice =
                newFloatingTieredPrice.getOrThrow("newFloatingTieredPrice")

            fun asNewFloatingTieredBpsPrice(): NewFloatingTieredBpsPrice =
                newFloatingTieredBpsPrice.getOrThrow("newFloatingTieredBpsPrice")

            fun asNewFloatingBpsPrice(): NewFloatingBpsPrice =
                newFloatingBpsPrice.getOrThrow("newFloatingBpsPrice")

            fun asNewFloatingBulkBpsPrice(): NewFloatingBulkBpsPrice =
                newFloatingBulkBpsPrice.getOrThrow("newFloatingBulkBpsPrice")

            fun asNewFloatingBulkPrice(): NewFloatingBulkPrice =
                newFloatingBulkPrice.getOrThrow("newFloatingBulkPrice")

            fun asNewFloatingThresholdTotalAmountPrice(): NewFloatingThresholdTotalAmountPrice =
                newFloatingThresholdTotalAmountPrice.getOrThrow(
                    "newFloatingThresholdTotalAmountPrice"
                )

            fun asNewFloatingTieredPackagePrice(): NewFloatingTieredPackagePrice =
                newFloatingTieredPackagePrice.getOrThrow("newFloatingTieredPackagePrice")

            fun asNewFloatingGroupedTieredPrice(): NewFloatingGroupedTieredPrice =
                newFloatingGroupedTieredPrice.getOrThrow("newFloatingGroupedTieredPrice")

            fun asNewFloatingTieredWithMinimumPrice(): NewFloatingTieredWithMinimumPrice =
                newFloatingTieredWithMinimumPrice.getOrThrow("newFloatingTieredWithMinimumPrice")

            fun asNewFloatingPackageWithAllocationPrice(): NewFloatingPackageWithAllocationPrice =
                newFloatingPackageWithAllocationPrice.getOrThrow(
                    "newFloatingPackageWithAllocationPrice"
                )

            fun asNewFloatingTieredPackageWithMinimumPrice():
                NewFloatingTieredPackageWithMinimumPrice =
                newFloatingTieredPackageWithMinimumPrice.getOrThrow(
                    "newFloatingTieredPackageWithMinimumPrice"
                )

            fun asNewFloatingUnitWithPercentPrice(): NewFloatingUnitWithPercentPrice =
                newFloatingUnitWithPercentPrice.getOrThrow("newFloatingUnitWithPercentPrice")

            fun asNewFloatingTieredWithProrationPrice(): NewFloatingTieredWithProrationPrice =
                newFloatingTieredWithProrationPrice.getOrThrow(
                    "newFloatingTieredWithProrationPrice"
                )

            fun asNewFloatingUnitWithProrationPrice(): NewFloatingUnitWithProrationPrice =
                newFloatingUnitWithProrationPrice.getOrThrow("newFloatingUnitWithProrationPrice")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    newFloatingUnitPrice != null ->
                        visitor.visitNewFloatingUnitPrice(newFloatingUnitPrice)
                    newFloatingPackagePrice != null ->
                        visitor.visitNewFloatingPackagePrice(newFloatingPackagePrice)
                    newFloatingMatrixPrice != null ->
                        visitor.visitNewFloatingMatrixPrice(newFloatingMatrixPrice)
                    newFloatingMatrixWithAllocationPrice != null ->
                        visitor.visitNewFloatingMatrixWithAllocationPrice(
                            newFloatingMatrixWithAllocationPrice
                        )
                    newFloatingTieredPrice != null ->
                        visitor.visitNewFloatingTieredPrice(newFloatingTieredPrice)
                    newFloatingTieredBpsPrice != null ->
                        visitor.visitNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice)
                    newFloatingBpsPrice != null ->
                        visitor.visitNewFloatingBpsPrice(newFloatingBpsPrice)
                    newFloatingBulkBpsPrice != null ->
                        visitor.visitNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice)
                    newFloatingBulkPrice != null ->
                        visitor.visitNewFloatingBulkPrice(newFloatingBulkPrice)
                    newFloatingThresholdTotalAmountPrice != null ->
                        visitor.visitNewFloatingThresholdTotalAmountPrice(
                            newFloatingThresholdTotalAmountPrice
                        )
                    newFloatingTieredPackagePrice != null ->
                        visitor.visitNewFloatingTieredPackagePrice(newFloatingTieredPackagePrice)
                    newFloatingGroupedTieredPrice != null ->
                        visitor.visitNewFloatingGroupedTieredPrice(newFloatingGroupedTieredPrice)
                    newFloatingTieredWithMinimumPrice != null ->
                        visitor.visitNewFloatingTieredWithMinimumPrice(
                            newFloatingTieredWithMinimumPrice
                        )
                    newFloatingPackageWithAllocationPrice != null ->
                        visitor.visitNewFloatingPackageWithAllocationPrice(
                            newFloatingPackageWithAllocationPrice
                        )
                    newFloatingTieredPackageWithMinimumPrice != null ->
                        visitor.visitNewFloatingTieredPackageWithMinimumPrice(
                            newFloatingTieredPackageWithMinimumPrice
                        )
                    newFloatingUnitWithPercentPrice != null ->
                        visitor.visitNewFloatingUnitWithPercentPrice(
                            newFloatingUnitWithPercentPrice
                        )
                    newFloatingTieredWithProrationPrice != null ->
                        visitor.visitNewFloatingTieredWithProrationPrice(
                            newFloatingTieredWithProrationPrice
                        )
                    newFloatingUnitWithProrationPrice != null ->
                        visitor.visitNewFloatingUnitWithProrationPrice(
                            newFloatingUnitWithProrationPrice
                        )
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Price = apply {
                if (!validated) {
                    if (
                        newFloatingUnitPrice == null &&
                            newFloatingPackagePrice == null &&
                            newFloatingMatrixPrice == null &&
                            newFloatingMatrixWithAllocationPrice == null &&
                            newFloatingTieredPrice == null &&
                            newFloatingTieredBpsPrice == null &&
                            newFloatingBpsPrice == null &&
                            newFloatingBulkBpsPrice == null &&
                            newFloatingBulkPrice == null &&
                            newFloatingThresholdTotalAmountPrice == null &&
                            newFloatingTieredPackagePrice == null &&
                            newFloatingGroupedTieredPrice == null &&
                            newFloatingTieredWithMinimumPrice == null &&
                            newFloatingPackageWithAllocationPrice == null &&
                            newFloatingTieredPackageWithMinimumPrice == null &&
                            newFloatingUnitWithPercentPrice == null &&
                            newFloatingTieredWithProrationPrice == null &&
                            newFloatingUnitWithProrationPrice == null
                    ) {
                        throw OrbInvalidDataException("Unknown Price: $_json")
                    }
                    newFloatingUnitPrice?.validate()
                    newFloatingPackagePrice?.validate()
                    newFloatingMatrixPrice?.validate()
                    newFloatingMatrixWithAllocationPrice?.validate()
                    newFloatingTieredPrice?.validate()
                    newFloatingTieredBpsPrice?.validate()
                    newFloatingBpsPrice?.validate()
                    newFloatingBulkBpsPrice?.validate()
                    newFloatingBulkPrice?.validate()
                    newFloatingThresholdTotalAmountPrice?.validate()
                    newFloatingTieredPackagePrice?.validate()
                    newFloatingGroupedTieredPrice?.validate()
                    newFloatingTieredWithMinimumPrice?.validate()
                    newFloatingPackageWithAllocationPrice?.validate()
                    newFloatingTieredPackageWithMinimumPrice?.validate()
                    newFloatingUnitWithPercentPrice?.validate()
                    newFloatingTieredWithProrationPrice?.validate()
                    newFloatingUnitWithProrationPrice?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    this.newFloatingUnitPrice == other.newFloatingUnitPrice &&
                    this.newFloatingPackagePrice == other.newFloatingPackagePrice &&
                    this.newFloatingMatrixPrice == other.newFloatingMatrixPrice &&
                    this.newFloatingMatrixWithAllocationPrice ==
                        other.newFloatingMatrixWithAllocationPrice &&
                    this.newFloatingTieredPrice == other.newFloatingTieredPrice &&
                    this.newFloatingTieredBpsPrice == other.newFloatingTieredBpsPrice &&
                    this.newFloatingBpsPrice == other.newFloatingBpsPrice &&
                    this.newFloatingBulkBpsPrice == other.newFloatingBulkBpsPrice &&
                    this.newFloatingBulkPrice == other.newFloatingBulkPrice &&
                    this.newFloatingThresholdTotalAmountPrice ==
                        other.newFloatingThresholdTotalAmountPrice &&
                    this.newFloatingTieredPackagePrice == other.newFloatingTieredPackagePrice &&
                    this.newFloatingGroupedTieredPrice == other.newFloatingGroupedTieredPrice &&
                    this.newFloatingTieredWithMinimumPrice ==
                        other.newFloatingTieredWithMinimumPrice &&
                    this.newFloatingPackageWithAllocationPrice ==
                        other.newFloatingPackageWithAllocationPrice &&
                    this.newFloatingTieredPackageWithMinimumPrice ==
                        other.newFloatingTieredPackageWithMinimumPrice &&
                    this.newFloatingUnitWithPercentPrice == other.newFloatingUnitWithPercentPrice &&
                    this.newFloatingTieredWithProrationPrice ==
                        other.newFloatingTieredWithProrationPrice &&
                    this.newFloatingUnitWithProrationPrice ==
                        other.newFloatingUnitWithProrationPrice
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    newFloatingUnitPrice,
                    newFloatingPackagePrice,
                    newFloatingMatrixPrice,
                    newFloatingMatrixWithAllocationPrice,
                    newFloatingTieredPrice,
                    newFloatingTieredBpsPrice,
                    newFloatingBpsPrice,
                    newFloatingBulkBpsPrice,
                    newFloatingBulkPrice,
                    newFloatingThresholdTotalAmountPrice,
                    newFloatingTieredPackagePrice,
                    newFloatingGroupedTieredPrice,
                    newFloatingTieredWithMinimumPrice,
                    newFloatingPackageWithAllocationPrice,
                    newFloatingTieredPackageWithMinimumPrice,
                    newFloatingUnitWithPercentPrice,
                    newFloatingTieredWithProrationPrice,
                    newFloatingUnitWithProrationPrice,
                )
            }

            override fun toString(): String {
                return when {
                    newFloatingUnitPrice != null ->
                        "Price{newFloatingUnitPrice=$newFloatingUnitPrice}"
                    newFloatingPackagePrice != null ->
                        "Price{newFloatingPackagePrice=$newFloatingPackagePrice}"
                    newFloatingMatrixPrice != null ->
                        "Price{newFloatingMatrixPrice=$newFloatingMatrixPrice}"
                    newFloatingMatrixWithAllocationPrice != null ->
                        "Price{newFloatingMatrixWithAllocationPrice=$newFloatingMatrixWithAllocationPrice}"
                    newFloatingTieredPrice != null ->
                        "Price{newFloatingTieredPrice=$newFloatingTieredPrice}"
                    newFloatingTieredBpsPrice != null ->
                        "Price{newFloatingTieredBpsPrice=$newFloatingTieredBpsPrice}"
                    newFloatingBpsPrice != null -> "Price{newFloatingBpsPrice=$newFloatingBpsPrice}"
                    newFloatingBulkBpsPrice != null ->
                        "Price{newFloatingBulkBpsPrice=$newFloatingBulkBpsPrice}"
                    newFloatingBulkPrice != null ->
                        "Price{newFloatingBulkPrice=$newFloatingBulkPrice}"
                    newFloatingThresholdTotalAmountPrice != null ->
                        "Price{newFloatingThresholdTotalAmountPrice=$newFloatingThresholdTotalAmountPrice}"
                    newFloatingTieredPackagePrice != null ->
                        "Price{newFloatingTieredPackagePrice=$newFloatingTieredPackagePrice}"
                    newFloatingGroupedTieredPrice != null ->
                        "Price{newFloatingGroupedTieredPrice=$newFloatingGroupedTieredPrice}"
                    newFloatingTieredWithMinimumPrice != null ->
                        "Price{newFloatingTieredWithMinimumPrice=$newFloatingTieredWithMinimumPrice}"
                    newFloatingPackageWithAllocationPrice != null ->
                        "Price{newFloatingPackageWithAllocationPrice=$newFloatingPackageWithAllocationPrice}"
                    newFloatingTieredPackageWithMinimumPrice != null ->
                        "Price{newFloatingTieredPackageWithMinimumPrice=$newFloatingTieredPackageWithMinimumPrice}"
                    newFloatingUnitWithPercentPrice != null ->
                        "Price{newFloatingUnitWithPercentPrice=$newFloatingUnitWithPercentPrice}"
                    newFloatingTieredWithProrationPrice != null ->
                        "Price{newFloatingTieredWithProrationPrice=$newFloatingTieredWithProrationPrice}"
                    newFloatingUnitWithProrationPrice != null ->
                        "Price{newFloatingUnitWithProrationPrice=$newFloatingUnitWithProrationPrice}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }
            }

            companion object {

                fun ofNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice) =
                    Price(newFloatingUnitPrice = newFloatingUnitPrice)

                fun ofNewFloatingPackagePrice(newFloatingPackagePrice: NewFloatingPackagePrice) =
                    Price(newFloatingPackagePrice = newFloatingPackagePrice)

                fun ofNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice) =
                    Price(newFloatingMatrixPrice = newFloatingMatrixPrice)

                fun ofNewFloatingMatrixWithAllocationPrice(
                    newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
                ) =
                    Price(
                        newFloatingMatrixWithAllocationPrice = newFloatingMatrixWithAllocationPrice
                    )

                fun ofNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice) =
                    Price(newFloatingTieredPrice = newFloatingTieredPrice)

                fun ofNewFloatingTieredBpsPrice(
                    newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice
                ) = Price(newFloatingTieredBpsPrice = newFloatingTieredBpsPrice)

                fun ofNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice) =
                    Price(newFloatingBpsPrice = newFloatingBpsPrice)

                fun ofNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) =
                    Price(newFloatingBulkBpsPrice = newFloatingBulkBpsPrice)

                fun ofNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice) =
                    Price(newFloatingBulkPrice = newFloatingBulkPrice)

                fun ofNewFloatingThresholdTotalAmountPrice(
                    newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
                ) =
                    Price(
                        newFloatingThresholdTotalAmountPrice = newFloatingThresholdTotalAmountPrice
                    )

                fun ofNewFloatingTieredPackagePrice(
                    newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
                ) = Price(newFloatingTieredPackagePrice = newFloatingTieredPackagePrice)

                fun ofNewFloatingGroupedTieredPrice(
                    newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
                ) = Price(newFloatingGroupedTieredPrice = newFloatingGroupedTieredPrice)

                fun ofNewFloatingTieredWithMinimumPrice(
                    newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
                ) = Price(newFloatingTieredWithMinimumPrice = newFloatingTieredWithMinimumPrice)

                fun ofNewFloatingPackageWithAllocationPrice(
                    newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
                ) =
                    Price(
                        newFloatingPackageWithAllocationPrice =
                            newFloatingPackageWithAllocationPrice
                    )

                fun ofNewFloatingTieredPackageWithMinimumPrice(
                    newFloatingTieredPackageWithMinimumPrice:
                        NewFloatingTieredPackageWithMinimumPrice
                ) =
                    Price(
                        newFloatingTieredPackageWithMinimumPrice =
                            newFloatingTieredPackageWithMinimumPrice
                    )

                fun ofNewFloatingUnitWithPercentPrice(
                    newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
                ) = Price(newFloatingUnitWithPercentPrice = newFloatingUnitWithPercentPrice)

                fun ofNewFloatingTieredWithProrationPrice(
                    newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
                ) = Price(newFloatingTieredWithProrationPrice = newFloatingTieredWithProrationPrice)

                fun ofNewFloatingUnitWithProrationPrice(
                    newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
                ) = Price(newFloatingUnitWithProrationPrice = newFloatingUnitWithProrationPrice)
            }

            interface Visitor<out T> {

                fun visitNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice): T

                fun visitNewFloatingPackagePrice(
                    newFloatingPackagePrice: NewFloatingPackagePrice
                ): T

                fun visitNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice): T

                fun visitNewFloatingMatrixWithAllocationPrice(
                    newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
                ): T

                fun visitNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice): T

                fun visitNewFloatingTieredBpsPrice(
                    newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice
                ): T

                fun visitNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice): T

                fun visitNewFloatingBulkBpsPrice(
                    newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice
                ): T

                fun visitNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice): T

                fun visitNewFloatingThresholdTotalAmountPrice(
                    newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
                ): T

                fun visitNewFloatingTieredPackagePrice(
                    newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
                ): T

                fun visitNewFloatingGroupedTieredPrice(
                    newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
                ): T

                fun visitNewFloatingTieredWithMinimumPrice(
                    newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
                ): T

                fun visitNewFloatingPackageWithAllocationPrice(
                    newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
                ): T

                fun visitNewFloatingTieredPackageWithMinimumPrice(
                    newFloatingTieredPackageWithMinimumPrice:
                        NewFloatingTieredPackageWithMinimumPrice
                ): T

                fun visitNewFloatingUnitWithPercentPrice(
                    newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
                ): T

                fun visitNewFloatingTieredWithProrationPrice(
                    newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
                ): T

                fun visitNewFloatingUnitWithProrationPrice(
                    newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>()) { it.validate() }
                        ?.let {
                            return Price(newFloatingUnitPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingPackagePrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>()) { it.validate() }
                        ?.let {
                            return Price(newFloatingMatrixPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingMatrixWithAllocationPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>()) { it.validate() }
                        ?.let {
                            return Price(newFloatingTieredPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingTieredBpsPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingTieredBpsPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingBpsPrice>()) { it.validate() }
                        ?.let {
                            return Price(newFloatingBpsPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingBulkBpsPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingBulkBpsPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>()) { it.validate() }
                        ?.let {
                            return Price(newFloatingBulkPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingThresholdTotalAmountPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPackagePrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingTieredPackagePrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedTieredPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingGroupedTieredPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingTieredWithMinimumPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingTieredWithMinimumPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingPackageWithAllocationPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingPackageWithAllocationPrice = it, _json = json)
                        }
                    tryDeserialize(
                            node,
                            jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>()
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return Price(
                                newFloatingTieredPackageWithMinimumPrice = it,
                                _json = json
                            )
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingUnitWithPercentPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingUnitWithPercentPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingTieredWithProrationPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingTieredWithProrationPrice = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NewFloatingUnitWithProrationPrice>()) {
                            it.validate()
                        }
                        ?.let {
                            return Price(newFloatingUnitWithProrationPrice = it, _json = json)
                        }

                    return Price(_json = json)
                }
            }

            class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.newFloatingUnitPrice != null ->
                            generator.writeObject(value.newFloatingUnitPrice)
                        value.newFloatingPackagePrice != null ->
                            generator.writeObject(value.newFloatingPackagePrice)
                        value.newFloatingMatrixPrice != null ->
                            generator.writeObject(value.newFloatingMatrixPrice)
                        value.newFloatingMatrixWithAllocationPrice != null ->
                            generator.writeObject(value.newFloatingMatrixWithAllocationPrice)
                        value.newFloatingTieredPrice != null ->
                            generator.writeObject(value.newFloatingTieredPrice)
                        value.newFloatingTieredBpsPrice != null ->
                            generator.writeObject(value.newFloatingTieredBpsPrice)
                        value.newFloatingBpsPrice != null ->
                            generator.writeObject(value.newFloatingBpsPrice)
                        value.newFloatingBulkBpsPrice != null ->
                            generator.writeObject(value.newFloatingBulkBpsPrice)
                        value.newFloatingBulkPrice != null ->
                            generator.writeObject(value.newFloatingBulkPrice)
                        value.newFloatingThresholdTotalAmountPrice != null ->
                            generator.writeObject(value.newFloatingThresholdTotalAmountPrice)
                        value.newFloatingTieredPackagePrice != null ->
                            generator.writeObject(value.newFloatingTieredPackagePrice)
                        value.newFloatingGroupedTieredPrice != null ->
                            generator.writeObject(value.newFloatingGroupedTieredPrice)
                        value.newFloatingTieredWithMinimumPrice != null ->
                            generator.writeObject(value.newFloatingTieredWithMinimumPrice)
                        value.newFloatingPackageWithAllocationPrice != null ->
                            generator.writeObject(value.newFloatingPackageWithAllocationPrice)
                        value.newFloatingTieredPackageWithMinimumPrice != null ->
                            generator.writeObject(value.newFloatingTieredPackageWithMinimumPrice)
                        value.newFloatingUnitWithPercentPrice != null ->
                            generator.writeObject(value.newFloatingUnitWithPercentPrice)
                        value.newFloatingTieredWithProrationPrice != null ->
                            generator.writeObject(value.newFloatingTieredWithProrationPrice)
                        value.newFloatingUnitWithProrationPrice != null ->
                            generator.writeObject(value.newFloatingUnitWithProrationPrice)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingUnitPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingUnitPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val unitConfig: JsonField<UnitConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun unitConfig(): UnitConfig = unitConfig.getRequired("unit_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("unit_config") @ExcludeMissing fun _unitConfig() = unitConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingUnitPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        unitConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingUnitPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.unitConfig == other.unitConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                unitConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingUnitPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, unitConfig=$unitConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var unitConfig: JsonField<UnitConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingUnitPrice: NewFloatingUnitPrice) = apply {
                        this.externalPriceId = newFloatingUnitPrice.externalPriceId
                        this.name = newFloatingUnitPrice.name
                        this.billableMetricId = newFloatingUnitPrice.billableMetricId
                        this.itemId = newFloatingUnitPrice.itemId
                        this.billedInAdvance = newFloatingUnitPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingUnitPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingUnitPrice.invoiceGroupingKey
                        this.cadence = newFloatingUnitPrice.cadence
                        this.conversionRate = newFloatingUnitPrice.conversionRate
                        this.modelType = newFloatingUnitPrice.modelType
                        this.unitConfig = newFloatingUnitPrice.unitConfig
                        this.currency = newFloatingUnitPrice.currency
                        additionalProperties(newFloatingUnitPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun unitConfig(unitConfig: UnitConfig) = unitConfig(JsonField.of(unitConfig))

                    @JsonProperty("unit_config")
                    @ExcludeMissing
                    fun unitConfig(unitConfig: JsonField<UnitConfig>) = apply {
                        this.unitConfig = unitConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingUnitPrice =
                        NewFloatingUnitPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            unitConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val UNIT = ModelType(JsonField.of("unit"))

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
                }

                @JsonDeserialize(builder = UnitConfig.Builder::class)
                @NoAutoDetect
                class UnitConfig
                private constructor(
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Rate per unit of usage */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /** Rate per unit of usage */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnitConfig = apply {
                        if (!validated) {
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnitConfig &&
                            this.unitAmount == other.unitAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(unitAmount, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(unitConfig: UnitConfig) = apply {
                            this.unitAmount = unitConfig.unitAmount
                            additionalProperties(unitConfig.additionalProperties)
                        }

                        /** Rate per unit of usage */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Rate per unit of usage */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): UnitConfig =
                            UnitConfig(unitAmount, additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingPackagePrice.Builder::class)
            @NoAutoDetect
            class NewFloatingPackagePrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val packageConfig: JsonField<PackageConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun packageConfig(): PackageConfig = packageConfig.getRequired("package_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("package_config") @ExcludeMissing fun _packageConfig() = packageConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingPackagePrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        packageConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingPackagePrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.packageConfig == other.packageConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                packageConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingPackagePrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, packageConfig=$packageConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var packageConfig: JsonField<PackageConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingPackagePrice: NewFloatingPackagePrice) = apply {
                        this.externalPriceId = newFloatingPackagePrice.externalPriceId
                        this.name = newFloatingPackagePrice.name
                        this.billableMetricId = newFloatingPackagePrice.billableMetricId
                        this.itemId = newFloatingPackagePrice.itemId
                        this.billedInAdvance = newFloatingPackagePrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingPackagePrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingPackagePrice.invoiceGroupingKey
                        this.cadence = newFloatingPackagePrice.cadence
                        this.conversionRate = newFloatingPackagePrice.conversionRate
                        this.modelType = newFloatingPackagePrice.modelType
                        this.packageConfig = newFloatingPackagePrice.packageConfig
                        this.currency = newFloatingPackagePrice.currency
                        additionalProperties(newFloatingPackagePrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun packageConfig(packageConfig: PackageConfig) =
                        packageConfig(JsonField.of(packageConfig))

                    @JsonProperty("package_config")
                    @ExcludeMissing
                    fun packageConfig(packageConfig: JsonField<PackageConfig>) = apply {
                        this.packageConfig = packageConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingPackagePrice =
                        NewFloatingPackagePrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            packageConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PACKAGE = ModelType(JsonField.of("package"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        PACKAGE,
                    }

                    enum class Value {
                        PACKAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PACKAGE -> Value.PACKAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PACKAGE -> Known.PACKAGE
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = PackageConfig.Builder::class)
                @NoAutoDetect
                class PackageConfig
                private constructor(
                    private val packageAmount: JsonField<String>,
                    private val packageSize: JsonField<Long>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** A currency amount to rate usage by */
                    fun packageAmount(): String = packageAmount.getRequired("package_amount")

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    fun packageSize(): Long = packageSize.getRequired("package_size")

                    /** A currency amount to rate usage by */
                    @JsonProperty("package_amount")
                    @ExcludeMissing
                    fun _packageAmount() = packageAmount

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    @JsonProperty("package_size") @ExcludeMissing fun _packageSize() = packageSize

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PackageConfig = apply {
                        if (!validated) {
                            packageAmount()
                            packageSize()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PackageConfig &&
                            this.packageAmount == other.packageAmount &&
                            this.packageSize == other.packageSize &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    packageAmount,
                                    packageSize,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var packageAmount: JsonField<String> = JsonMissing.of()
                        private var packageSize: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(packageConfig: PackageConfig) = apply {
                            this.packageAmount = packageConfig.packageAmount
                            this.packageSize = packageConfig.packageSize
                            additionalProperties(packageConfig.additionalProperties)
                        }

                        /** A currency amount to rate usage by */
                        fun packageAmount(packageAmount: String) =
                            packageAmount(JsonField.of(packageAmount))

                        /** A currency amount to rate usage by */
                        @JsonProperty("package_amount")
                        @ExcludeMissing
                        fun packageAmount(packageAmount: JsonField<String>) = apply {
                            this.packageAmount = packageAmount
                        }

                        /**
                         * An integer amount to represent package size. For example, 1000 here would
                         * divide usage by 1000 before multiplying by package_amount in rating
                         */
                        fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

                        /**
                         * An integer amount to represent package size. For example, 1000 here would
                         * divide usage by 1000 before multiplying by package_amount in rating
                         */
                        @JsonProperty("package_size")
                        @ExcludeMissing
                        fun packageSize(packageSize: JsonField<Long>) = apply {
                            this.packageSize = packageSize
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PackageConfig =
                            PackageConfig(
                                packageAmount,
                                packageSize,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingMatrixPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingMatrixPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val matrixConfig: JsonField<MatrixConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingMatrixPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        matrixConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingMatrixPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.matrixConfig == other.matrixConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                matrixConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingMatrixPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, matrixConfig=$matrixConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingMatrixPrice: NewFloatingMatrixPrice) = apply {
                        this.externalPriceId = newFloatingMatrixPrice.externalPriceId
                        this.name = newFloatingMatrixPrice.name
                        this.billableMetricId = newFloatingMatrixPrice.billableMetricId
                        this.itemId = newFloatingMatrixPrice.itemId
                        this.billedInAdvance = newFloatingMatrixPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingMatrixPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingMatrixPrice.invoiceGroupingKey
                        this.cadence = newFloatingMatrixPrice.cadence
                        this.conversionRate = newFloatingMatrixPrice.conversionRate
                        this.modelType = newFloatingMatrixPrice.modelType
                        this.matrixConfig = newFloatingMatrixPrice.matrixConfig
                        this.currency = newFloatingMatrixPrice.currency
                        additionalProperties(newFloatingMatrixPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun matrixConfig(matrixConfig: MatrixConfig) =
                        matrixConfig(JsonField.of(matrixConfig))

                    @JsonProperty("matrix_config")
                    @ExcludeMissing
                    fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                        this.matrixConfig = matrixConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingMatrixPrice =
                        NewFloatingMatrixPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            matrixConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = MatrixConfig.Builder::class)
                @NoAutoDetect
                class MatrixConfig
                private constructor(
                    private val dimensions: JsonField<List<String?>>,
                    private val defaultUnitAmount: JsonField<String>,
                    private val matrixValues: JsonField<List<MatrixValue>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** One or two event property values to evaluate matrix groups by */
                    fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    fun defaultUnitAmount(): String =
                        defaultUnitAmount.getRequired("default_unit_amount")

                    /** Matrix values for specified matrix grouping keys */
                    fun matrixValues(): List<MatrixValue> =
                        matrixValues.getRequired("matrix_values")

                    /** One or two event property values to evaluate matrix groups by */
                    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    fun _defaultUnitAmount() = defaultUnitAmount

                    /** Matrix values for specified matrix grouping keys */
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    fun _matrixValues() = matrixValues

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): MatrixConfig = apply {
                        if (!validated) {
                            dimensions()
                            defaultUnitAmount()
                            matrixValues().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MatrixConfig &&
                            this.dimensions == other.dimensions &&
                            this.defaultUnitAmount == other.defaultUnitAmount &&
                            this.matrixValues == other.matrixValues &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    dimensions,
                                    defaultUnitAmount,
                                    matrixValues,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                        private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                        private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixConfig: MatrixConfig) = apply {
                            this.dimensions = matrixConfig.dimensions
                            this.defaultUnitAmount = matrixConfig.defaultUnitAmount
                            this.matrixValues = matrixConfig.matrixValues
                            additionalProperties(matrixConfig.additionalProperties)
                        }

                        /** One or two event property values to evaluate matrix groups by */
                        fun dimensions(dimensions: List<String?>) =
                            dimensions(JsonField.of(dimensions))

                        /** One or two event property values to evaluate matrix groups by */
                        @JsonProperty("dimensions")
                        @ExcludeMissing
                        fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                            this.dimensions = dimensions
                        }

                        /**
                         * Default per unit rate for any usage not bucketed into a specified
                         * matrix_value
                         */
                        fun defaultUnitAmount(defaultUnitAmount: String) =
                            defaultUnitAmount(JsonField.of(defaultUnitAmount))

                        /**
                         * Default per unit rate for any usage not bucketed into a specified
                         * matrix_value
                         */
                        @JsonProperty("default_unit_amount")
                        @ExcludeMissing
                        fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                            this.defaultUnitAmount = defaultUnitAmount
                        }

                        /** Matrix values for specified matrix grouping keys */
                        fun matrixValues(matrixValues: List<MatrixValue>) =
                            matrixValues(JsonField.of(matrixValues))

                        /** Matrix values for specified matrix grouping keys */
                        @JsonProperty("matrix_values")
                        @ExcludeMissing
                        fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                            this.matrixValues = matrixValues
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): MatrixConfig =
                            MatrixConfig(
                                dimensions.map { it.toUnmodifiable() },
                                defaultUnitAmount,
                                matrixValues.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = MatrixValue.Builder::class)
                    @NoAutoDetect
                    class MatrixValue
                    private constructor(
                        private val unitAmount: JsonField<String>,
                        private val dimensionValues: JsonField<List<String?>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Unit price for the specified dimension_values */
                        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        fun dimensionValues(): List<String?> =
                            dimensionValues.getRequired("dimension_values")

                        /** Unit price for the specified dimension_values */
                        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        fun _dimensionValues() = dimensionValues

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): MatrixValue = apply {
                            if (!validated) {
                                unitAmount()
                                dimensionValues()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is MatrixValue &&
                                this.unitAmount == other.unitAmount &&
                                this.dimensionValues == other.dimensionValues &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        unitAmount,
                                        dimensionValues,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var unitAmount: JsonField<String> = JsonMissing.of()
                            private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(matrixValue: MatrixValue) = apply {
                                this.unitAmount = matrixValue.unitAmount
                                this.dimensionValues = matrixValue.dimensionValues
                                additionalProperties(matrixValue.additionalProperties)
                            }

                            /** Unit price for the specified dimension_values */
                            fun unitAmount(unitAmount: String) =
                                unitAmount(JsonField.of(unitAmount))

                            /** Unit price for the specified dimension_values */
                            @JsonProperty("unit_amount")
                            @ExcludeMissing
                            fun unitAmount(unitAmount: JsonField<String>) = apply {
                                this.unitAmount = unitAmount
                            }

                            /**
                             * One or two matrix keys to filter usage to this Matrix value by. For
                             * example, ["region", "tier"] could be used to filter cloud usage by a
                             * cloud region and an instance tier.
                             */
                            fun dimensionValues(dimensionValues: List<String?>) =
                                dimensionValues(JsonField.of(dimensionValues))

                            /**
                             * One or two matrix keys to filter usage to this Matrix value by. For
                             * example, ["region", "tier"] could be used to filter cloud usage by a
                             * cloud region and an instance tier.
                             */
                            @JsonProperty("dimension_values")
                            @ExcludeMissing
                            fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                                this.dimensionValues = dimensionValues
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): MatrixValue =
                                MatrixValue(
                                    unitAmount,
                                    dimensionValues.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MATRIX = ModelType(JsonField.of("matrix"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        MATRIX,
                    }

                    enum class Value {
                        MATRIX,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MATRIX -> Value.MATRIX
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MATRIX -> Known.MATRIX
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingMatrixWithAllocationPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingMatrixWithAllocationPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun matrixWithAllocationConfig(): MatrixWithAllocationConfig =
                    matrixWithAllocationConfig.getRequired("matrix_with_allocation_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("matrix_with_allocation_config")
                @ExcludeMissing
                fun _matrixWithAllocationConfig() = matrixWithAllocationConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingMatrixWithAllocationPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        matrixWithAllocationConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingMatrixWithAllocationPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.matrixWithAllocationConfig == other.matrixWithAllocationConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                matrixWithAllocationConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingMatrixWithAllocationPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, matrixWithAllocationConfig=$matrixWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
                    ) = apply {
                        this.externalPriceId = newFloatingMatrixWithAllocationPrice.externalPriceId
                        this.name = newFloatingMatrixWithAllocationPrice.name
                        this.billableMetricId =
                            newFloatingMatrixWithAllocationPrice.billableMetricId
                        this.itemId = newFloatingMatrixWithAllocationPrice.itemId
                        this.billedInAdvance = newFloatingMatrixWithAllocationPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingMatrixWithAllocationPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingMatrixWithAllocationPrice.invoiceGroupingKey
                        this.cadence = newFloatingMatrixWithAllocationPrice.cadence
                        this.conversionRate = newFloatingMatrixWithAllocationPrice.conversionRate
                        this.modelType = newFloatingMatrixWithAllocationPrice.modelType
                        this.matrixWithAllocationConfig =
                            newFloatingMatrixWithAllocationPrice.matrixWithAllocationConfig
                        this.currency = newFloatingMatrixWithAllocationPrice.currency
                        additionalProperties(
                            newFloatingMatrixWithAllocationPrice.additionalProperties
                        )
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun matrixWithAllocationConfig(
                        matrixWithAllocationConfig: MatrixWithAllocationConfig
                    ) = matrixWithAllocationConfig(JsonField.of(matrixWithAllocationConfig))

                    @JsonProperty("matrix_with_allocation_config")
                    @ExcludeMissing
                    fun matrixWithAllocationConfig(
                        matrixWithAllocationConfig: JsonField<MatrixWithAllocationConfig>
                    ) = apply { this.matrixWithAllocationConfig = matrixWithAllocationConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingMatrixWithAllocationPrice =
                        NewFloatingMatrixWithAllocationPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            matrixWithAllocationConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = MatrixWithAllocationConfig.Builder::class)
                @NoAutoDetect
                class MatrixWithAllocationConfig
                private constructor(
                    private val dimensions: JsonField<List<String?>>,
                    private val defaultUnitAmount: JsonField<String>,
                    private val matrixValues: JsonField<List<MatrixValue>>,
                    private val allocation: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** One or two event property values to evaluate matrix groups by */
                    fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    fun defaultUnitAmount(): String =
                        defaultUnitAmount.getRequired("default_unit_amount")

                    /** Matrix values for specified matrix grouping keys */
                    fun matrixValues(): List<MatrixValue> =
                        matrixValues.getRequired("matrix_values")

                    /** Allocation to be used to calculate the price */
                    fun allocation(): Double = allocation.getRequired("allocation")

                    /** One or two event property values to evaluate matrix groups by */
                    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    fun _defaultUnitAmount() = defaultUnitAmount

                    /** Matrix values for specified matrix grouping keys */
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    fun _matrixValues() = matrixValues

                    /** Allocation to be used to calculate the price */
                    @JsonProperty("allocation") @ExcludeMissing fun _allocation() = allocation

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): MatrixWithAllocationConfig = apply {
                        if (!validated) {
                            dimensions()
                            defaultUnitAmount()
                            matrixValues().forEach { it.validate() }
                            allocation()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MatrixWithAllocationConfig &&
                            this.dimensions == other.dimensions &&
                            this.defaultUnitAmount == other.defaultUnitAmount &&
                            this.matrixValues == other.matrixValues &&
                            this.allocation == other.allocation &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    dimensions,
                                    defaultUnitAmount,
                                    matrixValues,
                                    allocation,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "MatrixWithAllocationConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, allocation=$allocation, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                        private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                        private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                        private var allocation: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixWithAllocationConfig: MatrixWithAllocationConfig) =
                            apply {
                                this.dimensions = matrixWithAllocationConfig.dimensions
                                this.defaultUnitAmount =
                                    matrixWithAllocationConfig.defaultUnitAmount
                                this.matrixValues = matrixWithAllocationConfig.matrixValues
                                this.allocation = matrixWithAllocationConfig.allocation
                                additionalProperties(
                                    matrixWithAllocationConfig.additionalProperties
                                )
                            }

                        /** One or two event property values to evaluate matrix groups by */
                        fun dimensions(dimensions: List<String?>) =
                            dimensions(JsonField.of(dimensions))

                        /** One or two event property values to evaluate matrix groups by */
                        @JsonProperty("dimensions")
                        @ExcludeMissing
                        fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                            this.dimensions = dimensions
                        }

                        /**
                         * Default per unit rate for any usage not bucketed into a specified
                         * matrix_value
                         */
                        fun defaultUnitAmount(defaultUnitAmount: String) =
                            defaultUnitAmount(JsonField.of(defaultUnitAmount))

                        /**
                         * Default per unit rate for any usage not bucketed into a specified
                         * matrix_value
                         */
                        @JsonProperty("default_unit_amount")
                        @ExcludeMissing
                        fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                            this.defaultUnitAmount = defaultUnitAmount
                        }

                        /** Matrix values for specified matrix grouping keys */
                        fun matrixValues(matrixValues: List<MatrixValue>) =
                            matrixValues(JsonField.of(matrixValues))

                        /** Matrix values for specified matrix grouping keys */
                        @JsonProperty("matrix_values")
                        @ExcludeMissing
                        fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                            this.matrixValues = matrixValues
                        }

                        /** Allocation to be used to calculate the price */
                        fun allocation(allocation: Double) = allocation(JsonField.of(allocation))

                        /** Allocation to be used to calculate the price */
                        @JsonProperty("allocation")
                        @ExcludeMissing
                        fun allocation(allocation: JsonField<Double>) = apply {
                            this.allocation = allocation
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): MatrixWithAllocationConfig =
                            MatrixWithAllocationConfig(
                                dimensions.map { it.toUnmodifiable() },
                                defaultUnitAmount,
                                matrixValues.map { it.toUnmodifiable() },
                                allocation,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = MatrixValue.Builder::class)
                    @NoAutoDetect
                    class MatrixValue
                    private constructor(
                        private val unitAmount: JsonField<String>,
                        private val dimensionValues: JsonField<List<String?>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Unit price for the specified dimension_values */
                        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        fun dimensionValues(): List<String?> =
                            dimensionValues.getRequired("dimension_values")

                        /** Unit price for the specified dimension_values */
                        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        fun _dimensionValues() = dimensionValues

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): MatrixValue = apply {
                            if (!validated) {
                                unitAmount()
                                dimensionValues()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is MatrixValue &&
                                this.unitAmount == other.unitAmount &&
                                this.dimensionValues == other.dimensionValues &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        unitAmount,
                                        dimensionValues,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var unitAmount: JsonField<String> = JsonMissing.of()
                            private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(matrixValue: MatrixValue) = apply {
                                this.unitAmount = matrixValue.unitAmount
                                this.dimensionValues = matrixValue.dimensionValues
                                additionalProperties(matrixValue.additionalProperties)
                            }

                            /** Unit price for the specified dimension_values */
                            fun unitAmount(unitAmount: String) =
                                unitAmount(JsonField.of(unitAmount))

                            /** Unit price for the specified dimension_values */
                            @JsonProperty("unit_amount")
                            @ExcludeMissing
                            fun unitAmount(unitAmount: JsonField<String>) = apply {
                                this.unitAmount = unitAmount
                            }

                            /**
                             * One or two matrix keys to filter usage to this Matrix value by. For
                             * example, ["region", "tier"] could be used to filter cloud usage by a
                             * cloud region and an instance tier.
                             */
                            fun dimensionValues(dimensionValues: List<String?>) =
                                dimensionValues(JsonField.of(dimensionValues))

                            /**
                             * One or two matrix keys to filter usage to this Matrix value by. For
                             * example, ["region", "tier"] could be used to filter cloud usage by a
                             * cloud region and an instance tier.
                             */
                            @JsonProperty("dimension_values")
                            @ExcludeMissing
                            fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                                this.dimensionValues = dimensionValues
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): MatrixValue =
                                MatrixValue(
                                    unitAmount,
                                    dimensionValues.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MATRIX_WITH_ALLOCATION =
                            ModelType(JsonField.of("matrix_with_allocation"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        MATRIX_WITH_ALLOCATION,
                    }

                    enum class Value {
                        MATRIX_WITH_ALLOCATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MATRIX_WITH_ALLOCATION -> Value.MATRIX_WITH_ALLOCATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MATRIX_WITH_ALLOCATION -> Known.MATRIX_WITH_ALLOCATION
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredConfig: JsonField<TieredConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredConfig(): TieredConfig = tieredConfig.getRequired("tiered_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_config") @ExcludeMissing fun _tieredConfig() = tieredConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredConfig == other.tieredConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredConfig=$tieredConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredConfig: JsonField<TieredConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
                        this.externalPriceId = newFloatingTieredPrice.externalPriceId
                        this.name = newFloatingTieredPrice.name
                        this.billableMetricId = newFloatingTieredPrice.billableMetricId
                        this.itemId = newFloatingTieredPrice.itemId
                        this.billedInAdvance = newFloatingTieredPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingTieredPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingTieredPrice.invoiceGroupingKey
                        this.cadence = newFloatingTieredPrice.cadence
                        this.conversionRate = newFloatingTieredPrice.conversionRate
                        this.modelType = newFloatingTieredPrice.modelType
                        this.tieredConfig = newFloatingTieredPrice.tieredConfig
                        this.currency = newFloatingTieredPrice.currency
                        additionalProperties(newFloatingTieredPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredConfig(tieredConfig: TieredConfig) =
                        tieredConfig(JsonField.of(tieredConfig))

                    @JsonProperty("tiered_config")
                    @ExcludeMissing
                    fun tieredConfig(tieredConfig: JsonField<TieredConfig>) = apply {
                        this.tieredConfig = tieredConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredPrice =
                        NewFloatingTieredPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED = ModelType(JsonField.of("tiered"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED,
                    }

                    enum class Value {
                        TIERED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED -> Value.TIERED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED -> Known.TIERED
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredConfig.Builder::class)
                @NoAutoDetect
                class TieredConfig
                private constructor(
                    private val tiers: JsonField<List<Tier>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredConfig = apply {
                        if (!validated) {
                            tiers().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredConfig &&
                            this.tiers == other.tiers &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(tiers, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tieredConfig: TieredConfig) = apply {
                            this.tiers = tieredConfig.tiers
                            additionalProperties(tieredConfig.additionalProperties)
                        }

                        /**
                         * Tiers for rating based on total usage quantities into the specified tier
                         */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /**
                         * Tiers for rating based on total usage quantities into the specified tier
                         */
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredConfig =
                            TieredConfig(
                                tiers.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable()
                            )
                    }

                    @JsonDeserialize(builder = Tier.Builder::class)
                    @NoAutoDetect
                    class Tier
                    private constructor(
                        private val firstUnit: JsonField<Double>,
                        private val lastUnit: JsonField<Double>,
                        private val unitAmount: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Inclusive tier starting value */
                        fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                        /** Amount per unit */
                        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                        /** Inclusive tier starting value */
                        @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                        /** Amount per unit */
                        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Tier = apply {
                            if (!validated) {
                                firstUnit()
                                lastUnit()
                                unitAmount()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                this.firstUnit == other.firstUnit &&
                                this.lastUnit == other.lastUnit &&
                                this.unitAmount == other.unitAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        firstUnit,
                                        lastUnit,
                                        unitAmount,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var firstUnit: JsonField<Double> = JsonMissing.of()
                            private var lastUnit: JsonField<Double> = JsonMissing.of()
                            private var unitAmount: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tier: Tier) = apply {
                                this.firstUnit = tier.firstUnit
                                this.lastUnit = tier.lastUnit
                                this.unitAmount = tier.unitAmount
                                additionalProperties(tier.additionalProperties)
                            }

                            /** Inclusive tier starting value */
                            fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                            /** Inclusive tier starting value */
                            @JsonProperty("first_unit")
                            @ExcludeMissing
                            fun firstUnit(firstUnit: JsonField<Double>) = apply {
                                this.firstUnit = firstUnit
                            }

                            /**
                             * Exclusive tier ending value. If null, this is treated as the last
                             * tier
                             */
                            fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

                            /**
                             * Exclusive tier ending value. If null, this is treated as the last
                             * tier
                             */
                            @JsonProperty("last_unit")
                            @ExcludeMissing
                            fun lastUnit(lastUnit: JsonField<Double>) = apply {
                                this.lastUnit = lastUnit
                            }

                            /** Amount per unit */
                            fun unitAmount(unitAmount: String) =
                                unitAmount(JsonField.of(unitAmount))

                            /** Amount per unit */
                            @JsonProperty("unit_amount")
                            @ExcludeMissing
                            fun unitAmount(unitAmount: JsonField<String>) = apply {
                                this.unitAmount = unitAmount
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Tier =
                                Tier(
                                    firstUnit,
                                    lastUnit,
                                    unitAmount,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredBpsPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredBpsPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredBpsConfig: JsonField<TieredBpsConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredBpsConfig(): TieredBpsConfig =
                    tieredBpsConfig.getRequired("tiered_bps_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_bps_config")
                @ExcludeMissing
                fun _tieredBpsConfig() = tieredBpsConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredBpsPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredBpsConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredBpsPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredBpsConfig == other.tieredBpsConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredBpsConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredBpsPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredBpsConfig=$tieredBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredBpsConfig: JsonField<TieredBpsConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) =
                        apply {
                            this.externalPriceId = newFloatingTieredBpsPrice.externalPriceId
                            this.name = newFloatingTieredBpsPrice.name
                            this.billableMetricId = newFloatingTieredBpsPrice.billableMetricId
                            this.itemId = newFloatingTieredBpsPrice.itemId
                            this.billedInAdvance = newFloatingTieredBpsPrice.billedInAdvance
                            this.fixedPriceQuantity = newFloatingTieredBpsPrice.fixedPriceQuantity
                            this.invoiceGroupingKey = newFloatingTieredBpsPrice.invoiceGroupingKey
                            this.cadence = newFloatingTieredBpsPrice.cadence
                            this.conversionRate = newFloatingTieredBpsPrice.conversionRate
                            this.modelType = newFloatingTieredBpsPrice.modelType
                            this.tieredBpsConfig = newFloatingTieredBpsPrice.tieredBpsConfig
                            this.currency = newFloatingTieredBpsPrice.currency
                            additionalProperties(newFloatingTieredBpsPrice.additionalProperties)
                        }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) =
                        tieredBpsConfig(JsonField.of(tieredBpsConfig))

                    @JsonProperty("tiered_bps_config")
                    @ExcludeMissing
                    fun tieredBpsConfig(tieredBpsConfig: JsonField<TieredBpsConfig>) = apply {
                        this.tieredBpsConfig = tieredBpsConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredBpsPrice =
                        NewFloatingTieredBpsPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredBpsConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED_BPS = ModelType(JsonField.of("tiered_bps"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED_BPS,
                    }

                    enum class Value {
                        TIERED_BPS,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED_BPS -> Value.TIERED_BPS
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED_BPS -> Known.TIERED_BPS
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredBpsConfig.Builder::class)
                @NoAutoDetect
                class TieredBpsConfig
                private constructor(
                    private val tiers: JsonField<List<Tier>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredBpsConfig = apply {
                        if (!validated) {
                            tiers().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredBpsConfig &&
                            this.tiers == other.tiers &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(tiers, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                            this.tiers = tieredBpsConfig.tiers
                            additionalProperties(tieredBpsConfig.additionalProperties)
                        }

                        /**
                         * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                         * specified tiers
                         */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /**
                         * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                         * specified tiers
                         */
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredBpsConfig =
                            TieredBpsConfig(
                                tiers.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable()
                            )
                    }

                    @JsonDeserialize(builder = Tier.Builder::class)
                    @NoAutoDetect
                    class Tier
                    private constructor(
                        private val minimumAmount: JsonField<String>,
                        private val maximumAmount: JsonField<String>,
                        private val bps: JsonField<Double>,
                        private val perUnitMaximum: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Inclusive tier starting value */
                        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                        /** Exclusive tier ending value */
                        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                        /** Per-event basis point rate */
                        fun bps(): Double = bps.getRequired("bps")

                        /** Per unit maximum to charge */
                        fun perUnitMaximum(): String? =
                            perUnitMaximum.getNullable("per_unit_maximum")

                        /** Inclusive tier starting value */
                        @JsonProperty("minimum_amount")
                        @ExcludeMissing
                        fun _minimumAmount() = minimumAmount

                        /** Exclusive tier ending value */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun _maximumAmount() = maximumAmount

                        /** Per-event basis point rate */
                        @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                        /** Per unit maximum to charge */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun _perUnitMaximum() = perUnitMaximum

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Tier = apply {
                            if (!validated) {
                                minimumAmount()
                                maximumAmount()
                                bps()
                                perUnitMaximum()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                this.minimumAmount == other.minimumAmount &&
                                this.maximumAmount == other.maximumAmount &&
                                this.bps == other.bps &&
                                this.perUnitMaximum == other.perUnitMaximum &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        minimumAmount,
                                        maximumAmount,
                                        bps,
                                        perUnitMaximum,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var minimumAmount: JsonField<String> = JsonMissing.of()
                            private var maximumAmount: JsonField<String> = JsonMissing.of()
                            private var bps: JsonField<Double> = JsonMissing.of()
                            private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tier: Tier) = apply {
                                this.minimumAmount = tier.minimumAmount
                                this.maximumAmount = tier.maximumAmount
                                this.bps = tier.bps
                                this.perUnitMaximum = tier.perUnitMaximum
                                additionalProperties(tier.additionalProperties)
                            }

                            /** Inclusive tier starting value */
                            fun minimumAmount(minimumAmount: String) =
                                minimumAmount(JsonField.of(minimumAmount))

                            /** Inclusive tier starting value */
                            @JsonProperty("minimum_amount")
                            @ExcludeMissing
                            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                                this.minimumAmount = minimumAmount
                            }

                            /** Exclusive tier ending value */
                            fun maximumAmount(maximumAmount: String) =
                                maximumAmount(JsonField.of(maximumAmount))

                            /** Exclusive tier ending value */
                            @JsonProperty("maximum_amount")
                            @ExcludeMissing
                            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                                this.maximumAmount = maximumAmount
                            }

                            /** Per-event basis point rate */
                            fun bps(bps: Double) = bps(JsonField.of(bps))

                            /** Per-event basis point rate */
                            @JsonProperty("bps")
                            @ExcludeMissing
                            fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                            /** Per unit maximum to charge */
                            fun perUnitMaximum(perUnitMaximum: String) =
                                perUnitMaximum(JsonField.of(perUnitMaximum))

                            /** Per unit maximum to charge */
                            @JsonProperty("per_unit_maximum")
                            @ExcludeMissing
                            fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                                this.perUnitMaximum = perUnitMaximum
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Tier =
                                Tier(
                                    minimumAmount,
                                    maximumAmount,
                                    bps,
                                    perUnitMaximum,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingBpsPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingBpsPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val bpsConfig: JsonField<BpsConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun bpsConfig(): BpsConfig = bpsConfig.getRequired("bps_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("bps_config") @ExcludeMissing fun _bpsConfig() = bpsConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingBpsPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        bpsConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingBpsPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.bpsConfig == other.bpsConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                bpsConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingBpsPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, bpsConfig=$bpsConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var bpsConfig: JsonField<BpsConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingBpsPrice: NewFloatingBpsPrice) = apply {
                        this.externalPriceId = newFloatingBpsPrice.externalPriceId
                        this.name = newFloatingBpsPrice.name
                        this.billableMetricId = newFloatingBpsPrice.billableMetricId
                        this.itemId = newFloatingBpsPrice.itemId
                        this.billedInAdvance = newFloatingBpsPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingBpsPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingBpsPrice.invoiceGroupingKey
                        this.cadence = newFloatingBpsPrice.cadence
                        this.conversionRate = newFloatingBpsPrice.conversionRate
                        this.modelType = newFloatingBpsPrice.modelType
                        this.bpsConfig = newFloatingBpsPrice.bpsConfig
                        this.currency = newFloatingBpsPrice.currency
                        additionalProperties(newFloatingBpsPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun bpsConfig(bpsConfig: BpsConfig) = bpsConfig(JsonField.of(bpsConfig))

                    @JsonProperty("bps_config")
                    @ExcludeMissing
                    fun bpsConfig(bpsConfig: JsonField<BpsConfig>) = apply {
                        this.bpsConfig = bpsConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingBpsPrice =
                        NewFloatingBpsPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            bpsConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = BpsConfig.Builder::class)
                @NoAutoDetect
                class BpsConfig
                private constructor(
                    private val bps: JsonField<Double>,
                    private val perUnitMaximum: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Basis point take rate per event */
                    fun bps(): Double = bps.getRequired("bps")

                    /** Optional currency amount maximum to cap spend per event */
                    fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                    /** Basis point take rate per event */
                    @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                    /** Optional currency amount maximum to cap spend per event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun _perUnitMaximum() = perUnitMaximum

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): BpsConfig = apply {
                        if (!validated) {
                            bps()
                            perUnitMaximum()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BpsConfig &&
                            this.bps == other.bps &&
                            this.perUnitMaximum == other.perUnitMaximum &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    bps,
                                    perUnitMaximum,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var bps: JsonField<Double> = JsonMissing.of()
                        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(bpsConfig: BpsConfig) = apply {
                            this.bps = bpsConfig.bps
                            this.perUnitMaximum = bpsConfig.perUnitMaximum
                            additionalProperties(bpsConfig.additionalProperties)
                        }

                        /** Basis point take rate per event */
                        fun bps(bps: Double) = bps(JsonField.of(bps))

                        /** Basis point take rate per event */
                        @JsonProperty("bps")
                        @ExcludeMissing
                        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                        /** Optional currency amount maximum to cap spend per event */
                        fun perUnitMaximum(perUnitMaximum: String) =
                            perUnitMaximum(JsonField.of(perUnitMaximum))

                        /** Optional currency amount maximum to cap spend per event */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                            this.perUnitMaximum = perUnitMaximum
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): BpsConfig =
                            BpsConfig(
                                bps,
                                perUnitMaximum,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BPS = ModelType(JsonField.of("bps"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        BPS,
                    }

                    enum class Value {
                        BPS,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BPS -> Value.BPS
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BPS -> Known.BPS
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingBulkBpsPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingBulkBpsPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val bulkBpsConfig: JsonField<BulkBpsConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig.getRequired("bulk_bps_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("bulk_bps_config")
                @ExcludeMissing
                fun _bulkBpsConfig() = bulkBpsConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingBulkBpsPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        bulkBpsConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingBulkBpsPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.bulkBpsConfig == other.bulkBpsConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                bulkBpsConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingBulkBpsPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, bulkBpsConfig=$bulkBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var bulkBpsConfig: JsonField<BulkBpsConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) = apply {
                        this.externalPriceId = newFloatingBulkBpsPrice.externalPriceId
                        this.name = newFloatingBulkBpsPrice.name
                        this.billableMetricId = newFloatingBulkBpsPrice.billableMetricId
                        this.itemId = newFloatingBulkBpsPrice.itemId
                        this.billedInAdvance = newFloatingBulkBpsPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingBulkBpsPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingBulkBpsPrice.invoiceGroupingKey
                        this.cadence = newFloatingBulkBpsPrice.cadence
                        this.conversionRate = newFloatingBulkBpsPrice.conversionRate
                        this.modelType = newFloatingBulkBpsPrice.modelType
                        this.bulkBpsConfig = newFloatingBulkBpsPrice.bulkBpsConfig
                        this.currency = newFloatingBulkBpsPrice.currency
                        additionalProperties(newFloatingBulkBpsPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) =
                        bulkBpsConfig(JsonField.of(bulkBpsConfig))

                    @JsonProperty("bulk_bps_config")
                    @ExcludeMissing
                    fun bulkBpsConfig(bulkBpsConfig: JsonField<BulkBpsConfig>) = apply {
                        this.bulkBpsConfig = bulkBpsConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingBulkBpsPrice =
                        NewFloatingBulkBpsPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            bulkBpsConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = BulkBpsConfig.Builder::class)
                @NoAutoDetect
                class BulkBpsConfig
                private constructor(
                    private val tiers: JsonField<List<Tier>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): BulkBpsConfig = apply {
                        if (!validated) {
                            tiers().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BulkBpsConfig &&
                            this.tiers == other.tiers &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(tiers, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                            this.tiers = bulkBpsConfig.tiers
                            additionalProperties(bulkBpsConfig.additionalProperties)
                        }

                        /**
                         * Tiers for a bulk BPS pricing model where all usage is aggregated to a
                         * single tier based on total volume
                         */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /**
                         * Tiers for a bulk BPS pricing model where all usage is aggregated to a
                         * single tier based on total volume
                         */
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): BulkBpsConfig =
                            BulkBpsConfig(
                                tiers.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable()
                            )
                    }

                    @JsonDeserialize(builder = Tier.Builder::class)
                    @NoAutoDetect
                    class Tier
                    private constructor(
                        private val maximumAmount: JsonField<String>,
                        private val bps: JsonField<Double>,
                        private val perUnitMaximum: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Upper bound for tier */
                        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                        /** Basis points to rate on */
                        fun bps(): Double = bps.getRequired("bps")

                        /** The maximum amount to charge for any one event */
                        fun perUnitMaximum(): String? =
                            perUnitMaximum.getNullable("per_unit_maximum")

                        /** Upper bound for tier */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun _maximumAmount() = maximumAmount

                        /** Basis points to rate on */
                        @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                        /** The maximum amount to charge for any one event */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun _perUnitMaximum() = perUnitMaximum

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Tier = apply {
                            if (!validated) {
                                maximumAmount()
                                bps()
                                perUnitMaximum()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                this.maximumAmount == other.maximumAmount &&
                                this.bps == other.bps &&
                                this.perUnitMaximum == other.perUnitMaximum &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        maximumAmount,
                                        bps,
                                        perUnitMaximum,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var maximumAmount: JsonField<String> = JsonMissing.of()
                            private var bps: JsonField<Double> = JsonMissing.of()
                            private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tier: Tier) = apply {
                                this.maximumAmount = tier.maximumAmount
                                this.bps = tier.bps
                                this.perUnitMaximum = tier.perUnitMaximum
                                additionalProperties(tier.additionalProperties)
                            }

                            /** Upper bound for tier */
                            fun maximumAmount(maximumAmount: String) =
                                maximumAmount(JsonField.of(maximumAmount))

                            /** Upper bound for tier */
                            @JsonProperty("maximum_amount")
                            @ExcludeMissing
                            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                                this.maximumAmount = maximumAmount
                            }

                            /** Basis points to rate on */
                            fun bps(bps: Double) = bps(JsonField.of(bps))

                            /** Basis points to rate on */
                            @JsonProperty("bps")
                            @ExcludeMissing
                            fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                            /** The maximum amount to charge for any one event */
                            fun perUnitMaximum(perUnitMaximum: String) =
                                perUnitMaximum(JsonField.of(perUnitMaximum))

                            /** The maximum amount to charge for any one event */
                            @JsonProperty("per_unit_maximum")
                            @ExcludeMissing
                            fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                                this.perUnitMaximum = perUnitMaximum
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Tier =
                                Tier(
                                    maximumAmount,
                                    bps,
                                    perUnitMaximum,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BULK_BPS = ModelType(JsonField.of("bulk_bps"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        BULK_BPS,
                    }

                    enum class Value {
                        BULK_BPS,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BULK_BPS -> Value.BULK_BPS
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BULK_BPS -> Known.BULK_BPS
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingBulkPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingBulkPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val bulkConfig: JsonField<BulkConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun bulkConfig(): BulkConfig = bulkConfig.getRequired("bulk_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("bulk_config") @ExcludeMissing fun _bulkConfig() = bulkConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingBulkPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        bulkConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingBulkPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.bulkConfig == other.bulkConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                bulkConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingBulkPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, bulkConfig=$bulkConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var bulkConfig: JsonField<BulkConfig> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(newFloatingBulkPrice: NewFloatingBulkPrice) = apply {
                        this.externalPriceId = newFloatingBulkPrice.externalPriceId
                        this.name = newFloatingBulkPrice.name
                        this.billableMetricId = newFloatingBulkPrice.billableMetricId
                        this.itemId = newFloatingBulkPrice.itemId
                        this.billedInAdvance = newFloatingBulkPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingBulkPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingBulkPrice.invoiceGroupingKey
                        this.cadence = newFloatingBulkPrice.cadence
                        this.conversionRate = newFloatingBulkPrice.conversionRate
                        this.modelType = newFloatingBulkPrice.modelType
                        this.bulkConfig = newFloatingBulkPrice.bulkConfig
                        this.currency = newFloatingBulkPrice.currency
                        additionalProperties(newFloatingBulkPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun bulkConfig(bulkConfig: BulkConfig) = bulkConfig(JsonField.of(bulkConfig))

                    @JsonProperty("bulk_config")
                    @ExcludeMissing
                    fun bulkConfig(bulkConfig: JsonField<BulkConfig>) = apply {
                        this.bulkConfig = bulkConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingBulkPrice =
                        NewFloatingBulkPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            bulkConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = BulkConfig.Builder::class)
                @NoAutoDetect
                class BulkConfig
                private constructor(
                    private val tiers: JsonField<List<Tier>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Bulk tiers for rating based on total usage volume */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /** Bulk tiers for rating based on total usage volume */
                    @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): BulkConfig = apply {
                        if (!validated) {
                            tiers().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BulkConfig &&
                            this.tiers == other.tiers &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(tiers, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(bulkConfig: BulkConfig) = apply {
                            this.tiers = bulkConfig.tiers
                            additionalProperties(bulkConfig.additionalProperties)
                        }

                        /** Bulk tiers for rating based on total usage volume */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /** Bulk tiers for rating based on total usage volume */
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): BulkConfig =
                            BulkConfig(
                                tiers.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable()
                            )
                    }

                    @JsonDeserialize(builder = Tier.Builder::class)
                    @NoAutoDetect
                    class Tier
                    private constructor(
                        private val maximumUnits: JsonField<Double>,
                        private val unitAmount: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Upper bound for this tier */
                        fun maximumUnits(): Double? = maximumUnits.getNullable("maximum_units")

                        /** Amount per unit */
                        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                        /** Upper bound for this tier */
                        @JsonProperty("maximum_units")
                        @ExcludeMissing
                        fun _maximumUnits() = maximumUnits

                        /** Amount per unit */
                        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Tier = apply {
                            if (!validated) {
                                maximumUnits()
                                unitAmount()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                this.maximumUnits == other.maximumUnits &&
                                this.unitAmount == other.unitAmount &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        maximumUnits,
                                        unitAmount,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var maximumUnits: JsonField<Double> = JsonMissing.of()
                            private var unitAmount: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tier: Tier) = apply {
                                this.maximumUnits = tier.maximumUnits
                                this.unitAmount = tier.unitAmount
                                additionalProperties(tier.additionalProperties)
                            }

                            /** Upper bound for this tier */
                            fun maximumUnits(maximumUnits: Double) =
                                maximumUnits(JsonField.of(maximumUnits))

                            /** Upper bound for this tier */
                            @JsonProperty("maximum_units")
                            @ExcludeMissing
                            fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
                                this.maximumUnits = maximumUnits
                            }

                            /** Amount per unit */
                            fun unitAmount(unitAmount: String) =
                                unitAmount(JsonField.of(unitAmount))

                            /** Amount per unit */
                            @JsonProperty("unit_amount")
                            @ExcludeMissing
                            fun unitAmount(unitAmount: JsonField<String>) = apply {
                                this.unitAmount = unitAmount
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Tier =
                                Tier(
                                    maximumUnits,
                                    unitAmount,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BULK = ModelType(JsonField.of("bulk"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        BULK,
                    }

                    enum class Value {
                        BULK,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BULK -> Value.BULK
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BULK -> Known.BULK
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingThresholdTotalAmountPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingThresholdTotalAmountPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig =
                    thresholdTotalAmountConfig.getRequired("threshold_total_amount_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("threshold_total_amount_config")
                @ExcludeMissing
                fun _thresholdTotalAmountConfig() = thresholdTotalAmountConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingThresholdTotalAmountPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        thresholdTotalAmountConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingThresholdTotalAmountPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.thresholdTotalAmountConfig == other.thresholdTotalAmountConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                thresholdTotalAmountConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingThresholdTotalAmountPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
                    ) = apply {
                        this.externalPriceId = newFloatingThresholdTotalAmountPrice.externalPriceId
                        this.name = newFloatingThresholdTotalAmountPrice.name
                        this.billableMetricId =
                            newFloatingThresholdTotalAmountPrice.billableMetricId
                        this.itemId = newFloatingThresholdTotalAmountPrice.itemId
                        this.billedInAdvance = newFloatingThresholdTotalAmountPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingThresholdTotalAmountPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingThresholdTotalAmountPrice.invoiceGroupingKey
                        this.cadence = newFloatingThresholdTotalAmountPrice.cadence
                        this.conversionRate = newFloatingThresholdTotalAmountPrice.conversionRate
                        this.modelType = newFloatingThresholdTotalAmountPrice.modelType
                        this.thresholdTotalAmountConfig =
                            newFloatingThresholdTotalAmountPrice.thresholdTotalAmountConfig
                        this.currency = newFloatingThresholdTotalAmountPrice.currency
                        additionalProperties(
                            newFloatingThresholdTotalAmountPrice.additionalProperties
                        )
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun thresholdTotalAmountConfig(
                        thresholdTotalAmountConfig: ThresholdTotalAmountConfig
                    ) = thresholdTotalAmountConfig(JsonField.of(thresholdTotalAmountConfig))

                    @JsonProperty("threshold_total_amount_config")
                    @ExcludeMissing
                    fun thresholdTotalAmountConfig(
                        thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>
                    ) = apply { this.thresholdTotalAmountConfig = thresholdTotalAmountConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingThresholdTotalAmountPrice =
                        NewFloatingThresholdTotalAmountPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            thresholdTotalAmountConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val THRESHOLD_TOTAL_AMOUNT =
                            ModelType(JsonField.of("threshold_total_amount"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        THRESHOLD_TOTAL_AMOUNT,
                    }

                    enum class Value {
                        THRESHOLD_TOTAL_AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            THRESHOLD_TOTAL_AMOUNT -> Value.THRESHOLD_TOTAL_AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            THRESHOLD_TOTAL_AMOUNT -> Known.THRESHOLD_TOTAL_AMOUNT
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = ThresholdTotalAmountConfig.Builder::class)
                @NoAutoDetect
                class ThresholdTotalAmountConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ThresholdTotalAmountConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ThresholdTotalAmountConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                            apply {
                                additionalProperties(
                                    thresholdTotalAmountConfig.additionalProperties
                                )
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ThresholdTotalAmountConfig =
                            ThresholdTotalAmountConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredPackagePrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredPackagePrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredPackageConfig: JsonField<TieredPackageConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredPackageConfig(): TieredPackageConfig =
                    tieredPackageConfig.getRequired("tiered_package_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_package_config")
                @ExcludeMissing
                fun _tieredPackageConfig() = tieredPackageConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredPackagePrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredPackageConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredPackagePrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredPackageConfig == other.tieredPackageConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredPackageConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredPackagePrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredPackageConfig=$tieredPackageConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredPackageConfig: JsonField<TieredPackageConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
                    ) = apply {
                        this.externalPriceId = newFloatingTieredPackagePrice.externalPriceId
                        this.name = newFloatingTieredPackagePrice.name
                        this.billableMetricId = newFloatingTieredPackagePrice.billableMetricId
                        this.itemId = newFloatingTieredPackagePrice.itemId
                        this.billedInAdvance = newFloatingTieredPackagePrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingTieredPackagePrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingTieredPackagePrice.invoiceGroupingKey
                        this.cadence = newFloatingTieredPackagePrice.cadence
                        this.conversionRate = newFloatingTieredPackagePrice.conversionRate
                        this.modelType = newFloatingTieredPackagePrice.modelType
                        this.tieredPackageConfig = newFloatingTieredPackagePrice.tieredPackageConfig
                        this.currency = newFloatingTieredPackagePrice.currency
                        additionalProperties(newFloatingTieredPackagePrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) =
                        tieredPackageConfig(JsonField.of(tieredPackageConfig))

                    @JsonProperty("tiered_package_config")
                    @ExcludeMissing
                    fun tieredPackageConfig(tieredPackageConfig: JsonField<TieredPackageConfig>) =
                        apply {
                            this.tieredPackageConfig = tieredPackageConfig
                        }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredPackagePrice =
                        NewFloatingTieredPackagePrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredPackageConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED_PACKAGE = ModelType(JsonField.of("tiered_package"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED_PACKAGE,
                    }

                    enum class Value {
                        TIERED_PACKAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED_PACKAGE -> Value.TIERED_PACKAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED_PACKAGE -> Known.TIERED_PACKAGE
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredPackageConfig.Builder::class)
                @NoAutoDetect
                class TieredPackageConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredPackageConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredPackageConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredPackageConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tieredPackageConfig: TieredPackageConfig) = apply {
                            additionalProperties(tieredPackageConfig.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredPackageConfig =
                            TieredPackageConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingGroupedTieredPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingGroupedTieredPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val groupedTieredConfig: JsonField<GroupedTieredConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun groupedTieredConfig(): GroupedTieredConfig =
                    groupedTieredConfig.getRequired("grouped_tiered_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("grouped_tiered_config")
                @ExcludeMissing
                fun _groupedTieredConfig() = groupedTieredConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingGroupedTieredPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        groupedTieredConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingGroupedTieredPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.groupedTieredConfig == other.groupedTieredConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                groupedTieredConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingGroupedTieredPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, groupedTieredConfig=$groupedTieredConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var groupedTieredConfig: JsonField<GroupedTieredConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
                    ) = apply {
                        this.externalPriceId = newFloatingGroupedTieredPrice.externalPriceId
                        this.name = newFloatingGroupedTieredPrice.name
                        this.billableMetricId = newFloatingGroupedTieredPrice.billableMetricId
                        this.itemId = newFloatingGroupedTieredPrice.itemId
                        this.billedInAdvance = newFloatingGroupedTieredPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingGroupedTieredPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingGroupedTieredPrice.invoiceGroupingKey
                        this.cadence = newFloatingGroupedTieredPrice.cadence
                        this.conversionRate = newFloatingGroupedTieredPrice.conversionRate
                        this.modelType = newFloatingGroupedTieredPrice.modelType
                        this.groupedTieredConfig = newFloatingGroupedTieredPrice.groupedTieredConfig
                        this.currency = newFloatingGroupedTieredPrice.currency
                        additionalProperties(newFloatingGroupedTieredPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun groupedTieredConfig(groupedTieredConfig: GroupedTieredConfig) =
                        groupedTieredConfig(JsonField.of(groupedTieredConfig))

                    @JsonProperty("grouped_tiered_config")
                    @ExcludeMissing
                    fun groupedTieredConfig(groupedTieredConfig: JsonField<GroupedTieredConfig>) =
                        apply {
                            this.groupedTieredConfig = groupedTieredConfig
                        }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingGroupedTieredPrice =
                        NewFloatingGroupedTieredPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            groupedTieredConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = GroupedTieredConfig.Builder::class)
                @NoAutoDetect
                class GroupedTieredConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): GroupedTieredConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupedTieredConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "GroupedTieredConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(groupedTieredConfig: GroupedTieredConfig) = apply {
                            additionalProperties(groupedTieredConfig.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): GroupedTieredConfig =
                            GroupedTieredConfig(additionalProperties.toUnmodifiable())
                    }
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val GROUPED_TIERED = ModelType(JsonField.of("grouped_tiered"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        GROUPED_TIERED,
                    }

                    enum class Value {
                        GROUPED_TIERED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            GROUPED_TIERED -> Value.GROUPED_TIERED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            GROUPED_TIERED -> Known.GROUPED_TIERED
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredWithMinimumPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredWithMinimumPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredWithMinimumConfig(): TieredWithMinimumConfig =
                    tieredWithMinimumConfig.getRequired("tiered_with_minimum_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_with_minimum_config")
                @ExcludeMissing
                fun _tieredWithMinimumConfig() = tieredWithMinimumConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredWithMinimumPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredWithMinimumConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredWithMinimumPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredWithMinimumConfig == other.tieredWithMinimumConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredWithMinimumConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredWithMinimumPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredWithMinimumConfig=$tieredWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
                    ) = apply {
                        this.externalPriceId = newFloatingTieredWithMinimumPrice.externalPriceId
                        this.name = newFloatingTieredWithMinimumPrice.name
                        this.billableMetricId = newFloatingTieredWithMinimumPrice.billableMetricId
                        this.itemId = newFloatingTieredWithMinimumPrice.itemId
                        this.billedInAdvance = newFloatingTieredWithMinimumPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingTieredWithMinimumPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingTieredWithMinimumPrice.invoiceGroupingKey
                        this.cadence = newFloatingTieredWithMinimumPrice.cadence
                        this.conversionRate = newFloatingTieredWithMinimumPrice.conversionRate
                        this.modelType = newFloatingTieredWithMinimumPrice.modelType
                        this.tieredWithMinimumConfig =
                            newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig
                        this.currency = newFloatingTieredWithMinimumPrice.currency
                        additionalProperties(newFloatingTieredWithMinimumPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) =
                        tieredWithMinimumConfig(JsonField.of(tieredWithMinimumConfig))

                    @JsonProperty("tiered_with_minimum_config")
                    @ExcludeMissing
                    fun tieredWithMinimumConfig(
                        tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>
                    ) = apply { this.tieredWithMinimumConfig = tieredWithMinimumConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredWithMinimumPrice =
                        NewFloatingTieredWithMinimumPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredWithMinimumConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED_WITH_MINIMUM = ModelType(JsonField.of("tiered_with_minimum"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED_WITH_MINIMUM,
                    }

                    enum class Value {
                        TIERED_WITH_MINIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED_WITH_MINIMUM -> Value.TIERED_WITH_MINIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED_WITH_MINIMUM -> Known.TIERED_WITH_MINIMUM
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredWithMinimumConfig.Builder::class)
                @NoAutoDetect
                class TieredWithMinimumConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredWithMinimumConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredWithMinimumConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tieredWithMinimumConfig: TieredWithMinimumConfig) =
                            apply {
                                additionalProperties(tieredWithMinimumConfig.additionalProperties)
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredWithMinimumConfig =
                            TieredWithMinimumConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingPackageWithAllocationPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingPackageWithAllocationPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun packageWithAllocationConfig(): PackageWithAllocationConfig =
                    packageWithAllocationConfig.getRequired("package_with_allocation_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("package_with_allocation_config")
                @ExcludeMissing
                fun _packageWithAllocationConfig() = packageWithAllocationConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingPackageWithAllocationPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        packageWithAllocationConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingPackageWithAllocationPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.packageWithAllocationConfig == other.packageWithAllocationConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                packageWithAllocationConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingPackageWithAllocationPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, packageWithAllocationConfig=$packageWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var packageWithAllocationConfig:
                        JsonField<PackageWithAllocationConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
                    ) = apply {
                        this.externalPriceId = newFloatingPackageWithAllocationPrice.externalPriceId
                        this.name = newFloatingPackageWithAllocationPrice.name
                        this.billableMetricId =
                            newFloatingPackageWithAllocationPrice.billableMetricId
                        this.itemId = newFloatingPackageWithAllocationPrice.itemId
                        this.billedInAdvance = newFloatingPackageWithAllocationPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingPackageWithAllocationPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingPackageWithAllocationPrice.invoiceGroupingKey
                        this.cadence = newFloatingPackageWithAllocationPrice.cadence
                        this.conversionRate = newFloatingPackageWithAllocationPrice.conversionRate
                        this.modelType = newFloatingPackageWithAllocationPrice.modelType
                        this.packageWithAllocationConfig =
                            newFloatingPackageWithAllocationPrice.packageWithAllocationConfig
                        this.currency = newFloatingPackageWithAllocationPrice.currency
                        additionalProperties(
                            newFloatingPackageWithAllocationPrice.additionalProperties
                        )
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun packageWithAllocationConfig(
                        packageWithAllocationConfig: PackageWithAllocationConfig
                    ) = packageWithAllocationConfig(JsonField.of(packageWithAllocationConfig))

                    @JsonProperty("package_with_allocation_config")
                    @ExcludeMissing
                    fun packageWithAllocationConfig(
                        packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>
                    ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingPackageWithAllocationPrice =
                        NewFloatingPackageWithAllocationPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            packageWithAllocationConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PACKAGE_WITH_ALLOCATION =
                            ModelType(JsonField.of("package_with_allocation"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        PACKAGE_WITH_ALLOCATION,
                    }

                    enum class Value {
                        PACKAGE_WITH_ALLOCATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PACKAGE_WITH_ALLOCATION -> Value.PACKAGE_WITH_ALLOCATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PACKAGE_WITH_ALLOCATION -> Known.PACKAGE_WITH_ALLOCATION
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = PackageWithAllocationConfig.Builder::class)
                @NoAutoDetect
                class PackageWithAllocationConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PackageWithAllocationConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PackageWithAllocationConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            packageWithAllocationConfig: PackageWithAllocationConfig
                        ) = apply {
                            additionalProperties(packageWithAllocationConfig.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PackageWithAllocationConfig =
                            PackageWithAllocationConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredPackageWithMinimumPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredPackageWithMinimumPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredPackageWithMinimumConfig:
                    JsonField<TieredPackageWithMinimumConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredPackageWithMinimumConfig(): TieredPackageWithMinimumConfig =
                    tieredPackageWithMinimumConfig.getRequired("tiered_package_with_minimum_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_package_with_minimum_config")
                @ExcludeMissing
                fun _tieredPackageWithMinimumConfig() = tieredPackageWithMinimumConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredPackageWithMinimumPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredPackageWithMinimumConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredPackageWithMinimumPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredPackageWithMinimumConfig ==
                            other.tieredPackageWithMinimumConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredPackageWithMinimumConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredPackageWithMinimumPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredPackageWithMinimumConfig=$tieredPackageWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredPackageWithMinimumConfig:
                        JsonField<TieredPackageWithMinimumConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingTieredPackageWithMinimumPrice:
                            NewFloatingTieredPackageWithMinimumPrice
                    ) = apply {
                        this.externalPriceId =
                            newFloatingTieredPackageWithMinimumPrice.externalPriceId
                        this.name = newFloatingTieredPackageWithMinimumPrice.name
                        this.billableMetricId =
                            newFloatingTieredPackageWithMinimumPrice.billableMetricId
                        this.itemId = newFloatingTieredPackageWithMinimumPrice.itemId
                        this.billedInAdvance =
                            newFloatingTieredPackageWithMinimumPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingTieredPackageWithMinimumPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingTieredPackageWithMinimumPrice.invoiceGroupingKey
                        this.cadence = newFloatingTieredPackageWithMinimumPrice.cadence
                        this.conversionRate =
                            newFloatingTieredPackageWithMinimumPrice.conversionRate
                        this.modelType = newFloatingTieredPackageWithMinimumPrice.modelType
                        this.tieredPackageWithMinimumConfig =
                            newFloatingTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig
                        this.currency = newFloatingTieredPackageWithMinimumPrice.currency
                        additionalProperties(
                            newFloatingTieredPackageWithMinimumPrice.additionalProperties
                        )
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredPackageWithMinimumConfig(
                        tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
                    ) = tieredPackageWithMinimumConfig(JsonField.of(tieredPackageWithMinimumConfig))

                    @JsonProperty("tiered_package_with_minimum_config")
                    @ExcludeMissing
                    fun tieredPackageWithMinimumConfig(
                        tieredPackageWithMinimumConfig: JsonField<TieredPackageWithMinimumConfig>
                    ) = apply {
                        this.tieredPackageWithMinimumConfig = tieredPackageWithMinimumConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredPackageWithMinimumPrice =
                        NewFloatingTieredPackageWithMinimumPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredPackageWithMinimumConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED_PACKAGE_WITH_MINIMUM =
                            ModelType(JsonField.of("tiered_package_with_minimum"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED_PACKAGE_WITH_MINIMUM,
                    }

                    enum class Value {
                        TIERED_PACKAGE_WITH_MINIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED_PACKAGE_WITH_MINIMUM -> Value.TIERED_PACKAGE_WITH_MINIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED_PACKAGE_WITH_MINIMUM -> Known.TIERED_PACKAGE_WITH_MINIMUM
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredPackageWithMinimumConfig.Builder::class)
                @NoAutoDetect
                class TieredPackageWithMinimumConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredPackageWithMinimumConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredPackageWithMinimumConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredPackageWithMinimumConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
                        ) = apply {
                            additionalProperties(
                                tieredPackageWithMinimumConfig.additionalProperties
                            )
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredPackageWithMinimumConfig =
                            TieredPackageWithMinimumConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingUnitWithPercentPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingUnitWithPercentPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val unitWithPercentConfig: JsonField<UnitWithPercentConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun unitWithPercentConfig(): UnitWithPercentConfig =
                    unitWithPercentConfig.getRequired("unit_with_percent_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("unit_with_percent_config")
                @ExcludeMissing
                fun _unitWithPercentConfig() = unitWithPercentConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingUnitWithPercentPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        unitWithPercentConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingUnitWithPercentPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.unitWithPercentConfig == other.unitWithPercentConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                unitWithPercentConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingUnitWithPercentPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, unitWithPercentConfig=$unitWithPercentConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var unitWithPercentConfig: JsonField<UnitWithPercentConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
                    ) = apply {
                        this.externalPriceId = newFloatingUnitWithPercentPrice.externalPriceId
                        this.name = newFloatingUnitWithPercentPrice.name
                        this.billableMetricId = newFloatingUnitWithPercentPrice.billableMetricId
                        this.itemId = newFloatingUnitWithPercentPrice.itemId
                        this.billedInAdvance = newFloatingUnitWithPercentPrice.billedInAdvance
                        this.fixedPriceQuantity = newFloatingUnitWithPercentPrice.fixedPriceQuantity
                        this.invoiceGroupingKey = newFloatingUnitWithPercentPrice.invoiceGroupingKey
                        this.cadence = newFloatingUnitWithPercentPrice.cadence
                        this.conversionRate = newFloatingUnitWithPercentPrice.conversionRate
                        this.modelType = newFloatingUnitWithPercentPrice.modelType
                        this.unitWithPercentConfig =
                            newFloatingUnitWithPercentPrice.unitWithPercentConfig
                        this.currency = newFloatingUnitWithPercentPrice.currency
                        additionalProperties(newFloatingUnitWithPercentPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) =
                        unitWithPercentConfig(JsonField.of(unitWithPercentConfig))

                    @JsonProperty("unit_with_percent_config")
                    @ExcludeMissing
                    fun unitWithPercentConfig(
                        unitWithPercentConfig: JsonField<UnitWithPercentConfig>
                    ) = apply { this.unitWithPercentConfig = unitWithPercentConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingUnitWithPercentPrice =
                        NewFloatingUnitWithPercentPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            unitWithPercentConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val UNIT_WITH_PERCENT = ModelType(JsonField.of("unit_with_percent"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        UNIT_WITH_PERCENT,
                    }

                    enum class Value {
                        UNIT_WITH_PERCENT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            UNIT_WITH_PERCENT -> Value.UNIT_WITH_PERCENT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            UNIT_WITH_PERCENT -> Known.UNIT_WITH_PERCENT
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = UnitWithPercentConfig.Builder::class)
                @NoAutoDetect
                class UnitWithPercentConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnitWithPercentConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnitWithPercentConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "UnitWithPercentConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                            additionalProperties(unitWithPercentConfig.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): UnitWithPercentConfig =
                            UnitWithPercentConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingTieredWithProrationPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingTieredWithProrationPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val tieredWithProrationConfig: JsonField<TieredWithProrationConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun tieredWithProrationConfig(): TieredWithProrationConfig =
                    tieredWithProrationConfig.getRequired("tiered_with_proration_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("tiered_with_proration_config")
                @ExcludeMissing
                fun _tieredWithProrationConfig() = tieredWithProrationConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingTieredWithProrationPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        tieredWithProrationConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingTieredWithProrationPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.tieredWithProrationConfig == other.tieredWithProrationConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                tieredWithProrationConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingTieredWithProrationPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, tieredWithProrationConfig=$tieredWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var tieredWithProrationConfig: JsonField<TieredWithProrationConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
                    ) = apply {
                        this.externalPriceId = newFloatingTieredWithProrationPrice.externalPriceId
                        this.name = newFloatingTieredWithProrationPrice.name
                        this.billableMetricId = newFloatingTieredWithProrationPrice.billableMetricId
                        this.itemId = newFloatingTieredWithProrationPrice.itemId
                        this.billedInAdvance = newFloatingTieredWithProrationPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingTieredWithProrationPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingTieredWithProrationPrice.invoiceGroupingKey
                        this.cadence = newFloatingTieredWithProrationPrice.cadence
                        this.conversionRate = newFloatingTieredWithProrationPrice.conversionRate
                        this.modelType = newFloatingTieredWithProrationPrice.modelType
                        this.tieredWithProrationConfig =
                            newFloatingTieredWithProrationPrice.tieredWithProrationConfig
                        this.currency = newFloatingTieredWithProrationPrice.currency
                        additionalProperties(
                            newFloatingTieredWithProrationPrice.additionalProperties
                        )
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun tieredWithProrationConfig(
                        tieredWithProrationConfig: TieredWithProrationConfig
                    ) = tieredWithProrationConfig(JsonField.of(tieredWithProrationConfig))

                    @JsonProperty("tiered_with_proration_config")
                    @ExcludeMissing
                    fun tieredWithProrationConfig(
                        tieredWithProrationConfig: JsonField<TieredWithProrationConfig>
                    ) = apply { this.tieredWithProrationConfig = tieredWithProrationConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingTieredWithProrationPrice =
                        NewFloatingTieredWithProrationPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            tieredWithProrationConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val TIERED_WITH_PRORATION = ModelType(JsonField.of("tiered_with_proration"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        TIERED_WITH_PRORATION,
                    }

                    enum class Value {
                        TIERED_WITH_PRORATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIERED_WITH_PRORATION -> Value.TIERED_WITH_PRORATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIERED_WITH_PRORATION -> Known.TIERED_WITH_PRORATION
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = TieredWithProrationConfig.Builder::class)
                @NoAutoDetect
                class TieredWithProrationConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TieredWithProrationConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TieredWithProrationConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TieredWithProrationConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tieredWithProrationConfig: TieredWithProrationConfig) =
                            apply {
                                additionalProperties(tieredWithProrationConfig.additionalProperties)
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): TieredWithProrationConfig =
                            TieredWithProrationConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }

            @JsonDeserialize(builder = NewFloatingUnitWithProrationPrice.Builder::class)
            @NoAutoDetect
            class NewFloatingUnitWithProrationPrice
            private constructor(
                private val externalPriceId: JsonField<String>,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val itemId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val cadence: JsonField<Cadence>,
                private val conversionRate: JsonField<Double>,
                private val modelType: JsonField<ModelType>,
                private val unitWithProrationConfig: JsonField<UnitWithProrationConfig>,
                private val currency: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** An alias for the price. */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /** The name of the price. */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /** The id of the item the plan will be associated with. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /** The cadence to bill for this price on. */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                fun modelType(): ModelType = modelType.getRequired("model_type")

                fun unitWithProrationConfig(): UnitWithProrationConfig =
                    unitWithProrationConfig.getRequired("unit_with_proration_config")

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(): String = currency.getRequired("currency")

                /** An alias for the price. */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId() = externalPriceId

                /** The name of the price. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId() = billableMetricId

                /** The id of the item the plan will be associated with. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance() = billedInAdvance

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity() = fixedPriceQuantity

                /** The property used to group this price on an invoice */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey() = invoiceGroupingKey

                /** The cadence to bill for this price on. */
                @JsonProperty("cadence") @ExcludeMissing fun _cadence() = cadence

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

                @JsonProperty("unit_with_proration_config")
                @ExcludeMissing
                fun _unitWithProrationConfig() = unitWithProrationConfig

                /** An ISO 4217 currency string for which this price is billed in. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NewFloatingUnitWithProrationPrice = apply {
                    if (!validated) {
                        externalPriceId()
                        name()
                        billableMetricId()
                        itemId()
                        billedInAdvance()
                        fixedPriceQuantity()
                        invoiceGroupingKey()
                        cadence()
                        conversionRate()
                        modelType()
                        unitWithProrationConfig().validate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewFloatingUnitWithProrationPrice &&
                        this.externalPriceId == other.externalPriceId &&
                        this.name == other.name &&
                        this.billableMetricId == other.billableMetricId &&
                        this.itemId == other.itemId &&
                        this.billedInAdvance == other.billedInAdvance &&
                        this.fixedPriceQuantity == other.fixedPriceQuantity &&
                        this.invoiceGroupingKey == other.invoiceGroupingKey &&
                        this.cadence == other.cadence &&
                        this.conversionRate == other.conversionRate &&
                        this.modelType == other.modelType &&
                        this.unitWithProrationConfig == other.unitWithProrationConfig &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                externalPriceId,
                                name,
                                billableMetricId,
                                itemId,
                                billedInAdvance,
                                fixedPriceQuantity,
                                invoiceGroupingKey,
                                cadence,
                                conversionRate,
                                modelType,
                                unitWithProrationConfig,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NewFloatingUnitWithProrationPrice{externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, conversionRate=$conversionRate, modelType=$modelType, unitWithProrationConfig=$unitWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var cadence: JsonField<Cadence> = JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var modelType: JsonField<ModelType> = JsonMissing.of()
                    private var unitWithProrationConfig: JsonField<UnitWithProrationConfig> =
                        JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
                    ) = apply {
                        this.externalPriceId = newFloatingUnitWithProrationPrice.externalPriceId
                        this.name = newFloatingUnitWithProrationPrice.name
                        this.billableMetricId = newFloatingUnitWithProrationPrice.billableMetricId
                        this.itemId = newFloatingUnitWithProrationPrice.itemId
                        this.billedInAdvance = newFloatingUnitWithProrationPrice.billedInAdvance
                        this.fixedPriceQuantity =
                            newFloatingUnitWithProrationPrice.fixedPriceQuantity
                        this.invoiceGroupingKey =
                            newFloatingUnitWithProrationPrice.invoiceGroupingKey
                        this.cadence = newFloatingUnitWithProrationPrice.cadence
                        this.conversionRate = newFloatingUnitWithProrationPrice.conversionRate
                        this.modelType = newFloatingUnitWithProrationPrice.modelType
                        this.unitWithProrationConfig =
                            newFloatingUnitWithProrationPrice.unitWithProrationConfig
                        this.currency = newFloatingUnitWithProrationPrice.currency
                        additionalProperties(newFloatingUnitWithProrationPrice.additionalProperties)
                    }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String) =
                        externalPriceId(JsonField.of(externalPriceId))

                    /** An alias for the price. */
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the price. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String) =
                        billableMetricId(JsonField.of(billableMetricId))

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /** The id of the item the plan will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The id of the item the plan will be associated with. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(JsonField.of(billedInAdvance))

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String) =
                        invoiceGroupingKey(JsonField.of(invoiceGroupingKey))

                    /** The property used to group this price on an invoice */
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /** The cadence to bill for this price on. */
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                    @JsonProperty("model_type")
                    @ExcludeMissing
                    fun modelType(modelType: JsonField<ModelType>) = apply {
                        this.modelType = modelType
                    }

                    fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) =
                        unitWithProrationConfig(JsonField.of(unitWithProrationConfig))

                    @JsonProperty("unit_with_proration_config")
                    @ExcludeMissing
                    fun unitWithProrationConfig(
                        unitWithProrationConfig: JsonField<UnitWithProrationConfig>
                    ) = apply { this.unitWithProrationConfig = unitWithProrationConfig }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** An ISO 4217 currency string for which this price is billed in. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NewFloatingUnitWithProrationPrice =
                        NewFloatingUnitWithProrationPrice(
                            externalPriceId,
                            name,
                            billableMetricId,
                            itemId,
                            billedInAdvance,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            cadence,
                            conversionRate,
                            modelType,
                            unitWithProrationConfig,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Cadence
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cadence && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val ANNUAL = Cadence(JsonField.of("annual"))

                        val MONTHLY = Cadence(JsonField.of("monthly"))

                        val QUARTERLY = Cadence(JsonField.of("quarterly"))

                        val ONE_TIME = Cadence(JsonField.of("one_time"))

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    enum class Known {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                    }

                    enum class Value {
                        ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class ModelType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ModelType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val UNIT_WITH_PRORATION = ModelType(JsonField.of("unit_with_proration"))

                        fun of(value: String) = ModelType(JsonField.of(value))
                    }

                    enum class Known {
                        UNIT_WITH_PRORATION,
                    }

                    enum class Value {
                        UNIT_WITH_PRORATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            UNIT_WITH_PRORATION -> Value.UNIT_WITH_PRORATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            UNIT_WITH_PRORATION -> Known.UNIT_WITH_PRORATION
                            else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                @JsonDeserialize(builder = UnitWithProrationConfig.Builder::class)
                @NoAutoDetect
                class UnitWithProrationConfig
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnitWithProrationConfig = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnitWithProrationConfig &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "UnitWithProrationConfig{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(unitWithProrationConfig: UnitWithProrationConfig) =
                            apply {
                                additionalProperties(unitWithProrationConfig.additionalProperties)
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): UnitWithProrationConfig =
                            UnitWithProrationConfig(additionalProperties.toUnmodifiable())
                    }
                }
            }
        }
    }

    @JsonDeserialize(builder = Edit.Builder::class)
    @NoAutoDetect
    class Edit
    private constructor(
        private val priceIntervalId: String?,
        private val startDate: StartDate?,
        private val endDate: EndDate?,
        private val fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?,
        private val billingCycleDay: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The id of the price interval to edit. */
        @JsonProperty("price_interval_id") fun priceIntervalId(): String? = priceIntervalId

        /**
         * The updated start date of this price interval. If not specified, the start date will not
         * be updated.
         */
        @JsonProperty("start_date") fun startDate(): StartDate? = startDate

        /**
         * The updated end date of this price interval. If not specified, the start date will not be
         * updated.
         */
        @JsonProperty("end_date") fun endDate(): EndDate? = endDate

        /**
         * A list of fixed fee quantity transitions to use for this price interval. Note that this
         * list will overwrite all existing fixed fee quantity transitions on the price interval.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions

        /**
         * The updated billing cycle day for this price interval. If not specified, the billing
         * cycle day will not be updated. Note that overlapping price intervals must have the same
         * billing cycle day.
         */
        @JsonProperty("billing_cycle_day") fun billingCycleDay(): Long? = billingCycleDay

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Edit &&
                this.priceIntervalId == other.priceIntervalId &&
                this.startDate == other.startDate &&
                this.endDate == other.endDate &&
                this.fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions &&
                this.billingCycleDay == other.billingCycleDay &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        priceIntervalId,
                        startDate,
                        endDate,
                        fixedFeeQuantityTransitions,
                        billingCycleDay,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Edit{priceIntervalId=$priceIntervalId, startDate=$startDate, endDate=$endDate, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, billingCycleDay=$billingCycleDay, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceIntervalId: String? = null
            private var startDate: StartDate? = null
            private var endDate: EndDate? = null
            private var fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>? = null
            private var billingCycleDay: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(edit: Edit) = apply {
                this.priceIntervalId = edit.priceIntervalId
                this.startDate = edit.startDate
                this.endDate = edit.endDate
                this.fixedFeeQuantityTransitions = edit.fixedFeeQuantityTransitions
                this.billingCycleDay = edit.billingCycleDay
                additionalProperties(edit.additionalProperties)
            }

            /** The id of the price interval to edit. */
            @JsonProperty("price_interval_id")
            fun priceIntervalId(priceIntervalId: String) = apply {
                this.priceIntervalId = priceIntervalId
            }

            /**
             * The updated start date of this price interval. If not specified, the start date will
             * not be updated.
             */
            @JsonProperty("start_date")
            fun startDate(startDate: StartDate) = apply { this.startDate = startDate }

            /**
             * The updated end date of this price interval. If not specified, the start date will
             * not be updated.
             */
            @JsonProperty("end_date")
            fun endDate(endDate: EndDate) = apply { this.endDate = endDate }

            /**
             * A list of fixed fee quantity transitions to use for this price interval. Note that
             * this list will overwrite all existing fixed fee quantity transitions on the price
             * interval.
             */
            @JsonProperty("fixed_fee_quantity_transitions")
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>
            ) = apply { this.fixedFeeQuantityTransitions = fixedFeeQuantityTransitions }

            /**
             * The updated billing cycle day for this price interval. If not specified, the billing
             * cycle day will not be updated. Note that overlapping price intervals must have the
             * same billing cycle day.
             */
            @JsonProperty("billing_cycle_day")
            fun billingCycleDay(billingCycleDay: Long) = apply {
                this.billingCycleDay = billingCycleDay
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

            fun build(): Edit =
                Edit(
                    checkNotNull(priceIntervalId) {
                        "`priceIntervalId` is required but was not set"
                    },
                    startDate,
                    endDate,
                    fixedFeeQuantityTransitions?.toUnmodifiable(),
                    billingCycleDay,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val billingCycleRelativeDate: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun offsetDateTime(): OffsetDateTime? = offsetDateTime

            fun billingCycleRelativeDate(): BillingCycleRelativeDate? = billingCycleRelativeDate

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isBillingCycleRelativeDate(): Boolean = billingCycleRelativeDate != null

            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            fun asBillingCycleRelativeDate(): BillingCycleRelativeDate =
                billingCycleRelativeDate.getOrThrow("billingCycleRelativeDate")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    billingCycleRelativeDate != null ->
                        visitor.visitBillingCycleRelativeDate(billingCycleRelativeDate)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): EndDate = apply {
                if (!validated) {
                    if (offsetDateTime == null && billingCycleRelativeDate == null) {
                        throw OrbInvalidDataException("Unknown EndDate: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    this.offsetDateTime == other.offsetDateTime &&
                    this.billingCycleRelativeDate == other.billingCycleRelativeDate
            }

            override fun hashCode(): Int {
                return Objects.hash(offsetDateTime, billingCycleRelativeDate)
            }

            override fun toString(): String {
                return when {
                    offsetDateTime != null -> "EndDate{offsetDateTime=$offsetDateTime}"
                    billingCycleRelativeDate != null ->
                        "EndDate{billingCycleRelativeDate=$billingCycleRelativeDate}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }
            }

            companion object {

                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    EndDate(offsetDateTime = offsetDateTime)

                fun ofBillingCycleRelativeDate(billingCycleRelativeDate: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelativeDate = billingCycleRelativeDate)
            }

            interface Visitor<out T> {

                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                fun visitBillingCycleRelativeDate(
                    billingCycleRelativeDate: BillingCycleRelativeDate
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(offsetDateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelativeDate = it, _json = json)
                    }

                    return EndDate(_json = json)
                }
            }

            class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                        value.billingCycleRelativeDate != null ->
                            generator.writeObject(value.billingCycleRelativeDate)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        @JsonDeserialize(builder = FixedFeeQuantityTransition.Builder::class)
        @NoAutoDetect
        class FixedFeeQuantityTransition
        private constructor(
            private val quantity: Long?,
            private val effectiveDate: OffsetDateTime?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The quantity of the fixed fee quantity transition. */
            @JsonProperty("quantity") fun quantity(): Long? = quantity

            /** The date that the fixed fee quantity transition should take effect. */
            @JsonProperty("effective_date") fun effectiveDate(): OffsetDateTime? = effectiveDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FixedFeeQuantityTransition &&
                    this.quantity == other.quantity &&
                    this.effectiveDate == other.effectiveDate &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            quantity,
                            effectiveDate,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FixedFeeQuantityTransition{quantity=$quantity, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var quantity: Long? = null
                private var effectiveDate: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    this.quantity = fixedFeeQuantityTransition.quantity
                    this.effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    additionalProperties(fixedFeeQuantityTransition.additionalProperties)
                }

                /** The quantity of the fixed fee quantity transition. */
                @JsonProperty("quantity")
                fun quantity(quantity: Long) = apply { this.quantity = quantity }

                /** The date that the fixed fee quantity transition should take effect. */
                @JsonProperty("effective_date")
                fun effectiveDate(effectiveDate: OffsetDateTime) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkNotNull(quantity) { "`quantity` is required but was not set" },
                        checkNotNull(effectiveDate) {
                            "`effectiveDate` is required but was not set"
                        },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val billingCycleRelativeDate: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun offsetDateTime(): OffsetDateTime? = offsetDateTime

            fun billingCycleRelativeDate(): BillingCycleRelativeDate? = billingCycleRelativeDate

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isBillingCycleRelativeDate(): Boolean = billingCycleRelativeDate != null

            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            fun asBillingCycleRelativeDate(): BillingCycleRelativeDate =
                billingCycleRelativeDate.getOrThrow("billingCycleRelativeDate")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    billingCycleRelativeDate != null ->
                        visitor.visitBillingCycleRelativeDate(billingCycleRelativeDate)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): StartDate = apply {
                if (!validated) {
                    if (offsetDateTime == null && billingCycleRelativeDate == null) {
                        throw OrbInvalidDataException("Unknown StartDate: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    this.offsetDateTime == other.offsetDateTime &&
                    this.billingCycleRelativeDate == other.billingCycleRelativeDate
            }

            override fun hashCode(): Int {
                return Objects.hash(offsetDateTime, billingCycleRelativeDate)
            }

            override fun toString(): String {
                return when {
                    offsetDateTime != null -> "StartDate{offsetDateTime=$offsetDateTime}"
                    billingCycleRelativeDate != null ->
                        "StartDate{billingCycleRelativeDate=$billingCycleRelativeDate}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }
            }

            companion object {

                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    StartDate(offsetDateTime = offsetDateTime)

                fun ofBillingCycleRelativeDate(billingCycleRelativeDate: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelativeDate = billingCycleRelativeDate)
            }

            interface Visitor<out T> {

                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                fun visitBillingCycleRelativeDate(
                    billingCycleRelativeDate: BillingCycleRelativeDate
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(offsetDateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelativeDate = it, _json = json)
                    }

                    return StartDate(_json = json)
                }
            }

            class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                        value.billingCycleRelativeDate != null ->
                            generator.writeObject(value.billingCycleRelativeDate)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }
    }
}
