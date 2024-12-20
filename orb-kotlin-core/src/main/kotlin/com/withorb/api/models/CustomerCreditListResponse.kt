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
    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("maximum_initial_balance")
    @ExcludeMissing
    private val maximumInitialBalance: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun balance(): Double = balance.getRequired("balance")

    fun effectiveDate(): OffsetDateTime? = effectiveDate.getNullable("effective_date")

    fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

    fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

    fun status(): Status = status.getRequired("status")

    fun maximumInitialBalance(): Double? =
        maximumInitialBalance.getNullable("maximum_initial_balance")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    @JsonProperty("expiry_date") @ExcludeMissing fun _expiryDate() = expiryDate

    @JsonProperty("per_unit_cost_basis") @ExcludeMissing fun _perUnitCostBasis() = perUnitCostBasis

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("maximum_initial_balance")
    @ExcludeMissing
    fun _maximumInitialBalance() = maximumInitialBalance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerCreditListResponse = apply {
        if (!validated) {
            id()
            balance()
            effectiveDate()
            expiryDate()
            perUnitCostBasis()
            status()
            maximumInitialBalance()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Double> = JsonMissing.of()
        private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var maximumInitialBalance: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerCreditListResponse: CustomerCreditListResponse) = apply {
            id = customerCreditListResponse.id
            balance = customerCreditListResponse.balance
            effectiveDate = customerCreditListResponse.effectiveDate
            expiryDate = customerCreditListResponse.expiryDate
            perUnitCostBasis = customerCreditListResponse.perUnitCostBasis
            status = customerCreditListResponse.status
            maximumInitialBalance = customerCreditListResponse.maximumInitialBalance
            additionalProperties = customerCreditListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun balance(balance: Double) = balance(JsonField.of(balance))

        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        fun effectiveDate(effectiveDate: OffsetDateTime) =
            effectiveDate(JsonField.of(effectiveDate))

        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun perUnitCostBasis(perUnitCostBasis: String) =
            perUnitCostBasis(JsonField.of(perUnitCostBasis))

        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun maximumInitialBalance(maximumInitialBalance: Double) =
            maximumInitialBalance(JsonField.of(maximumInitialBalance))

        fun maximumInitialBalance(maximumInitialBalance: JsonField<Double>) = apply {
            this.maximumInitialBalance = maximumInitialBalance
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

        fun build(): CustomerCreditListResponse =
            CustomerCreditListResponse(
                id,
                balance,
                effectiveDate,
                expiryDate,
                perUnitCostBasis,
                status,
                maximumInitialBalance,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val PENDING_PAYMENT = of("pending_payment")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            PENDING_PAYMENT,
        }

        enum class Value {
            ACTIVE,
            PENDING_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                PENDING_PAYMENT -> Value.PENDING_PAYMENT
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is CustomerCreditListResponse && id == other.id && balance == other.balance && effectiveDate == other.effectiveDate && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && status == other.status && maximumInitialBalance == other.maximumInitialBalance && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, balance, effectiveDate, expiryDate, perUnitCostBasis, status, maximumInitialBalance, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCreditListResponse{id=$id, balance=$balance, effectiveDate=$effectiveDate, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, status=$status, maximumInitialBalance=$maximumInitialBalance, additionalProperties=$additionalProperties}"
}
