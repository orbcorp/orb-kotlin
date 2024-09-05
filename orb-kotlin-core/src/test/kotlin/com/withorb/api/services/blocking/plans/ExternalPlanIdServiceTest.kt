// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.plans.ExternalPlanIdService
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class ExternalPlanIdServiceTest {

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalPlanIdService = client.plans().externalPlanId()
      val plan = externalPlanIdService.update(PlanExternalPlanIdUpdateParams.builder()
          .otherExternalPlanId("external_plan_id")
          .externalPlanId("external_plan_id")
          .metadata(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
          .build())
      println(plan)
      plan.validate()
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalPlanIdService = client.plans().externalPlanId()
      val plan = externalPlanIdService.fetch(PlanExternalPlanIdFetchParams.builder()
          .externalPlanId("external_plan_id")
          .build())
      println(plan)
      plan.validate()
    }
}
