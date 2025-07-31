// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.jsonMapper
import com.withorb.api.models.AccountingProviderConfig
import com.withorb.api.models.BillingCycleRelativeDate
import com.withorb.api.models.Discount
import com.withorb.api.models.PercentageDiscount
import com.withorb.api.models.TransformPriceFilter
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/orb-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = OrbOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.topLevel()).isNotNull()
        assertThat(client.beta()).isNotNull()
        assertThat(client.coupons()).isNotNull()
        assertThat(client.creditNotes()).isNotNull()
        assertThat(client.customers()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.invoiceLineItems()).isNotNull()
        assertThat(client.invoices()).isNotNull()
        assertThat(client.items()).isNotNull()
        assertThat(client.metrics()).isNotNull()
        assertThat(client.plans()).isNotNull()
        assertThat(client.prices()).isNotNull()
        assertThat(client.subscriptions()).isNotNull()
        assertThat(client.alerts()).isNotNull()
        assertThat(client.dimensionalPriceGroups()).isNotNull()
        assertThat(client.subscriptionChanges()).isNotNull()
    }

    @Test
    fun accountingProviderConfigRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountingProviderConfig =
            AccountingProviderConfig.builder()
                .externalProviderId("external_provider_id")
                .providerType("provider_type")
                .build()

        val roundtrippedAccountingProviderConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountingProviderConfig),
                jacksonTypeRef<AccountingProviderConfig>(),
            )

        assertThat(roundtrippedAccountingProviderConfig).isEqualTo(accountingProviderConfig)
    }

    @Test
    fun discountRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofPercentage(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(0.15)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .addFilter(
                        TransformPriceFilter.builder()
                            .field(TransformPriceFilter.Field.PRICE_ID)
                            .operator(TransformPriceFilter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun billingCycleRelativeDateRoundtrip() {
        val jsonMapper = jsonMapper()
        val billingCycleRelativeDate = BillingCycleRelativeDate.START_OF_TERM

        val roundtrippedBillingCycleRelativeDate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingCycleRelativeDate),
                jacksonTypeRef<BillingCycleRelativeDate>(),
            )

        assertThat(roundtrippedBillingCycleRelativeDate).isEqualTo(billingCycleRelativeDate)
    }
}
