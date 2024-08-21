// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams.PlanExternalPlanIdUpdateBody

class PlanExternalPlanIdUpdateParamsTest {

    @Test
    fun createPlanExternalPlanIdUpdateParams() {
      PlanExternalPlanIdUpdateParams.builder()
          .otherExternalPlanId("external_plan_id")
          .externalPlanId("external_plan_id")
          .metadata(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
          .build()
    }

    @Test
    fun getBody() {
      val params = PlanExternalPlanIdUpdateParams.builder()
          .otherExternalPlanId("external_plan_id")
          .externalPlanId("external_plan_id")
          .metadata(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
      assertThat(body.metadata()).isEqualTo(PlanExternalPlanIdUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PlanExternalPlanIdUpdateParams.builder()
          .otherExternalPlanId("external_plan_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = PlanExternalPlanIdUpdateParams.builder()
          .otherExternalPlanId("external_plan_id")
          .build()
      assertThat(params).isNotNull
      // path param "otherExternalPlanId"
      assertThat(params.getPathParam(0)).isEqualTo("external_plan_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
