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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a payment method is deleted. */
class PaymentMethodDeletedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val paymentMethod: JsonField<PaymentMethod>,
    private val properties: JsonValue,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
        @JsonProperty("properties") @ExcludeMissing properties: JsonValue = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, createdAt, paymentMethod, properties, type, mutableMapOf())

    /**
     * The ID of this webhook event.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time at which this event was created, to the second.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A payment method represents a customer's stored payment instrument held with an external
     * payment provider (such as Adyen or Stripe).
     *
     * The serialization is intentionally minimal for now; provider-pulled details (e.g. card
     * display metadata) will be added over time.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentMethod(): PaymentMethod = paymentMethod.getRequired("payment_method")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = paymentMethodDeletedWebhookEvent.properties().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("properties") @ExcludeMissing fun _properties(): JsonValue = properties

    /**
     * The event this payload describes.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [PaymentMethodDeletedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .paymentMethod()
         * .properties()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentMethodDeletedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var paymentMethod: JsonField<PaymentMethod>? = null
        private var properties: JsonValue? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentMethodDeletedWebhookEvent: PaymentMethodDeletedWebhookEvent) =
            apply {
                id = paymentMethodDeletedWebhookEvent.id
                createdAt = paymentMethodDeletedWebhookEvent.createdAt
                paymentMethod = paymentMethodDeletedWebhookEvent.paymentMethod
                properties = paymentMethodDeletedWebhookEvent.properties
                type = paymentMethodDeletedWebhookEvent.type
                additionalProperties =
                    paymentMethodDeletedWebhookEvent.additionalProperties.toMutableMap()
            }

        /** The ID of this webhook event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time at which this event was created, to the second. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * A payment method represents a customer's stored payment instrument held with an external
         * payment provider (such as Adyen or Stripe).
         *
         * The serialization is intentionally minimal for now; provider-pulled details (e.g. card
         * display metadata) will be added over time.
         */
        fun paymentMethod(paymentMethod: PaymentMethod) = paymentMethod(JsonField.of(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            this.paymentMethod = paymentMethod
        }

        fun properties(properties: JsonValue) = apply { this.properties = properties }

        /** The event this payload describes. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PaymentMethodDeletedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .paymentMethod()
         * .properties()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentMethodDeletedWebhookEvent =
            PaymentMethodDeletedWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("paymentMethod", paymentMethod),
                checkRequired("properties", properties),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): PaymentMethodDeletedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        paymentMethod().validate()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (paymentMethod.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    /**
     * A payment method represents a customer's stored payment instrument held with an external
     * payment provider (such as Adyen or Stripe).
     *
     * The serialization is intentionally minimal for now; provider-pulled details (e.g. card
     * display metadata) will be added over time.
     */
    class PaymentMethod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val default: JsonField<Boolean>,
        private val externalPaymentMethodId: JsonField<String>,
        private val paymentMethodType: JsonField<PaymentMethodType>,
        private val providerType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default") @ExcludeMissing default: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("external_payment_method_id")
            @ExcludeMissing
            externalPaymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_method_type")
            @ExcludeMissing
            paymentMethodType: JsonField<PaymentMethodType> = JsonMissing.of(),
            @JsonProperty("provider_type")
            @ExcludeMissing
            providerType: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            customerId,
            default,
            externalPaymentMethodId,
            paymentMethodType,
            providerType,
            mutableMapOf(),
        )

        /**
         * The Orb-assigned unique identifier for the payment method.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The time at which the payment method was created.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The ID of the Orb customer this payment method is attached to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Whether this is the customer's default payment method.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun default(): Boolean = default.getRequired("default")

        /**
         * The identifier of this payment method in the external payment provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalPaymentMethodId(): String =
            externalPaymentMethodId.getRequired("external_payment_method_id")

        /**
         * The type of the underlying payment instrument, e.g. `card` or `us_bank_account`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentMethodType(): PaymentMethodType =
            paymentMethodType.getRequired("payment_method_type")

        /**
         * The external payment provider this method belongs to, derived from the linked payment
         * gateway connection (e.g. `adyen` or `stripe`). Null if the connection has been removed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerType(): String? = providerType.getNullable("provider_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [default].
         *
         * Unlike [default], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("default") @ExcludeMissing fun _default(): JsonField<Boolean> = default

        /**
         * Returns the raw JSON value of [externalPaymentMethodId].
         *
         * Unlike [externalPaymentMethodId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_payment_method_id")
        @ExcludeMissing
        fun _externalPaymentMethodId(): JsonField<String> = externalPaymentMethodId

        /**
         * Returns the raw JSON value of [paymentMethodType].
         *
         * Unlike [paymentMethodType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method_type")
        @ExcludeMissing
        fun _paymentMethodType(): JsonField<PaymentMethodType> = paymentMethodType

        /**
         * Returns the raw JSON value of [providerType].
         *
         * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_type")
        @ExcludeMissing
        fun _providerType(): JsonField<String> = providerType

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
             * Returns a mutable builder for constructing an instance of [PaymentMethod].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .customerId()
             * .default()
             * .externalPaymentMethodId()
             * .paymentMethodType()
             * .providerType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentMethod]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String>? = null
            private var default: JsonField<Boolean>? = null
            private var externalPaymentMethodId: JsonField<String>? = null
            private var paymentMethodType: JsonField<PaymentMethodType>? = null
            private var providerType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentMethod: PaymentMethod) = apply {
                id = paymentMethod.id
                createdAt = paymentMethod.createdAt
                customerId = paymentMethod.customerId
                default = paymentMethod.default
                externalPaymentMethodId = paymentMethod.externalPaymentMethodId
                paymentMethodType = paymentMethod.paymentMethodType
                providerType = paymentMethod.providerType
                additionalProperties = paymentMethod.additionalProperties.toMutableMap()
            }

            /** The Orb-assigned unique identifier for the payment method. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The time at which the payment method was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The ID of the Orb customer this payment method is attached to. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Whether this is the customer's default payment method. */
            fun default(default: Boolean) = default(JsonField.of(default))

            /**
             * Sets [Builder.default] to an arbitrary JSON value.
             *
             * You should usually call [Builder.default] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun default(default: JsonField<Boolean>) = apply { this.default = default }

            /** The identifier of this payment method in the external payment provider. */
            fun externalPaymentMethodId(externalPaymentMethodId: String) =
                externalPaymentMethodId(JsonField.of(externalPaymentMethodId))

            /**
             * Sets [Builder.externalPaymentMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPaymentMethodId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalPaymentMethodId(externalPaymentMethodId: JsonField<String>) = apply {
                this.externalPaymentMethodId = externalPaymentMethodId
            }

            /** The type of the underlying payment instrument, e.g. `card` or `us_bank_account`. */
            fun paymentMethodType(paymentMethodType: PaymentMethodType) =
                paymentMethodType(JsonField.of(paymentMethodType))

            /**
             * Sets [Builder.paymentMethodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethodType] with a well-typed
             * [PaymentMethodType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun paymentMethodType(paymentMethodType: JsonField<PaymentMethodType>) = apply {
                this.paymentMethodType = paymentMethodType
            }

            /**
             * The external payment provider this method belongs to, derived from the linked payment
             * gateway connection (e.g. `adyen` or `stripe`). Null if the connection has been
             * removed.
             */
            fun providerType(providerType: String?) =
                providerType(JsonField.ofNullable(providerType))

            /**
             * Sets [Builder.providerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerType(providerType: JsonField<String>) = apply {
                this.providerType = providerType
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
             * Returns an immutable instance of [PaymentMethod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .customerId()
             * .default()
             * .externalPaymentMethodId()
             * .paymentMethodType()
             * .providerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentMethod =
                PaymentMethod(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customerId", customerId),
                    checkRequired("default", default),
                    checkRequired("externalPaymentMethodId", externalPaymentMethodId),
                    checkRequired("paymentMethodType", paymentMethodType),
                    checkRequired("providerType", providerType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentMethod = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            customerId()
            default()
            externalPaymentMethodId()
            paymentMethodType().validate()
            providerType()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (default.asKnown() == null) 0 else 1) +
                (if (externalPaymentMethodId.asKnown() == null) 0 else 1) +
                (paymentMethodType.asKnown()?.validity() ?: 0) +
                (if (providerType.asKnown() == null) 0 else 1)

        /** The type of the underlying payment instrument, e.g. `card` or `us_bank_account`. */
        class PaymentMethodType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CARD = of("card")

                val US_BANK_ACCOUNT = of("us_bank_account")

                val LINK = of("link")

                val AMAZON_PAY = of("amazon_pay")

                val CRYPTO = of("crypto")

                fun of(value: String) = PaymentMethodType(JsonField.of(value))
            }

            /** An enum containing [PaymentMethodType]'s known values. */
            enum class Known {
                CARD,
                US_BANK_ACCOUNT,
                LINK,
                AMAZON_PAY,
                CRYPTO,
            }

            /**
             * An enum containing [PaymentMethodType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PaymentMethodType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                US_BANK_ACCOUNT,
                LINK,
                AMAZON_PAY,
                CRYPTO,
                /**
                 * An enum member indicating that [PaymentMethodType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CARD -> Value.CARD
                    US_BANK_ACCOUNT -> Value.US_BANK_ACCOUNT
                    LINK -> Value.LINK
                    AMAZON_PAY -> Value.AMAZON_PAY
                    CRYPTO -> Value.CRYPTO
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CARD -> Known.CARD
                    US_BANK_ACCOUNT -> Known.US_BANK_ACCOUNT
                    LINK -> Known.LINK
                    AMAZON_PAY -> Known.AMAZON_PAY
                    CRYPTO -> Known.CRYPTO
                    else -> throw OrbInvalidDataException("Unknown PaymentMethodType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentMethodType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentMethodType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethod &&
                id == other.id &&
                createdAt == other.createdAt &&
                customerId == other.customerId &&
                default == other.default &&
                externalPaymentMethodId == other.externalPaymentMethodId &&
                paymentMethodType == other.paymentMethodType &&
                providerType == other.providerType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                customerId,
                default,
                externalPaymentMethodId,
                paymentMethodType,
                providerType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentMethod{id=$id, createdAt=$createdAt, customerId=$customerId, default=$default, externalPaymentMethodId=$externalPaymentMethodId, paymentMethodType=$paymentMethodType, providerType=$providerType, additionalProperties=$additionalProperties}"
    }

    /** The event this payload describes. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PAYMENT_METHOD_DELETED = of("payment_method.deleted")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PAYMENT_METHOD_DELETED
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_METHOD_DELETED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PAYMENT_METHOD_DELETED -> Value.PAYMENT_METHOD_DELETED
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
                PAYMENT_METHOD_DELETED -> Known.PAYMENT_METHOD_DELETED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentMethodDeletedWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            paymentMethod == other.paymentMethod &&
            properties == other.properties &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, paymentMethod, properties, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentMethodDeletedWebhookEvent{id=$id, createdAt=$createdAt, paymentMethod=$paymentMethod, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
