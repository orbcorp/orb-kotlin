// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CustomerCreditFetchBalanceByExternalIdResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balance: JsonField<Double>,
    private val currency: JsonField<String>,
    private val nextExpiryBalance: JsonField<Double>,
    private val nextExpiryDate: JsonField<OffsetDateTime>,
    private val pendingPaymentBalance: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_expiry_balance")
        @ExcludeMissing
        nextExpiryBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("next_expiry_date")
        @ExcludeMissing
        nextExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("pending_payment_balance")
        @ExcludeMissing
        pendingPaymentBalance: JsonField<Double> = JsonMissing.of(),
    ) : this(
        balance,
        currency,
        nextExpiryBalance,
        nextExpiryDate,
        pendingPaymentBalance,
        mutableMapOf(),
    )

    /**
     * The customer's available credit balance: the sum of `balance` across their `active` credit
     * blocks.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): Double = balance.getRequired("balance")

    /**
     * The currency or custom pricing unit the balances are denominated in. Null when no `currency`
     * is passed and the customer has no credit ledger, in which case every balance is `0`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): String? = currency.getNullable("currency")

    /**
     * The balance that expires on `next_expiry_date`. Null if `next_expiry_date` is null.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun nextExpiryBalance(): Double? = nextExpiryBalance.getNullable("next_expiry_balance")

    /**
     * The earliest `expiry_date` among active credit blocks. Null if none of them expire.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun nextExpiryDate(): OffsetDateTime? = nextExpiryDate.getNullable("next_expiry_date")

    /**
     * The total balance of credit blocks in `pending_payment` status. Not included in `balance`
     * until the invoice that funds them is paid.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingPaymentBalance(): Double =
        pendingPaymentBalance.getRequired("pending_payment_balance")

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [nextExpiryBalance].
     *
     * Unlike [nextExpiryBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("next_expiry_balance")
    @ExcludeMissing
    fun _nextExpiryBalance(): JsonField<Double> = nextExpiryBalance

    /**
     * Returns the raw JSON value of [nextExpiryDate].
     *
     * Unlike [nextExpiryDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_expiry_date")
    @ExcludeMissing
    fun _nextExpiryDate(): JsonField<OffsetDateTime> = nextExpiryDate

    /**
     * Returns the raw JSON value of [pendingPaymentBalance].
     *
     * Unlike [pendingPaymentBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_payment_balance")
    @ExcludeMissing
    fun _pendingPaymentBalance(): JsonField<Double> = pendingPaymentBalance

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
         * [CustomerCreditFetchBalanceByExternalIdResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .balance()
         * .currency()
         * .nextExpiryBalance()
         * .nextExpiryDate()
         * .pendingPaymentBalance()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreditFetchBalanceByExternalIdResponse]. */
    class Builder internal constructor() {

        private var balance: JsonField<Double>? = null
        private var currency: JsonField<String>? = null
        private var nextExpiryBalance: JsonField<Double>? = null
        private var nextExpiryDate: JsonField<OffsetDateTime>? = null
        private var pendingPaymentBalance: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerCreditFetchBalanceByExternalIdResponse:
                CustomerCreditFetchBalanceByExternalIdResponse
        ) = apply {
            balance = customerCreditFetchBalanceByExternalIdResponse.balance
            currency = customerCreditFetchBalanceByExternalIdResponse.currency
            nextExpiryBalance = customerCreditFetchBalanceByExternalIdResponse.nextExpiryBalance
            nextExpiryDate = customerCreditFetchBalanceByExternalIdResponse.nextExpiryDate
            pendingPaymentBalance =
                customerCreditFetchBalanceByExternalIdResponse.pendingPaymentBalance
            additionalProperties =
                customerCreditFetchBalanceByExternalIdResponse.additionalProperties.toMutableMap()
        }

        /**
         * The customer's available credit balance: the sum of `balance` across their `active`
         * credit blocks.
         */
        fun balance(balance: Double) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        /**
         * The currency or custom pricing unit the balances are denominated in. Null when no
         * `currency` is passed and the customer has no credit ledger, in which case every balance
         * is `0`.
         */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The balance that expires on `next_expiry_date`. Null if `next_expiry_date` is null. */
        fun nextExpiryBalance(nextExpiryBalance: Double?) =
            nextExpiryBalance(JsonField.ofNullable(nextExpiryBalance))

        /**
         * Alias for [Builder.nextExpiryBalance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun nextExpiryBalance(nextExpiryBalance: Double) =
            nextExpiryBalance(nextExpiryBalance as Double?)

        /**
         * Sets [Builder.nextExpiryBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextExpiryBalance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextExpiryBalance(nextExpiryBalance: JsonField<Double>) = apply {
            this.nextExpiryBalance = nextExpiryBalance
        }

        /** The earliest `expiry_date` among active credit blocks. Null if none of them expire. */
        fun nextExpiryDate(nextExpiryDate: OffsetDateTime?) =
            nextExpiryDate(JsonField.ofNullable(nextExpiryDate))

        /**
         * Sets [Builder.nextExpiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextExpiryDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextExpiryDate(nextExpiryDate: JsonField<OffsetDateTime>) = apply {
            this.nextExpiryDate = nextExpiryDate
        }

        /**
         * The total balance of credit blocks in `pending_payment` status. Not included in `balance`
         * until the invoice that funds them is paid.
         */
        fun pendingPaymentBalance(pendingPaymentBalance: Double) =
            pendingPaymentBalance(JsonField.of(pendingPaymentBalance))

        /**
         * Sets [Builder.pendingPaymentBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingPaymentBalance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingPaymentBalance(pendingPaymentBalance: JsonField<Double>) = apply {
            this.pendingPaymentBalance = pendingPaymentBalance
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
         * Returns an immutable instance of [CustomerCreditFetchBalanceByExternalIdResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .balance()
         * .currency()
         * .nextExpiryBalance()
         * .nextExpiryDate()
         * .pendingPaymentBalance()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreditFetchBalanceByExternalIdResponse =
            CustomerCreditFetchBalanceByExternalIdResponse(
                checkRequired("balance", balance),
                checkRequired("currency", currency),
                checkRequired("nextExpiryBalance", nextExpiryBalance),
                checkRequired("nextExpiryDate", nextExpiryDate),
                checkRequired("pendingPaymentBalance", pendingPaymentBalance),
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
    fun validate(): CustomerCreditFetchBalanceByExternalIdResponse = apply {
        if (validated) {
            return@apply
        }

        balance()
        currency()
        nextExpiryBalance()
        nextExpiryDate()
        pendingPaymentBalance()
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
        (if (balance.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (if (nextExpiryBalance.asKnown() == null) 0 else 1) +
            (if (nextExpiryDate.asKnown() == null) 0 else 1) +
            (if (pendingPaymentBalance.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditFetchBalanceByExternalIdResponse &&
            balance == other.balance &&
            currency == other.currency &&
            nextExpiryBalance == other.nextExpiryBalance &&
            nextExpiryDate == other.nextExpiryDate &&
            pendingPaymentBalance == other.pendingPaymentBalance &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            balance,
            currency,
            nextExpiryBalance,
            nextExpiryDate,
            pendingPaymentBalance,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCreditFetchBalanceByExternalIdResponse{balance=$balance, currency=$currency, nextExpiryBalance=$nextExpiryBalance, nextExpiryDate=$nextExpiryDate, pendingPaymentBalance=$pendingPaymentBalance, additionalProperties=$additionalProperties}"
}
