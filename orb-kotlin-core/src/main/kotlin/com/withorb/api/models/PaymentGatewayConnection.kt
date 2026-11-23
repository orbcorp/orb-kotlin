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

/**
 * A payment gateway connection is one Stripe account or one Adyen merchant account that a billing
 * entity collects payments through.
 */
class PaymentGatewayConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billingEntityId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val externalAccountId: JsonField<String>,
    private val isDefault: JsonField<Boolean>,
    private val providerType: JsonField<ProviderType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_entity_id")
        @ExcludeMissing
        billingEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        providerType: JsonField<ProviderType> = JsonMissing.of(),
    ) : this(
        id,
        billingEntityId,
        createdAt,
        externalAccountId,
        isDefault,
        providerType,
        mutableMapOf(),
    )

    /**
     * The Orb-assigned unique identifier for the payment gateway connection.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the billing entity that collects payments through this connection.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingEntityId(): String = billingEntityId.getRequired("billing_entity_id")

    /**
     * The time the connection was created.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ID of the account in the external payment provider.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /**
     * Whether this is the billing entity's default payment gateway connection.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("is_default")

    /**
     * The external payment provider of this connection.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerType(): ProviderType = providerType.getRequired("provider_type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billingEntityId].
     *
     * Unlike [billingEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_entity_id")
    @ExcludeMissing
    fun _billingEntityId(): JsonField<String> = billingEntityId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [providerType].
     *
     * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<ProviderType> = providerType

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
         * Returns a mutable builder for constructing an instance of [PaymentGatewayConnection].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .billingEntityId()
         * .createdAt()
         * .externalAccountId()
         * .isDefault()
         * .providerType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentGatewayConnection]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billingEntityId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var externalAccountId: JsonField<String>? = null
        private var isDefault: JsonField<Boolean>? = null
        private var providerType: JsonField<ProviderType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentGatewayConnection: PaymentGatewayConnection) = apply {
            id = paymentGatewayConnection.id
            billingEntityId = paymentGatewayConnection.billingEntityId
            createdAt = paymentGatewayConnection.createdAt
            externalAccountId = paymentGatewayConnection.externalAccountId
            isDefault = paymentGatewayConnection.isDefault
            providerType = paymentGatewayConnection.providerType
            additionalProperties = paymentGatewayConnection.additionalProperties.toMutableMap()
        }

        /** The Orb-assigned unique identifier for the payment gateway connection. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ID of the billing entity that collects payments through this connection. */
        fun billingEntityId(billingEntityId: String) =
            billingEntityId(JsonField.of(billingEntityId))

        /**
         * Sets [Builder.billingEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingEntityId(billingEntityId: JsonField<String>) = apply {
            this.billingEntityId = billingEntityId
        }

        /** The time the connection was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the account in the external payment provider. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** Whether this is the billing entity's default payment gateway connection. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** The external payment provider of this connection. */
        fun providerType(providerType: ProviderType) = providerType(JsonField.of(providerType))

        /**
         * Sets [Builder.providerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerType] with a well-typed [ProviderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerType(providerType: JsonField<ProviderType>) = apply {
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
         * Returns an immutable instance of [PaymentGatewayConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .billingEntityId()
         * .createdAt()
         * .externalAccountId()
         * .isDefault()
         * .providerType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentGatewayConnection =
            PaymentGatewayConnection(
                checkRequired("id", id),
                checkRequired("billingEntityId", billingEntityId),
                checkRequired("createdAt", createdAt),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("isDefault", isDefault),
                checkRequired("providerType", providerType),
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
    fun validate(): PaymentGatewayConnection = apply {
        if (validated) {
            return@apply
        }

        id()
        billingEntityId()
        createdAt()
        externalAccountId()
        isDefault()
        providerType().validate()
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
            (if (billingEntityId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (externalAccountId.asKnown() == null) 0 else 1) +
            (if (isDefault.asKnown() == null) 0 else 1) +
            (providerType.asKnown()?.validity() ?: 0)

    /** The external payment provider of this connection. */
    class ProviderType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ADYEN = of("adyen")

            fun of(value: String) = ProviderType(JsonField.of(value))
        }

        /** An enum containing [ProviderType]'s known values. */
        enum class Known {
            STRIPE,
            ADYEN,
        }

        /**
         * An enum containing [ProviderType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProviderType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRIPE,
            ADYEN,
            /**
             * An enum member indicating that [ProviderType] was instantiated with an unknown value.
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
                ADYEN -> Value.ADYEN
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
                ADYEN -> Known.ADYEN
                else -> throw OrbInvalidDataException("Unknown ProviderType: $value")
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
        fun validate(): ProviderType = apply {
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

            return other is ProviderType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentGatewayConnection &&
            id == other.id &&
            billingEntityId == other.billingEntityId &&
            createdAt == other.createdAt &&
            externalAccountId == other.externalAccountId &&
            isDefault == other.isDefault &&
            providerType == other.providerType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            billingEntityId,
            createdAt,
            externalAccountId,
            isDefault,
            providerType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentGatewayConnection{id=$id, billingEntityId=$billingEntityId, createdAt=$createdAt, externalAccountId=$externalAccountId, isDefault=$isDefault, providerType=$providerType, additionalProperties=$additionalProperties}"
}
