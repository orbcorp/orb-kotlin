// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseUsageGetUsageParamsTest {

    @Test
    fun create() {
        LicenseUsageGetUsageParams.builder()
            .licenseId("license_id")
            .cursor("cursor")
            .endDate(LocalDate.parse("2019-12-27"))
            .addGroupBy("string")
            .limit(1L)
            .startDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = LicenseUsageGetUsageParams.builder().licenseId("license_id").build()

        assertThat(params._pathParam(0)).isEqualTo("license_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LicenseUsageGetUsageParams.builder()
                .licenseId("license_id")
                .cursor("cursor")
                .endDate(LocalDate.parse("2019-12-27"))
                .addGroupBy("string")
                .limit(1L)
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("end_date", "2019-12-27")
                    .put("group_by[]", "string")
                    .put("limit", "1")
                    .put("start_date", "2019-12-27")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LicenseUsageGetUsageParams.builder().licenseId("license_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
