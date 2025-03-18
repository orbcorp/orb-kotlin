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
import java.time.OffsetDateTime
import java.util.Objects

/**
 * This endpoint can be used to cancel an existing subscription. It returns the serialized
 * subscription object with an `end_date` parameter that signifies when the subscription will
 * transition to an ended state.
 *
 * The body parameter `cancel_option` determines the cancellation behavior. Orb supports three
 * cancellation options:
 * - `end_of_subscription_term`: stops the subscription from auto-renewing. Subscriptions that have
 *   been cancelled with this option can still incur charges for the remainder of their term:
 *     - Issuing this cancellation request for a monthly subscription will keep the subscription
 *       active until the start of the subsequent month, and potentially issue an invoice for any
 *       usage charges incurred in the intervening period.
 *     - Issuing this cancellation request for a quarterly subscription will keep the subscription
 *       active until the end of the quarter and potentially issue an invoice for any usage charges
 *       incurred in the intervening period.
 *     - Issuing this cancellation request for a yearly subscription will keep the subscription
 *       active for the full year. For example, a yearly subscription starting on 2021-11-01 and
 *       cancelled on 2021-12-08 will remain active until 2022-11-01 and potentially issue charges
 *       in the intervening months for any recurring monthly usage charges in its plan.
 *     - **Note**: If a subscription's plan contains prices with difference cadences, the end of
 *       term date will be determined by the largest cadence value. For example, cancelling end of
 *       term for a subscription with a quarterly fixed fee with a monthly usage fee will result in
 *       the subscription ending at the end of the quarter.
 * - `immediate`: ends the subscription immediately, setting the `end_date` to the current time:
 *     - Subscriptions that have been cancelled with this option will be invoiced immediately. This
 *       invoice will include any usage fees incurred in the billing period up to the cancellation,
 *       along with any prorated recurring fees for the billing period, if applicable.
 *     - **Note**: If the subscription has a recurring fee that was paid in-advance, the prorated
 *       amount for the remaining time period will be added to the
 *       [customer's balance](list-balance-transactions) upon immediate cancellation. However, if
 *       the customer is ineligible to use the customer balance, the subscription cannot be
 *       cancelled immediately.
 * - `requested_date`: ends the subscription on a specified date, which requires a
 *   `cancellation_date` to be passed in. If no timezone is provided, the customer's timezone is
 *   used. For example, a subscription starting on January 1st with a monthly price can be set to be
 *   cancelled on the first of any month after January 1st (e.g. March 1st, April 1st, May 1st). A
 *   subscription with multiple prices with different cadences defines the "term" to be the highest
 *   cadence of the prices.
 *
 * Upcoming subscriptions are only eligible for immediate cancellation, which will set the
 * `end_date` equal to the `start_date` upon cancellation.
 *
 * ## Backdated cancellations
 *
 * Orb allows you to cancel a subscription in the past as long as there are no paid invoices between
 * the `requested_date` and the current time. If the cancellation is after the latest issued
 * invoice, Orb will generate a balance refund for the current period. If the cancellation is before
 * the most recently issued invoice, Orb will void the intervening invoice and generate a new one
 * based on the new dates for the subscription. See the section on
 * [cancellation behaviors](/product-catalog/creating-subscriptions#cancellation-behaviors).
 */
class SubscriptionCancelParams
private constructor(
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String = subscriptionId

    /**
     * Determines the timing of subscription cancellation
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cancelOption(): CancelOption = body.cancelOption()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun allowInvoiceCreditOrVoid(): Boolean? = body.allowInvoiceCreditOrVoid()

    /**
     * The date that the cancellation should take effect. This parameter can only be passed if the
     * `cancel_option` is `requested_date`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun cancellationDate(): OffsetDateTime? = body.cancellationDate()

    /**
     * Returns the raw JSON value of [cancelOption].
     *
     * Unlike [cancelOption], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cancelOption(): JsonField<CancelOption> = body._cancelOption()

    /**
     * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
     *
     * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = body._allowInvoiceCreditOrVoid()

    /**
     * Returns the raw JSON value of [cancellationDate].
     *
     * Unlike [cancellationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cancellationDate(): JsonField<OffsetDateTime> = body._cancellationDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("cancel_option")
        @ExcludeMissing
        private val cancelOption: JsonField<CancelOption> = JsonMissing.of(),
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        private val allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cancellation_date")
        @ExcludeMissing
        private val cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Determines the timing of subscription cancellation
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cancelOption(): CancelOption = cancelOption.getRequired("cancel_option")

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowInvoiceCreditOrVoid(): Boolean? =
            allowInvoiceCreditOrVoid.getNullable("allow_invoice_credit_or_void")

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancellationDate(): OffsetDateTime? = cancellationDate.getNullable("cancellation_date")

        /**
         * Returns the raw JSON value of [cancelOption].
         *
         * Unlike [cancelOption], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancel_option")
        @ExcludeMissing
        fun _cancelOption(): JsonField<CancelOption> = cancelOption

        /**
         * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
         *
         * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = allowInvoiceCreditOrVoid

        /**
         * Returns the raw JSON value of [cancellationDate].
         *
         * Unlike [cancellationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancellation_date")
        @ExcludeMissing
        fun _cancellationDate(): JsonField<OffsetDateTime> = cancellationDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cancelOption()
            allowInvoiceCreditOrVoid()
            cancellationDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .cancelOption()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cancelOption: JsonField<CancelOption>? = null
            private var allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of()
            private var cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                cancelOption = body.cancelOption
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
                cancellationDate = body.cancellationDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Determines the timing of subscription cancellation */
            fun cancelOption(cancelOption: CancelOption) = cancelOption(JsonField.of(cancelOption))

            /**
             * Sets [Builder.cancelOption] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelOption] with a well-typed [CancelOption] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelOption(cancelOption: JsonField<CancelOption>) = apply {
                this.cancelOption = cancelOption
            }

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) =
                allowInvoiceCreditOrVoid(JsonField.ofNullable(allowInvoiceCreditOrVoid))

            /**
             * Alias for [Builder.allowInvoiceCreditOrVoid].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

            /**
             * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
                this.allowInvoiceCreditOrVoid = allowInvoiceCreditOrVoid
            }

            /**
             * The date that the cancellation should take effect. This parameter can only be passed
             * if the `cancel_option` is `requested_date`.
             */
            fun cancellationDate(cancellationDate: OffsetDateTime?) =
                cancellationDate(JsonField.ofNullable(cancellationDate))

            /**
             * Sets [Builder.cancellationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancellationDate(cancellationDate: JsonField<OffsetDateTime>) = apply {
                this.cancellationDate = cancellationDate
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
             * .cancelOption()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("cancelOption", cancelOption),
                    allowInvoiceCreditOrVoid,
                    cancellationDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && cancelOption == other.cancelOption && allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid && cancellationDate == other.cancellationDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cancelOption, allowInvoiceCreditOrVoid, cancellationDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cancelOption=$cancelOption, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, cancellationDate=$cancellationDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCancelParams].
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * .cancelOption()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCancelParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionCancelParams: SubscriptionCancelParams) = apply {
            subscriptionId = subscriptionCancelParams.subscriptionId
            body = subscriptionCancelParams.body.toBuilder()
            additionalHeaders = subscriptionCancelParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCancelParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Determines the timing of subscription cancellation */
        fun cancelOption(cancelOption: CancelOption) = apply { body.cancelOption(cancelOption) }

        /**
         * Sets [Builder.cancelOption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelOption] with a well-typed [CancelOption] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelOption(cancelOption: JsonField<CancelOption>) = apply {
            body.cancelOption(cancelOption)
        }

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * Alias for [Builder.allowInvoiceCreditOrVoid].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

        /**
         * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        fun cancellationDate(cancellationDate: OffsetDateTime?) = apply {
            body.cancellationDate(cancellationDate)
        }

        /**
         * Sets [Builder.cancellationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancellationDate(cancellationDate: JsonField<OffsetDateTime>) = apply {
            body.cancellationDate(cancellationDate)
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
         * Returns an immutable instance of [SubscriptionCancelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * .cancelOption()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCancelParams =
            SubscriptionCancelParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Determines the timing of subscription cancellation */
    class CancelOption @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val END_OF_SUBSCRIPTION_TERM = of("end_of_subscription_term")

            val IMMEDIATE = of("immediate")

            val REQUESTED_DATE = of("requested_date")

            fun of(value: String) = CancelOption(JsonField.of(value))
        }

        /** An enum containing [CancelOption]'s known values. */
        enum class Known {
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            REQUESTED_DATE,
        }

        /**
         * An enum containing [CancelOption]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CancelOption] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            REQUESTED_DATE,
            /**
             * An enum member indicating that [CancelOption] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                END_OF_SUBSCRIPTION_TERM -> Value.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Value.IMMEDIATE
                REQUESTED_DATE -> Value.REQUESTED_DATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                END_OF_SUBSCRIPTION_TERM -> Known.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Known.IMMEDIATE
                REQUESTED_DATE -> Known.REQUESTED_DATE
                else -> throw OrbInvalidDataException("Unknown CancelOption: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CancelOption && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCancelParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionCancelParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
