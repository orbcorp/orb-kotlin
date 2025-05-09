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
    fun ofIncrement() {
        val increment =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofIncrement(increment)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment())
            .isEqualTo(increment)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofIncrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofIncrement(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Increment.Metadata
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
    fun ofDecrement() {
        val decrement =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofDecrement(decrement)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement())
            .isEqualTo(decrement)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofDecrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofDecrement(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Decrement.Metadata
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
    fun ofExpirationChange() {
        val expirationChange =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofExpirationChange(expirationChange)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange())
            .isEqualTo(expirationChange)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofExpirationChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofExpirationChange(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.ExpirationChange
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
    fun ofCreditBlockExpiry() {
        val creditBlockExpiry =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
                        .EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofCreditBlockExpiry(
                creditBlockExpiry
            )

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry())
            .isEqualTo(creditBlockExpiry)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofCreditBlockExpiry(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.CreditBlockExpiry
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
    fun ofVoid() {
        val void =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoid(void)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isEqualTo(void)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoid(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Void.Metadata.builder()
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
    fun ofVoidInitiated() {
        val voidInitiated =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.Metadata
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
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidInitiated(voidInitiated)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated())
            .isEqualTo(voidInitiated)
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidInitiatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofVoidInitiated(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated
                            .EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.VoidInitiated.Metadata
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
    fun ofAmendment() {
        val amendment =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofAmendment(amendment)

        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryByExternalIdResponse.amendment())
            .isEqualTo(amendment)
    }

    @Test
    fun ofAmendmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryByExternalIdResponse =
            CustomerCreditLedgerCreateEntryByExternalIdResponse.ofAmendment(
                CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryByExternalIdResponse.Amendment.Metadata
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
