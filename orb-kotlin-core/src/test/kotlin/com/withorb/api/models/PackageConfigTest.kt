// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PackageConfigTest {

    @Test
    fun create() {
        val packageConfig =
            PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()

        assertThat(packageConfig.packageAmount()).isEqualTo("package_amount")
        assertThat(packageConfig.packageSize()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val packageConfig =
            PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()

        val roundtrippedPackageConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(packageConfig),
                jacksonTypeRef<PackageConfig>(),
            )

        assertThat(roundtrippedPackageConfig).isEqualTo(packageConfig)
    }
}
