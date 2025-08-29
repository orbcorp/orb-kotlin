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
import java.util.Collections
import java.util.Objects

class TopUpInvoiceSettings
private constructor(
    private val autoCollection: JsonField<Boolean>,
    private val netTerms: JsonField<Long>,
    private val memo: JsonField<String>,
    private val requireSuccessfulPayment: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("require_successful_payment")
        @ExcludeMissing
        requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of(),
    ) : this(autoCollection, netTerms, memo, requireSuccessfulPayment, mutableMapOf())

    /**
     * Whether the credits purchase invoice should auto collect with the customer's saved payment
     * method.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

    /**
     * The net terms determines the difference between the invoice date and the issue date for the
     * invoice. If you intend the invoice to be due on issue, set this to 0.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    /**
     * An optional memo to display on the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun memo(): String? = memo.getNullable("memo")

    /**
     * When true, credit blocks created by this top-up will require that the corresponding invoice
     * is paid before they are drawn down from. If any topup block is pending payment, further
     * automatic top-ups will be paused until the invoice is paid or voided.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requireSuccessfulPayment(): Boolean? =
        requireSuccessfulPayment.getNullable("require_successful_payment")

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [requireSuccessfulPayment].
     *
     * Unlike [requireSuccessfulPayment], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("require_successful_payment")
    @ExcludeMissing
    fun _requireSuccessfulPayment(): JsonField<Boolean> = requireSuccessfulPayment

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
         * Returns a mutable builder for constructing an instance of [TopUpInvoiceSettings].
         *
         * The following fields are required:
         * ```kotlin
         * .autoCollection()
         * .netTerms()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TopUpInvoiceSettings]. */
    class Builder internal constructor() {

        private var autoCollection: JsonField<Boolean>? = null
        private var netTerms: JsonField<Long>? = null
        private var memo: JsonField<String> = JsonMissing.of()
        private var requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(topUpInvoiceSettings: TopUpInvoiceSettings) = apply {
            autoCollection = topUpInvoiceSettings.autoCollection
            netTerms = topUpInvoiceSettings.netTerms
            memo = topUpInvoiceSettings.memo
            requireSuccessfulPayment = topUpInvoiceSettings.requireSuccessfulPayment
            additionalProperties = topUpInvoiceSettings.additionalProperties.toMutableMap()
        }

        /**
         * Whether the credits purchase invoice should auto collect with the customer's saved
         * payment method.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0.
         */
        fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

        /**
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /** An optional memo to display on the invoice. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * When true, credit blocks created by this top-up will require that the corresponding
         * invoice is paid before they are drawn down from. If any topup block is pending payment,
         * further automatic top-ups will be paused until the invoice is paid or voided.
         */
        fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) =
            requireSuccessfulPayment(JsonField.of(requireSuccessfulPayment))

        /**
         * Sets [Builder.requireSuccessfulPayment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requireSuccessfulPayment] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requireSuccessfulPayment(requireSuccessfulPayment: JsonField<Boolean>) = apply {
            this.requireSuccessfulPayment = requireSuccessfulPayment
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
         * Returns an immutable instance of [TopUpInvoiceSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .autoCollection()
         * .netTerms()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopUpInvoiceSettings =
            TopUpInvoiceSettings(
                checkRequired("autoCollection", autoCollection),
                checkRequired("netTerms", netTerms),
                memo,
                requireSuccessfulPayment,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TopUpInvoiceSettings = apply {
        if (validated) {
            return@apply
        }

        autoCollection()
        netTerms()
        memo()
        requireSuccessfulPayment()
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
        (if (autoCollection.asKnown() == null) 0 else 1) +
            (if (netTerms.asKnown() == null) 0 else 1) +
            (if (memo.asKnown() == null) 0 else 1) +
            (if (requireSuccessfulPayment.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopUpInvoiceSettings &&
            autoCollection == other.autoCollection &&
            netTerms == other.netTerms &&
            memo == other.memo &&
            requireSuccessfulPayment == other.requireSuccessfulPayment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(autoCollection, netTerms, memo, requireSuccessfulPayment, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopUpInvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"
}
