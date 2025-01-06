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
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

class CouponCreateParams
constructor(
    private val body: CouponCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun discount(): Discount = body.discount()

    /** This string can be used to redeem this coupon for a given subscription. */
    fun redemptionCode(): String = body.redemptionCode()

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a
     * `null` value here means "unlimited time".
     */
    fun durationInMonths(): Long? = body.durationInMonths()

    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted;`null` here
     * means "unlimited".
     */
    fun maxRedemptions(): Long? = body.maxRedemptions()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): CouponCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CouponCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("discount") private val discount: Discount,
        @JsonProperty("redemption_code") private val redemptionCode: String,
        @JsonProperty("duration_in_months") private val durationInMonths: Long?,
        @JsonProperty("max_redemptions") private val maxRedemptions: Long?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("discount") fun discount(): Discount = discount

        /** This string can be used to redeem this coupon for a given subscription. */
        @JsonProperty("redemption_code") fun redemptionCode(): String = redemptionCode

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
                discount = couponCreateBody.discount
                redemptionCode = couponCreateBody.redemptionCode
                durationInMonths = couponCreateBody.durationInMonths
                maxRedemptions = couponCreateBody.maxRedemptions
                additionalProperties = couponCreateBody.additionalProperties.toMutableMap()
            }

            fun discount(discount: Discount) = apply { this.discount = discount }

            fun discount(newCouponPercentageDiscount: Discount.NewCouponPercentageDiscount) =
                apply {
                    this.discount =
                        Discount.ofNewCouponPercentageDiscount(newCouponPercentageDiscount)
                }

            fun discount(newCouponAmountDiscount: Discount.NewCouponAmountDiscount) = apply {
                this.discount = Discount.ofNewCouponAmountDiscount(newCouponAmountDiscount)
            }

            /** This string can be used to redeem this coupon for a given subscription. */
            fun redemptionCode(redemptionCode: String) = apply {
                this.redemptionCode = redemptionCode
            }

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: Long?) = apply {
                this.durationInMonths = durationInMonths
            }

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: Long) =
                durationInMonths(durationInMonths as Long?)

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: Long?) = apply {
                this.maxRedemptions = maxRedemptions
            }

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

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

            fun build(): CouponCreateBody =
                CouponCreateBody(
                    checkNotNull(discount) { "`discount` is required but was not set" },
                    checkNotNull(redemptionCode) { "`redemptionCode` is required but was not set" },
                    durationInMonths,
                    maxRedemptions,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CouponCreateBody && discount == other.discount && redemptionCode == other.redemptionCode && durationInMonths == other.durationInMonths && maxRedemptions == other.maxRedemptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discount, redemptionCode, durationInMonths, maxRedemptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CouponCreateBody{discount=$discount, redemptionCode=$redemptionCode, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CouponCreateBody.Builder = CouponCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(couponCreateParams: CouponCreateParams) = apply {
            body = couponCreateParams.body.toBuilder()
            additionalHeaders = couponCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = couponCreateParams.additionalQueryParams.toBuilder()
        }

        fun discount(discount: Discount) = apply { body.discount(discount) }

        fun discount(newCouponPercentageDiscount: Discount.NewCouponPercentageDiscount) = apply {
            body.discount(newCouponPercentageDiscount)
        }

        fun discount(newCouponAmountDiscount: Discount.NewCouponAmountDiscount) = apply {
            body.discount(newCouponAmountDiscount)
        }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) = apply { body.redemptionCode(redemptionCode) }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long?) = apply {
            body.durationInMonths(durationInMonths)
        }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long?) = apply { body.maxRedemptions(maxRedemptions) }

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

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

        fun build(): CouponCreateParams =
            CouponCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && newCouponPercentageDiscount == other.newCouponPercentageDiscount && newCouponAmountDiscount == other.newCouponAmountDiscount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newCouponPercentageDiscount, newCouponAmountDiscount) /* spotless:on */

        override fun toString(): String =
            when {
                newCouponPercentageDiscount != null ->
                    "Discount{newCouponPercentageDiscount=$newCouponPercentageDiscount}"
                newCouponAmountDiscount != null ->
                    "Discount{newCouponAmountDiscount=$newCouponAmountDiscount}"
                _json != null -> "Discount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Discount")
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
                val discountType = json.asObject()?.get("discount_type")?.asString()

                when (discountType) {
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<NewCouponPercentageDiscount>())?.let {
                            return Discount(newCouponPercentageDiscount = it, _json = json)
                        }
                    }
                    "amount" -> {
                        tryDeserialize(node, jacksonTypeRef<NewCouponAmountDiscount>())?.let {
                            return Discount(newCouponAmountDiscount = it, _json = json)
                        }
                    }
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

        @NoAutoDetect
        class NewCouponPercentageDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("discount_type") private val discountType: DiscountType,
            @JsonProperty("percentage_discount") private val percentageDiscount: Double,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("discount_type") fun discountType(): DiscountType = discountType

            @JsonProperty("percentage_discount")
            fun percentageDiscount(): Double = percentageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: DiscountType? = null
                private var percentageDiscount: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponPercentageDiscount: NewCouponPercentageDiscount) =
                    apply {
                        discountType = newCouponPercentageDiscount.discountType
                        percentageDiscount = newCouponPercentageDiscount.percentageDiscount
                        additionalProperties =
                            newCouponPercentageDiscount.additionalProperties.toMutableMap()
                    }

                fun discountType(discountType: DiscountType) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) = apply {
                    this.percentageDiscount = percentageDiscount
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

                fun build(): NewCouponPercentageDiscount =
                    NewCouponPercentageDiscount(
                        checkNotNull(discountType) { "`discountType` is required but was not set" },
                        checkNotNull(percentageDiscount) {
                            "`percentageDiscount` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERCENTAGE = of("percentage")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewCouponPercentageDiscount && discountType == other.discountType && percentageDiscount == other.percentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewCouponPercentageDiscount{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewCouponAmountDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("amount_discount") private val amountDiscount: String,
            @JsonProperty("discount_type") private val discountType: DiscountType,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("amount_discount") fun amountDiscount(): String = amountDiscount

            @JsonProperty("discount_type") fun discountType(): DiscountType = discountType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amountDiscount: String? = null
                private var discountType: DiscountType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponAmountDiscount: NewCouponAmountDiscount) = apply {
                    amountDiscount = newCouponAmountDiscount.amountDiscount
                    discountType = newCouponAmountDiscount.discountType
                    additionalProperties =
                        newCouponAmountDiscount.additionalProperties.toMutableMap()
                }

                fun amountDiscount(amountDiscount: String) = apply {
                    this.amountDiscount = amountDiscount
                }

                fun discountType(discountType: DiscountType) = apply {
                    this.discountType = discountType
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

                fun build(): NewCouponAmountDiscount =
                    NewCouponAmountDiscount(
                        checkNotNull(amountDiscount) {
                            "`amountDiscount` is required but was not set"
                        },
                        checkNotNull(discountType) { "`discountType` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AMOUNT = of("amount")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewCouponAmountDiscount && amountDiscount == other.amountDiscount && discountType == other.discountType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountDiscount, discountType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewCouponAmountDiscount{amountDiscount=$amountDiscount, discountType=$discountType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CouponCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
