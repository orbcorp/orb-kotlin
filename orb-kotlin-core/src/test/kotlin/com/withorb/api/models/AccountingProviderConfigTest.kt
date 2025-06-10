// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountingProviderConfigTest {

    @Test
    fun create() {
        val accountingProviderConfig =
            AccountingProviderConfig.builder()
                .externalProviderId("external_provider_id")
                .providerType("provider_type")
                .build()

        assertThat(accountingProviderConfig.externalProviderId()).isEqualTo("external_provider_id")
        assertThat(accountingProviderConfig.providerType()).isEqualTo("provider_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountingProviderConfig =
            AccountingProviderConfig.builder()
                .externalProviderId("external_provider_id")
                .providerType("provider_type")
                .build()

        val roundtrippedAccountingProviderConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountingProviderConfig),
                jacksonTypeRef<AccountingProviderConfig>(),
            )

        assertThat(roundtrippedAccountingProviderConfig).isEqualTo(accountingProviderConfig)
    }
}
