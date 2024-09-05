// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

/**
 * A coupon represents a reusable discount configuration that can be applied either
 * as a fixed or percentage amount to an invoice or subscription. Coupons are
 * activated using a redemption code, which applies the discount to a subscription
 * or invoice. The duration of a coupon determines how long it remains available
 * for use by end users.
 *
 * ## How to use coupons
 *
 * Coupons can be created using the Orb dashboard or programmatically through the
 * API. Once a coupon is created, it can be managed and applied programmatically
 * via the API. To redeem a coupon, use the `redemption_code` property when
 * [creating a subscription](create-subscription.api.mdx) or when scheduling a
 * [plan change](schedule-plan-change.api.mdx).
 *
 * ## When to use coupons
 *
 * A common use case for coupons is through self-serve signup or upgrade flows in
 * your checkout experience or billing portal. Coupons can also be used as one-off
 * to incentivize use for custom agreements.
 *
 * Coupons are effective when launching new features and encouraging existing users
 * to upgrade to a higher tier. For example, you could create a coupon code
 * "UPGRADE20" that offers a 20% discount on the first month of the new plan. This
 * code can be applied during the upgrade process in your billing portal, making it
 * straightforward for users to benefit from the new features at a reduced cost.
 */
@JsonDeserialize(builder = Coupon.Builder::class)
@NoAutoDetect
class Coupon private constructor(
  private val id: JsonField<String>,
  private val redemptionCode: JsonField<String>,
  private val discount: JsonField<Discount>,
  private val timesRedeemed: JsonField<Long>,
  private val durationInMonths: JsonField<Long>,
  private val maxRedemptions: JsonField<Long>,
  private val archivedAt: JsonField<OffsetDateTime>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Also referred to as coupon_id in this documentation. */
    fun id(): String = id.getRequired("id")

    /** This string can be used to redeem this coupon for a given subscription. */
    fun redemptionCode(): String = redemptionCode.getRequired("redemption_code")

    fun discount(): Discount = discount.getRequired("discount")

    /** The number of times this coupon has been redeemed. */
    fun timesRedeemed(): Long = timesRedeemed.getRequired("times_redeemed")

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in
     * months); a `null` value here means "unlimited time".
     */
    fun durationInMonths(): Long? = durationInMonths.getNullable("duration_in_months")

    /**
     * The maximum number of redemptions allowed for this coupon before it is
     * exhausted; `null` here means "unlimited".
     */
    fun maxRedemptions(): Long? = maxRedemptions.getNullable("max_redemptions")

    /**
     * An archived coupon can no longer be redeemed. Active coupons will have a value
     * of null for `archived_at`; this field will be non-null for archived coupons.
     */
    fun archivedAt(): OffsetDateTime? = archivedAt.getNullable("archived_at")

    /** Also referred to as coupon_id in this documentation. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** This string can be used to redeem this coupon for a given subscription. */
    @JsonProperty("redemption_code")
    @ExcludeMissing
    fun _redemptionCode() = redemptionCode

    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount() = discount

    /** The number of times this coupon has been redeemed. */
    @JsonProperty("times_redeemed")
    @ExcludeMissing
    fun _timesRedeemed() = timesRedeemed

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in
     * months); a `null` value here means "unlimited time".
     */
    @JsonProperty("duration_in_months")
    @ExcludeMissing
    fun _durationInMonths() = durationInMonths

    /**
     * The maximum number of redemptions allowed for this coupon before it is
     * exhausted; `null` here means "unlimited".
     */
    @JsonProperty("max_redemptions")
    @ExcludeMissing
    fun _maxRedemptions() = maxRedemptions

    /**
     * An archived coupon can no longer be redeemed. Active coupons will have a value
     * of null for `archived_at`; this field will be non-null for archived coupons.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt() = archivedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Coupon = apply {
        if (!validated) {
          id()
          redemptionCode()
          discount()
          timesRedeemed()
          durationInMonths()
          maxRedemptions()
          archivedAt()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Coupon &&
          this.id == other.id &&
          this.redemptionCode == other.redemptionCode &&
          this.discount == other.discount &&
          this.timesRedeemed == other.timesRedeemed &&
          this.durationInMonths == other.durationInMonths &&
          this.maxRedemptions == other.maxRedemptions &&
          this.archivedAt == other.archivedAt &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            redemptionCode,
            discount,
            timesRedeemed,
            durationInMonths,
            maxRedemptions,
            archivedAt,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Coupon{id=$id, redemptionCode=$redemptionCode, discount=$discount, timesRedeemed=$timesRedeemed, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, archivedAt=$archivedAt, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var redemptionCode: JsonField<String> = JsonMissing.of()
        private var discount: JsonField<Discount> = JsonMissing.of()
        private var timesRedeemed: JsonField<Long> = JsonMissing.of()
        private var durationInMonths: JsonField<Long> = JsonMissing.of()
        private var maxRedemptions: JsonField<Long> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(coupon: Coupon) = apply {
            this.id = coupon.id
            this.redemptionCode = coupon.redemptionCode
            this.discount = coupon.discount
            this.timesRedeemed = coupon.timesRedeemed
            this.durationInMonths = coupon.durationInMonths
            this.maxRedemptions = coupon.maxRedemptions
            this.archivedAt = coupon.archivedAt
            additionalProperties(coupon.additionalProperties)
        }

        /** Also referred to as coupon_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /** Also referred to as coupon_id in this documentation. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) = redemptionCode(JsonField.of(redemptionCode))

        /** This string can be used to redeem this coupon for a given subscription. */
        @JsonProperty("redemption_code")
        @ExcludeMissing
        fun redemptionCode(redemptionCode: JsonField<String>) = apply {
            this.redemptionCode = redemptionCode
        }

        fun discount(discount: Discount) = discount(JsonField.of(discount))

        @JsonProperty("discount")
        @ExcludeMissing
        fun discount(discount: JsonField<Discount>) = apply {
            this.discount = discount
        }

        /** The number of times this coupon has been redeemed. */
        fun timesRedeemed(timesRedeemed: Long) = timesRedeemed(JsonField.of(timesRedeemed))

        /** The number of times this coupon has been redeemed. */
        @JsonProperty("times_redeemed")
        @ExcludeMissing
        fun timesRedeemed(timesRedeemed: JsonField<Long>) = apply {
            this.timesRedeemed = timesRedeemed
        }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(JsonField.of(durationInMonths))

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in
         * months); a `null` value here means "unlimited time".
         */
        @JsonProperty("duration_in_months")
        @ExcludeMissing
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            this.durationInMonths = durationInMonths
        }

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted; `null` here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(JsonField.of(maxRedemptions))

        /**
         * The maximum number of redemptions allowed for this coupon before it is
         * exhausted; `null` here means "unlimited".
         */
        @JsonProperty("max_redemptions")
        @ExcludeMissing
        fun maxRedemptions(maxRedemptions: JsonField<Long>) = apply {
            this.maxRedemptions = maxRedemptions
        }

        /**
         * An archived coupon can no longer be redeemed. Active coupons will have a value
         * of null for `archived_at`; this field will be non-null for archived coupons.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * An archived coupon can no longer be redeemed. Active coupons will have a value
         * of null for `archived_at`; this field will be non-null for archived coupons.
         */
        @JsonProperty("archived_at")
        @ExcludeMissing
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
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

        fun build(): Coupon = Coupon(
            id,
            redemptionCode,
            discount,
            timesRedeemed,
            durationInMonths,
            maxRedemptions,
            archivedAt,
            additionalProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(using = Discount.Deserializer::class)
    @JsonSerialize(using = Discount.Serializer::class)
    class Discount private constructor(private val percentageDiscount: PercentageDiscount? = null, private val amountDiscount: AmountDiscount? = null, private val _json: JsonValue? = null, ) {

        private var validated: Boolean = false

        fun percentageDiscount(): PercentageDiscount? = percentageDiscount
        fun amountDiscount(): AmountDiscount? = amountDiscount

        fun isPercentageDiscount(): Boolean = percentageDiscount != null
        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun asPercentageDiscount(): PercentageDiscount = percentageDiscount.getOrThrow("percentageDiscount")
        fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
              amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
              else -> visitor.unknown(_json)
          }
        }

        fun validate(): Discount = apply {
            if (!validated) {
              if (percentageDiscount == null && amountDiscount == null) {
                throw OrbInvalidDataException("Unknown Discount: $_json")
              }
              percentageDiscount?.validate()
              amountDiscount?.validate()
              validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Discount &&
              this.percentageDiscount == other.percentageDiscount &&
              this.amountDiscount == other.amountDiscount
        }

        override fun hashCode(): Int {
          return Objects.hash(percentageDiscount, amountDiscount)
        }

        override fun toString(): String {
          return when {
              percentageDiscount != null -> "Discount{percentageDiscount=$percentageDiscount}"
              amountDiscount != null -> "Discount{amountDiscount=$amountDiscount}"
              _json != null -> "Discount{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid Discount")
          }
        }

        companion object {

            fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) = Discount(percentageDiscount = percentageDiscount)

            fun ofAmountDiscount(amountDiscount: AmountDiscount) = Discount(amountDiscount = amountDiscount)
        }

        interface Visitor<out T> {

            fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

            fun visitAmountDiscount(amountDiscount: AmountDiscount): T

            fun unknown(json: JsonValue?): T {
              throw OrbInvalidDataException("Unknown Discount: $json")
            }
        }

        class Deserializer : BaseDeserializer<Discount>(Discount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Discount {
              val json = JsonValue.fromJsonNode(node)
              tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()){ it.validate() }?.let {
                  return Discount(percentageDiscount = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<AmountDiscount>()){ it.validate() }?.let {
                  return Discount(amountDiscount = it, _json = json)
              }

              return Discount(_json = json)
            }
        }

        class Serializer : BaseSerializer<Discount>(Discount::class) {

            override fun serialize(value: Discount, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                  value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Discount")
              }
            }
        }

        @JsonDeserialize(builder = PercentageDiscount.Builder::class)
        @NoAutoDetect
        class PercentageDiscount private constructor(
          private val discountType: JsonField<DiscountType>,
          private val appliesToPriceIds: JsonField<List<String>>,
          private val reason: JsonField<String>,
          private val percentageDiscount: JsonField<Double>,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

            fun reason(): String? = reason.getNullable("reason")

            /**
             * Only available if discount_type is `percentage`. This is a number between 0
             * and 1.
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType() = discountType

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonProperty("reason")
            @ExcludeMissing
            fun _reason() = reason

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

            fun validate(): PercentageDiscount = apply {
                if (!validated) {
                  discountType()
                  appliesToPriceIds()
                  reason()
                  percentageDiscount()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is PercentageDiscount &&
                  this.discountType == other.discountType &&
                  this.appliesToPriceIds == other.appliesToPriceIds &&
                  this.reason == other.reason &&
                  this.percentageDiscount == other.percentageDiscount &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    discountType,
                    appliesToPriceIds,
                    reason,
                    percentageDiscount,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "PercentageDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percentageDiscount: PercentageDiscount) = apply {
                    this.discountType = percentageDiscount.discountType
                    this.appliesToPriceIds = percentageDiscount.appliesToPriceIds
                    this.reason = percentageDiscount.reason
                    this.percentageDiscount = percentageDiscount.percentageDiscount
                    additionalProperties(percentageDiscount.additionalProperties)
                }

                fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) = appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply {
                    this.reason = reason
                }

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(percentageDiscount: Double) = percentageDiscount(JsonField.of(percentageDiscount))

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

                fun build(): PercentageDiscount = PercentageDiscount(
                    discountType,
                    appliesToPriceIds.map { it.toUnmodifiable() },
                    reason,
                    percentageDiscount,
                    additionalProperties.toUnmodifiable(),
                )
            }

            class DiscountType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is DiscountType &&
                      this.value == other.value
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

                fun value(): Value = when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = AmountDiscount.Builder::class)
        @NoAutoDetect
        class AmountDiscount private constructor(
          private val discountType: JsonField<DiscountType>,
          private val appliesToPriceIds: JsonField<List<String>>,
          private val reason: JsonField<String>,
          private val amountDiscount: JsonField<String>,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

            fun reason(): String? = reason.getNullable("reason")

            /** Only available if discount_type is `amount`. */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType() = discountType

            /**
             * List of price_ids that this discount applies to. For plan/plan phase discounts,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonProperty("reason")
            @ExcludeMissing
            fun _reason() = reason

            /** Only available if discount_type is `amount`. */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount() = amountDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AmountDiscount = apply {
                if (!validated) {
                  discountType()
                  appliesToPriceIds()
                  reason()
                  amountDiscount()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is AmountDiscount &&
                  this.discountType == other.discountType &&
                  this.appliesToPriceIds == other.appliesToPriceIds &&
                  this.reason == other.reason &&
                  this.amountDiscount == other.amountDiscount &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    discountType,
                    appliesToPriceIds,
                    reason,
                    amountDiscount,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "AmountDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amountDiscount: AmountDiscount) = apply {
                    this.discountType = amountDiscount.discountType
                    this.appliesToPriceIds = amountDiscount.appliesToPriceIds
                    this.reason = amountDiscount.reason
                    this.amountDiscount = amountDiscount.amountDiscount
                    additionalProperties(amountDiscount.additionalProperties)
                }

                fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) = appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun reason(reason: String) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<String>) = apply {
                    this.reason = reason
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) = amountDiscount(JsonField.of(amountDiscount))

                /** Only available if discount_type is `amount`. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

                fun build(): AmountDiscount = AmountDiscount(
                    discountType,
                    appliesToPriceIds.map { it.toUnmodifiable() },
                    reason,
                    amountDiscount,
                    additionalProperties.toUnmodifiable(),
                )
            }

            class DiscountType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is DiscountType &&
                      this.value == other.value
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

                fun value(): Value = when (this) {
                    AMOUNT -> Value.AMOUNT
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    AMOUNT -> Known.AMOUNT
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
