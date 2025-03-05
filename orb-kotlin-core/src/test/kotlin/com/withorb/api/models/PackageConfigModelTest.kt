// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PackageConfigModelTest {

    @Test
    fun createPackageConfigModel() {
        val packageConfigModel =
            PackageConfigModel.builder().packageAmount("package_amount").packageSize(0L).build()
        assertThat(packageConfigModel).isNotNull
        assertThat(packageConfigModel.packageAmount()).isEqualTo("package_amount")
        assertThat(packageConfigModel.packageSize()).isEqualTo(0L)
    }
}
