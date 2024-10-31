// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class SubscriptionCancelParams
constructor(
    private val subscriptionId: String,
    private val cancelOption: CancelOption,
    private val cancellationDate: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun cancelOption(): CancelOption = cancelOption

    fun cancellationDate(): OffsetDateTime? = cancellationDate

    internal fun getBody(): SubscriptionCancelBody {
        return SubscriptionCancelBody(
            cancelOption,
            cancellationDate,
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

    @JsonDeserialize(builder = SubscriptionCancelBody.Builder::class)
    @NoAutoDetect
    class SubscriptionCancelBody
    internal constructor(
        private val cancelOption: CancelOption?,
        private val cancellationDate: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Determines the timing of subscription cancellation */
        @JsonProperty("cancel_option") fun cancelOption(): CancelOption? = cancelOption

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        @JsonProperty("cancellation_date")
        fun cancellationDate(): OffsetDateTime? = cancellationDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cancelOption: CancelOption? = null
            private var cancellationDate: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionCancelBody: SubscriptionCancelBody) = apply {
                this.cancelOption = subscriptionCancelBody.cancelOption
                this.cancellationDate = subscriptionCancelBody.cancellationDate
                additionalProperties(subscriptionCancelBody.additionalProperties)
            }

            /** Determines the timing of subscription cancellation */
            @JsonProperty("cancel_option")
            fun cancelOption(cancelOption: CancelOption) = apply {
                this.cancelOption = cancelOption
            }

            /**
             * The date that the cancellation should take effect. This parameter can only be passed
             * if the `cancel_option` is `requested_date`.
             */
            @JsonProperty("cancellation_date")
            fun cancellationDate(cancellationDate: OffsetDateTime) = apply {
                this.cancellationDate = cancellationDate
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

            return /* spotless:off */ other is SubscriptionCancelBody && this.cancelOption == other.cancelOption && this.cancellationDate == other.cancellationDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cancelOption, cancellationDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionCancelBody{cancelOption=$cancelOption, cancellationDate=$cancellationDate, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCancelParams && this.subscriptionId == other.subscriptionId && this.cancelOption == other.cancelOption && this.cancellationDate == other.cancellationDate && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, cancelOption, cancellationDate, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionCancelParams{subscriptionId=$subscriptionId, cancelOption=$cancelOption, cancellationDate=$cancellationDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var cancelOption: CancelOption? = null
        private var cancellationDate: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionCancelParams: SubscriptionCancelParams) = apply {
            this.subscriptionId = subscriptionCancelParams.subscriptionId
            this.cancelOption = subscriptionCancelParams.cancelOption
            this.cancellationDate = subscriptionCancelParams.cancellationDate
            additionalQueryParams(subscriptionCancelParams.additionalQueryParams)
            additionalHeaders(subscriptionCancelParams.additionalHeaders)
            additionalBodyProperties(subscriptionCancelParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Determines the timing of subscription cancellation */
        fun cancelOption(cancelOption: CancelOption) = apply { this.cancelOption = cancelOption }

        /**
         * The date that the cancellation should take effect. This parameter can only be passed if
         * the `cancel_option` is `requested_date`.
         */
        fun cancellationDate(cancellationDate: OffsetDateTime) = apply {
            this.cancellationDate = cancellationDate
        }

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

        fun build(): SubscriptionCancelParams =
            SubscriptionCancelParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(cancelOption) { "`cancelOption` is required but was not set" },
                cancellationDate,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class CancelOption
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CancelOption && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val END_OF_SUBSCRIPTION_TERM = CancelOption(JsonField.of("end_of_subscription_term"))

            val IMMEDIATE = CancelOption(JsonField.of("immediate"))

            val REQUESTED_DATE = CancelOption(JsonField.of("requested_date"))

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
    }
}
