// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseUsageGetAllUsageParamsTest {

    @Test
    fun create() {
        LicenseUsageGetAllUsageParams.builder()
            .licenseTypeId("license_type_id")
            .subscriptionId("subscription_id")
            .cursor("cursor")
            .endDate(LocalDate.parse("2019-12-27"))
            .addGroupBy("string")
            .limit(1L)
            .startDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LicenseUsageGetAllUsageParams.builder()
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
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
                    .put("license_type_id", "license_type_id")
                    .put("subscription_id", "subscription_id")
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
        val params =
            LicenseUsageGetAllUsageParams.builder()
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("license_type_id", "license_type_id")
                    .put("subscription_id", "subscription_id")
                    .build()
            )
    }
}
