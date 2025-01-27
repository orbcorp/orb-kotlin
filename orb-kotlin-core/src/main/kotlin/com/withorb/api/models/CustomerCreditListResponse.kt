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
class CustomerCreditListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expiry_date")
    @ExcludeMissing
    private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("maximum_initial_balance")
    @ExcludeMissing
    private val maximumInitialBalance: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun balance(): Double = balance.getRequired("balance")

    fun effectiveDate(): OffsetDateTime? = effectiveDate.getNullable("effective_date")

    fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

    fun maximumInitialBalance(): Double? =
        maximumInitialBalance.getNullable("maximum_initial_balance")

    fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

    fun status(): Status = status.getRequired("status")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

    @JsonProperty("maximum_initial_balance")
    @ExcludeMissing
    fun _maximumInitialBalance(): JsonField<Double> = maximumInitialBalance

    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerCreditListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        balance()
        effectiveDate()
        expiryDate()
        maximumInitialBalance()
        perUnitCostBasis()
        status()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [CustomerCreditListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var balance: JsonField<Double>? = null
        private var effectiveDate: JsonField<OffsetDateTime>? = null
        private var expiryDate: JsonField<OffsetDateTime>? = null
        private var maximumInitialBalance: JsonField<Double>? = null
        private var perUnitCostBasis: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerCreditListResponse: CustomerCreditListResponse) = apply {
            id = customerCreditListResponse.id
            balance = customerCreditListResponse.balance
            effectiveDate = customerCreditListResponse.effectiveDate
            expiryDate = customerCreditListResponse.expiryDate
            maximumInitialBalance = customerCreditListResponse.maximumInitialBalance
            perUnitCostBasis = customerCreditListResponse.perUnitCostBasis
            status = customerCreditListResponse.status
            additionalProperties = customerCreditListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun balance(balance: Double) = balance(JsonField.of(balance))

        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        fun effectiveDate(effectiveDate: OffsetDateTime?) =
            effectiveDate(JsonField.ofNullable(effectiveDate))

        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        fun expiryDate(expiryDate: OffsetDateTime?) = expiryDate(JsonField.ofNullable(expiryDate))

        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun maximumInitialBalance(maximumInitialBalance: Double?) =
            maximumInitialBalance(JsonField.ofNullable(maximumInitialBalance))

        fun maximumInitialBalance(maximumInitialBalance: Double) =
            maximumInitialBalance(maximumInitialBalance as Double?)

        fun maximumInitialBalance(maximumInitialBalance: JsonField<Double>) = apply {
            this.maximumInitialBalance = maximumInitialBalance
        }

        fun perUnitCostBasis(perUnitCostBasis: String?) =
            perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): CustomerCreditListResponse =
            CustomerCreditListResponse(
                checkRequired("id", id),
                checkRequired("balance", balance),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("expiryDate", expiryDate),
                checkRequired("maximumInitialBalance", maximumInitialBalance),
                checkRequired("perUnitCostBasis", perUnitCostBasis),
                checkRequired("status", status),
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val ACTIVE = of("active")

            val PENDING_PAYMENT = of("pending_payment")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            PENDING_PAYMENT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            PENDING_PAYMENT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                PENDING_PAYMENT -> Value.PENDING_PAYMENT
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
                ACTIVE -> Known.ACTIVE
                PENDING_PAYMENT -> Known.PENDING_PAYMENT
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListResponse && id == other.id && balance == other.balance && effectiveDate == other.effectiveDate && expiryDate == other.expiryDate && maximumInitialBalance == other.maximumInitialBalance && perUnitCostBasis == other.perUnitCostBasis && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, balance, effectiveDate, expiryDate, maximumInitialBalance, perUnitCostBasis, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCreditListResponse{id=$id, balance=$balance, effectiveDate=$effectiveDate, expiryDate=$expiryDate, maximumInitialBalance=$maximumInitialBalance, perUnitCostBasis=$perUnitCostBasis, status=$status, additionalProperties=$additionalProperties}"
}
