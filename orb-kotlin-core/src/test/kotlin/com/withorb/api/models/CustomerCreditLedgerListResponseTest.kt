// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerCreditLedgerListResponseTest {

    @Test
    fun ofIncrementLedgerEntry() {
        val incrementLedgerEntry =
            CustomerCreditLedgerListResponse.IncrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.IncrementLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.IncrementLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.IncrementLedgerEntry.EntryStatus.COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.IncrementLedgerEntry.EntryType.INCREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.IncrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofIncrementLedgerEntry(incrementLedgerEntry)

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry())
            .isEqualTo(incrementLedgerEntry)
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofIncrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofIncrementLedgerEntry(
                CustomerCreditLedgerListResponse.IncrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.IncrementLedgerEntry.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.IncrementLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.IncrementLedgerEntry.EntryStatus.COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.IncrementLedgerEntry.EntryType.INCREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.IncrementLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofDecrementLedgerEntry() {
        val decrementLedgerEntry =
            CustomerCreditLedgerListResponse.DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.DecrementLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.DecrementLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.DecrementLedgerEntry.EntryStatus.COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.DecrementLedgerEntry.EntryType.DECREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.DecrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofDecrementLedgerEntry(decrementLedgerEntry)

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry())
            .isEqualTo(decrementLedgerEntry)
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofDecrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofDecrementLedgerEntry(
                CustomerCreditLedgerListResponse.DecrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.DecrementLedgerEntry.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.DecrementLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.DecrementLedgerEntry.EntryStatus.COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.DecrementLedgerEntry.EntryType.DECREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.DecrementLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .eventId("event_id")
                    .invoiceId("invoice_id")
                    .priceId("price_id")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofExpirationChangeLedgerEntry() {
        val expirationChangeLedgerEntry =
            CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.EntryType
                        .EXPIRATION_CHANGE
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofExpirationChangeLedgerEntry(
                expirationChangeLedgerEntry
            )

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry())
            .isEqualTo(expirationChangeLedgerEntry)
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofExpirationChangeLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofExpirationChangeLedgerEntry(
                CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.EntryType
                            .EXPIRATION_CHANGE
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.ExpirationChangeLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntry() {
        val creditBlockExpiryLedgerEntry =
            CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.EntryType
                        .CREDIT_BLOCK_EXPIRY
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofCreditBlockExpiryLedgerEntry(
                creditBlockExpiryLedgerEntry
            )

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry())
            .isEqualTo(creditBlockExpiryLedgerEntry)
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofCreditBlockExpiryLedgerEntry(
                CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.EntryType
                            .CREDIT_BLOCK_EXPIRY
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.CreditBlockExpiryLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofVoidLedgerEntry() {
        val voidLedgerEntry =
            CustomerCreditLedgerListResponse.VoidLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.VoidLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.VoidLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.VoidLedgerEntry.EntryStatus.COMMITTED)
                .entryType(CustomerCreditLedgerListResponse.VoidLedgerEntry.EntryType.VOID)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidLedgerEntry(voidLedgerEntry)

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isEqualTo(voidLedgerEntry)
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofVoidLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidLedgerEntry(
                CustomerCreditLedgerListResponse.VoidLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.VoidLedgerEntry.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.VoidLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.VoidLedgerEntry.EntryStatus.COMMITTED
                    )
                    .entryType(CustomerCreditLedgerListResponse.VoidLedgerEntry.EntryType.VOID)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.VoidLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofVoidInitiatedLedgerEntry() {
        val voidInitiatedLedgerEntry =
            CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.EntryStatus.COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.EntryType
                        .VOID_INITIATED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry)

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry())
            .isEqualTo(voidInitiatedLedgerEntry)
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry()).isNull()
    }

    @Test
    fun ofVoidInitiatedLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidInitiatedLedgerEntry(
                CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.EntryType
                            .VOID_INITIATED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.VoidInitiatedLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    @Test
    fun ofAmendmentLedgerEntry() {
        val amendmentLedgerEntry =
            CustomerCreditLedgerListResponse.AmendmentLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.AmendmentLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.AmendmentLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.AmendmentLedgerEntry.EntryStatus.COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListResponse.AmendmentLedgerEntry.EntryType.AMENDMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.AmendmentLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofAmendmentLedgerEntry(amendmentLedgerEntry)

        assertThat(customerCreditLedgerListResponse.incrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.decrementLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChangeLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiryLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiatedLedgerEntry()).isNull()
        assertThat(customerCreditLedgerListResponse.amendmentLedgerEntry())
            .isEqualTo(amendmentLedgerEntry)
    }

    @Test
    fun ofAmendmentLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofAmendmentLedgerEntry(
                CustomerCreditLedgerListResponse.AmendmentLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.AmendmentLedgerEntry.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.AmendmentLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.AmendmentLedgerEntry.EntryStatus.COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListResponse.AmendmentLedgerEntry.EntryType.AMENDMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.AmendmentLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListResponse),
                jacksonTypeRef<CustomerCreditLedgerListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListResponse)
            .isEqualTo(customerCreditLedgerListResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerCreditLedgerListResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<CustomerCreditLedgerListResponse>())

        val e =
            assertThrows<OrbInvalidDataException> { customerCreditLedgerListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
