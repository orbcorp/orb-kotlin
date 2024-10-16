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
import java.util.Objects

class CouponCreateParams
constructor(
    private val discount: Discount,
    private val redemptionCode: String,
    private val durationInMonths: Long?,
    private val maxRedemptions: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun discount(): Discount = discount

    fun redemptionCode(): String = redemptionCode

    fun durationInMonths(): Long? = durationInMonths

    fun maxRedemptions(): Long? = maxRedemptions

    internal fun getBody(): CouponCreateBody {
        return CouponCreateBody(
            discount,
            redemptionCode,
            durationInMonths,
            maxRedemptions,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CouponCreateBody.Builder::class)
    @NoAutoDetect
    class CouponCreateBody
    internal constructor(
        private val discount: Discount?,
        private val redemptionCode: String?,
        private val durationInMonths: Long?,
        private val maxRedemptions: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("discount") fun discount(): Discount? = discount

        /** This string can be used to redeem this coupon for a given subscription. */
        @JsonProperty("redemption_code") fun redemptionCode(): String? = redemptionCode

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        @JsonProperty("duration_in_months") fun durationInMonths(): Long? = durationInMonths

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         */
        @JsonProperty("max_redemptions") fun maxRedemptions(): Long? = maxRedemptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var discount: Discount? = null
            private var redemptionCode: String? = null
            private var durationInMonths: Long? = null
            private var maxRedemptions: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(couponCreateBody: CouponCreateBody) = apply {
                this.discount = couponCreateBody.discount
                this.redemptionCode = couponCreateBody.redemptionCode
                this.durationInMonths = couponCreateBody.durationInMonths
                this.maxRedemptions = couponCreateBody.maxRedemptions
                additionalProperties(couponCreateBody.additionalProperties)
            }

            @JsonProperty("discount")
            fun discount(discount: Discount) = apply { this.discount = discount }

            /** This string can be used to redeem this coupon for a given subscription. */
            @JsonProperty("redemption_code")
            fun redemptionCode(redemptionCode: String) = apply {
                this.redemptionCode = redemptionCode
            }

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            @JsonProperty("duration_in_months")
            fun durationInMonths(durationInMonths: Long) = apply {
                this.durationInMonths = durationInMonths
            }

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            @JsonProperty("max_redemptions")
            fun maxRedemptions(maxRedemptions: Long) = apply {
                this.maxRedemptions = maxRedemptions
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

            fun build(): CouponCreateBody =
                CouponCreateBody(
                    checkNotNull(discount) { "`discount` is required but was not set" },
                    checkNotNull(redemptionCode) { "`redemptionCode` is required but was not set" },
                    durationInMonths,
                    maxRedemptions,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CouponCreateBody && this.discount == other.discount && this.redemptionCode == other.redemptionCode && this.durationInMonths == other.durationInMonths && this.maxRedemptions == other.maxRedemptions && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(discount, redemptionCode, durationInMonths, maxRedemptions, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CouponCreateBody{discount=$discount, redemptionCode=$redemptionCode, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponCreateParams && this.discount == other.discount && this.redemptionCode == other.redemptionCode && this.durationInMonths == other.durationInMonths && this.maxRedemptions == other.maxRedemptions && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(discount, redemptionCode, durationInMonths, maxRedemptions, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CouponCreateParams{discount=$discount, redemptionCode=$redemptionCode, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var discount: Discount? = null
        private var redemptionCode: String? = null
        private var durationInMonths: Long? = null
        private var maxRedemptions: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(couponCreateParams: CouponCreateParams) = apply {
            this.discount = couponCreateParams.discount
            this.redemptionCode = couponCreateParams.redemptionCode
            this.durationInMonths = couponCreateParams.durationInMonths
            this.maxRedemptions = couponCreateParams.maxRedemptions
            additionalQueryParams(couponCreateParams.additionalQueryParams)
            additionalHeaders(couponCreateParams.additionalHeaders)
            additionalBodyProperties(couponCreateParams.additionalBodyProperties)
        }

        fun discount(discount: Discount) = apply { this.discount = discount }

        fun discount(newCouponPercentageDiscount: Discount.NewCouponPercentageDiscount) = apply {
            this.discount = Discount.ofNewCouponPercentageDiscount(newCouponPercentageDiscount)
        }

        fun discount(newCouponAmountDiscount: Discount.NewCouponAmountDiscount) = apply {
            this.discount = Discount.ofNewCouponAmountDiscount(newCouponAmountDiscount)
        }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) = apply { this.redemptionCode = redemptionCode }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long) = apply {
            this.durationInMonths = durationInMonths
        }

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long) = apply { this.maxRedemptions = maxRedemptions }

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

        fun build(): CouponCreateParams =
            CouponCreateParams(
                checkNotNull(discount) { "`discount` is required but was not set" },
                checkNotNull(redemptionCode) { "`redemptionCode` is required but was not set" },
                durationInMonths,
                maxRedemptions,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Discount.Deserializer::class)
    @JsonSerialize(using = Discount.Serializer::class)
    class Discount
    private constructor(
        private val newCouponPercentageDiscount: NewCouponPercentageDiscount? = null,
        private val newCouponAmountDiscount: NewCouponAmountDiscount? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun newCouponPercentageDiscount(): NewCouponPercentageDiscount? =
            newCouponPercentageDiscount

        fun newCouponAmountDiscount(): NewCouponAmountDiscount? = newCouponAmountDiscount

        fun isNewCouponPercentageDiscount(): Boolean = newCouponPercentageDiscount != null

        fun isNewCouponAmountDiscount(): Boolean = newCouponAmountDiscount != null

        fun asNewCouponPercentageDiscount(): NewCouponPercentageDiscount =
            newCouponPercentageDiscount.getOrThrow("newCouponPercentageDiscount")

        fun asNewCouponAmountDiscount(): NewCouponAmountDiscount =
            newCouponAmountDiscount.getOrThrow("newCouponAmountDiscount")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                newCouponPercentageDiscount != null ->
                    visitor.visitNewCouponPercentageDiscount(newCouponPercentageDiscount)
                newCouponAmountDiscount != null ->
                    visitor.visitNewCouponAmountDiscount(newCouponAmountDiscount)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Discount = apply {
            if (!validated) {
                if (newCouponPercentageDiscount == null && newCouponAmountDiscount == null) {
                    throw OrbInvalidDataException("Unknown Discount: $_json")
                }
                newCouponPercentageDiscount?.validate()
                newCouponAmountDiscount?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && this.newCouponPercentageDiscount == other.newCouponPercentageDiscount && this.newCouponAmountDiscount == other.newCouponAmountDiscount /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(newCouponPercentageDiscount, newCouponAmountDiscount) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                newCouponPercentageDiscount != null ->
                    "Discount{newCouponPercentageDiscount=$newCouponPercentageDiscount}"
                newCouponAmountDiscount != null ->
                    "Discount{newCouponAmountDiscount=$newCouponAmountDiscount}"
                _json != null -> "Discount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Discount")
            }
        }

        companion object {

            fun ofNewCouponPercentageDiscount(
                newCouponPercentageDiscount: NewCouponPercentageDiscount
            ) = Discount(newCouponPercentageDiscount = newCouponPercentageDiscount)

            fun ofNewCouponAmountDiscount(newCouponAmountDiscount: NewCouponAmountDiscount) =
                Discount(newCouponAmountDiscount = newCouponAmountDiscount)
        }

        interface Visitor<out T> {

            fun visitNewCouponPercentageDiscount(
                newCouponPercentageDiscount: NewCouponPercentageDiscount
            ): T

            fun visitNewCouponAmountDiscount(newCouponAmountDiscount: NewCouponAmountDiscount): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Discount: $json")
            }
        }

        class Deserializer : BaseDeserializer<Discount>(Discount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Discount {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<NewCouponPercentageDiscount>()) {
                        it.validate()
                    }
                    ?.let {
                        return Discount(newCouponPercentageDiscount = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<NewCouponAmountDiscount>()) { it.validate() }
                    ?.let {
                        return Discount(newCouponAmountDiscount = it, _json = json)
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
                    value.newCouponPercentageDiscount != null ->
                        generator.writeObject(value.newCouponPercentageDiscount)
                    value.newCouponAmountDiscount != null ->
                        generator.writeObject(value.newCouponAmountDiscount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Discount")
                }
            }
        }

        @JsonDeserialize(builder = NewCouponPercentageDiscount.Builder::class)
        @NoAutoDetect
        class NewCouponPercentageDiscount
        private constructor(
            private val discountType: JsonField<DiscountType>,
            private val percentageDiscount: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount() = percentageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NewCouponPercentageDiscount = apply {
                if (!validated) {
                    discountType()
                    percentageDiscount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponPercentageDiscount: NewCouponPercentageDiscount) =
                    apply {
                        this.discountType = newCouponPercentageDiscount.discountType
                        this.percentageDiscount = newCouponPercentageDiscount.percentageDiscount
                        additionalProperties(newCouponPercentageDiscount.additionalProperties)
                    }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

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

                fun build(): NewCouponPercentageDiscount =
                    NewCouponPercentageDiscount(
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewCouponPercentageDiscount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "NewCouponPercentageDiscount{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = NewCouponAmountDiscount.Builder::class)
        @NoAutoDetect
        class NewCouponAmountDiscount
        private constructor(
            private val discountType: JsonField<DiscountType>,
            private val amountDiscount: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NewCouponAmountDiscount = apply {
                if (!validated) {
                    discountType()
                    amountDiscount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponAmountDiscount: NewCouponAmountDiscount) = apply {
                    this.discountType = newCouponAmountDiscount.discountType
                    this.amountDiscount = newCouponAmountDiscount.amountDiscount
                    additionalProperties(newCouponAmountDiscount.additionalProperties)
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
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

                fun build(): NewCouponAmountDiscount =
                    NewCouponAmountDiscount(
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewCouponAmountDiscount && this.discountType == other.discountType && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(discountType, amountDiscount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "NewCouponAmountDiscount{discountType=$discountType, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
        }
    }
}
