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
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionCreateParams.SubscriptionCreateBody

class SubscriptionCreateParamsTest {

    @Test
    fun createSubscriptionCreateParams() {
      SubscriptionCreateParams.builder()
          .alignBillingWithSubscriptionStartDate(true)
          .autoCollection(true)
          .awsRegion("aws_region")
          .billingCycleAnchorConfiguration(SubscriptionCreateParams.BillingCycleAnchorConfiguration.builder()
              .day(31L)
              .month(12L)
              .year(123L)
              .build())
          .couponRedemptionCode("coupon_redemption_code")
          .creditsOverageRate(42.23)
          .customerId("customer_id")
          .defaultInvoiceMemo("default_invoice_memo")
          .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .externalCustomerId("external_customer_id")
          .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
          .externalMarketplaceReportingId("external_marketplace_reporting_id")
          .externalPlanId("ZMwNQefe7J3ecf7W")
          .initialPhaseOrder(123L)
          .invoicingThreshold("10.00")
          .metadata(SubscriptionCreateParams.Metadata.builder().build())
          .netTerms(123L)
          .perCreditOverageAmount(42.23)
          .planId("ZMwNQefe7J3ecf7W")
          .priceOverrides(listOf(SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
              .id("id")
              .modelType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.ModelType.UNIT)
              .unitConfig(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .conversionRate(42.23)
              .currency("currency")
              .discount(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.builder()
                  .discountType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.DiscountType.PERCENTAGE)
                  .amountDiscount("amount_discount")
                  .appliesToPriceIds(listOf("string"))
                  .percentageDiscount(42.23)
                  .trialAmountDiscount("trial_amount_discount")
                  .usageDiscount(42.23)
                  .build())
              .fixedPriceQuantity(42.23)
              .maximumAmount("1.23")
              .minimumAmount("1.23")
              .build())))
          .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getBody() {
      val params = SubscriptionCreateParams.builder()
          .alignBillingWithSubscriptionStartDate(true)
          .autoCollection(true)
          .awsRegion("aws_region")
          .billingCycleAnchorConfiguration(SubscriptionCreateParams.BillingCycleAnchorConfiguration.builder()
              .day(31L)
              .month(12L)
              .year(123L)
              .build())
          .couponRedemptionCode("coupon_redemption_code")
          .creditsOverageRate(42.23)
          .customerId("customer_id")
          .defaultInvoiceMemo("default_invoice_memo")
          .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .externalCustomerId("external_customer_id")
          .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
          .externalMarketplaceReportingId("external_marketplace_reporting_id")
          .externalPlanId("ZMwNQefe7J3ecf7W")
          .initialPhaseOrder(123L)
          .invoicingThreshold("10.00")
          .metadata(SubscriptionCreateParams.Metadata.builder().build())
          .netTerms(123L)
          .perCreditOverageAmount(42.23)
          .planId("ZMwNQefe7J3ecf7W")
          .priceOverrides(listOf(SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
              .id("id")
              .modelType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.ModelType.UNIT)
              .unitConfig(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .conversionRate(42.23)
              .currency("currency")
              .discount(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.builder()
                  .discountType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.DiscountType.PERCENTAGE)
                  .amountDiscount("amount_discount")
                  .appliesToPriceIds(listOf("string"))
                  .percentageDiscount(42.23)
                  .trialAmountDiscount("trial_amount_discount")
                  .usageDiscount(42.23)
                  .build())
              .fixedPriceQuantity(42.23)
              .maximumAmount("1.23")
              .minimumAmount("1.23")
              .build())))
          .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.alignBillingWithSubscriptionStartDate()).isEqualTo(true)
      assertThat(body.autoCollection()).isEqualTo(true)
      assertThat(body.awsRegion()).isEqualTo("aws_region")
      assertThat(body.billingCycleAnchorConfiguration()).isEqualTo(SubscriptionCreateParams.BillingCycleAnchorConfiguration.builder()
          .day(31L)
          .month(12L)
          .year(123L)
          .build())
      assertThat(body.couponRedemptionCode()).isEqualTo("coupon_redemption_code")
      assertThat(body.creditsOverageRate()).isEqualTo(42.23)
      assertThat(body.customerId()).isEqualTo("customer_id")
      assertThat(body.defaultInvoiceMemo()).isEqualTo("default_invoice_memo")
      assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
      assertThat(body.externalMarketplace()).isEqualTo(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
      assertThat(body.externalMarketplaceReportingId()).isEqualTo("external_marketplace_reporting_id")
      assertThat(body.externalPlanId()).isEqualTo("ZMwNQefe7J3ecf7W")
      assertThat(body.initialPhaseOrder()).isEqualTo(123L)
      assertThat(body.invoicingThreshold()).isEqualTo("10.00")
      assertThat(body.metadata()).isEqualTo(SubscriptionCreateParams.Metadata.builder().build())
      assertThat(body.netTerms()).isEqualTo(123L)
      assertThat(body.perCreditOverageAmount()).isEqualTo(42.23)
      assertThat(body.planId()).isEqualTo("ZMwNQefe7J3ecf7W")
      assertThat(body.priceOverrides()).isEqualTo(listOf(SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
          .id("id")
          .modelType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.ModelType.UNIT)
          .unitConfig(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.UnitConfig.builder()
              .unitAmount("unit_amount")
              .build())
          .conversionRate(42.23)
          .currency("currency")
          .discount(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.builder()
              .discountType(SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount.DiscountType.PERCENTAGE)
              .amountDiscount("amount_discount")
              .appliesToPriceIds(listOf("string"))
              .percentageDiscount(42.23)
              .trialAmountDiscount("trial_amount_discount")
              .usageDiscount(42.23)
              .build())
          .fixedPriceQuantity(42.23)
          .maximumAmount("1.23")
          .minimumAmount("1.23")
          .build())))
      assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SubscriptionCreateParams.builder().build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }
}
