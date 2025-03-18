// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerListByExternalIdResponseTest {

    @Test
    fun ofIncrementLedgerEntry() {
        val incrementLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.EntryType
                        .INCREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofIncrementLedgerEntry(
                incrementLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry())
            .isEqualTo(incrementLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofDecrementLedgerEntry() {
        val decrementLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.EntryType
                        .DECREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofDecrementLedgerEntry(
                decrementLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry())
            .isEqualTo(decrementLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofExpirationChangeLedgerEntry() {
        val expirationChangeLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .EntryType
                        .EXPIRATION_CHANGE
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofExpirationChangeLedgerEntry(
                expirationChangeLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEqualTo(expirationChangeLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntry() {
        val creditBlockExpiryLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .EntryType
                        .CREDIT_BLOCK_EXPIRY
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofCreditBlockExpiryLedgerEntry(
                creditBlockExpiryLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEqualTo(creditBlockExpiryLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofVoidLedgerEntry() {
        val voidLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryType.VOID
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidLedgerEntry(voidLedgerEntry)

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry())
            .isEqualTo(voidLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofVoidInitiatedLedgerEntry() {
        val voidInitiatedLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.EntryType
                        .VOID_INITIATED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidInitiatedLedgerEntry(
                voidInitiatedLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry())
            .isEqualTo(voidInitiatedLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofAmendmentLedgerEntry() {
        val amendmentLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.EntryType
                        .AMENDMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofAmendmentLedgerEntry(
                amendmentLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry())
            .isEqualTo(amendmentLedgerEntry)
    }
}
