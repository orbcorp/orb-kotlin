// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NewAccountingSyncConfigurationModelTest {

    @Test
    fun createNewAccountingSyncConfigurationModel() {
        val newAccountingSyncConfigurationModel =
            NewAccountingSyncConfigurationModel.builder()
                .addAccountingProvider(
                    NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                        .externalProviderId("external_provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .excluded(true)
                .build()
        assertThat(newAccountingSyncConfigurationModel).isNotNull
        assertThat(newAccountingSyncConfigurationModel.accountingProviders())
            .containsExactly(
                NewAccountingSyncConfigurationModel.AccountingProvider.builder()
                    .externalProviderId("external_provider_id")
                    .providerType("provider_type")
                    .build()
            )
        assertThat(newAccountingSyncConfigurationModel.excluded()).isEqualTo(true)
    }
}
