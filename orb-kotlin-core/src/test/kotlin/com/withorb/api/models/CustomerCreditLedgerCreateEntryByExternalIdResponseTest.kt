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

internal class CustomerCreditLedgerCreateEntryByExternalIdResponseTest {

    @Test
    fun ofIncrementLedgerEntry() {
        val incrementLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofIncrementLedgerEntry(
                incrementLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isEqualTo(incrementLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofIncrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofIncrementLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.IncrementLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofDecrementLedgerEntry() {
        val decrementLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofDecrementLedgerEntry(
                decrementLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isEqualTo(decrementLedgerEntry)
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofDecrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofDecrementLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.DecrementLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .eventId("event_id")
                    .invoiceId("invoice_id")
                    .priceId("price_id")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofExpirationChangeLedgerEntry() {
        val expirationChangeLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                .builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofExpirationChangeLedgerEntry(
                expirationChangeLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isEqualTo(expirationChangeLedgerEntry)
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofExpirationChangeLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofExpirationChangeLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChangeLedgerEntry
                    .builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .ExpirationChangeLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .ExpirationChangeLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .ExpirationChangeLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .ExpirationChangeLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntry() {
        val creditBlockExpiryLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                .builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofCreditBlockExpiryLedgerEntry(
                creditBlockExpiryLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isEqualTo(creditBlockExpiryLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofCreditBlockExpiryLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiryLedgerEntry
                    .builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .CreditBlockExpiryLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .CreditBlockExpiryLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .CreditBlockExpiryLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse
                            .CreditBlockExpiryLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofVoidLedgerEntry() {
        val voidLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidLedgerEntry(voidLedgerEntry)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry())
            .isEqualTo(voidLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofVoidLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofVoidInitiatedLedgerEntry() {
        val voidInitiatedLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidInitiatedLedgerEntry(
                voidInitiatedLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isEqualTo(voidInitiatedLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isNull()
    }

    @Test
    fun ofVoidInitiatedLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidInitiatedLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                    .builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiatedLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
    }

    @Test
    fun ofAmendmentLedgerEntry() {
        val amendmentLedgerEntry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofAmendmentLedgerEntry(
                amendmentLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.incrementLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrementLedgerEntry())
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.expirationChangeLedgerEntry()
            )
            .isNull()
        assertThat(
                customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiryLedgerEntry()
            )
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidLedgerEntry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiatedLedgerEntry())
            .isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendmentLedgerEntry())
            .isEqualTo(amendmentLedgerEntry)
    }

    @Test
    fun ofAmendmentLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofAmendmentLedgerEntry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.AmendmentLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryByExternalIdResponse)
            .isEqualTo(customerCreditLedgerCreateEntryByExternalIdResponse)
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
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<CustomerCreditLedgerCreateEntryByExternalIdResponse>(),
                )

        val e =
            assertThrows<OrbInvalidDataException> {
                customerCreditLedgerCreateEntryByExternalIdResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
