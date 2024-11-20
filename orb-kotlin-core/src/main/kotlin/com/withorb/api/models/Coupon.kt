// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * A coupon represents a reusable discount configuration that can be applied either as a fixed or
 * percentage amount to an invoice or subscription. Coupons are activated using a redemption code,
 * which applies the discount to a subscription or invoice. The duration of a coupon determines how
 * long it remains available for use by end users.
 *
 * ## How to use coupons
 *
 * Coupons can be created using the Orb dashboard or programmatically through the API. Once a coupon
 * is created, it can be managed and applied programmatically via the API. To redeem a coupon, use
 * the `redemption_code` property when [creating a subscription](create-subscription.api.mdx) or
 * when scheduling a [plan change](schedule-plan-change.api.mdx).
 *
 * ## When to use coupons
 *
 * A common use case for coupons is through self-serve signup or upgrade flows in your checkout
 * experience or billing portal. Coupons can also be used as one-off to incentivize use for custom
 * agreements.
 *
 * Coupons are effective when launching new features and encouraging existing users to upgrade to a
 * higher tier. For example, you could create a coupon code "UPGRADE20" that offers a 20% discount
 * on the first month of the new plan. This code can be applied during the upgrade process in your
 * billing portal, making it straightforward for users to benefit from the new features at a reduced
 * cost.
 *
 * ## Coupon scoping
 *
 * When a coupon is applied on a subscription, it creates a discount adjustment that applies to all
 * of the prices on the subscription at the time of the coupon application. Notably, coupons do not
 * scope in new price additions to a subscription automatically — if a new price is added to the
 * subscription with a subscription edit or plan version migration, the discount created with the
 * coupon will not apply to it automatically. If you'd like the coupon to apply to newly added
 * prices, you can [edit the adjustment intervals](add-edit-price-intervals.api.mdx) to end the
 * discount interval created by the coupon at the time of the migration and add a new one starting
 * at the time of the migration that includes the newly added prices you'd like the coupon to apply
 * to.
 */
@JsonDeserialize(builder = Coupon.Builder::class)
@NoAutoDetect
class Coupon
private constructor(
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

    /** Also referred to as coupon_id in this documentation. */
    fun id(): String = id.getRequired("id")

    /** This string can be used to redeem this coupon for a given subscription. */
    fun redemptionCode(): String = redemptionCode.getRequired("redemption_code")

    fun discount(): Discount = discount.getRequired("discount")

    /** The number of times this coupon has been redeemed. */
    fun timesRedeemed(): Long = timesRedeemed.getRequired("times_redeemed")

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a
     * `null` value here means "unlimited time".
     */
    fun durationInMonths(): Long? = durationInMonths.getNullable("duration_in_months")

    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted; `null` here
     * means "unlimited".
     */
    fun maxRedemptions(): Long? = maxRedemptions.getNullable("max_redemptions")

    /**
     * An archived coupon can no longer be redeemed. Active coupons will have a value of null for
     * `archived_at`; this field will be non-null for archived coupons.
     */
    fun archivedAt(): OffsetDateTime? = archivedAt.getNullable("archived_at")

    /** Also referred to as coupon_id in this documentation. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** This string can be used to redeem this coupon for a given subscription. */
    @JsonProperty("redemption_code") @ExcludeMissing fun _redemptionCode() = redemptionCode

    @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

    /** The number of times this coupon has been redeemed. */
    @JsonProperty("times_redeemed") @ExcludeMissing fun _timesRedeemed() = timesRedeemed

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a
     * `null` value here means "unlimited time".
     */
    @JsonProperty("duration_in_months") @ExcludeMissing fun _durationInMonths() = durationInMonths

    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted; `null` here
     * means "unlimited".
     */
    @JsonProperty("max_redemptions") @ExcludeMissing fun _maxRedemptions() = maxRedemptions

    /**
     * An archived coupon can no longer be redeemed. Active coupons will have a value of null for
     * `archived_at`; this field will be non-null for archived coupons.
     */
    @JsonProperty("archived_at") @ExcludeMissing fun _archivedAt() = archivedAt

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
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** The number of times this coupon has been redeemed. */
        fun timesRedeemed(timesRedeemed: Long) = timesRedeemed(JsonField.of(timesRedeemed))

        /** The number of times this coupon has been redeemed. */
        @JsonProperty("times_redeemed")
        @ExcludeMissing
        fun timesRedeemed(timesRedeemed: JsonField<Long>) = apply {
            this.timesRedeemed = timesRedeemed
        }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long) =
            durationInMonths(JsonField.of(durationInMonths))

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        @JsonProperty("duration_in_months")
        @ExcludeMissing
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            this.durationInMonths = durationInMonths
        }

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted; `null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(JsonField.of(maxRedemptions))

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted; `null`
         * here means "unlimited".
         */
        @JsonProperty("max_redemptions")
        @ExcludeMissing
        fun maxRedemptions(maxRedemptions: JsonField<Long>) = apply {
            this.maxRedemptions = maxRedemptions
        }

        /**
         * An archived coupon can no longer be redeemed. Active coupons will have a value of null
         * for `archived_at`; this field will be non-null for archived coupons.
         */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * An archived coupon can no longer be redeemed. Active coupons will have a value of null
         * for `archived_at`; this field will be non-null for archived coupons.
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

        fun build(): Coupon =
            Coupon(
                id,
                redemptionCode,
                discount,
                timesRedeemed,
                durationInMonths,
                maxRedemptions,
                archivedAt,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Discount.Deserializer::class)
    @JsonSerialize(using = Discount.Serializer::class)
    class Discount
    private constructor(
        private val percentageDiscount: PercentageDiscount? = null,
        private val amountDiscount: AmountDiscount? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun percentageDiscount(): PercentageDiscount? = percentageDiscount

        fun amountDiscount(): AmountDiscount? = amountDiscount

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun asPercentageDiscount(): PercentageDiscount =
            percentageDiscount.getOrThrow("percentageDiscount")

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

            return /* spotless:off */ other is Discount && percentageDiscount == other.percentageDiscount && amountDiscount == other.amountDiscount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, amountDiscount) /* spotless:on */

        override fun toString(): String =
            when {
                percentageDiscount != null -> "Discount{percentageDiscount=$percentageDiscount}"
                amountDiscount != null -> "Discount{amountDiscount=$amountDiscount}"
                _json != null -> "Discount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Discount")
            }

        companion object {

            fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
                Discount(percentageDiscount = percentageDiscount)

            fun ofAmountDiscount(amountDiscount: AmountDiscount) =
                Discount(amountDiscount = amountDiscount)
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
                val discountType = json.asObject()?.get("discount_type")?.asString()

                when (discountType) {
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                            ?.let {
                                return Discount(percentageDiscount = it, _json = json)
                            }
                    }
                    "amount" -> {
                        tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                            ?.let {
                                return Discount(amountDiscount = it, _json = json)
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
                    value.percentageDiscount != null ->
                        generator.writeObject(value.percentageDiscount)
                    value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Discount")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Coupon && id == other.id && redemptionCode == other.redemptionCode && discount == other.discount && timesRedeemed == other.timesRedeemed && durationInMonths == other.durationInMonths && maxRedemptions == other.maxRedemptions && archivedAt == other.archivedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, redemptionCode, discount, timesRedeemed, durationInMonths, maxRedemptions, archivedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Coupon{id=$id, redemptionCode=$redemptionCode, discount=$discount, timesRedeemed=$timesRedeemed, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, archivedAt=$archivedAt, additionalProperties=$additionalProperties}"
}
