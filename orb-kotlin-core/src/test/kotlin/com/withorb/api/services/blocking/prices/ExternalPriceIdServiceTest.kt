// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.prices

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
import com.withorb.api.services.blocking.prices.ExternalPriceIdService
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class ExternalPriceIdServiceTest {

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalPriceIdService = client.prices().externalPriceId()
      val price = externalPriceIdService.update(PriceExternalPriceIdUpdateParams.builder()
          .externalPriceId("external_price_id")
          .metadata(PriceExternalPriceIdUpdateParams.Metadata.builder().build())
          .build())
      println(price)
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalPriceIdService = client.prices().externalPriceId()
      val price = externalPriceIdService.fetch(PriceExternalPriceIdFetchParams.builder()
          .externalPriceId("external_price_id")
          .build())
      println(price)
    }
}
