// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceLineItemServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceLineItemService = client.invoiceLineItems()
        val invoiceLineItemCreateResponse =
            invoiceLineItemService.create(
                InvoiceLineItemCreateParams.builder()
                    .amount("12.00")
                    .endDate(LocalDate.parse("2023-09-22"))
                    .invoiceId("4khy3nwzktxv7")
                    .name("Item Name")
                    .quantity(42.23)
                    .startDate(LocalDate.parse("2023-09-22"))
                    .build()
            )
        println(invoiceLineItemCreateResponse)
        invoiceLineItemCreateResponse.validate()
    }
}
