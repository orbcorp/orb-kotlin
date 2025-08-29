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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class NewAccountingSyncConfiguration
private constructor(
    private val accountingProviders: JsonField<List<AccountingProviderConfig>>,
    private val excluded: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accounting_providers")
        @ExcludeMissing
        accountingProviders: JsonField<List<AccountingProviderConfig>> = JsonMissing.of(),
        @JsonProperty("excluded") @ExcludeMissing excluded: JsonField<Boolean> = JsonMissing.of(),
    ) : this(accountingProviders, excluded, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountingProviders(): List<AccountingProviderConfig>? =
        accountingProviders.getNullable("accounting_providers")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun excluded(): Boolean? = excluded.getNullable("excluded")

    /**
     * Returns the raw JSON value of [accountingProviders].
     *
     * Unlike [accountingProviders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accounting_providers")
    @ExcludeMissing
    fun _accountingProviders(): JsonField<List<AccountingProviderConfig>> = accountingProviders

    /**
     * Returns the raw JSON value of [excluded].
     *
     * Unlike [excluded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("excluded") @ExcludeMissing fun _excluded(): JsonField<Boolean> = excluded

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
         * [NewAccountingSyncConfiguration].
         */
        fun builder() = Builder()
    }

    /** A builder for [NewAccountingSyncConfiguration]. */
    class Builder internal constructor() {

        private var accountingProviders: JsonField<MutableList<AccountingProviderConfig>>? = null
        private var excluded: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newAccountingSyncConfiguration: NewAccountingSyncConfiguration) = apply {
            accountingProviders =
                newAccountingSyncConfiguration.accountingProviders.map { it.toMutableList() }
            excluded = newAccountingSyncConfiguration.excluded
            additionalProperties =
                newAccountingSyncConfiguration.additionalProperties.toMutableMap()
        }

        fun accountingProviders(accountingProviders: List<AccountingProviderConfig>?) =
            accountingProviders(JsonField.ofNullable(accountingProviders))

        /**
         * Sets [Builder.accountingProviders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProviders] with a well-typed
         * `List<AccountingProviderConfig>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountingProviders(accountingProviders: JsonField<List<AccountingProviderConfig>>) =
            apply {
                this.accountingProviders = accountingProviders.map { it.toMutableList() }
            }

        /**
         * Adds a single [AccountingProviderConfig] to [accountingProviders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountingProvider(accountingProvider: AccountingProviderConfig) = apply {
            accountingProviders =
                (accountingProviders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountingProviders", it).add(accountingProvider)
                }
        }

        fun excluded(excluded: Boolean?) = excluded(JsonField.ofNullable(excluded))

        /**
         * Alias for [Builder.excluded].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excluded(excluded: Boolean) = excluded(excluded as Boolean?)

        /**
         * Sets [Builder.excluded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excluded] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun excluded(excluded: JsonField<Boolean>) = apply { this.excluded = excluded }

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
         * Returns an immutable instance of [NewAccountingSyncConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NewAccountingSyncConfiguration =
            NewAccountingSyncConfiguration(
                (accountingProviders ?: JsonMissing.of()).map { it.toImmutable() },
                excluded,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewAccountingSyncConfiguration = apply {
        if (validated) {
            return@apply
        }

        accountingProviders()?.forEach { it.validate() }
        excluded()
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
        (accountingProviders.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (excluded.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewAccountingSyncConfiguration &&
            accountingProviders == other.accountingProviders &&
            excluded == other.excluded &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountingProviders, excluded, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewAccountingSyncConfiguration{accountingProviders=$accountingProviders, excluded=$excluded, additionalProperties=$additionalProperties}"
}
