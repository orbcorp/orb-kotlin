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
import com.withorb.api.models.AlertUpdateParams
import com.withorb.api.models.AlertUpdateParams.AlertUpdateBody

class AlertUpdateParamsTest {

    @Test
    fun createAlertUpdateParams() {
      AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .thresholds(listOf(AlertUpdateParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
    }

    @Test
    fun getBody() {
      val params = AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .thresholds(listOf(AlertUpdateParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.thresholds()).isEqualTo(listOf(AlertUpdateParams.Threshold.builder()
          .value(42.23)
          .build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .thresholds(listOf(AlertUpdateParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.thresholds()).isEqualTo(listOf(AlertUpdateParams.Threshold.builder()
          .value(42.23)
          .build()))
    }

    @Test
    fun getPathParam() {
      val params = AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .thresholds(listOf(AlertUpdateParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
      assertThat(params).isNotNull
      // path param "alertConfigurationId"
      assertThat(params.getPathParam(0)).isEqualTo("alert_configuration_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
