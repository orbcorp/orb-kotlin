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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class NewAccountingSyncConfigurationModel
@JsonCreator
private constructor(
    @JsonProperty("accounting_providers")
    @ExcludeMissing
    private val accountingProviders: JsonField<List<AccountingProvider>> = JsonMissing.of(),
    @JsonProperty("excluded")
    @ExcludeMissing
    private val excluded: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun accountingProviders(): List<AccountingProvider>? =
        accountingProviders.getNullable("accounting_providers")

    fun excluded(): Boolean? = excluded.getNullable("excluded")

    @JsonProperty("accounting_providers")
    @ExcludeMissing
    fun _accountingProviders(): JsonField<List<AccountingProvider>> = accountingProviders

    @JsonProperty("excluded") @ExcludeMissing fun _excluded(): JsonField<Boolean> = excluded

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NewAccountingSyncConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        accountingProviders()?.forEach { it.validate() }
        excluded()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NewAccountingSyncConfigurationModel].
         */
        fun builder() = Builder()
    }

    /** A builder for [NewAccountingSyncConfigurationModel]. */
    class Builder internal constructor() {

        private var accountingProviders: JsonField<MutableList<AccountingProvider>>? = null
        private var excluded: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            newAccountingSyncConfigurationModel: NewAccountingSyncConfigurationModel
        ) = apply {
            accountingProviders =
                newAccountingSyncConfigurationModel.accountingProviders.map { it.toMutableList() }
            excluded = newAccountingSyncConfigurationModel.excluded
            additionalProperties =
                newAccountingSyncConfigurationModel.additionalProperties.toMutableMap()
        }

        fun accountingProviders(accountingProviders: List<AccountingProvider>?) =
            accountingProviders(JsonField.ofNullable(accountingProviders))

        fun accountingProviders(accountingProviders: JsonField<List<AccountingProvider>>) = apply {
            this.accountingProviders = accountingProviders.map { it.toMutableList() }
        }

        fun addAccountingProvider(accountingProvider: AccountingProvider) = apply {
            accountingProviders =
                (accountingProviders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountingProviders", it).add(accountingProvider)
                }
        }

        fun excluded(excluded: Boolean?) = excluded(JsonField.ofNullable(excluded))

        fun excluded(excluded: Boolean) = excluded(excluded as Boolean?)

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

        fun build(): NewAccountingSyncConfigurationModel =
            NewAccountingSyncConfigurationModel(
                (accountingProviders ?: JsonMissing.of()).map { it.toImmutable() },
                excluded,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AccountingProvider
    @JsonCreator
    private constructor(
        @JsonProperty("external_provider_id")
        @ExcludeMissing
        private val externalProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        private val providerType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun externalProviderId(): String = externalProviderId.getRequired("external_provider_id")

        fun providerType(): String = providerType.getRequired("provider_type")

        @JsonProperty("external_provider_id")
        @ExcludeMissing
        fun _externalProviderId(): JsonField<String> = externalProviderId

        @JsonProperty("provider_type")
        @ExcludeMissing
        fun _providerType(): JsonField<String> = providerType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountingProvider = apply {
            if (validated) {
                return@apply
            }

            externalProviderId()
            providerType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AccountingProvider].
             *
             * The following fields are required:
             * ```kotlin
             * .externalProviderId()
             * .providerType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountingProvider]. */
        class Builder internal constructor() {

            private var externalProviderId: JsonField<String>? = null
            private var providerType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountingProvider: AccountingProvider) = apply {
                externalProviderId = accountingProvider.externalProviderId
                providerType = accountingProvider.providerType
                additionalProperties = accountingProvider.additionalProperties.toMutableMap()
            }

            fun externalProviderId(externalProviderId: String) =
                externalProviderId(JsonField.of(externalProviderId))

            fun externalProviderId(externalProviderId: JsonField<String>) = apply {
                this.externalProviderId = externalProviderId
            }

            fun providerType(providerType: String) = providerType(JsonField.of(providerType))

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

            fun build(): AccountingProvider =
                AccountingProvider(
                    checkRequired("externalProviderId", externalProviderId),
                    checkRequired("providerType", providerType),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountingProvider && externalProviderId == other.externalProviderId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalProviderId, providerType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountingProvider{externalProviderId=$externalProviderId, providerType=$providerType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewAccountingSyncConfigurationModel && accountingProviders == other.accountingProviders && excluded == other.excluded && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountingProviders, excluded, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewAccountingSyncConfigurationModel{accountingProviders=$accountingProviders, excluded=$excluded, additionalProperties=$additionalProperties}"
}
