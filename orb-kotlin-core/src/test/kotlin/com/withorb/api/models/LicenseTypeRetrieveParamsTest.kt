// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeRetrieveParamsTest {

    @Test
    fun create() {
        LicenseTypeRetrieveParams.builder().licenseTypeId("license_type_id").build()
    }

    @Test
    fun pathParams() {
        val params = LicenseTypeRetrieveParams.builder().licenseTypeId("license_type_id").build()

        assertThat(params._pathParam(0)).isEqualTo("license_type_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
