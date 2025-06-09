// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewAccountingSyncConfigurationTest {

    @Test
    fun create() {
        val newAccountingSyncConfiguration =
            NewAccountingSyncConfiguration.builder()
                .addAccountingProvider(
                    AccountingProviderConfig.builder()
                        .externalProviderId("external_provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .excluded(true)
                .build()

        assertThat(newAccountingSyncConfiguration.accountingProviders())
            .containsExactly(
                AccountingProviderConfig.builder()
                    .externalProviderId("external_provider_id")
                    .providerType("provider_type")
                    .build()
            )
        assertThat(newAccountingSyncConfiguration.excluded()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newAccountingSyncConfiguration =
            NewAccountingSyncConfiguration.builder()
                .addAccountingProvider(
                    AccountingProviderConfig.builder()
                        .externalProviderId("external_provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .excluded(true)
                .build()

        val roundtrippedNewAccountingSyncConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newAccountingSyncConfiguration),
                jacksonTypeRef<NewAccountingSyncConfiguration>(),
            )

        assertThat(roundtrippedNewAccountingSyncConfiguration)
            .isEqualTo(newAccountingSyncConfiguration)
    }
}
