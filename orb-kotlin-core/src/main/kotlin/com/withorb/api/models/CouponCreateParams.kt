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
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * This endpoint allows the creation of coupons, which can then be redeemed at
 * subscription creation or plan change.
 */
class CouponCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun discount(): Discount = body.discount()

    /** This string can be used to redeem this coupon for a given subscription. */
    fun redemptionCode(): String = body.redemptionCode()

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in
     * months); a `null` value here means "unlimited time".
     */
    fun durationInMonths(): Long? = body.durationInMonths()

    /**
     * The maximum number of redemptions allowed for this coupon before it is
     * exhausted;`null` here means "unlimited".
     */
    fun maxRedemptions(): Long? = body.maxRedemptions()

    fun _discount(): JsonField<Discount> = body._discount()

    /** This string can be used to redeem this coupon for a given subscription. */
    fun _redemptionCode(): JsonField<String> = body._redemptionCode()

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in
     * months); a `null` value here means "unlimited time".
     */
    fun _durationInMonths(): JsonField<Long> = body._durationInMonths()

    /**
     * The maximum number of redemptions allowed for this coupon before it is
     * exhausted;`null` here means "unlimited".
     */
    fun _maxRedemptions(): JsonField<Long> = body._maxRedemptions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("discount") @ExcludeMissing private val discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("redemption_code") @ExcludeMissing private val redemptionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration_in_months") @ExcludeMissing private val durationInMonths: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_redemptions") @ExcludeMissing private val maxRedemptions: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun discount(): Discount = discount.getRequired("discount")

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(): String = redemptionCode.getRequired("redemption_code")

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        fun durationInMonths(): Long? = durationInMonths.getNullable("duration_in_months")

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted;`null` here means "unlimited".
         */
        fun maxRedemptions(): Long? = maxRedemptions.getNullable("max_redemptions")

        @JsonProperty("discount")
        @ExcludeMissing
        fun _discount(): JsonField<Discount> = discount

        /** This string can be used to redeem this coupon for a given subscription. */
        @JsonProperty("redemption_code")
        @ExcludeMissing
        fun _redemptionCode(): JsonField<String> = redemptionCode

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        @JsonProperty("duration_in_months")
        @ExcludeMissing
        fun _durationInMonths(): JsonField<Long> = durationInMonths

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted;`null` here means "unlimited".
         */
        @JsonProperty("max_redemptions")
        @ExcludeMissing
        fun _maxRedemptions(): JsonField<Long> = maxRedemptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                discount().validate()
                redemptionCode()
                durationInMonths()
                maxRedemptions()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .discount()
             * .redemptionCode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var discount: JsonField<Discount>? = null
            private var redemptionCode: JsonField<String>? = null
            private var durationInMonths: JsonField<Long> = JsonMissing.of()
            private var maxRedemptions: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) =
                apply {
                    discount = body.discount
                    redemptionCode = body.redemptionCode
                    durationInMonths = body.durationInMonths
                    maxRedemptions = body.maxRedemptions
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            fun discount(discount: JsonField<Discount>) =
                apply {
                    this.discount = discount
                }

            fun discount(newCouponPercentage: Discount.NewCouponPercentageDiscount) = discount(Discount.ofNewCouponPercentage(newCouponPercentage))

            fun newCouponPercentageDiscount(percentageDiscount: Double) =
                discount(Discount.NewCouponPercentageDiscount.builder()
                    .discountType(CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(percentageDiscount)
                    .build())

            fun discount(newCouponAmount: Discount.NewCouponAmountDiscount) = discount(Discount.ofNewCouponAmount(newCouponAmount))

            fun newCouponAmountDiscount(amountDiscount: String) =
                discount(Discount.NewCouponAmountDiscount.builder()
                    .discountType(CouponCreateParams.Discount.NewCouponAmountDiscount.DiscountType.AMOUNT)
                    .amountDiscount(amountDiscount)
                    .build())

            /** This string can be used to redeem this coupon for a given subscription. */
            fun redemptionCode(redemptionCode: String) = redemptionCode(JsonField.of(redemptionCode))

            /** This string can be used to redeem this coupon for a given subscription. */
            fun redemptionCode(redemptionCode: JsonField<String>) =
                apply {
                    this.redemptionCode = redemptionCode
                }

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: Long?) = durationInMonths(JsonField.ofNullable(durationInMonths))

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: JsonField<Long>) =
                apply {
                    this.durationInMonths = durationInMonths
                }

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: Long?) = maxRedemptions(JsonField.ofNullable(maxRedemptions))

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: JsonField<Long>) =
                apply {
                    this.maxRedemptions = maxRedemptions
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "discount", discount
                  ),
                  checkRequired(
                    "redemptionCode", redemptionCode
                  ),
                  durationInMonths,
                  maxRedemptions,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && discount == other.discount && redemptionCode == other.redemptionCode && durationInMonths == other.durationInMonths && maxRedemptions == other.maxRedemptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discount, redemptionCode, durationInMonths, maxRedemptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{discount=$discount, redemptionCode=$redemptionCode, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponCreateParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .discount()
         * .redemptionCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CouponCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(couponCreateParams: CouponCreateParams) =
            apply {
                body = couponCreateParams.body.toBuilder()
                additionalHeaders = couponCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = couponCreateParams.additionalQueryParams.toBuilder()
            }

        fun discount(discount: Discount) =
            apply {
                body.discount(discount)
            }

        fun discount(discount: JsonField<Discount>) =
            apply {
                body.discount(discount)
            }

        fun discount(newCouponPercentage: Discount.NewCouponPercentageDiscount) =
            apply {
                body.discount(newCouponPercentage)
            }

        fun newCouponPercentageDiscount(percentageDiscount: Double) =
            apply {
                body.newCouponPercentageDiscount(percentageDiscount)
            }

        fun discount(newCouponAmount: Discount.NewCouponAmountDiscount) =
            apply {
                body.discount(newCouponAmount)
            }

        fun newCouponAmountDiscount(amountDiscount: String) =
            apply {
                body.newCouponAmountDiscount(amountDiscount)
            }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) =
            apply {
                body.redemptionCode(redemptionCode)
            }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: JsonField<String>) =
            apply {
                body.redemptionCode(redemptionCode)
            }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long?) =
            apply {
                body.durationInMonths(durationInMonths)
            }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: JsonField<Long>) =
            apply {
                body.durationInMonths(durationInMonths)
            }

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted;`null` here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long?) =
            apply {
                body.maxRedemptions(maxRedemptions)
            }

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted;`null` here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted;`null` here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: JsonField<Long>) =
            apply {
                body.maxRedemptions(maxRedemptions)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
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
    class Discount private constructor(
        private val newCouponPercentage: NewCouponPercentageDiscount? = null,
        private val newCouponAmount: NewCouponAmountDiscount? = null,
        private val _json: JsonValue? = null,

    ) {

        fun newCouponPercentage(): NewCouponPercentageDiscount? = newCouponPercentage

        fun newCouponAmount(): NewCouponAmountDiscount? = newCouponAmount

        fun isNewCouponPercentage(): Boolean = newCouponPercentage != null

        fun isNewCouponAmount(): Boolean = newCouponAmount != null

        fun asNewCouponPercentage(): NewCouponPercentageDiscount = newCouponPercentage.getOrThrow("newCouponPercentage")

        fun asNewCouponAmount(): NewCouponAmountDiscount = newCouponAmount.getOrThrow("newCouponAmount")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              newCouponPercentage != null -> visitor.visitNewCouponPercentage(newCouponPercentage)
              newCouponAmount != null -> visitor.visitNewCouponAmount(newCouponAmount)
              else -> visitor.unknown(_json)
          }
        }

        private var validated: Boolean = false

        fun validate(): Discount =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitNewCouponPercentage(newCouponPercentage: NewCouponPercentageDiscount) {
                      newCouponPercentage.validate()
                    }

                    override fun visitNewCouponAmount(newCouponAmount: NewCouponAmountDiscount) {
                      newCouponAmount.validate()
                    }
                })
                validated = true
            }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Discount && newCouponPercentage == other.newCouponPercentage && newCouponAmount == other.newCouponAmount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newCouponPercentage, newCouponAmount) /* spotless:on */

        override fun toString(): String =
            when {
                newCouponPercentage != null -> "Discount{newCouponPercentage=$newCouponPercentage}"
                newCouponAmount != null -> "Discount{newCouponAmount=$newCouponAmount}"
                _json != null -> "Discount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Discount")
            }

        companion object {

            fun ofNewCouponPercentage(newCouponPercentage: NewCouponPercentageDiscount) = Discount(newCouponPercentage = newCouponPercentage)

            fun ofNewCouponAmount(newCouponAmount: NewCouponAmountDiscount) = Discount(newCouponAmount = newCouponAmount)
        }

        /**
         * An interface that defines how to map each variant of [Discount] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNewCouponPercentage(newCouponPercentage: NewCouponPercentageDiscount): T

            fun visitNewCouponAmount(newCouponAmount: NewCouponAmountDiscount): T

            /**
             * Maps an unknown variant of [Discount] to a value of type [T].
             *
             * An instance of [Discount] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the
             * SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw OrbInvalidDataException("Unknown Discount: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Discount>(Discount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Discount {
              val json = JsonValue.fromJsonNode(node)
              val discountType = json.asObject()?.get("discount_type")?.asString()

              when (discountType) {
                  "percentage" -> {
                      tryDeserialize(node, jacksonTypeRef<NewCouponPercentageDiscount>()){ it.validate() }?.let {
                          return Discount(newCouponPercentage = it, _json = json)
                      }
                  }
                  "amount" -> {
                      tryDeserialize(node, jacksonTypeRef<NewCouponAmountDiscount>()){ it.validate() }?.let {
                          return Discount(newCouponAmount = it, _json = json)
                      }
                  }
              }

              return Discount(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Discount>(Discount::class) {

            override fun serialize(value: Discount, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.newCouponPercentage != null -> generator.writeObject(value.newCouponPercentage)
                  value.newCouponAmount != null -> generator.writeObject(value.newCouponAmount)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Discount")
              }
            }
        }

        @NoAutoDetect
        class NewCouponPercentageDiscount @JsonCreator private constructor(
            @JsonProperty("discount_type") @ExcludeMissing private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("percentage_discount") @ExcludeMissing private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewCouponPercentageDiscount =
                apply {
                    if (validated) {
                      return@apply
                    }

                    discountType()
                    percentageDiscount()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NewCouponPercentageDiscount].
                 *
                 * The following fields are required:
                 *
                 * ```kotlin
                 * .discountType()
                 * .percentageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewCouponPercentageDiscount]. */
            class Builder internal constructor() {

                private var discountType: JsonField<DiscountType>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponPercentageDiscount: NewCouponPercentageDiscount) =
                    apply {
                        discountType = newCouponPercentageDiscount.discountType
                        percentageDiscount = newCouponPercentageDiscount.percentageDiscount
                        additionalProperties = newCouponPercentageDiscount.additionalProperties.toMutableMap()
                    }

                fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) =
                    apply {
                        this.discountType = discountType
                    }

                fun percentageDiscount(percentageDiscount: Double) = percentageDiscount(JsonField.of(percentageDiscount))

                fun percentageDiscount(percentageDiscount: JsonField<Double>) =
                    apply {
                        this.percentageDiscount = percentageDiscount
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): NewCouponPercentageDiscount =
                    NewCouponPercentageDiscount(
                      checkRequired(
                        "discountType", discountType
                      ),
                      checkRequired(
                        "percentageDiscount", percentageDiscount
                      ),
                      additionalProperties.toImmutable(),
                    )
            }

            class DiscountType @JsonCreator private constructor(
                private val value: JsonField<String>,

            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                companion object {

                    val PERCENTAGE = of("percentage")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    PERCENTAGE,
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 *
                 * - It was deserialized from data that doesn't match any known member. For
                 *   example, if the SDK is on an older version than the API, then the API may
                 *   respond with new members that the SDK is unaware of.
                 *
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERCENTAGE,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 * member.
                 */
                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 * expected primitive type.
                 */
                fun asString(): String = _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

            override fun toString() = "NewCouponPercentageDiscount{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NewCouponAmountDiscount @JsonCreator private constructor(
            @JsonProperty("amount_discount") @ExcludeMissing private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_type") @ExcludeMissing private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NewCouponAmountDiscount =
                apply {
                    if (validated) {
                      return@apply
                    }

                    amountDiscount()
                    discountType()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NewCouponAmountDiscount].
                 *
                 * The following fields are required:
                 *
                 * ```kotlin
                 * .amountDiscount()
                 * .discountType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewCouponAmountDiscount]. */
            class Builder internal constructor() {

                private var amountDiscount: JsonField<String>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponAmountDiscount: NewCouponAmountDiscount) =
                    apply {
                        amountDiscount = newCouponAmountDiscount.amountDiscount
                        discountType = newCouponAmountDiscount.discountType
                        additionalProperties = newCouponAmountDiscount.additionalProperties.toMutableMap()
                    }

                fun amountDiscount(amountDiscount: String) = amountDiscount(JsonField.of(amountDiscount))

                fun amountDiscount(amountDiscount: JsonField<String>) =
                    apply {
                        this.amountDiscount = amountDiscount
                    }

                fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) =
                    apply {
                        this.discountType = discountType
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): NewCouponAmountDiscount =
                    NewCouponAmountDiscount(
                      checkRequired(
                        "amountDiscount", amountDiscount
                      ),
                      checkRequired(
                        "discountType", discountType
                      ),
                      additionalProperties.toImmutable(),
                    )
            }

            class DiscountType @JsonCreator private constructor(
                private val value: JsonField<String>,

            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                companion object {

                    val AMOUNT = of("amount")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    AMOUNT,
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 *
                 * - It was deserialized from data that doesn't match any known member. For
                 *   example, if the SDK is on an older version than the API, then the API may
                 *   respond with new members that the SDK is unaware of.
                 *
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AMOUNT,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 * member.
                 */
                fun known(): Known =
                    when (this) {
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 * expected primitive type.
                 */
                fun asString(): String = _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

            override fun toString() = "NewCouponAmountDiscount{amountDiscount=$amountDiscount, discountType=$discountType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is CouponCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "CouponCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
