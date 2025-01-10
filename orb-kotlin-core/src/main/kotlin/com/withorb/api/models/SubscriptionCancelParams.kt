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
 * [cancellation behaviors](../guides/product-catalog/creating-subscriptions.md#cancellation-behaviors).
 */
class SubscriptionCancelParams
constructor(
    private val subscriptionId: String,
    private val body: SubscriptionCancelBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    /** Determines the timing of subscription cancellation */
    fun cancelOption(): CancelOption = body.cancelOption()

    /**
     * The date that the cancellation should take effect. This parameter can only be passed if the
     * `cancel_option` is `requested_date`.
     */
    fun cancellationDate(): OffsetDateTime? = body.cancellationDate()

    /** Determines the timing of subscription cancellation */
    fun _cancelOption(): JsonField<CancelOption> = body._cancelOption()

    /**
     * The date that the cancellation should take effect. This parameter can only be passed if the
     * `cancel_option` is `requested_date`.
     */
    fun _cancellationDate(): JsonField<OffsetDateTime> = body._cancellationDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): SubscriptionCancelBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class SubscriptionCancelBody
    @JsonCreator
    internal constructor(
        @JsonProperty("cancel_option")
        @ExcludeMissing
        private val cancelOption: JsonField<CancelOption> = JsonMissing.of(),
        @JsonProperty("cancellation_date")
        @ExcludeMissing
        private val cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Determines the timing of subscription cancellation */
        fun cancelOption(): CancelOption = cancelOption.getRequired("cancel_option")

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        fun cancellationDate(): OffsetDateTime? = cancellationDate.getNullable("cancellation_date")

        /** Determines the timing of subscription cancellation */
        @JsonProperty("cancel_option")
        @ExcludeMissing
        fun _cancelOption(): JsonField<CancelOption> = cancelOption

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        @JsonProperty("cancellation_date")
        @ExcludeMissing
        fun _cancellationDate(): JsonField<OffsetDateTime> = cancellationDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SubscriptionCancelBody = apply {
            if (validated) {
                return@apply
            }

            cancelOption()
            cancellationDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cancelOption: JsonField<CancelOption>? = null
            private var cancellationDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionCancelBody: SubscriptionCancelBody) = apply {
                cancelOption = subscriptionCancelBody.cancelOption
                cancellationDate = subscriptionCancelBody.cancellationDate
                additionalProperties = subscriptionCancelBody.additionalProperties.toMutableMap()
            }

            /** Determines the timing of subscription cancellation */
            fun cancelOption(cancelOption: CancelOption) = cancelOption(JsonField.of(cancelOption))

            /** Determines the timing of subscription cancellation */
            fun cancelOption(cancelOption: JsonField<CancelOption>) = apply {
                this.cancelOption = cancelOption
            }

            /**
             * The date that the cancellation should take effect. This parameter can only be passed
             * if the `cancel_option` is `requested_date`.
             */
            fun cancellationDate(cancellationDate: OffsetDateTime?) =
                cancellationDate(JsonField.ofNullable(cancellationDate))

            /**
             * The date that the cancellation should take effect. This parameter can only be passed
             * if the `cancel_option` is `requested_date`.
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

            fun build(): SubscriptionCancelBody =
                SubscriptionCancelBody(
                    checkNotNull(cancelOption) { "`cancelOption` is required but was not set" },
                    cancellationDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionCancelBody && cancelOption == other.cancelOption && cancellationDate == other.cancellationDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cancelOption, cancellationDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionCancelBody{cancelOption=$cancelOption, cancellationDate=$cancellationDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var body: SubscriptionCancelBody.Builder = SubscriptionCancelBody.builder()
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

        /** Determines the timing of subscription cancellation */
        fun cancelOption(cancelOption: JsonField<CancelOption>) = apply {
            body.cancelOption(cancelOption)
        }

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        fun cancellationDate(cancellationDate: OffsetDateTime?) = apply {
            body.cancellationDate(cancellationDate)
        }

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
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

        fun build(): SubscriptionCancelParams =
            SubscriptionCancelParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class CancelOption
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val END_OF_SUBSCRIPTION_TERM = of("end_of_subscription_term")

            val IMMEDIATE = of("immediate")

            val REQUESTED_DATE = of("requested_date")

            fun of(value: String) = CancelOption(JsonField.of(value))
        }

        enum class Known {
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            REQUESTED_DATE,
        }

        enum class Value {
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            REQUESTED_DATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                END_OF_SUBSCRIPTION_TERM -> Value.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Value.IMMEDIATE
                REQUESTED_DATE -> Value.REQUESTED_DATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                END_OF_SUBSCRIPTION_TERM -> Known.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Known.IMMEDIATE
                REQUESTED_DATE -> Known.REQUESTED_DATE
                else -> throw OrbInvalidDataException("Unknown CancelOption: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
