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
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows the creation of coupons, which can then be redeemed at subscription creation
 * or plan change.
 */
class CouponCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discount(): Discount = body.discount()

    /**
     * This string can be used to redeem this coupon for a given subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redemptionCode(): String = body.redemptionCode()

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a
     * `null` value here means "unlimited time".
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun durationInMonths(): Long? = body.durationInMonths()

    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted;`null` here
     * means "unlimited".
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maxRedemptions(): Long? = body.maxRedemptions()

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discount(): JsonField<Discount> = body._discount()

    /**
     * Returns the raw JSON value of [redemptionCode].
     *
     * Unlike [redemptionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redemptionCode(): JsonField<String> = body._redemptionCode()

    /**
     * Returns the raw JSON value of [durationInMonths].
     *
     * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _durationInMonths(): JsonField<Long> = body._durationInMonths()

    /**
     * Returns the raw JSON value of [maxRedemptions].
     *
     * Unlike [maxRedemptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxRedemptions(): JsonField<Long> = body._maxRedemptions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .discount()
         * .redemptionCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CouponCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(couponCreateParams: CouponCreateParams) = apply {
            body = couponCreateParams.body.toBuilder()
            additionalHeaders = couponCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = couponCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [discount]
         * - [redemptionCode]
         * - [durationInMonths]
         * - [maxRedemptions]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun discount(discount: Discount) = apply { body.discount(discount) }

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discount(discount: JsonField<Discount>) = apply { body.discount(discount) }

        /**
         * Alias for calling [discount] with `Discount.ofNewCouponPercentage(newCouponPercentage)`.
         */
        fun discount(newCouponPercentage: Discount.NewCouponPercentageDiscount) = apply {
            body.discount(newCouponPercentage)
        }

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * Discount.NewCouponPercentageDiscount.builder()
         *     .percentageDiscount(percentageDiscount)
         *     .build()
         * ```
         */
        fun newCouponPercentageDiscount(percentageDiscount: Double) = apply {
            body.newCouponPercentageDiscount(percentageDiscount)
        }

        /** Alias for calling [discount] with `Discount.ofNewCouponAmount(newCouponAmount)`. */
        fun discount(newCouponAmount: Discount.NewCouponAmountDiscount) = apply {
            body.discount(newCouponAmount)
        }

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * Discount.NewCouponAmountDiscount.builder()
         *     .amountDiscount(amountDiscount)
         *     .build()
         * ```
         */
        fun newCouponAmountDiscount(amountDiscount: String) = apply {
            body.newCouponAmountDiscount(amountDiscount)
        }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) = apply { body.redemptionCode(redemptionCode) }

        /**
         * Sets [Builder.redemptionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redemptionCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redemptionCode(redemptionCode: JsonField<String>) = apply {
            body.redemptionCode(redemptionCode)
        }

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long?) = apply {
            body.durationInMonths(durationInMonths)
        }

        /**
         * Alias for [Builder.durationInMonths].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /**
         * Sets [Builder.durationInMonths] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            body.durationInMonths(durationInMonths)
        }

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long?) = apply { body.maxRedemptions(maxRedemptions) }

        /**
         * Alias for [Builder.maxRedemptions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

        /**
         * Sets [Builder.maxRedemptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRedemptions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRedemptions(maxRedemptions: JsonField<Long>) = apply {
            body.maxRedemptions(maxRedemptions)
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

        /**
         * Returns an immutable instance of [CouponCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .discount()
         * .redemptionCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CouponCreateParams =
            CouponCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val discount: JsonField<Discount>,
        private val redemptionCode: JsonField<String>,
        private val durationInMonths: JsonField<Long>,
        private val maxRedemptions: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Discount> = JsonMissing.of(),
            @JsonProperty("redemption_code")
            @ExcludeMissing
            redemptionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration_in_months")
            @ExcludeMissing
            durationInMonths: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_redemptions")
            @ExcludeMissing
            maxRedemptions: JsonField<Long> = JsonMissing.of(),
        ) : this(discount, redemptionCode, durationInMonths, maxRedemptions, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Discount = discount.getRequired("discount")

        /**
         * This string can be used to redeem this coupon for a given subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun redemptionCode(): String = redemptionCode.getRequired("redemption_code")

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationInMonths(): Long? = durationInMonths.getNullable("duration_in_months")

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted;`null`
         * here means "unlimited".
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRedemptions(): Long? = maxRedemptions.getNullable("max_redemptions")

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * Returns the raw JSON value of [redemptionCode].
         *
         * Unlike [redemptionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redemption_code")
        @ExcludeMissing
        fun _redemptionCode(): JsonField<String> = redemptionCode

        /**
         * Returns the raw JSON value of [durationInMonths].
         *
         * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_in_months")
        @ExcludeMissing
        fun _durationInMonths(): JsonField<Long> = durationInMonths

        /**
         * Returns the raw JSON value of [maxRedemptions].
         *
         * Unlike [maxRedemptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_redemptions")
        @ExcludeMissing
        fun _maxRedemptions(): JsonField<Long> = maxRedemptions

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
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

            internal fun from(body: Body) = apply {
                discount = body.discount
                redemptionCode = body.redemptionCode
                durationInMonths = body.durationInMonths
                maxRedemptions = body.maxRedemptions
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Discount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            /**
             * Alias for calling [discount] with
             * `Discount.ofNewCouponPercentage(newCouponPercentage)`.
             */
            fun discount(newCouponPercentage: Discount.NewCouponPercentageDiscount) =
                discount(Discount.ofNewCouponPercentage(newCouponPercentage))

            /**
             * Alias for calling [discount] with the following:
             * ```kotlin
             * Discount.NewCouponPercentageDiscount.builder()
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun newCouponPercentageDiscount(percentageDiscount: Double) =
                discount(
                    Discount.NewCouponPercentageDiscount.builder()
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofNewCouponAmount(newCouponAmount)`. */
            fun discount(newCouponAmount: Discount.NewCouponAmountDiscount) =
                discount(Discount.ofNewCouponAmount(newCouponAmount))

            /**
             * Alias for calling [discount] with the following:
             * ```kotlin
             * Discount.NewCouponAmountDiscount.builder()
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun newCouponAmountDiscount(amountDiscount: String) =
                discount(
                    Discount.NewCouponAmountDiscount.builder()
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** This string can be used to redeem this coupon for a given subscription. */
            fun redemptionCode(redemptionCode: String) =
                redemptionCode(JsonField.of(redemptionCode))

            /**
             * Sets [Builder.redemptionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redemptionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redemptionCode(redemptionCode: JsonField<String>) = apply {
                this.redemptionCode = redemptionCode
            }

            /**
             * This allows for a coupon's discount to apply for a limited time (determined in
             * months); a `null` value here means "unlimited time".
             */
            fun durationInMonths(durationInMonths: Long?) =
                durationInMonths(JsonField.ofNullable(durationInMonths))

            /**
             * Alias for [Builder.durationInMonths].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun durationInMonths(durationInMonths: Long) =
                durationInMonths(durationInMonths as Long?)

            /**
             * Sets [Builder.durationInMonths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
                this.durationInMonths = durationInMonths
            }

            /**
             * The maximum number of redemptions allowed for this coupon before it is
             * exhausted;`null` here means "unlimited".
             */
            fun maxRedemptions(maxRedemptions: Long?) =
                maxRedemptions(JsonField.ofNullable(maxRedemptions))

            /**
             * Alias for [Builder.maxRedemptions].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

            /**
             * Sets [Builder.maxRedemptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRedemptions] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRedemptions(maxRedemptions: JsonField<Long>) = apply {
                this.maxRedemptions = maxRedemptions
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .discount()
             * .redemptionCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("discount", discount),
                    checkRequired("redemptionCode", redemptionCode),
                    durationInMonths,
                    maxRedemptions,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            discount().validate()
            redemptionCode()
            durationInMonths()
            maxRedemptions()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (discount.asKnown()?.validity() ?: 0) +
                (if (redemptionCode.asKnown() == null) 0 else 1) +
                (if (durationInMonths.asKnown() == null) 0 else 1) +
                (if (maxRedemptions.asKnown() == null) 0 else 1)

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

        override fun toString() =
            "Body{discount=$discount, redemptionCode=$redemptionCode, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Discount.Deserializer::class)
    @JsonSerialize(using = Discount.Serializer::class)
    class Discount
    private constructor(
        private val newCouponPercentage: NewCouponPercentageDiscount? = null,
        private val newCouponAmount: NewCouponAmountDiscount? = null,
        private val _json: JsonValue? = null,
    ) {

        fun newCouponPercentage(): NewCouponPercentageDiscount? = newCouponPercentage

        fun newCouponAmount(): NewCouponAmountDiscount? = newCouponAmount

        fun isNewCouponPercentage(): Boolean = newCouponPercentage != null

        fun isNewCouponAmount(): Boolean = newCouponAmount != null

        fun asNewCouponPercentage(): NewCouponPercentageDiscount =
            newCouponPercentage.getOrThrow("newCouponPercentage")

        fun asNewCouponAmount(): NewCouponAmountDiscount =
            newCouponAmount.getOrThrow("newCouponAmount")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                newCouponPercentage != null -> visitor.visitNewCouponPercentage(newCouponPercentage)
                newCouponAmount != null -> visitor.visitNewCouponAmount(newCouponAmount)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNewCouponPercentage(
                        newCouponPercentage: NewCouponPercentageDiscount
                    ) {
                        newCouponPercentage.validate()
                    }

                    override fun visitNewCouponAmount(newCouponAmount: NewCouponAmountDiscount) {
                        newCouponAmount.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNewCouponPercentage(
                        newCouponPercentage: NewCouponPercentageDiscount
                    ) = newCouponPercentage.validity()

                    override fun visitNewCouponAmount(newCouponAmount: NewCouponAmountDiscount) =
                        newCouponAmount.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

            fun ofNewCouponPercentage(newCouponPercentage: NewCouponPercentageDiscount) =
                Discount(newCouponPercentage = newCouponPercentage)

            fun ofNewCouponAmount(newCouponAmount: NewCouponAmountDiscount) =
                Discount(newCouponAmount = newCouponAmount)
        }

        /**
         * An interface that defines how to map each variant of [Discount] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNewCouponPercentage(newCouponPercentage: NewCouponPercentageDiscount): T

            fun visitNewCouponAmount(newCouponAmount: NewCouponAmountDiscount): T

            /**
             * Maps an unknown variant of [Discount] to a value of type [T].
             *
             * An instance of [Discount] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
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
                        return tryDeserialize(node, jacksonTypeRef<NewCouponPercentageDiscount>())
                            ?.let { Discount(newCouponPercentage = it, _json = json) }
                            ?: Discount(_json = json)
                    }
                    "amount" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewCouponAmountDiscount>())
                            ?.let { Discount(newCouponAmount = it, _json = json) }
                            ?: Discount(_json = json)
                    }
                }

                return Discount(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Discount>(Discount::class) {

            override fun serialize(
                value: Discount,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.newCouponPercentage != null ->
                        generator.writeObject(value.newCouponPercentage)
                    value.newCouponAmount != null -> generator.writeObject(value.newCouponAmount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Discount")
                }
            }
        }

        class NewCouponPercentageDiscount
        private constructor(
            private val discountType: JsonValue,
            private val percentageDiscount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("discount_type")
                @ExcludeMissing
                discountType: JsonValue = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                percentageDiscount: JsonField<Double> = JsonMissing.of(),
            ) : this(discountType, percentageDiscount, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("percentage")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonValue = discountType

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * Returns the raw JSON value of [percentageDiscount].
             *
             * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NewCouponPercentageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .percentageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewCouponPercentageDiscount]. */
            class Builder internal constructor() {

                private var discountType: JsonValue = JsonValue.from("percentage")
                private var percentageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponPercentageDiscount: NewCouponPercentageDiscount) =
                    apply {
                        discountType = newCouponPercentageDiscount.discountType
                        percentageDiscount = newCouponPercentageDiscount.percentageDiscount
                        additionalProperties =
                            newCouponPercentageDiscount.additionalProperties.toMutableMap()
                    }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("percentage")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun discountType(discountType: JsonValue) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
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

                /**
                 * Returns an immutable instance of [NewCouponPercentageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .percentageDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewCouponPercentageDiscount =
                    NewCouponPercentageDiscount(
                        discountType,
                        checkRequired("percentageDiscount", percentageDiscount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NewCouponPercentageDiscount = apply {
                if (validated) {
                    return@apply
                }

                _discountType().let {
                    if (it != JsonValue.from("percentage")) {
                        throw OrbInvalidDataException("'discountType' is invalid, received $it")
                    }
                }
                percentageDiscount()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                discountType.let { if (it == JsonValue.from("percentage")) 1 else 0 } +
                    (if (percentageDiscount.asKnown() == null) 0 else 1)

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

        class NewCouponAmountDiscount
        private constructor(
            private val amountDiscount: JsonField<String>,
            private val discountType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount_discount")
                @ExcludeMissing
                amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discount_type")
                @ExcludeMissing
                discountType: JsonValue = JsonMissing.of(),
            ) : this(amountDiscount, discountType, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("amount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonValue = discountType

            /**
             * Returns the raw JSON value of [amountDiscount].
             *
             * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NewCouponAmountDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amountDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NewCouponAmountDiscount]. */
            class Builder internal constructor() {

                private var amountDiscount: JsonField<String>? = null
                private var discountType: JsonValue = JsonValue.from("amount")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newCouponAmountDiscount: NewCouponAmountDiscount) = apply {
                    amountDiscount = newCouponAmountDiscount.amountDiscount
                    discountType = newCouponAmountDiscount.discountType
                    additionalProperties =
                        newCouponAmountDiscount.additionalProperties.toMutableMap()
                }

                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDiscount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("amount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun discountType(discountType: JsonValue) = apply {
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

                /**
                 * Returns an immutable instance of [NewCouponAmountDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amountDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewCouponAmountDiscount =
                    NewCouponAmountDiscount(
                        checkRequired("amountDiscount", amountDiscount),
                        discountType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NewCouponAmountDiscount = apply {
                if (validated) {
                    return@apply
                }

                amountDiscount()
                _discountType().let {
                    if (it != JsonValue.from("amount")) {
                        throw OrbInvalidDataException("'discountType' is invalid, received $it")
                    }
                }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (amountDiscount.asKnown() == null) 0 else 1) +
                    discountType.let { if (it == JsonValue.from("amount")) 1 else 0 }

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
