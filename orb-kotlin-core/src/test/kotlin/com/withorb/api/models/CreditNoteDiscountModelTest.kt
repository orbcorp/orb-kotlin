// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditNoteDiscountModelTest {

    @Test
    fun createCreditNoteDiscountModel() {
        val creditNoteDiscountModel =
            CreditNoteDiscountModel.builder()
                .amountApplied("amount_applied")
                .discountType(CreditNoteDiscountModel.DiscountType.PERCENTAGE)
                .percentageDiscount(0.0)
                .addAppliesToPrice(
                    CreditNoteDiscountModel.AppliesToPrice.builder().id("id").name("name").build()
                )
                .reason("reason")
                .build()
        assertThat(creditNoteDiscountModel).isNotNull
        assertThat(creditNoteDiscountModel.amountApplied()).isEqualTo("amount_applied")
        assertThat(creditNoteDiscountModel.discountType())
            .isEqualTo(CreditNoteDiscountModel.DiscountType.PERCENTAGE)
        assertThat(creditNoteDiscountModel.percentageDiscount()).isEqualTo(0.0)
        assertThat(creditNoteDiscountModel.appliesToPrices())
            .containsExactly(
                CreditNoteDiscountModel.AppliesToPrice.builder().id("id").name("name").build()
            )
        assertThat(creditNoteDiscountModel.reason()).isEqualTo("reason")
    }
}
