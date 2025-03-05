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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PaymentAttemptModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_provider")
    @ExcludeMissing
    private val paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    private val paymentProviderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("succeeded")
    @ExcludeMissing
    private val succeeded: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The ID of the payment attempt. */
    fun id(): String = id.getRequired("id")

    /** The amount of the payment attempt. */
    fun amount(): String = amount.getRequired("amount")

    /** The time at which the payment attempt was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The payment provider that attempted to collect the payment. */
    fun paymentProvider(): PaymentProvider? = paymentProvider.getNullable("payment_provider")

    /** The ID of the payment attempt in the payment provider. */
    fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

    /** Whether the payment attempt succeeded. */
    fun succeeded(): Boolean = succeeded.getRequired("succeeded")

    /** The ID of the payment attempt. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The amount of the payment attempt. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /** The time at which the payment attempt was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The payment provider that attempted to collect the payment. */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

    /** The ID of the payment attempt in the payment provider. */
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    fun _paymentProviderId(): JsonField<String> = paymentProviderId

    /** Whether the payment attempt succeeded. */
    @JsonProperty("succeeded") @ExcludeMissing fun _succeeded(): JsonField<Boolean> = succeeded

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentAttemptModel = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        createdAt()
        paymentProvider()
        paymentProviderId()
        succeeded()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentAttemptModel].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .createdAt()
         * .paymentProvider()
         * .paymentProviderId()
         * .succeeded()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentAttemptModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var paymentProvider: JsonField<PaymentProvider>? = null
        private var paymentProviderId: JsonField<String>? = null
        private var succeeded: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentAttemptModel: PaymentAttemptModel) = apply {
            id = paymentAttemptModel.id
            amount = paymentAttemptModel.amount
            createdAt = paymentAttemptModel.createdAt
            paymentProvider = paymentAttemptModel.paymentProvider
            paymentProviderId = paymentAttemptModel.paymentProviderId
            succeeded = paymentAttemptModel.succeeded
            additionalProperties = paymentAttemptModel.additionalProperties.toMutableMap()
        }

        /** The ID of the payment attempt. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ID of the payment attempt. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The amount of the payment attempt. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The amount of the payment attempt. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The time at which the payment attempt was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The time at which the payment attempt was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The payment provider that attempted to collect the payment. */
        fun paymentProvider(paymentProvider: PaymentProvider?) =
            paymentProvider(JsonField.ofNullable(paymentProvider))

        /** The payment provider that attempted to collect the payment. */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        /** The ID of the payment attempt in the payment provider. */
        fun paymentProviderId(paymentProviderId: String?) =
            paymentProviderId(JsonField.ofNullable(paymentProviderId))

        /** The ID of the payment attempt in the payment provider. */
        fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
            this.paymentProviderId = paymentProviderId
        }

        /** Whether the payment attempt succeeded. */
        fun succeeded(succeeded: Boolean) = succeeded(JsonField.of(succeeded))

        /** Whether the payment attempt succeeded. */
        fun succeeded(succeeded: JsonField<Boolean>) = apply { this.succeeded = succeeded }

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

        fun build(): PaymentAttemptModel =
            PaymentAttemptModel(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("paymentProvider", paymentProvider),
                checkRequired("paymentProviderId", paymentProviderId),
                checkRequired("succeeded", succeeded),
                additionalProperties.toImmutable(),
            )
    }

    /** The payment provider that attempted to collect the payment. */
    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val STRIPE = of("stripe")

            fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        /** An enum containing [PaymentProvider]'s known values. */
        enum class Known {
            STRIPE
        }

        /**
         * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRIPE,
            /**
             * An enum member indicating that [PaymentProvider] was instantiated with an unknown
             * value.
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
                STRIPE -> Value.STRIPE
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
                STRIPE -> Known.STRIPE
                else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
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

            return /* spotless:off */ other is PaymentProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentAttemptModel && id == other.id && amount == other.amount && createdAt == other.createdAt && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && succeeded == other.succeeded && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, paymentProvider, paymentProviderId, succeeded, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentAttemptModel{id=$id, amount=$amount, createdAt=$createdAt, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, succeeded=$succeeded, additionalProperties=$additionalProperties}"
}
