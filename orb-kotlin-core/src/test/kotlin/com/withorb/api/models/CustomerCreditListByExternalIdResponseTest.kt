// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreditListByExternalIdResponse

class CustomerCreditListByExternalIdResponseTest {

    @Test
    fun createCustomerCreditListByExternalIdResponse() {
      val customerCreditListByExternalIdResponse = CustomerCreditListByExternalIdResponse.builder()
          .id("id")
          .balance(42.23)
          .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .maximumInitialBalance(42.23)
          .perUnitCostBasis("per_unit_cost_basis")
          .status(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
          .build()
      assertThat(customerCreditListByExternalIdResponse).isNotNull
      assertThat(customerCreditListByExternalIdResponse.id()).isEqualTo("id")
      assertThat(customerCreditListByExternalIdResponse.balance()).isEqualTo(42.23)
      assertThat(customerCreditListByExternalIdResponse.effectiveDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(customerCreditListByExternalIdResponse.expiryDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(customerCreditListByExternalIdResponse.maximumInitialBalance()).isEqualTo(42.23)
      assertThat(customerCreditListByExternalIdResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditListByExternalIdResponse.status()).isEqualTo(CustomerCreditListByExternalIdResponse.Status.ACTIVE)
    }
}
